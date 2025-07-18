package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eut extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ euu a;
    private boolean b;
    private boolean c;

    public eut(euu euuVar) {
        this.a = euuVar;
    }

    private final void a() {
        this.a.c.post(new emy(this, 9));
    }

    private final void b() {
        this.a.c.post(new emy(this, 10));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        a();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        if (z) {
            return;
        }
        b();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        boolean zHasCapability = networkCapabilities.hasCapability(16);
        if (this.b && this.c == zHasCapability) {
            if (zHasCapability) {
                b();
            }
        } else {
            this.b = true;
            this.c = zHasCapability;
            a();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        a();
    }
}
