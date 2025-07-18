package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yrt extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ yrv b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yrt(yrv yrvVar, yih yihVar) {
        super(yihVar);
        this.b = yrvVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objK = yrv.k(this.b, this);
        return objK == yio.a ? objK : new ysd(objK);
    }
}
