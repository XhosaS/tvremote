package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pgn implements pfr {
    private final oxp a;
    private final pkg b;

    public pgn(pkg pkgVar, oxp oxpVar) {
        this.b = pkgVar;
        this.a = oxpVar;
    }

    @Override // defpackage.pfr
    public final View a(by byVar, uyr uyrVar) {
        return null;
    }

    @Override // defpackage.pfr
    public final void b(by byVar, View view, oyd oydVar, uyv uyvVar) {
        uwi uwiVar = oydVar.c;
        uyr uyrVar = uwiVar.f;
        if (uyrVar == null) {
            uyrVar = uyr.a;
        }
        try {
            uyv uyvVarAi = rdd.ai(uyvVar, uyrVar.c == 2 ? (uyc) uyrVar.d : uyc.a);
            uyr uyrVar2 = uwiVar.f;
            if (uyrVar2 == null) {
                uyrVar2 = uyr.a;
            }
            if (uyrVar2.f) {
                this.b.j(oydVar, pfq.SUCCESS);
            } else {
                this.a.i(oydVar);
                pgw.a(oydVar, uyvVarAi).show(byVar.getSupportFragmentManager(), "PromoUiDialogFragment");
            }
        } catch (pgf unused) {
            this.b.j(oydVar, pfq.FAILED_THEME_NOT_FOUND);
        }
    }

    @Override // defpackage.pfr
    public final boolean c(uyq uyqVar) {
        return uyqVar == uyq.UITYPE_GM_DIALOG;
    }
}
