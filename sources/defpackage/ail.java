package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ail {
    public static final Object a = new Object();
    public static HandlerThread b;
    public static ail h;
    public final HashMap c;
    public final Context d;
    public volatile Handler e;
    public final long f;
    public volatile Executor g;
    private final ain i;
    private final long j;

    public ail() {
        throw null;
    }

    public final void a(String str, ServiceConnection serviceConnection, boolean z) {
        aik aikVar = new aik(str, z);
        HashMap map = this.c;
        synchronized (map) {
            aim aimVar = (aim) map.get(aikVar);
            if (aimVar == null) {
                throw new IllegalStateException(b.g(aikVar.a, "Nonexistent connection status for service config: "));
            }
            if (!aimVar.a(serviceConnection)) {
                throw new IllegalStateException(b.g(aikVar.a, "Trying to unbind a GmsServiceConnection  that was not bound before.  config="));
            }
            aimVar.a.remove(serviceConnection);
            if (aimVar.b()) {
                this.e.sendMessageDelayed(this.e.obtainMessage(0, aikVar), this.j);
            }
        }
    }

    public ail(Context context, Looper looper) {
        this.c = new HashMap();
        ain ainVar = new ain(this);
        this.i = ainVar;
        this.d = context.getApplicationContext();
        this.e = new akn(looper, ainVar);
        if (ajo.b == null) {
            synchronized (ajo.a) {
                if (ajo.b == null) {
                    ajo.b = new ajo();
                }
            }
        }
        qp.p(ajo.b);
        this.j = 5000L;
        this.f = 300000L;
        this.g = null;
    }
}
