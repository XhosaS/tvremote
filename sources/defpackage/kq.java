package defpackage;

import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
class kq extends kp {
    @Override // defpackage.ko, defpackage.ii
    public void q(kx kxVar, kx kxVar2, Window window, View view, boolean z, boolean z2) {
        kxVar.getClass();
        kxVar2.getClass();
        window.getClass();
        view.getClass();
        qn.c(window);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        asv asvVar = new asv(window);
        asvVar.N(!z);
        asvVar.M(true ^ z2);
    }
}
