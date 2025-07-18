package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afvt implements afhl {
    public afwa a;
    final /* synthetic */ afwb b;

    public afvt(afwb afwbVar) {
        this.b = afwbVar;
    }

    @Override // defpackage.afhl
    public final void a(afff afffVar) {
        afwb afwbVar = this.b;
        if (afwbVar.o) {
            afwb.f.logp(Level.WARNING, "io.grpc.internal.PickFirstLeafLoadBalancer$HealthListener", "onSubchannelState", "Ignoring health status {0} for subchannel {1} as this is not under a petiole policy", new Object[]{afffVar, this.a.a});
            return;
        }
        afwb.f.logp(Level.FINE, "io.grpc.internal.PickFirstLeafLoadBalancer$HealthListener", "onSubchannelState", "Received health status {0} for subchannel {1}", new Object[]{afffVar, this.a.a});
        this.a.d = afffVar;
        afvv afvvVar = afwbVar.i;
        if (afvvVar.e() && this.a == afwbVar.h.get(afvvVar.b())) {
            afwbVar.i(this.a);
        }
    }
}
