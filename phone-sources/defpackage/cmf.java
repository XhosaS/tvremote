package defpackage;

/* compiled from: PG */
@yji
/* loaded from: classes.dex */
public final class cmf {
    public final long a;

    public /* synthetic */ cmf(long j) {
        this.a = j;
    }

    public static final int a(long j) {
        return (int) (j >> 32);
    }

    public static final int b(long j) {
        return (int) (j & 4294967295L);
    }

    public static final long c(long j, long j2) {
        return ((((int) (j >> 32)) - ((int) (j2 >> 32))) << 32) | ((((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L))) & 4294967295L);
    }

    public static final long d(long j, long j2) {
        return ((((int) (j >> 32)) + ((int) (j2 >> 32))) << 32) | ((((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L))) & 4294967295L);
    }

    public static String e(long j) {
        return "(" + a(j) + ", " + b(j) + ')';
    }

    public static /* synthetic */ long f(long j, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = (int) (j >> 32);
        }
        if ((i3 & 2) != 0) {
            i2 = (int) (j & 4294967295L);
        }
        return (i << 32) | (i2 & 4294967295L);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cmf) && this.a == ((cmf) obj).a;
    }

    public final int hashCode() {
        return a.k(this.a);
    }

    public final String toString() {
        return e(this.a);
    }
}
