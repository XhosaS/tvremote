package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uhx extends ufa implements Runnable {
    private final Runnable a;

    public uhx(Runnable runnable) {
        runnable.getClass();
        this.a = runnable;
    }

    @Override // defpackage.ufb
    protected final String dw() {
        return "task=[" + this.a.toString() + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.run();
        } catch (Throwable th) {
            e(th);
            throw th;
        }
    }
}
