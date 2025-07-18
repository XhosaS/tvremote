package defpackage;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ufk extends AbstractExecutorService implements AutoCloseable, uhs {
    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() throws InterruptedException {
        a.h(this);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: eq, reason: merged with bridge method [inline-methods] */
    public final uhp submit(Runnable runnable) {
        return (uhp) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: er, reason: merged with bridge method [inline-methods] */
    public final uhp submit(Callable callable) {
        return (uhp) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final uhp submit(Runnable runnable, Object obj) {
        return (uhp) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return uik.g(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Callable callable) {
        return new uik(callable);
    }
}
