package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kne implements yjz {
    final /* synthetic */ int a;
    final /* synthetic */ float b;

    public kne(int i, float f) {
        this.a = i;
        this.b = f;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bao baoVar = (bao) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && baoVar.K()) {
            baoVar.t();
        } else {
            bkm bkmVar = bkp.g;
            bkp bkpVarA = bkmVar.a(zi.c);
            int i = this.a;
            float f = this.b;
            bvt bvtVarA = xo.a(bkb.a, false);
            int iK = a.k(zy.p(baoVar));
            bhu bhuVarO = baoVar.O();
            bkp bkpVarC = bdi.C(baoVar, bkpVarA);
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
            rdd.z(ccf.y(i, baoVar, 0), null, zi.d(xs.a.a(bkmVar, bkb.e), f), 0L, baoVar, 48, 8);
            baoVar.o();
        }
        return ygi.a;
    }
}
