package defpackage;

import android.media.AudioTrack;

/* compiled from: PG */
/* loaded from: classes2.dex */
class tqx implements AudioTrack.OnPlaybackPositionUpdateListener {
    final /* synthetic */ AudioTrack a;
    final /* synthetic */ tqy b;

    public tqx(tqy tqyVar, AudioTrack audioTrack) {
        this.a = audioTrack;
        this.b = tqyVar;
    }

    @Override // android.media.AudioTrack.OnPlaybackPositionUpdateListener
    public final void onMarkerReached(AudioTrack audioTrack) {
        ((zdv) ((zdv) tqy.a.b()).q("com/google/android/libraries/speech/transcription/beeps/AudioPlayer$1", "onMarkerReached", 107, "AudioPlayer.java")).u("Audio track end of file reached");
        this.a.release();
        tqy tqyVar = this.b;
        tqyVar.d.set(false);
        tqyVar.b();
    }

    @Override // android.media.AudioTrack.OnPlaybackPositionUpdateListener
    public final void onPeriodicNotification(AudioTrack audioTrack) {
    }
}
