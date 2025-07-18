package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class knk implements yka {
    final /* synthetic */ int a;
    final /* synthetic */ long b;
    final /* synthetic */ String c;

    public knk(int i, long j, String str) {
        this.a = i;
        this.b = j;
        this.c = str;
    }

    @Override // defpackage.yka
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        bao baoVar = (bao) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((zh) obj).getClass();
        if ((iIntValue & 17) == 16 && baoVar.K()) {
            baoVar.t();
        } else {
            bkm bkmVar = bkp.g;
            bkh bkhVar = bkb.n;
            long j = kni.a;
            xe xeVarF = xk.f(8.0f, bkb.k);
            int i = this.a;
            long j2 = this.b;
            String str = this.c;
            bvt bvtVarA = zf.a(xeVarF, bkhVar, baoVar, 54);
            int iK = a.k(zy.p(baoVar));
            bhu bhuVarO = baoVar.O();
            bkp bkpVarC = bdi.C(baoVar, bkmVar);
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
            asg.a(ccf.y(i, baoVar, 0), null, zi.d(bkmVar, 18.0f), j2, baoVar, 432, 0);
            axa.b(str, wv.o(bkmVar, kni.d), j2, jyv.r(kni.e, baoVar), null, 0L, new clk(), jyv.r(kni.f, baoVar), 0, false, 0, 0, null, null, baoVar, 48, 0, 259048);
            baoVar.o();
        }
        return ygi.a;
    }
}
