package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ezn {
    private final ConnectivityManager a;

    public ezn(ConnectivityManager connectivityManager) {
        this.a = connectivityManager;
        a();
    }

    public final void a() {
        NetworkInfo activeNetworkInfo = this.a.getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            activeNetworkInfo.isConnected();
        }
    }
}
