package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aes {
    public static final yfw a;

    static {
        yhb yhbVar = yhb.a;
        a = new yfw(yhbVar, yhbVar);
    }

    public static final void a(cfy cfyVar, List list, bao baoVar, int i) {
        int i2 = i & 6;
        bao baoVarD = baoVar.d(-1794596951);
        int i3 = i2 == 0 ? (true != baoVarD.F(cfyVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != baoVarD.H(list) ? 16 : 32;
        }
        if (baoVarD.L((i3 & 19) != 18, i3 & 1)) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                cfx cfxVar = (cfx) list.get(i4);
                yka ykaVar = (yka) cfxVar.a;
                int i5 = cfxVar.b;
                int i6 = cfxVar.c;
                bas basVar = (bas) baoVarD;
                Object objT = basVar.T();
                if (objT == ban.a) {
                    objT = xn.c;
                    basVar.ae(objT);
                }
                bvt bvtVar = (bvt) objT;
                bkm bkmVar = bkp.g;
                int iK = a.k(zy.p(baoVarD));
                bhu bhuVarAi = basVar.ai();
                bkp bkpVarC = bdi.C(baoVarD, bkmVar);
                yjk yjkVar = bxt.a;
                baoVarD.z();
                if (basVar.w) {
                    baoVarD.k(yjkVar);
                } else {
                    baoVarD.B();
                }
                beb.a(baoVarD, bvtVar, bxt.d);
                beb.a(baoVarD, bhuVarAi, bxt.c);
                yjz yjzVar = bxt.e;
                if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK))) {
                    Integer numValueOf = Integer.valueOf(iK);
                    basVar.ae(numValueOf);
                    baoVarD.i(numValueOf, yjzVar);
                }
                beb.a(baoVarD, bkpVarC, bxt.b);
                ykaVar.a(cfyVar.subSequence(i5, i6).b, baoVarD, 0);
                baoVarD.o();
            }
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new qt(cfyVar, list, i, 3);
        }
    }
}
