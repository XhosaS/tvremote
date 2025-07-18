package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yru extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ yrv b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yru(yrv yrvVar, yih yihVar) {
        super(yihVar);
        this.b = yrvVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objL = this.b.l(null, 0, 0L, this);
        return objL == yio.a ? objL : new ysd(objL);
    }
}
