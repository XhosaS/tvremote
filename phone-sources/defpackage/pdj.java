package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pdj extends pcd {
    static final tsl a = new lpq(14);
    static final tsl b = new pdo();
    static final tsl c = new pdi();
    static final tsl d = new pdf();
    static final tsl e = new pdl();
    static final tsl f = new lpq(9);

    @Override // defpackage.pcd
    public final void b(vns vnsVar, vtw vtwVar) {
        int i = true != vnsVar.g ? 2 : 3;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        uyr uyrVar = (uyr) vtwVar.b;
        uyr uyrVar2 = uyr.a;
        uyrVar.h = i - 1;
        uyrVar.b |= 16;
    }

    @Override // defpackage.pcd
    public final void c(vns vnsVar, vtw vtwVar) {
        if (vnsVar.c == 13) {
            Object objApply = f.apply((vnm) vnsVar.d);
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            uyr uyrVar = (uyr) vtwVar.b;
            uyr uyrVar2 = uyr.a;
            objApply.getClass();
            uyrVar.d = objApply;
            uyrVar.c = 11;
        }
    }

    @Override // defpackage.pcd
    public final void d(vns vnsVar, vtw vtwVar) {
        vnr vnrVarB = vnr.b(vnsVar.f);
        if (vnrVarB == null) {
            vnrVarB = vnr.UI_THEME_UNSPECIFIED;
        }
        vnr vnrVar = vnr.UI_THEME_GOOGLE_MATERIAL;
        int iG = vfi.G(vnsVar.c);
        if (iG == 0) {
            throw null;
        }
        switch (iG - 1) {
            case 0:
                uyq uyqVar = vnrVarB == vnrVar ? uyq.UITYPE_GM_DIALOG : uyq.UITYPE_DIALOG;
                if (!vtwVar.b.A()) {
                    vtwVar.u();
                }
                uyr uyrVar = (uyr) vtwVar.b;
                uyr uyrVar2 = uyr.a;
                uyrVar.e = uyqVar.s;
                uyrVar.b |= 2;
                return;
            case 1:
                uyq uyqVar2 = vnrVarB == vnrVar ? uyq.UITYPE_GM_TAP_TARGET : uyq.UITYPE_TAP_TARGET;
                if (!vtwVar.b.A()) {
                    vtwVar.u();
                }
                uyr uyrVar3 = (uyr) vtwVar.b;
                uyr uyrVar4 = uyr.a;
                uyrVar3.e = uyqVar2.s;
                uyrVar3.b |= 2;
                return;
            case 2:
                uyq uyqVar3 = vnrVarB == vnrVar ? uyq.UITYPE_GM_TOOLTIP : uyq.UITYPE_TOOLTIP;
                if (!vtwVar.b.A()) {
                    vtwVar.u();
                }
                uyr uyrVar5 = (uyr) vtwVar.b;
                uyr uyrVar6 = uyr.a;
                uyrVar5.e = uyqVar3.s;
                uyrVar5.b |= 2;
                return;
            case 3:
                uyq uyqVar4 = uyq.UITYPE_PERMISSION;
                if (!vtwVar.b.A()) {
                    vtwVar.u();
                }
                uyr uyrVar7 = (uyr) vtwVar.b;
                uyr uyrVar8 = uyr.a;
                uyrVar7.e = uyqVar4.s;
                uyrVar7.b |= 2;
                return;
            case 4:
                uyq uyqVar5 = uyq.UITYPE_RATING_NATIVE_STORE_REVIEW_DIALOG;
                if (!vtwVar.b.A()) {
                    vtwVar.u();
                }
                uyr uyrVar9 = (uyr) vtwVar.b;
                uyr uyrVar10 = uyr.a;
                uyrVar9.e = uyqVar5.s;
                uyrVar9.b |= 2;
                return;
            case 5:
                uyq uyqVar6 = uyq.UITYPE_GNP_CUSTOM_UI;
                if (!vtwVar.b.A()) {
                    vtwVar.u();
                }
                uyr uyrVar11 = (uyr) vtwVar.b;
                uyr uyrVar12 = uyr.a;
                uyrVar11.e = uyqVar6.s;
                uyrVar11.b |= 2;
                return;
            case 6:
                uyq uyqVar7 = uyq.UITYPE_NONE;
                if (!vtwVar.b.A()) {
                    vtwVar.u();
                }
                uyr uyrVar13 = (uyr) vtwVar.b;
                uyr uyrVar14 = uyr.a;
                uyrVar13.e = uyqVar7.s;
                uyrVar13.b |= 2;
                return;
            default:
                return;
        }
    }

    @Override // defpackage.pcd
    public final void e(vns vnsVar, vtw vtwVar) {
        if (vnsVar.c == 4) {
            Object objApply = e.apply((vnw) vnsVar.d);
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            uyr uyrVar = (uyr) vtwVar.b;
            uyr uyrVar2 = uyr.a;
            objApply.getClass();
            uyrVar.d = objApply;
            uyrVar.c = 6;
        }
    }

    @Override // defpackage.pcd
    public final void f(vns vnsVar, vtw vtwVar) {
        if (vnsVar.c == 1) {
            Object objApply = d.apply((vnl) vnsVar.d);
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            uyr uyrVar = (uyr) vtwVar.b;
            uyr uyrVar2 = uyr.a;
            objApply.getClass();
            uyrVar.d = objApply;
            uyrVar.c = 2;
        }
    }

    @Override // defpackage.pcd
    public final void g(vns vnsVar, vtw vtwVar) {
        if (vnsVar.c == 2) {
            Object objApply = c.apply((vnq) vnsVar.d);
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            uyr uyrVar = (uyr) vtwVar.b;
            uyr uyrVar2 = uyr.a;
            objApply.getClass();
            uyrVar.d = objApply;
            uyrVar.c = 3;
        }
    }

    @Override // defpackage.pcd
    public final void h(vns vnsVar, vtw vtwVar) {
        if (vnsVar.c == 3) {
            Object objApply = b.apply((vny) vnsVar.d);
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            uyr uyrVar = (uyr) vtwVar.b;
            uyr uyrVar2 = uyr.a;
            objApply.getClass();
            uyrVar.d = objApply;
            uyrVar.c = 5;
        }
    }
}
