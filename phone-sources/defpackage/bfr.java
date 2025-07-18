package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfr implements bfq {
    final /* synthetic */ bfq a;
    final /* synthetic */ bdj b;

    public bfr(bfq bfqVar, bdj bdjVar) {
        this.a = bfqVar;
        this.b = bdjVar;
    }

    @Override // defpackage.bfq
    public final List a() {
        List listA = this.a.a();
        bdj bdjVar = this.b;
        int i = bdjVar.q;
        return i < 0 ? listA : yfm.af(bcm.p(bdjVar, i, Integer.valueOf(bdjVar.k(i))), listA);
    }
}
