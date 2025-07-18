package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xxr implements xzd {
    final xvv a;
    boolean b = false;
    final /* synthetic */ xxt c;

    public xxr(xxt xxtVar, xvv xvvVar) {
        this.c = xxtVar;
        this.a = xvvVar;
    }

    @Override // defpackage.xzd
    public final void a(boolean z) {
        this.c.f(this.a, z);
    }

    @Override // defpackage.xzd
    public final void b() {
        xxt xxtVar = this.c;
        xxtVar.d.a(2, "READY");
        xxtVar.g.execute(new xwf(this, 14));
    }

    @Override // defpackage.xzd
    public final void c(xtk xtkVar) {
        Object[] objArr = {this.a.c(), xxt.k(xtkVar)};
        xxt xxtVar = this.c;
        xxtVar.d.b(2, "{0} SHUTDOWN with {1}", objArr);
        this.b = true;
        xxtVar.g.execute(new xxl(this, xtkVar, 2));
    }

    @Override // defpackage.xzd
    public final void d() {
        sij.x(this.b, "transportShutdown() must be called before transportTerminated().");
        xvv xvvVar = this.a;
        Object[] objArr = {xvvVar.c()};
        xxt xxtVar = this.c;
        xxtVar.d.b(2, "{0} Terminated", objArr);
        xrb.b(xxtVar.c.e, xvvVar);
        xxtVar.f(xvvVar, false);
        Iterator it = xxtVar.f.iterator();
        if (it.hasNext()) {
            throw null;
        }
        xxtVar.g.execute(new xwf(this, 15));
    }

    @Override // defpackage.xzd
    public final void e() {
        Iterator it = this.c.f.iterator();
        if (it.hasNext()) {
            throw null;
        }
    }
}
