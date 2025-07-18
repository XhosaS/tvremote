package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class dnq implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ dnr b;

    public dnq(dnr dnrVar, boolean z) {
        this.a = z;
        this.b = dnrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dqm.f();
        dns dnsVar = this.b.a;
        boolean z = dnsVar.a;
        boolean z2 = this.a;
        dnsVar.a = z2;
        if (z != z2) {
            dnsVar.b.a(z2);
        }
    }
}
