package defpackage;

/* compiled from: PG */
@yji
/* loaded from: classes.dex */
public final class cmm {
    public final long a;

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final long c(long j, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * f;
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
    }

    public static String d(long j) {
        return "(" + a(j) + ", " + b(j) + ") px/sec";
    }

    public static /* synthetic */ long e(long j, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i & 2) != 0) {
            f2 = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cmm) && this.a == ((cmm) obj).a;
    }

    public final int hashCode() {
        return a.k(this.a);
    }

    public final String toString() {
        return d(this.a);
    }
}
