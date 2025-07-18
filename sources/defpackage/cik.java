package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cik extends bzj implements Future, cja {
    protected cik() {
    }

    @Override // defpackage.bzj
    protected /* bridge */ /* synthetic */ Object a() {
        throw null;
    }

    protected abstract cja b();

    protected /* bridge */ /* synthetic */ Future c() {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return c().cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return c().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return c().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return c().isDone();
    }

    @Override // defpackage.cja
    public final void m(Runnable runnable, Executor executor) {
        b().m(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return c().get(j, timeUnit);
    }
}
