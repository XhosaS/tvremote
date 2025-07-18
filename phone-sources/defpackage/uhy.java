package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uhy extends uhv implements AutoCloseable, uht {
    final ScheduledExecutorService a;

    public uhy(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.a = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: a */
    public final uhr schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.a;
        uik uikVarG = uik.g(runnable, null);
        return new uhw(uikVarG, scheduledExecutorService.schedule(uikVarG, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: b */
    public final uhr schedule(Callable callable, long j, TimeUnit timeUnit) {
        uik uikVar = new uik(callable);
        return new uhw(uikVar, this.a.schedule(uikVar, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: c */
    public final uhr scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        uhx uhxVar = new uhx(runnable);
        return new uhw(uhxVar, this.a.scheduleAtFixedRate(uhxVar, j, j2, timeUnit));
    }

    @Override // defpackage.ufk, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws InterruptedException {
        a.h(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: d */
    public final uhr scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        uhx uhxVar = new uhx(runnable);
        return new uhw(uhxVar, this.a.scheduleWithFixedDelay(uhxVar, j, j2, timeUnit));
    }
}
