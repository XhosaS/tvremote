package j$.time.temporal;

/* loaded from: classes2.dex */
public enum a implements p {
    NANO_OF_SECOND("NanoOfSecond", t.f(0, 999999999)),
    NANO_OF_DAY("NanoOfDay", t.f(0, 86399999999999L)),
    MICRO_OF_SECOND("MicroOfSecond", t.f(0, 999999)),
    MICRO_OF_DAY("MicroOfDay", t.f(0, 86399999999L)),
    MILLI_OF_SECOND("MilliOfSecond", t.f(0, 999)),
    MILLI_OF_DAY("MilliOfDay", t.f(0, 86399999)),
    SECOND_OF_MINUTE("SecondOfMinute", t.f(0, 59), 0),
    SECOND_OF_DAY("SecondOfDay", t.f(0, 86399)),
    MINUTE_OF_HOUR("MinuteOfHour", t.f(0, 59), 0),
    MINUTE_OF_DAY("MinuteOfDay", t.f(0, 1439)),
    HOUR_OF_AMPM("HourOfAmPm", t.f(0, 11)),
    CLOCK_HOUR_OF_AMPM("ClockHourOfAmPm", t.f(1, 12)),
    HOUR_OF_DAY("HourOfDay", t.f(0, 23), 0),
    CLOCK_HOUR_OF_DAY("ClockHourOfDay", t.f(1, 24)),
    AMPM_OF_DAY("AmPmOfDay", t.f(0, 1), 0),
    DAY_OF_WEEK("DayOfWeek", t.f(1, 7), 0),
    ALIGNED_DAY_OF_WEEK_IN_MONTH("AlignedDayOfWeekInMonth", t.f(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_YEAR("AlignedDayOfWeekInYear", t.f(1, 7)),
    DAY_OF_MONTH("DayOfMonth", t.g(28, 31), 0),
    DAY_OF_YEAR("DayOfYear", t.g(365, 366)),
    EPOCH_DAY("EpochDay", t.f(-365243219162L, 365241780471L)),
    ALIGNED_WEEK_OF_MONTH("AlignedWeekOfMonth", t.g(4, 5)),
    ALIGNED_WEEK_OF_YEAR("AlignedWeekOfYear", t.f(1, 53)),
    MONTH_OF_YEAR("MonthOfYear", t.f(1, 12), 0),
    PROLEPTIC_MONTH("ProlepticMonth", t.f(-11999999988L, 11999999999L)),
    YEAR_OF_ERA("YearOfEra", t.g(999999999, 1000000000)),
    YEAR("Year", t.f(-999999999, 999999999), 0),
    ERA("Era", t.f(0, 1), 0),
    INSTANT_SECONDS("InstantSeconds", t.f(Long.MIN_VALUE, Long.MAX_VALUE)),
    OFFSET_SECONDS("OffsetSeconds", t.f(-64800, 64800));

    public final String a;
    public final t b;

    static {
        b bVar = b.NANOS;
    }

    a(String str, t tVar) {
        this.a = str;
        this.b = tVar;
    }

    @Override // j$.time.temporal.p
    public final boolean i(m mVar) {
        return mVar.e(this);
    }

    @Override // j$.time.temporal.p
    public final boolean isDateBased() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    @Override // j$.time.temporal.p
    public final t j(m mVar) {
        return mVar.k(this);
    }

    @Override // j$.time.temporal.p
    public final t k() {
        return this.b;
    }

    @Override // j$.time.temporal.p
    public final long l(m mVar) {
        return mVar.x(this);
    }

    @Override // j$.time.temporal.p
    public final l o(l lVar, long j) {
        return lVar.c(j, this);
    }

    public final void t(long j) {
        this.b.b(j, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }

    public final boolean x() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    a(String str, t tVar, int i) {
        this.a = str;
        this.b = tVar;
    }
}
