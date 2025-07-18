package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tky extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ tkz a;

    public tky(tkz tkzVar) {
        this.a = tkzVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.a.b.post(new tci(this, 17));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.a.b.post(new tci(this, 17));
    }
}
