package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
class twm implements zxe {
    final /* synthetic */ twq a;

    public twm(twq twqVar) {
        this.a = twqVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        ((zdv) ((zdv) ((zdv) twq.a.d()).p(th)).q("com/google/android/libraries/speech/transcription/recognition/audio/impl/AudioLibraryAudioController$1", "onFailure", (char) 289, "AudioLibraryAudioController.java")).u("Could not get Audio Recording URI");
        if (th instanceof slk) {
            return;
        }
        this.a.d.m(Uri.EMPTY);
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a.d.m((Uri) obj);
    }
}
