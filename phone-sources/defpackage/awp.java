package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class awp implements yjz {
    final /* synthetic */ bkp a;
    final /* synthetic */ bol b;
    final /* synthetic */ long c;
    final /* synthetic */ float d;
    final /* synthetic */ boolean e;
    final /* synthetic */ boolean f;
    final /* synthetic */ yjv g;
    final /* synthetic */ float h;
    final /* synthetic */ yjz i;
    final /* synthetic */ kw j;

    public awp(bkp bkpVar, bol bolVar, long j, float f, boolean z, kw kwVar, boolean z2, yjv yjvVar, float f2, yjz yjzVar) {
        this.a = bkpVar;
        this.b = bolVar;
        this.c = j;
        this.d = f;
        this.e = z;
        this.j = kwVar;
        this.f = z2;
        this.g = yjvVar;
        this.h = f2;
        this.i = yjzVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bao baoVar = (bao) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (baoVar.L(i != 2, iIntValue & 1)) {
            bkp bkpVar = this.a;
            bkp bkpVarBU = a.bU(hp.v(awq.a(ask.a(bkpVar), this.b, awq.b(this.c, this.d, baoVar), null, ((clx) baoVar.f(ccq.d)).cr(this.h)), this.e, this.j, atn.a(false, 0.0f, 7), this.f, null, this.g));
            yjz yjzVar = this.i;
            bvt bvtVarA = xo.a(bkb.a, true);
            int iO = zy.o(baoVar);
            bhu bhuVarO = baoVar.O();
            bkp bkpVarC = bdi.C(baoVar, bkpVarBU);
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
            beb.a(baoVar, bkpVarC, bxt.b);
            yjzVar.a(baoVar, 0);
            baoVar.o();
        } else {
            baoVar.t();
        }
        return ygi.a;
    }
}
