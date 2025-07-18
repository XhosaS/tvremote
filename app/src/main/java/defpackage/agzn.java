package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agzn implements Comparable {
    public static final long a;
    public static final long b;

    static {
        int i = agzo.a;
        a = Long.MAX_VALUE;
        b = -9223372036854775805L;
    }

    public static final long a(long j, long j2) {
        if (e(j)) {
            if (b(j2) || (j2 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (e(j2)) {
            return j2;
        }
        long j3 = j2 >> 1;
        long j4 = j >> 1;
        if ((((int) j) & 1) != (((int) j2) & 1)) {
            return c(j) ? f(j4, j3) : f(j3, j4);
        }
        long j5 = j4 + j3;
        if (d(j)) {
            if (j5 >= -4611686018426999999L && j5 < 4611686018427000000L) {
                int i = agzo.a;
                return j5 + j5;
            }
            long j6 = j5 / 1000000;
            int i2 = agzo.a;
            return j6 + j6 + 1;
        }
        if (j5 < -4611686018426L || j5 >= 4611686018427L) {
            long jA = agwz.a(j5, -4611686018427387903L, 4611686018427387903L);
            int i3 = agzo.a;
            return jA + jA + 1;
        }
        int i4 = agzo.a;
        long j7 = j5 * 1000000;
        return j7 + j7;
    }

    public static final boolean b(long j) {
        return !e(j);
    }

    public static final boolean c(long j) {
        return (((int) j) & 1) == 1;
    }

    public static final boolean d(long j) {
        return (((int) j) & 1) == 0;
    }

    public static final boolean e(long j) {
        return j == a || j == b;
    }

    private static final long f(long j, long j2) {
        long j3 = j2 / 1000000;
        long j4 = j + j3;
        if (j4 < -4611686018426L || j4 >= 4611686018427L) {
            long jA = agwz.a(j4, -4611686018427387903L, 4611686018427387903L);
            int i = agzo.a;
            return jA + jA + 1;
        }
        int i2 = agzo.a;
        long j5 = (j4 * 1000000) + (j2 - (j3 * 1000000));
        return j5 + j5;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        throw null;
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
