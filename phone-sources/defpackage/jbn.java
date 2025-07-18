package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jbn extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ jbo a;
    final /* synthetic */ ysk b;

    public jbn(jbo jboVar, ysk yskVar) {
        this.a = jboVar;
        this.b = yskVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        network.getClass();
        super.onAvailable(network);
        aki.b(this.a, this.b);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        super.onCapabilitiesChanged(network, networkCapabilities);
        aki.b(this.a, this.b);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        super.onLost(network);
        aki.b(this.a, this.b);
    }
}
