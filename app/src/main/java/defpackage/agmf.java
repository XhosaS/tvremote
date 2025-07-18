package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
class agmf extends AtomicReference implements aggi {
    protected static final FutureTask a = new FutureTask(aghm.a, null);
    protected static final FutureTask b = new FutureTask(aghm.a, null);
    private static final long serialVersionUID = 1811839108042568751L;
    protected final Runnable c;
    protected Thread d;

    public agmf(Runnable runnable) {
        this.c = runnable;
    }

    public final void a(Future future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 == a) {
                return;
            }
            if (future2 == b) {
                future.cancel(this.d != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // defpackage.aggi
    public final void dispose() {
        FutureTask futureTask;
        Future future = (Future) get();
        if (future == a || future == (futureTask = b) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.d != Thread.currentThread());
    }

    @Override // defpackage.aggi
    public final boolean f() {
        throw null;
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return String.valueOf(this.c);
    }
}
