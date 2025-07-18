package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gtt extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ gtu a;

    public gtt(gtu gtuVar) {
        this.a = gtuVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        gpn.b();
        String str = gtv.a;
        Objects.toString(networkCapabilities);
        networkCapabilities.toString();
        int i = Build.VERSION.SDK_INT;
        gtu gtuVar = this.a;
        gtuVar.f(i >= 28 ? new gsw(networkCapabilities.hasCapability(12), networkCapabilities.hasCapability(16), !networkCapabilities.hasCapability(11), networkCapabilities.hasCapability(18)) : gtv.a(gtuVar.e));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        gpn.b();
        String str = gtv.a;
        gtu gtuVar = this.a;
        gtuVar.f(gtv.a(gtuVar.e));
    }
}
