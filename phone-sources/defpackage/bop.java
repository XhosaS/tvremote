package defpackage;

/* compiled from: PG */
@yji
/* loaded from: classes.dex */
public final class bop {
    public static final long a = brx.E(0.5f, 0.5f);
    public final long b;

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String c(long j) {
        return "TransformOrigin(packedValue=" + j + ')';
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bop) && this.b == ((bop) obj).b;
    }

    public final int hashCode() {
        return a.k(this.b);
    }

    public final String toString() {
        return c(this.b);
    }
}
