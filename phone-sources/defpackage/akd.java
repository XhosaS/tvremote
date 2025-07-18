package defpackage;

/* compiled from: PG */
@yji
/* loaded from: classes.dex */
public final class akd {
    public static final int a(long j) {
        return (int) (j >> 32);
    }

    public static long b(int i) {
        return (i << 32) | 4294967295L;
    }

    public static long c(int i, int i2) {
        return (i2 + (-1) != 0 ? 1 : 0) | (i << 32);
    }

    public static final int d(long j) {
        int i = (int) (j & 4294967295L);
        if (i < 0) {
            return 0;
        }
        return i == 0 ? 1 : 2;
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
