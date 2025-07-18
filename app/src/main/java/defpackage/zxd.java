package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class zxd extends zwy implements AutoCloseable, zyg {
    protected zxd() {
    }

    @Override // defpackage.zwy, java.lang.AutoCloseable
    public /* synthetic */ void close() throws InterruptedException {
        if (this == ForkJoinPool.commonPool() || isTerminated()) {
            return;
        }
        shutdown();
        boolean zAwaitTermination = false;
        boolean z = false;
        while (!zAwaitTermination) {
            try {
                zAwaitTermination = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                }
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    protected abstract zyg e();

    @Override // defpackage.zwy, java.util.concurrent.ExecutorService
    /* renamed from: eM, reason: merged with bridge method [inline-methods] */
    public final zyd submit(Runnable runnable) {
        return e().submit(runnable);
    }

    @Override // defpackage.zwy, java.util.concurrent.ExecutorService
    /* renamed from: eN, reason: merged with bridge method [inline-methods] */
    public final zyd submit(Callable callable) {
        return e().submit(callable);
    }

    @Override // defpackage.zwy, java.util.concurrent.ExecutorService
    /* renamed from: eO, reason: merged with bridge method [inline-methods] */
    public final zyd submit(Runnable runnable, Object obj) {
        return e().submit(runnable, obj);
    }

    @Override // defpackage.zwy
    protected /* bridge */ /* synthetic */ ExecutorService g() {
        throw null;
    }
}
