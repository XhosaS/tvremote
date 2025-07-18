package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzo implements bzd {
    public static final bzl a = new bzl();
    public final SidecarInterface b;
    public final bzj c;
    public final Map d;
    public final Map e;
    public bzm f;

    public bzo(Context context) {
        SidecarInterface sidecarImpl = SidecarProvider.getSidecarImpl(context.getApplicationContext());
        bzj bzjVar = new bzj(null);
        this.b = sidecarImpl;
        this.c = bzjVar;
        this.d = new LinkedHashMap();
        this.e = new LinkedHashMap();
    }

    public final byq a(Activity activity) {
        SidecarDeviceState sidecarDeviceState;
        IBinder iBinderA = a.a(activity);
        if (iBinderA == null) {
            return new byq(agrd.a);
        }
        SidecarInterface sidecarInterface = this.b;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface != null ? sidecarInterface.getWindowLayoutInfo(iBinderA) : null;
        bzj bzjVar = this.c;
        if (sidecarInterface == null || (sidecarDeviceState = sidecarInterface.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return bzjVar.a(windowLayoutInfo, sidecarDeviceState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(IBinder iBinder, final Activity activity) {
        Map map = this.d;
        map.put(iBinder, activity);
        SidecarInterface sidecarInterface = this.b;
        if (sidecarInterface != null) {
            sidecarInterface.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (map.size() == 1 && sidecarInterface != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        bzm bzmVar = this.f;
        if (bzmVar != null) {
            bzmVar.a(activity, a(activity));
        }
        Map map2 = this.e;
        if (map2.get(activity) == null && (activity instanceof abu)) {
            afe afeVar = new afe() { // from class: bzk
                @Override // defpackage.afe
                public final void accept(Object obj) {
                    bzo bzoVar = this.a;
                    bzm bzmVar2 = bzoVar.f;
                    if (bzmVar2 != null) {
                        Activity activity2 = activity;
                        bzmVar2.a(activity2, bzoVar.a(activity2));
                    }
                }
            };
            map2.put(activity, afeVar);
            ((abu) activity).dg(afeVar);
        }
    }
}
