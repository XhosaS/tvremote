package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class cno implements Runnable {
    final cnp a;
    final Runnable b;

    public cno(cnp cnpVar, Runnable runnable) {
        this.a = cnpVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.run();
            cnp cnpVar = this.a;
            synchronized (cnpVar.b) {
                cnpVar.a();
            }
        } catch (Throwable th) {
            cnp cnpVar2 = this.a;
            synchronized (cnpVar2.b) {
                cnpVar2.a();
                throw th;
            }
        }
    }
}
