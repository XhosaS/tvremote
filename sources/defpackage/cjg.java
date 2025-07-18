package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cjg extends cgw implements Runnable {
    private final Runnable a;

    public cjg(Runnable runnable) {
        runnable.getClass();
        this.a = runnable;
    }

    @Override // defpackage.cgx
    protected final String a() {
        return "task=[" + this.a.toString() + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.run();
        } catch (Throwable th) {
            d(th);
            throw th;
        }
    }
}
