package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class mdy extends zxd implements AutoCloseable, zyh {
    protected mdy() {
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: a */
    public final zyf schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return h().schedule(runnable, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: b */
    public final zyf schedule(Callable callable, long j, TimeUnit timeUnit) {
        return h().schedule(callable, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: c */
    public final zyf scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return h().scheduleAtFixedRate(runnable, j, j2, timeUnit);
    }

    @Override // defpackage.zxd, defpackage.zwy, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws InterruptedException {
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

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: d */
    public final zyf scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return h().scheduleWithFixedDelay(runnable, j, j2, timeUnit);
    }

    @Override // defpackage.zxd
    protected /* bridge */ /* synthetic */ zyg e() {
        throw null;
    }

    protected abstract zyh h();
}
