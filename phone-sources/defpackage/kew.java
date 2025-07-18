package defpackage;

import android.support.v7.appcompat.R;
import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kew {
    public static final kew a = new kew();

    private kew() {
    }

    public final void a(String str, yjk yjkVar, boolean z, yjk yjkVar2, bao baoVar, int i) {
        String str2;
        int i2;
        yjk yjkVar3;
        yjk yjkVar4;
        bas basVar;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(791891515);
        if (i3 == 0) {
            str2 = str;
            i2 = (true != baoVarD.F(str2) ? 2 : 4) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            yjkVar3 = yjkVar;
            i2 |= true != baoVarD.H(yjkVar3) ? 16 : 32;
        } else {
            yjkVar3 = yjkVar;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.G(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            yjkVar4 = yjkVar2;
            i2 |= true != baoVarD.H(yjkVar4) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        } else {
            yjkVar4 = yjkVar2;
        }
        if ((i2 & 1171) == 1170 && baoVarD.K()) {
            baoVarD.t();
        } else {
            bkh bkhVar = bkb.n;
            bkm bkmVar = bkp.g;
            bvt bvtVarA = zf.a(xk.a, bkhVar, baoVarD, 48);
            int iK = a.k(zy.p(baoVarD));
            bas basVar2 = (bas) baoVarD;
            bhu bhuVarAi = basVar2.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkmVar);
            yjk yjkVar5 = bxt.a;
            baoVarD.z();
            if (basVar2.w) {
                baoVarD.k(yjkVar5);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA, bxt.d);
            beb.a(baoVarD, bhuVarAi, bxt.c);
            yjz yjzVar = bxt.e;
            if (basVar2.w || !yks.e(basVar2.T(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                basVar2.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar);
            }
            beb.a(baoVarD, bkpVarC, bxt.b);
            baoVarD.x(451168301);
            if (ylh.L(str2)) {
                basVar = basVar2;
            } else {
                basVar = basVar2;
                rdd.C(yjkVar3, null, false, null, null, null, kep.c, baoVarD, ((i2 >> 3) & 14) | 1572864, 62);
            }
            basVar.aa();
            baoVarD.x(451179205);
            if (z) {
                rdd.C(yjkVar4, null, false, null, null, null, kep.d, baoVarD, ((i2 >> 9) & 14) | 1572864, 62);
            }
            basVar.aa();
            baoVarD.o();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kes(this, str2, yjkVar, z, yjkVar2, i, 0);
        }
    }

    public final void b(String str, yjv yjvVar, yjv yjvVar2, yjk yjkVar, boolean z, yjk yjkVar2, bkp bkpVar, bao baoVar, int i) {
        String str2;
        int i2;
        boolean z2;
        long j;
        long j2;
        bkp bkpVar2;
        str.getClass();
        yjvVar.getClass();
        yjvVar2.getClass();
        yjkVar.getClass();
        yjkVar2.getClass();
        bao baoVarD = baoVar.d(-1527890866);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (true != baoVarD.F(str2) ? 2 : 4) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjvVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.H(yjvVar2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.H(yjkVar) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i & 24576) == 0) {
            z2 = z;
            i2 |= true != baoVarD.G(z2) ? 8192 : 16384;
        } else {
            z2 = z;
        }
        if ((196608 & i) == 0) {
            i2 |= true != baoVarD.H(yjkVar2) ? 65536 : 131072;
        }
        int i3 = i2 | 1572864;
        if ((599187 & i3) == 599186 && baoVarD.K()) {
            baoVarD.t();
            bkpVar2 = bkpVar;
        } else {
            bkm bkmVar = bkp.g;
            cdv cdvVar = (cdv) baoVarD.f(ccq.n);
            int length = str2.length();
            long jN = ccf.N(length, length);
            long j3 = chb.a;
            aid aidVarO = hu.O(str2, jN, baoVarD, i3 & 14, 0);
            float f = aun.a;
            auo auoVar = auo.a;
            np npVarF = wv.F(3, baoVarD);
            np npVarF2 = wv.F(1, baoVarD);
            Object[] objArr = {auoVar, npVarF, npVarF2};
            bii biiVarBK = a.bK(new xb(7), new ars(npVarF, 11));
            boolean zD = baoVarD.D(auoVar.ordinal()) | baoVarD.H(npVarF) | baoVarD.H(npVarF2);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            int i4 = 19;
            if (zD || objT == ban.a) {
                objT = new qm(auoVar, npVarF, i4, null);
                basVar.ae(objT);
            }
            cvi cviVar = (cvi) bga.o(objArr, biiVarBK, (yjk) objT, baoVarD, 0, 4);
            baoVarD.x(1849434622);
            Object objT2 = basVar.T();
            Object obj = ban.a;
            if (objT2 == obj) {
                objT2 = new bml();
                basVar.ae(objT2);
            }
            bml bmlVar = (bml) objT2;
            basVar.aa();
            por porVar = por.a;
            baoVarD.x(5004770);
            int i5 = i3 & 896;
            Object objT3 = basVar.T();
            if (i5 == 256 || objT3 == obj) {
                objT3 = new kah(yjvVar2, 5);
                basVar.ae(objT3);
            }
            yjv yjvVar3 = (yjv) objT3;
            basVar.aa();
            bkp bkpVarW = wv.w(d.Q(bkmVar, bmlVar), 0.0f, 4.0f, 1);
            yjz yjzVar = kep.a;
            bhq bhqVarK = bga.k(-931294797, new azg(yjkVar, 13), baoVarD);
            bhq bhqVarK2 = bga.k(-1932350668, new kev(str, aidVarO, z2, yjkVar2, 0), baoVarD);
            baoVarD.x(-231149431);
            long jR = rdd.R(18, baoVarD);
            long jR2 = rdd.R(18, baoVarD);
            long jR3 = rdd.R(18, baoVarD);
            long jK = bny.k(bnq.d(jR3), bnq.c(jR3), bnq.b(jR3), 0.38f, bnq.f(jR3));
            long jR4 = rdd.R(18, baoVarD);
            long j4 = bnq.f;
            long jR5 = rdd.R(26, baoVarD);
            long jR6 = rdd.R(2, baoVarD);
            bcp bcpVar = anl.a;
            ank ankVar = (ank) baoVarD.f(bcpVar);
            long jR7 = rdd.R(26, baoVarD);
            long jR8 = rdd.R(24, baoVarD);
            long jR9 = rdd.R(18, baoVarD);
            long jK2 = bny.k(bnq.d(jR9), bnq.c(jR9), bnq.b(jR9), 0.12f, bnq.f(jR9));
            long jR10 = rdd.R(2, baoVarD);
            long jR11 = rdd.R(19, baoVarD);
            long jR12 = rdd.R(19, baoVarD);
            long jR13 = rdd.R(18, baoVarD);
            long jK3 = bny.k(bnq.d(jR13), bnq.c(jR13), bnq.b(jR13), 0.38f, bnq.f(jR13));
            long jR14 = rdd.R(19, baoVarD);
            long jR15 = rdd.R(19, baoVarD);
            long jR16 = rdd.R(19, baoVarD);
            long jR17 = rdd.R(18, baoVarD);
            long jK4 = bny.k(bnq.d(jR17), bnq.c(jR17), bnq.b(jR17), 0.38f, bnq.f(jR17));
            long jR18 = rdd.R(2, baoVarD);
            long jR19 = rdd.R(26, baoVarD);
            long jR20 = rdd.R(19, baoVarD);
            long jR21 = rdd.R(18, baoVarD);
            long jK5 = bny.k(bnq.d(jR21), bnq.c(jR21), bnq.b(jR21), 0.38f, bnq.f(jR21));
            long jR22 = rdd.R(2, baoVarD);
            long jR23 = rdd.R(19, baoVarD);
            long jR24 = rdd.R(19, baoVarD);
            long jR25 = rdd.R(18, baoVarD);
            long jK6 = bny.k(bnq.d(jR25), bnq.c(jR25), bnq.b(jR25), 0.38f, bnq.f(jR25));
            long jR26 = rdd.R(19, baoVarD);
            long jR27 = rdd.R(19, baoVarD);
            long jR28 = rdd.R(19, baoVarD);
            long jR29 = rdd.R(18, baoVarD);
            long jK7 = bny.k(bnq.d(jR29), bnq.c(jR29), bnq.b(jR29), 0.38f, bnq.f(jR29));
            long jR30 = rdd.R(2, baoVarD);
            long jR31 = rdd.R(19, baoVarD);
            long jR32 = rdd.R(19, baoVarD);
            long jR33 = rdd.R(19, baoVarD);
            long jK8 = bny.k(bnq.d(jR33), bnq.c(jR33), bnq.b(jR33), 0.38f, bnq.f(jR33));
            long jR34 = rdd.R(19, baoVarD);
            long jR35 = rdd.R(19, baoVarD);
            long jR36 = rdd.R(19, baoVarD);
            long jR37 = rdd.R(19, baoVarD);
            long jK9 = bny.k(bnq.d(jR37), bnq.c(jR37), bnq.b(jR37), 0.38f, bnq.f(jR37));
            long jR38 = rdd.R(19, baoVarD);
            arl arlVarK = wv.K(baoVarD);
            awu awuVar = arlVarK.ag;
            if (awuVar == null) {
                baoVarD.x(390452338);
                basVar.aa();
                j = jK9;
                awuVar = null;
            } else {
                baoVarD.x(390452339);
                ank ankVar2 = (ank) baoVarD.f(bcpVar);
                j = jK9;
                if (!yks.e(awuVar.h, ankVar2)) {
                    awu awuVarA = awuVar.a(awuVar.a, awuVar.b, awuVar.c, awuVar.D, awuVar.d, awuVar.e, awuVar.f, awuVar.E, awuVar.g, awuVar.F, ankVar2, awuVar.G, awuVar.H, awuVar.I, awuVar.J, awuVar.i, awuVar.j, awuVar.k, awuVar.K, awuVar.l, awuVar.m, awuVar.n, awuVar.L, awuVar.o, awuVar.p, awuVar.q, awuVar.M, awuVar.r, awuVar.s, awuVar.t, awuVar.N, awuVar.u, awuVar.v, awuVar.w, awuVar.O, awuVar.x, awuVar.y, awuVar.z, awuVar.P, awuVar.A, awuVar.B, awuVar.C, awuVar.Q);
                    arlVarK.ag = awuVarA;
                    awuVar = awuVarA;
                }
                basVar.aa();
            }
            if (awuVar == null) {
                baoVarD.x(-1788321191);
                j2 = j4;
                long jE = arm.e(arlVarK, 18);
                long jE2 = arm.e(arlVarK, 18);
                long jE3 = arm.e(arlVarK, 18);
                long jK10 = bny.k(bnq.d(jE3), bnq.c(jE3), bnq.b(jE3), 0.38f, bnq.f(jE3));
                long jE4 = arm.e(arlVarK, 18);
                long jE5 = arm.e(arlVarK, 26);
                long jE6 = arm.e(arlVarK, 2);
                ank ankVar3 = (ank) baoVarD.f(bcpVar);
                long jE7 = arm.e(arlVarK, 26);
                long jE8 = arm.e(arlVarK, 24);
                long jE9 = arm.e(arlVarK, 18);
                long jK11 = bny.k(bnq.d(jE9), bnq.c(jE9), bnq.b(jE9), 0.12f, bnq.f(jE9));
                long jE10 = arm.e(arlVarK, 2);
                long jE11 = arm.e(arlVarK, 19);
                long jE12 = arm.e(arlVarK, 19);
                long jE13 = arm.e(arlVarK, 18);
                long jK12 = bny.k(bnq.d(jE13), bnq.c(jE13), bnq.b(jE13), 0.38f, bnq.f(jE13));
                long jE14 = arm.e(arlVarK, 19);
                long jE15 = arm.e(arlVarK, 19);
                long jE16 = arm.e(arlVarK, 19);
                long jE17 = arm.e(arlVarK, 18);
                long jK13 = bny.k(bnq.d(jE17), bnq.c(jE17), bnq.b(jE17), 0.38f, bnq.f(jE17));
                long jE18 = arm.e(arlVarK, 2);
                long jE19 = arm.e(arlVarK, 26);
                long jE20 = arm.e(arlVarK, 19);
                long jE21 = arm.e(arlVarK, 18);
                long jK14 = bny.k(bnq.d(jE21), bnq.c(jE21), bnq.b(jE21), 0.38f, bnq.f(jE21));
                long jE22 = arm.e(arlVarK, 2);
                long jE23 = arm.e(arlVarK, 19);
                long jE24 = arm.e(arlVarK, 19);
                long jE25 = arm.e(arlVarK, 18);
                long jK15 = bny.k(bnq.d(jE25), bnq.c(jE25), bnq.b(jE25), 0.38f, bnq.f(jE25));
                long jE26 = arm.e(arlVarK, 19);
                long jE27 = arm.e(arlVarK, 19);
                long jE28 = arm.e(arlVarK, 19);
                long jE29 = arm.e(arlVarK, 18);
                long jK16 = bny.k(bnq.d(jE29), bnq.c(jE29), bnq.b(jE29), 0.38f, bnq.f(jE29));
                long jE30 = arm.e(arlVarK, 2);
                long jE31 = arm.e(arlVarK, 19);
                long jE32 = arm.e(arlVarK, 19);
                long jE33 = arm.e(arlVarK, 19);
                long jK17 = bny.k(bnq.d(jE33), bnq.c(jE33), bnq.b(jE33), 0.38f, bnq.f(jE33));
                long jE34 = arm.e(arlVarK, 19);
                long jE35 = arm.e(arlVarK, 19);
                long jE36 = arm.e(arlVarK, 19);
                long jE37 = arm.e(arlVarK, 19);
                awuVar = new awu(jE, jE2, jK10, jE4, j2, j2, j2, j2, jE5, jE6, ankVar3, jE7, jE8, jK11, jE10, jE11, jE12, jK12, jE14, jE15, jE16, jK13, jE18, jE19, jE20, jK14, jE22, jE23, jE24, jK15, jE26, jE27, jE28, jK16, jE30, jE31, jE32, jK17, jE34, jE35, jE36, bny.k(bnq.d(jE37), bnq.c(jE37), bnq.b(jE37), 0.38f, bnq.f(jE37)), arm.e(arlVarK, 19));
                arlVarK.ag = awuVar;
                basVar.aa();
            } else {
                j2 = j4;
                baoVarD.x(-1788515437);
                basVar.aa();
            }
            awu awuVarA2 = awuVar.a(jR, jR2, jK, jR4, j2, j2, j2, j2, jR5, jR6, ankVar, jR7, jR8, jK2, jR10, jR11, jR12, jK3, jR14, jR15, jR16, jK4, jR18, jR19, jR20, jK5, jR22, jR23, jR24, jK6, jR26, jR27, jR28, jK7, jR30, jR31, jR32, jK8, jR34, jR35, jR36, j, jR38);
            basVar.aa();
            porVar.b(aidVarO, cviVar, yjvVar3, bkpVarW, false, null, yjzVar, bhqVarK, bhqVarK2, null, null, awuVarA2, baoVarD, 918552576, 0);
            baoVarD = baoVarD;
            baoVarD.x(-1633490746);
            boolean zF = baoVarD.F(cdvVar);
            Object objT4 = basVar.T();
            if (zF || objT4 == obj) {
                objT4 = new kbl(cdvVar, bmlVar, (yih) null, 5);
                basVar.ae(objT4);
            }
            basVar.aa();
            bbn.f(cdvVar, (yjz) objT4, baoVarD);
            ygi ygiVar = ygi.a;
            baoVarD.x(-1633490746);
            boolean zF2 = baoVarD.F(aidVarO) | ((i3 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32);
            Object objT5 = basVar.T();
            if (zF2 || objT5 == obj) {
                objT5 = new kbl(aidVarO, yjvVar, (yih) null, 6);
                basVar.ae(objT5);
            }
            basVar.aa();
            bbn.f(ygiVar, (yjz) objT5, baoVarD);
            bkpVar2 = bkmVar;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new ket(this, str, yjvVar, yjvVar2, yjkVar, z, yjkVar2, bkpVar2, i, 0);
        }
    }

    public final void c(bkp bkpVar, bao baoVar, int i) {
        bkp bkpVar2;
        bao baoVar2;
        int i2 = i | 6;
        int i3 = i2 & 3;
        bao baoVarD = baoVar.d(1387098494);
        if (i3 == 2 && baoVarD.K()) {
            baoVarD.t();
            bkpVar2 = bkpVar;
            baoVar2 = baoVarD;
        } else {
            bkpVar2 = bkp.g;
            baoVar2 = baoVarD;
            axa.b(ccf.w(com.google.android.videos.R.string.search_hint_text, baoVarD), bkpVar2, wv.K(baoVarD).A, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wv.N(baoVarD).j, baoVar2, (i2 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 0, 131064);
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new key(this, bkpVar2, i, 1);
        }
    }
}
