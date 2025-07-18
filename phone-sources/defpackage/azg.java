package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.googletv.app.presentation.pages.aioverview.AiOverviewActivity;
import com.google.android.apps.googletv.app.presentation.pages.contentrestrictions.ContentRestrictionsActivity;
import com.google.android.apps.googletv.app.presentation.pages.search.v2.SearchQueryPageActivity;
import com.google.android.apps.googletv.app.presentation.pages.virtualremote.activities.VirtualRemoteActivity;
import com.google.android.videos.R;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class azg implements yjz {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public azg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, yka] */
    /* JADX WARN: Type inference failed for: r2v57, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r2v74, types: [java.lang.Object, yjz] */
    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        kiq kiqVar;
        switch (this.b) {
            case 0:
                bao baoVar = (bao) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (baoVar.L((iIntValue & 3) != 2, iIntValue & 1)) {
                    ?? r2 = this.a;
                    bkp bkpVarP = bty.p("Container");
                    bvt bvtVarA = xo.a(bkb.a, true);
                    int iO = zy.o(baoVar);
                    bhu bhuVarO = baoVar.O();
                    bkp bkpVarC = bdi.C(baoVar, bkpVarP);
                    yjk yjkVar = bxt.a;
                    baoVar.c();
                    baoVar.z();
                    if (baoVar.J()) {
                        baoVar.k(yjkVar);
                    } else {
                        baoVar.B();
                    }
                    beb.a(baoVar, bvtVarA, bxt.d);
                    beb.a(baoVar, bhuVarO, bxt.c);
                    yjz yjzVar = bxt.e;
                    if (baoVar.J() || !yks.e(baoVar.g(), Integer.valueOf(iO))) {
                        Integer numValueOf = Integer.valueOf(iO);
                        baoVar.A(numValueOf);
                        baoVar.i(numValueOf, yjzVar);
                    }
                    beb.a(baoVar, bkpVarC, bxt.b);
                    r2.a(baoVar, 0);
                    baoVar.o();
                } else {
                    baoVar.t();
                }
                break;
            case 1:
                bao baoVar2 = (bao) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (baoVar2.L((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    axa.b(((avq) this.a).a.b(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, baoVar2, 0, 0, 262142);
                } else {
                    baoVar2.t();
                }
                break;
            case 2:
                bao baoVar3 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar3.K()) {
                    baoVar3.t();
                } else {
                    this.a.a(new cwr(), baoVar3, 0);
                }
                break;
            case 3:
                bao baoVar4 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar4.K()) {
                    baoVar4.t();
                } else {
                    aeh aehVarC = aep.c();
                    bkm bkmVar = bkp.g;
                    bkp bkpVarP2 = wv.p(hq.g(zi.b(zi.a(bkmVar, 1.0f), 56.0f), new bnz(yfm.s(new bnq(bny.j(2149678078L)), new bnq(bny.j(2147979003L)), new bnq(bny.j(2158790635L)), new bnq(bny.j(2163101021L))), null, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), aehVarC, 4), 1.5f);
                    Object obj3 = this.a;
                    bvt bvtVarA2 = xo.a(bkb.a, false);
                    int iK = a.k(zy.p(baoVar4));
                    bhu bhuVarO2 = baoVar4.O();
                    bkp bkpVarC2 = bdi.C(baoVar4, bkpVarP2);
                    yjk yjkVar2 = bxt.a;
                    baoVar4.c();
                    baoVar4.z();
                    if (baoVar4.J()) {
                        baoVar4.k(yjkVar2);
                    } else {
                        baoVar4.B();
                    }
                    beb.a(baoVar4, bvtVarA2, bxt.d);
                    beb.a(baoVar4, bhuVarO2, bxt.c);
                    yjz yjzVar2 = bxt.e;
                    if (baoVar4.J() || !yks.e(baoVar4.g(), Integer.valueOf(iK))) {
                        Integer numValueOf2 = Integer.valueOf(iK);
                        baoVar4.A(numValueOf2);
                        baoVar4.i(numValueOf2, yjzVar2);
                    }
                    beb.a(baoVar4, bkpVarC2, bxt.b);
                    xo.b(hq.f(xs.a.a(bkmVar.a(zi.c), bkb.e), bny.i(((jha) obj3).a.r()), aehVarC), baoVar4, 0);
                    baoVar4.o();
                }
                break;
            case 4:
                bao baoVar5 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar5.K()) {
                    baoVar5.t();
                } else {
                    axa.b(((kfr) this.a).a, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, baoVar5, 0, 0, 262142);
                }
                break;
            case 5:
                bao baoVar6 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar6.K()) {
                    baoVar6.t();
                } else {
                    bkp bkpVarA = bkp.g.a(zi.c);
                    Object obj4 = this.a;
                    jxa jxaVarAccess$getViewModel = AiOverviewActivity.access$getViewModel((AiOverviewActivity) obj4);
                    baoVar6.x(5004770);
                    boolean zH = baoVar6.H(obj4);
                    Object objG = baoVar6.g();
                    if (zH || objG == ban.a) {
                        objG = new izc(obj4, 18);
                        baoVar6.A(objG);
                    }
                    baoVar6.p();
                    jwq.z(jxaVarAccess$getViewModel, (yjk) objG, bkpVarA, baoVar6, 384);
                }
                break;
            case 6:
                bao baoVar7 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar7.K()) {
                    baoVar7.t();
                } else {
                    Object obj5 = this.a;
                    bcp bcpVar = jab.a;
                    kdj kdjVar = ((AiOverviewActivity) obj5).b;
                    if (kdjVar == null) {
                        yks.c("visualElements");
                        kdjVar = null;
                    }
                    bcm.i(bcpVar.c(kdjVar), bga.k(788587894, new azg(obj5, 5), baoVar7), baoVar7, 56);
                }
                break;
            case 7:
                bao baoVar8 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar8.K()) {
                    baoVar8.t();
                } else {
                    Object obj6 = this.a;
                    AiOverviewActivity aiOverviewActivity = (AiOverviewActivity) obj6;
                    aiOverviewActivity.a(bny.j(((Number) AiOverviewActivity.access$getViewModel(aiOverviewActivity).b.a()).longValue()), bga.k(483745974, new azg(obj6, 6), baoVar8), baoVar8, 48);
                }
                break;
            case 8:
                bao baoVar9 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar9.K()) {
                    baoVar9.t();
                } else {
                    ContentRestrictionsActivity contentRestrictionsActivity = (ContentRestrictionsActivity) this.a;
                    ihz ihzVar = (ihz) a.bT(contentRestrictionsActivity.a().l(), new ihx(2), null, baoVar9, 2).a();
                    if (ihzVar instanceof ihw) {
                        baoVar9.x(-406888878);
                        jys.c((ihw) ihzVar, baoVar9, 0);
                        baoVar9.p();
                    } else if (ihzVar instanceof iht) {
                        baoVar9.x(-406807844);
                        jxl.H((jyb) contentRestrictionsActivity.a.a(), (List) ((iht) ihzVar).a, contentRestrictionsActivity.a(), baoVar9, 0);
                        baoVar9.p();
                    } else {
                        baoVar9.x(-406693547);
                        jys.b(baoVar9, 0);
                        baoVar9.p();
                    }
                }
                break;
            case 9:
                kuw kuwVar = null;
                bao baoVar10 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar10.K()) {
                    baoVar10.t();
                } else {
                    Object obj7 = this.a;
                    kuw kuwVar2 = ((ContentRestrictionsActivity) obj7).b;
                    if (kuwVar2 == null) {
                        yks.c("composeThemeProvider");
                    } else {
                        kuwVar = kuwVar2;
                    }
                    kuwVar.a(null, null, false, bga.k(817574180, new azg(obj7, 8), baoVar10), baoVar10, 35840, 7);
                }
                break;
            case 10:
                bao baoVar11 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar11.K()) {
                    baoVar11.t();
                } else {
                    axa.b((String) this.a, ccf.d(bkp.g, "toolbar_title"), wv.K(baoVar11).q, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wv.N(baoVar11).g, baoVar11, 48, 0, 131064);
                }
                break;
            case 11:
                bao baoVar12 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar12.K()) {
                    baoVar12.t();
                } else {
                    View view = (View) baoVar12.f(AndroidCompositionLocals_androidKt.f);
                    cds cdsVar = (cds) baoVar12.f(ccq.m);
                    boolean zF = baoVar12.F(view) | baoVar12.F(cdsVar);
                    Object objG2 = baoVar12.g();
                    if (zF || objG2 == ban.a) {
                        objG2 = new cdi(view, cdsVar.d());
                        baoVar12.A(objG2);
                    }
                    Object obj8 = this.a;
                    cdi cdiVar = (cdi) objG2;
                    bcp bcpVar2 = jab.a;
                    kdj kdjVar2 = ((kaa) obj8).g;
                    if (kdjVar2 == null) {
                        yks.c("visualElements");
                        kdjVar2 = null;
                    }
                    bcm.i(bcpVar2.c(kdjVar2), bga.k(-102367004, new awh(obj8, cdiVar, 17, null), baoVar12), baoVar12, 56);
                }
                break;
            case 12:
                bao baoVar13 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar13.K()) {
                    baoVar13.t();
                } else {
                    wlx wlxVar = ((wsu) this.a).c;
                    if (wlxVar == null) {
                        wlxVar = wlx.a;
                    }
                    wlxVar.getClass();
                    kaf.d(wlxVar, null, baoVar13, 0);
                }
                break;
            case 13:
                bao baoVar14 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar14.K()) {
                    baoVar14.t();
                } else {
                    rdd.C(this.a, wv.v(bkp.g, 0.0f, 0.0f, 8.0f, 0.0f, 11), false, null, null, null, kep.b, baoVar14, 1572912, 60);
                }
                break;
            case 14:
                bao baoVar15 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar15.K()) {
                    baoVar15.t();
                } else {
                    rdd.p(((Resources) baoVar15.f(AndroidCompositionLocals_androidKt.c)).getString(R.string.recent_search_remove_dialog_body, Arrays.copyOf(new Object[]{((kem) this.a).a}, 1)), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, baoVar15, 0, 0, 131070);
                }
                break;
            case 15:
                bao baoVar16 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar16.K()) {
                    baoVar16.t();
                } else {
                    this.a.a(baoVar16, 0);
                }
                break;
            case 16:
                bao baoVar17 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar17.K()) {
                    baoVar17.t();
                } else {
                    Object obj9 = this.a;
                    baoVar17.x(-1591605436);
                    SearchQueryPageActivity searchQueryPageActivity = (SearchQueryPageActivity) obj9;
                    kff.a(searchQueryPageActivity, searchQueryPageActivity.b(), searchQueryPageActivity.a(), baoVar17, 0);
                    baoVar17.p();
                }
                break;
            case 17:
                bao baoVar18 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar18.K()) {
                    baoVar18.t();
                } else {
                    baoVar18.x(5004770);
                    Object obj10 = this.a;
                    boolean zH2 = baoVar18.H(obj10);
                    Object objG3 = baoVar18.g();
                    if (zH2 || objG3 == ban.a) {
                        objG3 = new keu(obj10, 12);
                        baoVar18.A(objG3);
                    }
                    yjk yjkVar3 = (yjk) objG3;
                    baoVar18.p();
                    kiq kiqVar2 = ((VirtualRemoteActivity) obj10).a;
                    if (kiqVar2 == null) {
                        yks.c("viewModel");
                        kiqVar = null;
                    } else {
                        kiqVar = kiqVar2;
                    }
                    kff.f(yjkVar3, kiqVar, baoVar18, 64);
                }
                break;
            case 18:
                kuw kuwVar3 = null;
                bao baoVar19 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar19.K()) {
                    baoVar19.t();
                } else {
                    Object obj11 = this.a;
                    kuw kuwVar4 = ((VirtualRemoteActivity) obj11).b;
                    if (kuwVar4 == null) {
                        yks.c("composeThemeProvider");
                    } else {
                        kuwVar3 = kuwVar4;
                    }
                    kuwVar3.a(null, null, false, bga.k(1658992792, new azg(obj11, 17), baoVar19), baoVar19, 35840, 7);
                }
                break;
            case 19:
                bao baoVar20 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar20.K()) {
                    baoVar20.t();
                } else {
                    rdd.z(ccf.y(R.drawable.gs_arrow_back_rond100_vd_theme_24, baoVar20, 0), ((Context) this.a).getString(R.string.content_description_back_button), zi.d(bkp.g, 32.0f), 0L, baoVar20, 0, 8);
                }
                break;
            default:
                bao baoVar21 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar21.K()) {
                    baoVar21.t();
                } else {
                    rdd.z(ccf.y(R.drawable.gs_close_vd_theme_24, baoVar21, 0), ((Context) this.a).getString(R.string.accessibility_close_button), null, 0L, baoVar21, 0, 12);
                }
                break;
        }
        return ygi.a;
    }
}
