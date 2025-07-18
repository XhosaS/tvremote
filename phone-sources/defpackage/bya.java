package defpackage;

/* compiled from: PG */
@yji
/* loaded from: classes.dex */
public final class bya {
    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final int b(long j, long j2) {
        boolean zD = d(j);
        if (zD != d(j2)) {
            return zD ? -1 : 1;
        }
        return (Math.min(a(j), a(j2)) >= 0.0f && c(j) != c(j2)) ? c(j) ? -1 : 1 : (int) Math.signum(a(j) - a(j2));
    }

    public static final boolean c(long j) {
        return (j & 2) != 0;
    }

    public static final boolean d(long j) {
        return (j & 1) != 0;
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
