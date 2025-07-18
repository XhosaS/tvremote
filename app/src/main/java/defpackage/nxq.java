package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nxq implements nxr {
    private final ScheduledExecutorService a;

    public nxq(ScheduledExecutorService scheduledExecutorService) {
        this.a = scheduledExecutorService;
    }

    @Override // defpackage.nxr
    public final void a(long j, Runnable runnable) {
        this.a.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}
