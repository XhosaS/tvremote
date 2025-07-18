package defpackage;

import android.support.v7.appcompat.R;
import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class avm {
    public static final bxa a;

    static {
        a.j(4.0f, 44.0f);
        a.j(44.0f, 4.0f);
        a = new bxa(avg.a);
    }

    public static final float a(float f, float f2, float f3) {
        float f4 = f2 - f;
        return ykn.i(f4 == 0.0f ? 0.0f : (f3 - f) / f4, 0.0f, 1.0f);
    }

    public static final float b(float f, float f2, float f3, float f4, float f5) {
        return cmq.f(f4, f5, a(f, f2, f3));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(defpackage.bkp r22, defpackage.avn r23, boolean r24, defpackage.kw r25, defpackage.yka r26, defpackage.yka r27, defpackage.bao r28, int r29) {
        /*
            Method dump skipped, instructions count: 765
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avm.c(bkp, avn, boolean, kw, yka, yka, bao, int):void");
    }

    public static final void d(float f, yjv yjvVar, bkp bkpVar, boolean z, auy auyVar, kw kwVar, yka ykaVar, yka ykaVar2, ylz ylzVar, bao baoVar, int i, int i2) {
        int i3;
        auy auyVar2;
        yka ykaVar3;
        yka ykaVar4;
        int i4;
        bao baoVar2;
        int i5 = i & 6;
        bao baoVarD = baoVar.d(985901935);
        if (i5 == 0) {
            i3 = (true != baoVarD.C(f) ? 2 : 4) | i;
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
            i3 |= true != baoVarD.G(z) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i & 24576) == 0) {
            i3 |= true != baoVarD.H(null) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            auyVar2 = auyVar;
            i3 |= true != baoVarD.F(auyVar2) ? 65536 : 131072;
        } else {
            auyVar2 = auyVar;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != baoVarD.F(kwVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != baoVarD.D(0) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            ykaVar3 = ykaVar;
            i3 |= true != baoVarD.H(ykaVar3) ? 33554432 : 67108864;
        } else {
            ykaVar3 = ykaVar;
        }
        if ((805306368 & i) == 0) {
            ykaVar4 = ykaVar2;
            i3 |= true != baoVarD.H(ykaVar4) ? 268435456 : 536870912;
        } else {
            ykaVar4 = ykaVar2;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != baoVarD.F(ylzVar) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if (baoVarD.L(((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true, i3 & 1)) {
            baoVarD.u();
            if ((i & 1) != 0 && !baoVarD.I()) {
                baoVarD.t();
            }
            baoVarD.m();
            boolean z2 = ((29360128 & i3) == 8388608) | ((((i4 & 14) ^ 6) > 4 && baoVarD.F(ylzVar)) || (i4 & 6) == 4);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (z2 || objT == ban.a) {
                objT = new avn(f, ylzVar);
                basVar.ae(objT);
            }
            avn avnVar = (avn) objT;
            avnVar.a = null;
            avnVar.b = yjvVar;
            avnVar.k(f);
            int i6 = i3 >> 3;
            int i7 = i3 >> 6;
            int i8 = i3 >> 9;
            baoVar2 = baoVarD;
            e(avnVar, bkpVar, z, null, kwVar, ykaVar3, ykaVar4, baoVar2, (i6 & 1008) | (i7 & 57344) | (458752 & i8) | (i8 & 3670016));
        } else {
            baoVar2 = baoVarD;
            baoVar2.t();
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new pow(f, yjvVar, bkpVar, z, auyVar2, kwVar, ykaVar, ykaVar2, ylzVar, i, i2, 1);
        }
    }

    public static final void e(avn avnVar, bkp bkpVar, boolean z, auy auyVar, kw kwVar, yka ykaVar, yka ykaVar2, bao baoVar, int i) {
        avn avnVar2;
        int i2;
        auy auyVar2;
        auy auyVarB;
        bao baoVarD = baoVar.d(409861960);
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
            i2 |= true != baoVarD.G(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= true != baoVarD.F(kwVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != baoVarD.H(ykaVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != baoVarD.H(ykaVar2) ? 524288 : 1048576;
        }
        if (baoVarD.L((599187 & i2) != 599186, i2 & 1)) {
            int i3 = i2 & (-7169);
            baoVarD.u();
            if ((i & 1) == 0 || baoVarD.I()) {
                ave aveVar = ave.a;
                auyVarB = ave.b(wv.K(baoVarD));
            } else {
                baoVarD.t();
                auyVarB = auyVar;
            }
            baoVarD.m();
            int i4 = i3 >> 3;
            c(bkpVar, avnVar2, z, kwVar, ykaVar, ykaVar2, baoVarD, (i2 & 896) | ((i3 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i4 & 14) | (i4 & 7168) | (57344 & i4) | (458752 & i4));
            auyVar2 = auyVarB;
        } else {
            baoVarD.t();
            auyVar2 = auyVar;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new arf(avnVar, bkpVar, z, auyVar2, kwVar, ykaVar, ykaVar2, i, 5);
        }
    }
}
