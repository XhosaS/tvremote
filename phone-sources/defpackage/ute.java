package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ute implements utj {
    private final /* synthetic */ int a;
    private final Object b;

    public ute(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.utj
    public final /* synthetic */ utv b() {
        return this.a != 0 ? utv.a : utv.a;
    }

    @Override // defpackage.utj
    public final /* synthetic */ utv f(upq upqVar) {
        return this.a != 0 ? utv.a : utv.a;
    }

    @Override // defpackage.utj
    public final /* synthetic */ utv g(vvd vvdVar) {
        return this.a != 0 ? utv.a : utv.a;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, uqs] */
    @Override // defpackage.utj
    public final utv h(vvd vvdVar) {
        if (this.a != 0) {
            Object obj = vvdVar.d;
            xpx xpxVar = uqi.a;
            xpy xpyVar = (xpy) obj;
            sij.x(xpyVar.g(xpxVar) == null, "ChannelConfig provided twice");
            return new utv(1, null, null, null, xpyVar.f(xpxVar, this.b));
        }
        sij.x(true, "Cronet does not support CallOptions.withAuthority(). See https://github.com/grpc/grpc-java/issues/1767");
        Object objF = vvdVar.d;
        xpx xpxVar2 = uqr.a;
        xpy xpyVar2 = (xpy) objF;
        uqr uqrVarC = (uqr) xpyVar2.g(xpxVar2);
        if (uqrVarC == null) {
            uqrVarC = this.b.c(((xsq) vvdVar.a).b);
            uqrVarC.getClass();
            objF = xpyVar2.f(xpxVar2, uqrVarC);
        }
        return new utv(1, null, null, null, ((xpy) objF).f(owm.a, uqrVarC.a()));
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
