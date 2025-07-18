package defpackage;

import android.media.session.MediaController;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import java.util.List;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public class ee implements IBinder.DeathRecipient {
    final MediaController.Callback a = new ec(this);
    ed b;
    dy c;

    final void a(int i, Object obj, Bundle bundle) {
        ed edVar = this.b;
        if (edVar != null) {
            Message messageObtainMessage = edVar.obtainMessage(i, obj);
            messageObtainMessage.setData(bundle);
            messageObtainMessage.sendToTarget();
        }
    }

    final void b(Handler handler) {
        if (handler != null) {
            ed edVar = new ed(this, handler.getLooper());
            this.b = edVar;
            edVar.a = true;
        } else {
            ed edVar2 = this.b;
            if (edVar2 != null) {
                edVar2.a = false;
                edVar2.removeCallbacksAndMessages(null);
                this.b = null;
            }
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        a(8, null, null);
    }

    public dy getIControllerCallback() {
        return this.c;
    }

    public void onSessionDestroyed() {
    }

    public void onSessionReady() {
    }

    public void onAudioInfoChanged(eh ehVar) {
    }

    public void onCaptioningEnabledChanged(boolean z) {
    }

    public void onExtrasChanged(Bundle bundle) {
    }

    public void onMetadataChanged(du duVar) {
    }

    public void onPlaybackStateChanged(ey eyVar) {
    }

    public void onQueueChanged(List<er> list) {
    }

    public void onQueueTitleChanged(CharSequence charSequence) {
    }

    public void onRepeatModeChanged(int i) {
    }

    public void onShuffleModeChanged(int i) {
    }

    public void onSessionEvent(String str, Bundle bundle) {
    }
}
