package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qck extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ qcp b;
    int c;
    qis d;
    pxh e;
    String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qck(qcp qcpVar, yih yihVar) {
        super(yihVar);
        this.b = qcpVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.g(null, null, null, null, null, null, null, null, false, this);
    }
}
