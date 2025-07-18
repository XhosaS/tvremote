package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ut extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ uu b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ut(uu uuVar, yih yihVar) {
        super(yihVar);
        this.b = uuVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(null, null, this);
    }
}
