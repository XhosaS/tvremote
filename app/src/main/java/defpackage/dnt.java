package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dnt {
    private static volatile dnt b;
    final Set a = new HashSet();
    private boolean c;
    private final dns d;

    private dnt(Context context) {
        this.d = new dns(new dqd(new dno(context)), new dnp(this));
    }

    static dnt a(Context context) {
        if (b == null) {
            synchronized (dnt.class) {
                if (b == null) {
                    b = new dnt(context.getApplicationContext());
                }
            }
        }
        return b;
    }

    final synchronized void b(dmt dmtVar) {
        Set set = this.a;
        set.add(dmtVar);
        if (!this.c && !set.isEmpty()) {
            dns dnsVar = this.d;
            dqe dqeVar = dnsVar.c;
            boolean z = true;
            dnsVar.a = ((ConnectivityManager) dqeVar.a()).getActiveNetwork() != null;
            try {
                ((ConnectivityManager) dqeVar.a()).registerDefaultNetworkCallback(dnsVar.d);
            } catch (RuntimeException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e);
                }
                z = false;
            }
            this.c = z;
        }
    }

    final synchronized void c(dmt dmtVar) {
        Set set = this.a;
        set.remove(dmtVar);
        if (this.c && set.isEmpty()) {
            dns dnsVar = this.d;
            ((ConnectivityManager) dnsVar.c.a()).unregisterNetworkCallback(dnsVar.d);
            this.c = false;
        }
    }
}
