package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afng {
    public final afhe a;
    public afhm b;
    public afhn c;
    final /* synthetic */ afnl d;

    public afng(afnl afnlVar, afhe afheVar) {
        this.d = afnlVar;
        this.a = afheVar;
        afhn afhnVarA = afnlVar.a.a(afnlVar.b);
        this.c = afhnVarA;
        if (afhnVarA != null) {
            this.b = afhnVarA.a(afheVar);
            return;
        }
        throw new IllegalStateException("Could not find policy '" + afnlVar.b + "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files.");
    }
}
