package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class spg implements zxe {
    final /* synthetic */ String a;
    final /* synthetic */ sph b;

    public spg(sph sphVar, String str) {
        this.a = str;
        this.b = sphVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        ((zdv) ((zdv) ((zdv) spi.a.d().o(zfi.a, "ALT.AudioOpChecker")).p(th)).q("com/google/android/libraries/search/audio/microphone/accountability/RecordAudioOpChecker$1$1", "onFailure", (char) 149, "RecordAudioOpChecker.java")).u("#audio# Failed getting StopListeningStatus future");
        this.b.d.a(this.a);
    }

    @Override // defpackage.zxe
    public final /* synthetic */ void b(Object obj) {
        zer zerVar = zfi.a;
        this.b.d.a(this.a);
    }
}
