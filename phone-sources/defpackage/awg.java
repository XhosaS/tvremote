package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awg {
    public static final awg a = new awg();
    public static final float b;
    public static final float c;
    public static final float d;

    static {
        float f = azu.a;
        float f2 = azw.a;
        float f3 = azt.a;
        float f4 = azs.a;
        float f5 = azv.a;
        aeh aehVar = aup.a;
        wv.t(azu.a, 0.0f, azu.b, 0.0f, 10);
        wv.t(azw.a, 0.0f, azw.b, 0.0f, 10);
        wv.t(azu.a, 0.0f, azu.b, 0.0f, 10);
        wv.t(azt.a, 0.0f, azt.b, 0.0f, 10);
        wv.t(azs.a, 0.0f, azs.b, 0.0f, 10);
        wv.t(azv.a, 0.0f, azv.b, 0.0f, 10);
        wv.t(azw.c, 0.0f, azw.d, 0.0f, 10);
        wv.t(azu.c, 0.0f, azu.d, 0.0f, 10);
        wv.t(azt.c, 0.0f, azt.d, 0.0f, 10);
        wv.t(azs.c, 0.0f, azs.d, 0.0f, 10);
        wv.t(azv.c, 0.0f, azv.d, 0.0f, 10);
        wv.t(azu.c, 0.0f, azu.d, 0.0f, 10);
        b = 48.0f;
        c = 40.0f;
        d = 48.0f;
        aeh aehVar2 = aep.a;
    }

    private awg() {
    }

    public final void a(yjk yjkVar, bkp bkpVar, boolean z, awk awkVar, arb arbVar, ard ardVar, yy yyVar, yka ykaVar, bao baoVar, int i, int i2) {
        yjk yjkVar2;
        int i3;
        Object obj;
        int i4;
        bao baoVar2;
        bdy bdyVarA;
        int i5 = i & 6;
        bao baoVarD = baoVar.d(1842194067);
        if (i5 == 0) {
            yjkVar2 = yjkVar;
            i3 = (true != baoVarD.H(yjkVar2) ? 2 : 4) | i;
        } else {
            yjkVar2 = yjkVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != baoVarD.G(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != baoVarD.F(awkVar) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i & 24576) == 0) {
            i3 |= true != baoVarD.F(arbVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != baoVarD.F(ardVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != baoVarD.F(null) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            obj = yyVar;
            i3 |= true != baoVarD.F(obj) ? 4194304 : 8388608;
        } else {
            obj = yyVar;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != baoVarD.F(null) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != baoVarD.H(ykaVar) ? 268435456 : 536870912;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != baoVarD.F(this) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if (baoVarD.L(((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true, i3 & 1)) {
            baoVarD.u();
            if ((i & 1) != 0 && !baoVarD.I()) {
                baoVarD.t();
            }
            baoVarD.m();
            baoVarD.x(-287930936);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            Object obj2 = ban.a;
            if (objT == obj2) {
                objT = new kw((byte[]) null, (byte[]) null);
                basVar.ae(objT);
            }
            kw kwVar = (kw) objT;
            basVar.aa();
            np npVarF = wv.F(4, baoVarD);
            bdy bdyVarBH = a.bH(kwVar, baoVarD, 0);
            long jB = arbVar.b(z);
            long jA = arbVar.a(z);
            Object objT2 = basVar.T();
            if (objT2 == obj2) {
                objT2 = new aru(6);
                basVar.ae(objT2);
            }
            bkp bkpVarB = cfd.b(bkpVar, false, (yjv) objT2);
            int i6 = i3 >> 9;
            bol bolVarCa = a.ca(awkVar, ((Boolean) bdyVarBH.a()).booleanValue(), false, npVarF, baoVarD);
            if (ardVar == null) {
                baoVarD.x(-287189789);
                basVar.aa();
                bdyVarA = null;
            } else {
                baoVarD.x(822019806);
                bdyVarA = ardVar.a(z, kwVar, baoVarD, (i6 & 896) | ((i3 >> 6) & 14));
                basVar.aa();
            }
            baoVar2 = baoVarD;
            awq.d(yjkVar2, bkpVarB, z, bolVarCa, jA, jB, bdyVarA != null ? ((cma) bdyVarA.a()).a : 0.0f, null, kwVar, bga.k(-1929660706, new arg(jB, obj, ykaVar, 3), baoVarD), baoVar2, 64);
        } else {
            baoVar2 = baoVarD;
            baoVar2.t();
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new awd(this, yjkVar, bkpVar, z, awkVar, arbVar, ardVar, yyVar, ykaVar, i, i2, 0);
        }
    }

    public final void b(boolean z, yjv yjvVar, bkp bkpVar, boolean z2, awk awkVar, arb arbVar, ard ardVar, yy yyVar, yka ykaVar, bao baoVar, int i, int i2) {
        int i3;
        int i4;
        bao baoVar2;
        Object obj;
        bas basVar;
        kw kwVar;
        char c2;
        char c3;
        bol bolVar;
        cmi cmiVar;
        long j;
        bdy bdyVarA;
        kw kwVar2;
        int i5 = i & 6;
        bao baoVarD = baoVar.d(1676067170);
        if (i5 == 0) {
            i3 = (true != baoVarD.G(z) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != baoVarD.H(yjvVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != baoVarD.F(bkpVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != baoVarD.G(z2) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i & 24576) == 0) {
            i3 |= true != baoVarD.F(awkVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != baoVarD.F(arbVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != baoVarD.F(ardVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != baoVarD.F(null) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != baoVarD.F(yyVar) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != baoVarD.F(null) ? 268435456 : 536870912;
        }
        int i6 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != baoVarD.H(ykaVar) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != baoVarD.F(this) ? 16 : 32;
        }
        if (baoVarD.L(((i6 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true, i6 & 1)) {
            baoVarD.u();
            if ((i & 1) != 0 && !baoVarD.I()) {
                baoVarD.t();
            }
            baoVarD.m();
            baoVarD.x(-1571950823);
            bas basVar2 = (bas) baoVarD;
            Object objT = basVar2.T();
            Object obj2 = ban.a;
            if (objT == obj2) {
                objT = new kw((byte[]) null, (byte[]) null);
                basVar2.ae(objT);
            }
            kw kwVar3 = (kw) objT;
            basVar2.aa();
            np npVarF = wv.F(4, baoVarD);
            bdy bdyVarBH = a.bH(kwVar3, baoVarD, 0);
            cmi cmiVar2 = (cmi) baoVarD.f(ccq.i);
            clx clxVar = (clx) baoVarD.f(ccq.d);
            int i7 = i6 >> 12;
            bol bolVarCa = a.ca(awkVar, ((Boolean) bdyVarBH.a()).booleanValue(), z, npVarF, baoVarD);
            long jB = arbVar.b(z2);
            long jA = arbVar.a(z2);
            boolean zF = ((i6 & 14) == 4) | baoVarD.F(bolVarCa) | baoVarD.D(cmiVar2.ordinal()) | baoVarD.F(clxVar) | baoVarD.E(jB);
            Object objT2 = basVar2.T();
            if (zF || objT2 == obj2) {
                obj = obj2;
                basVar = basVar2;
                kwVar = kwVar3;
                c2 = 0;
                c3 = 1;
                bolVar = bolVarCa;
                cmiVar = cmiVar2;
                j = jB;
                ilp ilpVar = new ilp(z, bolVar, cmiVar, clxVar, j, 1);
                basVar.ae(ilpVar);
                objT2 = ilpVar;
            } else {
                obj = obj2;
                basVar = basVar2;
                kwVar = kwVar3;
                c2 = 0;
                c3 = 1;
                j = jB;
                cmiVar = cmiVar2;
                bolVar = bolVarCa;
            }
            bkp bkpVarU = bga.u(bkpVar, (yjv) objT2);
            Object objT3 = basVar.T();
            if (objT3 == obj) {
                objT3 = new aru(7);
                basVar.ae(objT3);
            }
            bkp bkpVarB = cfd.b(bkpVarU, false, (yjv) objT3);
            if (ardVar == null) {
                baoVarD.x(-1570555948);
                basVar.aa();
                bdyVarA = null;
            } else {
                baoVarD.x(87884237);
                bdyVarA = ardVar.a(z2, kwVar, baoVarD, ((i6 >> 9) & 14) | (i7 & 896));
                basVar.aa();
            }
            float f = bdyVarA != null ? ((cma) bdyVarA.a()).a : 0.0f;
            bhq bhqVarK = bga.k(1245690872, new awf(j, bolVar, yyVar, cmiVar, ykaVar), baoVarD);
            if (kwVar == null) {
                baoVarD.x(643421417);
                Object objT4 = basVar.T();
                if (objT4 == obj) {
                    objT4 = new kw((byte[]) null, (byte[]) null);
                    basVar.ae(objT4);
                }
                kwVar2 = (kw) objT4;
                basVar.aa();
            } else {
                baoVarD.x(-533434450);
                basVar.aa();
                kwVar2 = kwVar;
            }
            bcp bcpVar = awq.a;
            float f2 = ((cma) baoVarD.f(bcpVar)).a + 0.0f;
            bcq[] bcqVarArr = new bcq[2];
            bcqVarArr[c2] = arr.a.c(new bnq(j));
            bcqVarArr[c3] = bcpVar.c(new cma(f2));
            baoVar2 = baoVarD;
            bcm.j(bcqVarArr, bga.k(-1839065134, new awp(bkpVarB, bolVar, jA, f2, z, kwVar2, z2, yjvVar, f, bhqVarK), baoVar2), baoVar2, 56);
        } else {
            baoVar2 = baoVarD;
            baoVar2.t();
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new ppa(this, z, yjvVar, bkpVar, z2, awkVar, arbVar, ardVar, yyVar, ykaVar, i, i2, 1);
        }
    }
}
