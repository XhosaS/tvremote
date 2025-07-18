package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class yfa extends xrp {
    @Override // defpackage.xrp
    public final xru b(xrm xrmVar) {
        return g().b(xrmVar);
    }

    @Override // defpackage.xrp
    public final xtq c() {
        return g().c();
    }

    @Override // defpackage.xrp
    public final ScheduledExecutorService d() {
        return g().d();
    }

    @Override // defpackage.xrp
    public final void e() {
        g().e();
    }

    @Override // defpackage.xrp
    public void f(xqk xqkVar, xrv xrvVar) {
        throw null;
    }

    protected abstract xrp g();

    public final String toString() {
        tss tssVarH = sij.H(this);
        tssVarH.b("delegate", g());
        return tssVarH.toString();
    }
}
