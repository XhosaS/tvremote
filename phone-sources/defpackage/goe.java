package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.view.View;
import android.view.ViewGroup;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class goe {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;

    public goe(ViewGroup viewGroup, ttm ttmVar, ttm ttmVar2, ttm ttmVar3) {
        this.d = viewGroup;
        this.b = ttmVar;
        this.a = ttmVar2;
        this.c = ttmVar3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.window.sidecar.SidecarInterface, java.lang.Object] */
    public final gns a(Activity activity) {
        SidecarDeviceState sidecarDeviceState;
        IBinder iBinderN = gli.N(activity);
        if (iBinderN == null) {
            return new gns(yhb.a);
        }
        ?? r0 = this.a;
        SidecarWindowLayoutInfo windowLayoutInfo = r0 != 0 ? r0.getWindowLayoutInfo(iBinderN) : null;
        if (r0 == 0 || (sidecarDeviceState = r0.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return goa.a(windowLayoutInfo, sidecarDeviceState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.window.sidecar.SidecarInterface, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.Map] */
    public final void b(IBinder iBinder, final Activity activity) {
        ?? r0 = this.c;
        r0.put(iBinder, activity);
        ?? r1 = this.a;
        if (r1 != 0) {
            r1.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (r0.size() == 1 && r1 != 0) {
            r1.onDeviceStateListenersChanged(false);
        }
        Object obj = this.e;
        if (obj != null) {
            ((goc) obj).a(activity, a(activity));
        }
        ?? r3 = this.d;
        if (r3.get(activity) == null && (activity instanceof csb)) {
            cuh<Configuration> cuhVar = new cuh() { // from class: gob
                @Override // defpackage.cuh
                public final void accept(Object obj2) {
                    goe goeVar = this.a;
                    Object obj3 = goeVar.e;
                    if (obj3 != null) {
                        Activity activity2 = activity;
                        ((goc) obj3).a(activity2, goeVar.a(activity2));
                    }
                }
            };
            r3.put(activity, cuhVar);
            ((csb) activity).addOnConfigurationChangedListener(cuhVar);
        }
    }

    public final noa c() {
        if (this.e == null) {
            noa noaVar = new noa((nnr) this.b, (String) this.c);
            this.e = noaVar;
            noaVar.c(1);
        }
        return (noa) this.e;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1904
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.goe.d():void");
    }

    public final void e(nov novVar) throws Throwable {
        if (novVar.e == 2) {
            if (this.e != null) {
                d();
            }
            this.e = new noa((nnr) this.b, (String) this.c);
        } else {
            this.e = c();
        }
        Object obj = this.e;
        ocv.aF(obj);
        noa noaVar = (noa) obj;
        novVar.d = noaVar.j;
        noaVar.d.add(novVar);
    }

    public goe(nnr nnrVar, nod nodVar, String str) {
        this.b = nnrVar;
        this.d = nodVar;
        this.c = str;
        this.a = new pku(this);
    }

    public goe(yil yilVar, Context context, amm ammVar, ckq ckqVar) {
        this.c = yilVar;
        this.b = context;
        this.a = ammVar;
        this.d = ckqVar;
    }

    public goe(Context context) {
        SidecarInterface sidecarImpl = SidecarProvider.getSidecarImpl(context.getApplicationContext());
        goa goaVar = new goa();
        this.a = sidecarImpl;
        this.b = goaVar;
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
    }

    public goe(Drawable.Callback callback) {
        this.a = new heg();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = ".ttf";
        if (!(callback instanceof View)) {
            hhk.a("LottieDrawable must be inside of a view for images to work.");
            this.b = null;
        } else {
            this.b = ((View) callback).getContext().getAssets();
        }
    }
}
