package j$.time.temporal;

import j$.time.LocalDate;
import j$.time.chrono.t;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public abstract class f implements n {
    public static final f DAY_OF_QUARTER;
    public static final f QUARTER_OF_YEAR;
    public static final f WEEK_BASED_YEAR;
    public static final f WEEK_OF_WEEK_BASED_YEAR;
    public static final int[] a;
    public static final /* synthetic */ f[] b;

    static {
        f fVar = new f() { // from class: j$.time.temporal.b
            @Override // j$.time.temporal.n
            public final boolean i(k kVar) {
                if (!kVar.d(a.DAY_OF_YEAR) || !kVar.d(a.MONTH_OF_YEAR) || !kVar.d(a.YEAR)) {
                    return false;
                }
                f fVar2 = h.a;
                return j$.desugar.sun.nio.fs.g.w(kVar).equals(t.c);
            }

            @Override // j$.time.temporal.n
            public final q l(k kVar) {
                if (!i(kVar)) {
                    throw new p("Unsupported field: DayOfQuarter");
                }
                long jC = kVar.C(f.QUARTER_OF_YEAR);
                if (jC != 1) {
                    return jC == 2 ? q.f(1L, 91L) : (jC == 3 || jC == 4) ? q.f(1L, 92L) : range();
                }
                long jC2 = kVar.C(a.YEAR);
                t.c.getClass();
                return t.l(jC2) ? q.f(1L, 91L) : q.f(1L, 90L);
            }

            @Override // j$.time.temporal.n
            public final long m(k kVar) {
                if (!i(kVar)) {
                    throw new p("Unsupported field: DayOfQuarter");
                }
                int i = kVar.i(a.DAY_OF_YEAR);
                int i2 = kVar.i(a.MONTH_OF_YEAR);
                long jC = kVar.C(a.YEAR);
                int i3 = (i2 - 1) / 3;
                t.c.getClass();
                return i - f.a[i3 + (t.l(jC) ? 4 : 0)];
            }

            @Override // j$.time.temporal.n
            public final q range() {
                return q.g(90L, 92L);
            }

            @Override // j$.time.temporal.n
            public final Temporal t(Temporal temporal, long j) {
                long jM = m(temporal);
                range().b(j, this);
                a aVar = a.DAY_OF_YEAR;
                return temporal.a((j - jM) + temporal.C(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = fVar;
        f fVar2 = new f() { // from class: j$.time.temporal.c
            @Override // j$.time.temporal.n
            public final boolean i(k kVar) {
                if (!kVar.d(a.MONTH_OF_YEAR)) {
                    return false;
                }
                f fVar3 = h.a;
                return j$.desugar.sun.nio.fs.g.w(kVar).equals(t.c);
            }

            @Override // j$.time.temporal.n
            public final q l(k kVar) {
                if (i(kVar)) {
                    return range();
                }
                throw new p("Unsupported field: QuarterOfYear");
            }

            @Override // j$.time.temporal.n
            public final long m(k kVar) {
                if (i(kVar)) {
                    return (kVar.C(a.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new p("Unsupported field: QuarterOfYear");
            }

            @Override // j$.time.temporal.n
            public final q range() {
                return q.f(1L, 4L);
            }

            @Override // j$.time.temporal.n
            public final Temporal t(Temporal temporal, long j) {
                long jM = m(temporal);
                range().b(j, this);
                a aVar = a.MONTH_OF_YEAR;
                return temporal.a(((j - jM) * 3) + temporal.C(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = fVar2;
        f fVar3 = new f() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.n
            public final boolean i(k kVar) {
                if (!kVar.d(a.EPOCH_DAY)) {
                    return false;
                }
                f fVar4 = h.a;
                return j$.desugar.sun.nio.fs.g.w(kVar).equals(t.c);
            }

            @Override // j$.time.temporal.n
            public final q l(k kVar) {
                if (i(kVar)) {
                    return q.f(1L, f.J(f.C(LocalDate.M(kVar))));
                }
                throw new p("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.n
            public final long m(k kVar) {
                if (i(kVar)) {
                    return f.A(LocalDate.M(kVar));
                }
                throw new p("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.n
            public final q range() {
                return q.g(52L, 53L);
            }

            @Override // j$.time.temporal.n
            public final Temporal t(Temporal temporal, long j) {
                range().b(j, this);
                return temporal.b(j$.desugar.sun.nio.fs.g.J(j, m(temporal)), ChronoUnit.WEEKS);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = fVar3;
        f fVar4 = new f() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.n
            public final boolean i(k kVar) {
                if (!kVar.d(a.EPOCH_DAY)) {
                    return false;
                }
                f fVar5 = h.a;
                return j$.desugar.sun.nio.fs.g.w(kVar).equals(t.c);
            }

            @Override // j$.time.temporal.n
            public final q l(k kVar) {
                if (i(kVar)) {
                    return range();
                }
                throw new p("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.n
            public final long m(k kVar) {
                if (i(kVar)) {
                    return f.C(LocalDate.M(kVar));
                }
                throw new p("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.n
            public final q range() {
                return a.YEAR.d;
            }

            @Override // j$.time.temporal.n
            public final Temporal t(Temporal temporal, long j) {
                if (!i(temporal)) {
                    throw new p("Unsupported field: WeekBasedYear");
                }
                int iA = a.YEAR.d.a(j, f.WEEK_BASED_YEAR);
                LocalDate localDateM = LocalDate.M(temporal);
                int i = localDateM.i(a.DAY_OF_WEEK);
                int iA2 = f.A(localDateM);
                if (iA2 == 53 && f.J(iA) == 52) {
                    iA2 = 52;
                }
                return temporal.l(LocalDate.of(iA, 1, 4).X(((iA2 - 1) * 7) + (i - r6.i(r0))));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = fVar4;
        b = new f[]{fVar, fVar2, fVar3, fVar4};
        a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    public static int A(LocalDate localDate) {
        int iOrdinal = localDate.O().ordinal();
        int iP = localDate.P() - 1;
        int i = (3 - iOrdinal) + iP;
        int i2 = i - ((i / 7) * 7);
        int i3 = i2 - 3;
        if (i3 < -3) {
            i3 = i2 + 4;
        }
        if (iP < i3) {
            return (int) q.f(1L, J(C(localDate.d0(180).Z(-1L)))).d;
        }
        int i4 = ((iP - i3) / 7) + 1;
        if (i4 != 53 || i3 == -3 || (i3 == -2 && localDate.S())) {
            return i4;
        }
        return 1;
    }

    public static int C(LocalDate localDate) {
        int i = localDate.a;
        int iP = localDate.P();
        if (iP <= 3) {
            return iP - localDate.O().ordinal() < -2 ? i - 1 : i;
        }
        if (iP >= 363) {
            return ((iP - 363) - (localDate.S() ? 1 : 0)) - localDate.O().ordinal() >= 0 ? i + 1 : i;
        }
        return i;
    }

    public static int J(int i) {
        LocalDate localDateOf = LocalDate.of(i, 1, 1);
        if (localDateOf.O() != j$.time.c.THURSDAY) {
            return (localDateOf.O() == j$.time.c.WEDNESDAY && localDateOf.S()) ? 53 : 52;
        }
        return 53;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) b.clone();
    }

    @Override // j$.time.temporal.n
    public final boolean isDateBased() {
        return true;
    }
}
