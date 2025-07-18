package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class azh implements yka {
    final /* synthetic */ bdy a;
    final /* synthetic */ long b;
    final /* synthetic */ chc c;
    final /* synthetic */ yjz d;

    public azh(bdy bdyVar, long j, chc chcVar, yjz yjzVar) {
        this.a = bdyVar;
        this.b = j;
        this.c = chcVar;
        this.d = yjzVar;
    }

    @Override // defpackage.yka
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        bkp bkpVar = (bkp) obj;
        bao baoVar = (bao) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != baoVar.F(bkpVar) ? 2 : 4;
        }
        if (baoVar.L((iIntValue & 19) != 18, iIntValue & 1)) {
            bdy bdyVar = this.a;
            boolean zF = baoVar.F(bdyVar);
            Object objG = baoVar.g();
            if (zF || objG == ban.a) {
                objG = new bap(bdyVar, 1);
                baoVar.A(objG);
            }
            bkp bkpVarC = bny.c(bkpVar, (yjv) objG);
            long j = this.b;
            chc chcVar = this.c;
            yjz yjzVar = this.d;
            bvt bvtVarA = xo.a(bkb.a, false);
            int iO = zy.o(baoVar);
            bhu bhuVarO = baoVar.O();
            bkp bkpVarC2 = bdi.C(baoVar, bkpVarC);
            yjk yjkVar = bxt.a;
            baoVar.c();
            baoVar.z();
            if (baoVar.J()) {
                baoVar.k(yjkVar);
            } else {
                baoVar.B();
            }
            beb.a(baoVar, bvtVarA, bxt.d);
            beb.a(baoVar, bhuVarO, bxt.c);
            yjz yjzVar2 = bxt.e;
            if (baoVar.J() || !yks.e(baoVar.g(), Integer.valueOf(iO))) {
                Integer numValueOf = Integer.valueOf(iO);
                baoVar.A(numValueOf);
                baoVar.i(numValueOf, yjzVar2);
            }
            beb.a(baoVar, bkpVarC2, bxt.b);
            zy.s(j, chcVar, yjzVar, baoVar, 0);
            baoVar.o();
        } else {
            baoVar.t();
        }
        return ygi.a;
    }
}
