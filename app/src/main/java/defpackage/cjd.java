package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjd extends cja {
    public final ConnectivityManager e;
    private final cjc f;

    public cjd(Context context, coe coeVar) {
        super(context, coeVar);
        Object systemService = this.a.getSystemService("connectivity");
        systemService.getClass();
        this.e = (ConnectivityManager) systemService;
        this.f = new cjc(this);
    }

    @Override // defpackage.cja
    public final /* synthetic */ Object b() {
        return cje.a(this.e);
    }

    @Override // defpackage.cja
    public final void d() {
        try {
            cbx.c().a(cje.a, "Registering network callback");
            ConnectivityManager connectivityManager = this.e;
            cjc cjcVar = this.f;
            cjcVar.getClass();
            connectivityManager.registerDefaultNetworkCallback(cjcVar);
        } catch (IllegalArgumentException e) {
            cbx.c();
            Log.e(cje.a, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            cbx.c();
            Log.e(cje.a, "Received exception while registering network callback", e2);
        }
    }

    @Override // defpackage.cja
    public final void e() {
        try {
            cbx.c().a(cje.a, "Unregistering network callback");
            ConnectivityManager connectivityManager = this.e;
            cjc cjcVar = this.f;
            cjcVar.getClass();
            connectivityManager.unregisterNetworkCallback(cjcVar);
        } catch (IllegalArgumentException e) {
            cbx.c();
            Log.e(cje.a, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            cbx.c();
            Log.e(cje.a, "Received exception while unregistering network callback", e2);
        }
    }
}
