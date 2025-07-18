package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afwv {
    public final ScheduledExecutorService a;
    public final Executor b;
    public final Runnable c;
    public long d;
    public boolean e;
    public ScheduledFuture f;
    private final yrn g;

    public afwv(Runnable runnable, Executor executor, ScheduledExecutorService scheduledExecutorService, yrn yrnVar) {
        this.c = runnable;
        this.b = executor;
        this.a = scheduledExecutorService;
        this.g = yrnVar;
        yrnVar.e();
    }

    public final long a() {
        return this.g.a(TimeUnit.NANOSECONDS);
    }

    final void b(boolean z) {
        ScheduledFuture scheduledFuture;
        this.e = false;
        if (!z || (scheduledFuture = this.f) == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f = null;
    }
}
