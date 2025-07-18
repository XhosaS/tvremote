package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.foundation.layout.UnspecifiedConstraintsElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awh implements yjz {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public awh(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r1v101, types: [bdy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v115, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r1v55, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v81, types: [java.lang.Object, yka] */
    /* JADX WARN: Type inference failed for: r1v86, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, yy] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r2v82, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, yka] */
    /* JADX WARN: Type inference failed for: r3v44, types: [dxd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v46, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r3v80, types: [bsb, java.lang.Object] */
    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = 16;
        ygi ygiVar = null;
        int i2 = 0;
        int i3 = 2;
        switch (this.c) {
            case 0:
                bao baoVar = (bao) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (baoVar.L((iIntValue & 3) != 2, iIntValue & 1)) {
                    ?? r2 = this.a;
                    bkp bkpVarP = bty.p("LeadingButton");
                    bkd bkdVar = bkb.e;
                    bvt bvtVarA = xo.a(bkdVar, false);
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
                    yjz yjzVar = bxt.d;
                    beb.a(baoVar, bvtVarA, yjzVar);
                    yjz yjzVar2 = bxt.c;
                    beb.a(baoVar, bhuVarO, yjzVar2);
                    yjz yjzVar3 = bxt.e;
                    if (baoVar.J() || !yks.e(baoVar.g(), Integer.valueOf(iO))) {
                        Integer numValueOf = Integer.valueOf(iO);
                        baoVar.A(numValueOf);
                        baoVar.i(numValueOf, yjzVar3);
                    }
                    yjz yjzVar4 = bxt.b;
                    beb.a(baoVar, bkpVarC, yjzVar4);
                    r2.a(baoVar, 0);
                    baoVar.o();
                    ?? r22 = this.b;
                    bkp bkpVarP2 = bty.p("TrailingButton");
                    bvt bvtVarA2 = xo.a(bkdVar, false);
                    int iO2 = zy.o(baoVar);
                    bhu bhuVarO2 = baoVar.O();
                    bkp bkpVarC2 = bdi.C(baoVar, bkpVarP2);
                    baoVar.c();
                    baoVar.z();
                    if (baoVar.J()) {
                        baoVar.k(yjkVar);
                    } else {
                        baoVar.B();
                    }
                    beb.a(baoVar, bvtVarA2, yjzVar);
                    beb.a(baoVar, bhuVarO2, yjzVar2);
                    if (baoVar.J() || !yks.e(baoVar.g(), Integer.valueOf(iO2))) {
                        Integer numValueOf2 = Integer.valueOf(iO2);
                        baoVar.A(numValueOf2);
                        baoVar.i(numValueOf2, yjzVar3);
                    }
                    beb.a(baoVar, bkpVarC2, yjzVar4);
                    r22.a(baoVar, 0);
                    baoVar.o();
                } else {
                    baoVar.t();
                }
                return ygi.a;
            case 1:
                bao baoVar2 = (bao) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (baoVar2.L((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    bkp bkpVarO = wv.o(new UnspecifiedConstraintsElement(awg.b, awg.c), this.a);
                    ?? r3 = this.b;
                    bvt bvtVarA3 = zf.a(xk.e, bkb.n, baoVar2, 54);
                    int iO3 = zy.o(baoVar2);
                    bhu bhuVarO3 = baoVar2.O();
                    bkp bkpVarC3 = bdi.C(baoVar2, bkpVarO);
                    yjk yjkVar2 = bxt.a;
                    baoVar2.c();
                    baoVar2.z();
                    if (baoVar2.J()) {
                        baoVar2.k(yjkVar2);
                    } else {
                        baoVar2.B();
                    }
                    beb.a(baoVar2, bvtVarA3, bxt.d);
                    beb.a(baoVar2, bhuVarO3, bxt.c);
                    yjz yjzVar5 = bxt.e;
                    if (baoVar2.J() || !yks.e(baoVar2.g(), Integer.valueOf(iO3))) {
                        Integer numValueOf3 = Integer.valueOf(iO3);
                        baoVar2.A(numValueOf3);
                        baoVar2.i(numValueOf3, yjzVar5);
                    }
                    beb.a(baoVar2, bkpVarC3, bxt.b);
                    r3.a(zh.a, baoVar2, 6);
                    baoVar2.o();
                } else {
                    baoVar2.t();
                }
                return ygi.a;
            case 2:
                bao baoVar3 = (bao) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (baoVar3.L((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    cls.a((String) this.a, (String) this.b, baoVar3, new Object[0]);
                } else {
                    baoVar3.t();
                }
                return ygi.a;
            case 3:
                bao baoVar4 = (bao) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (baoVar4.L((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    Object obj3 = this.b;
                    yjz yjzVar6 = clt.a;
                    boolean zH = baoVar4.H(obj3);
                    Object obj4 = this.a;
                    Object objG = baoVar4.g();
                    if (zH || objG == ban.a) {
                        objG = new aye(obj4, obj3, 5, 0 == true ? 1 : 0);
                        baoVar4.A(objG);
                    }
                    kv.F(yjzVar6, (yjk) objG, null, null, 0L, 0L, null, baoVar4, 6);
                } else {
                    baoVar4.t();
                }
                return ygi.a;
            case 4:
                bao baoVar5 = (bao) obj;
                if ((3 & ((Number) obj2).intValue()) == 2 && baoVar5.K()) {
                    baoVar5.t();
                } else {
                    Object objG2 = baoVar5.g();
                    Object obj5 = ban.a;
                    if (objG2 == obj5) {
                        bci bciVar = new bci(new cmc(0L), bcz.c);
                        baoVar5.A(bciVar);
                        objG2 = bciVar;
                    }
                    Object obj6 = this.b;
                    bcb bcbVar = (bcb) objG2;
                    boolean zH2 = baoVar5.H(obj6);
                    Object obj7 = this.a;
                    boolean zH3 = zH2 | baoVar5.H(obj7);
                    Object objG3 = baoVar5.g();
                    if (zH3 || objG3 == obj5) {
                        objG3 = new dkg((dki) obj6, (Context) obj7, bcbVar, (yih) null, 0);
                        baoVar5.A(objG3);
                    }
                    if (((Boolean) bdi.l(false, (yjz) objG3, baoVar5).a()).booleanValue()) {
                        baoVar5.x(-1541035010);
                        Object objG4 = baoVar5.g();
                        if (objG4 == obj5) {
                            dki dkiVar = (dki) obj6;
                            ysu ysuVar = new ysu(new dkg(dkiVar.a, (Context) obj7, dkiVar.b, (yih) null, 2));
                            baoVar5.A(ysuVar);
                            objG4 = ysuVar;
                        }
                        yjz yjzVar7 = (yjz) a.bT((ysx) objG4, null, null, baoVar5, 2).a();
                        if (yjzVar7 == null) {
                            baoVar5.x(-1540889931);
                            baoVar5.p();
                        } else {
                            baoVar5.x(-1540889930);
                            cwo.g(((dki) obj6).d, ((cmc) bcbVar.a()).a, yjzVar7, baoVar5, 0);
                            baoVar5.p();
                            ygiVar = ygi.a;
                        }
                        if (ygiVar == null) {
                            baoVar5.x(-1296630672);
                            cwm.x(baoVar5, 0);
                            baoVar5.p();
                        } else {
                            baoVar5.x(-1296636252);
                            baoVar5.p();
                        }
                        baoVar5.p();
                    } else {
                        baoVar5.x(-1540810446);
                        cwm.x(baoVar5, 0);
                        baoVar5.p();
                    }
                    boolean zH4 = baoVar5.H(obj6);
                    Object objG5 = baoVar5.g();
                    if (zH4 || objG5 == obj5) {
                        objG5 = new ddd(obj6, i3);
                        baoVar5.A(objG5);
                    }
                    bbn.g((yjk) objG5, baoVar5);
                }
                return ygi.a;
            case 5:
                bao baoVar6 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar6.K()) {
                    baoVar6.t();
                } else {
                    Object obj8 = this.a;
                    bcq[] bcqVarArr = new bcq[4];
                    bcqVarArr[0] = diy.b.c(obj8);
                    Object obj9 = this.b;
                    dki dkiVar2 = (dki) obj9;
                    bcqVarArr[1] = diy.d.c(dkiVar2.b);
                    bcp bcpVar = dko.a;
                    Bundle bundleA = dkiVar2.a();
                    if (bundleA == null) {
                        bundleA = Bundle.EMPTY;
                    }
                    bcqVarArr[2] = bcpVar.c(bundleA);
                    bcqVarArr[3] = diy.c.c(dkiVar2.c());
                    bcm.j(bcqVarArr, bga.k(-1811403166, new awh(obj9, obj8, 4, null), baoVar6), baoVar6, 56);
                }
                return ygi.a;
            case 6:
                bao baoVar7 = (bao) obj;
                if ((3 & ((Number) obj2).intValue()) == 2 && baoVar7.K()) {
                    baoVar7.t();
                } else {
                    ?? r1 = this.b;
                    Object obj10 = this.a;
                    for (Object obj11 : r1) {
                        int i4 = i2 + 1;
                        if (i2 < 0) {
                            yfm.w();
                        }
                        yfw yfwVar = (yfw) obj11;
                        Long l = (Long) yfwVar.a;
                        yka ykaVar = (yka) yfwVar.b;
                        if (l != null && l.longValue() == Long.MIN_VALUE) {
                            l = null;
                        }
                        long jLongValue = l != null ? l.longValue() : (-4611686018427387904L) - i2;
                        if (jLongValue == Long.MIN_VALUE) {
                            throw new IllegalStateException("Implicit list item ids exhausted.");
                        }
                        cwr.g(jLongValue, (dro) obj10, bga.k(1419565165, new azg(ykaVar, 2), baoVar7), baoVar7, 384);
                        i2 = i4;
                    }
                }
                return ygi.a;
            case 7:
                bao baoVar8 = (bao) obj;
                if ((3 & ((Number) obj2).intValue()) == 2 && baoVar8.K()) {
                    baoVar8.t();
                } else {
                    ((fyf) this.b).g.a(this.a, baoVar8, 0);
                }
                return ygi.a;
            case 8:
                bao baoVar9 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar9.K()) {
                    baoVar9.t();
                } else {
                    ?? r32 = this.a;
                    bcm.j(new bcq[]{dxm.b(r32), dxf.a.c(r32), ghg.a.c(r32)}, this.b, baoVar9, 8);
                }
                return ygi.a;
            case 9:
                bao baoVar10 = (bao) obj;
                if ((3 & ((Number) obj2).intValue()) == 2 && baoVar10.K()) {
                    baoVar10.t();
                } else {
                    Object obj12 = this.b;
                    fxb fxbVar = ((fwr) obj12).a;
                    fxbVar.getClass();
                    ((fyb) fxbVar).f.a(this.a, obj12, baoVar10, 0);
                }
                return ygi.a;
            case 10:
                bao baoVar11 = (bao) obj;
                if ((3 & ((Number) obj2).intValue()) == 2 && baoVar11.K()) {
                    baoVar11.t();
                } else {
                    Object objF = baoVar11.f(pkp.a);
                    if (objF == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    Object obj13 = this.a;
                    pju pjuVar = (pju) objF;
                    baoVar11.x(-1633490746);
                    boolean zF = baoVar11.F(pjuVar);
                    Object obj14 = ((kdj) obj13).a;
                    boolean zF2 = zF | baoVar11.F(obj14);
                    Object objG6 = baoVar11.g();
                    if (zF2 || objG6 == ban.a) {
                        objG6 = new irc(pjuVar, obj14);
                        baoVar11.A(objG6);
                    }
                    baoVar11.p();
                    this.b.a((irc) objG6, baoVar11, 0);
                }
                return ygi.a;
            case 11:
                bao baoVar12 = (bao) obj;
                if ((3 & ((Number) obj2).intValue()) == 2 && baoVar12.K()) {
                    baoVar12.t();
                } else {
                    jwq.ak((jtr) this.b.a(this.a), baoVar12, 8);
                }
                return ygi.a;
            case 12:
                bao baoVar13 = (bao) obj;
                if ((3 & ((Number) obj2).intValue()) == 2 && baoVar13.K()) {
                    baoVar13.t();
                } else if (yks.e(((kfr) this.b).a, ((jtr) this.a).b)) {
                    jwq.ai(baoVar13, 0);
                }
                return ygi.a;
            case 13:
                bao baoVar14 = (bao) obj;
                if ((3 & ((Number) obj2).intValue()) == 2 && baoVar14.K()) {
                    baoVar14.t();
                } else {
                    jxl.e((String) this.a.a(), (fwv) this.b, baoVar14, 0);
                }
                return ygi.a;
            case 14:
                bao baoVar15 = (bao) obj;
                if ((3 & ((Number) obj2).intValue()) == 2 && baoVar15.K()) {
                    baoVar15.t();
                } else {
                    baoVar15.x(-1633490746);
                    Object obj15 = this.b;
                    boolean zH5 = baoVar15.H(obj15);
                    Object obj16 = this.a;
                    boolean zH6 = zH5 | baoVar15.H(obj16);
                    Object objG7 = baoVar15.g();
                    if (zH6 || objG7 == ban.a) {
                        objG7 = new isg(obj15, obj16, i, 0 == true ? 1 : 0);
                        baoVar15.A(objG7);
                    }
                    baoVar15.p();
                    og.I((yjk) objG7, null, false, null, null, null, jxz.a, baoVar15, 1572864, 62);
                }
                return ygi.a;
            case 15:
                bao baoVar16 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar16.K()) {
                    baoVar16.t();
                } else {
                    og.w(null, aep.a(8.0f), null, null, bga.k(-1776707142, new jym(this.b, (Context) this.a), baoVar16), baoVar16, 196608, 29);
                }
                return ygi.a;
            case 16:
                bao baoVar17 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar17.K()) {
                    baoVar17.t();
                } else {
                    ((kaa) this.b).b(bny.J(this.a), baoVar17, 0);
                }
                return ygi.a;
            case 17:
                bao baoVar18 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar18.K()) {
                    baoVar18.t();
                } else {
                    Object obj17 = this.b;
                    kuw kuwVar = ((kaa) obj17).f;
                    if (kuwVar == null) {
                        yks.c("composeThemeProvider");
                        kuwVar = null;
                    }
                    kuwVar.a(null, null, false, bga.k(520915577, new awh(obj17, this.a, 16, null), baoVar18), baoVar18, 35840, 7);
                }
                return ygi.a;
            case 18:
                bao baoVar19 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar19.K()) {
                    baoVar19.t();
                } else {
                    wsu wsuVar = (wsu) this.b;
                    wsv wsvVar = wsuVar.j;
                    if (wsvVar == null) {
                        wsvVar = wsv.a;
                    }
                    if ((wsvVar.b & 1) != 0) {
                        wsv wsvVar2 = wsuVar.j;
                        if (wsvVar2 == null) {
                            wsvVar2 = wsv.a;
                        }
                        wst wstVar = wsvVar2.c;
                        if (wstVar == null) {
                            wstVar = wst.a;
                        }
                        wstVar.getClass();
                        jyv.c(wstVar, ((kbm) this.a).d, null, baoVar19, 64);
                    }
                }
                return ygi.a;
            case 19:
                bao baoVar20 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar20.K()) {
                    baoVar20.t();
                } else {
                    qtl.Z(this.b, null, false, null, (arb) this.a, null, ken.a, baoVar20, 805306368, 494);
                }
                return ygi.a;
            default:
                bao baoVar21 = (bao) obj;
                if ((3 & ((Number) obj2).intValue()) == 2 && baoVar21.K()) {
                    baoVar21.t();
                } else {
                    qtl.Z(this.b, null, false, null, (arb) this.a, null, ken.b, baoVar21, 805306368, 494);
                }
                return ygi.a;
        }
    }

    public awh(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
