package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* compiled from: PG */
/* loaded from: classes.dex */
final class chn extends ConnectivityManager.NetworkCallback {
    private final agux a;

    public chn(agux aguxVar) {
        this.a = aguxVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        cbx.c().a(cif.a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        this.a.a(chj.a);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        cbx.c().a(cif.a, "NetworkRequestConstraintController onLost callback");
        this.a.a(new chk(7));
    }
}
