package defpackage;

import android.content.Context;
import android.support.v7.appcompat.R;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class khp {
    public static final khp a = new khp();

    private khp() {
    }

    public static final chc a(bao baoVar) {
        baoVar.x(-634716360);
        chc chcVar = wv.N(baoVar).m;
        baoVar.p();
        return chcVar;
    }

    public final void b(float f, yjv yjvVar, bkp bkpVar, bao baoVar, int i) {
        float f2;
        int i2;
        bkp bkpVar2;
        yjvVar.getClass();
        bao baoVarD = baoVar.d(1956862209);
        if ((i & 6) == 0) {
            f2 = f;
            i2 = i | (true != baoVarD.C(f2) ? 2 : 4);
        } else {
            f2 = f;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjvVar) ? 16 : 32;
        }
        int i3 = i2 | 384;
        if ((i3 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
            bkpVar2 = bkpVar;
        } else {
            bkm bkmVar = bkp.g;
            Context context = (Context) baoVarD.f(AndroidCompositionLocals_androidKt.b);
            baoVarD.x(1849434622);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            Object obj = ban.a;
            if (objT == obj) {
                objT = new kw((byte[]) null, (byte[]) null);
                basVar.ae(objT);
            }
            kw kwVar = (kw) objT;
            basVar.aa();
            bkp bkpVarA = zi.a(bkmVar, 1.0f);
            baoVarD.x(5004770);
            boolean zH = baoVarD.H(context);
            Object objT2 = basVar.T();
            if (zH || objT2 == obj) {
                objT2 = new kah(context, 19);
                basVar.ae(objT2);
            }
            basVar.aa();
            bkp bkpVarB = cfd.b(bkpVarA, false, (yjv) objT2);
            baoVarD.x(1849434622);
            Object objT3 = basVar.T();
            if (objT3 == obj) {
                objT3 = new kw((byte[]) null, (byte[]) null);
                basVar.ae(objT3);
            }
            kw kwVar2 = (kw) objT3;
            basVar.aa();
            auy auyVarL = kdw.l(baoVarD);
            baoVarD.x(5004770);
            int i4 = i3 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
            Object objT4 = basVar.T();
            if (i4 == 32 || objT4 == obj) {
                objT4 = new kah(yjvVar, 20);
                basVar.ae(objT4);
            }
            basVar.aa();
            pox.a(f2, (yjv) objT4, bkpVarB, false, auyVarL, kwVar2, bga.k(-901923267, new khb(kwVar, 5), baoVarD), null, null, baoVarD, (i3 & 14) | 113246208, 0);
            bkpVar2 = bkmVar;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kho(this, f, yjvVar, bkpVar2, i, 0);
        }
    }

    public final void c(long j, long j2, bkp bkpVar, chc chcVar, bao baoVar, int i) {
        long j3;
        int i2;
        long j4;
        bkp bkpVar2;
        chc chcVarA;
        bao baoVar2;
        chc chcVar2;
        bao baoVarD = baoVar.d(-1374705128);
        if ((i & 6) == 0) {
            j3 = j;
            i2 = (true != baoVarD.E(j3) ? 2 : 4) | i;
        } else {
            j3 = j;
            i2 = i;
        }
        if ((i & 48) == 0) {
            j4 = j2;
            i2 |= true != baoVarD.E(j4) ? 16 : 32;
        } else {
            j4 = j2;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 = i2 | 1408;
        }
        if ((i & 24576) == 0) {
            i3 |= true != baoVarD.F(this) ? 8192 : 16384;
        }
        if ((i3 & 9363) == 9362 && baoVarD.K()) {
            baoVarD.t();
            chcVar2 = chcVar;
            baoVar2 = baoVarD;
        } else {
            baoVarD.u();
            if ((i & 1) == 0 || baoVarD.I()) {
                bkpVar2 = bkp.g;
                chcVarA = a(baoVarD);
            } else {
                baoVarD.t();
                bkpVar2 = bkpVar;
                chcVarA = chcVar;
            }
            baoVarD.m();
            long j5 = wv.K(baoVarD).s;
            cji cjiVar = cji.c;
            bkp bkpVarA = zi.a(bkpVar2, 1.0f);
            bvt bvtVarA = zf.a(xk.f, bkb.m, baoVarD, 6);
            int iK = a.k(zy.p(baoVarD));
            bas basVar = (bas) baoVarD;
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVarA);
            yjk yjkVar = bxt.a;
            baoVarD.z();
            bkpVar = bkpVar2;
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
            baoVar2 = baoVarD;
            rdd.p(ipc.h(j3), null, j5, 0L, cjiVar, 0L, null, 0L, 0, false, 0, 0, null, chcVarA, baoVar2, 196608, 0, 65498);
            rdd.p(ipc.h(j4), null, j5, 0L, cjiVar, 0L, null, 0L, 0, false, 0, 0, null, chcVarA, baoVar2, 196608, 0, 65498);
            baoVar2.o();
            chcVar2 = chcVarA;
        }
        bkp bkpVar3 = bkpVar;
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new avt(this, j3, j2, bkpVar3, chcVar2, i, 2);
        }
    }
}
