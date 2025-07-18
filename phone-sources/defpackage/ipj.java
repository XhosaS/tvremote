package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ipj extends yiv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ iqo c;
    int d;
    isg e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ipj(iqo iqoVar, yih yihVar) {
        super(yihVar);
        this.c = iqoVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.j(null, null, this);
    }
}
