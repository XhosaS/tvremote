package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qh extends yiv {
    long a;
    /* synthetic */ Object b;
    final /* synthetic */ qj c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh(qj qjVar, yih yihVar) {
        super(yihVar);
        this.c = qjVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.f(0L, null, this);
    }
}
