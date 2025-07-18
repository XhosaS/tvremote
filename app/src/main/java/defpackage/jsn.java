package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jsn implements jsy {
    public static final zdy a = zdy.h("com/google/android/downloader/AndroidConnectivityHandler");
    public final Context b;
    public final ScheduledExecutorService c;
    public final long d;
    private final ConnectivityManager e;

    public jsn(Context context, ScheduledExecutorService scheduledExecutorService, long j) {
        if (abs.a(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            throw new IllegalStateException("AndroidConnectivityHandler requires the ACCESS_NETWORK_STATE permission.");
        }
        this.b = context;
        this.c = scheduledExecutorService;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
        connectivityManager.getClass();
        this.e = connectivityManager;
        this.d = j;
    }

    public final boolean a(jth jthVar) {
        NetworkCapabilities networkCapabilities;
        if (jthVar == jth.c) {
            return true;
        }
        ConnectivityManager connectivityManager = this.e;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(12)) {
            return false;
        }
        jsp jspVar = (jsp) jthVar;
        if (jspVar.a && connectivityManager.isActiveNetworkMetered()) {
            return false;
        }
        yzq yzqVar = jspVar.b;
        if (yzqVar.contains(jtg.ANY)) {
            return true;
        }
        jtg jtgVar = networkCapabilities.hasTransport(0) ? jtg.CELLULAR : networkCapabilities.hasTransport(1) ? jtg.WIFI : networkCapabilities.hasTransport(2) ? jtg.BLUETOOTH : networkCapabilities.hasTransport(3) ? jtg.ETHERNET : networkCapabilities.hasTransport(4) ? jtg.CELLULAR : null;
        if (jtgVar == null) {
            return false;
        }
        return yzqVar.contains(jtgVar);
    }
}
