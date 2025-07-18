package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hun extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ mma a;

    public hun(mma mmaVar) {
        this.a = mmaVar;
    }

    private final void a(boolean z) {
        hwp.h(new hum(this, z, 0));
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
