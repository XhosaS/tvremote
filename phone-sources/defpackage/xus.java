package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xus {
    public final xrp a;
    public xrx b;
    public xry c;
    final /* synthetic */ ulo d;

    public xus(ulo uloVar, xrp xrpVar) {
        this.d = uloVar;
        this.a = xrpVar;
        xry xryVarA = ((xrz) uloVar.a).a((String) uloVar.b);
        this.c = xryVarA;
        if (xryVarA != null) {
            this.b = xryVarA.a(xrpVar);
            return;
        }
        throw new IllegalStateException("Could not find policy '" + ((String) uloVar.b) + "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files.");
    }
}
