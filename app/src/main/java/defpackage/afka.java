package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afka implements Runnable {
    final Runnable a;
    boolean b;
    boolean c;

    public afka(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b) {
            return;
        }
        this.c = true;
        this.a.run();
    }
}
