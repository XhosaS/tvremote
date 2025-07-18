package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;

/* compiled from: PG */
/* loaded from: classes.dex */
class dnr extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ dns a;

    public dnr(dns dnsVar) {
        this.a = dnsVar;
    }

    private final void a(boolean z) {
        dqm.d().post(new dnq(this, z));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        a(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        a(false);
    }
}
