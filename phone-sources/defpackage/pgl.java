package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pgl implements pfr {
    public final pfn a;
    private final tst b;
    private final oxp c;
    private final yow d;

    public pgl(tst tstVar, pfn pfnVar, oxp oxpVar, yow yowVar) {
        pfnVar.getClass();
        oxpVar.getClass();
        this.b = tstVar;
        this.a = pfnVar;
        this.c = oxpVar;
        this.d = yowVar;
    }

    @Override // defpackage.pfr
    public final View a(by byVar, uyr uyrVar) {
        return null;
    }

    @Override // defpackage.pfr
    public final void b(by byVar, View view, oyd oydVar, uyv uyvVar) {
        tst tstVar = this.b;
        if (!tstVar.g()) {
            ykr.q(this.d, null, 0, new pfd(this, oydVar, (yih) null, 5), 3);
            return;
        }
        uwi uwiVar = oydVar.c;
        uyr uyrVar = uwiVar.f;
        if (uyrVar == null) {
            uyrVar = uyr.a;
        }
        if (uyrVar.f) {
            ykr.q(this.d, null, 0, new pfd(this, oydVar, (yih) null, 6, (byte[]) null), 3);
            return;
        }
        this.c.i(oydVar);
        qtl.t(oydVar.b);
        uyr uyrVar2 = uwiVar.f;
        if (uyrVar2 == null) {
            uyrVar2 = uyr.a;
        }
        uyd uydVar = uyrVar2.c == 11 ? (uyd) uyrVar2.d : uyd.a;
        uydVar.getClass();
        pix pixVar = (pix) tstVar.c();
        uydVar.c.getClass();
        vsl vslVar = uydVar.d;
        if (vslVar == null) {
            vslVar = vsl.a;
        }
        vslVar.getClass();
        pixVar.b();
    }

    @Override // defpackage.pfr
    public final boolean c(uyq uyqVar) {
        return uyqVar == uyq.UITYPE_GNP_CUSTOM_UI;
    }
}
