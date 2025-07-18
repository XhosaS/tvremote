package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ttv implements zxe {
    final /* synthetic */ ttz a;

    public ttv(ttz ttzVar) {
        this.a = ttzVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        ((zdv) ((zdv) ((zdv) ttz.a.d()).p(th)).q("com/google/android/libraries/speech/transcription/recognition/NetworkSpeechRecognizer$1", "onFailure", (char) 184, "NetworkSpeechRecognizer.java")).u("Failed uploading data to S3");
        ttz ttzVar = this.a;
        ttzVar.f.getClass();
        if (ttz.b(th, trr.class) != null) {
            ttzVar.f.f(th);
        } else if (ttz.b(th, slm.class) != null) {
            ttzVar.f.f(new trj());
        } else {
            ttzVar.f.f(new trk());
        }
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
    }
}
