package defpackage;

import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
class ko extends ii {
    @Override // defpackage.ii
    public void q(kx kxVar, kx kxVar2, Window window, View view, boolean z, boolean z2) {
        kxVar.getClass();
        kxVar2.getClass();
        window.getClass();
        view.getClass();
        qn.c(window);
        window.setStatusBarColor(kxVar.a(z));
        window.setNavigationBarColor(kxVar2.a(z2));
        asv asvVar = new asv(window);
        asvVar.N(!z);
        asvVar.M(!z2);
    }
}
