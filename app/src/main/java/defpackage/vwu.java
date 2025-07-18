package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vwu implements ScheduledExecutorService, AutoCloseable {
    private final ScheduledExecutorService a;

    public vwu(ScheduledExecutorService scheduledExecutorService) {
        this.a = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.a.awaitTermination(j, timeUnit);
    }

    @Override // java.lang.AutoCloseable
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

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        if (wyo.a.m()) {
            this.a.execute(wyo.g(runnable));
        } else {
            this.a.execute(runnable);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        collection.getClass();
        List listInvokeAll = this.a.invokeAll(collection);
        listInvokeAll.getClass();
        return listInvokeAll;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        collection.getClass();
        return this.a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.a.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        runnable.getClass();
        timeUnit.getClass();
        if (wyo.a.m()) {
            runnable = wyo.g(runnable);
        }
        ScheduledFuture<?> scheduledFutureSchedule = this.a.schedule(runnable, j, timeUnit);
        scheduledFutureSchedule.getClass();
        return scheduledFutureSchedule;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        runnable.getClass();
        timeUnit.getClass();
        if (wyo.a.m()) {
            runnable = wyo.g(runnable);
        }
        ScheduledFuture<?> scheduledFutureScheduleAtFixedRate = this.a.scheduleAtFixedRate(runnable, j, j2, timeUnit);
        scheduledFutureScheduleAtFixedRate.getClass();
        return scheduledFutureScheduleAtFixedRate;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        runnable.getClass();
        timeUnit.getClass();
        if (wyo.a.m()) {
            runnable = wyo.g(runnable);
        }
        ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay = this.a.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
        scheduledFutureScheduleWithFixedDelay.getClass();
        return scheduledFutureScheduleWithFixedDelay;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        List<Runnable> listShutdownNow = this.a.shutdownNow();
        listShutdownNow.getClass();
        return listShutdownNow;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        runnable.getClass();
        if (wyo.a.m()) {
            Future<?> futureSubmit = this.a.submit(wyo.g(runnable));
            futureSubmit.getClass();
            return futureSubmit;
        }
        Future<?> futureSubmit2 = this.a.submit(runnable);
        futureSubmit2.getClass();
        return futureSubmit2;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        collection.getClass();
        timeUnit.getClass();
        return this.a.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        collection.getClass();
        timeUnit.getClass();
        List listInvokeAll = this.a.invokeAll(collection, j, timeUnit);
        listInvokeAll.getClass();
        return listInvokeAll;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        callable.getClass();
        timeUnit.getClass();
        if (wyo.a.m()) {
            callable = wyo.j(callable);
        }
        ScheduledFuture scheduledFutureSchedule = this.a.schedule(callable, j, timeUnit);
        scheduledFutureSchedule.getClass();
        return scheduledFutureSchedule;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        runnable.getClass();
        if (wyo.a.m()) {
            Future futureSubmit = this.a.submit(wyo.g(runnable), obj);
            futureSubmit.getClass();
            return futureSubmit;
        }
        Future futureSubmit2 = this.a.submit(runnable, obj);
        futureSubmit2.getClass();
        return futureSubmit2;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        callable.getClass();
        if (wyo.a.m()) {
            Future futureSubmit = this.a.submit(wyo.j(callable));
            futureSubmit.getClass();
            return futureSubmit;
        }
        Future futureSubmit2 = this.a.submit(callable);
        futureSubmit2.getClass();
        return futureSubmit2;
    }
}
