package defpackage;

import android.media.session.MediaController;
import android.media.session.PlaybackState;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gog extends MediaController.Callback {
    final /* synthetic */ goh a;
    final /* synthetic */ MediaController b;

    public gog(goh gohVar, MediaController mediaController) {
        this.a = gohVar;
        this.b = mediaController;
    }

    @Override // android.media.session.MediaController.Callback
    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        if (playbackState == null || playbackState.getState() != 3) {
            return;
        }
        this.a.a = false;
        this.b.unregisterCallback(this);
    }
}
