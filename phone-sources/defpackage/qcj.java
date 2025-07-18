package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qcj extends yiv {
    Object a;
    Object b;
    Object c;
    Object d;
    /* synthetic */ Object e;
    final /* synthetic */ qcp f;
    int g;
    pxh h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qcj(qcp qcpVar, yih yihVar) {
        super(yihVar);
        this.f = qcpVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.f(null, null, null, null, this);
    }
}
