package j$.time.temporal;

import j$.time.Duration;

/* loaded from: classes3.dex */
public enum g implements TemporalUnit {
    WEEK_BASED_YEARS("WeekBasedYears", Duration.ofSeconds(31556952)),
    QUARTER_YEARS("QuarterYears", Duration.ofSeconds(7889238));

    public final String a;
    public final Duration b;

    g(String str, Duration duration) {
        this.a = str;
        this.b = duration;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final Duration getDuration() {
        return this.b;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final long i(Temporal temporal, Temporal temporal2) {
        if (temporal.getClass() != temporal2.getClass()) {
            return temporal.e(temporal2, this);
        }
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            f fVar = h.c;
            return j$.desugar.sun.nio.fs.g.L(temporal2.H(fVar), temporal.H(fVar));
        }
        if (iOrdinal == 1) {
            return temporal.e(temporal2, ChronoUnit.MONTHS) / 3;
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // j$.time.temporal.TemporalUnit
    public final boolean isDurationEstimated() {
        return true;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final Temporal l(Temporal temporal, long j) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return temporal.a(j$.desugar.sun.nio.fs.g.J(temporal.i(r0), j), h.c);
        }
        if (iOrdinal == 1) {
            return temporal.b(j / 4, ChronoUnit.YEARS).b((j % 4) * 3, ChronoUnit.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
