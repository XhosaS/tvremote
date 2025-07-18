package defpackage;

import android.support.v7.appcompat.R;
import android.support.v7.widget.RecyclerView;
import androidx.compose.foundation.HoverableElement;
import androidx.compose.foundation.layout.SizeElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ave {
    public static final ave a = new ave();
    private static final bni b = new bni((byte[]) null);

    private ave() {
    }

    public static final void a(bpq bpqVar, uv uvVar, long j, long j2, long j3, float f, float f2) {
        bmz bmzVarS;
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L);
        long jFloatToRawIntBits2 = (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
        if (uvVar == uv.a) {
            float fIntBitsToFloat = Float.intBitsToFloat(i);
            float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
            bmzVarS = d.s(d.w(j, (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits2);
        } else {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i);
            float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
            bmzVarS = d.s(d.w(j, (Float.floatToRawIntBits(fIntBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32)), jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits2, jFloatToRawIntBits);
        }
        bni bniVar = b;
        bnj.t(bniVar, bmzVarS);
        brx.I(bpqVar, bniVar, j3, null, 60);
        bniVar.l();
    }

    public static final auy b(arl arlVar) {
        auy auyVar = arlVar.ae;
        if (auyVar != null) {
            return auyVar;
        }
        long jE = arm.e(arlVar, 26);
        long jE2 = arm.e(arlVar, 26);
        long jE3 = arm.e(arlVar, 32);
        long jE4 = arm.e(arlVar, 32);
        long jE5 = arm.e(arlVar, 26);
        long jE6 = arm.e(arlVar, 18);
        long jM = bny.m(bny.k(bnq.d(jE6), bnq.c(jE6), bnq.b(jE6), 0.38f, bnq.f(jE6)), arlVar.p);
        long jE7 = arm.e(arlVar, 18);
        long jK = bny.k(bnq.d(jE7), bnq.c(jE7), bnq.b(jE7), 0.38f, bnq.f(jE7));
        long jE8 = arm.e(arlVar, 18);
        long jK2 = bny.k(bnq.d(jE8), bnq.c(jE8), bnq.b(jE8), 0.12f, bnq.f(jE8));
        long jE9 = arm.e(arlVar, 18);
        long jK3 = bny.k(bnq.d(jE9), bnq.c(jE9), bnq.b(jE9), 0.12f, bnq.f(jE9));
        long jE10 = arm.e(arlVar, 18);
        auy auyVar2 = new auy(jE, jE2, jE3, jE4, jE5, jM, jK, jK2, jK3, bny.k(bnq.d(jE10), bnq.c(jE10), bnq.b(jE10), 0.38f, bnq.f(jE10)));
        arlVar.ae = auyVar2;
        return auyVar2;
    }

    public final void c(final avn avnVar, final bkp bkpVar, final auy auyVar, final yjz yjzVar, yka ykaVar, final float f, final float f2, bao baoVar, final int i) {
        avn avnVar2;
        int i2;
        float f3;
        bao baoVar2;
        final yka ykaVar2;
        yka ykaVar3;
        bao baoVarD = baoVar.d(49984771);
        if ((i & 6) == 0) {
            avnVar2 = avnVar;
            i2 = (true != baoVarD.H(avnVar2) ? 2 : 4) | i;
        } else {
            avnVar2 = avnVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.G(true) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.F(auyVar) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i & 24576) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 8192 : 16384;
        }
        int i3 = i2 | 196608;
        if ((1572864 & i) == 0) {
            f3 = f;
            i3 |= true != baoVarD.C(f3) ? 524288 : 1048576;
        } else {
            f3 = f;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != baoVarD.C(f2) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != baoVarD.F(this) ? 33554432 : 67108864;
        }
        if (baoVarD.L((38347923 & i3) != 38347922, i3 & 1)) {
            baoVarD.u();
            if ((i & 1) == 0 || baoVarD.I()) {
                bas basVar = (bas) baoVarD;
                Object objT = basVar.T();
                if (objT == ban.a) {
                    objT = zu.f;
                    basVar.ae(objT);
                }
                ykaVar3 = (yka) objT;
            } else {
                baoVarD.t();
                ykaVar3 = ykaVar;
            }
            baoVarD.m();
            int i4 = i3 << 3;
            baoVar2 = baoVarD;
            float f4 = f3;
            d(avnVar2, bkpVar, auyVar, yjzVar, ykaVar3, f4, f2, baoVar2, 805306416 | (i3 & 14) | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4) | (234881024 & i4), ((i3 >> 21) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6);
            ykaVar2 = ykaVar3;
        } else {
            baoVar2 = baoVarD;
            baoVar2.t();
            ykaVar2 = ykaVar;
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new yjz() { // from class: avd
                @Override // defpackage.yjz
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ave aveVar = this.a;
                    avn avnVar3 = avnVar;
                    bkp bkpVar2 = bkpVar;
                    auy auyVar2 = auyVar;
                    yjz yjzVar2 = yjzVar;
                    yka ykaVar4 = ykaVar2;
                    float f5 = f;
                    aveVar.c(avnVar3, bkpVar2, auyVar2, yjzVar2, ykaVar4, f5, f2, (bao) obj, bdi.n(i | 1));
                    return ygi.a;
                }
            };
        }
    }

    public final void d(final avn avnVar, final bkp bkpVar, final auy auyVar, final yjz yjzVar, final yka ykaVar, final float f, final float f2, bao baoVar, final int i, final int i2) {
        int i3;
        int i4;
        bao baoVar2;
        bkp bkpVarB;
        bkp bkpVar2;
        bao baoVarD = baoVar.d(133396521);
        if ((i & 6) == 0) {
            i3 = (true != baoVarD.H(avnVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != baoVarD.C(Float.NaN) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != baoVarD.F(bkpVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != baoVarD.G(true) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i & 24576) == 0) {
            i3 |= true != baoVarD.F(auyVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != baoVarD.H(yjzVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != baoVarD.H(ykaVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != baoVarD.C(f) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != baoVarD.C(f2) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != baoVarD.G(false) ? 268435456 : 536870912;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != baoVarD.G(false) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if (baoVarD.L(((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true, i3 & 1)) {
            int i5 = i3;
            final long jB = auyVar.b(false);
            final long jB2 = auyVar.b(true);
            int i6 = i4;
            final long jA = auyVar.a(false);
            final long jA2 = auyVar.a(true);
            if (avnVar.e == uv.a) {
                bxa bxaVar = avm.a;
                float f3 = 16.0f;
                bkpVarB = new SizeElement(f3, 0.0f, f3, 0.0f, 10).a(zi.b);
            } else {
                bkp bkpVarA = zi.a(bkpVar, 1.0f);
                bxa bxaVar2 = avm.a;
                bkpVarB = zi.b(bkpVarA, 16.0f);
            }
            boolean z = (i5 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32;
            boolean zH = baoVarD.H(avnVar) | z;
            bas basVar = (bas) baoVarD;
            boolean z2 = z;
            Object objT = basVar.T();
            if (zH || objT == ban.a) {
                objT = new age(avnVar, 3);
                basVar.ae(objT);
            }
            bkp bkpVarA2 = bkpVarB.a(bty.j((yka) objT));
            boolean zH2 = z2 | baoVarD.H(avnVar) | baoVarD.E(jB) | baoVarD.E(jB2) | baoVarD.E(jA) | baoVarD.E(jA2);
            boolean z3 = (i5 & 29360128) == 8388608;
            boolean z4 = (i5 & 234881024) == 67108864;
            boolean z5 = (i5 & 458752) == 131072;
            boolean z6 = (i5 & 3670016) == 1048576;
            boolean z7 = (i5 & 1879048192) == 536870912;
            boolean z8 = (i6 & 14) == 4;
            Object objT2 = basVar.T();
            if (((zH2 | z3 | z4 | z5 | z6 | z7) || z8) || objT2 == ban.a) {
                bkpVar2 = bkpVarA2;
                baoVar2 = baoVarD;
                objT2 = new yjv() { // from class: avb
                    /* JADX WARN: Removed duplicated region for block: B:62:0x01b8  */
                    /* JADX WARN: Removed duplicated region for block: B:63:0x01d3  */
                    /* JADX WARN: Removed duplicated region for block: B:68:0x0206  */
                    @Override // defpackage.yjv
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object a(java.lang.Object r30) {
                        /*
                            Method dump skipped, instructions count: 711
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.avb.a(java.lang.Object):java.lang.Object");
                    }
                };
                basVar.ae(objT2);
            } else {
                bkpVar2 = bkpVarA2;
                baoVar2 = baoVarD;
            }
            ht.i(bkpVar2, (yjv) objT2, baoVar2, 0);
        } else {
            baoVar2 = baoVarD;
            baoVar2.t();
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new yjz() { // from class: avc
                @Override // defpackage.yjz
                public final Object a(Object obj, Object obj2) {
                    bao baoVar3 = (bao) obj;
                    ((Integer) obj2).intValue();
                    ave aveVar = this.a;
                    avn avnVar2 = avnVar;
                    bkp bkpVar3 = bkpVar;
                    auy auyVar2 = auyVar;
                    yjz yjzVar2 = yjzVar;
                    yka ykaVar2 = ykaVar;
                    float f4 = f;
                    int i7 = i;
                    aveVar.d(avnVar2, bkpVar3, auyVar2, yjzVar2, ykaVar2, f4, f2, baoVar3, bdi.n(i7 | 1), bdi.n(i2));
                    return ygi.a;
                }
            };
        }
    }

    public final void e(kw kwVar, bkp bkpVar, auy auyVar, long j, bao baoVar, int i) {
        int i2;
        bje bjeVar;
        long jFloatToRawIntBits;
        bao baoVarD = baoVar.d(-290277409);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.F(kwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(auyVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.G(true) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i & 24576) == 0) {
            i2 |= true != baoVarD.E(j) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != baoVarD.F(this) ? 65536 : 131072;
        }
        if (baoVarD.L((74899 & i2) != 74898, i2 & 1)) {
            baoVarD.u();
            if ((i & 1) != 0 && !baoVarD.I()) {
                baoVarD.t();
            }
            baoVarD.m();
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            Object obj = ban.a;
            if (objT == obj) {
                objT = new bje();
                basVar.ae(objT);
            }
            int i3 = i2 & 14;
            bje bjeVar2 = (bje) objT;
            Object objT2 = basVar.T();
            if (i3 == 4 || objT2 == obj) {
                bjeVar = bjeVar2;
                aoa aoaVar = new aoa(kwVar, bjeVar, (yih) null, 9, (char[]) null);
                basVar.ae(aoaVar);
                objT2 = aoaVar;
            } else {
                bjeVar = bjeVar2;
            }
            bbn.f(kwVar, (yjz) objT2, baoVarD);
            if (bjeVar.isEmpty()) {
                jFloatToRawIntBits = j;
            } else {
                jFloatToRawIntBits = (Float.floatToRawIntBits(cmc.b(j) / 2.0f) << 32) | (4294967295L & Float.floatToRawIntBits(cmc.a(j)));
            }
            zy.k(hq.f(zi.e(bkpVar, jFloatToRawIntBits).a(new HoverableElement(kwVar)), auyVar.a, aur.b(7, baoVarD)), baoVarD);
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new ava(this, kwVar, bkpVar, auyVar, j, i, 0);
        }
    }
}
