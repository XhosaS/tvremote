package defpackage;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fro extends MediaController.Callback {
    private final WeakReference a;

    public fro(frp frpVar) {
        this.a = new WeakReference(frpVar);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
        if (((frp) this.a.get()) == null || playbackInfo == null) {
            return;
        }
        playbackInfo.getPlaybackType();
        playbackInfo.getAudioAttributes();
        int i = frh.b;
        playbackInfo.getVolumeControl();
        playbackInfo.getMaxVolume();
        playbackInfo.getCurrentVolume();
        throw null;
    }

    @Override // android.media.session.MediaController.Callback
    public final void onExtrasChanged(Bundle bundle) {
        fse.d(bundle);
        if (((frp) this.a.get()) != null) {
            throw null;
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onMetadataChanged(MediaMetadata mediaMetadata) {
        if (((frp) this.a.get()) != null) {
            ir irVar = frt.a;
            if (mediaMetadata != null) {
                Parcel parcelObtain = Parcel.obtain();
                mediaMetadata.writeToParcel(parcelObtain, 0);
                parcelObtain.setDataPosition(0);
                frt frtVarCreateFromParcel = frt.CREATOR.createFromParcel(parcelObtain);
                parcelObtain.recycle();
                frtVarCreateFromParcel.d = mediaMetadata;
            }
            throw null;
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        ArrayList arrayList;
        frp frpVar = (frp) this.a.get();
        if (frpVar == null || frpVar.a != null) {
            return;
        }
        if (playbackState == null) {
            throw null;
        }
        List<PlaybackState.CustomAction> customActions = playbackState.getCustomActions();
        if (customActions != null) {
            ArrayList arrayList2 = new ArrayList(customActions.size());
            for (PlaybackState.CustomAction customAction : customActions) {
                if (customAction != null) {
                    Bundle extras = customAction.getExtras();
                    fse.d(extras);
                    fsk fskVar = new fsk(customAction.getAction(), customAction.getName(), customAction.getIcon(), extras);
                    fskVar.e = customAction;
                    arrayList2.add(fskVar);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        Bundle extras2 = playbackState.getExtras();
        fse.d(extras2);
        new fsl(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), 0, playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), arrayList, playbackState.getActiveQueueItemId(), extras2).l = playbackState;
        throw null;
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueChanged(List list) {
        if (((frp) this.a.get()) != null) {
            if (list != null) {
                ArrayList arrayList = new ArrayList(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    MediaSession.QueueItem queueItem = (MediaSession.QueueItem) it.next();
                    arrayList.add(new fsb(queueItem, frs.b(queueItem.getDescription()), queueItem.getQueueId()));
                }
            }
            throw null;
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueTitleChanged(CharSequence charSequence) {
        if (((frp) this.a.get()) != null) {
            throw null;
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionDestroyed() {
        if (((frp) this.a.get()) != null) {
            throw null;
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionEvent(String str, Bundle bundle) {
        fse.d(bundle);
        if (((frp) this.a.get()) != null) {
            throw null;
        }
    }
}
