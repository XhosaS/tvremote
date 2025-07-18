package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gsy extends ConnectivityManager.NetworkCallback {
    public static final gsy a = new gsy();
    public static final Object b = new Object();
    public static final Map c = new LinkedHashMap();

    private gsy() {
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        List<Map.Entry> listAl;
        network.getClass();
        networkCapabilities.getClass();
        gpn.b();
        int i = gta.a;
        synchronized (b) {
            listAl = yfm.al(c.entrySet());
        }
        for (Map.Entry entry : listAl) {
            ((yjv) entry.getValue()).a(((NetworkRequest) entry.getKey()).canBeSatisfiedBy(networkCapabilities) ? gss.a : new gst(7));
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        List listAl;
        network.getClass();
        gpn.b();
        int i = gta.a;
        synchronized (b) {
            listAl = yfm.al(c.values());
        }
        Iterator it = listAl.iterator();
        while (it.hasNext()) {
            ((yjv) it.next()).a(new gst(7));
        }
    }
}
