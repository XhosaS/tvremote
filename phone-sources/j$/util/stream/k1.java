package j$.util.stream;

/* loaded from: classes4.dex */
public final class k1 implements Runnable {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ Runnable b;

    public k1(Runnable runnable, Runnable runnable2) {
        this.a = runnable;
        this.b = runnable2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.b;
        try {
            this.a.run();
            runnable.run();
        } catch (Throwable th) {
            try {
                runnable.run();
            } catch (Throwable th2) {
                try {
                    th.addSuppressed(th2);
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }
}
