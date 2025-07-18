package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zym extends zyj implements AutoCloseable, zyh {
    final ScheduledExecutorService a;

    public zym(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.a = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zyf schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.a;
        zzc zzcVarE = zzc.e(runnable, null);
        return new zyk(zzcVarE, scheduledExecutorService.schedule(zzcVarE, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: b */
    public final zyf schedule(Callable callable, long j, TimeUnit timeUnit) {
        zzc zzcVar = new zzc(callable);
        return new zyk(zzcVar, this.a.schedule(zzcVar, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final zyf scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zyl zylVar = new zyl(runnable);
        return new zyk(zylVar, this.a.scheduleAtFixedRate(zylVar, j, j2, timeUnit));
    }

    @Override // defpackage.zuw, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws InterruptedException {
        if (this == ForkJoinPool.commonPool() || isTerminated()) {
            return;
        }
        shutdown();
        boolean zAwaitTermination = false;
        boolean z = false;
        while (!zAwaitTermination) {
            try {
                zAwaitTermination = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                }
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final zyf scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zyl zylVar = new zyl(runnable);
        return new zyk(zylVar, this.a.scheduleWithFixedDelay(zylVar, j, j2, timeUnit));
    }
}
