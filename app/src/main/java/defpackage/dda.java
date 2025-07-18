package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class dda implements Runnable {
    final /* synthetic */ ddd a;
    private final dos b;

    public dda(ddd dddVar, dos dosVar) {
        this.a = dddVar;
        this.b = dosVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dos dosVar = this.b;
        synchronized (dosVar.a()) {
            ddd dddVar = this.a;
            synchronized (dddVar) {
                if (dddVar.a.c(dosVar)) {
                    dddVar.c.d();
                    try {
                        dosVar.d(dddVar.c, dddVar.d);
                        this.a.g(this.b);
                    } catch (Throwable th) {
                        throw new dbz(th);
                    }
                }
                this.a.e();
            }
        }
    }
}
