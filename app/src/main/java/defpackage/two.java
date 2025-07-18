package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class two implements zxe {
    @Override // defpackage.zxe
    public final void a(Throwable th) {
        ((zdv) ((zdv) ((zdv) twq.a.c()).p(th)).q("com/google/android/libraries/speech/transcription/recognition/audio/impl/AudioLibraryAudioController$3", "onFailure", (char) 352, "AudioLibraryAudioController.java")).u("Can't release audio focus!");
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        zdv zdvVar = (zdv) ((zdv) twq.a.b()).q("com/google/android/libraries/speech/transcription/recognition/audio/impl/AudioLibraryAudioController$3", "onSuccess", 346, "AudioLibraryAudioController.java");
        int iB = rty.b(((ruc) obj).c);
        if (iB == 0) {
            iB = 1;
        }
        zdvVar.x("Audio focus releasing status: %s", rty.a(iB));
    }
}
