package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kjs extends kjp {
    public final HashMap c = new HashMap();
    public final Context d;
    public volatile Handler e;
    public final kle f;
    public final long g;
    private final kjr h;
    private final long i;
    private volatile Executor j;

    public kjs(Context context, Looper looper) {
        kjr kjrVar = new kjr(this);
        this.h = kjrVar;
        this.d = context.getApplicationContext();
        this.e = new kos(looper, kjrVar);
        this.f = kle.a();
        this.i = 5000L;
        this.g = 300000L;
        this.j = null;
    }

    @Override // defpackage.kjp
    public final ConnectionResult a(kjo kjoVar, ServiceConnection serviceConnection, String str, Executor executor) {
        ConnectionResult connectionResultA;
        HashMap map = this.c;
        synchronized (map) {
            kjq kjqVar = (kjq) map.get(kjoVar);
            if (executor == null) {
                executor = null;
            }
            if (kjqVar == null) {
                kjqVar = new kjq(this, kjoVar);
                kjqVar.d(serviceConnection, serviceConnection);
                connectionResultA = kjqVar.a(str, executor);
                map.put(kjoVar, kjqVar);
            } else {
                this.e.removeMessages(0, kjoVar);
                if (kjqVar.b(serviceConnection)) {
                    throw new IllegalStateException(a.q(kjoVar, "Trying to bind a GmsServiceConnection that was already connected before.  config="));
                }
                kjqVar.d(serviceConnection, serviceConnection);
                int i = kjqVar.b;
                if (i == 1) {
                    serviceConnection.onServiceConnected(kjqVar.f, kjqVar.d);
                } else if (i == 2) {
                    connectionResultA = kjqVar.a(str, executor);
                }
                connectionResultA = null;
            }
            if (kjqVar.c) {
                return ConnectionResult.a;
            }
            if (connectionResultA == null) {
                connectionResultA = new ConnectionResult(1, -1, null, null);
            }
            return connectionResultA;
        }
    }

    @Override // defpackage.kjp
    protected final void d(kjo kjoVar, ServiceConnection serviceConnection) {
        HashMap map = this.c;
        synchronized (map) {
            kjq kjqVar = (kjq) map.get(kjoVar);
            if (kjqVar == null) {
                throw new IllegalStateException(a.q(kjoVar, "Nonexistent connection status for service config: "));
            }
            if (!kjqVar.b(serviceConnection)) {
                throw new IllegalStateException(a.q(kjoVar, "Trying to unbind a GmsServiceConnection  that was not bound before.  config="));
            }
            kjqVar.a.remove(serviceConnection);
            if (kjqVar.c()) {
                this.e.sendMessageDelayed(this.e.obtainMessage(0, kjoVar), this.i);
            }
        }
    }
}
