package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Process;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wob implements wnz {
    private final ConnectivityManager a;

    public wob(Context context, ConnectivityManager connectivityManager) {
        if (context.checkPermission("android.permission.INTERNET", Process.myPid(), Process.myUid()) == 0) {
            yqw.M(context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0, "An app using the NETWORK_CONNECTED sync constraint must have the ACCESS_NETWORK_STATE permission.");
        }
        this.a = connectivityManager;
    }

    @Override // defpackage.wnz
    public final boolean a() {
        NetworkInfo activeNetworkInfo = this.a.getActiveNetworkInfo();
        return (activeNetworkInfo == null || !activeNetworkInfo.isConnected() || activeNetworkInfo.getDetailedState() == NetworkInfo.DetailedState.BLOCKED) ? false : true;
    }
}
