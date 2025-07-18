package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qco extends yiv {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ qcp c;
    int d;
    pxh e;
    qis f;
    String g;
    qrk h;
    qrj i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qco(qcp qcpVar, yih yihVar) {
        super(yihVar);
        this.c = qcpVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
