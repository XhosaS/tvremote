package j$.time.temporal;

import j$.time.chrono.t;
import j$.time.format.D;
import j$.time.format.E;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
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
            public final Temporal E(Temporal temporal, long j) {
                long jT = t(temporal);
                range().b(j, this);
                a aVar = a.DAY_OF_YEAR;
                return temporal.a((j - jT) + temporal.H(aVar), aVar);
            }

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
                long jH = kVar.H(f.QUARTER_OF_YEAR);
                if (jH == 1) {
                    return t.c.T(kVar.H(a.YEAR)) ? q.f(1L, 91L) : q.f(1L, 90L);
                }
                return jH == 2 ? q.f(1L, 91L) : (jH == 3 || jH == 4) ? q.f(1L, 92L) : range();
            }

            @Override // j$.time.temporal.f, j$.time.temporal.n
            public final k m(Map map, D d, E e) {
                j$.time.h hVarM0;
                long jL;
                a aVar = a.YEAR;
                Long l = (Long) map.get(aVar);
                n nVar = f.QUARTER_OF_YEAR;
                Long l2 = (Long) map.get(nVar);
                if (l == null || l2 == null) {
                    return null;
                }
                int iA = aVar.d.a(l.longValue(), aVar);
                long jLongValue = ((Long) map.get(f.DAY_OF_QUARTER)).longValue();
                f fVar2 = h.a;
                if (!j$.desugar.sun.nio.fs.g.w(d).equals(t.c)) {
                    throw new j$.time.b("Resolve requires IsoChronology");
                }
                if (e == E.LENIENT) {
                    hVarM0 = j$.time.h.h0(iA, 1, 1).m0(j$.desugar.sun.nio.fs.g.K(j$.desugar.sun.nio.fs.g.L(l2.longValue(), 1L), 3));
                    jL = j$.desugar.sun.nio.fs.g.L(jLongValue, 1L);
                } else {
                    j$.time.h hVarH0 = j$.time.h.h0(iA, ((nVar.range().a(l2.longValue(), nVar) - 1) * 3) + 1, 1);
                    if (jLongValue < 1 || jLongValue > 90) {
                        if (e == E.STRICT) {
                            l(hVarH0).b(jLongValue, this);
                        } else {
                            range().b(jLongValue, this);
                        }
                    }
                    hVarM0 = hVarH0;
                    jL = jLongValue - 1;
                }
                map.remove(this);
                map.remove(aVar);
                map.remove(nVar);
                return hVarM0.l0(jL);
            }

            @Override // j$.time.temporal.n
            public final q range() {
                return q.g(1L, 90L, 92L);
            }

            @Override // j$.time.temporal.n
            public final long t(k kVar) {
                if (!i(kVar)) {
                    throw new p("Unsupported field: DayOfQuarter");
                }
                return kVar.i(a.DAY_OF_YEAR) - f.a[((kVar.i(a.MONTH_OF_YEAR) - 1) / 3) + (t.c.T(kVar.H(a.YEAR)) ? 4 : 0)];
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = fVar;
        f fVar2 = new f() { // from class: j$.time.temporal.c
            @Override // j$.time.temporal.n
            public final Temporal E(Temporal temporal, long j) {
                long jT = t(temporal);
                range().b(j, this);
                a aVar = a.MONTH_OF_YEAR;
                return temporal.a(((j - jT) * 3) + temporal.H(aVar), aVar);
            }

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
            public final q range() {
                return q.f(1L, 4L);
            }

            @Override // j$.time.temporal.n
            public final long t(k kVar) {
                if (i(kVar)) {
                    return (kVar.H(a.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new p("Unsupported field: QuarterOfYear");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = fVar2;
        f fVar3 = new f() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.n
            public final Temporal E(Temporal temporal, long j) {
                range().b(j, this);
                return temporal.b(j$.desugar.sun.nio.fs.g.L(j, t(temporal)), ChronoUnit.WEEKS);
            }

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
                    return f.W(j$.time.h.X(kVar));
                }
                throw new p("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.f, j$.time.temporal.n
            public final k m(Map map, D d, E e) {
                j$.time.h hVarA;
                long j;
                long j2;
                n nVar = f.WEEK_BASED_YEAR;
                Long l = (Long) map.get(nVar);
                a aVar = a.DAY_OF_WEEK;
                Long l2 = (Long) map.get(aVar);
                if (l == null || l2 == null) {
                    return null;
                }
                int iA = nVar.range().a(l.longValue(), nVar);
                long jLongValue = ((Long) map.get(f.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                f fVar4 = h.a;
                if (!j$.desugar.sun.nio.fs.g.w(d).equals(t.c)) {
                    throw new j$.time.b("Resolve requires IsoChronology");
                }
                j$.time.h hVarH0 = j$.time.h.h0(iA, 1, 4);
                if (e == E.LENIENT) {
                    long jLongValue2 = l2.longValue();
                    if (jLongValue2 > 7) {
                        long j3 = jLongValue2 - 1;
                        j = 1;
                        hVarH0 = hVarH0.n0(j3 / 7);
                        j2 = j3 % 7;
                    } else {
                        j = 1;
                        if (jLongValue2 < 1) {
                            hVarH0 = hVarH0.n0(j$.desugar.sun.nio.fs.g.L(jLongValue2, 7L) / 7);
                            j2 = (jLongValue2 + 6) % 7;
                        }
                        hVarA = hVarH0.n0(j$.desugar.sun.nio.fs.g.L(jLongValue, j)).a(jLongValue2, aVar);
                    }
                    jLongValue2 = j2 + j;
                    hVarA = hVarH0.n0(j$.desugar.sun.nio.fs.g.L(jLongValue, j)).a(jLongValue2, aVar);
                } else {
                    int iA2 = aVar.d.a(l2.longValue(), aVar);
                    if (jLongValue < 1 || jLongValue > 52) {
                        if (e == E.STRICT) {
                            f.W(hVarH0).b(jLongValue, this);
                        } else {
                            range().b(jLongValue, this);
                        }
                    }
                    hVarA = hVarH0.n0(jLongValue - 1).a(iA2, aVar);
                }
                map.remove(this);
                map.remove(nVar);
                map.remove(aVar);
                return hVarA;
            }

            @Override // j$.time.temporal.n
            public final q range() {
                return q.g(1L, 52L, 53L);
            }

            @Override // j$.time.temporal.n
            public final long t(k kVar) {
                if (i(kVar)) {
                    return f.H(j$.time.h.X(kVar));
                }
                throw new p("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = fVar3;
        f fVar4 = new f() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.n
            public final Temporal E(Temporal temporal, long j) {
                if (!i(temporal)) {
                    throw new p("Unsupported field: WeekBasedYear");
                }
                int iA = a.YEAR.d.a(j, f.WEEK_BASED_YEAR);
                j$.time.h hVarX = j$.time.h.X(temporal);
                int i = hVarX.i(a.DAY_OF_WEEK);
                int iH = f.H(hVarX);
                if (iH == 53 && f.V(iA) == 52) {
                    iH = 52;
                }
                return temporal.l(j$.time.h.h0(iA, 1, 4).l0(((iH - 1) * 7) + (i - r6.i(r0))));
            }

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
            public final q range() {
                return a.YEAR.d;
            }

            @Override // j$.time.temporal.n
            public final long t(k kVar) {
                if (i(kVar)) {
                    return f.U(j$.time.h.X(kVar));
                }
                throw new p("Unsupported field: WeekBasedYear");
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

    public static int H(j$.time.h hVar) {
        int iOrdinal = hVar.Z().ordinal();
        int iA0 = hVar.a0() - 1;
        int i = (3 - iOrdinal) + iA0;
        int i2 = i - ((i / 7) * 7);
        int i3 = i2 - 3;
        if (i3 < -3) {
            i3 = i2 + 4;
        }
        if (iA0 < i3) {
            if (hVar.a0() != 180) {
                hVar = j$.time.h.j0(hVar.a, 180);
            }
            return (int) W(hVar.o0(-1L)).d;
        }
        int i4 = ((iA0 - i3) / 7) + 1;
        if (i4 != 53 || i3 == -3 || (i3 == -2 && hVar.v())) {
            return i4;
        }
        return 1;
    }

    public static int U(j$.time.h hVar) {
        int i = hVar.a;
        int iA0 = hVar.a0();
        if (iA0 <= 3) {
            return iA0 - hVar.Z().ordinal() < -2 ? i - 1 : i;
        }
        if (iA0 >= 363) {
            return ((iA0 - 363) - (hVar.v() ? 1 : 0)) - hVar.Z().ordinal() >= 0 ? i + 1 : i;
        }
        return i;
    }

    public static int V(int i) {
        j$.time.h hVarH0 = j$.time.h.h0(i, 1, 1);
        if (hVarH0.Z() != j$.time.c.THURSDAY) {
            return (hVarH0.Z() == j$.time.c.WEDNESDAY && hVarH0.v()) ? 53 : 52;
        }
        return 53;
    }

    public static q W(j$.time.h hVar) {
        return q.f(1L, V(U(hVar)));
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

    public /* synthetic */ k m(Map map, D d, E e) {
        return null;
    }
}
