package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bsg extends yiv {
    long a;
    /* synthetic */ Object b;
    final /* synthetic */ bsh c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bsg(bsh bshVar, yih yihVar) {
        super(yihVar);
        this.c = bshVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(0L, this);
    }
}
