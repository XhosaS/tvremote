package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class izr extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ izs b;
    int c;
    rul d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izr(izs izsVar, yih yihVar) {
        super(yihVar);
        this.b = izsVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
