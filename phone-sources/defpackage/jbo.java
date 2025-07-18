package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jbo {
    public static final tui a = tui.l("com/google/android/apps/googletv/app/player/NetworkStatusMonitor");
    public static final NetworkRequest b = new NetworkRequest.Builder().addCapability(12).addTransportType(0).addTransportType(1).build();
    private static final List e = yfm.s(12, 16, 21);
    public final ConnectivityManager c;
    public final ysx d = new yss(new aki(this, (yih) null, 19));

    public jbo(ConnectivityManager connectivityManager) {
        this.c = connectivityManager;
    }

    public final jbm a() {
        ill illVar = new ill(this, 10);
        Network activeNetwork = this.c.getActiveNetwork();
        Object objA = null;
        if (activeNetwork != null) {
            try {
                objA = illVar.a(activeNetwork);
            } catch (Exception e2) {
                ((tug) ((tug) a.g()).i(e2).j("com/google/android/apps/googletv/app/player/NetworkStatusMonitor", "getNetworkStatus$java_com_google_android_apps_googletv_app_player_network_status_module", 93, "NetworkStatusMonitor.kt")).s("Failed to get network capabilities");
            }
        }
        if (objA != null) {
            List list = e;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((NetworkCapabilities) objA).hasCapability(((Number) it.next()).intValue())) {
                    }
                }
            }
            return ((NetworkCapabilities) objA).hasTransport(0) ? jbm.b : jbm.a;
        }
        return jbm.c;
    }
}
