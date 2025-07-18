package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class dcz implements Runnable {
    final /* synthetic */ ddd a;
    private final dos b;

    public dcz(ddd dddVar, dos dosVar) {
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
                    try {
                        ((dot) dosVar).g(dddVar.b);
                    } catch (Throwable th) {
                        throw new dbz(th);
                    }
                }
                dddVar.e();
            }
        }
    }
}
