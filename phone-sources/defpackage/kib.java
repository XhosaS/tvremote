package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kib implements yka {
    final /* synthetic */ kiq a;

    public kib(kiq kiqVar) {
        this.a = kiqVar;
    }

    @Override // defpackage.yka
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        xr xrVar = (xr) obj;
        bao baoVar = (bao) obj2;
        int iIntValue = ((Number) obj3).intValue();
        xrVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != baoVar.F(xrVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && baoVar.K()) {
            baoVar.t();
        } else {
            bkm bkmVar = bkp.g;
            bkp bkpVarB = xrVar.b(bkmVar);
            kiq kiqVar = this.a;
            bvt bvtVarA = xo.a(bkb.a, false);
            int iK = a.k(zy.p(baoVar));
            bhu bhuVarO = baoVar.O();
            bkp bkpVarC = bdi.C(baoVar, bkpVarB);
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
            yjz yjzVar = bxt.e;
            if (baoVar.J() || !yks.e(baoVar.g(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                baoVar.A(numValueOf);
                baoVar.i(numValueOf, yjzVar);
            }
            beb.a(baoVar, bkpVarC, bxt.b);
            xs xsVar = xs.a;
            khh khhVar = khh.a;
            baoVar.x(5004770);
            boolean zH = baoVar.H(kiqVar);
            Object objG = baoVar.g();
            if (zH || objG == ban.a) {
                objG = new keu(kiqVar, 16);
                baoVar.A(objG);
            }
            baoVar.p();
            khhVar.d(xsVar, (yjk) objG, zi.d(bkmVar, 48.0f), baoVar, 390, 0);
            baoVar.x(5004770);
            boolean zH2 = baoVar.H(kiqVar);
            Object objG2 = baoVar.g();
            if (zH2 || objG2 == ban.a) {
                objG2 = new keu(kiqVar, 17);
                baoVar.A(objG2);
            }
            baoVar.p();
            khhVar.a(xsVar, (yjk) objG2, zi.d(bkmVar, 48.0f), baoVar, 390, 0);
            baoVar.x(5004770);
            boolean zH3 = baoVar.H(kiqVar);
            Object objG3 = baoVar.g();
            if (zH3 || objG3 == ban.a) {
                objG3 = new keu(kiqVar, 18);
                baoVar.A(objG3);
            }
            baoVar.p();
            khhVar.b(xsVar, (yjk) objG3, zi.d(bkmVar, 48.0f), baoVar, 390, 0);
            baoVar.x(5004770);
            boolean zH4 = baoVar.H(kiqVar);
            Object objG4 = baoVar.g();
            if (zH4 || objG4 == ban.a) {
                objG4 = new keu(kiqVar, 19);
                baoVar.A(objG4);
            }
            baoVar.p();
            khhVar.c(xsVar, (yjk) objG4, zi.d(bkmVar, 48.0f), baoVar, 390, 0);
            baoVar.x(5004770);
            boolean zH5 = baoVar.H(kiqVar);
            Object objG5 = baoVar.g();
            if (zH5 || objG5 == ban.a) {
                objG5 = new keu(kiqVar, 20);
                baoVar.A(objG5);
            }
            baoVar.p();
            khhVar.e(xsVar, (yjk) objG5, null, baoVar, 6);
            baoVar.o();
        }
        return ygi.a;
    }
}
