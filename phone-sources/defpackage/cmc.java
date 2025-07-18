package defpackage;

/* compiled from: PG */
@yji
/* loaded from: classes.dex */
public final class cmc {
    public final long a;

    public /* synthetic */ cmc(long j) {
        this.a = j;
    }

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static String c(long j) {
        if (j == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) cma.a(b(j))) + " x " + ((Object) cma.a(a(j)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cmc) && this.a == ((cmc) obj).a;
    }

    public final int hashCode() {
        return a.k(this.a);
    }

    public final String toString() {
        return c(this.a);
    }
}
