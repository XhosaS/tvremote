package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kbj implements yka {
    final /* synthetic */ long a;
    final /* synthetic */ kca b;
    final /* synthetic */ yjk c;
    final /* synthetic */ yjv d;
    final /* synthetic */ bcb e;
    final /* synthetic */ ovq f;

    public kbj(long j, ovq ovqVar, kca kcaVar, yjk yjkVar, yjv yjvVar, bcb bcbVar) {
        this.a = j;
        this.f = ovqVar;
        this.b = kcaVar;
        this.c = yjkVar;
        this.d = yjvVar;
        this.e = bcbVar;
    }

    @Override // defpackage.yka
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        bao baoVar = (bao) obj2;
        ((Number) obj3).intValue();
        ((lt) obj).getClass();
        bkm bkmVar = bkp.g;
        bkp bkpVarA = zi.a(bkmVar, 1.0f);
        np npVar = kbf.a;
        bkp bkpVarX = bga.x(ccf.d(zi.b(bkpVarA, 296.0f), "trailer_autoplay"));
        bvt bvtVarA = xo.a(bkb.a, false);
        int iK = a.k(zy.p(baoVar));
        bhu bhuVarO = baoVar.O();
        bkp bkpVarC = bdi.C(baoVar, bkpVarX);
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
        bcb bcbVar = this.e;
        yjv yjvVar = this.d;
        yjk yjkVar2 = this.c;
        kca kcaVar = this.b;
        ovq ovqVar = this.f;
        long j = this.a;
        beb.a(baoVar, bkpVarC, bxt.b);
        ((kdj) baoVar.f(jab.a)).d(267686, bga.k(1308588588, new kbi(ovqVar, kcaVar, yjkVar2, yjvVar, bcbVar, 0), baoVar), baoVar, 54);
        xo.b(hq.g(bkmVar.a(zi.c), kbf.a(j), null, 6), baoVar, 0);
        baoVar.o();
        return ygi.a;
    }
}
