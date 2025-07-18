package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yev extends ufb {
    public final xqb a;

    public yev(xqb xqbVar) {
        this.a = xqbVar;
    }

    @Override // defpackage.ufb
    protected final boolean b(Object obj) {
        return super.b(obj);
    }

    @Override // defpackage.ufb
    protected final String dw() {
        tss tssVarH = sij.H(this);
        tssVarH.b("clientCall", this.a);
        return tssVarH.toString();
    }

    @Override // defpackage.ufb
    public final boolean e(Throwable th) {
        return super.e(th);
    }

    @Override // defpackage.ufb
    protected final void o() {
        this.a.c("GrpcFuture was cancelled", null);
    }
}
