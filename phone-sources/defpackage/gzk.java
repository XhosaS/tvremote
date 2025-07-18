package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gzk extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ gzl a;

    public gzk(gzl gzlVar) {
        this.a = gzlVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        network.getClass();
        this.a.c(network, true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        this.a.c(network, false);
    }
}
