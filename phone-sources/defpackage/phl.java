package defpackage;

import android.os.Bundle;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class phl implements pfr {
    private final oxp a;
    private final /* synthetic */ int b;
    private final Object c;
    private final pkg d;

    public phl(kwy kwyVar, pkg pkgVar, oxp oxpVar, int i) {
        this.b = i;
        this.c = kwyVar;
        this.d = pkgVar;
        this.a = oxpVar;
    }

    @Override // defpackage.pfr
    public final View a(by byVar, uyr uyrVar) {
        if (this.b != 0) {
            return ((kwy) this.c).p(uyrVar.c == 3 ? (uyy) uyrVar.d : uyy.a).a(byVar, null);
        }
        return ((kwy) this.c).o(byVar, uyrVar.c == 5 ? (uzb) uyrVar.d : uzb.a);
    }

    @Override // defpackage.pfr
    public final void b(by byVar, View view, oyd oydVar, uyv uyvVar) {
        if (this.b == 0) {
            if (view == null) {
                this.d.j(oydVar, pfq.FAILED_VIEW_NOT_FOUND);
                return;
            }
            uwi uwiVar = oydVar.c;
            uyr uyrVar = uwiVar.f;
            if (uyrVar == null) {
                uyrVar = uyr.a;
            }
            uzb uzbVar = uyrVar.c == 5 ? (uzb) uyrVar.d : uzb.a;
            try {
                if (rdd.ak(uyvVar, uzbVar.j)) {
                    uyvVar = uyv.UNSPECIFIED;
                } else {
                    rdd.aj(uyvVar, uzbVar.j);
                    if ((uzbVar.b & 32) != 0) {
                        uxw uxwVar = uzbVar.k;
                        if (uxwVar == null) {
                            uxwVar = uxw.a;
                        }
                        rdd.aj(uyvVar, uxwVar.i);
                    }
                }
                uyr uyrVar2 = uwiVar.f;
                if (uyrVar2 == null) {
                    uyrVar2 = uyr.a;
                }
                if (uyrVar2.f) {
                    this.d.j(oydVar, pfq.SUCCESS);
                    return;
                }
                this.a.i(oydVar);
                phk phkVar = new phk();
                Bundle bundle = new Bundle();
                bundle.putParcelable("promo_context", oydVar);
                bundle.putInt("theme", uyvVar.d);
                phkVar.setArguments(bundle);
                at atVar = new at(byVar.getSupportFragmentManager());
                atVar.r(phkVar, "TooltipFragment");
                atVar.l();
                return;
            } catch (pgf unused) {
                this.d.j(oydVar, pfq.FAILED_THEME_NOT_FOUND);
                return;
            }
        }
        if (view == null) {
            this.d.j(oydVar, pfq.FAILED_VIEW_NOT_FOUND);
            return;
        }
        uwi uwiVar2 = oydVar.c;
        uyr uyrVar3 = uwiVar2.f;
        if (uyrVar3 == null) {
            uyrVar3 = uyr.a;
        }
        uyy uyyVar = uyrVar3.c == 3 ? (uyy) uyrVar3.d : uyy.a;
        try {
            if (rdd.ak(uyvVar, uyyVar.l)) {
                uyvVar = uyv.UNSPECIFIED;
            } else {
                rdd.aj(uyvVar, uyyVar.l);
                rdd.aj(uyvVar, uyyVar.m);
                if ((uyyVar.b & 1024) != 0) {
                    uxw uxwVar2 = uyyVar.p;
                    if (uxwVar2 == null) {
                        uxwVar2 = uxw.a;
                    }
                    rdd.aj(uyvVar, uxwVar2.i);
                }
            }
            uyr uyrVar4 = uwiVar2.f;
            if (uyrVar4 == null) {
                uyrVar4 = uyr.a;
            }
            if (uyrVar4.f) {
                this.d.j(oydVar, pfq.SUCCESS);
                return;
            }
            this.a.i(oydVar);
            pha phaVar = new pha();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("promo_context", oydVar);
            bundle2.putInt("theme", uyvVar.d);
            phaVar.setArguments(bundle2);
            at atVar2 = new at(byVar.getSupportFragmentManager());
            atVar2.r(phaVar, "FeatureHighlightFragment");
            atVar2.l();
        } catch (pgf unused2) {
            this.d.j(oydVar, pfq.FAILED_THEME_NOT_FOUND);
        }
    }

    @Override // defpackage.pfr
    public final boolean c(uyq uyqVar) {
        return this.b != 0 ? uyqVar == uyq.UITYPE_GM_TAP_TARGET : uyqVar == uyq.UITYPE_GM_TOOLTIP;
    }
}
