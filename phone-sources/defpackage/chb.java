package defpackage;

/* compiled from: PG */
@yji
/* loaded from: classes.dex */
public final class chb {
    public static final long a = ccf.N(0, 0);
    public final long b;

    public /* synthetic */ chb(long j) {
        this.b = j;
    }

    public static final int a(long j) {
        return (int) (j & 4294967295L);
    }

    public static final int b(long j) {
        return c(j) - d(j);
    }

    public static final int c(long j) {
        return Math.max(e(j), a(j));
    }

    public static final int d(long j) {
        return Math.min(e(j), a(j));
    }

    public static final int e(long j) {
        return (int) (j >> 32);
    }

    public static String f(long j) {
        return "TextRange(" + e(j) + ", " + a(j) + ')';
    }

    public static final boolean g(long j) {
        return e(j) == a(j);
    }

    public static final boolean h(long j) {
        return e(j) > a(j);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof chb) && this.b == ((chb) obj).b;
    }

    public final int hashCode() {
        return a.k(this.b);
    }

    public final String toString() {
        return f(this.b);
    }
}
