package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gsu extends ConnectivityManager.NetworkCallback {
    private final yjv a;

    public gsu(yjv yjvVar) {
        this.a = yjvVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        gpn.b();
        int i = gta.a;
        this.a.a(gss.a);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        gpn.b();
        int i = gta.a;
        this.a.a(new gst(7));
    }
}
