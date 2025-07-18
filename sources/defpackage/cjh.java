package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjh extends chh implements AutoCloseable, cjd {
    final ScheduledExecutorService a;

    public cjh(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.a = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final cjf schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.a;
        cjs cjsVarF = cjs.f(runnable, null);
        return new cjf(cjsVarF, scheduledExecutorService.schedule(cjsVarF, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final cjf schedule(Callable callable, long j, TimeUnit timeUnit) {
        cjs cjsVar = new cjs(callable);
        return new cjf(cjsVar, this.a.schedule(cjsVar, j, timeUnit));
    }

    @Override // defpackage.chh, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws InterruptedException {
        ii.W(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final cjf scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        cjg cjgVar = new cjg(runnable);
        return new cjf(cjgVar, this.a.scheduleWithFixedDelay(cjgVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        cjg cjgVar = new cjg(runnable);
        return new cjf(cjgVar, this.a.scheduleAtFixedRate(cjgVar, j, j2, timeUnit));
    }
}
