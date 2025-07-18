package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Process;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class woc implements wnz {
    private final ConnectivityManager a;

    public woc(Context context, ConnectivityManager connectivityManager) {
        if (context.checkPermission("android.permission.INTERNET", Process.myPid(), Process.myUid()) == 0) {
            yqw.M(context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0, "An app using the NETWORK_UNMETERED sync constraint must have the ACCESS_NETWORK_STATE permission.");
        }
        this.a = connectivityManager;
    }

    @Override // defpackage.wnz
    public final boolean a() {
        ConnectivityManager connectivityManager = this.a;
        boolean zIsActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return (zIsActiveNetworkMetered || activeNetworkInfo == null || !activeNetworkInfo.isConnected() || activeNetworkInfo.getDetailedState() == NetworkInfo.DetailedState.BLOCKED) ? false : true;
    }
}
