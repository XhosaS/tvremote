package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class coq implements uhp {
    final WeakReference a;
    public final col b = new cop(this);

    public coq(com comVar) {
        this.a = new WeakReference(comVar);
    }

    public final boolean a(Throwable th) {
        return this.b.g(th);
    }

    @Override // defpackage.uhp
    public final void c(Runnable runnable, Executor executor) {
        this.b.c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        com comVar = (com) this.a.get();
        boolean zCancel = this.b.cancel(z);
        if (!zCancel || comVar == null) {
            return zCancel;
        }
        comVar.a = null;
        comVar.b = null;
        comVar.c.f(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.isCancelled();
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
