package defpackage;

import android.app.Application;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.media.AudioManager;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class be implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public be(cri criVar, Typeface typeface, int i) {
        this.c = i;
        this.a = criVar;
        this.b = typeface;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39, types: [cuh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v31, types: [android.app.Application$ActivityLifecycleCallbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, tsl] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = 1;
        switch (this.c) {
            case 0:
                dg.y((View) this.a, (Rect) this.b);
                return;
            case 1:
                ((dp) this.a).d((C0038do) this.b);
                return;
            case 2:
                as.b((C0038do) this.a, (bh) this.b);
                return;
            case 3:
                as.b((C0038do) this.a, (bh) this.b);
                return;
            case 4:
                Iterator it = ((bh) this.b).a.iterator();
                while (it.hasNext()) {
                    C0038do c0038do = ((bi) it.next()).a;
                    View view = c0038do.a.getView();
                    if (view != null) {
                        fh.e(c0038do.h, view, (ViewGroup) this.a);
                    }
                }
                return;
            case 5:
                dp dpVar = (dp) this.a;
                List list = dpVar.b;
                Object obj = this.b;
                if (list.contains(obj)) {
                    C0038do c0038do2 = (C0038do) obj;
                    int i2 = c0038do2.h;
                    View view2 = c0038do2.a.mView;
                    view2.getClass();
                    fh.e(i2, view2, dpVar.a);
                    return;
                }
                return;
            case 6:
                dp dpVar2 = (dp) this.a;
                List list2 = dpVar2.b;
                Object obj2 = this.b;
                list2.remove(obj2);
                dpVar2.c.remove(obj2);
                return;
            case 7:
                ((fl) this.b).addObserverForBackInvoker((fx) this.a);
                return;
            case 8:
                ((hy) this.b).a.o().c(this.a);
                return;
            case 9:
                bga.B((blj) this.a, (LongSparseArray) this.b);
                return;
            case 10:
                ((crd) this.b).a = this.a;
                return;
            case 11:
                ((Application) this.b).unregisterActivityLifecycleCallbacks(this.a);
                return;
            case 12:
                try {
                    Method method = cre.d;
                    if (method != null) {
                        method.invoke(this.b, this.a, false, "AppCompat recreation");
                        return;
                    } else {
                        cre.e.invoke(this.b, this.a, false);
                        return;
                    }
                } catch (RuntimeException e) {
                    if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                        throw e;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            case 13:
                ((csm) this.a).m340x46c88379((Typeface) this.b);
                return;
            case 14:
                ((cri) this.a).b((Typeface) this.b);
                return;
            case 15:
                this.b.accept(this.a);
                return;
            case 16:
                Object obj3 = this.b;
                Object obj4 = this.a;
                int i3 = dia.a;
                Throwable th2 = (Throwable) obj3;
                Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in ".concat(String.valueOf(obj4)), th2);
                throw th2;
            case 17:
                dya dyaVar = (dya) this.b;
                if (dyaVar.f()) {
                    dyaVar.c();
                } else {
                    dyaVar.b(this.a);
                }
                dyaVar.f = 3;
                return;
            case 18:
                dvb.a = (AudioManager) ((Context) this.b).getSystemService("audio");
                ((shx) this.a).g();
                return;
            case 19:
                Object obj5 = this.b;
                eck eckVar = (eck) obj5;
                eckVar.d = this.a.apply(eckVar.d);
                eckVar.b.d(new edd(obj5, eckVar.d, i));
                return;
            default:
                eck eckVar2 = (eck) this.b;
                if (eckVar2.e == 0) {
                    eckVar2.a(this.a);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ be(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ be(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public be(Object obj, Object obj2, int i, char[] cArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
