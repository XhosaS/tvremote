package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cje {
    public static final String a = cbx.d("NetworkStateTracker");

    public static final chu a(ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilities;
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            boolean z = activeNetworkInfo != null && activeNetworkInfo.isConnected();
            try {
                networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            } catch (SecurityException e) {
                cbx.c();
                Log.e(a, "Unable to validate active network", e);
            }
            boolean zHasCapability = networkCapabilities != null ? networkCapabilities.hasCapability(16) : false;
            return new chu(z, zHasCapability, connectivityManager.isActiveNetworkMetered(), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
        } catch (SecurityException e2) {
            cbx.c();
            Log.e(a, "Unable to get active network state", e2);
            return new chu(false, false, false, true);
        }
    }
}
