package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qae extends yiv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ qaf c;
    int d;
    qen e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qae(qaf qafVar, yih yihVar) {
        super(yihVar);
        this.c = qafVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.f(null, null, null, this);
    }
}
