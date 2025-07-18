package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class lgh implements Runnable {
    final /* synthetic */ kzj a;
    final /* synthetic */ lgo b;

    public lgh(lgo lgoVar, kzj kzjVar) {
        this.a = kzjVar;
        this.b = lgoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lgo lgoVar = this.b;
        synchronized (lgoVar) {
            lgoVar.a = false;
            lgp lgpVar = lgoVar.c;
            if (!lgpVar.w()) {
                lbk lbkVar = lgpVar.y;
                lab labVar = lbkVar.f;
                lbkVar.o(labVar);
                labVar.k.a("Connected to service");
                lgpVar.v(this.a);
            }
        }
    }
}
