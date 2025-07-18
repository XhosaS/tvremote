package defpackage;

import androidx.compose.material.MinimumInteractiveModifier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apv implements yjz {
    final /* synthetic */ bkp a;
    final /* synthetic */ bol b;
    final /* synthetic */ long c;
    final /* synthetic */ float d;
    final /* synthetic */ float e;
    final /* synthetic */ boolean f;
    final /* synthetic */ yjk g;
    final /* synthetic */ yjz h;
    final /* synthetic */ kw i;

    public apv(bkp bkpVar, bol bolVar, long j, float f, float f2, kw kwVar, boolean z, yjk yjkVar, yjz yjzVar) {
        this.a = bkpVar;
        this.b = bolVar;
        this.c = j;
        this.d = f;
        this.e = f2;
        this.i = kwVar;
        this.f = z;
        this.g = yjkVar;
        this.h = yjzVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bao baoVar = (bao) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && baoVar.K()) {
            baoVar.t();
        } else {
            bkp bkpVar = this.a;
            bcp bcpVar = aos.a;
            bkp bkpVarA = bkpVar.a(MinimumInteractiveModifier.a);
            bol bolVar = this.b;
            bkp bkpVarW = bga.w(hq.f(bga.q(bkpVarA, this.e, bolVar, 24).a(bkp.g), og.H(this.c, (anz) baoVar.f(aok.a), this.d, baoVar), bolVar), bolVar);
            kw kwVar = this.i;
            bcp bcpVar2 = apa.a;
            long j = bnq.g;
            bkp bkpVarW2 = hu.w(bkpVarW, kwVar, (cma.b(Float.NaN, Float.NaN) && a.s(j, j)) ? apa.b : new apc(j), this.f, null, this.g, 24);
            yjz yjzVar = this.h;
            bvt bvtVarA = xo.a(bkb.a, true);
            int iO = zy.o(baoVar);
            bhu bhuVarO = baoVar.O();
            bkp bkpVarC = bdi.C(baoVar, bkpVarW2);
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
        }
        return ygi.a;
    }
}
