package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xzq implements xrw {
    public xzv a;
    final /* synthetic */ xzw b;

    public xzq(xzw xzwVar) {
        this.b = xzwVar;
    }

    @Override // defpackage.xrw
    public final void a(xql xqlVar) {
        xzw xzwVar = this.b;
        if (xzwVar.n) {
            xzw.f.logp(Level.WARNING, "io.grpc.internal.PickFirstLeafLoadBalancer$HealthListener", "onSubchannelState", "Ignoring health status {0} for subchannel {1} as this is not under a petiole policy", new Object[]{xqlVar, this.a.a});
            return;
        }
        xzw.f.logp(Level.FINE, "io.grpc.internal.PickFirstLeafLoadBalancer$HealthListener", "onSubchannelState", "Received health status {0} for subchannel {1}", new Object[]{xqlVar, this.a.a});
        this.a.d = xqlVar;
        xzr xzrVar = xzwVar.i;
        if (xzrVar.f() && this.a == xzwVar.h.get(xzrVar.b())) {
            xzwVar.h(this.a);
        }
    }
}
