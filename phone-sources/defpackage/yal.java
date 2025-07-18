package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yal {
    public final ScheduledExecutorService a;
    public final Executor b;
    public final Runnable c;
    public long d;
    public boolean e;
    public ScheduledFuture f;
    private final ttl g;

    public yal(Runnable runnable, Executor executor, ScheduledExecutorService scheduledExecutorService, ttl ttlVar) {
        this.c = runnable;
        this.b = executor;
        this.a = scheduledExecutorService;
        this.g = ttlVar;
        ttlVar.e();
    }

    public final long a() {
        return this.g.a(TimeUnit.NANOSECONDS);
    }
}
