package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class asy implements yjz {
    final /* synthetic */ long a;
    final /* synthetic */ yjk b;
    final /* synthetic */ auv c;
    final /* synthetic */ mr d;
    final /* synthetic */ yow e;
    final /* synthetic */ yjv f;
    final /* synthetic */ bkp g;
    final /* synthetic */ float h;
    final /* synthetic */ boolean i;
    final /* synthetic */ bol j;
    final /* synthetic */ long k;
    final /* synthetic */ long l;
    final /* synthetic */ yjz m;
    final /* synthetic */ yjz n;
    final /* synthetic */ yka o;

    public asy(long j, yjk yjkVar, auv auvVar, mr mrVar, yow yowVar, yjv yjvVar, bkp bkpVar, float f, boolean z, bol bolVar, long j2, long j3, yjz yjzVar, yjz yjzVar2, yka ykaVar) {
        this.a = j;
        this.b = yjkVar;
        this.c = auvVar;
        this.d = mrVar;
        this.e = yowVar;
        this.f = yjvVar;
        this.g = bkpVar;
        this.h = f;
        this.i = z;
        this.j = bolVar;
        this.k = j2;
        this.l = j3;
        this.m = yjzVar;
        this.n = yjzVar2;
        this.o = ykaVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bao baoVar = (bao) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (baoVar.L(i != 2, iIntValue & 1)) {
            bkp bkpVarH = zy.h(bkp.g.a(zi.c));
            Object objG = baoVar.g();
            if (objG == ban.a) {
                objG = new aru(4);
                baoVar.A(objG);
            }
            bkp bkpVarB = cfd.b(bkpVarH, false, (yjv) objG);
            long j = this.a;
            yjk yjkVar = this.b;
            auv auvVar = this.c;
            mr mrVar = this.d;
            yow yowVar = this.e;
            yjv yjvVar = this.f;
            bkp bkpVar = this.g;
            float f = this.h;
            boolean z = this.i;
            bol bolVar = this.j;
            long j2 = this.k;
            long j3 = this.l;
            yjz yjzVar = this.m;
            yjz yjzVar2 = this.n;
            yka ykaVar = this.o;
            bvt bvtVarA = xo.a(bkb.a, false);
            int iO = zy.o(baoVar);
            bhu bhuVarO = baoVar.O();
            bkp bkpVarC = bdi.C(baoVar, bkpVarB);
            yjk yjkVar2 = bxt.a;
            baoVar.c();
            baoVar.z();
            if (baoVar.J()) {
                baoVar.k(yjkVar2);
            } else {
                baoVar.B();
            }
            beb.a(baoVar, bvtVarA, bxt.d);
            beb.a(baoVar, bhuVarO, bxt.c);
            yjz yjzVar3 = bxt.e;
            if (baoVar.J() || !yks.e(baoVar.g(), Integer.valueOf(iO))) {
                Integer numValueOf = Integer.valueOf(iO);
                baoVar.A(numValueOf);
                baoVar.i(numValueOf, yjzVar3);
            }
            beb.a(baoVar, bkpVarC, bxt.b);
            xs xsVar = xs.a;
            atc.a(j, yjkVar, ((auw) auvVar.b.j()) != auw.a, baoVar, 0);
            atc.e(xsVar, mrVar, yowVar, yjkVar, yjvVar, bkpVar, auvVar, f, z, bolVar, j2, j3, yjzVar, yjzVar2, ykaVar, baoVar, 70, 0);
            baoVar.o();
        } else {
            baoVar.t();
        }
        return ygi.a;
    }
}
