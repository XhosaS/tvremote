package defpackage;

import android.media.MediaRouter2;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yy extends zi {
    final String a;
    final MediaRouter2.RoutingController b;
    final Messenger c;
    final Messenger d;
    final Handler f;
    zf i;
    final SparseArray e = new SparseArray();
    final AtomicInteger g = new AtomicInteger(1);
    private final Runnable o = new ki(this, 14);
    public int h = -1;

    public yy(MediaRouter2.RoutingController routingController, String str) {
        Bundle controlHints;
        this.b = routingController;
        this.a = str;
        Messenger messenger = (routingController == null || (controlHints = routingController.getControlHints()) == null) ? null : (Messenger) controlHints.getParcelable("androidx.mediarouter.media.KEY_MESSENGER");
        this.c = messenger;
        this.d = messenger != null ? new Messenger(new yx(this)) : null;
        this.f = new Handler(Looper.getMainLooper());
    }

    private final void j() {
        Handler handler = this.f;
        Runnable runnable = this.o;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 1000L);
    }

    @Override // defpackage.zl
    public final void a() {
        this.b.release();
    }

    @Override // defpackage.zl
    public final void b(int i) {
        MediaRouter2.RoutingController routingController = this.b;
        if (routingController == null) {
            return;
        }
        routingController.setVolume(i);
        this.h = i;
        j();
    }

    @Override // defpackage.zl
    public final void c(int i) {
        MediaRouter2.RoutingController routingController = this.b;
        if (routingController == null) {
            return;
        }
        int volume = this.h;
        if (volume < 0) {
            volume = routingController.getVolume();
        }
        int iMax = Math.max(0, Math.min(volume + i, routingController.getVolumeMax()));
        this.h = iMax;
        routingController.setVolume(iMax);
        j();
    }

    final void d(String str, int i) throws RemoteException {
        Messenger messenger;
        MediaRouter2.RoutingController routingController = this.b;
        if (routingController == null || routingController.isReleased() || (messenger = this.c) == null) {
            return;
        }
        int andIncrement = this.g.getAndIncrement();
        Message messageObtain = Message.obtain();
        messageObtain.what = 7;
        messageObtain.arg1 = andIncrement;
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i);
        bundle.putString("routeId", str);
        messageObtain.setData(bundle);
        messageObtain.replyTo = this.d;
        try {
            messenger.send(messageObtain);
        } catch (DeadObjectException unused) {
        } catch (RemoteException e) {
            Log.e("MR2Provider", "Could not send control request to service.", e);
        }
    }

    final void e(String str, int i) throws RemoteException {
        Messenger messenger;
        MediaRouter2.RoutingController routingController = this.b;
        if (routingController == null || routingController.isReleased() || (messenger = this.c) == null) {
            return;
        }
        int andIncrement = this.g.getAndIncrement();
        Message messageObtain = Message.obtain();
        messageObtain.what = 8;
        messageObtain.arg1 = andIncrement;
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i);
        bundle.putString("routeId", str);
        messageObtain.setData(bundle);
        messageObtain.replyTo = this.d;
        try {
            messenger.send(messageObtain);
        } catch (DeadObjectException unused) {
        } catch (RemoteException e) {
            Log.e("MR2Provider", "Could not send control request to service.", e);
        }
    }
}
