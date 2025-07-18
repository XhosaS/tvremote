package defpackage;

import android.media.MediaRoute2Info;
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
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftz extends fuk {
    final String a;
    final MediaRouter2.RoutingController b;
    final Messenger c;
    final Messenger d;
    final Handler f;
    fug i;
    final /* synthetic */ fue j;
    final SparseArray e = new SparseArray();
    final AtomicInteger g = new AtomicInteger(1);
    private final Runnable p = new foe(this, 13);
    public int h = -1;

    public ftz(fue fueVar, MediaRouter2.RoutingController routingController, String str) {
        Bundle controlHints;
        this.j = fueVar;
        this.b = routingController;
        this.a = str;
        Messenger messenger = (routingController == null || (controlHints = routingController.getControlHints()) == null) ? null : (Messenger) controlHints.getParcelable("androidx.mediarouter.media.KEY_MESSENGER");
        this.c = messenger;
        this.d = messenger != null ? new Messenger(new fty(this)) : null;
        this.f = new Handler(Looper.getMainLooper());
    }

    private final void o() {
        Handler handler = this.f;
        Runnable runnable = this.p;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 1000L);
    }

    @Override // defpackage.fuk
    public final void a(String str) {
        if (str == null || str.isEmpty()) {
            Log.w("MR2Provider", "onAddMemberRoute: Ignoring null or empty routeId.");
            return;
        }
        MediaRoute2Info mediaRoute2InfoA = this.j.a(str);
        if (mediaRoute2InfoA == null) {
            Log.w("MR2Provider", "onAddMemberRoute: Specified route not found. routeId=".concat(str));
        } else {
            this.b.selectRoute(mediaRoute2InfoA);
        }
    }

    @Override // defpackage.fun
    public final void b() {
        this.b.release();
    }

    @Override // defpackage.fuk
    public final void c(String str) {
        if (str == null || str.isEmpty()) {
            Log.w("MR2Provider", "onRemoveMemberRoute: Ignoring null or empty routeId.");
            return;
        }
        MediaRoute2Info mediaRoute2InfoA = this.j.a(str);
        if (mediaRoute2InfoA == null) {
            Log.w("MR2Provider", "onRemoveMemberRoute: Specified route not found. routeId=".concat(str));
        } else {
            this.b.deselectRoute(mediaRoute2InfoA);
        }
    }

    @Override // defpackage.fun
    public final void d(int i) {
        MediaRouter2.RoutingController routingController = this.b;
        if (routingController == null) {
            return;
        }
        routingController.setVolume(i);
        this.h = i;
        o();
    }

    @Override // defpackage.fuk
    public final void e(List list) {
        if (list.isEmpty()) {
            Log.w("MR2Provider", "onUpdateMemberRoutes: Ignoring null or empty routeIds.");
            return;
        }
        String str = (String) list.get(0);
        fue fueVar = this.j;
        MediaRoute2Info mediaRoute2InfoA = fueVar.a(str);
        if (mediaRoute2InfoA == null) {
            Log.w("MR2Provider", "onUpdateMemberRoutes: Specified route not found. routeId=".concat(String.valueOf(str)));
        } else {
            fueVar.a.transferTo(mediaRoute2InfoA);
        }
    }

    @Override // defpackage.fun
    public final void f(int i) {
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
        o();
    }

    final void g(String str, int i) throws RemoteException {
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

    final void h(String str, int i) throws RemoteException {
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
