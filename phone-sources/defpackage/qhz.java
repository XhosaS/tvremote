package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qhz extends AbstractExecutorService implements AutoCloseable {
    final /* synthetic */ rbi a;
    private final Handler b;

    public qhz(rbi rbiVar, Handler handler) {
        this.a = rbiVar;
        this.b = handler;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() throws InterruptedException {
        if (this == ForkJoinPool.commonPool()) {
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

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, xbw] */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        rbi rbiVar = this.a;
        ?? r1 = rbiVar.a;
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = this.b;
        Looper looper = handler.getLooper();
        ttm ttmVar = ((qoj) r1.b()).w;
        String packageName = ((Context) rbiVar.b).getPackageName();
        snf snfVar = (snf) ttmVar.get();
        boolean z = looperMyLooper == looper;
        snfVar.b(packageName, Boolean.valueOf(z));
        if (z && xfo.a.get().e()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        runnable.getClass();
        return submit(runnable, null);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        runnable.getClass();
        return submit(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        callable.getClass();
        FutureTask futureTask = new FutureTask(callable);
        Handler handler = this.b;
        if (Looper.myLooper() == handler.getLooper()) {
            futureTask.run();
            return futureTask;
        }
        handler.post(futureTask);
        return futureTask;
    }
}
