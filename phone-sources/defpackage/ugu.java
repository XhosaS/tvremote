package defpackage;

import com.google.common.collect.ForwardingObject;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ugu extends ForwardingObject implements ExecutorService, AutoCloseable {
    protected ugu() {
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return delegate().awaitTermination(j, timeUnit);
    }

    public /* synthetic */ void close() throws InterruptedException {
        a.h(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        delegate().execute(runnable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingObject
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public abstract ExecutorService delegate();

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        return delegate().invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        return delegate().invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return delegate().isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return delegate().isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        delegate().shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return delegate().shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return delegate().submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return delegate().invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return delegate().invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return delegate().submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return delegate().submit(callable);
    }
}
