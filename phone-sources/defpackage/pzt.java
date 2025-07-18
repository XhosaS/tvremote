package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pzt extends yiv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ pzu c;
    int d;
    qen e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pzt(pzu pzuVar, yih yihVar) {
        super(yihVar);
        this.c = pzuVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.f(null, null, null, this);
    }
}
