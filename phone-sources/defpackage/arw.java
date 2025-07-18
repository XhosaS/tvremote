package defpackage;

import android.support.v7.widget.ActivityChooserView;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class arw {
    public static final arw a = new arw();

    private arw() {
    }

    public final void a(aux auxVar, bao baoVar, int i) {
        int i2;
        bao baoVar2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(2137486921);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(auxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (baoVarD.L((i2 & 3) != 2, i2 & 1)) {
            float f = auxVar.g;
            if (Float.isNaN(f) || (Float.floatToRawIntBits(f) & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) >= 2139095040) {
                throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
            }
            axd axdVar = auxVar.i;
            boolean zF = baoVarD.F(axdVar) | baoVarD.F(null);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (zF || objT == ban.a) {
                bck bckVar = new bck(auxVar, 1);
                ivx ivxVar = bdt.a;
                objT = new bbh(bckVar, null);
                basVar.ae(objT);
            }
            bdy bdyVarK = fh.k(((bnq) ((bdy) objT).a()).h, wv.F(4, baoVarD), baoVarD);
            bhq bhqVarK = bga.k(-1658896622, new aoq(auxVar, 10), baoVarD);
            baoVarD.x(690108113);
            basVar.aa();
            bkm bkmVar = bkp.g;
            boolean zF2 = baoVarD.F(bdyVarK);
            Object objT2 = basVar.T();
            if (zF2 || objT2 == ban.a) {
                objT2 = new ars(bdyVarK, 2);
                basVar.ae(objT2);
            }
            bkp bkpVarS = bga.s(bkmVar, (yjv) objT2);
            Object objT3 = basVar.T();
            Object obj = ban.a;
            if (objT3 == obj) {
                objT3 = new aru(0);
                basVar.ae(objT3);
            }
            bkp bkpVarB = cfd.b(bkpVarS, false, (yjv) objT3);
            ygi ygiVar = ygi.a;
            Object objT4 = basVar.T();
            if (objT4 == obj) {
                objT4 = awm.b;
                basVar.ae(objT4);
            }
            bkp bkpVarA = btm.a(bkpVarB, ygiVar, (PointerInputEventHandler) objT4);
            bvt bvtVarA = xo.a(bkb.a, false);
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
            beb.a(baoVarD, bvtVarA, bxt.d);
            beb.a(baoVarD, bhuVarAi, bxt.c);
            yjz yjzVar = bxt.e;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iO))) {
                Integer numValueOf = Integer.valueOf(iO);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar);
            }
            beb.a(baoVarD, bkpVarC, bxt.b);
            bkp bkpVarX = bga.x(zt.c(bkmVar, auxVar.h));
            float f2 = aqw.a;
            int i4 = i2 & 14;
            Object objT5 = basVar.T();
            if (i4 == 4 || objT5 == obj) {
                objT5 = new ays() { // from class: arv
                    @Override // defpackage.ays
                    public final float a() {
                        return 0.0f;
                    }
                };
                basVar.ae(objT5);
            }
            long j = axdVar.c;
            baoVar2 = baoVarD;
            long j2 = axdVar.d;
            long j3 = axdVar.e;
            long j4 = axdVar.f;
            yjz yjzVar2 = auxVar.a;
            chc chcVar = auxVar.b;
            chc chcVar2 = auxVar.c;
            bkc bkcVar = auxVar.d;
            yjz yjzVar3 = auxVar.e;
            ays aysVar = (ays) objT5;
            xf xfVar = xk.e;
            Object objT6 = basVar.T();
            if (objT6 == obj) {
                objT6 = new anu(15);
                basVar.ae(objT6);
            }
            aqw.c(bkpVarX, aysVar, j, j2, j4, j3, yjzVar2, chcVar, chcVar2, (yjk) objT6, xfVar, bkcVar, yjzVar3, bhqVarK, f, baoVar2, 0, 1600566);
            baoVar2.o();
        } else {
            baoVar2 = baoVarD;
            baoVar2.t();
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new qt(this, auxVar, i, 16);
        }
    }
}
