package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class pmg implements Runnable {
    final /* synthetic */ pmh a;
    private final Runnable b;

    public pmg(pmh pmhVar, Runnable runnable) {
        this.a = pmhVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.run();
        } finally {
            this.a.a();
        }
    }
}
