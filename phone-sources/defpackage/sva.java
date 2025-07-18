package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sva implements svd {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boolean c;
    final /* synthetic */ svd d;

    public sva(boolean z, boolean z2, boolean z3, svd svdVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = svdVar;
    }

    @Override // defpackage.svd
    public final void a(View view, cyh cyhVar, sve sveVar) {
        if (this.a) {
            sveVar.d += cyhVar.a();
        }
        boolean zP = sil.p(view);
        if (this.b) {
            if (zP) {
                sveVar.c += cyhVar.b();
            } else {
                sveVar.a += cyhVar.b();
            }
        }
        if (this.c) {
            if (zP) {
                sveVar.a += cyhVar.c();
            } else {
                sveVar.c += cyhVar.c();
            }
        }
        sveVar.a(view);
        this.d.a(view, cyhVar, sveVar);
    }
}
