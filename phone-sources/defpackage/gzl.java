package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gzl implements gzj {
    private final ConnectivityManager a;
    private final gzk b;
    private final hba c;

    public gzl(ConnectivityManager connectivityManager, hba hbaVar) {
        this.a = connectivityManager;
        this.c = hbaVar;
        gzk gzkVar = new gzk(this);
        this.b = gzkVar;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), gzkVar);
    }

    private final boolean d(Network network) {
        NetworkCapabilities networkCapabilities = this.a.getNetworkCapabilities(network);
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }

    @Override // defpackage.gzj
    public final void a() {
        this.a.unregisterNetworkCallback(this.b);
    }

    @Override // defpackage.gzj
    public final boolean b() {
        Network[] allNetworks = this.a.getAllNetworks();
        allNetworks.getClass();
        for (Network network : allNetworks) {
            network.getClass();
            if (d(network)) {
                return true;
            }
        }
        return false;
    }

    public final void c(Network network, boolean z) {
        boolean zD;
        Network[] allNetworks = this.a.getAllNetworks();
        allNetworks.getClass();
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (i >= allNetworks.length) {
                break;
            }
            Network network2 = allNetworks[i];
            if (yks.e(network2, network)) {
                zD = z;
            } else {
                network2.getClass();
                zD = d(network2);
            }
            if (zD) {
                z2 = true;
                break;
            }
            i++;
        }
        hba hbaVar = this.c;
        if (((riv) hbaVar.a.get()) != null) {
            hbaVar.b = z2;
        } else {
            hbaVar.a();
        }
    }
}
