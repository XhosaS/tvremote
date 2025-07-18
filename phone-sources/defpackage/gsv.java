package defpackage;

import android.net.ConnectivityManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gsv implements gte {
    public final ConnectivityManager a;

    public gsv(ConnectivityManager connectivityManager) {
        this.a = connectivityManager;
    }

    @Override // defpackage.gte
    public final ysx a(gou gouVar) {
        gouVar.getClass();
        return new yss(new ajp(gouVar, this, (yih) null, 5));
    }

    @Override // defpackage.gte
    public final boolean b(guw guwVar) {
        return guwVar.k.a() != null;
    }

    @Override // defpackage.gte
    public final boolean c(guw guwVar) {
        if (b(guwVar)) {
            throw new IllegalStateException("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        }
        return false;
    }
}
