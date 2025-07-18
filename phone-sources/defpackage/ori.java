package defpackage;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ori extends AbstractExecutorService implements AutoCloseable {
    private final Executor a;

    public ori(Executor executor) {
        this.a = executor;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() throws InterruptedException {
        a.h(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
