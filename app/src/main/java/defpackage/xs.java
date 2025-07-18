package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xs implements zyd {
    final WeakReference a;
    public final xn b = new xr(this);

    public xs(xo xoVar) {
        this.a = new WeakReference(xoVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        xo xoVar = (xo) this.a.get();
        boolean zCancel = this.b.cancel(z);
        if (!zCancel || xoVar == null) {
            return zCancel;
        }
        xoVar.a = null;
        xoVar.b = null;
        xoVar.c.g(null);
        return true;
    }

    @Override // defpackage.zyd
    public final void d(Runnable runnable, Executor executor) {
        this.b.d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.value instanceof xe;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }
}
