package defpackage;

import io.grpc.Status;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afst implements afvb {
    final afot a;
    boolean b = false;
    final /* synthetic */ afsv c;

    public afst(afsv afsvVar, afot afotVar) {
        this.c = afsvVar;
        this.a = afotVar;
    }

    @Override // defpackage.afvb
    public final void a(boolean z) {
        this.c.g(this.a, z);
    }

    @Override // defpackage.afvb
    public final void b() {
        afsv afsvVar = this.c;
        afsvVar.d.a(2, "READY");
        afsq afsqVar = new afsq(this);
        afkc afkcVar = afsvVar.g;
        afkcVar.c(afsqVar);
        afkcVar.b();
    }

    @Override // defpackage.afvb
    public final void c(Status status) {
        afgr afgrVarC = this.a.c();
        afsv afsvVar = this.c;
        afsvVar.d.b(2, "{0} SHUTDOWN with {1}", afgrVarC, afsvVar.b(status));
        this.b = true;
        afsr afsrVar = new afsr(this, status);
        afkc afkcVar = afsvVar.g;
        afkcVar.c(afsrVar);
        afkcVar.b();
    }

    @Override // defpackage.afvb
    public final void d() {
        yqw.M(this.b, "transportShutdown() must be called before transportTerminated().");
        afot afotVar = this.a;
        Object[] objArr = {afotVar.c()};
        afsv afsvVar = this.c;
        afsvVar.d.b(2, "{0} Terminated", objArr);
        afgm.c(afsvVar.c.f, afotVar);
        afsvVar.g(afotVar, false);
        Iterator it = afsvVar.f.iterator();
        if (it.hasNext()) {
            afotVar.a();
            throw null;
        }
        afkc afkcVar = afsvVar.g;
        afkcVar.c(new afss(this));
        afkcVar.b();
    }

    @Override // defpackage.afvb
    public final void e() {
        Iterator it = this.c.f.iterator();
        if (it.hasNext()) {
            throw null;
        }
    }
}
