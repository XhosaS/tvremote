package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class txi implements zxe {
    final /* synthetic */ String a;
    final /* synthetic */ txj b;

    public txi(txj txjVar, String str) {
        this.a = str;
        this.b = txjVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        ((zdv) ((zdv) ((zdv) txj.a.d()).p(th)).q("com/google/android/libraries/speech/transcription/recognition/dataservice/TranscriptionDataService$3", "onFailure", 451, "TranscriptionDataService.java")).F("Future [%s] FAILED for request-id %s", this.a, this.b.f);
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((zdv) ((zdv) txj.a.b()).q("com/google/android/libraries/speech/transcription/recognition/dataservice/TranscriptionDataService$3", "onSuccess", 446, "TranscriptionDataService.java")).F("Future [%s] SUCCESS for request-id %s", this.a, this.b.f);
    }
}
