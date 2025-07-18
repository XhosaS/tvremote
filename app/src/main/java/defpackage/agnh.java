package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agnh extends agfx {
    public static final agna b;
    static final ScheduledExecutorService c;
    final AtomicReference d;

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        c = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        b = new agna("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public agnh() {
        throw null;
    }

    @Override // defpackage.agfx
    public final agfw a() {
        return new agng((ScheduledExecutorService) this.d.get());
    }

    @Override // defpackage.agfx
    public final aggi c(Runnable runnable, long j, TimeUnit timeUnit) {
        agnc agncVar = new agnc(agoh.d(runnable));
        try {
            agncVar.a(j <= 0 ? ((ScheduledExecutorService) this.d.get()).submit(agncVar) : ((ScheduledExecutorService) this.d.get()).schedule(agncVar, j, timeUnit));
            return agncVar;
        } catch (RejectedExecutionException e) {
            agoh.e(e);
            return aghe.INSTANCE;
        }
    }

    @Override // defpackage.agfx
    public final aggi d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Runnable runnableD = agoh.d(runnable);
        if (j2 > 0) {
            agnb agnbVar = new agnb(runnableD);
            try {
                agnbVar.a(((ScheduledExecutorService) this.d.get()).scheduleAtFixedRate(agnbVar, j, j2, timeUnit));
                return agnbVar;
            } catch (RejectedExecutionException e) {
                agoh.e(e);
                return aghe.INSTANCE;
            }
        }
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.d.get();
        agms agmsVar = new agms(runnableD, scheduledExecutorService);
        try {
            agmsVar.a(j <= 0 ? scheduledExecutorService.submit(agmsVar) : scheduledExecutorService.schedule(agmsVar, j, timeUnit));
            return agmsVar;
        } catch (RejectedExecutionException e2) {
            agoh.e(e2);
            return aghe.INSTANCE;
        }
    }

    public agnh(ThreadFactory threadFactory) {
        AtomicReference atomicReference = new AtomicReference();
        this.d = atomicReference;
        atomicReference.lazySet(agnf.a(threadFactory));
    }
}
