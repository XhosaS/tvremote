package defpackage;

import android.support.v7.appcompat.R;
import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aun {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final float f;
    public static final float g;
    public static final np h;
    public static final np i;
    public static final np j;
    private static final ni k;
    private static final ni l;
    private static final np m;
    private static final np n;

    static {
        long j2 = bnq.a;
        a = 28.0f;
        b = 360.0f;
        c = 720.0f;
        d = 8.0f;
        e = 4.0f;
        f = 8.0f;
        g = 24.0f;
        ni niVar = azp.a;
        ni niVar2 = azp.b;
        k = niVar2;
        ni niVar3 = new ni(0.0f, 1.0f, 0.0f, 1.0f);
        l = niVar3;
        pk pkVar = new pk(600, 100, niVar2);
        h = pkVar;
        pk pkVar2 = new pk(350, 100, niVar3);
        i = pkVar2;
        j = fh.i(350, niVar3, 2);
        pk pkVar3 = new pk(600, 100, niVar2);
        m = pkVar3;
        pk pkVar4 = new pk(350, 100, niVar3);
        n = pkVar4;
        mc.g(pkVar).a(mc.e(pkVar3, null, 14));
        mc.h(pkVar2).a(mc.f(pkVar4, null, 14));
    }

    public static final void a(final mr mrVar, final bdl bdlVar, final bcb bcbVar, final bcb bcbVar2, final bkp bkpVar, final zr zrVar, final yjz yjzVar, final yjz yjzVar2, final yjz yjzVar3, bao baoVar, final int i2) {
        int i3;
        bcb bcbVar3;
        int i4 = i2 & 6;
        bao baoVarD = baoVar.d(1217602934);
        if (i4 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? baoVarD.F(mrVar) : baoVarD.H(mrVar)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != baoVarD.F(bdlVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != baoVarD.F(bcbVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            bcbVar3 = bcbVar2;
            i3 |= true != baoVarD.F(bcbVar3) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        } else {
            bcbVar3 = bcbVar2;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != baoVarD.F(bkpVar) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != baoVarD.F(zrVar) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i3 |= true != baoVarD.H(yjzVar) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            i3 |= true != baoVarD.H(yjzVar2) ? 4194304 : 8388608;
        }
        if ((100663296 & i2) == 0) {
            i3 |= true != baoVarD.H(yjzVar3) ? 33554432 : 67108864;
        }
        if (baoVarD.L((38347923 & i3) != 38347922, i3 & 1)) {
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            Object obj = ban.a;
            if (objT == obj) {
                objT = new ayy((byte[]) null);
                basVar.ae(objT);
            }
            ayy ayyVar = (ayy) objT;
            bkp bkpVarX = bdi.x(bkpVar, 1.0f);
            int i5 = i3 & 458752;
            Object objT2 = basVar.T();
            if (i5 == 131072 || objT2 == obj) {
                objT2 = new afk(ayyVar, zrVar, 18, null);
                basVar.ae(objT2);
            }
            bkp bkpVarA = zt.a(zt.b(bkpVarX, (yjv) objT2), zrVar);
            boolean z = (i3 & 14) == 4 || ((i3 & 8) != 0 && baoVarD.H(mrVar));
            boolean z2 = (i3 & 7168) == 2048;
            boolean z3 = (i3 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32;
            int i6 = i3;
            boolean z4 = (i3 & 896) == 256;
            Object objT3 = basVar.T();
            if ((z4 | z3 | z | z2) || objT3 == obj) {
                aul aulVar = new aul(mrVar, ayyVar, bcbVar3, bdlVar, bcbVar);
                basVar.ae(aulVar);
                objT3 = aulVar;
            }
            bvt bvtVar = (bvt) objT3;
            int iO = zy.o(baoVarD);
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVarA);
            yjk yjkVar = bxt.a;
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            yjz yjzVar4 = bxt.d;
            beb.a(baoVarD, bvtVar, yjzVar4);
            yjz yjzVar5 = bxt.c;
            beb.a(baoVarD, bhuVarAi, yjzVar5);
            yjz yjzVar6 = bxt.e;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iO))) {
                Integer numValueOf = Integer.valueOf(iO);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar6);
            }
            yjz yjzVar7 = bxt.b;
            beb.a(baoVarD, bkpVarC, yjzVar7);
            bkp bkpVarP = bty.p("Surface");
            bkd bkdVar = bkb.a;
            bvt bvtVarA = xo.a(bkdVar, true);
            int iO2 = zy.o(baoVarD);
            bhu bhuVarAi2 = basVar.ai();
            bkp bkpVarC2 = bdi.C(baoVarD, bkpVarP);
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA, yjzVar4);
            beb.a(baoVarD, bhuVarAi2, yjzVar5);
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iO2))) {
                Integer numValueOf2 = Integer.valueOf(iO2);
                basVar.ae(numValueOf2);
                baoVarD.i(numValueOf2, yjzVar6);
            }
            beb.a(baoVarD, bkpVarC2, yjzVar7);
            yjzVar2.a(baoVarD, Integer.valueOf((i6 >> 21) & 14));
            baoVarD.o();
            bkp bkpVarP2 = bty.p("InputField");
            bvt bvtVarA2 = xo.a(bkdVar, true);
            int iO3 = zy.o(baoVarD);
            bhu bhuVarAi3 = basVar.ai();
            bkp bkpVarC3 = bdi.C(baoVarD, bkpVarP2);
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA2, yjzVar4);
            beb.a(baoVarD, bhuVarAi3, yjzVar5);
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iO3))) {
                Integer numValueOf3 = Integer.valueOf(iO3);
                basVar.ae(numValueOf3);
                baoVarD.i(numValueOf3, yjzVar6);
            }
            beb.a(baoVarD, bkpVarC3, yjzVar7);
            yjzVar.a(baoVarD, Integer.valueOf((i6 >> 18) & 14));
            baoVarD.o();
            if (yjzVar3 == null) {
                baoVarD.x(2058820276);
            } else {
                baoVarD.x(2058820277);
                bkp bkpVarP3 = bty.p("Content");
                bvt bvtVarA3 = xo.a(bkdVar, true);
                int iO4 = zy.o(baoVarD);
                bhu bhuVarAi4 = basVar.ai();
                bkp bkpVarC4 = bdi.C(baoVarD, bkpVarP3);
                baoVarD.z();
                if (basVar.w) {
                    baoVarD.k(yjkVar);
                } else {
                    baoVarD.B();
                }
                beb.a(baoVarD, bvtVarA3, yjzVar4);
                beb.a(baoVarD, bhuVarAi4, yjzVar5);
                if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iO4))) {
                    Integer numValueOf4 = Integer.valueOf(iO4);
                    basVar.ae(numValueOf4);
                    baoVarD.i(numValueOf4, yjzVar6);
                }
                beb.a(baoVarD, bkpVarC4, yjzVar7);
                yjzVar3.a(baoVarD, 0);
                baoVarD.o();
            }
            basVar.aa();
            baoVarD.o();
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new yjz() { // from class: aue
                @Override // defpackage.yjz
                public final Object a(Object obj2, Object obj3) {
                    bao baoVar2 = (bao) obj2;
                    ((Integer) obj3).intValue();
                    mr mrVar2 = mrVar;
                    bdl bdlVar2 = bdlVar;
                    bcb bcbVar4 = bcbVar;
                    bcb bcbVar5 = bcbVar2;
                    bkp bkpVar2 = bkpVar;
                    zr zrVar2 = zrVar;
                    yjz yjzVar8 = yjzVar;
                    int i7 = i2;
                    aun.a(mrVar2, bdlVar2, bcbVar4, bcbVar5, bkpVar2, zrVar2, yjzVar8, yjzVar2, yjzVar3, baoVar2, bdi.n(i7 | 1));
                    return ygi.a;
                }
            };
        }
    }

    public static final void b(final yjz yjzVar, final yjv yjvVar, final bkp bkpVar, bol bolVar, final atw atwVar, zr zrVar, final yka ykaVar, bao baoVar, final int i2) {
        yjz yjzVar2;
        int i3;
        atw atwVar2;
        bao baoVar2;
        final bol bolVar2;
        final zr zrVar2;
        bol bolVarA;
        boolean z;
        zr yuVar;
        zr zrVar3;
        mr mrVar;
        bao baoVarD = baoVar.d(1451547856);
        if ((i2 & 6) == 0) {
            yjzVar2 = yjzVar;
            i3 = (true != baoVarD.H(yjzVar2) ? 2 : 4) | i2;
        } else {
            yjzVar2 = yjzVar;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != baoVarD.G(true) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != baoVarD.H(yjvVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != baoVarD.F(bkpVar) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i2 & 24576) == 0) {
            i3 |= 8192;
        }
        if ((196608 & i2) == 0) {
            atwVar2 = atwVar;
            i3 |= true != baoVarD.F(atwVar2) ? 65536 : 131072;
        } else {
            atwVar2 = atwVar;
        }
        int i4 = 14155776 | i3;
        if ((100663296 & i2) == 0) {
            i4 = i3 | 47710208;
        }
        if ((805306368 & i2) == 0) {
            i4 |= true != baoVarD.H(ykaVar) ? 268435456 : 536870912;
        }
        if (baoVarD.L((306783379 & i4) != 306783378, i4 & 1)) {
            int i5 = i4 >> 24;
            int i6 = (-234938369) & i4;
            baoVarD.u();
            if ((i2 & 1) == 0 || baoVarD.I()) {
                bolVarA = aud.a(baoVarD);
                z = true;
                yuVar = new yu(zy.v(baoVarD), 31);
            } else {
                baoVarD.t();
                bolVarA = bolVar;
                z = true;
                yuVar = zrVar;
            }
            baoVarD.m();
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            Object obj = ban.a;
            if (objT == obj) {
                objT = bbn.a(yim.a, baoVarD);
                basVar.ae(objT);
            }
            yow yowVar = (yow) objT;
            Object objT2 = basVar.T();
            if (objT2 == obj) {
                objT2 = ms.a(1.0f);
                basVar.ae(objT2);
            }
            mr mrVar2 = (mr) objT2;
            Object objT3 = basVar.T();
            if (objT3 == obj) {
                zrVar3 = yuVar;
                objT3 = new bce(Float.NaN);
                basVar.ae(objT3);
            } else {
                zrVar3 = yuVar;
            }
            bdl bdlVar = (bdl) objT3;
            Object objT4 = basVar.T();
            if (objT4 == obj) {
                bci bciVar = new bci(null, bcz.c);
                basVar.ae(bciVar);
                objT4 = bciVar;
            }
            bcb bcbVar = (bcb) objT4;
            Object objT5 = basVar.T();
            if (objT5 == obj) {
                bci bciVar2 = new bci(null, bcz.c);
                basVar.ae(bciVar2);
                objT5 = bciVar2;
            }
            bcb bcbVar2 = (bcb) objT5;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zH = baoVarD.H(mrVar2) | ((i4 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32 ? z : false);
            Object objT6 = basVar.T();
            if (zH || objT6 == obj) {
                objT6 = new ajo(mrVar2, bdlVar, bcbVar, bcbVar2, (yih) null, 3);
                basVar.ae(objT6);
            }
            int i7 = i6 >> 3;
            bbn.f(boolValueOf, (yjz) objT6, baoVarD);
            Object objT7 = basVar.T();
            if (objT7 == obj) {
                objT7 = new bhi((char[]) null, (byte[]) null, (byte[]) null);
                basVar.ae(objT7);
            }
            bhi bhiVar = (bhi) objT7;
            boolean zH2 = baoVarD.H(mrVar2) | ((i4 & 896) == 256 ? z : false) | baoVarD.H(yowVar);
            Object objT8 = basVar.T();
            if (zH2 || objT8 == obj) {
                auj aujVar = new auj(bhiVar, bdlVar, mrVar2, yjvVar, yowVar, bcbVar, bcbVar2, null);
                mrVar = mrVar2;
                bcbVar2 = bcbVar2;
                bcbVar = bcbVar;
                bdlVar = bdlVar;
                basVar.ae(aujVar);
                objT8 = aujVar;
            } else {
                mrVar = mrVar2;
            }
            a.bV((yjz) objT8, baoVarD, i7 & 14);
            int i8 = i6 << 6;
            zr zrVar4 = zrVar3;
            baoVar2 = baoVarD;
            bol bolVar3 = bolVarA;
            c(mrVar, bdlVar, bcbVar, bcbVar2, bkpVar, yjzVar2, bolVar3, atwVar2, zrVar4, ykaVar, baoVar2, ((i6 << 3) & 57344) | 3512 | ((i6 << 15) & 458752) | (29360128 & i8) | (234881024 & i8) | (1879048192 & i8), i5 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
            bolVar2 = bolVar3;
            zrVar2 = zrVar4;
        } else {
            baoVar2 = baoVarD;
            baoVar2.t();
            bolVar2 = bolVar;
            zrVar2 = zrVar;
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new yjz() { // from class: auh
                @Override // defpackage.yjz
                public final Object a(Object obj2, Object obj3) {
                    bao baoVar3 = (bao) obj2;
                    ((Integer) obj3).intValue();
                    yjz yjzVar3 = yjzVar;
                    yjv yjvVar2 = yjvVar;
                    bkp bkpVar2 = bkpVar;
                    bol bolVar4 = bolVar2;
                    atw atwVar3 = atwVar;
                    int i9 = i2;
                    aun.b(yjzVar3, yjvVar2, bkpVar2, bolVar4, atwVar3, zrVar2, ykaVar, baoVar3, bdi.n(i9 | 1));
                    return ygi.a;
                }
            };
        }
    }

    public static final void c(final mr mrVar, final bdl bdlVar, final bcb bcbVar, final bcb bcbVar2, final bkp bkpVar, final yjz yjzVar, final bol bolVar, final atw atwVar, final zr zrVar, final yka ykaVar, bao baoVar, final int i2, final int i3) {
        int i4;
        int i5;
        bhq bhqVarK;
        int i6 = i2 & 6;
        bao baoVarD = baoVar.d(501752896);
        if (i6 == 0) {
            i4 = (true != ((i2 & 8) == 0 ? baoVarD.F(mrVar) : baoVarD.H(mrVar)) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != baoVarD.F(bdlVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != baoVarD.F(bcbVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i4 |= true != baoVarD.F(bcbVar2) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true != baoVarD.F(bkpVar) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i4 |= true != baoVarD.H(yjzVar) ? 65536 : 131072;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= true != baoVarD.F(bolVar) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            i4 |= true != baoVarD.F(atwVar) ? 4194304 : 8388608;
        }
        if ((100663296 & i2) == 0) {
            i4 |= true != baoVarD.C(0.0f) ? 33554432 : 67108864;
        }
        if ((805306368 & i2) == 0) {
            i4 |= true != baoVarD.C(0.0f) ? 268435456 : 536870912;
        }
        int i7 = i4;
        if ((i3 & 6) == 0) {
            i5 = i3 | (true != baoVarD.F(zrVar) ? 2 : 4);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= true != baoVarD.H(ykaVar) ? 16 : 32;
        }
        int i8 = i5;
        if (baoVarD.L(((306783379 & i7) == 306783378 && (i8 & 19) == 18) ? false : true, i7 & 1)) {
            baoVarD.u();
            if ((i2 & 1) != 0 && !baoVarD.I()) {
                baoVarD.t();
            }
            baoVarD.m();
            clx clxVar = (clx) baoVarD.f(ccq.d);
            bol bolVarA = aud.a(baoVarD);
            bol bolVarB = aur.b(14, baoVarD);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            Object obj = ban.a;
            if (objT == obj) {
                bcz bczVar = bcz.c;
                aoe aoeVar = new aoe(mrVar, 14);
                ivx ivxVar = bdt.a;
                bbh bbhVar = new bbh(aoeVar, bczVar);
                basVar.ae(bbhVar);
                objT = bbhVar;
            }
            bdy bdyVar = (bdy) objT;
            boolean zG = ((((i7 & 3670016) ^ 1572864) > 1048576 && baoVarD.F(bolVar)) || (i7 & 1572864) == 1048576) | baoVarD.G(((Boolean) bdyVar.a()).booleanValue());
            Object objT2 = basVar.T();
            if (zG || objT2 == obj) {
                bol aemVar = yks.e(bolVar, bolVarA) ? new aem(new auf(clxVar, mrVar, 0)) : ((Boolean) bdyVar.a()).booleanValue() ? bolVarB : bolVar;
                basVar.ae(aemVar);
                objT2 = aemVar;
            }
            bhq bhqVarK2 = bga.k(-1304392981, new acv((bol) objT2, atwVar, 19), baoVarD);
            Object objT3 = basVar.T();
            int i9 = 15;
            if (objT3 == obj) {
                bcz bczVar2 = bcz.c;
                aoe aoeVar2 = new aoe(mrVar, i9);
                ivx ivxVar2 = bdt.a;
                bbh bbhVar2 = new bbh(aoeVar2, bczVar2);
                basVar.ae(bbhVar2);
                objT3 = bbhVar2;
            }
            if (((Boolean) ((bdy) objT3).a()).booleanValue()) {
                baoVarD.x(1236615731);
                bhqVarK = bga.k(1831594093, new ano(mrVar, atwVar, ykaVar, 4, (char[]) null), baoVarD);
                basVar.aa();
            } else {
                baoVarD.x(1236851485);
                basVar.aa();
                bhqVarK = null;
            }
            int i10 = 57344 & i7;
            a(mrVar, bdlVar, bcbVar, bcbVar2, bkpVar, zrVar, yjzVar, bhqVarK2, bhqVarK, baoVarD, (i7 & 14) | 12582920 | (i7 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i7 & 896) | (i7 & 7168) | i10 | (458752 & (i8 << 15)) | ((i7 << 3) & 3670016));
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new yjz() { // from class: aug
                @Override // defpackage.yjz
                public final Object a(Object obj2, Object obj3) {
                    bao baoVar2 = (bao) obj2;
                    ((Integer) obj3).intValue();
                    mr mrVar2 = mrVar;
                    bdl bdlVar2 = bdlVar;
                    bcb bcbVar3 = bcbVar;
                    bcb bcbVar4 = bcbVar2;
                    bkp bkpVar2 = bkpVar;
                    yjz yjzVar2 = yjzVar;
                    bol bolVar2 = bolVar;
                    atw atwVar2 = atwVar;
                    int i11 = i2;
                    aun.c(mrVar2, bdlVar2, bcbVar3, bcbVar4, bkpVar2, yjzVar2, bolVar2, atwVar2, zrVar, ykaVar, baoVar2, bdi.n(i11 | 1), bdi.n(i3));
                    return ygi.a;
                }
            };
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [bdy, java.lang.Object] */
    public static final boolean d(cvi cviVar) {
        return ((auo) cviVar.c.a()) == auo.b;
    }

    public static final void e(kw kwVar, yjk yjkVar, bao baoVar, int i2) {
        int i3;
        int i4 = i2 & 6;
        bao baoVarD = baoVar.d(-652650823);
        if (i4 == 0) {
            i3 = (true != baoVarD.F(kwVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != baoVarD.H(yjkVar) ? 16 : 32;
        }
        if (baoVarD.L((i3 & 19) != 18, i3 & 1)) {
            boolean z = (i3 & 14) == 4;
            boolean z2 = (i3 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32;
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if ((z | z2) || objT == ban.a) {
                objT = new aoa(kwVar, yjkVar, (yih) null, 8);
                basVar.ae(objT);
            }
            bbn.f(kwVar, (yjz) objT, baoVarD);
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new qt(kwVar, yjkVar, i2, 17);
        }
    }
}
