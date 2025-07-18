package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class agfx {
    static final long a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    public abstract agfw a();

    public aggi b(Runnable runnable) {
        return c(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public aggi c(Runnable runnable, long j, TimeUnit timeUnit) {
        agfw agfwVarA = a();
        agft agftVar = new agft(agoh.d(runnable), agfwVarA);
        agfwVarA.b(agftVar, j, timeUnit);
        return agftVar;
    }

    public aggi d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        agfw agfwVarA = a();
        agfu agfuVar = new agfu(agoh.d(runnable), agfwVarA);
        aggi aggiVarC = agfwVarA.c(agfuVar, j, j2, timeUnit);
        return aggiVarC == aghe.INSTANCE ? aggiVarC : agfuVar;
    }
}
