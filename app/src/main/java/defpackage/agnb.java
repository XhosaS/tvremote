package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agnb extends agmf implements Runnable {
    private static final long serialVersionUID = 1811839108042568751L;

    public agnb(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d = Thread.currentThread();
        try {
            this.c.run();
            this.d = null;
        } catch (Throwable th) {
            this.d = null;
            lazySet(a);
            agoh.e(th);
        }
    }
}
