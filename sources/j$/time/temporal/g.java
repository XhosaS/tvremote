package j$.time.temporal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public abstract class g implements p {
    public static final g DAY_OF_QUARTER;
    public static final g QUARTER_OF_YEAR;
    public static final g WEEK_BASED_YEAR;
    public static final g WEEK_OF_WEEK_BASED_YEAR;
    public static final int[] a;
    public static final /* synthetic */ g[] b;

    static {
        g gVar = new g() { // from class: j$.time.temporal.c
            @Override // j$.time.temporal.p
            public final boolean i(m mVar) {
                if (!mVar.e(a.DAY_OF_YEAR) || !mVar.e(a.MONTH_OF_YEAR) || !mVar.e(a.YEAR)) {
                    return false;
                }
                g gVar2 = i.a;
                return j$.nio.file.attribute.a.A(mVar).equals(j$.time.chrono.t.c);
            }

            @Override // j$.time.temporal.p
            public final t j(m mVar) {
                if (!i(mVar)) {
                    throw new s("Unsupported field: DayOfQuarter");
                }
                long jX = mVar.x(g.QUARTER_OF_YEAR);
                if (jX != 1) {
                    return jX == 2 ? t.f(1L, 91L) : (jX == 3 || jX == 4) ? t.f(1L, 92L) : k();
                }
                long jX2 = mVar.x(a.YEAR);
                j$.time.chrono.t.c.getClass();
                return j$.time.chrono.t.j(jX2) ? t.f(1L, 91L) : t.f(1L, 90L);
            }

            @Override // j$.time.temporal.p
            public final t k() {
                return t.g(90L, 92L);
            }

            @Override // j$.time.temporal.p
            public final long l(m mVar) {
                if (!i(mVar)) {
                    throw new s("Unsupported field: DayOfQuarter");
                }
                int i = mVar.i(a.DAY_OF_YEAR);
                int i2 = mVar.i(a.MONTH_OF_YEAR);
                long jX = mVar.x(a.YEAR);
                int i3 = (i2 - 1) / 3;
                j$.time.chrono.t.c.getClass();
                return i - g.a[i3 + (j$.time.chrono.t.j(jX) ? 4 : 0)];
            }

            @Override // j$.time.temporal.p
            public final l o(l lVar, long j) {
                long jL = l(lVar);
                k().b(j, this);
                a aVar = a.DAY_OF_YEAR;
                return lVar.c((j - jL) + lVar.x(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = gVar;
        g gVar2 = new g() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.p
            public final boolean i(m mVar) {
                if (!mVar.e(a.MONTH_OF_YEAR)) {
                    return false;
                }
                g gVar3 = i.a;
                return j$.nio.file.attribute.a.A(mVar).equals(j$.time.chrono.t.c);
            }

            @Override // j$.time.temporal.p
            public final t j(m mVar) {
                if (i(mVar)) {
                    return k();
                }
                throw new s("Unsupported field: QuarterOfYear");
            }

            @Override // j$.time.temporal.p
            public final t k() {
                return t.f(1L, 4L);
            }

            @Override // j$.time.temporal.p
            public final long l(m mVar) {
                if (i(mVar)) {
                    return (mVar.x(a.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new s("Unsupported field: QuarterOfYear");
            }

            @Override // j$.time.temporal.p
            public final l o(l lVar, long j) {
                long jL = l(lVar);
                k().b(j, this);
                a aVar = a.MONTH_OF_YEAR;
                return lVar.c(((j - jL) * 3) + lVar.x(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = gVar2;
        g gVar3 = new g() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.p
            public final boolean i(m mVar) {
                if (!mVar.e(a.EPOCH_DAY)) {
                    return false;
                }
                g gVar4 = i.a;
                return j$.nio.file.attribute.a.A(mVar).equals(j$.time.chrono.t.c);
            }

            @Override // j$.time.temporal.p
            public final t j(m mVar) {
                if (i(mVar)) {
                    return t.f(1L, g.D(g.x(j$.time.f.F(mVar))));
                }
                throw new s("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.p
            public final t k() {
                return t.g(52L, 53L);
            }

            @Override // j$.time.temporal.p
            public final long l(m mVar) {
                if (i(mVar)) {
                    return g.t(j$.time.f.F(mVar));
                }
                throw new s("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.p
            public final l o(l lVar, long j) {
                k().b(j, this);
                return lVar.d(j$.nio.file.attribute.a.G(j, l(lVar)), b.WEEKS);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = gVar3;
        g gVar4 = new g() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.p
            public final boolean i(m mVar) {
                if (!mVar.e(a.EPOCH_DAY)) {
                    return false;
                }
                g gVar5 = i.a;
                return j$.nio.file.attribute.a.A(mVar).equals(j$.time.chrono.t.c);
            }

            @Override // j$.time.temporal.p
            public final t j(m mVar) {
                if (i(mVar)) {
                    return k();
                }
                throw new s("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.p
            public final t k() {
                return a.YEAR.b;
            }

            @Override // j$.time.temporal.p
            public final long l(m mVar) {
                if (i(mVar)) {
                    return g.x(j$.time.f.F(mVar));
                }
                throw new s("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.p
            public final l o(l lVar, long j) {
                if (!i(lVar)) {
                    throw new s("Unsupported field: WeekBasedYear");
                }
                int iA = a.YEAR.b.a(j, g.WEEK_BASED_YEAR);
                j$.time.f fVarF = j$.time.f.F(lVar);
                int i = fVarF.i(a.DAY_OF_WEEK);
                int iT = g.t(fVarF);
                if (iT == 53 && g.D(iA) == 52) {
                    iT = 52;
                }
                return lVar.j(j$.time.f.L(iA, 1, 4).O(((iT - 1) * 7) + (i - r6.i(r0))));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = gVar4;
        b = new g[]{gVar, gVar2, gVar3, gVar4};
        a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    public static int D(int i) {
        j$.time.f fVarL = j$.time.f.L(i, 1, 1);
        if (fVarL.H() != j$.time.c.THURSDAY) {
            return (fVarL.H() == j$.time.c.WEDNESDAY && fVarL.J()) ? 53 : 52;
        }
        return 53;
    }

    public static int t(j$.time.f fVar) {
        int iOrdinal = fVar.H().ordinal();
        int I = fVar.I() - 1;
        int i = (3 - iOrdinal) + I;
        int i2 = i - ((i / 7) * 7);
        int i3 = i2 - 3;
        if (i3 < -3) {
            i3 = i2 + 4;
        }
        if (I < i3) {
            return (int) t.f(1L, D(x(fVar.U(180).Q(-1L)))).d;
        }
        int i4 = ((I - i3) / 7) + 1;
        if (i4 != 53 || i3 == -3 || (i3 == -2 && fVar.J())) {
            return i4;
        }
        return 1;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) b.clone();
    }

    public static int x(j$.time.f fVar) {
        int i = fVar.a;
        int I = fVar.I();
        if (I <= 3) {
            return I - fVar.H().ordinal() < -2 ? i - 1 : i;
        }
        if (I >= 363) {
            return ((I - 363) - (fVar.J() ? 1 : 0)) - fVar.H().ordinal() >= 0 ? i + 1 : i;
        }
        return i;
    }

    @Override // j$.time.temporal.p
    public final boolean isDateBased() {
        return true;
    }
}
