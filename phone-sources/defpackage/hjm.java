package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hjm implements uhp {
    final WeakReference a;
    public final hji b = new hjl(this);

    public hjm(hjj hjjVar) {
        this.a = new WeakReference(hjjVar);
    }

    public final void a(Throwable th) {
        hjc hjcVar = new hjc(th);
        hiz hizVar = hji.b;
        hji hjiVar = this.b;
        if (hizVar.d(hjiVar, null, hjcVar)) {
            hji.b(hjiVar);
        }
    }

    @Override // defpackage.uhp
    public final void c(Runnable runnable, Executor executor) {
        this.b.c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        hjj hjjVar = (hjj) this.a.get();
        boolean zCancel = this.b.cancel(z);
        if (!zCancel || hjjVar == null) {
            return zCancel;
        }
        hjjVar.a = null;
        hjjVar.b = null;
        hjjVar.c.d(null);
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
