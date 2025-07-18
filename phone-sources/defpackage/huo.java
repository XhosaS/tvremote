package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Log;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class huo {
    private static volatile huo d;
    public boolean a;
    public final Object b;
    public final Object c;

    public huo(ndi ndiVar, ndj ndjVar) {
        this.c = ndiVar;
        this.b = ndjVar;
    }

    static huo a(Context context) {
        if (d == null) {
            synchronized (huo.class) {
                if (d == null) {
                    d = new huo(context.getApplicationContext());
                }
            }
        }
        return d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v3, types: [hwj, java.lang.Object] */
    final synchronized void b(htv htvVar) {
        ?? r0 = this.b;
        r0.add(htvVar);
        if (!this.a && !r0.isEmpty()) {
            Object obj = this.c;
            ?? r02 = ((mma) obj).b;
            boolean z = true;
            ((mma) obj).a = ((ConnectivityManager) r02.a()).getActiveNetwork() != null;
            try {
                ((ConnectivityManager) r02.a()).registerDefaultNetworkCallback((ConnectivityManager.NetworkCallback) ((mma) obj).c);
            } catch (RuntimeException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e);
                }
                z = false;
            }
            this.a = z;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v3, types: [hwj, java.lang.Object] */
    final synchronized void c(htv htvVar) {
        ?? r0 = this.b;
        r0.remove(htvVar);
        if (this.a && r0.isEmpty()) {
            Object obj = this.c;
            ((ConnectivityManager) ((mma) obj).b.a()).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) ((mma) obj).c);
            this.a = false;
        }
    }

    public final float d() {
        return ((ndj) this.c).c;
    }

    public final void e(float f) {
        ((ndi) this.c).b(f);
    }

    private huo(Context context) {
        this.b = new HashSet();
        this.c = new mma(new hwi(new huk(context)), new hul(this));
    }
}
