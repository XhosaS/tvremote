package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class itr implements duv {
    final /* synthetic */ itv a;

    public itr(itv itvVar) {
        this.a = itvVar;
    }

    @Override // defpackage.duv
    public final void e(dvk dvkVar) {
        itv itvVar = this.a;
        iua iuaVar = itvVar.n;
        if (iuaVar == null || yks.e(iuaVar, itvVar.o)) {
            ((tug) itv.a.e().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl$2", "onDestroy", 217, "MediaDeviceControllerImpl.kt")).s("App was destroyed.");
        } else {
            ((tug) itv.a.g().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl$2", "onDestroy", 215, "MediaDeviceControllerImpl.kt")).s("App was destroyed while connected to a remote device.");
        }
    }

    @Override // defpackage.duv
    public final void j() {
        ((tug) itv.a.b().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl$2", "onPause", 209, "MediaDeviceControllerImpl.kt")).s("App was placed into the background.");
        this.a.z();
    }

    @Override // defpackage.duv
    public final void k() {
        ((tug) itv.a.b().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl$2", "onResume", 204, "MediaDeviceControllerImpl.kt")).s("App was brought to the foreground.");
        this.a.p();
    }

    @Override // defpackage.duv
    public final /* synthetic */ void l() {
    }

    @Override // defpackage.duv
    public final /* synthetic */ void f(dvk dvkVar) {
    }
}
