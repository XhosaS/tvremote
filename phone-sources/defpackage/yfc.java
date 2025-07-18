package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class yfc {
    public final Object a;
    public final xrx b;
    final /* synthetic */ yfe e;
    public xrv d = new xro(xrr.a);
    public xqk c = xqk.CONNECTING;

    public yfc(yfe yfeVar, Object obj, xrn xrnVar) {
        this.e = yfeVar;
        this.a = obj;
        this.b = xrnVar.a(a());
    }

    protected yfb a() {
        return new yfb(this);
    }

    protected final void b() {
        this.b.d();
        this.c = xqk.SHUTDOWN;
        yfe.f.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer$ChildLbState", "shutdown", "Child balancer {0} deleted", this.a);
    }

    public final String toString() {
        return "Address = " + String.valueOf(this.a) + ", state = " + String.valueOf(this.c) + ", picker type: " + String.valueOf(this.d.getClass()) + ", lb: " + String.valueOf(this.b);
    }
}
