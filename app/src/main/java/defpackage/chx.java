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
final class chx extends ConnectivityManager.NetworkCallback {
    public static final chx a = new chx();
    public static final Object b = new Object();
    public static final Map c = new LinkedHashMap();

    private chx() {
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        List<Map.Entry> listX;
        network.getClass();
        networkCapabilities.getClass();
        cbx.c().a(cif.a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (b) {
            listX = agqq.x(c.entrySet());
        }
        for (Map.Entry entry : listX) {
            ((agux) entry.getKey()).a(((NetworkRequest) entry.getValue()).canBeSatisfiedBy(networkCapabilities) ? chj.a : new chk(7));
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        List listX;
        network.getClass();
        cbx.c().a(cif.a, "NetworkRequestConstraintController onLost callback");
        synchronized (b) {
            listX = agqq.x(c.keySet());
        }
        Iterator it = listX.iterator();
        while (it.hasNext()) {
            ((agux) it.next()).a(new chk(7));
        }
    }
}
