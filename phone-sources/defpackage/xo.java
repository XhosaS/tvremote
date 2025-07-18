package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xo {
    private static final ki b = f(true);
    private static final ki c = f(false);
    private static final bvt a = xn.a;

    public static final bvt a(bkd bkdVar, boolean z) {
        bvt bvtVar = (bvt) (z ? b : c).a(bkdVar);
        return bvtVar == null ? new xq(bkdVar, z) : bvtVar;
    }

    public static final void b(bkp bkpVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-211209833);
        int i4 = 2;
        if (i3 == 0) {
            i2 = (true != baoVarD.F(bkpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (baoVarD.L((i2 & 3) != 2, i2 & 1)) {
            bvt bvtVar = a;
            int iK = a.k(zy.p(baoVarD));
            bkp bkpVarC = bdi.C(baoVarD, bkpVar);
            bas basVar = (bas) baoVarD;
            bhu bhuVarAi = basVar.ai();
            yjk yjkVar = bxt.a;
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVar, bxt.d);
            beb.a(baoVarD, bhuVarAi, bxt.c);
            beb.a(baoVarD, bkpVarC, bxt.b);
            yjz yjzVar = bxt.e;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar);
            }
            baoVarD.o();
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new nu(bkpVar, i, i4);
        }
    }

    public static final void c(bwi bwiVar, bwj bwjVar, bvs bvsVar, cmi cmiVar, int i, int i2, bkd bkdVar) {
        bkd bkdVar2;
        xm xmVarE = e(bvsVar);
        bwiVar.s(bwjVar, ((xmVarE == null || (bkdVar2 = xmVarE.a) == null) ? bkdVar : bkdVar2).a((bwjVar.a << 32) | (bwjVar.b & 4294967295L), (i << 32) | (i2 & 4294967295L), cmiVar), 0.0f);
    }

    public static final boolean d(bvs bvsVar) {
        xm xmVarE = e(bvsVar);
        if (xmVarE != null) {
            return xmVarE.b;
        }
        return false;
    }

    private static final xm e(bvs bvsVar) {
        Object objG = bvsVar.g();
        if (objG instanceof xm) {
            return (xm) objG;
        }
        return null;
    }

    private static final ki f(boolean z) {
        ki kiVar = new ki(9);
        bkd bkdVar = bkb.a;
        kiVar.j(bkdVar, new xq(bkdVar, z));
        bkd bkdVar2 = bkb.b;
        kiVar.j(bkdVar2, new xq(bkdVar2, z));
        bkd bkdVar3 = bkb.c;
        kiVar.j(bkdVar3, new xq(bkdVar3, z));
        bkd bkdVar4 = bkb.d;
        kiVar.j(bkdVar4, new xq(bkdVar4, z));
        bkd bkdVar5 = bkb.e;
        kiVar.j(bkdVar5, new xq(bkdVar5, z));
        bkd bkdVar6 = bkb.f;
        kiVar.j(bkdVar6, new xq(bkdVar6, z));
        bkd bkdVar7 = bkb.g;
        kiVar.j(bkdVar7, new xq(bkdVar7, z));
        bkd bkdVar8 = bkb.h;
        kiVar.j(bkdVar8, new xq(bkdVar8, z));
        bkd bkdVar9 = bkb.i;
        kiVar.j(bkdVar9, new xq(bkdVar9, z));
        return kiVar;
    }
}
