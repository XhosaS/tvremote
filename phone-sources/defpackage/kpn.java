package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kpn {
    private static final yy b = new za(10.0f, 8.0f, 10.0f, 16.0f);
    public static final yy a = wv.t(0.0f, 2.0f, 0.0f, 2.0f, 5);
    private static final float c = 2.0f;

    public static final void a(final yjk yjkVar, final String str, final bkp bkpVar, final long j, final long j2, yjz yjzVar, bao baoVar, final int i) {
        int i2;
        yjz yjzVarK;
        final yjz yjzVar2;
        yjkVar.getClass();
        bao baoVarD = baoVar.d(-510615745);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.H(yjkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.E(j) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i & 24576) == 0) {
            i2 |= true != baoVarD.E(j2) ? 8192 : 16384;
        }
        int i3 = i2 | 196608;
        if ((i3 & 74899) == 74898 && baoVarD.K()) {
            baoVarD.t();
            yjzVar2 = yjzVar;
        } else {
            baoVarD.u();
            if ((i & 1) == 0 || baoVarD.I()) {
                yjzVarK = bga.k(1095406278, new kpm(j2), baoVarD);
            } else {
                baoVarD.t();
                yjzVarK = yjzVar;
            }
            baoVarD.m();
            clx clxVar = (clx) baoVarD.f(ccq.d);
            clxVar.getClass();
            final ylc ylcVar = new ylc();
            final ylc ylcVar2 = new ylc();
            final ylc ylcVar3 = new ylc();
            ylcVar.a = clxVar.cr(8.0f);
            ylcVar2.a = clxVar.cr(16.0f);
            ylcVar3.a = clxVar.cr(8.0f);
            bkp bkpVarF = hq.f(bga.w(bkpVar, new aem(new yka() { // from class: kpl
                @Override // defpackage.yka
                public final Object a(Object obj, Object obj2, Object obj3) {
                    bni bniVar = (bni) obj;
                    yy yyVar = kpn.a;
                    bniVar.getClass();
                    ((cmi) obj3).getClass();
                    long jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                    long jFloatToRawIntBits2 = Float.floatToRawIntBits(0.0f);
                    long j3 = ((bna) obj2).a;
                    long j4 = j3 >> 32;
                    int i4 = (int) (j3 & 4294967295L);
                    int i5 = (int) j4;
                    float fIntBitsToFloat = Float.intBitsToFloat(i5);
                    float fIntBitsToFloat2 = Float.intBitsToFloat(i4);
                    ylc ylcVar4 = ylcVar3;
                    float f = fIntBitsToFloat2 - ylcVar4.a;
                    bmy bmyVarW = d.w((jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L), (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
                    float f2 = ylcVar.a;
                    bnj.t(bniVar, d.u(bmyVarW, (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L)));
                    float fIntBitsToFloat3 = Float.intBitsToFloat(i5) * 0.5f;
                    ylc ylcVar5 = ylcVar2;
                    float f3 = ylcVar5.a / 2.0f;
                    float fIntBitsToFloat4 = Float.intBitsToFloat(i4) - ylcVar4.a;
                    float fIntBitsToFloat5 = Float.intBitsToFloat(i5) * 0.5f;
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i4);
                    float fIntBitsToFloat7 = Float.intBitsToFloat(i5) * 0.5f;
                    float f4 = ylcVar5.a / 2.0f;
                    float fIntBitsToFloat8 = Float.intBitsToFloat(i4) - ylcVar4.a;
                    bni bniVar2 = new bni((byte[]) null);
                    bniVar2.f(fIntBitsToFloat3 - f3, fIntBitsToFloat4);
                    bniVar2.e(fIntBitsToFloat5, fIntBitsToFloat6);
                    bniVar2.e(fIntBitsToFloat7 + f4, fIntBitsToFloat8);
                    bniVar2.c();
                    bniVar.p(bniVar2);
                    return ygi.a;
                }
            })), j, boh.a);
            baoVarD.x(5004770);
            int i4 = i3 & 14;
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (i4 == 4 || objT == ban.a) {
                objT = new kih(yjkVar, 17);
                basVar.ae(objT);
            }
            basVar.aa();
            bkp bkpVarU = hu.u(bkpVarF, false, null, (yjk) objT, 15);
            bvt bvtVarA = xo.a(bkb.a, false);
            int iK = a.k(zy.p(baoVarD));
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVarU);
            yjk yjkVar2 = bxt.a;
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar2);
            } else {
                baoVarD.B();
            }
            yjz yjzVar3 = bxt.d;
            beb.a(baoVarD, bvtVarA, yjzVar3);
            yjz yjzVar4 = bxt.c;
            beb.a(baoVarD, bhuVarAi, yjzVar4);
            yjz yjzVar5 = bxt.e;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar5);
            }
            yjz yjzVar6 = bxt.b;
            beb.a(baoVarD, bkpVarC, yjzVar6);
            bkp bkpVarO = wv.o(bkp.g, b);
            bvt bvtVarA2 = zf.a(xk.e(c), bkb.n, baoVarD, 54);
            int iK2 = a.k(zy.p(baoVarD));
            bhu bhuVarAi2 = basVar.ai();
            bkp bkpVarC2 = bdi.C(baoVarD, bkpVarO);
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar2);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA2, yjzVar3);
            beb.a(baoVarD, bhuVarAi2, yjzVar4);
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK2))) {
                Integer numValueOf2 = Integer.valueOf(iK2);
                basVar.ae(numValueOf2);
                baoVarD.i(numValueOf2, yjzVar5);
            }
            beb.a(baoVarD, bkpVarC2, yjzVar6);
            yjz yjzVar7 = yjzVarK;
            axa.b(str, null, j2, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wv.N(baoVarD).m, baoVarD, ((i3 >> 3) & 14) | ((i3 >> 6) & 896), 0, 131066);
            yjzVar7.a(baoVarD, Integer.valueOf((i3 >> 15) & 14));
            baoVarD.o();
            baoVarD.o();
            yjzVar2 = yjzVar7;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new yjz() { // from class: kpk
                @Override // defpackage.yjz
                public final Object a(Object obj, Object obj2) {
                    bao baoVar2 = (bao) obj;
                    ((Integer) obj2).intValue();
                    yjk yjkVar3 = yjkVar;
                    String str2 = str;
                    bkp bkpVar2 = bkpVar;
                    long j3 = j;
                    int i5 = i;
                    kpn.a(yjkVar3, str2, bkpVar2, j3, j2, yjzVar2, baoVar2, bdi.n(i5 | 1));
                    return ygi.a;
                }
            };
        }
    }
}
