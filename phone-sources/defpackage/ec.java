package defpackage;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ec extends MediaController.Callback {
    private final WeakReference a;

    public ec(ee eeVar) {
        this.a = new WeakReference(eeVar);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
        ee eeVar = (ee) this.a.get();
        if (eeVar != null) {
            playbackInfo.getPlaybackType();
            playbackInfo.getAudioAttributes();
            int i = AudioAttributesCompat.b;
            playbackInfo.getVolumeControl();
            playbackInfo.getMaxVolume();
            playbackInfo.getCurrentVolume();
            eeVar.onAudioInfoChanged(new eh());
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onExtrasChanged(Bundle bundle) {
        eu.c(bundle);
        ee eeVar = (ee) this.a.get();
        if (eeVar != null) {
            eeVar.onExtrasChanged(bundle);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onMetadataChanged(MediaMetadata mediaMetadata) {
        ee eeVar = (ee) this.a.get();
        if (eeVar != null) {
            eeVar.onMetadataChanged(du.c(mediaMetadata));
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        ee eeVar = (ee) this.a.get();
        if (eeVar == null || eeVar.c != null) {
            return;
        }
        eeVar.onPlaybackStateChanged(ey.a(playbackState));
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueChanged(List list) {
        er erVar;
        ee eeVar = (ee) this.a.get();
        if (eeVar != null) {
            ArrayList arrayList = null;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList(list.size());
                for (Object obj : list) {
                    if (obj != null) {
                        MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
                        erVar = new er(dt.a(queueItem.getDescription()), queueItem.getQueueId());
                    } else {
                        erVar = null;
                    }
                    arrayList2.add(erVar);
                }
                arrayList = arrayList2;
            }
            eeVar.onQueueChanged(arrayList);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueTitleChanged(CharSequence charSequence) {
        ee eeVar = (ee) this.a.get();
        if (eeVar != null) {
            eeVar.onQueueTitleChanged(charSequence);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionDestroyed() {
        ee eeVar = (ee) this.a.get();
        if (eeVar != null) {
            eeVar.onSessionDestroyed();
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionEvent(String str, Bundle bundle) {
        eu.c(bundle);
        ee eeVar = (ee) this.a.get();
        if (eeVar != null) {
            eeVar.onSessionEvent(str, bundle);
        }
    }
}
