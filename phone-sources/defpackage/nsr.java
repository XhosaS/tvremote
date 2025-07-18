package defpackage;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nsr extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ nss a;

    public nsr(nss nssVar) {
        this.a = nssVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        this.a.a(network, linkProperties);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        List list;
        nss nssVar = this.a;
        synchronized (nssVar.g) {
            Map map = nssVar.c;
            if (map != null && (list = nssVar.d) != null) {
                nsf.e();
                if (list.remove(network)) {
                    map.remove(network);
                }
                nssVar.b();
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        List list;
        nss nssVar = this.a;
        synchronized (nssVar.g) {
            Map map = nssVar.c;
            if (map != null && (list = nssVar.d) != null) {
                nsf.e();
                map.clear();
                list.clear();
                nssVar.b();
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
    }
}
