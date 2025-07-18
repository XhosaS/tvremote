package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agei extends zum {
    public final afeq a;

    public agei(afeq afeqVar) {
        this.a = afeqVar;
    }

    @Override // defpackage.zum
    protected final String a() {
        yqq yqqVarB = yqr.b(this);
        yqqVarB.b("clientCall", this.a);
        return yqqVarB.toString();
    }

    @Override // defpackage.zum
    protected final void m() {
        this.a.b("GrpcFuture was cancelled", null);
    }
}
