package defpackage;

import android.net.ConnectivityManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class chs implements cim {
    public final ConnectivityManager a;

    public chs(ConnectivityManager connectivityManager) {
        this.a = connectivityManager;
    }

    @Override // defpackage.cim
    public final ahgr a(caq caqVar) {
        caqVar.getClass();
        return new ahgm(new chr(caqVar, this, null));
    }

    @Override // defpackage.cim
    public final boolean b(cld cldVar) {
        return cldVar.l.b.b != null;
    }

    @Override // defpackage.cim
    public final boolean c(cld cldVar) {
        if (b(cldVar)) {
            throw new IllegalStateException("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        }
        return false;
    }
}
