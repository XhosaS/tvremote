package defpackage;

import android.support.v7.appcompat.R;
import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqo {
    public static final yy a = new za(24.0f, 24.0f, 24.0f, 24.0f);
    public static final yy b = wv.t(0.0f, 0.0f, 0.0f, 16.0f, 7);
    public static final yy c = wv.t(0.0f, 0.0f, 0.0f, 16.0f, 7);
    public static final yy d = wv.t(0.0f, 0.0f, 0.0f, 24.0f, 7);
    private static final bcp e = new bbl(bcz.c, new anu(11));

    public static final void a(yjk yjkVar, yjz yjzVar, bkp bkpVar, yjz yjzVar2, yjz yjzVar3, yjz yjzVar4, yjz yjzVar5, bol bolVar, long j, long j2, long j3, long j4, float f, cns cnsVar, bao baoVar, int i, int i2) {
        int i3;
        yjz yjzVar6;
        yjz yjzVar7;
        yjz yjzVar8;
        bol bolVar2;
        int i4;
        float f2;
        cns cnsVar2;
        int i5 = i & 6;
        bao baoVarD = baoVar.d(-867616355);
        if (i5 == 0) {
            i3 = (true != baoVarD.H(yjkVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            yjzVar6 = yjzVar;
            i3 |= true != baoVarD.H(yjzVar6) ? 16 : 32;
        } else {
            yjzVar6 = yjzVar;
        }
        if ((i & 384) == 0) {
            i3 |= true != baoVarD.F(bkpVar) ? 128 : 256;
        }
        int i6 = i & 3072;
        int i7 = RecyclerView.ItemAnimator.FLAG_MOVED;
        if (i6 == 0) {
            i3 |= true != baoVarD.H(yjzVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != baoVarD.H(yjzVar3) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            yjzVar7 = yjzVar4;
            i3 |= true != baoVarD.H(yjzVar7) ? 65536 : 131072;
        } else {
            yjzVar7 = yjzVar4;
        }
        if ((1572864 & i) == 0) {
            yjzVar8 = yjzVar5;
            i3 |= true != baoVarD.H(yjzVar8) ? 524288 : 1048576;
        } else {
            yjzVar8 = yjzVar5;
        }
        if ((12582912 & i) == 0) {
            bolVar2 = bolVar;
            i3 |= true != baoVarD.F(bolVar2) ? 4194304 : 8388608;
        } else {
            bolVar2 = bolVar;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != baoVarD.E(j) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != baoVarD.E(j2) ? 268435456 : 536870912;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != baoVarD.E(j3) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != baoVarD.E(j4) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            f2 = f;
            i4 |= true != baoVarD.C(f2) ? 128 : 256;
        } else {
            f2 = f;
        }
        if ((i2 & 3072) == 0) {
            cnsVar2 = cnsVar;
            if (true != baoVarD.F(cnsVar2)) {
                i7 = 1024;
            }
            i4 |= i7;
        } else {
            cnsVar2 = cnsVar;
        }
        int i8 = i4;
        if (baoVarD.L(((306783379 & i3) == 306783378 && (i8 & 1171) == 1170) ? false : true, i3 & 1)) {
            b(yjkVar, bkpVar, cnsVar2, bga.k(527420759, new aqn(yjzVar3, yjzVar7, yjzVar8, bolVar2, j, f2, j2, j3, j4, yjzVar2, yjzVar6), baoVarD), baoVarD, (i3 & 14) | 3072 | ((i3 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i8 >> 3) & 896));
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new aqp(yjkVar, yjzVar, bkpVar, yjzVar2, yjzVar3, yjzVar4, yjzVar5, bolVar, j, j2, j3, j4, f, cnsVar, i, i2, 1);
        }
    }

    public static final void b(yjk yjkVar, bkp bkpVar, cns cnsVar, yjz yjzVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(24925658);
        if (i3 == 0) {
            i2 = (true != baoVarD.H(yjkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(cnsVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if (baoVarD.L((i2 & 1171) != 1170, i2 & 1)) {
            ((art) baoVarD.f(e)).a(new aqx(yjkVar, bkpVar, cnsVar, yjzVar), baoVarD, 0);
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new ahm(yjkVar, bkpVar, cnsVar, yjzVar, i, 2);
        }
    }

    public static final void c(final yjz yjzVar, bkp bkpVar, final yjz yjzVar2, final yjz yjzVar3, final yjz yjzVar4, final bol bolVar, final long j, final float f, final long j2, final long j3, final long j4, final long j5, bao baoVar, final int i, final int i2) {
        int i3;
        yjz yjzVar5;
        int i4;
        final bkp bkpVar2;
        bao baoVarD = baoVar.d(1378716401);
        if ((i & 6) == 0) {
            i3 = (true != baoVarD.H(yjzVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i3 | 48;
        if ((i & 384) == 0) {
            yjzVar5 = yjzVar2;
            i5 |= true != baoVarD.H(yjzVar5) ? 128 : 256;
        } else {
            yjzVar5 = yjzVar2;
        }
        if ((i & 3072) == 0) {
            i5 |= true != baoVarD.H(yjzVar3) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i & 24576) == 0) {
            i5 |= true != baoVarD.H(yjzVar4) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i5 |= true != baoVarD.F(bolVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i5 |= true != baoVarD.E(j) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i5 |= true != baoVarD.C(f) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i5 |= true != baoVarD.E(j2) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i5 |= true != baoVarD.E(j3) ? 268435456 : 536870912;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != baoVarD.E(j4) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != baoVarD.E(j5) ? 16 : 32;
        }
        if (baoVarD.L(((306783379 & i5) == 306783378 && (i4 & 19) == 18) ? false : true, i5 & 1)) {
            bkpVar2 = bkp.g;
            awq.c(bkpVar2, bolVar, j, 0L, f, 0.0f, bga.k(-652798794, new aqm(yjzVar5, yjzVar3, yjzVar4, j3, j4, j5, j2, yjzVar), baoVarD), baoVarD, R.styleable.AppCompatTheme_textAppearanceListItemSecondary);
        } else {
            baoVarD.t();
            bkpVar2 = bkpVar;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new yjz() { // from class: aql
                @Override // defpackage.yjz
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    yjz yjzVar6 = yjzVar;
                    bkp bkpVar3 = bkpVar2;
                    yjz yjzVar7 = yjzVar2;
                    yjz yjzVar8 = yjzVar3;
                    yjz yjzVar9 = yjzVar4;
                    bol bolVar2 = bolVar;
                    long j6 = j;
                    float f2 = f;
                    long j7 = j2;
                    long j8 = j3;
                    int i6 = i;
                    long j9 = j4;
                    int iN = bdi.n(i6 | 1);
                    int iN2 = bdi.n(i2);
                    aqo.c(yjzVar6, bkpVar3, yjzVar7, yjzVar8, yjzVar9, bolVar2, j6, f2, j7, j8, j9, j5, (bao) obj, iN, iN2);
                    return ygi.a;
                }
            };
        }
    }

    public static final void d(yjz yjzVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-917637668);
        if (i3 == 0) {
            i2 = (true != baoVarD.C(8.0f) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.C(12.0f) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 128 : 256;
        }
        if (baoVarD.L((i2 & 147) != 146, i2 & 1)) {
            boolean z = (i2 & 14) == 4;
            boolean z2 = (i2 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32;
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if ((z2 | z) || objT == ban.a) {
                objT = new xn(4);
                basVar.ae(objT);
            }
            bvt bvtVar = (bvt) objT;
            bkm bkmVar = bkp.g;
            int iO = zy.o(baoVarD);
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkmVar);
            int i4 = ((((i2 >> 6) & 14) << 6) & 896) | 6;
            yjk yjkVar = bxt.a;
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVar, bxt.d);
            beb.a(baoVarD, bhuVarAi, bxt.c);
            yjz yjzVar2 = bxt.e;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iO))) {
                Integer numValueOf = Integer.valueOf(iO);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar2);
            }
            beb.a(baoVarD, bkpVarC, bxt.b);
            yjzVar.a(baoVarD, Integer.valueOf((i4 >> 6) & 14));
            baoVarD.o();
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new nu(yjzVar, i, 8);
        }
    }
}
