package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ageu {
    public final Object a;
    public final afhm b;
    final /* synthetic */ agew e;
    public afhk d = new afhd(afhg.a);
    public affe c = affe.CONNECTING;

    public ageu(agew agewVar, Object obj, afhc afhcVar) {
        this.e = agewVar;
        this.a = obj;
        this.b = afhcVar.a(a());
    }

    protected aget a() {
        return new aget(this);
    }

    protected final void b() {
        this.b.d();
        this.c = affe.SHUTDOWN;
        agew.f.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer$ChildLbState", "shutdown", "Child balancer {0} deleted", this.a);
    }

    public final String toString() {
        return "Address = " + String.valueOf(this.a) + ", state = " + String.valueOf(this.c) + ", picker type: " + String.valueOf(this.d.getClass()) + ", lb: " + String.valueOf(this.b);
    }
}
