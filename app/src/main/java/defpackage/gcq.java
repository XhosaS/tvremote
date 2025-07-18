package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class gcq implements zxe {
    final /* synthetic */ gcv a;

    public gcq(gcv gcvVar) {
        this.a = gcvVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        ((zdv) ((zdv) ((zdv) gcv.a.d()).p(th)).q("com/google/android/apps/tvsearch/led/controller/LegacyLedController$1", "onFailure", (char) 155, "LegacyLedController.java")).u("Failed to load hotword toggle state. Default to mute.");
        this.a.d();
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (((foc) obj) == foc.TOGGLE_ON) {
            this.a.e();
        } else {
            this.a.d();
        }
    }
}
