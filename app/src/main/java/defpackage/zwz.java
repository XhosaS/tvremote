package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zwz extends zwx {
    private final zyd a;

    public zwz(zyd zydVar) {
        zydVar.getClass();
        this.a = zydVar;
    }

    @Override // defpackage.zum, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    @Override // defpackage.zum, defpackage.zyd
    public final void d(Runnable runnable, Executor executor) {
        this.a.d(runnable, executor);
    }

    @Override // defpackage.zum, java.util.concurrent.Future
    public final Object get() {
        return this.a.get();
    }

    @Override // defpackage.zum, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    @Override // defpackage.zum, java.util.concurrent.Future
    public final boolean isDone() {
        return this.a.isDone();
    }

    @Override // defpackage.zum
    public final String toString() {
        return this.a.toString();
    }

    @Override // defpackage.zum, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.a.get(j, timeUnit);
    }
}
