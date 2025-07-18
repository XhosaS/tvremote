package defpackage;

import android.support.v7.appcompat.R;
import android.support.v7.widget.RecyclerView;
import androidx.compose.foundation.ScrollingLayoutElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sy {
    public static final /* synthetic */ int a = 0;
    private static final ss b;

    static {
        long j = bnq.c;
        long j2 = bnq.a;
        long jK = bny.k(bnq.d(j2), bnq.c(j2), bnq.b(j2), 0.38f, bnq.f(j2));
        long j3 = bnq.a;
        b = new ss(j, j2, j2, jK, bny.k(bnq.d(j3), bnq.c(j3), bnq.b(j3), 0.38f, bnq.f(j3)));
    }

    public static final void a(ss ssVar, bkp bkpVar, yka ykaVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(621449936);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(ssVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.H(ykaVar) ? 128 : 256;
        }
        if (baoVarD.L((i2 & 147) != 146, i2 & 1)) {
            long j = su.a;
            bkp bkpVarU = wv.u(wv.x(hq.f(bga.q(bkpVar, 3.0f, aep.a(4.0f), 28), ssVar.a, boh.a)), 0.0f, 8.0f, 1);
            sj sjVarI = hw.i(baoVarD);
            bkp bkpVarA = hw.l(bkpVarU, sjVarI, uv.a, (!((12 & 2) == 0)) | false, null, sjVarI.c, true, null).a(new ScrollingLayoutElement(sjVarI));
            int i4 = (i2 << 3) & 7168;
            bvt bvtVarA = xu.a(xk.c, bkb.j, baoVarD, 0);
            int iK = a.k(zy.p(baoVarD));
            bas basVar = (bas) baoVarD;
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVarA);
            yjk yjkVar = bxt.a;
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA, bxt.d);
            beb.a(baoVarD, bhuVarAi, bxt.c);
            yjz yjzVar = bxt.e;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar);
            }
            beb.a(baoVarD, bkpVarC, bxt.b);
            ykaVar.a(xx.a, baoVarD, Integer.valueOf(((i4 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
            baoVarD.o();
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new sv(ssVar, bkpVar, ykaVar, i, 0);
        }
    }

    public static final void b(bkp bkpVar, ss ssVar, yjv yjvVar, bao baoVar, int i) {
        int i2 = i & 384;
        int i3 = i | 54;
        bao baoVarD = baoVar.d(-1430784946);
        if (i2 == 0) {
            i3 |= true != baoVarD.H(yjvVar) ? 128 : 256;
        }
        if (baoVarD.L((i3 & 147) != 146, i3 & 1)) {
            bkpVar = bkp.g;
            ssVar = b;
            a(ssVar, bkpVar, bga.k(860259975, new azi(yjvVar, ssVar, 1, null), baoVarD), baoVarD, ((i3 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i3 >> 3) & 14) | 384);
        } else {
            baoVarD.t();
        }
        bkp bkpVar2 = bkpVar;
        ss ssVar2 = ssVar;
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new sv(bkpVar2, ssVar2, yjvVar, i, 1, (byte[]) null);
        }
    }

    public static final void c(String str, ss ssVar, bkp bkpVar, yka ykaVar, yjk yjkVar, bao baoVar, int i) {
        int i2;
        int i3;
        bao baoVarD = baoVar.d(-1027365588);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.F(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.G(true) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(ssVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i & 24576) == 0) {
            i2 |= true != baoVarD.H(ykaVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != baoVarD.H(yjkVar) ? 65536 : 131072;
        }
        if (baoVarD.L((74899 & i2) != 74898, i2 & 1)) {
            long j = su.a;
            int i4 = i2 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
            bkh bkhVar = su.e;
            xf xfVarE = xk.e(12.0f);
            boolean z = i4 == 32;
            boolean z2 = (458752 & i2) == 131072;
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if ((z | z2) || objT == ban.a) {
                objT = new sw(yjkVar, 0);
                basVar.ae(objT);
            }
            bkp bkpVarU = wv.u(zi.g(zi.a(hu.u(bkpVar, true, str, (yjk) objT, 12), 1.0f), 112.0f, 48.0f, 280.0f, 48.0f), 12.0f, 0.0f, 2);
            bvt bvtVarA = zf.a(xfVarE, bkhVar, baoVarD, 54);
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
            yjz yjzVar = bxt.d;
            beb.a(baoVarD, bvtVarA, yjzVar);
            yjz yjzVar2 = bxt.c;
            beb.a(baoVarD, bhuVarAi, yjzVar2);
            yjz yjzVar3 = bxt.e;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar3);
            }
            yjz yjzVar4 = bxt.b;
            beb.a(baoVarD, bkpVarC, yjzVar4);
            if (ykaVar == null) {
                baoVarD.x(-1483499797);
                basVar.aa();
                i3 = i2;
            } else {
                baoVarD.x(-1483499796);
                bkp bkpVarL = zi.l(bkp.g, 24.0f, 0.0f, 24.0f, 24.0f, 2);
                bvt bvtVarA2 = xo.a(bkb.a, false);
                int iK2 = a.k(zy.p(baoVarD));
                bhu bhuVarAi2 = basVar.ai();
                bkp bkpVarC2 = bdi.C(baoVarD, bkpVarL);
                baoVarD.z();
                i3 = i2;
                if (basVar.w) {
                    baoVarD.k(yjkVar2);
                } else {
                    baoVarD.B();
                }
                beb.a(baoVarD, bvtVarA2, yjzVar);
                beb.a(baoVarD, bhuVarAi2, yjzVar2);
                if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK2))) {
                    Integer numValueOf2 = Integer.valueOf(iK2);
                    basVar.ae(numValueOf2);
                    baoVarD.i(numValueOf2, yjzVar3);
                }
                beb.a(baoVarD, bkpVarC2, yjzVar4);
                ykaVar.a(new bnq(ssVar.c), baoVarD, 0);
                baoVarD.o();
                basVar.aa();
            }
            hp.o(str, zh.a(bkp.g, 1.0f, true), new chc(ssVar.b, su.a, su.b, su.d, 5, 0, su.c, 16613240), null, 0, false, 1, 0, null, baoVarD, (i3 & 14) | 1572864, 952);
            baoVarD.o();
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new sx(str, ssVar, bkpVar, ykaVar, yjkVar, i, 0);
        }
    }
}
