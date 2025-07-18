package j$.time.temporal;

import j$.time.Duration;

/* loaded from: classes2.dex */
public enum h implements r {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");

    public final String a;

    static {
        Duration duration = Duration.c;
    }

    h(String str) {
        this.a = str;
    }

    @Override // j$.time.temporal.r
    public final l i(l lVar, long j) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return lVar.c(j$.nio.file.attribute.a.F(lVar.i(r0), j), i.c);
        }
        if (iOrdinal == 1) {
            return lVar.d(j / 4, b.YEARS).d((j % 4) * 3, b.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
