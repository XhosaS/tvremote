package defpackage;

import android.content.Context;
import android.support.v7.appcompat.R;
import android.support.v7.widget.ActivityChooserView;
import android.view.View;
import androidx.compose.foundation.layout.WrapContentElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zy {
    public static final int A(bwj bwjVar) {
        if (bwjVar != null) {
            return bwjVar.a;
        }
        return 0;
    }

    public static final int B(int i, int i2) {
        return i == Integer.MAX_VALUE ? ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : ykn.j(i - i2, 0);
    }

    public static final Object C(buy buyVar) {
        Object objG = buyVar.g();
        bvd bvdVar = objG instanceof bvd ? (bvd) objG : null;
        if (bvdVar != null) {
            return bvdVar.a;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r18v1, types: [java.lang.Object, np] */
    /* JADX WARN: Type inference failed for: r18v2, types: [java.lang.Object, np] */
    /* JADX WARN: Type inference failed for: r18v3, types: [java.lang.Object, np] */
    /* JADX WARN: Type inference failed for: r18v4, types: [java.lang.Object, np] */
    /* JADX WARN: Type inference failed for: r18v5, types: [java.lang.Object, np] */
    public static final void D(final CharSequence charSequence, final yjz yjzVar, final a aVar, final yjz yjzVar2, final yjz yjzVar3, final yjz yjzVar4, final boolean z, final boolean z2, final kw kwVar, final yy yyVar, final awu awuVar, final yjz yjzVar5, bao baoVar, final int i, final int i2) {
        int i3;
        CharSequence charSequence2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z3;
        bao baoVar2;
        boolean z4;
        long j;
        float f;
        float f2;
        bhq bhqVar;
        bhq bhqVar2;
        bhq bhqVar3;
        bao baoVarD = baoVar.d(546805032);
        if ((i & 6) == 0) {
            i3 = (true != baoVarD.D(0) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            charSequence2 = charSequence;
            i3 |= true != baoVarD.H(charSequence2) ? 16 : 32;
        } else {
            charSequence2 = charSequence;
        }
        if ((i & 384) == 0) {
            i3 |= true != baoVarD.H(yjzVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != baoVarD.F(aVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != baoVarD.H(null) ? 8192 : 16384;
        }
        if ((i & 196608) == 0) {
            i4 = 196608;
            i3 |= true != baoVarD.H(yjzVar2) ? 65536 : 131072;
        } else {
            i4 = 196608;
        }
        if ((i & 1572864) == 0) {
            i5 = 1572864;
            i3 |= true != baoVarD.H(yjzVar3) ? 524288 : 1048576;
        } else {
            i5 = 1572864;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != baoVarD.H(yjzVar4) ? 4194304 : 8388608;
        }
        int i9 = i3;
        if ((100663296 & i) == 0) {
            i3 = i9 | (true != baoVarD.H(null) ? 33554432 : 67108864);
        }
        int i10 = i3;
        if ((805306368 & i) == 0) {
            i3 = i10 | (true != baoVarD.H(null) ? 268435456 : 536870912);
        }
        if ((i2 & 6) == 0) {
            i6 = i3;
            i7 = (true != baoVarD.H(null) ? 2 : 4) | i2;
        } else {
            i6 = i3;
            i7 = i2;
        }
        if ((i2 & 48) == 0) {
            i7 |= true != baoVarD.G(z) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i8 = i7 | (true == baoVarD.G(z2) ? 256 : 128);
        } else {
            i8 = i7;
        }
        if ((i2 & 3072) == 0) {
            z3 = true;
            i8 |= true == baoVarD.G(false) ? 2048 : 1024;
        } else {
            z3 = true;
        }
        if ((i2 & 24576) == 0) {
            i8 |= z3 != baoVarD.F(kwVar) ? 8192 : 16384;
        }
        if ((i2 & i4) == 0) {
            i8 |= z3 != baoVarD.F(yyVar) ? 65536 : 131072;
        }
        if ((i2 & i5) == 0) {
            i8 |= z3 != baoVarD.F(awuVar) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            i8 |= true != baoVarD.H(yjzVar5) ? 4194304 : 8388608;
        }
        if (baoVarD.L(((i6 & 306783379) == 306783378 && (4793491 & i8) == 4793490) ? false : true, i6 & 1)) {
            boolean zBooleanValue = ((Boolean) a.bI(kwVar, baoVarD, (i8 >> 12) & 14).a()).booleanValue();
            ayt aytVar = zBooleanValue ? ayt.a : charSequence2.length() == 0 ? ayt.b : ayt.c;
            if (z2) {
                z4 = zBooleanValue;
                j = z4 ? awuVar.o : awuVar.p;
            } else {
                z4 = zBooleanValue;
                j = awuVar.q;
            }
            axg axgVarN = wv.N(baoVarD);
            int i11 = i8;
            chc chcVar = axgVarN.j;
            chc chcVar2 = axgVarN.l;
            long jE = chcVar.e();
            long j2 = bnq.g;
            boolean z5 = (a.s(jE, j2) && !a.s(chcVar2.e(), j2)) || (!a.s(chcVar.e(), j2) && a.s(chcVar2.e(), j2));
            long jE2 = chcVar2.e();
            if (z5 && jE2 == 16) {
                jE2 = j;
            }
            long jE3 = chcVar.e();
            long j3 = (z5 && jE3 == 16) ? j : jE3;
            pf pfVarD = pi.d(aytVar, "TextFieldInputState", baoVarD, 48);
            ro roVar = new ro(wv.F(2, baoVarD), 13);
            bhi bhiVar = pm.a;
            ayt aytVar2 = (ayt) pfVarD.f();
            baoVarD.x(-1436405362);
            int iOrdinal = aytVar2.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                bas basVar = (bas) baoVarD;
                basVar.aa();
                Float fValueOf = Float.valueOf(1.0f);
                ayt aytVar3 = (ayt) pfVarD.g();
                baoVarD.x(-1436405362);
                int iOrdinal2 = aytVar3.ordinal();
                if (iOrdinal2 == 0 || iOrdinal2 == 1 || iOrdinal2 == 2) {
                    basVar.aa();
                    final bdy bdyVarE = pi.e(pfVarD, fValueOf, fValueOf, roVar.a(pfVarD.e(), baoVarD, 0), bhiVar, baoVarD, 196608);
                    np npVarF = wv.F(5, baoVarD);
                    long j4 = jE2;
                    azi aziVar = new azi(npVarF, wv.F(6, baoVarD), 0);
                    ayt aytVar4 = (ayt) pfVarD.f();
                    baoVarD.x(-1093194547);
                    int iOrdinal3 = aytVar4.ordinal();
                    if (iOrdinal3 != 0 && iOrdinal3 != 1) {
                        f = iOrdinal3 == 2 ? 0.0f : 1.0f;
                        throw new yfu();
                    }
                    basVar.aa();
                    Float fValueOf2 = Float.valueOf(f);
                    ayt aytVar5 = (ayt) pfVarD.g();
                    baoVarD.x(-1093194547);
                    int iOrdinal4 = aytVar5.ordinal();
                    if (iOrdinal4 != 0 && iOrdinal4 != 1) {
                        f2 = iOrdinal4 == 2 ? 0.0f : 1.0f;
                        throw new yfu();
                    }
                    basVar.aa();
                    bdy bdyVarE2 = pi.e(pfVarD, fValueOf2, Float.valueOf(f2), aziVar.a(pfVarD.e(), baoVarD, 0), bhiVar, baoVarD, 196608);
                    ro roVar2 = new ro(npVarF, 15);
                    ayt aytVar6 = (ayt) pfVarD.f();
                    baoVarD.x(-1258455321);
                    int iOrdinal5 = aytVar6.ordinal();
                    if (iOrdinal5 == 0 || iOrdinal5 == 1 || iOrdinal5 == 2) {
                        basVar.aa();
                        ayt aytVar7 = (ayt) pfVarD.g();
                        baoVarD.x(-1258455321);
                        int iOrdinal6 = aytVar7.ordinal();
                        if (iOrdinal6 == 0 || iOrdinal6 == 1 || iOrdinal6 == 2) {
                            basVar.aa();
                            bdy bdyVarE3 = pi.e(pfVarD, fValueOf, fValueOf, roVar2.a(pfVarD.e(), baoVarD, 0), bhiVar, baoVarD, 196608);
                            np npVarF2 = wv.F(5, baoVarD);
                            ro roVar3 = new ro(npVarF2, 14);
                            ayt aytVar8 = (ayt) pfVarD.g();
                            baoVarD.x(-12973394);
                            int[] iArr = azj.a;
                            long j5 = iArr[aytVar8.ordinal()] == 1 ? j4 : j3;
                            basVar.aa();
                            bov bovVarF = bnq.f(j5);
                            boolean zF = baoVarD.F(bovVarF);
                            Object objT = basVar.T();
                            if (zF || objT == ban.a) {
                                objT = lw.a.a(bovVarF);
                                basVar.ae(objT);
                            }
                            bhi bhiVar2 = (bhi) objT;
                            ayt aytVar9 = (ayt) pfVarD.f();
                            baoVarD.x(-12973394);
                            long j6 = iArr[aytVar9.ordinal()] == 1 ? j4 : j3;
                            basVar.aa();
                            bnq bnqVar = new bnq(j6);
                            ayt aytVar10 = (ayt) pfVarD.g();
                            baoVarD.x(-12973394);
                            long j7 = iArr[aytVar10.ordinal()] != 1 ? j3 : j4;
                            basVar.aa();
                            pi.e(pfVarD, bnqVar, new bnq(j7), roVar3.a(pfVarD.e(), baoVarD, 0), bhiVar2, baoVarD, 196608);
                            ro roVar4 = new ro(npVarF2, 12);
                            baoVarD.x(-464752477);
                            basVar.aa();
                            bov bovVarF2 = bnq.f(j);
                            boolean zF2 = baoVarD.F(bovVarF2);
                            Object objT2 = basVar.T();
                            if (zF2 || objT2 == ban.a) {
                                objT2 = lw.a.a(bovVarF2);
                                basVar.ae(objT2);
                            }
                            bhi bhiVar3 = (bhi) objT2;
                            baoVarD.x(-464752477);
                            basVar.aa();
                            bnq bnqVar2 = new bnq(j);
                            baoVarD.x(-464752477);
                            basVar.aa();
                            pi.e(pfVarD, bnqVar2, new bnq(j), roVar4.a(pfVarD.e(), baoVarD, 0), bhiVar3, baoVarD, 196608);
                            Object objT3 = basVar.T();
                            Object obj = ban.a;
                            if (objT3 == obj) {
                                objT3 = new zy();
                                basVar.ae(objT3);
                            }
                            baoVarD.x(-1891724857);
                            basVar.aa();
                            long j8 = !z2 ? awuVar.t : z4 ? awuVar.r : awuVar.s;
                            Object objT4 = basVar.T();
                            if (objT4 == obj) {
                                bcz bczVar = bcz.c;
                                awa awaVar = new awa(bdyVarE2, 8);
                                ivx ivxVar = bdt.a;
                                bbh bbhVar = new bbh(awaVar, bczVar);
                                basVar.ae(bbhVar);
                                objT4 = bbhVar;
                            }
                            bdy bdyVar = (bdy) objT4;
                            if (charSequence.length() == 0 && ((Boolean) bdyVar.a()).booleanValue()) {
                                baoVarD.x(-1890614312);
                                bhq bhqVarK = bga.k(1405547205, new azh(bdyVarE2, j8, chcVar, yjzVar2), baoVarD);
                                basVar.aa();
                                bhqVar = bhqVarK;
                            } else {
                                baoVarD.x(-1890217110);
                                basVar.aa();
                                bhqVar = null;
                            }
                            Object objT5 = basVar.T();
                            if (objT5 == obj) {
                                bcz bczVar2 = bcz.c;
                                awa awaVar2 = new awa(bdyVarE3, 9);
                                ivx ivxVar2 = bdt.a;
                                bbh bbhVar2 = new bbh(awaVar2, bczVar2);
                                basVar.ae(bbhVar2);
                                objT5 = bbhVar2;
                            }
                            baoVarD.x(-1889500886);
                            basVar.aa();
                            baoVarD.x(-1888924534);
                            basVar.aa();
                            long j9 = !z2 ? awuVar.k : z4 ? awuVar.i : awuVar.j;
                            if (yjzVar3 == null) {
                                baoVarD.x(-1888749663);
                                basVar.aa();
                                bhqVar2 = null;
                            } else {
                                baoVarD.x(-1888749662);
                                bhq bhqVarK2 = bga.k(-1736293487, new aor(j9, yjzVar3, 2), baoVarD);
                                basVar.aa();
                                bhqVar2 = bhqVarK2;
                            }
                            long j10 = !z2 ? awuVar.n : z4 ? awuVar.l : awuVar.m;
                            if (yjzVar4 == null) {
                                baoVarD.x(-1888469888);
                                basVar.aa();
                                bhqVar3 = null;
                            } else {
                                baoVarD.x(-1888469887);
                                bhq bhqVarK3 = bga.k(1334518521, new aor(j10, yjzVar4, 3), baoVarD);
                                basVar.aa();
                                bhqVar3 = bhqVarK3;
                            }
                            baoVarD.x(-1888176380);
                            basVar.aa();
                            baoVarD.x(-1887830698);
                            a.cb(bkp.g, yjzVar, bhqVar, bhqVar2, bhqVar3, z, aVar, new azk(new ykx(bdyVarE) { // from class: azf
                                @Override // defpackage.ykx
                                public final Object b() {
                                    return ((bdy) this.e).a();
                                }
                            }), bga.k(-1729858187, new azg(yjzVar5, 0), baoVarD), yyVar, baoVarD, ((i11 << 21) & 234881024) | ((i6 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | ((i6 << 18) & 1879048192), ((i11 >> 6) & 7168) | 48);
                            baoVar2 = baoVarD;
                            basVar.aa();
                        }
                    }
                    throw new yfu();
                }
            }
            throw new yfu();
        }
        baoVar2 = baoVarD;
        baoVar2.t();
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new yjz() { // from class: aze
                @Override // defpackage.yjz
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    CharSequence charSequence3 = charSequence;
                    yjz yjzVar6 = yjzVar;
                    a aVar2 = aVar;
                    yjz yjzVar7 = yjzVar2;
                    yjz yjzVar8 = yjzVar3;
                    yjz yjzVar9 = yjzVar4;
                    boolean z6 = z;
                    boolean z7 = z2;
                    kw kwVar2 = kwVar;
                    yy yyVar2 = yyVar;
                    awu awuVar2 = awuVar;
                    int i12 = i;
                    zy.D(charSequence3, yjzVar6, aVar2, yjzVar7, yjzVar8, yjzVar9, z6, z7, kwVar2, yyVar2, awuVar2, yjzVar5, (bao) obj2, bdi.n(i12 | 1), bdi.n(i2));
                    return ygi.a;
                }
            };
        }
    }

    public static final void a(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void b(String str) {
        throw new IllegalStateException("All weights <= 0 should have placeables");
    }

    public static final WrapContentElement c(bkh bkhVar) {
        return new WrapContentElement(1, new xa(bkhVar, 4), bkhVar);
    }

    public static final WrapContentElement d(bkd bkdVar) {
        return new WrapContentElement(3, new xa(bkdVar, 5), bkdVar);
    }

    public static final WrapContentElement e(bkc bkcVar) {
        return new WrapContentElement(2, new xa(bkcVar, 3), bkcVar);
    }

    public static final yp f(csr csrVar) {
        return new yp(csrVar.b, csrVar.c, csrVar.d, csrVar.e);
    }

    public static final zp g(csr csrVar, String str) {
        return new zp(f(csrVar), str);
    }

    public static final bkp h(bkp bkpVar) {
        return bdi.E(bkpVar, new zu(0));
    }

    public static final zs j(bao baoVar) {
        zs zsVar;
        View view = (View) baoVar.f(AndroidCompositionLocals_androidKt.f);
        WeakHashMap weakHashMap = zs.a;
        synchronized (weakHashMap) {
            Object zsVar2 = weakHashMap.get(view);
            if (zsVar2 == null) {
                zsVar2 = new zs(view);
                weakHashMap.put(view, zsVar2);
            }
            zsVar = (zs) zsVar2;
        }
        boolean zH = baoVar.H(zsVar) | baoVar.H(view);
        Object objG = baoVar.g();
        if (zH || objG == ban.a) {
            objG = new ox(zsVar, view, 16);
            baoVar.A(objG);
        }
        bbn.c(zsVar, (yjv) objG, baoVar);
        return zsVar;
    }

    public static final void k(bkp bkpVar, bao baoVar) {
        zk zkVar = zk.a;
        int iK = a.k(p(baoVar));
        bkp bkpVarC = bdi.C(baoVar, bkpVar);
        bhu bhuVarO = baoVar.O();
        yjk yjkVar = bxt.a;
        baoVar.c();
        baoVar.z();
        if (baoVar.J()) {
            baoVar.k(yjkVar);
        } else {
            baoVar.B();
        }
        beb.a(baoVar, zkVar, bxt.d);
        beb.a(baoVar, bhuVarO, bxt.c);
        beb.a(baoVar, bkpVarC, bxt.b);
        yjz yjzVar = bxt.e;
        if (baoVar.J() || !yks.e(baoVar.g(), Integer.valueOf(iK))) {
            Integer numValueOf = Integer.valueOf(iK);
            baoVar.A(numValueOf);
            baoVar.i(numValueOf, yjzVar);
        }
        baoVar.o();
    }

    public static /* synthetic */ bvu m(zd zdVar, int i, int i2, int i3, int i4, int i5, bvv bvvVar, List list, bwj[] bwjVarArr, int i6) {
        int i7;
        int i8;
        float f;
        int i9;
        int i10;
        int i11;
        int i12 = i3;
        int i13 = i4;
        int[] iArr = new int[i6];
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int iMin = 0;
        int iMax = 0;
        float f2 = 0.0f;
        while (true) {
            i7 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            if (i14 >= i6) {
                break;
            }
            bvs bvsVar = (bvs) list.get(i14);
            float fJ = wv.j(wv.k(bvsVar));
            if (fJ > 0.0f) {
                f2 += fJ;
                i15++;
                i10 = i14;
            } else {
                int i17 = i12 - i16;
                int i18 = i13 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i13;
                bwj bwjVarU = bwjVarArr[i14];
                if (bwjVarU != null) {
                    i10 = i14;
                    i11 = i15;
                } else if (i12 == Integer.MAX_VALUE) {
                    i10 = i14;
                    int i19 = i18;
                    i11 = i15;
                    bwjVarU = bvsVar.u(zdVar.i(0, i7, i19, false));
                } else if (i17 < 0) {
                    i7 = 0;
                    i10 = i14;
                    int i192 = i18;
                    i11 = i15;
                    bwjVarU = bvsVar.u(zdVar.i(0, i7, i192, false));
                } else {
                    i10 = i14;
                    i7 = i17;
                    int i1922 = i18;
                    i11 = i15;
                    bwjVarU = bvsVar.u(zdVar.i(0, i7, i1922, false));
                }
                bwj bwjVar = bwjVarU;
                int iG = zdVar.g(bwjVar);
                int iF = zdVar.f(bwjVar);
                iArr[i10] = iG;
                int i20 = i17 - iG;
                if (i20 < 0) {
                    i20 = 0;
                }
                iMin = Math.min(i5, i20);
                i16 += iG + iMin;
                iMax = Math.max(iMax, iF);
                bwjVarArr[i10] = bwjVar;
                i15 = i11;
            }
            i14 = i10 + 1;
        }
        if (i15 == 0) {
            i16 -= iMin;
            i8 = 0;
        } else {
            int i21 = i12 - i16;
            long j = i5;
            if (i12 == Integer.MAX_VALUE) {
                i12 = i;
            }
            long j2 = j * (r19 - 1);
            long jRound = (i12 - i16) - j2;
            if (jRound < 0) {
                jRound = 0;
            }
            float f3 = jRound / f2;
            for (int i22 = 0; i22 < i6; i22++) {
                jRound -= Math.round(wv.j(wv.k((bvs) list.get(i22))) * f3);
            }
            int i23 = 0;
            int i24 = 0;
            while (i23 < i6) {
                if (bwjVarArr[i23] == null) {
                    bvs bvsVar2 = (bvs) list.get(i23);
                    f = f3;
                    ze zeVarK = wv.k(bvsVar2);
                    float fJ2 = wv.j(zeVarK);
                    int i25 = i13 == i7 ? i7 : i13;
                    if (fJ2 <= 0.0f) {
                        b("All weights <= 0 should have placeables");
                    }
                    int iSignum = Long.signum(jRound);
                    i9 = i23;
                    jRound -= iSignum;
                    int iMax2 = Math.max(0, Math.round(f * fJ2) + iSignum);
                    bwj bwjVarU2 = bvsVar2.u(zdVar.i(((zeVarK == null || zeVarK.b) && iMax2 != Integer.MAX_VALUE) ? iMax2 : 0, iMax2, i25, true));
                    int iG2 = zdVar.g(bwjVarU2);
                    int iF2 = zdVar.f(bwjVarU2);
                    iArr[i9] = iG2;
                    i24 += iG2;
                    iMax = Math.max(iMax, iF2);
                    bwjVarArr[i9] = bwjVarU2;
                } else {
                    f = f3;
                    i9 = i23;
                }
                i23 = i9 + 1;
                i13 = i4;
                f3 = f;
                i7 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            }
            int i26 = (int) (i24 + j2);
            if (i26 < 0) {
                i26 = 0;
            }
            i8 = i26 > i21 ? i21 : i26;
        }
        int i27 = i16 + i8;
        if (i27 < 0) {
            i27 = 0;
        }
        int iMax3 = Math.max(i27, i);
        int iMax4 = Math.max(iMax, Math.max(i2, 0));
        int[] iArr2 = new int[i6];
        zdVar.h(iMax3, iArr, iArr2, bvvVar);
        return zdVar.j(bwjVarArr, bvvVar, iArr2, iMax3, iMax4);
    }

    public static final void n() {
        throw new IllegalStateException("Invalid applier");
    }

    public static final int o(bao baoVar) {
        return baoVar.a();
    }

    public static final long p(bao baoVar) {
        return baoVar.b();
    }

    public static final bcr q(bao baoVar) {
        bcr bcrVarQ = ((bas) baoVar).Q();
        if (bcrVarQ == null) {
            throw new IllegalStateException("no recompose scope found");
        }
        bcrVarQ.n();
        return bcrVarQ;
    }

    public static final baw r(bao baoVar) {
        bas basVar = (bas) baoVar;
        basVar.ad(206, bau.e);
        if (basVar.w) {
            bdj.V(basVar.r);
        }
        Object objS = basVar.S();
        baq baqVar = objS instanceof baq ? (baq) objS : null;
        if (baqVar == null) {
            baqVar = new baq(new bar(basVar, basVar.x, basVar.h, basVar.n));
            basVar.ag(baqVar);
        }
        bhu bhuVarAi = basVar.ai();
        bar barVar = baqVar.a;
        barVar.b.b(bhuVarAi);
        basVar.aa();
        return barVar;
    }

    public static final void s(long j, chc chcVar, yjz yjzVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(396611577);
        if (i3 == 0) {
            i2 = (true != baoVarD.E(j) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(chcVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 128 : 256;
        }
        if (baoVarD.L((i2 & 147) != 146, i2 & 1)) {
            x(j, chcVar, yjzVar, baoVarD, i2 & 1022);
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new azd(j, chcVar, yjzVar, i, 2);
        }
    }

    public static final void t(long j, yjz yjzVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(590397809);
        if (i3 == 0) {
            i2 = (true != baoVarD.E(j) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 16 : 32;
        }
        if (baoVarD.L((i2 & 19) != 18, i2 & 1)) {
            bcm.i(arr.a.c(new bnq(j)), yjzVar, baoVarD, (i2 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8);
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kpi(j, yjzVar, i, 1);
        }
    }

    public static final zr v(bao baoVar) {
        WeakHashMap weakHashMap = zs.a;
        return new zl(j(baoVar).e, j(baoVar).b);
    }

    public static final String w(int i, bao baoVar) {
        baoVar.f(AndroidCompositionLocals_androidKt.a);
        return ((Context) baoVar.f(AndroidCompositionLocals_androidKt.b)).getResources().getString(i);
    }

    public static final void x(long j, chc chcVar, yjz yjzVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-684938728);
        if (i3 == 0) {
            i2 = (true != baoVarD.E(j) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(chcVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 128 : 256;
        }
        if (baoVarD.L((i2 & 147) != 146, i2 & 1)) {
            bcp bcpVar = axa.a;
            bcm.j(new bcq[]{arr.a.c(new bnq(j)), bcpVar.c(((chc) baoVarD.f(bcpVar)).j(chcVar))}, yjzVar, baoVarD, ((i2 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8);
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new azd(j, chcVar, yjzVar, i, 0);
        }
    }

    public static final float y(float f) {
        return ayi.a.a(f);
    }

    public static final int z(bwj bwjVar) {
        if (bwjVar != null) {
            return bwjVar.b;
        }
        return 0;
    }
}
