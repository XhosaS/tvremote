package defpackage;

import android.support.v7.appcompat.R;
import androidx.compose.foundation.layout.SizeElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awt {
    public static final oq a = new oq((char[]) null);

    /* JADX WARN: Failed to inline method: zi.p(bkp, bkd):bkp */
    /* JADX WARN: Not passed register '(r0v22 'bkpVarA' bkp)' in method call: zi.p(bkp, bkd):bkp */
    public static final void a(boolean z, yjv yjvVar, bkp bkpVar, boolean z2, awr awrVar, bao baoVar, int i) {
        boolean z3;
        int i2;
        boolean z4;
        awr awrVar2;
        awr awrVar3;
        awr awrVar4;
        bao baoVarD = baoVar.d(-263339167);
        if ((i & 6) == 0) {
            z3 = z;
            i2 = (true != baoVarD.G(z3) ? 2 : 4) | i;
        } else {
            z3 = z;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjvVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 128 : 256;
        }
        int i3 = i2 | 27648;
        if ((196608 & i) == 0) {
            i3 = i2 | 93184;
        }
        int i4 = 1572864 | i3;
        if (baoVarD.L((599187 & i4) != 599186, i4 & 1)) {
            int i5 = i4 >> 6;
            int i6 = i4 & (-458753);
            baoVarD.u();
            if ((i & 1) == 0 || baoVarD.I()) {
                arl arlVarK = wv.K(baoVarD);
                awr awrVar5 = arlVarK.af;
                if (awrVar5 == null) {
                    long jE = arm.e(arlVarK, 10);
                    long jE2 = arm.e(arlVarK, 26);
                    long j = bnq.f;
                    long jE3 = arm.e(arlVarK, 11);
                    long jE4 = arm.e(arlVarK, 24);
                    long jE5 = arm.e(arlVarK, 39);
                    long jE6 = arm.e(arlVarK, 24);
                    long jE7 = arm.e(arlVarK, 39);
                    long jE8 = arm.e(arlVarK, 35);
                    long jK = bny.k(bnq.d(jE8), bnq.c(jE8), bnq.b(jE8), 1.0f, bnq.f(jE8));
                    long j2 = arlVarK.p;
                    long jM = bny.m(jK, j2);
                    long jE9 = arm.e(arlVarK, 18);
                    long jM2 = bny.m(bny.k(bnq.d(jE9), bnq.c(jE9), bnq.b(jE9), 0.12f, bnq.f(jE9)), j2);
                    long jE10 = arm.e(arlVarK, 18);
                    long jM3 = bny.m(bny.k(bnq.d(jE10), bnq.c(jE10), bnq.b(jE10), 0.38f, bnq.f(jE10)), j2);
                    long jE11 = arm.e(arlVarK, 18);
                    long jM4 = bny.m(bny.k(bnq.d(jE11), bnq.c(jE11), bnq.b(jE11), 0.38f, bnq.f(jE11)), j2);
                    long jE12 = arm.e(arlVarK, 39);
                    long jM5 = bny.m(bny.k(bnq.d(jE12), bnq.c(jE12), bnq.b(jE12), 0.12f, bnq.f(jE12)), j2);
                    long jE13 = arm.e(arlVarK, 18);
                    long jM6 = bny.m(bny.k(bnq.d(jE13), bnq.c(jE13), bnq.b(jE13), 0.12f, bnq.f(jE13)), j2);
                    long jE14 = arm.e(arlVarK, 39);
                    awrVar3 = new awr(jE, jE2, j, jE3, jE4, jE5, jE6, jE7, jM, jM2, j, jM3, jM4, jM5, jM6, bny.m(bny.k(bnq.d(jE14), bnq.c(jE14), bnq.b(jE14), 0.38f, bnq.f(jE14)), j2));
                    arlVarK.af = awrVar3;
                } else {
                    awrVar3 = awrVar5;
                }
                awrVar4 = awrVar3;
                z4 = true;
            } else {
                baoVarD.t();
                z4 = z2;
                awrVar4 = awrVar;
            }
            baoVarD.m();
            baoVarD.x(1768604058);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (objT == ban.a) {
                objT = new kw((byte[]) null, (byte[]) null);
                basVar.ae(objT);
            }
            kw kwVar = (kw) objT;
            basVar.aa();
            int i7 = i6 << 3;
            b(zi.p(bkpVar.a(yjvVar != null ? hp.v(ask.a(bkp.g), z3, kwVar, null, z4, new cez(2), yjvVar) : bkp.g), bkb.e).a(new SizeElement(52.0f, 32.0f, 52.0f, 32.0f, false)), z, z4, awrVar4, kwVar, aur.b(7, baoVarD), baoVarD, (i7 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i5 & 896) | (i7 & 57344));
            awrVar2 = awrVar4;
        } else {
            baoVarD.t();
            z4 = z2;
            awrVar2 = awrVar;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new aws(z, yjvVar, bkpVar, z4, awrVar2, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(defpackage.bkp r18, boolean r19, boolean r20, defpackage.awr r21, defpackage.kw r22, defpackage.bol r23, defpackage.bao r24, int r25) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awt.b(bkp, boolean, boolean, awr, kw, bol, bao, int):void");
    }
}
