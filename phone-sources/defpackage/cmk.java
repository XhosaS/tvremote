package defpackage;

/* compiled from: PG */
@yji
/* loaded from: classes.dex */
public final class cmk {
    public final long b;
    private static final cml[] c = {new cml(0), new cml(4294967296L), new cml(8589934592L)};
    public static final long a = clw.w(0, Float.NaN);

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final long b(long j) {
        return j & 1095216660480L;
    }

    public static final long c(long j) {
        return c[(int) (b(j) >>> 32)].a;
    }

    public static String d(long j) {
        long jC = c(j);
        if (a.s(jC, 0L)) {
            return "Unspecified";
        }
        if (a.s(jC, 4294967296L)) {
            return a(j) + ".sp";
        }
        if (!a.s(jC, 8589934592L)) {
            return "Invalid";
        }
        return a(j) + ".em";
    }

    public static final boolean e(long j) {
        return b(j) == 4294967296L;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cmk) && this.b == ((cmk) obj).b;
    }

    public final int hashCode() {
        return a.k(this.b);
    }

    public final String toString() {
        return d(this.b);
    }
}
