package defpackage;

import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vwp extends agsq implements CoroutineExceptionHandler, ScheduledExecutorService, AutoCloseable {
    public static final /* synthetic */ int b = 0;
    public final ThreadLocal a;
    private final ScheduledExecutorService d;

    public vwp(ScheduledExecutorService scheduledExecutorService) {
        super(CoroutineExceptionHandler.c);
        this.d = scheduledExecutorService;
        this.a = new ThreadLocal();
    }

    private final Runnable b(final Runnable runnable) {
        Runnable runnable2 = new Runnable() { // from class: vwl
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                runnable.run();
                ThreadLocal threadLocal = this.a;
                Throwable th = (Throwable) threadLocal.get();
                threadLocal.remove();
                if (th != null) {
                    throw th;
                }
            }
        };
        return wyo.a.m() ? wyo.g(runnable2) : runnable2;
    }

    public final Callable a(final Callable callable) {
        Callable callable2 = new Callable() { // from class: vwh
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                Object objCall = callable.call();
                ThreadLocal threadLocal = this.a;
                Throwable th = (Throwable) threadLocal.get();
                threadLocal.remove();
                if (th == null) {
                    return objCall;
                }
                throw th;
            }
        };
        return wyo.a.m() ? wyo.j(callable2) : callable2;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.d.awaitTermination(j, timeUnit);
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
        this.d.execute(b(runnable));
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(agte agteVar, Throwable th) {
        agteVar.getClass();
        th.getClass();
        try {
            ((zdv) ((zdv) ((zdy) vwr.b.a()).c()).p(th).q("com/google/apps/tiktok/coroutines/TikTokExceptionHandler", "handleException", 61, "TikTokExceptionHandler.kt")).u("Uncaught exception from runnable");
        } catch (Throwable th2) {
            Logger logger = vwr.a;
            logger.log(Level.SEVERE, "GoogleLogger failed to log", th2);
            Log.e("TikTokExceptionHandler2", "GoogleLogger failed to log", th2);
            logger.log(Level.SEVERE, "Uncaught exception from runnable", th);
            Log.e("TikTokExceptionHandler2", "Uncaught exception from runnable", th);
        }
        this.a.set(th);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        collection.getClass();
        final vwm vwmVar = new vwm(this);
        List listInvokeAll = this.d.invokeAll(new ywn(collection, new yqi() { // from class: vwk
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                int i = vwp.b;
                return vwmVar.a(obj);
            }
        }));
        listInvokeAll.getClass();
        return listInvokeAll;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        collection.getClass();
        final vwo vwoVar = new vwo(this);
        return this.d.invokeAny(new ywn(collection, new yqi() { // from class: vwi
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                int i = vwp.b;
                return vwoVar.a(obj);
            }
        }));
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.d.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.d.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        runnable.getClass();
        timeUnit.getClass();
        ScheduledFuture<?> scheduledFutureSchedule = this.d.schedule(b(runnable), j, timeUnit);
        scheduledFutureSchedule.getClass();
        return scheduledFutureSchedule;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        runnable.getClass();
        timeUnit.getClass();
        ScheduledFuture<?> scheduledFutureScheduleAtFixedRate = this.d.scheduleAtFixedRate(b(runnable), j, j2, timeUnit);
        scheduledFutureScheduleAtFixedRate.getClass();
        return scheduledFutureScheduleAtFixedRate;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        runnable.getClass();
        timeUnit.getClass();
        ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay = this.d.scheduleWithFixedDelay(b(runnable), j, j2, timeUnit);
        scheduledFutureScheduleWithFixedDelay.getClass();
        return scheduledFutureScheduleWithFixedDelay;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.d.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        List<Runnable> listShutdownNow = this.d.shutdownNow();
        listShutdownNow.getClass();
        return listShutdownNow;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        runnable.getClass();
        Future<?> futureSubmit = this.d.submit(b(runnable));
        futureSubmit.getClass();
        return futureSubmit;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        collection.getClass();
        timeUnit.getClass();
        return this.d.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        callable.getClass();
        timeUnit.getClass();
        ScheduledFuture scheduledFutureSchedule = this.d.schedule(a(callable), j, timeUnit);
        scheduledFutureSchedule.getClass();
        return scheduledFutureSchedule;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        runnable.getClass();
        Future futureSubmit = this.d.submit(b(runnable), obj);
        futureSubmit.getClass();
        return futureSubmit;
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        collection.getClass();
        timeUnit.getClass();
        final vwn vwnVar = new vwn(this);
        List listInvokeAll = this.d.invokeAll(new ywn(collection, new yqi() { // from class: vwj
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                int i = vwp.b;
                return vwnVar.a(obj);
            }
        }), j, timeUnit);
        listInvokeAll.getClass();
        return listInvokeAll;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        callable.getClass();
        Future futureSubmit = this.d.submit(a(callable));
        futureSubmit.getClass();
        return futureSubmit;
    }
}
