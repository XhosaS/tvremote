package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ljm extends ConnectivityManager.NetworkCallback {
    public boolean a = false;
    final /* synthetic */ ljn b;
    private final ljn c;

    public ljm(ljn ljnVar, ljn ljnVar2) {
        this.b = ljnVar;
        this.c = ljnVar2;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        super.onCapabilitiesChanged(network, networkCapabilities);
        if (this.b.h.e()) {
            this.a = true;
            this.c.dM();
        }
    }
}
