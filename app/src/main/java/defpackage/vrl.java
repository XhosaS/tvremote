package defpackage;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vrl implements ExecutorService, AutoCloseable {
    private static final zdy c = zdy.h("com/google/apps/tiktok/concurrent/SuspendableUiThreadExecutor");
    private final Executor d;
    private boolean f;
    private zyd g;
    public final Deque a = new ArrayDeque();
    public int b = 1;
    private final vrk h = new vrk(this);
    private final boolean e = true;

    public vrl(Executor executor) {
        this.d = executor;
    }

    static /* synthetic */ void d(zyd zydVar) {
        try {
            zxn.o(zydVar);
        } catch (CancellationException unused) {
        } catch (ExecutionException e) {
            ((zdv) ((zdv) ((zdv) c.c()).p(e.getCause())).q("com/google/apps/tiktok/concurrent/SuspendableUiThreadExecutor", "logOnFailure", (char) 427, "SuspendableUiThreadExecutor.java")).u("Silently ignored exception in SuspendableUiThreadExecutor.");
        }
    }

    public final Queue a() {
        ArrayDeque arrayDeque;
        Deque deque = this.a;
        synchronized (deque) {
            yqw.M(this.f, "Executor may only be drained when it is suspended.");
            arrayDeque = new ArrayDeque(deque);
            deque.clear();
        }
        return arrayDeque;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final void b() {
        uea.c();
        synchronized (this.a) {
            this.f = false;
        }
        execute(zyq.a);
    }

    public final void c() {
        uea.c();
        synchronized (this.a) {
            this.f = true;
            this.b = 1;
            zyd zydVar = this.g;
            if (zydVar != null) {
                zydVar.cancel(false);
                this.g = null;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        if (this != ForkJoinPool.commonPool()) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        boolean z;
        int i;
        runnable.getClass();
        Deque deque = this.a;
        synchronized (deque) {
            if (this.f || (i = this.b) == 3 || i == 2) {
                deque.add(runnable);
            } else {
                deque.add(runnable);
                final zyd zydVarJ = zxn.j(wyo.h(this.h), this.d);
                this.g = zydVarJ;
                zydVarJ.d(wyo.h(new Runnable() { // from class: vrj
                    @Override // java.lang.Runnable
                    public final void run() {
                        vrl.d(zydVarJ);
                    }
                }), zwk.a);
                this.b = 2;
            }
        }
        synchronized (this.a) {
            z = false;
            if (uea.d(Thread.currentThread()) && this.e && !this.f && this.b != 3) {
                zyd zydVar = this.g;
                zydVar.getClass();
                zydVar.cancel(false);
                this.g = null;
                this.b = 2;
                z = true;
            }
        }
        if (z) {
            this.h.run();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        throw new UnsupportedOperationException();
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

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return zxn.j(runnable, this);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(final Runnable runnable, final Object obj) {
        return zxn.k(new Callable() { // from class: vri
            @Override // java.util.concurrent.Callable
            public final Object call() {
                runnable.run();
                return obj;
            }
        }, this);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return zxn.k(callable, this);
    }
}
