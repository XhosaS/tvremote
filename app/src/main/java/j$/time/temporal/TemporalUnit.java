package j$.time.temporal;

import j$.time.Duration;

/* loaded from: classes3.dex */
public interface TemporalUnit {
    Duration getDuration();

    long i(Temporal temporal, Temporal temporal2);

    boolean isDurationEstimated();

    Temporal l(Temporal temporal, long j);
}
