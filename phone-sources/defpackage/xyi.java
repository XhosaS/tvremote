package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xyi extends xrp {
    xus a;
    final /* synthetic */ xyr b;

    public xyi(xyr xyrVar) {
        this.b = xyrVar;
    }

    @Override // defpackage.xrp
    public final xqa a() {
        return this.b.F;
    }

    @Override // defpackage.xrp
    public final /* bridge */ /* synthetic */ xru b(xrm xrmVar) {
        xyr xyrVar = this.b;
        xyrVar.m.c();
        sij.x(!xyrVar.B, "Channel is being terminated");
        return new xun(xyrVar, xrmVar);
    }

    @Override // defpackage.xrp
    public final xtq c() {
        return this.b.m;
    }

    @Override // defpackage.xrp
    public final ScheduledExecutorService d() {
        return this.b.j;
    }

    @Override // defpackage.xrp
    public final void e() {
        xtq xtqVar = this.b.m;
        xtqVar.c();
        xtqVar.execute(new xwf(this, 19));
    }

    @Override // defpackage.xrp
    public final void f(xqk xqkVar, xrv xrvVar) {
        xyr xyrVar = this.b;
        xyrVar.m.c();
        xqkVar.getClass();
        if (this != xyrVar.t || xyrVar.u) {
            return;
        }
        xyrVar.j(xrvVar);
        if (xqkVar != xqk.SHUTDOWN) {
            xyrVar.F.b(2, "Entering {0} state with picker: {1}", xqkVar, xrvVar);
            xyrVar.o.a(xqkVar);
        }
    }
}
