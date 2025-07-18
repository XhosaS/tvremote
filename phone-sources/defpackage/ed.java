package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ed extends Handler {
    boolean a;
    final /* synthetic */ ee b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed(ee eeVar, Looper looper) {
        super(looper);
        this.b = eeVar;
        this.a = false;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.a) {
            switch (message.what) {
                case 1:
                    Bundle data = message.getData();
                    eu.c(data);
                    this.b.onSessionEvent((String) message.obj, data);
                    break;
                case 2:
                    this.b.onPlaybackStateChanged((ey) message.obj);
                    break;
                case 3:
                    this.b.onMetadataChanged((du) message.obj);
                    break;
                case 4:
                    this.b.onAudioInfoChanged((eh) message.obj);
                    break;
                case 5:
                    this.b.onQueueChanged((List) message.obj);
                    break;
                case 6:
                    this.b.onQueueTitleChanged((CharSequence) message.obj);
                    break;
                case 7:
                    Bundle bundle = (Bundle) message.obj;
                    eu.c(bundle);
                    this.b.onExtrasChanged(bundle);
                    break;
                case 8:
                    this.b.onSessionDestroyed();
                    break;
                case 9:
                    this.b.onRepeatModeChanged(((Integer) message.obj).intValue());
                    break;
                case 11:
                    this.b.onCaptioningEnabledChanged(((Boolean) message.obj).booleanValue());
                    break;
                case 12:
                    this.b.onShuffleModeChanged(((Integer) message.obj).intValue());
                    break;
                case 13:
                    this.b.onSessionReady();
                    break;
            }
        }
    }
}
