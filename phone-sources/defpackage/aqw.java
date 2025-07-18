package defpackage;

import android.support.v7.appcompat.R;
import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqw {
    public static final float a;
    private static final bcp b = new bbl(bcz.c, new anu(12));
    private static final float c;

    static {
        new ni(0.8f, 0.0f, 0.8f, 0.15f);
        c = 4.0f;
        a = 12.0f;
    }

    public static final void a(final bkp bkpVar, final yjz yjzVar, final chc chcVar, final chc chcVar2, final bkc bkcVar, final yjz yjzVar2, final yka ykaVar, final float f, final zr zrVar, final axd axdVar, bao baoVar, final int i, final int i2) {
        int i3;
        bkc bkcVar2;
        yjz yjzVar3;
        float f2;
        zr zrVar2;
        axd axdVar2;
        int i4;
        int i5 = i & 6;
        bao baoVarD = baoVar.d(-2033800111);
        if (i5 == 0) {
            i3 = (true != baoVarD.F(bkpVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != baoVarD.H(yjzVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != baoVarD.F(chcVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != baoVarD.H(null) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i & 24576) == 0) {
            i3 |= true != baoVarD.F(chcVar2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            bkcVar2 = bkcVar;
            i3 |= true != baoVarD.F(bkcVar2) ? 65536 : 131072;
        } else {
            bkcVar2 = bkcVar;
        }
        if ((1572864 & i) == 0) {
            yjzVar3 = yjzVar2;
            i3 |= true != baoVarD.H(yjzVar3) ? 524288 : 1048576;
        } else {
            yjzVar3 = yjzVar2;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != baoVarD.H(ykaVar) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            f2 = f;
            i3 |= true != baoVarD.C(f2) ? 33554432 : 67108864;
        } else {
            f2 = f;
        }
        if ((805306368 & i) == 0) {
            zrVar2 = zrVar;
            i3 |= true != baoVarD.F(zrVar2) ? 268435456 : 536870912;
        } else {
            zrVar2 = zrVar;
        }
        if ((i2 & 6) == 0) {
            axdVar2 = axdVar;
            i4 = i2 | (true != baoVarD.F(axdVar2) ? 2 : 4);
        } else {
            axdVar2 = axdVar;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != baoVarD.F(null) ? 16 : 32;
        }
        if (baoVarD.L(((306783379 & i3) == 306783378 && (i4 & 19) == 18) ? false : true, i3 & 1)) {
            ((arw) baoVarD.f(b)).a(new aux(yjzVar, chcVar, chcVar2, bkcVar2, yjzVar3, ykaVar, f2, zrVar2, axdVar2), baoVarD, 0);
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new yjz() { // from class: aqu
                @Override // defpackage.yjz
                public final Object a(Object obj, Object obj2) {
                    bao baoVar2 = (bao) obj;
                    ((Integer) obj2).intValue();
                    bkp bkpVar2 = bkpVar;
                    yjz yjzVar4 = yjzVar;
                    chc chcVar3 = chcVar;
                    chc chcVar4 = chcVar2;
                    bkc bkcVar3 = bkcVar;
                    yjz yjzVar5 = yjzVar2;
                    yka ykaVar2 = ykaVar;
                    float f3 = f;
                    int i6 = i;
                    aqw.a(bkpVar2, yjzVar4, chcVar3, chcVar4, bkcVar3, yjzVar5, ykaVar2, f3, zrVar, axdVar, baoVar2, bdi.n(i6 | 1), bdi.n(i2));
                    return ygi.a;
                }
            };
        }
    }

    public static final void b(final yjz yjzVar, bkp bkpVar, final yjz yjzVar2, yka ykaVar, float f, zr zrVar, final axd axdVar, bao baoVar, final int i) {
        int i2;
        bao baoVar2;
        final bkp bkpVar2;
        final yka ykaVar2;
        final float f2;
        final zr zrVar2;
        yka ykaVar3;
        zr yuVar;
        bkp bkpVar3;
        float f3;
        bao baoVarD = baoVar.d(1784421840);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.H(yjzVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= true != baoVarD.H(yjzVar2) ? 128 : 256;
        }
        int i4 = i3 | 27648;
        if ((196608 & i) == 0) {
            i4 = i3 | 93184;
        }
        if ((1572864 & i) == 0) {
            i4 |= true != baoVarD.F(axdVar) ? 524288 : 1048576;
        }
        int i5 = 12582912 | i4;
        if (baoVarD.L((4793491 & i5) != 4793490, i5 & 1)) {
            int i6 = i5 >> 18;
            int i7 = i5 & (-458753);
            baoVarD.u();
            if ((i & 1) == 0 || baoVarD.I()) {
                bkm bkmVar = bkp.g;
                ykaVar3 = arn.a;
                yuVar = new yu(zy.v(baoVarD), 31);
                bkpVar3 = bkmVar;
                f3 = 64.0f;
            } else {
                baoVarD.t();
                bkpVar3 = bkpVar;
                ykaVar3 = ykaVar;
                f3 = f;
                yuVar = zrVar;
            }
            baoVarD.m();
            int i8 = i7 >> 3;
            int i9 = i7 << 3;
            int i10 = i7 << 12;
            baoVar2 = baoVarD;
            a(bkpVar3, yjzVar, axh.a(13, baoVarD), chc.a, bkb.j, yjzVar2, ykaVar3, (cma.b(f3, Float.NaN) || cma.b(f3, Float.POSITIVE_INFINITY)) ? 64.0f : f3, yuVar, axdVar, baoVar2, (i8 & 14) | 224256 | (i9 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (3670016 & i10) | (i10 & 29360128), i6 & R.styleable.AppCompatTheme_windowNoTitle);
            f2 = f3;
            bkpVar2 = bkpVar3;
            ykaVar2 = ykaVar3;
            zrVar2 = yuVar;
        } else {
            baoVar2 = baoVarD;
            baoVar2.t();
            bkpVar2 = bkpVar;
            ykaVar2 = ykaVar;
            f2 = f;
            zrVar2 = zrVar;
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new yjz() { // from class: aqt
                @Override // defpackage.yjz
                public final Object a(Object obj, Object obj2) {
                    bao baoVar3 = (bao) obj;
                    ((Integer) obj2).intValue();
                    yjz yjzVar3 = yjzVar;
                    bkp bkpVar4 = bkpVar2;
                    yjz yjzVar4 = yjzVar2;
                    yka ykaVar4 = ykaVar2;
                    float f4 = f2;
                    int i11 = i;
                    aqw.b(yjzVar3, bkpVar4, yjzVar4, ykaVar4, f4, zrVar2, axdVar, baoVar3, bdi.n(i11 | 1));
                    return ygi.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:195:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0409  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final defpackage.bkp r32, final defpackage.ays r33, final long r34, final long r36, final long r38, long r40, final defpackage.yjz r42, final defpackage.chc r43, final defpackage.chc r44, defpackage.yjk r45, final defpackage.xj r46, final defpackage.bkc r47, final defpackage.yjz r48, defpackage.yjz r49, final float r50, defpackage.bao r51, final int r52, final int r53) {
        /*
            Method dump skipped, instructions count: 1130
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqw.c(bkp, ays, long, long, long, long, yjz, chc, chc, yjk, xj, bkc, yjz, yjz, float, bao, int, int):void");
    }
}
