package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sps implements svd {
    @Override // defpackage.svd
    public final void a(View view, cyh cyhVar, sve sveVar) {
        sveVar.d += cyhVar.a();
        int layoutDirection = view.getLayoutDirection();
        int iB = cyhVar.b();
        int iC = cyhVar.c();
        sveVar.a += layoutDirection == 1 ? iC : iB;
        if (layoutDirection != 1) {
            iB = iC;
        }
        sveVar.c += iB;
        sveVar.a(view);
    }
}
