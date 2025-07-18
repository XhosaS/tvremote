package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class dbv implements Runnable {
    final /* synthetic */ dby a;

    public dbv(dby dbyVar) {
        this.a = dbyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            dby dbyVar = this.a;
            boolean z = dbyVar.c;
            try {
                dbyVar.c((dbx) dbyVar.b.remove());
                dbw dbwVar = dbyVar.d;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
