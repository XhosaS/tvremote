package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agmt implements Runnable {
    public final long a;
    public final ConcurrentLinkedQueue b;
    final aggh c;
    public final ThreadFactory d;
    private final ScheduledExecutorService e;
    private final Future f;

    public agmt(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
        agmt agmtVar;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
        ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
        long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
        this.a = nanos;
        this.b = new ConcurrentLinkedQueue();
        this.c = new aggh();
        this.d = threadFactory;
        if (timeUnit != null) {
            scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, agmw.c);
            agmtVar = this;
            scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(agmtVar, nanos, nanos, TimeUnit.NANOSECONDS);
        } else {
            agmtVar = this;
            scheduledExecutorServiceNewScheduledThreadPool = null;
            scheduledFutureScheduleWithFixedDelay = null;
        }
        agmtVar.e = scheduledExecutorServiceNewScheduledThreadPool;
        agmtVar.f = scheduledFutureScheduleWithFixedDelay;
    }

    final void a() {
        this.c.dispose();
        Future future = this.f;
        if (future != null) {
            future.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = this.e;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.b;
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        long jNanoTime = System.nanoTime();
        Iterator it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            agmv agmvVar = (agmv) it.next();
            if (agmvVar.a > jNanoTime) {
                return;
            }
            if (concurrentLinkedQueue.remove(agmvVar)) {
                this.c.c(agmvVar);
            }
        }
    }
}
