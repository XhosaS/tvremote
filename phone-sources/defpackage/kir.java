package defpackage;

import android.net.Uri;
import android.support.v7.appcompat.R;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kir {
    public static final kiu a(View view, String str) {
        return jwq.X(view.getContext()) ? new kit(view, str) : new kiv(view, str);
    }

    public static final int b(int i, RecyclerView recyclerView) {
        int decoratedLeft;
        int paddingLeft;
        if (i == -1) {
            return 0;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            throw new IllegalStateException("Required value was null.");
        }
        View viewFindViewByPosition = layoutManager.findViewByPosition(i);
        if (viewFindViewByPosition == null) {
            return 0;
        }
        int[] iArr = cww.a;
        if (recyclerView.getLayoutDirection() == 1) {
            recyclerView.getWidth();
            decoratedLeft = -layoutManager.getDecoratedRight(viewFindViewByPosition);
            paddingLeft = recyclerView.getPaddingRight();
        } else {
            decoratedLeft = layoutManager.getDecoratedLeft(viewFindViewByPosition);
            paddingLeft = recyclerView.getPaddingLeft();
        }
        return decoratedLeft - paddingLeft;
    }

    public static final int c(wkn wknVar) {
        wknVar.getClass();
        int iOrdinal = wknVar.ordinal();
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? 0 : 1;
        }
        return 2;
    }

    public static final void d(final yjk yjkVar, final String str, final bkp bkpVar, final int i, long j, long j2, bao baoVar, final int i2) {
        int i3;
        bao baoVar2;
        final long j3;
        final long j4;
        yjkVar.getClass();
        str.getClass();
        bao baoVarD = baoVar.d(-472266723);
        if ((i2 & 6) == 0) {
            i3 = (true != baoVarD.H(yjkVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != baoVarD.F(str) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != baoVarD.F(bkpVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != baoVarD.D(i) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        int i4 = 221184 | i3;
        if ((74899 & i4) == 74898 && baoVarD.K()) {
            baoVarD.t();
            j3 = j;
            j4 = j2;
            baoVar2 = baoVarD;
        } else {
            long j5 = kni.a;
            long j6 = kni.a;
            long j7 = kni.b;
            bkp bkpVarL = ht.l(bga.w(bkpVar, aep.a(24.0f)), 1.5f, j6, aep.a(24.0f));
            yy yyVar = kni.c;
            yy yyVar2 = arc.a;
            og.M(yjkVar, bkpVarL, false, null, arc.b(bnq.f, 0L, 0L, 0L, baoVarD, 14), null, null, yyVar, null, bga.k(126845965, new knk(i, j7, str), baoVarD), baoVarD, (i4 & 14) | 817889280, 364);
            baoVar2 = baoVarD;
            j3 = j6;
            j4 = j7;
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new yjz() { // from class: knj
                @Override // defpackage.yjz
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    yjk yjkVar2 = yjkVar;
                    String str2 = str;
                    bkp bkpVar2 = bkpVar;
                    int i5 = i;
                    long j8 = j3;
                    kir.d(yjkVar2, str2, bkpVar2, i5, j8, j4, (bao) obj, bdi.n(i2 | 1));
                    return ygi.a;
                }
            };
        }
    }

    public static final void e(int i, bao baoVar, final int i2) {
        int i3;
        final int i4;
        int i5 = i2 & 6;
        bao baoVarD = baoVar.d(1994508988);
        if (i5 == 0) {
            i3 = (true != baoVarD.D(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && baoVarD.K()) {
            baoVarD.t();
            i4 = i;
        } else {
            i4 = i;
            f(i4, 24.0f, wv.K(baoVarD).F, zi.e(bkp.g, rdd.H(0)), baoVarD, (i3 & 14) | 48);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new yjz() { // from class: knc
                @Override // defpackage.yjz
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i6 = i2;
                    kir.e(i4, (bao) obj, bdi.n(i6 | 1));
                    return ygi.a;
                }
            };
        }
    }

    public static final void f(int i, float f, long j, bkp bkpVar, bao baoVar, int i2) {
        int i3;
        bkp bkpVar2;
        bao baoVar2;
        int i4 = i2 & 6;
        bao baoVarD = baoVar.d(-1316112237);
        if (i4 == 0) {
            i3 = (true != baoVarD.D(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != baoVarD.C(f) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != baoVarD.E(j) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            bkpVar2 = bkpVar;
            i3 |= true != baoVarD.F(bkpVar2) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        } else {
            bkpVar2 = bkpVar;
        }
        if ((i3 & 1171) == 1170 && baoVarD.K()) {
            baoVarD.t();
            baoVar2 = baoVarD;
        } else {
            baoVar2 = baoVarD;
            awq.c(bkpVar2, rdd.F(baoVarD), j, wv.K(baoVarD).s, 0.0f, 0.0f, bga.k(892510382, new kne(i, f), baoVarD), baoVar2, R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new knd(i, f, j, bkpVar, i2, 0);
        }
    }

    public static final void g(bao baoVar, int i) {
        int i2;
        bao baoVarD = baoVar.d(-1561222576);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.D(com.google.android.videos.R.drawable.gs_history_vd_theme_24) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && baoVarD.K()) {
            baoVarD.t();
        } else {
            f(com.google.android.videos.R.drawable.gs_history_vd_theme_24, 20.0f, wv.K(baoVarD).H, zi.e(bkp.g, a.j((a.r(0, 0) ? 8.0f : a.r(0, 1) ? 12.0f : a.r(0, 2) ? 20.0f : 0.0f) + 20.0f, 32.0f)), baoVarD, (i2 & 14) | 48);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new jtq(i, 3);
        }
    }

    public static final void h(final String str, chc chcVar, chc chcVar2, final bkp bkpVar, final long j, int i, float f, bao baoVar, final int i2) {
        String str2;
        int i3;
        chc chcVar3;
        chc chcVar4;
        float f2;
        int i4;
        bao baoVar2;
        final float f3;
        final int i5;
        chcVar.getClass();
        chcVar2.getClass();
        bao baoVarD = baoVar.d(1860973325);
        if ((i2 & 6) == 0) {
            str2 = str;
            i3 = (true != baoVarD.F(str2) ? 2 : 4) | i2;
        } else {
            str2 = str;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            chcVar3 = chcVar;
            i3 |= true != baoVarD.F(chcVar3) ? 16 : 32;
        } else {
            chcVar3 = chcVar;
        }
        if ((i2 & 384) == 0) {
            chcVar4 = chcVar2;
            i3 |= true != baoVarD.F(chcVar4) ? 128 : 256;
        } else {
            chcVar4 = chcVar2;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != baoVarD.D(4) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != baoVarD.F(bkpVar) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != baoVarD.E(j) ? 65536 : 131072;
        }
        int i6 = i3 | 14155776;
        if ((4793491 & i6) == 4793490 && baoVarD.K()) {
            baoVarD.t();
            i5 = i;
            f3 = f;
            baoVar2 = baoVarD;
        } else {
            baoVarD.u();
            if ((i2 & 1) == 0 || baoVarD.I()) {
                f2 = 208.0f;
                i4 = 2;
            } else {
                baoVarD.t();
                i4 = i;
                f2 = f;
            }
            baoVarD.m();
            float fCr = ((clx) baoVarD.f(ccq.d)).cr(f2);
            baoVarD.x(1849434622);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            Object obj = ban.a;
            if (objT == obj) {
                bci bciVar = new bci(false, bcz.c);
                basVar.ae(bciVar);
                objT = bciVar;
            }
            bcb bcbVar = (bcb) objT;
            basVar.aa();
            chc chcVar5 = true != ((Boolean) bcbVar.a()).booleanValue() ? chcVar3 : chcVar4;
            baoVarD.x(-1633490746);
            boolean zC = baoVarD.C(fCr);
            Object objT2 = basVar.T();
            if (zC || objT2 == obj) {
                objT2 = new sh(fCr, bcbVar, 4);
                basVar.ae(objT2);
            }
            basVar.aa();
            int i7 = i6 >> 9;
            baoVar2 = baoVarD;
            axa.b(str2, bkpVar, j, 0L, null, 0L, null, 0L, i4, false, 4, 0, (yjv) objT2, chcVar5, baoVar2, (i6 & 14) | (i7 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i7 & 896), ((i6 >> 12) & 896) | ((i6 << 3) & 57344), 45048);
            f3 = f2;
            i5 = i4;
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            final chc chcVar6 = chcVar3;
            final chc chcVar7 = chcVar4;
            bcrVarM.d = new yjz() { // from class: kna
                @Override // defpackage.yjz
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    String str3 = str;
                    chc chcVar8 = chcVar6;
                    chc chcVar9 = chcVar7;
                    bkp bkpVar2 = bkpVar;
                    long j2 = j;
                    int i8 = i5;
                    kir.h(str3, chcVar8, chcVar9, bkpVar2, j2, i8, f3, (bao) obj2, bdi.n(i2 | 1));
                    return ygi.a;
                }
            };
        }
    }

    public static boolean i(vza vzaVar) {
        return vzaVar.d.equalsIgnoreCase("HDR");
    }

    public static int j(int i) {
        switch (i - 2) {
            case 1:
                return 7;
            case 2:
                return 8;
            case 3:
                return 9;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            default:
                return 2;
        }
    }

    public static long k(vdm vdmVar) {
        vwe vweVar;
        int i = vdmVar.b;
        if (i == 1) {
            vweVar = ((vdl) vdmVar.c).e;
            if (vweVar == null) {
                vweVar = vwe.a;
            }
        } else {
            vweVar = i == 2 ? (vwe) vdmVar.c : vwe.a;
        }
        return vweVar.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.ktz l(java.util.List r11) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kir.l(java.util.List):ktz");
    }

    public static kvm m(int i) {
        int i2 = i - 2;
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? kvm.TYPE_UNSPECIFIED : kvm.TYPE_FREE_WITH_ADS : kvm.TYPE_SUBSCRIPTION : kvm.TYPE_PURCHASE : kvm.TYPE_RENTAL;
    }

    public static kvn n(int i) {
        int i2 = i - 2;
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? kvn.QUALITY_UNSPECIFIED : kvn.QUALITY_3D : kvn.QUALITY_UHD1 : kvn.QUALITY_HD : kvn.QUALITY_SD;
    }

    public static tst o(vcb vcbVar) {
        int i;
        tst tstVarI;
        tst tstVarI2;
        Uri uri = Uri.parse(vcbVar.b);
        switch (vcbVar.c) {
            case 0:
                i = 2;
                break;
            case 1:
                i = 3;
                break;
            case 2:
                i = 4;
                break;
            case 3:
                i = 5;
                break;
            case 4:
                i = 6;
                break;
            case 5:
                i = 7;
                break;
            case 6:
                i = 8;
                break;
            case 7:
                i = 9;
                break;
            case 8:
                i = 10;
                break;
            case 9:
                i = 11;
                break;
            case 10:
                i = 12;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            i = 1;
        }
        switch (i - 2) {
            case 0:
                tstVarI = tst.i(kuu.TYPE_UNSPECIFIED);
                break;
            case 1:
                tstVarI = tst.i(kuu.TYPE_LOGO);
                break;
            case 2:
                tstVarI = tst.i(kuu.TYPE_BANNER);
                break;
            case 3:
                tstVarI = tst.i(kuu.TYPE_POSTER);
                break;
            case 4:
                tstVarI = tst.i(kuu.TYPE_SCREEN_SHOT);
                break;
            case 5:
                tstVarI = tst.i(kuu.TYPE_BACKGROUND);
                break;
            case 6:
                tstVarI = tst.i(kuu.TYPE_TITLE);
                break;
            case 7:
                tstVarI = tst.i(kuu.TYPE_ICON);
                break;
            case 8:
                tstVarI = tst.i(kuu.TYPE_GENERIC_LOGO);
                break;
            case 9:
                tstVarI = tst.i(kuu.TYPE_GENERIC);
                break;
            case 10:
                tstVarI = tst.i(kuu.TYPE_GENERIC_PAID);
                break;
            default:
                tstVarI = trk.a;
                break;
        }
        if (!tstVarI.g()) {
            return trk.a;
        }
        vca vcaVar = vcbVar.d;
        if (vcaVar == null) {
            vcaVar = vca.a;
        }
        int i2 = vcaVar.c;
        Object objI = i2 == 0 ? trk.a : tst.i(Integer.valueOf(i2));
        int i3 = vcaVar.b;
        Object objI2 = i3 == 0 ? trk.a : tst.i(Integer.valueOf(i3));
        nbh nbhVarB = kuv.b();
        nbhVarB.e(uri);
        nbhVarB.d((kuu) tstVarI.c());
        switch ((a.bi(vcaVar.e) != 0 ? r0 : 1) - 2) {
            case 1:
                tstVarI2 = tst.i(Float.valueOf(1.0f));
                break;
            case 2:
                tstVarI2 = tst.i(Float.valueOf(0.6666667f));
                break;
            case 3:
                tstVarI2 = tst.i(Float.valueOf(0.75f));
                break;
            case 4:
                tstVarI2 = tst.i(Float.valueOf(1.3333334f));
                break;
            case 5:
                tstVarI2 = tst.i(Float.valueOf(1.7777778f));
                break;
            case 6:
                tstVarI2 = tst.i(Float.valueOf(1.5f));
                break;
            case 7:
                tstVarI2 = tst.i(Float.valueOf(4.071429f));
                break;
            case 8:
                tstVarI2 = tst.i(Float.valueOf(0.5f));
                break;
            default:
                tstVarI2 = trk.a;
                break;
        }
        nbhVarB.b = tstVarI2;
        nbhVarB.c(vcaVar.d);
        nbhVarB.d = objI;
        nbhVarB.e = objI2;
        return tst.i(nbhVarB.b());
    }

    public static ImmutableList p(Iterable iterable) {
        return FluentIterable.from(iterable).transform(new lpn(5)).filter(new efc(12)).transform(new lpn(6)).toList();
    }
}
