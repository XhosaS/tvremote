package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qbj extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ qbk b;
    int c;
    vje d;
    vjf e;
    qen f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbj(qbk qbkVar, yih yihVar) {
        super(yihVar);
        this.b = qbkVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, null, null, this);
    }
}
