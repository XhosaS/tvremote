package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class akz extends yiv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ alg c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akz(alg algVar, yih yihVar) {
        super(yihVar);
        this.c = algVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.p(this);
    }
}
