package defpackage;

/* compiled from: PG */
@yji
/* loaded from: classes.dex */
public final class bna {
    public final long a;

    public /* synthetic */ bna(long j) {
        this.a = j;
    }

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float b(long j) {
        return Math.min(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static String d(long j) {
        if (j == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + d.y(Float.intBitsToFloat((int) (j >> 32))) + ", " + d.y(Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
    }

    public static final boolean e(long j) {
        return (j == 9205357640488583168L) | (Float.intBitsToFloat((int) (j >> 32)) <= 0.0f) | (Float.intBitsToFloat((int) (j & 4294967295L)) <= 0.0f);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bna) && this.a == ((bna) obj).a;
    }

    public final int hashCode() {
        return a.k(this.a);
    }

    public final String toString() {
        return d(this.a);
    }
}
