package defpackage;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
class agbw implements Runnable {
    final /* synthetic */ CyclicBarrier a;
    final /* synthetic */ CountDownLatch b;

    public agbw(CyclicBarrier cyclicBarrier, CountDownLatch countDownLatch) {
        this.a = cyclicBarrier;
        this.b = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException, TimeoutException, BrokenBarrierException {
        try {
            this.a.await(1000L, TimeUnit.MILLISECONDS);
            this.b.await();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (BrokenBarrierException | TimeoutException unused2) {
        }
    }
}
