package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class usf implements utj {
    final /* synthetic */ usg a;

    public usf(usg usgVar) {
        this.a = usgVar;
    }

    @Override // defpackage.utj
    public final /* synthetic */ utv b() {
        return utv.a;
    }

    @Override // defpackage.utj
    public final /* synthetic */ utv f(upq upqVar) {
        return utv.a;
    }

    @Override // defpackage.utj
    public final utv g(vvd vvdVar) {
        throw null;
    }

    @Override // defpackage.utj
    public final utv h(vvd vvdVar) {
        xpy xpyVar = (xpy) vvdVar.d;
        uqr uqrVar = (uqr) xpyVar.g(uqr.a);
        ((uqh) xpyVar.g(uqi.a)).a.getPackageManager();
        sij.x(uqrVar.d(), "Using ApiKeyStrategy for method that is not allowed without credentials");
        Object obj = vvdVar.b;
        xsj xsjVar = usg.a;
        sij.x(!r4.i(xsjVar), "API key was already attached to the request");
        ((xsm) obj).h(xsjVar, this.a.b);
        return utv.a;
    }

    @Override // defpackage.utj
    public final /* synthetic */ void d(upo upoVar) {
    }

    @Override // defpackage.utj
    public final /* synthetic */ void e(upq upqVar) {
    }

    @Override // defpackage.utj
    public final /* synthetic */ void i(upo upoVar) {
    }
}
