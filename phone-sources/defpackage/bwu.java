package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwu {
    public static final bws a = new bws();

    public static final void a(bkp bkpVar, yjz yjzVar, bao baoVar, int i, int i2) {
        int i3;
        bao baoVarD = baoVar.d(-1298353104);
        if (i2 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != baoVarD.F(bkpVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != baoVarD.H(yjzVar) ? 16 : 32;
        }
        if (baoVarD.L((i3 & 19) != 18, i3 & 1)) {
            if (i2 != 0) {
                bkpVar = bkp.g;
            }
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (objT == ban.a) {
                objT = new bww(bvz.a);
                basVar.ae(objT);
            }
            b((bww) objT, bkpVar, yjzVar, baoVarD, (i3 << 3) & 1008);
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new bwt(bkpVar, yjzVar, i, i2);
        }
    }

    public static final void b(bww bwwVar, bkp bkpVar, yjz yjzVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-511989831);
        if (i3 == 0) {
            i2 = (true != baoVarD.H(bwwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 128 : 256;
        }
        if (baoVarD.L((i2 & 147) != 146, i2 & 1)) {
            int iK = a.k(zy.p(baoVarD));
            baw bawVarR = zy.r(baoVarD);
            bkp bkpVarC = bdi.C(baoVarD, bkpVar);
            bas basVar = (bas) baoVarD;
            bhu bhuVarAi = basVar.ai();
            yjk yjkVar = bys.a;
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bwwVar, bwwVar.c);
            beb.a(baoVarD, bawVarR, bwwVar.d);
            beb.a(baoVarD, yjzVar, bwwVar.e);
            beb.a(baoVarD, bhuVarAi, bxt.c);
            beb.a(baoVarD, bkpVarC, bxt.b);
            yjz yjzVar2 = bxt.e;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar2);
            }
            baoVarD.o();
            if (baoVarD.K()) {
                baoVarD.x(-1259216055);
                basVar.aa();
            } else {
                baoVarD.x(-1259274676);
                boolean zH = baoVarD.H(bwwVar);
                Object objT = basVar.T();
                if (zH || objT == ban.a) {
                    objT = new bms(bwwVar, 6);
                    basVar.ae(objT);
                }
                bbn.g((yjk) objT, baoVarD);
                basVar.aa();
            }
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new ccp(bwwVar, bkpVar, yjzVar, i, 1);
        }
    }
}
