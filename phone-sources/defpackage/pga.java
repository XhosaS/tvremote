package defpackage;

import android.view.View;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pga implements pfm {
    private static final tvn a = tvn.n("GnpSdk");
    private final Set b;
    private final pkg c;

    public pga(Set set, pkg pkgVar) {
        this.b = set;
        this.c = pkgVar;
    }

    private final pfr c(uyq uyqVar) {
        for (pfr pfrVar : this.b) {
            if (pfrVar.c(uyqVar)) {
                return pfrVar;
            }
        }
        return null;
    }

    @Override // defpackage.pfm
    public final View a(by byVar, uyr uyrVar) {
        uyq uyqVarB = uyq.b(uyrVar.e);
        if (uyqVarB == null) {
            uyqVarB = uyq.UITYPE_NONE;
        }
        pfr pfrVarC = c(uyqVarB);
        if (pfrVarC != null) {
            return pfrVarC.a(byVar, uyrVar);
        }
        ((tvk) a.l().j("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/PromoUiRendererImpl", "findView", 46, "PromoUiRendererImpl.java")).v("Could not find View for unsupported PromoUi: %s", uyrVar);
        return null;
    }

    @Override // defpackage.pfm
    public final void b(by byVar, View view, oyd oydVar, uyv uyvVar) {
        uyr uyrVar = oydVar.c.f;
        if (uyrVar == null) {
            uyrVar = uyr.a;
        }
        uyq uyqVarB = uyq.b(uyrVar.e);
        if (uyqVarB == null) {
            uyqVarB = uyq.UITYPE_NONE;
        }
        pfr pfrVarC = c(uyqVarB);
        if (pfrVarC != null) {
            try {
                pfrVarC.b(byVar, view, oydVar, uyvVar);
                return;
            } catch (RuntimeException e) {
                ((tvk) ((tvk) ((tvk) a.f()).i(e)).j("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/PromoUiRendererImpl", "render", '>', "PromoUiRendererImpl.java")).s("Failed rendering promotion.");
                this.c.j(oydVar, pfq.FAILED_UNKNOWN);
                return;
            }
        }
        tvk tvkVar = (tvk) a.l().j("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/PromoUiRendererImpl", "render", 70, "PromoUiRendererImpl.java");
        uyr uyrVar2 = oydVar.c.f;
        if (uyrVar2 == null) {
            uyrVar2 = uyr.a;
        }
        tvkVar.v("Could not render unsupported PromoUi: %s", uyrVar2);
        this.c.j(oydVar, pfq.FAILED_UNSUPPORTED_UI);
    }
}
