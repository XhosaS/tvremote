package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agms implements Callable, aggi {
    static final FutureTask a = new FutureTask(aghm.a, null);
    final Runnable b;
    final ExecutorService e;
    Thread f;
    final AtomicReference d = new AtomicReference();
    final AtomicReference c = new AtomicReference();

    public agms(Runnable runnable, ExecutorService executorService) {
        this.b = runnable;
        this.e = executorService;
    }

    final void a(Future future) {
        AtomicReference atomicReference;
        Future future2;
        do {
            atomicReference = this.d;
            future2 = (Future) atomicReference.get();
            if (future2 == a) {
                future.cancel(this.f != Thread.currentThread());
                return;
            }
        } while (!agmr.a(atomicReference, future2, future));
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        this.f = Thread.currentThread();
        try {
            this.b.run();
            Future futureSubmit = this.e.submit(this);
            while (true) {
                AtomicReference atomicReference = this.c;
                Future future = (Future) atomicReference.get();
                if (future == a) {
                    futureSubmit.cancel(this.f != Thread.currentThread());
                } else if (agmr.a(atomicReference, future, futureSubmit)) {
                    break;
                }
            }
            this.f = null;
        } catch (Throwable th) {
            this.f = null;
            agoh.e(th);
        }
        return null;
    }

    @Override // defpackage.aggi
    public final void dispose() {
        AtomicReference atomicReference = this.d;
        FutureTask futureTask = a;
        Future future = (Future) atomicReference.getAndSet(futureTask);
        if (future != null && future != futureTask) {
            future.cancel(this.f != Thread.currentThread());
        }
        Future future2 = (Future) this.c.getAndSet(futureTask);
        if (future2 == null || future2 == futureTask) {
            return;
        }
        future2.cancel(this.f != Thread.currentThread());
    }

    @Override // defpackage.aggi
    public final boolean f() {
        throw null;
    }
}
