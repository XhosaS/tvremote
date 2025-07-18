package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dnu implements yka {
    final /* synthetic */ int a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public dnu(int i, Object obj, int i2) {
        this.c = i2;
        this.a = i;
        this.b = obj;
    }

    private static final Object b(bdy bdyVar) {
        return bdyVar.a();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, ykb] */
    @Override // defpackage.yka
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int i = this.c;
        if (i == 0) {
            cwr cwrVar = (cwr) obj;
            bao baoVar = (bao) obj2;
            int iIntValue = ((Number) obj3).intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= true == ((iIntValue & 8) == 0 ? baoVar.F(cwrVar) : baoVar.H(cwrVar)) ? 4 : 2;
            }
            if ((iIntValue & 19) == 18 && baoVar.K()) {
                baoVar.t();
            } else {
                this.b.a(cwrVar, Integer.valueOf(this.a), baoVar, Integer.valueOf(iIntValue & 14));
            }
            return ygi.a;
        }
        if (i != 1) {
            bao baoVar2 = (bao) obj2;
            int iIntValue2 = ((Number) obj3).intValue();
            ((zh) obj).getClass();
            if ((iIntValue2 & 17) == 16 && baoVar2.K()) {
                baoVar2.t();
            } else {
                bkm bkmVar = bkp.g;
                bkh bkhVar = bkb.n;
                xe xeVarF = xk.f(8.0f, bkb.k);
                int i2 = this.a;
                Object obj4 = this.b;
                bvt bvtVarA = zf.a(xeVarF, bkhVar, baoVar2, 54);
                int iK = a.k(zy.p(baoVar2));
                bhu bhuVarO = baoVar2.O();
                bkp bkpVarC = bdi.C(baoVar2, bkmVar);
                yjk yjkVar = bxt.a;
                baoVar2.c();
                baoVar2.z();
                if (baoVar2.J()) {
                    baoVar2.k(yjkVar);
                } else {
                    baoVar2.B();
                }
                beb.a(baoVar2, bvtVarA, bxt.d);
                beb.a(baoVar2, bhuVarO, bxt.c);
                yjz yjzVar = bxt.e;
                if (baoVar2.J() || !yks.e(baoVar2.g(), Integer.valueOf(iK))) {
                    Integer numValueOf = Integer.valueOf(iK);
                    baoVar2.A(numValueOf);
                    baoVar2.i(numValueOf, yjzVar);
                }
                beb.a(baoVar2, bkpVarC, bxt.b);
                asg.a(ccf.y(i2, baoVar2, 0), null, zi.d(bkmVar, 18.0f), wv.K(baoVar2).v, baoVar2, 432, 0);
                axa.b((String) obj4, null, wv.K(baoVar2).v, 0L, null, 0L, new clk(), 0L, 0, false, 0, 0, null, null, baoVar2, 0, 0, 261114);
                baoVar2.o();
            }
            return ygi.a;
        }
        bao baoVar3 = (bao) obj2;
        ((Number) obj3).intValue();
        baoVar3.x(408240218);
        int i3 = this.a;
        hq.u(1, i3);
        if (i3 == Integer.MAX_VALUE) {
            bkm bkmVar2 = bkp.g;
            baoVar3.p();
            return bkmVar2;
        }
        clx clxVar = (clx) baoVar3.f(ccq.d);
        esn esnVar = (esn) baoVar3.f(ccq.f);
        cmi cmiVar = (cmi) baoVar3.f(ccq.i);
        Object obj5 = this.b;
        boolean zF = baoVar3.F(obj5) | baoVar3.D(cmiVar.ordinal());
        Object objG = baoVar3.g();
        if (zF || objG == ban.a) {
            objG = ccf.M((chc) obj5, cmiVar);
            baoVar3.A(objG);
        }
        chc chcVar = (chc) objG;
        boolean zF2 = baoVar3.F(esnVar) | baoVar3.F(chcVar);
        Object objG2 = baoVar3.g();
        if (zF2 || objG2 == ban.a) {
            ciy ciyVarK = chcVar.k();
            cji cjiVarN = chcVar.n();
            if (cjiVarN == null) {
                cjiVarN = cji.e;
            }
            cje cjeVarL = chcVar.l();
            int i4 = cjeVarL != null ? cjeVarL.a : 0;
            chcVar.m();
            objG2 = esnVar.b(ciyVarK, cjiVarN, i4);
            baoVar3.A(objG2);
        }
        bdy bdyVar = (bdy) objG2;
        boolean zF3 = baoVar3.F(b(bdyVar)) | baoVar3.F(clxVar) | baoVar3.F(esnVar) | baoVar3.F(obj5) | baoVar3.D(cmiVar.ordinal());
        Object objG3 = baoVar3.g();
        if (zF3 || objG3 == ban.a) {
            objG3 = Integer.valueOf((int) (agc.a(chcVar, clxVar, esnVar, agc.a, 1) & 4294967295L));
            baoVar3.A(objG3);
        }
        int iIntValue3 = ((Number) objG3).intValue();
        boolean zF4 = baoVar3.F(b(bdyVar)) | baoVar3.D(cmiVar.ordinal()) | baoVar3.F(obj5) | baoVar3.F(clxVar) | baoVar3.F(esnVar);
        Object objG4 = baoVar3.g();
        if (zF4 || objG4 == ban.a) {
            StringBuilder sb = new StringBuilder();
            String str = agc.a;
            sb.append(str);
            sb.append('\n');
            sb.append(str);
            objG4 = Integer.valueOf((int) (agc.a(chcVar, clxVar, esnVar, sb.toString(), 2) & 4294967295L));
            baoVar3.A(objG4);
        }
        int iIntValue4 = iIntValue3 + ((((Number) objG4).intValue() - iIntValue3) * (i3 - 1));
        Integer numValueOf2 = Integer.valueOf(iIntValue4);
        bkm bkmVar3 = bkp.g;
        numValueOf2.getClass();
        bkp bkpVarC2 = zi.c(bkmVar3, Float.NaN, clxVar.cp(iIntValue4));
        baoVar3.p();
        return bkpVarC2;
    }

    public dnu(ykb ykbVar, int i, int i2) {
        this.c = i2;
        this.b = ykbVar;
        this.a = i;
    }
}
