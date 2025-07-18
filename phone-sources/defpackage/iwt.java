package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iwt implements duv {
    final /* synthetic */ iwu a;

    public iwt(iwu iwuVar) {
        this.a = iwuVar;
    }

    @Override // defpackage.duv
    public final void j() {
        ((tug) iwu.a.e().h(tvo.a, "VIRTUAL_REMOTE").j("com/google/android/apps/googletv/app/device/virtualremote/impl/VirtualRemoteImpl$lifecycleObserver$1", "onPause", 100, "VirtualRemoteImpl.kt")).s("App was placed into the background.");
        iwu iwuVar = this.a;
        if (iwuVar.n.compareAndSet(true, false)) {
            iwuVar.m();
        }
    }

    @Override // defpackage.duv
    public final void k() {
        ((tug) iwu.a.e().h(tvo.a, "VIRTUAL_REMOTE").j("com/google/android/apps/googletv/app/device/virtualremote/impl/VirtualRemoteImpl$lifecycleObserver$1", "onResume", 95, "VirtualRemoteImpl.kt")).s("App was brought to the foreground.");
        iwu iwuVar = this.a;
        if (iwuVar.n.compareAndSet(false, true)) {
            iwuVar.m();
        }
    }

    @Override // defpackage.duv
    public final /* synthetic */ void l() {
    }

    @Override // defpackage.duv
    public final /* synthetic */ void e(dvk dvkVar) {
    }

    @Override // defpackage.duv
    public final /* synthetic */ void f(dvk dvkVar) {
    }
}
