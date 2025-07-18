package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gtu extends gtr {
    public final ConnectivityManager e;
    private final gtt f;

    public gtu(Context context, isy isyVar) {
        super(context, isyVar);
        Object systemService = this.a.getSystemService("connectivity");
        systemService.getClass();
        this.e = (ConnectivityManager) systemService;
        this.f = new gtt(this);
    }

    @Override // defpackage.gtr
    public final /* bridge */ /* synthetic */ Object b() {
        return gtv.a(this.e);
    }

    @Override // defpackage.gtr
    public final void d() {
        try {
            gpn.b();
            String str = gtv.a;
            ConnectivityManager connectivityManager = this.e;
            gtt gttVar = this.f;
            gttVar.getClass();
            connectivityManager.registerDefaultNetworkCallback(gttVar);
        } catch (IllegalArgumentException e) {
            gpn.b();
            Log.e(gtv.a, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            gpn.b();
            Log.e(gtv.a, "Received exception while registering network callback", e2);
        }
    }

    @Override // defpackage.gtr
    public final void e() {
        try {
            gpn.b();
            String str = gtv.a;
            ConnectivityManager connectivityManager = this.e;
            gtt gttVar = this.f;
            gttVar.getClass();
            connectivityManager.unregisterNetworkCallback(gttVar);
        } catch (IllegalArgumentException e) {
            gpn.b();
            Log.e(gtv.a, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            gpn.b();
            Log.e(gtv.a, "Received exception while unregistering network callback", e2);
        }
    }
}
