package defpackage;

/* compiled from: PG */
@yji
/* loaded from: classes.dex */
public final class cmb {
    public final long a;

    public /* synthetic */ cmb(long j) {
        this.a = j;
    }

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String c(long j) {
        if (j == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) cma.a(a(j))) + ", " + ((Object) cma.a(b(j))) + ')';
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cmb) && this.a == ((cmb) obj).a;
    }

    public final int hashCode() {
        return a.k(this.a);
    }

    public final String toString() {
        return c(this.a);
    }
}
