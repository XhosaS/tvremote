package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dlq extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ dlr b;
    int c;
    dlr d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlq(dlr dlrVar, yih yihVar) {
        super(yihVar);
        this.b = dlrVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(this);
    }
}
