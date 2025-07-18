package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qst extends yiv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ qsu c;
    int d;
    qgv e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qst(qsu qsuVar, yih yihVar) {
        super(yihVar);
        this.c = qsuVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.h(null, null, null, null, false, this);
    }
}
