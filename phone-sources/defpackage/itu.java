package defpackage;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class itu extends fus {
    final /* synthetic */ itv a;

    public itu(itv itvVar) {
        this.a = itvVar;
    }

    @Override // defpackage.fus
    public final void onRouteAdded(fuy fuyVar, fux fuxVar) {
        fuyVar.getClass();
        fuxVar.getClass();
        this.a.s(fuxVar);
    }

    @Override // defpackage.fus
    public final void onRouteChanged(fuy fuyVar, fux fuxVar) {
        fuyVar.getClass();
        fuxVar.getClass();
        this.a.t(fuxVar);
    }

    @Override // defpackage.fus
    public final void onRouteRemoved(fuy fuyVar, fux fuxVar) {
        fuyVar.getClass();
        fuxVar.getClass();
        this.a.u(fuxVar);
    }

    @Override // defpackage.fus
    public final void onRouteSelected(fuy fuyVar, fux fuxVar, int i) {
        fuyVar.getClass();
        fuxVar.getClass();
        itv itvVar = this.a;
        iua iuaVar = itvVar.n;
        fux fuxVar2 = iuaVar != null ? iuaVar.i : null;
        if (yks.e(fuxVar, fuxVar2)) {
            return;
        }
        String str = fuxVar.e;
        str.getClass();
        tui tuiVar = itv.a;
        ((tug) tuiVar.e().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl", "onRouteSelectedInternal$java_com_google_android_apps_googletv_app_device_impl_impl", 800, "MediaDeviceControllerImpl.kt")).z("Route %s has been selected with reason %s", str, i);
        if (i == 0) {
            ((tug) tuiVar.g().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl", "onRouteSelectedInternal$java_com_google_android_apps_googletv_app_device_impl_impl", 803, "MediaDeviceControllerImpl.kt")).v("Ignoring unknown reason for selecting %s.", str);
            return;
        }
        if (i == 1) {
            if (fuxVar2 != null) {
                ((tug) tuiVar.g().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl", "onRouteSelectedInternal$java_com_google_android_apps_googletv_app_device_impl_impl", 808, "MediaDeviceControllerImpl.kt")).s("The current device's cast route was lost.");
                itvVar.u(fuxVar2);
            }
            i = 1;
        }
        if (fuxVar.p() && i != 3) {
            itvVar.C(3);
            return;
        }
        ((tug) tuiVar.g().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl", "onRouteSelectedInternal$java_com_google_android_apps_googletv_app_device_impl_impl", 819, "MediaDeviceControllerImpl.kt")).v("A route selection has taken place outside of the MediaDeviceController. Attempting switch to %s.", str);
        ReentrantReadWriteLock.ReadLock lock = itvVar.p.readLock();
        lock.lock();
        try {
            iua iuaVarC = ipc.c(itvVar.q, fuxVar);
            if (iuaVarC == null) {
                ((tug) itv.a.f().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl", "onRouteSelectedInternal$java_com_google_android_apps_googletv_app_device_impl_impl", 828, "MediaDeviceControllerImpl.kt")).v("Unable to find a discovered device for %s resulting in a failed device switch. The current cast route is out of sync with MediaDeviceController!", str);
            } else {
                itvVar.A(iuaVarC, false);
            }
        } finally {
            lock.unlock();
        }
    }
}
