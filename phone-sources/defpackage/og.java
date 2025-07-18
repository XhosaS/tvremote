package defpackage;

import android.support.v7.appcompat.R;
import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class og {
    public static final bol A(bao baoVar) {
        return aur.b(13, baoVar);
    }

    public static final arh B(bao baoVar) {
        return z(wv.K(baoVar));
    }

    public static final arh C(long j, long j2, long j3, long j4, bao baoVar, int i) {
        bao baoVar2;
        long jB;
        long j5 = (i & 1) != 0 ? bnq.g : j;
        if ((i & 2) != 0) {
            baoVar2 = baoVar;
            jB = arm.b(j5, baoVar2);
        } else {
            baoVar2 = baoVar;
            jB = j2;
        }
        long j6 = (i & 4) != 0 ? bnq.g : j3;
        long jK = (i & 8) != 0 ? bny.k(bnq.d(jB), bnq.c(jB), bnq.b(jB), 0.38f, bnq.f(jB)) : j4;
        arh arhVarZ = z(wv.K(baoVar2));
        if (j5 == 16) {
            j5 = arhVarZ.a;
        }
        if (jB == 16) {
            jB = arhVarZ.b;
        }
        if (j6 == 16) {
            j6 = arhVarZ.c;
        }
        if (jK == 16) {
            jK = arhVarZ.d;
        }
        return new arh(j5, jB, j6, jK);
    }

    public static final void D(yjk yjkVar, bkp bkpVar, boolean z, bol bolVar, arb arbVar, yy yyVar, yka ykaVar, bao baoVar, int i) {
        int i2;
        bao baoVar2;
        bkp bkpVar2;
        boolean z2;
        bol bolVar2;
        yy yyVar2;
        bkp bkpVar3;
        boolean z3;
        bol bolVarB;
        yy yyVar3;
        bao baoVarD = baoVar.d(-1061374109);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.H(yjkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 432;
        if ((i & 3072) == 0) {
            i3 = i2 | 1456;
        }
        if ((i & 24576) == 0) {
            i3 |= true != baoVarD.F(arbVar) ? 8192 : 16384;
        }
        int i4 = 115015680 | i3;
        if ((805306368 & i) == 0) {
            i4 |= true != baoVarD.H(ykaVar) ? 268435456 : 536870912;
        }
        if (baoVarD.L((306783379 & i4) != 306783378, i4 & 1)) {
            baoVarD.u();
            if ((i & 1) == 0 || baoVarD.I()) {
                bkm bkmVar = bkp.g;
                yy yyVar4 = arc.a;
                bkpVar3 = bkmVar;
                z3 = true;
                bolVarB = aur.b(7, baoVarD);
                yyVar3 = arc.b;
            } else {
                baoVarD.t();
                bkpVar3 = bkpVar;
                z3 = z;
                bolVarB = bolVar;
                yyVar3 = yyVar;
            }
            baoVarD.m();
            baoVar2 = baoVarD;
            M(yjkVar, bkpVar3, z3, bolVarB, arbVar, null, null, yyVar3, null, ykaVar, baoVar2, i4 & 2147476478, 0);
            bkpVar2 = bkpVar3;
            z2 = z3;
            bolVar2 = bolVarB;
            yyVar2 = yyVar3;
        } else {
            baoVar2 = baoVarD;
            baoVar2.t();
            bkpVar2 = bkpVar;
            z2 = z;
            bolVar2 = bolVar;
            yyVar2 = yyVar;
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new arf(yjkVar, bkpVar2, z2, bolVar2, arbVar, yyVar2, ykaVar, i, 0);
        }
    }

    public static final void E(yjk yjkVar, yjz yjzVar, bkp bkpVar, yjz yjzVar2, yjz yjzVar3, yjz yjzVar4, yjz yjzVar5, bol bolVar, long j, long j2, long j3, long j4, float f, cns cnsVar, bao baoVar, int i, int i2) {
        yjk yjkVar2;
        int i3;
        yjz yjzVar6;
        bkp bkpVar2;
        yjz yjzVar7;
        bol bolVar2;
        int i4;
        float f2;
        cns cnsVar2;
        bao baoVar2;
        int i5 = i & 6;
        bao baoVarD = baoVar.d(94478519);
        if (i5 == 0) {
            yjkVar2 = yjkVar;
            i3 = (true != baoVarD.H(yjkVar2) ? 2 : 4) | i;
        } else {
            yjkVar2 = yjkVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            yjzVar6 = yjzVar;
            i3 |= true != baoVarD.H(yjzVar6) ? 16 : 32;
        } else {
            yjzVar6 = yjzVar;
        }
        if ((i & 384) == 0) {
            bkpVar2 = bkpVar;
            i3 |= true != baoVarD.F(bkpVar2) ? 128 : 256;
        } else {
            bkpVar2 = bkpVar;
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
            i3 |= true != baoVarD.H(yjzVar4) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            yjzVar7 = yjzVar5;
            i3 |= true != baoVarD.H(yjzVar7) ? 524288 : 1048576;
        } else {
            yjzVar7 = yjzVar5;
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
        if (baoVarD.L(((306783379 & i3) == 306783378 && (i4 & 1171) == 1170) ? false : true, i3 & 1)) {
            baoVarD.u();
            if ((i & 1) != 0 && !baoVarD.I()) {
                baoVarD.t();
            }
            baoVarD.m();
            baoVar2 = baoVarD;
            yjk yjkVar3 = yjkVar2;
            bol bolVar3 = bolVar2;
            yjz yjzVar8 = yjzVar7;
            aqo.a(yjkVar3, yjzVar6, bkpVar2, yjzVar2, yjzVar3, yjzVar4, yjzVar8, bolVar3, j, j2, j3, j4, f2, cnsVar2, baoVar2, i3 & 2147483646, i4 & 8190);
        } else {
            baoVar2 = baoVarD;
            baoVar2.t();
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new aqp(yjkVar, yjzVar, bkpVar, yjzVar2, yjzVar3, yjzVar4, yjzVar5, bolVar, j, j2, j3, j4, f, cnsVar, i, i2, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void F(defpackage.bkp r25, defpackage.bol r26, long r27, long r29, float r31, final defpackage.yjz r32, defpackage.bao r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.og.F(bkp, bol, long, long, float, yjz, bao, int, int):void");
    }

    public static final /* synthetic */ long H(long j, anz anzVar, float f, bao baoVar) {
        long jL = kv.B(baoVar).l();
        long j2 = bnq.a;
        if (!a.s(j, jL) || anzVar == null) {
            baoVar.x(-1124526507);
            baoVar.p();
            return j;
        }
        baoVar.x(-1124594614);
        baoVar.x(-1687113661);
        anp anpVarB = kv.B(baoVar);
        if (Float.compare(f, 0.0f) <= 0 || anpVarB.m()) {
            baoVar.x(-1095440862);
            baoVar.p();
        } else {
            baoVar.x(-1095579370);
            float fLog = (float) Math.log(f + 1.0f);
            long jA = anq.a(j, baoVar);
            j = bny.m(bny.k(bnq.d(jA), bnq.c(jA), bnq.b(jA), ((fLog * 4.5f) + 2.0f) / 100.0f, bnq.f(jA)), j);
            baoVar.p();
        }
        baoVar.p();
        baoVar.p();
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void I(defpackage.yjk r26, defpackage.bkp r27, boolean r28, defpackage.ase r29, defpackage.kw r30, defpackage.bol r31, defpackage.yjz r32, defpackage.bao r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.og.I(yjk, bkp, boolean, ase, kw, bol, yjz, bao, int, int):void");
    }

    public static final void J(bkp bkpVar, yjk yjkVar, boolean z, bol bolVar, ase aseVar, kw kwVar, yjz yjzVar, bao baoVar, int i) {
        bkp bkpVar2;
        int i2;
        kw kwVar2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-1134296466);
        if (i3 == 0) {
            bkpVar2 = bkpVar;
            i2 = (true != baoVarD.F(bkpVar2) ? 2 : 4) | i;
        } else {
            bkpVar2 = bkpVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjkVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.G(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.F(bolVar) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i & 24576) == 0) {
            i2 |= true != baoVarD.F(aseVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != baoVarD.F(kwVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 524288 : 1048576;
        }
        int i4 = i2;
        int i5 = 0;
        if (baoVarD.L((599187 & i4) != 599186, i4 & 1)) {
            if (kwVar == null) {
                baoVarD.x(977031597);
                bas basVar = (bas) baoVarD;
                Object objT = basVar.T();
                if (objT == ban.a) {
                    objT = new kw((byte[]) null, (byte[]) null);
                    basVar.ae(objT);
                }
                kwVar2 = (kw) objT;
                basVar.aa();
            } else {
                baoVarD.x(862800490);
                ((bas) baoVarD).aa();
                kwVar2 = kwVar;
            }
            bkp bkpVarBU = a.bU(hu.w(hq.f(bga.w(zi.e(ask.a(bkpVar2), u()), bolVar), aseVar.a(z), bolVar), kwVar2, atn.a(false, 0.0f, 7), z, new cez(i5), yjkVar, 8));
            bvt bvtVarA = xo.a(bkb.e, false);
            int iO = zy.o(baoVarD);
            bas basVar2 = (bas) baoVarD;
            bhu bhuVarAi = basVar2.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVarBU);
            yjk yjkVar2 = bxt.a;
            baoVarD.z();
            if (basVar2.w) {
                baoVarD.k(yjkVar2);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA, bxt.d);
            beb.a(baoVarD, bhuVarAi, bxt.c);
            yjz yjzVar2 = bxt.e;
            if (basVar2.w || !yks.e(basVar2.T(), Integer.valueOf(iO))) {
                Integer numValueOf = Integer.valueOf(iO);
                basVar2.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar2);
            }
            beb.a(baoVarD, bkpVarC, bxt.b);
            bcm.i(arr.a.c(new bnq(aseVar.b(z))), yjzVar, baoVarD, ((i4 >> 15) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8);
            baoVarD.o();
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new arf(bkpVar2, yjkVar, z, bolVar, aseVar, kwVar, yjzVar, i, 2);
        }
    }

    public static final void K(yjk yjkVar, bkp bkpVar, boolean z, bol bolVar, ase aseVar, kw kwVar, yjz yjzVar, bao baoVar, int i) {
        int i2;
        bao baoVar2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(947208840);
        if (i3 == 0) {
            i2 = (true != baoVarD.H(yjkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.G(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.F(bolVar) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i & 24576) == 0) {
            i2 |= true != baoVarD.F(aseVar) ? 8192 : 16384;
        }
        if ((i & 196608) == 0) {
            i2 |= true != baoVarD.F(kwVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 524288 : 1048576;
        }
        if (baoVarD.L((599187 & i2) != 599186, i2 & 1)) {
            baoVarD.u();
            if ((i & 1) != 0 && !baoVarD.I()) {
                baoVarD.t();
            }
            baoVarD.m();
            int i4 = (i2 & 14) | 196608;
            int i5 = i2 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
            int i6 = i2 & 896;
            int i7 = i2 & 7168;
            int i8 = 57344 & i2;
            int i9 = i2 << 3;
            baoVar2 = baoVarD;
            L(yjkVar, bkpVar, z, bolVar, aseVar, kwVar, yjzVar, baoVar2, i4 | i5 | i6 | i7 | i8 | (3670016 & i9) | (i9 & 29360128));
        } else {
            baoVar2 = baoVarD;
            baoVar2.t();
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new arf(yjkVar, bkpVar, z, bolVar, aseVar, kwVar, yjzVar, i, 4);
        }
    }

    public static final void L(yjk yjkVar, bkp bkpVar, boolean z, bol bolVar, ase aseVar, kw kwVar, yjz yjzVar, bao baoVar, int i) {
        yjk yjkVar2;
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-171935091);
        int i4 = 2;
        if (i3 == 0) {
            yjkVar2 = yjkVar;
            i2 = (true != baoVarD.H(yjkVar2) ? 2 : 4) | i;
        } else {
            yjkVar2 = yjkVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.G(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.F(bolVar) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i & 24576) == 0) {
            i2 |= true != baoVarD.F(aseVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != baoVarD.F(null) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != baoVarD.F(kwVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 4194304 : 8388608;
        }
        if (baoVarD.L((4793491 & i2) != 4793490, 1 & i2)) {
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (objT == ban.a) {
                objT = new aru(i4);
                basVar.ae(objT);
            }
            awq.d(yjkVar2, cfd.b(bkpVar, false, (yjv) objT), z, bolVar, aseVar.a(z), aseVar.b(z), 0.0f, null, kwVar, bga.k(669231714, new aoq(yjzVar, 11), baoVarD), baoVarD, 192);
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new arf(yjkVar, bkpVar, z, bolVar, aseVar, kwVar, yjzVar, i, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void M(defpackage.yjk r27, defpackage.bkp r28, boolean r29, defpackage.bol r30, defpackage.arb r31, defpackage.ard r32, defpackage.qs r33, defpackage.yy r34, defpackage.kw r35, defpackage.yka r36, defpackage.bao r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 669
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.og.M(yjk, bkp, boolean, bol, arb, ard, qs, yy, kw, yka, bao, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void N(final defpackage.yjk r20, defpackage.bkp r21, boolean r22, defpackage.bol r23, long r24, long r26, final float r28, final defpackage.kw r29, final defpackage.yjz r30, defpackage.bao r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.og.N(yjk, bkp, boolean, bol, long, long, float, kw, yjz, bao, int, int):void");
    }

    public static final bdy O(ny nyVar, Object obj, Object obj2, bhi bhiVar, nt ntVar, bao baoVar, int i) {
        ny nyVar2;
        bas basVar = (bas) baoVar;
        Object objT = basVar.T();
        Object obj3 = ban.a;
        if (objT == obj3) {
            nyVar2 = nyVar;
            objT = new nv(nyVar2, obj, obj2, bhiVar, ntVar);
            basVar.ae(objT);
        } else {
            nyVar2 = nyVar;
        }
        nv nvVar = (nv) objT;
        int i2 = 1;
        boolean zH = ((((i & 896) ^ 384) > 256 && baoVar.H(obj2)) || (i & 384) == 256) | ((((i & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) > 32 && baoVar.H(obj)) || (i & 48) == 32) | baoVar.H(ntVar);
        Object objT2 = basVar.T();
        if (zH || objT2 == obj3) {
            nz nzVar = new nz(obj, nvVar, obj2, ntVar, 0);
            basVar.ae(nzVar);
            objT2 = nzVar;
        }
        bbn.g((yjk) objT2, baoVar);
        boolean zH2 = baoVar.H(nyVar2);
        Object objT3 = basVar.T();
        if (zH2 || objT3 == obj3) {
            objT3 = new ox(nyVar2, nvVar, i2);
            basVar.ae(objT3);
        }
        bbn.c(nvVar, (yjv) objT3, baoVar);
        return nvVar;
    }

    private static final Object P(mv mvVar, yjv yjvVar, yih yihVar) {
        return mvVar.e() ? hp.g(yjvVar, yihVar) : bcm.e(new kb(yjvVar, 6), yihVar);
    }

    public static final void a(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void b(String str) {
        throw new IllegalStateException(str);
    }

    public static final bdy c(ny nyVar, float f, float f2, nt ntVar, bao baoVar, int i) {
        return O(nyVar, Float.valueOf(f), Float.valueOf(f2), pm.a, ntVar, baoVar, (i & 1022) | 32768);
    }

    public static final ny d(bao baoVar) {
        bas basVar = (bas) baoVar;
        Object objT = basVar.T();
        if (objT == ban.a) {
            objT = new ny();
            basVar.ae(objT);
        }
        ny nyVar = (ny) objT;
        nyVar.a(baoVar, 0);
        return nyVar;
    }

    public static boolean e(pb pbVar, Object obj, Object obj2) {
        return yks.e(obj, pbVar.a()) && yks.e(obj2, pbVar.b());
    }

    public static final float f(yil yilVar) {
        bkr bkrVar = (bkr) yilVar.get(bkr.a);
        float fA = bkrVar != null ? bkrVar.a() : 1.0f;
        if (fA < 0.0f) {
            b("negative scale factor");
        }
        return fA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r26v1, types: [yjv] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object g(final defpackage.mz r21, final defpackage.mv r22, long r23, final defpackage.yjv r25, defpackage.yih r26) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.og.g(mz, mv, long, yjv, yih):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, yjv] */
    public static final Object h(float f, float f2, float f3, my myVar, yjz yjzVar, yih yihVar) {
        bhi bhiVar = pm.a;
        Float f4 = new Float(f);
        Float f5 = new Float(f2);
        Float f6 = new Float(f3);
        ?? r7 = bhiVar.a;
        ne neVarC = (ne) r7.a(f6);
        if (neVarC == null) {
            neVarC = ((ne) r7.a(f4)).c();
        }
        ne neVar = neVarC;
        Object objG = g(new mz(bhiVar, f4, neVar, 56), new oz(myVar, bhiVar, f4, f5, neVar), Long.MIN_VALUE, new ox(yjzVar, bhiVar, 0), yihVar);
        yio yioVar = yio.a;
        if (objG != yioVar) {
            objG = ygi.a;
        }
        return objG == yioVar ? objG : ygi.a;
    }

    public static final void i(mx mxVar, long j, float f, mv mvVar, mz mzVar, yjv yjvVar) {
        long jA = f == 0.0f ? mvVar.a() : (long) ((j - mxVar.a) / f);
        mxVar.d = j;
        mxVar.b.b(mvVar.c(jA));
        mxVar.c = mvVar.b(jA);
        if (mvVar.d(jA)) {
            mxVar.e = mxVar.d;
            mxVar.d();
        }
        j(mxVar, mzVar);
        yjvVar.a(mxVar);
    }

    public static final void j(mx mxVar, mz mzVar) {
        mzVar.c(mxVar.a());
        ne neVar = mzVar.a;
        ne neVar2 = mxVar.c;
        int iB = neVar.b();
        for (int i = 0; i < iB; i++) {
            neVar.e(i, neVar2.a(i));
        }
        mzVar.c = mxVar.e;
        mzVar.b = mxVar.d;
        mzVar.d = mxVar.c();
    }

    public static /* synthetic */ Object k(float f, float f2, my myVar, yjz yjzVar, yih yihVar, int i) {
        if ((i & 8) != 0) {
            myVar = fh.g(0.0f, 0.0f, null, 7);
        }
        return h(f, f2, 0.0f, myVar, yjzVar, yihVar);
    }

    public static final Object l(mz mzVar, Object obj, my myVar, yjv yjvVar, yih yihVar) {
        Object objG = g(mzVar, new oz(myVar, mzVar.e, mzVar.a(), obj, mzVar.a), mzVar.b, yjvVar, yihVar);
        return objG == yio.a ? objG : ygi.a;
    }

    public static final int m(abk abkVar, uv uvVar) {
        return uvVar == uv.a ? cmf.b(abkVar.k) : cmf.a(abkVar.k);
    }

    public static final boolean n(bsr bsrVar) {
        return bsrVar.b == 2;
    }

    public static final boolean p(cmi cmiVar, uv uvVar) {
        return cmiVar != cmi.b || uvVar == uv.a;
    }

    public static final ybo q(bao baoVar) {
        float f = mo.a;
        clx clxVar = (clx) baoVar.f(ccq.d);
        boolean zC = baoVar.C(clxVar.a());
        bas basVar = (bas) baoVar;
        Object objT = basVar.T();
        if (zC || objT == ban.a) {
            objT = new cb(new kw(clxVar), (byte[]) null);
            basVar.ae(objT);
        }
        cb cbVar = (cb) objT;
        boolean zF = baoVar.F(cbVar);
        Object objT2 = basVar.T();
        if (zF || objT2 == ban.a) {
            objT2 = new ybo(cbVar);
            basVar.ae(objT2);
        }
        return (ybo) objT2;
    }

    public static final void r(boolean z, yjv yjvVar, bkp bkpVar, boolean z2, ash ashVar, bol bolVar, yjz yjzVar, bao baoVar, int i) {
        int i2;
        bao baoVar2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-1031402037);
        if (i3 == 0) {
            i2 = (true != baoVarD.G(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjvVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.G(z2) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i & 24576) == 0) {
            i2 |= true != baoVarD.F(ashVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != baoVarD.F(null) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != baoVarD.F(bolVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 4194304 : 8388608;
        }
        if (baoVarD.L((4793491 & i2) != 4793490, i2 & 1)) {
            baoVarD.u();
            if ((i & 1) != 0 && !baoVarD.I()) {
                baoVarD.t();
            }
            baoVarD.m();
            baoVar2 = baoVarD;
            s(z, yjvVar, bkpVar, z2, ashVar, bolVar, yjzVar, baoVar2, i2 & 33554430);
        } else {
            baoVar2 = baoVarD;
            baoVar2.t();
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new asf(z, yjvVar, bkpVar, z2, ashVar, bolVar, yjzVar, i, 0);
        }
    }

    public static final void s(boolean z, yjv yjvVar, bkp bkpVar, boolean z2, ash ashVar, bol bolVar, yjz yjzVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(1724745099);
        int i4 = 1;
        if (i3 == 0) {
            i2 = (true != baoVarD.G(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjvVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.G(z2) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i & 24576) == 0) {
            i2 |= true != baoVarD.F(ashVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != baoVarD.F(null) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != baoVarD.F(bolVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 4194304 : 8388608;
        }
        int i5 = i2;
        if (baoVarD.L((4793491 & i5) != 4793490, i5 & 1)) {
            baoVarD.u();
            if ((i & 1) != 0 && !baoVarD.I()) {
                baoVarD.t();
            }
            baoVarD.m();
            baoVarD.x(1188008240);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (objT == ban.a) {
                objT = new kw((byte[]) null, (byte[]) null);
                basVar.ae(objT);
            }
            kw kwVar = (kw) objT;
            basVar.aa();
            bkp bkpVarV = hp.v(hq.f(bga.w(zi.e(ask.a(bkpVar), u()), bolVar), ((bnq) a.bR(new bnq(!z2 ? ashVar.c : !z ? ashVar.a : ashVar.e), baoVarD).a()).h, boh.a), z, kwVar, atn.a(false, 0.0f, 7), z2, new cez(i4), yjvVar);
            bvt bvtVarA = xo.a(bkb.e, false);
            int iO = zy.o(baoVarD);
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVarV);
            yjk yjkVar = bxt.a;
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA, bxt.d);
            beb.a(baoVarD, bhuVarAi, bxt.c);
            yjz yjzVar2 = bxt.e;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iO))) {
                Integer numValueOf = Integer.valueOf(iO);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar2);
            }
            beb.a(baoVarD, bkpVarC, bxt.b);
            bcm.i(arr.a.c(new bnq(((bnq) a.bR(new bnq(!z2 ? ashVar.d : !z ? ashVar.b : ashVar.f), baoVarD).a()).h)), yjzVar, baoVarD, ((i5 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8);
            baoVarD.o();
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new asf(z, yjvVar, bkpVar, z2, ashVar, bolVar, yjzVar, i, 1);
        }
    }

    public static final ase t(arl arlVar, long j) {
        ase aseVar = arlVar.Z;
        if (aseVar != null) {
            return aseVar;
        }
        long j2 = bnq.f;
        ase aseVar2 = new ase(j2, j, j2, bny.k(bnq.d(j), bnq.c(j), bnq.b(j), 0.38f, bnq.f(j)));
        arlVar.Z = aseVar2;
        return aseVar2;
    }

    public static /* synthetic */ long u() {
        return a.j((a.r(1, 0) ? 8.0f : a.r(1, 1) ? 16.0f : a.r(1, 2) ? 28.0f : 0.0f) + 24.0f, 40.0f);
    }

    public static final void v(bkp bkpVar, float f, long j, bao baoVar, int i, int i2) {
        int i3;
        final long jF;
        float f2;
        final float f3;
        int i4 = i2 & 1;
        bao baoVarD = baoVar.d(75144485);
        boolean z = true;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != baoVarD.F(bkpVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != baoVarD.C(f) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            int i6 = 128;
            jF = j;
            if ((i2 & 4) == 0 && baoVarD.E(jF)) {
                i6 = 256;
            }
            i3 |= i6;
        } else {
            jF = j;
        }
        if (baoVarD.L((i3 & 147) != 146, i3 & 1)) {
            int i7 = i2 & 4;
            baoVarD.u();
            if ((i & 1) == 0 || baoVarD.I()) {
                if (i4 != 0) {
                    bkpVar = bkp.g;
                }
                f3 = i5 != 0 ? 1.0f : f;
                if (i7 != 0) {
                    i3 &= -897;
                    jF = arm.f(25, baoVarD);
                }
            } else {
                baoVarD.t();
                if (i7 != 0) {
                    i3 &= -897;
                }
                f3 = f;
            }
            baoVarD.m();
            bkp bkpVarB = zi.b(zi.a(bkpVar, 1.0f), f3);
            boolean z2 = (i3 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32;
            if ((((i3 & 896) ^ 384) <= 256 || !baoVarD.E(jF)) && (i3 & 384) != 256) {
                z = false;
            }
            boolean z3 = z | z2;
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (z3 || objT == ban.a) {
                objT = new yjv() { // from class: ary
                    @Override // defpackage.yjv
                    public final Object a(Object obj) {
                        bpq bpqVar = (bpq) obj;
                        float f4 = f3;
                        float fCr = bpqVar.cr(f4);
                        float fCr2 = bpqVar.cr(f4) / 2.0f;
                        long jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fCr2);
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (bpqVar.n() >> 32));
                        float fCr3 = bpqVar.cr(f4) / 2.0f;
                        brx.n(bpqVar, jF, (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L), (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fCr3) & 4294967295L), fCr, 0, 496);
                        return ygi.a;
                    }
                };
                basVar.ae(objT);
            }
            ht.i(bkpVarB, (yjv) objT, baoVarD, 0);
            f2 = f3;
        } else {
            baoVarD.t();
            f2 = f;
        }
        long j2 = jF;
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new knd(bkpVar, f2, j2, i, i2, 1);
        }
    }

    public static final void w(bkp bkpVar, bol bolVar, arh arhVar, arj arjVar, yka ykaVar, bao baoVar, int i, int i2) {
        bkp bkpVar2;
        int i3;
        bol bolVar2;
        arh arhVarB;
        arj arjVarY;
        bao baoVar2;
        bkp bkpVar3;
        bol bolVar3;
        arh arhVar2;
        arj arjVar2;
        bol bolVarA;
        bkp bkpVar4;
        arh arhVar3;
        bol bolVar4;
        int i4 = i2 & 1;
        bao baoVarD = baoVar.d(1359693790);
        if (i4 != 0) {
            i3 = i | 6;
            bkpVar2 = bkpVar;
        } else if ((i & 6) == 0) {
            bkpVar2 = bkpVar;
            i3 = (true != baoVarD.F(bkpVar2) ? 2 : 4) | i;
        } else {
            bkpVar2 = bkpVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i5 = 16;
            if ((i2 & 2) == 0) {
                bolVar2 = bolVar;
                if (baoVarD.F(bolVar2)) {
                    i5 = 32;
                }
            } else {
                bolVar2 = bolVar;
            }
            i3 |= i5;
        } else {
            bolVar2 = bolVar;
        }
        if ((i & 384) == 0) {
            int i6 = 128;
            if ((i2 & 4) == 0) {
                arhVarB = arhVar;
                if (baoVarD.F(arhVarB)) {
                    i6 = 256;
                }
            } else {
                arhVarB = arhVar;
            }
            i3 |= i6;
        } else {
            arhVarB = arhVar;
        }
        if ((i & 3072) == 0) {
            int i7 = 1024;
            if ((i2 & 8) == 0) {
                arjVarY = arjVar;
                if (baoVarD.F(arjVarY)) {
                    i7 = RecyclerView.ItemAnimator.FLAG_MOVED;
                }
            } else {
                arjVarY = arjVar;
            }
            i3 |= i7;
        } else {
            arjVarY = arjVar;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= true != baoVarD.F(null) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != baoVarD.H(ykaVar) ? 65536 : 131072;
        }
        if (baoVarD.L((74899 & i3) != 74898, i3 & 1)) {
            int i8 = i2 & 8;
            int i9 = i2 & 4;
            int i10 = i2 & 2;
            baoVarD.u();
            if ((i & 1) == 0 || baoVarD.I()) {
                bkp bkpVar5 = i4 != 0 ? bkp.g : bkpVar2;
                if (i10 != 0) {
                    i3 &= -113;
                    bolVarA = A(baoVarD);
                } else {
                    bolVarA = bolVar2;
                }
                if (i9 != 0) {
                    i3 &= -897;
                    arhVarB = B(baoVarD);
                }
                if (i8 != 0) {
                    i3 &= -7169;
                    arjVarY = y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 63);
                }
                bkpVar4 = bkpVar5;
                arhVar3 = arhVarB;
                bolVar4 = bolVarA;
            } else {
                baoVarD.t();
                if (i10 != 0) {
                    i3 &= -113;
                }
                if (i9 != 0) {
                    i3 &= -897;
                }
                if (i8 != 0) {
                    i3 &= -7169;
                }
                arhVar3 = arhVarB;
                bolVar4 = bolVar2;
                bkpVar4 = bkpVar2;
            }
            arj arjVar3 = arjVarY;
            baoVarD.m();
            baoVar2 = baoVarD;
            awq.c(bkpVar4, bolVar4, arhVar3.a(true), arhVar3.b(true), 0.0f, ((cma) arjVar3.a(true, null, baoVarD, ((i3 >> 3) & 896) | 54).a()).a, bga.k(-97109725, new aoq(ykaVar, 7), baoVarD), baoVar2, 16);
            arjVar2 = arjVar3;
            bkpVar3 = bkpVar4;
            bolVar3 = bolVar4;
            arhVar2 = arhVar3;
        } else {
            baoVar2 = baoVarD;
            baoVar2.t();
            bkpVar3 = bkpVar2;
            bolVar3 = bolVar2;
            arhVar2 = arhVarB;
            arjVar2 = arjVarY;
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kex(bkpVar3, bolVar3, arhVar2, arjVar2, ykaVar, i, i2, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void x(defpackage.yjk r25, defpackage.bkp r26, boolean r27, defpackage.bol r28, defpackage.arh r29, defpackage.arj r30, defpackage.qs r31, defpackage.yka r32, defpackage.bao r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.og.x(yjk, bkp, boolean, bol, arh, arj, qs, yka, bao, int, int):void");
    }

    public static final arj y(float f, float f2, float f3, float f4, float f5, float f6, int i) {
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        if ((i & 32) != 0) {
            f6 = 0.0f;
        }
        if ((i & 16) != 0) {
            f5 = 6.0f;
        }
        if ((i & 8) != 0) {
            f4 = 1.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if (1 == (i & 1)) {
            f7 = f6;
            f8 = f5;
            f9 = f4;
            f10 = f3;
            f11 = f2;
            f12 = 0.0f;
        } else {
            f7 = f6;
            f8 = f5;
            f9 = f4;
            f10 = f3;
            f11 = f2;
            f12 = f;
        }
        return new arj(f12, f11, f10, f9, f8, f7);
    }

    public static final arh z(arl arlVar) {
        arh arhVar = arlVar.Y;
        if (arhVar != null) {
            return arhVar;
        }
        long jE = arm.e(arlVar, 39);
        long jA = arm.a(arlVar, arm.e(arlVar, 39));
        long jE2 = arm.e(arlVar, 44);
        long jM = bny.m(bny.k(bnq.d(jE2), bnq.c(jE2), bnq.b(jE2), 0.38f, bnq.f(jE2)), arm.e(arlVar, 39));
        long jA2 = arm.a(arlVar, arm.e(arlVar, 39));
        arh arhVar2 = new arh(jE, jA, jM, bny.k(bnq.d(jA2), bnq.c(jA2), bnq.b(jA2), 0.38f, bnq.f(jA2)));
        arlVar.Y = arhVar2;
        return arhVar2;
    }
}
