package defpackage;

import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lbh extends lcn {
    public static final AtomicLong a = new AtomicLong(Long.MIN_VALUE);
    public lbg b;
    public lbg c;
    public final Object d;
    public final Semaphore e;
    public volatile boolean f;
    private final PriorityBlockingQueue g;
    private final BlockingQueue h;
    private final Thread.UncaughtExceptionHandler i;
    private final Thread.UncaughtExceptionHandler j;

    public lbh(lbk lbkVar) {
        super(lbkVar);
        this.d = new Object();
        this.e = new Semaphore(2);
        this.g = new PriorityBlockingQueue();
        this.h = new LinkedBlockingQueue();
        this.i = new lbe(this, "Thread death: Uncaught exception on worker thread");
        this.j = new lbe(this, "Thread death: Uncaught exception on network thread");
    }

    private final void l(lbf lbfVar) {
        synchronized (this.d) {
            PriorityBlockingQueue priorityBlockingQueue = this.g;
            priorityBlockingQueue.add(lbfVar);
            lbg lbgVar = this.b;
            if (lbgVar == null) {
                lbg lbgVar2 = new lbg(this, "Measurement Worker", priorityBlockingQueue);
                this.b = lbgVar2;
                lbgVar2.setUncaughtExceptionHandler(this.i);
                this.b.start();
            } else {
                lbgVar.a();
            }
        }
    }

    @Override // defpackage.lcn
    protected final boolean a() {
        return false;
    }

    public final Object b(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            lbk lbkVar = this.y;
            lbh lbhVar = lbkVar.g;
            lbkVar.o(lbhVar);
            lbhVar.h(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                lbk lbkVar2 = this.y;
                lab labVar = lbkVar2.f;
                lbkVar2.o(labVar);
                labVar.f.a(a.j(str, "Interrupted waiting for "));
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            lbk lbkVar3 = this.y;
            lab labVar2 = lbkVar3.f;
            lbkVar3.o(labVar2);
            labVar2.f.a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final Future c(Callable callable) {
        o();
        lbf lbfVar = new lbf(this, callable, false);
        if (Thread.currentThread() != this.b) {
            l(lbfVar);
            return lbfVar;
        }
        if (!this.g.isEmpty()) {
            lbk lbkVar = this.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.f.a("Callable skipped the worker queue.");
        }
        lbfVar.run();
        return lbfVar;
    }

    public final Future d(Callable callable) {
        o();
        lbf lbfVar = new lbf(this, callable, true);
        if (Thread.currentThread() == this.b) {
            lbfVar.run();
            return lbfVar;
        }
        l(lbfVar);
        return lbfVar;
    }

    public final void e() {
        if (Thread.currentThread() == this.b) {
            throw new IllegalStateException("Call not expected from worker thread");
        }
    }

    public final void f(Runnable runnable) {
        o();
        lbf lbfVar = new lbf(this, runnable, false, "Task exception on network thread");
        synchronized (this.d) {
            BlockingQueue blockingQueue = this.h;
            blockingQueue.add(lbfVar);
            lbg lbgVar = this.c;
            if (lbgVar == null) {
                lbg lbgVar2 = new lbg(this, "Measurement Network", blockingQueue);
                this.c = lbgVar2;
                lbgVar2.setUncaughtExceptionHandler(this.j);
                this.c.start();
            } else {
                lbgVar.a();
            }
        }
    }

    @Override // defpackage.lcm
    public final void g() {
        if (Thread.currentThread() != this.b) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final void h(Runnable runnable) {
        o();
        kkk.k(runnable);
        l(new lbf(this, runnable, false, "Task exception on worker thread"));
    }

    public final void j(Runnable runnable) {
        o();
        l(new lbf(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean k() {
        return Thread.currentThread() == this.b;
    }
}
