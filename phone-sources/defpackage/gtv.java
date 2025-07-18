package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gtv {
    public static final String a = gpn.a("NetworkStateTracker");

    public static final gsw a(ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilities;
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            boolean z = activeNetworkInfo != null && activeNetworkInfo.isConnected();
            try {
                networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            } catch (SecurityException e) {
                gpn.b();
                Log.e(a, "Unable to validate active network", e);
            }
            boolean zHasCapability = networkCapabilities != null ? networkCapabilities.hasCapability(16) : false;
            return new gsw(z, zHasCapability, connectivityManager.isActiveNetworkMetered(), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
        } catch (SecurityException e2) {
            gpn.b();
            Log.e(a, "Unable to get active network state", e2);
            return new gsw(false, false, false, true);
        }
    }
}
