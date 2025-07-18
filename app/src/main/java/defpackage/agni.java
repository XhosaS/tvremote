package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agni implements Runnable {
    private final Runnable a;
    private final agnl b;
    private final long c;

    public agni(Runnable runnable, agnl agnlVar, long j) {
        this.a = runnable;
        this.b = agnlVar;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        agnl agnlVar = this.b;
        if (agnlVar.c) {
            return;
        }
        long jA = agnlVar.a(TimeUnit.MILLISECONDS);
        long j = this.c;
        if (j > jA) {
            try {
                Thread.sleep(j - jA);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                agoh.e(e);
                return;
            }
        }
        if (this.b.c) {
            return;
        }
        this.a.run();
    }
}
