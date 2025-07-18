package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kpa implements yka {
    final /* synthetic */ float a;
    final /* synthetic */ yjz b;

    public kpa(float f, yjz yjzVar) {
        this.a = f;
        this.b = yjzVar;
    }

    @Override // defpackage.yka
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        bao baoVar = (bao) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((xx) obj).getClass();
        if ((iIntValue & 17) == 16 && baoVar.K()) {
            baoVar.t();
        } else {
            bkp bkpVarK = zi.k(bkp.g, 0.0f, this.a, 1);
            yjz yjzVar = this.b;
            bvt bvtVarA = xo.a(bkb.a, false);
            int iK = a.k(zy.p(baoVar));
            bhu bhuVarO = baoVar.O();
            bkp bkpVarC = bdi.C(baoVar, bkpVarK);
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
            if (baoVar.J() || !yks.e(baoVar.g(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                baoVar.A(numValueOf);
                baoVar.i(numValueOf, yjzVar2);
            }
            beb.a(baoVar, bkpVarC, bxt.b);
            yjzVar.a(baoVar, 0);
            baoVar.o();
        }
        return ygi.a;
    }
}
