package defpackage;

import j$.time.Instant;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afrz implements agaa {
    @Override // defpackage.agaa
    public final long a() {
        Instant instantNow = Instant.now();
        long nanos = TimeUnit.SECONDS.toNanos(instantNow.getEpochSecond());
        long nano = instantNow.getNano();
        long j = nanos + nano;
        return (((nano ^ nanos) > 0L ? 1 : ((nano ^ nanos) == 0L ? 0 : -1)) < 0) | ((nanos ^ j) >= 0) ? j : ((j >>> 63) ^ 1) + Long.MAX_VALUE;
    }
}
