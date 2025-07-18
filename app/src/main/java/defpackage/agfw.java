package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class agfw implements aggi {
    public final long a(TimeUnit timeUnit) {
        return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    public abstract aggi b(Runnable runnable, long j, TimeUnit timeUnit);

    public final aggi c(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        aghg aghgVar = new aghg();
        aghg aghgVar2 = new aghg(aghgVar);
        Runnable runnableD = agoh.d(runnable);
        long nanos = timeUnit.toNanos(j2);
        long jA = a(TimeUnit.NANOSECONDS);
        aggi aggiVarB = b(new agfv(this, jA + timeUnit.toNanos(j), runnableD, jA, aghgVar2, nanos), j, timeUnit);
        if (aggiVarB == aghe.INSTANCE) {
            return aggiVarB;
        }
        aghd.g(aghgVar, aggiVarB);
        return aghgVar2;
    }
}
