package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.lang.Thread;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xtq implements Executor {
    private final Thread.UncaughtExceptionHandler a;
    private final Queue b = new ConcurrentLinkedQueue();
    private final AtomicReference c = new AtomicReference();

    public xtq(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = uncaughtExceptionHandler;
    }

    public final void a() {
        while (a.v(this.c, Thread.currentThread())) {
            while (true) {
                try {
                    Runnable runnable = (Runnable) this.b.poll();
                    if (runnable == null) {
                        break;
                    }
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        this.a.uncaughtException(Thread.currentThread(), th);
                    }
                } catch (Throwable th2) {
                    this.c.set(null);
                    throw th2;
                }
            }
            this.c.set(null);
            if (this.b.isEmpty()) {
                return;
            }
        }
    }

    public final void b(Runnable runnable) {
        runnable.getClass();
        this.b.add(runnable);
    }

    public final void c() {
        sij.x(Thread.currentThread() == this.c.get(), "Not called from the SynchronizationContext");
    }

    public final ulo d(Runnable runnable, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        xtp xtpVar = new xtp(runnable);
        return new ulo(xtpVar, (ScheduledFuture) scheduledExecutorService.schedule(new xto(this, xtpVar, runnable, 0), j, timeUnit));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable);
        a();
    }
}
