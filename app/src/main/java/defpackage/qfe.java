package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class qfe implements zxe {
    final /* synthetic */ qff a;

    public qfe(qff qffVar) {
        this.a = qffVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        piy piyVar = this.a.a.c;
        if (piyVar == null) {
            piyVar = piy.a;
        }
        qce.g(th, "%s: Unable to increment LoggingStateStore network usage for %s", "NetworkUsageMonitor", piyVar.d);
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        piy piyVar = this.a.a.c;
        if (piyVar == null) {
            piyVar = piy.a;
        }
        String str = piyVar.d;
        int i = qce.a;
    }
}
