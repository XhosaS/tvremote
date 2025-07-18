package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class twp implements zxe {
    @Override // defpackage.zxe
    public final void a(Throwable th) {
        ((zdv) ((zdv) ((zdv) twq.a.c()).p(th)).q("com/google/android/libraries/speech/transcription/recognition/audio/impl/AudioLibraryAudioController$4", "onFailure", (char) 404, "AudioLibraryAudioController.java")).u("Can't acquire audio focus!");
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        zdv zdvVar = (zdv) ((zdv) twq.a.b()).q("com/google/android/libraries/speech/transcription/recognition/audio/impl/AudioLibraryAudioController$4", "onSuccess", 398, "AudioLibraryAudioController.java");
        int iB = rtu.b(((rts) obj).c);
        if (iB == 0) {
            iB = 1;
        }
        zdvVar.x("Audio focus acquiring status: %s", rtu.a(iB));
    }
}
