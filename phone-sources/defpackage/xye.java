package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xye extends xqw {
    public final xqo a;
    private final xrc b;
    private final xpz c;
    private final Executor d;
    private final xsq e;
    private xpy f;
    private xqb g;

    public xye(xrc xrcVar, xpz xpzVar, Executor executor, xsq xsqVar, xpy xpyVar) {
        this.b = xrcVar;
        this.c = xpzVar;
        this.e = xsqVar;
        Executor executor2 = xpyVar.c;
        executor = executor2 != null ? executor2 : executor;
        this.d = executor;
        this.f = xpyVar.c(executor);
        this.a = xqo.b();
    }

    @Override // defpackage.xqw, defpackage.xqb
    public final void a(wbb wbbVar, xsm xsmVar) {
        xsq xsqVar = this.e;
        new xrs(xsqVar, xsmVar, this.f, xyr.f);
        ulo uloVarA = this.b.a();
        xtk xtkVar = (xtk) uloVarA.b;
        if (!xtkVar.g()) {
            this.d.execute(new xyd(this, wbbVar, xxc.b(xtkVar)));
            this.g = xyr.g;
        } else {
            xza xzaVarB = ((xzc) uloVarA.a).b(xsqVar);
            if (xzaVarB != null) {
                this.f = this.f.f(xza.a, xzaVarB);
            }
            xqb xqbVarA = this.c.a(xsqVar, this.f);
            this.g = xqbVarA;
            xqbVarA.a(wbbVar, xsmVar);
        }
    }

    @Override // defpackage.xqw, defpackage.xtb
    protected final xqb b() {
        return this.g;
    }

    @Override // defpackage.xtb, defpackage.xqb
    public final void c(String str, Throwable th) {
        xqb xqbVar = this.g;
        if (xqbVar != null) {
            xqbVar.c(str, th);
        }
    }
}
