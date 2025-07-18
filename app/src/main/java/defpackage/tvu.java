package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class tvu implements zxe {
    final /* synthetic */ tvy a;

    public tvu(tvy tvyVar) {
        this.a = tvyVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        zdy zdyVar = tvy.a;
        ((zdv) ((zdv) ((zdv) zdyVar.d()).p(th)).q("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "handleDetectionError", (char) 415, "SodaSpeechRecognizer.java")).u("startDetection failed");
        Throwable cause = th;
        while (true) {
            if (cause == null) {
                cause = null;
                break;
            } else if (trr.class.isInstance(cause)) {
                break;
            } else {
                cause = cause.getCause();
            }
        }
        tvy tvyVar = this.a;
        if (cause instanceof trr) {
            ((zdv) ((zdv) ((zdv) zdyVar.d()).p(th)).q("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "handleDetectionError", (char) 419, "SodaSpeechRecognizer.java")).u("Transcription error");
            tvyVar.m.c((trr) cause);
        } else {
            ((zdv) ((zdv) ((zdv) zdyVar.d()).p(th)).q("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "handleDetectionError", (char) 422, "SodaSpeechRecognizer.java")).u("Recognizer generic error");
            tvyVar.m.c(new trp(1));
        }
    }

    @Override // defpackage.zxe
    public final void b(Object obj) {
        ((zdv) ((zdv) tvy.a.b()).q("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer$1", "onSuccess", 381, "SodaSpeechRecognizer.java")).u("Audio process finished, transcription completed.");
    }
}
