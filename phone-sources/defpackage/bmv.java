package defpackage;

/* compiled from: PG */
@yji
/* loaded from: classes.dex */
public final class bmv {
    public static String a(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) == Float.intBitsToFloat(i)) {
            return "CornerRadius.circular(" + d.y(Float.intBitsToFloat(i2)) + ')';
        }
        return "CornerRadius.elliptical(" + d.y(Float.intBitsToFloat(i2)) + ", " + d.y(Float.intBitsToFloat(i)) + ')';
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
