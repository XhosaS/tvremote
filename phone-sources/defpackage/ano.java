package defpackage;

import android.content.Context;
import androidx.compose.foundation.ScrollingLayoutElement;
import com.google.android.apps.googletv.app.device.presentation.companionbar.CompanionBarFragment;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ano implements yjz {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public ano(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, yka] */
    /* JADX WARN: Type inference failed for: r1v72, types: [bdy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v36, types: [bib, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v45, types: [bkp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [bdy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [bkp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r3v17, types: [bkp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.Object, yka] */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r4v45, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v52, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r4v57, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v59, types: [java.lang.Object, yjk] */
    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        bkp bkpVarO;
        int i = 10;
        kiq kiqVar = null;
        int i2 = 2;
        switch (this.d) {
            case 0:
                bao baoVar = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar.K()) {
                    baoVar.t();
                } else {
                    bcm.i(anv.a.c(Float.valueOf(bnq.a(kv.H(this.a)))), bga.k(-869936862, new acv(this.b, this.c, 5, null), baoVar), baoVar, 56);
                }
                break;
            case 1:
                bao baoVar2 = (bao) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (baoVar2.L((iIntValue & 3) != 2, iIntValue & 1)) {
                    ?? r3 = this.a;
                    Object obj3 = this.b;
                    Object objG = baoVar2.g();
                    if (objG == ban.a) {
                        objG = new agt(obj3, i);
                        baoVar2.A(objG);
                    }
                    bkp bkpVarT = fh.T(r3, (yjv) objG);
                    ?? r32 = this.c;
                    bvt bvtVarA = xo.a(bkb.a, true);
                    int iK = a.k(zy.p(baoVar2));
                    bhu bhuVarO = baoVar2.O();
                    bkp bkpVarC = bdi.C(baoVar2, bkpVarT);
                    yjk yjkVar = bxt.a;
                    baoVar2.c();
                    baoVar2.z();
                    if (baoVar2.J()) {
                        baoVar2.k(yjkVar);
                    } else {
                        baoVar2.B();
                    }
                    beb.a(baoVar2, bvtVarA, bxt.d);
                    beb.a(baoVar2, bhuVarO, bxt.c);
                    yjz yjzVar = bxt.e;
                    if (baoVar2.J() || !yks.e(baoVar2.g(), Integer.valueOf(iK))) {
                        Integer numValueOf = Integer.valueOf(iK);
                        baoVar2.A(numValueOf);
                        baoVar2.i(numValueOf, yjzVar);
                    }
                    beb.a(baoVar2, bkpVarC, bxt.b);
                    r32.a(baoVar2, 0);
                    baoVar2.o();
                } else {
                    baoVar2.t();
                }
                break;
            case 2:
                bao baoVar3 = (bao) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (baoVar3.L((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    bkp bkpVarX = wv.x(wv.u(this.a, 0.0f, 8.0f, 1));
                    sj sjVar = (sj) this.b;
                    bkp bkpVarA = hw.l(bkpVarX, sjVar, uv.a, (!((12 & 2) == 0)) | false, null, sjVar.c, true, null).a(new ScrollingLayoutElement(sjVar));
                    ?? r4 = this.c;
                    bvt bvtVarA2 = xu.a(xk.c, bkb.j, baoVar3, 0);
                    int iO = zy.o(baoVar3);
                    bhu bhuVarO2 = baoVar3.O();
                    bkp bkpVarC2 = bdi.C(baoVar3, bkpVarA);
                    yjk yjkVar2 = bxt.a;
                    baoVar3.c();
                    baoVar3.z();
                    if (baoVar3.J()) {
                        baoVar3.k(yjkVar2);
                    } else {
                        baoVar3.B();
                    }
                    beb.a(baoVar3, bvtVarA2, bxt.d);
                    beb.a(baoVar3, bhuVarO2, bxt.c);
                    yjz yjzVar2 = bxt.e;
                    if (baoVar3.J() || !yks.e(baoVar3.g(), Integer.valueOf(iO))) {
                        Integer numValueOf2 = Integer.valueOf(iO);
                        baoVar3.A(numValueOf2);
                        baoVar3.i(numValueOf2, yjzVar2);
                    }
                    beb.a(baoVar3, bkpVarC2, bxt.b);
                    r4.a(xx.a, baoVar3, 6);
                    baoVar3.o();
                } else {
                    baoVar3.t();
                }
                break;
            case 3:
                bao baoVar4 = (bao) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (baoVar4.L((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    bkp bkpVarV = wv.v(zh.a(bkp.g, 1.0f, true), this.b != null ? 12.0f : 0.0f, 0.0f, this.c != null ? 12.0f : 0.0f, 0.0f, 10);
                    ?? r42 = this.a;
                    bvt bvtVarA3 = xo.a(bkb.a, false);
                    int iO2 = zy.o(baoVar4);
                    bhu bhuVarO3 = baoVar4.O();
                    bkp bkpVarC3 = bdi.C(baoVar4, bkpVarV);
                    yjk yjkVar3 = bxt.a;
                    baoVar4.c();
                    baoVar4.z();
                    if (baoVar4.J()) {
                        baoVar4.k(yjkVar3);
                    } else {
                        baoVar4.B();
                    }
                    beb.a(baoVar4, bvtVarA3, bxt.d);
                    beb.a(baoVar4, bhuVarO3, bxt.c);
                    yjz yjzVar3 = bxt.e;
                    if (baoVar4.J() || !yks.e(baoVar4.g(), Integer.valueOf(iO2))) {
                        Integer numValueOf3 = Integer.valueOf(iO2);
                        baoVar4.A(numValueOf3);
                        baoVar4.i(numValueOf3, yjzVar3);
                    }
                    beb.a(baoVar4, bkpVarC3, bxt.b);
                    r42.a(baoVar4, 0);
                    baoVar4.o();
                } else {
                    baoVar4.t();
                }
                break;
            case 4:
                bao baoVar5 = (bao) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (baoVar5.L((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    Object obj4 = this.b;
                    bkm bkmVar = bkp.g;
                    boolean zH = baoVar5.H(obj4);
                    Object objG2 = baoVar5.g();
                    if (zH || objG2 == ban.a) {
                        objG2 = new ars(obj4, i);
                        baoVar5.A(objG2);
                    }
                    bkp bkpVarC4 = bny.c(bkmVar, (yjv) objG2);
                    Object obj5 = this.a;
                    ?? r10 = this.c;
                    bvt bvtVarA4 = xu.a(xk.c, bkb.j, baoVar5, 0);
                    int iO3 = zy.o(baoVar5);
                    bhu bhuVarO4 = baoVar5.O();
                    bkp bkpVarC5 = bdi.C(baoVar5, bkpVarC4);
                    yjk yjkVar4 = bxt.a;
                    baoVar5.c();
                    baoVar5.z();
                    if (baoVar5.J()) {
                        baoVar5.k(yjkVar4);
                    } else {
                        baoVar5.B();
                    }
                    beb.a(baoVar5, bvtVarA4, bxt.d);
                    beb.a(baoVar5, bhuVarO4, bxt.c);
                    yjz yjzVar4 = bxt.e;
                    if (baoVar5.J() || !yks.e(baoVar5.g(), Integer.valueOf(iO3))) {
                        Integer numValueOf4 = Integer.valueOf(iO3);
                        baoVar5.A(numValueOf4);
                        baoVar5.i(numValueOf4, yjzVar4);
                    }
                    beb.a(baoVar5, bkpVarC5, bxt.b);
                    long j = ((atw) obj5).b;
                    xx xxVar = xx.a;
                    og.v(null, 0.0f, j, baoVar5, 0, 3);
                    r10.a(xxVar, baoVar5, 6);
                    baoVar5.o();
                } else {
                    baoVar5.t();
                }
                break;
            case 5:
                bao baoVar6 = (bao) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (baoVar6.L((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    Object objG3 = baoVar6.g();
                    if (objG3 == ban.a) {
                        objG3 = new bcf(0);
                        baoVar6.A(objG3);
                    }
                    Object obj6 = this.c;
                    bdn bdnVar = (bdn) objG3;
                    apj.c(null, null, null, null, null, bga.k(958604965, new awh(obj6, bdnVar, 3, null), baoVar6), 0, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, bga.k(57310875, new ada(this.b, this.a, obj6, bdnVar, 2), baoVar6), baoVar6, 196608, 12582912);
                } else {
                    baoVar6.t();
                }
                break;
            case 6:
                bao baoVar7 = (bao) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                if (baoVar7.L((iIntValue6 & 3) != 2, iIntValue6 & 1)) {
                    Object obj7 = this.b;
                    Object obj8 = this.a;
                    Object[] objArr = (Object[]) this.c;
                    cls.a((String) obj7, (String) obj8, baoVar7, Arrays.copyOf(objArr, objArr.length));
                } else {
                    baoVar7.t();
                }
                break;
            case 7:
                bao baoVar8 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar8.K()) {
                    baoVar8.t();
                } else {
                    fus.F(this.b, bga.k(65670941, new awh(this.a, this.c, 8), baoVar8), baoVar8, 48);
                }
                break;
            case 8:
                bao baoVar9 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar9.K()) {
                    baoVar9.t();
                } else {
                    baoVar9.x(-1633490746);
                    Object obj9 = this.c;
                    boolean zH2 = baoVar9.H(obj9);
                    Object obj10 = this.b;
                    boolean zH3 = zH2 | baoVar9.H(obj10);
                    Object objG4 = baoVar9.g();
                    if (zH3 || objG4 == ban.a) {
                        objG4 = new isg(obj9, obj10, i2, 0 == true ? 1 : 0);
                        baoVar9.A(objG4);
                    }
                    yjk yjkVar5 = (yjk) objG4;
                    baoVar9.p();
                    kiq kiqVar2 = ((CompanionBarFragment) obj9).c;
                    if (kiqVar2 == null) {
                        yks.c("viewModel");
                    } else {
                        kiqVar = kiqVar2;
                    }
                    kff.g(yjkVar5, kiqVar, this.a, baoVar9, 64);
                }
                break;
            case 9:
                bao baoVar10 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar10.K()) {
                    baoVar10.t();
                } else {
                    ((jhl) this.b).i((wfo) this.c, ((kuj) this.a).b, baoVar10, 0);
                }
                break;
            case 10:
                bao baoVar11 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar11.K()) {
                    baoVar11.t();
                } else {
                    Object obj11 = this.a;
                    bdn bdnVar2 = (bdn) this.b;
                    jwq.a((wqo) ((jxa) obj11).h().get(bdnVar2.e()), zi.a(bkp.g, 1.0f), ((sj) this.c.get(bdnVar2.e())).c() > 0, 0L, baoVar11, 48);
                }
                break;
            case 11:
                bao baoVar12 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar12.K()) {
                    baoVar12.t();
                } else {
                    jxa jxaVar = (jxa) this.a;
                    bdn bdnVar3 = (bdn) this.b;
                    if (((wqo) jxaVar.h().get(bdnVar3.e())).c == 12) {
                        bkm bkmVar2 = bkp.g;
                        yy yyVar = jww.a;
                        bkpVarO = wv.o(bkmVar2, jww.e);
                    } else {
                        bkpVarO = bkp.g;
                    }
                    jwq.b((wqq) jxaVar.a.a(), (((wqo) jxaVar.h().get(bdnVar3.e())).c == 5 ? 1 : 0) ^ 1, this.c, bkpVarO, baoVar12, 0);
                }
                break;
            case 12:
                bao baoVar13 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar13.K()) {
                    baoVar13.t();
                } else {
                    ?? r43 = this.b;
                    bdn bdnVar4 = (bdn) r43;
                    baoVar13.v(-389966526, Integer.valueOf(bdnVar4.e()));
                    kdj kdjVar = (kdj) baoVar13.f(jab.a);
                    yy yyVar2 = jww.a;
                    Object obj12 = this.a;
                    wqo wqoVar = (wqo) ((jxa) obj12).h().get(bdnVar4.e());
                    wqoVar.getClass();
                    int i3 = wqoVar.c;
                    kdjVar.d(i3 == 8 ? 247781 : i3 == 12 ? 247779 : i3 == 6 ? 247778 : i3 == 7 ? 247784 : i3 == 9 ? 247782 : i3 == 10 ? 247783 : i3 == 11 ? 247780 : 247777, bga.k(-1776625243, new jwy(obj12, (bcb) r43, this.c, 0), baoVar13), baoVar13, 48);
                    baoVar13.n();
                }
                break;
            case 13:
                bao baoVar14 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar14.K()) {
                    baoVar14.t();
                } else {
                    og.w(null, aep.a(8.0f), null, null, bga.k(1887433825, new jyn((cfy) this.a, (Context) this.b, this.c), baoVar14), baoVar14, 196608, 29);
                }
                break;
            default:
                bao baoVar15 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar15.K()) {
                    baoVar15.t();
                } else {
                    ?? r1 = this.c;
                    khp khpVar = khp.a;
                    float fFloatValue = ((Number) r1.a()).floatValue();
                    baoVar15.x(-1633490746);
                    Object obj13 = this.b;
                    Object obj14 = this.a;
                    Object objG5 = baoVar15.g();
                    if (objG5 == ban.a) {
                        objG5 = new jzu(obj13, obj14, i, 0 == true ? 1 : 0);
                        baoVar15.A(objG5);
                    }
                    baoVar15.p();
                    khpVar.b(fFloatValue, (yjv) objG5, null, baoVar15, 48);
                }
                break;
        }
        return ygi.a;
    }

    public ano(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public ano(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.d = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public ano(Object obj, Object obj2, Object obj3, int i, short[] sArr) {
        this.d = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }
}
