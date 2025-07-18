package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjc extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ cjd a;

    public cjc(cjd cjdVar) {
        this.a = cjdVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        cbx cbxVarC = cbx.c();
        String str = cje.a;
        Objects.toString(networkCapabilities);
        cbxVarC.a(str, "Network capabilities changed: ".concat(networkCapabilities.toString()));
        this.a.f(new chu(networkCapabilities.hasCapability(12), networkCapabilities.hasCapability(16), !networkCapabilities.hasCapability(11), networkCapabilities.hasCapability(18)));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        cbx.c().a(cje.a, "Network connection lost");
        cjd cjdVar = this.a;
        cjdVar.f(cje.a(cjdVar.e));
    }
}
