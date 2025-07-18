package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class twn implements zxe {
    final /* synthetic */ twq a;

    public twn(twq twqVar) {
        this.a = twqVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        ((zdv) ((zdv) ((zdv) twq.a.c()).p(th)).q("com/google/android/libraries/speech/transcription/recognition/audio/impl/AudioLibraryAudioController$2", "onFailure", (char) 333, "AudioLibraryAudioController.java")).u("Microphone didn't close!");
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a.d.o();
        zdv zdvVar = (zdv) ((zdv) twq.a.b()).q("com/google/android/libraries/speech/transcription/recognition/audio/impl/AudioLibraryAudioController$2", "onSuccess", 328, "AudioLibraryAudioController.java");
        rxd rxdVar = ((rvm) obj).c;
        if (rxdVar == null) {
            rxdVar = rxd.a;
        }
        zdvVar.x("Mic closing result: %s", rxdVar);
    }
}
