package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxi implements yka {
    final /* synthetic */ hak a;
    final /* synthetic */ yka b;
    final /* synthetic */ gxa c;
    final /* synthetic */ bkd d;
    final /* synthetic */ buo e;
    final /* synthetic */ float f;

    public gxi(hak hakVar, yka ykaVar, gxa gxaVar, bkd bkdVar, buo buoVar, float f) {
        this.a = hakVar;
        this.b = ykaVar;
        this.c = gxaVar;
        this.d = bkdVar;
        this.e = buoVar;
        this.f = f;
    }

    @Override // defpackage.yka
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        xt xtVar = (xt) obj;
        bao baoVar = (bao) obj2;
        int iIntValue = ((Number) obj3).intValue();
        xtVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != baoVar.F(xtVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && baoVar.K()) {
            baoVar.t();
        } else {
            ((gxe) this.a).a.e(new clv(xtVar.b));
            this.b.a(new gxg(xtVar, this.c, this.d, this.e, this.f), baoVar, 0);
        }
        return ygi.a;
    }
}
