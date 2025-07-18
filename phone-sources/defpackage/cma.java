package defpackage;

/* compiled from: PG */
@yji
/* loaded from: classes.dex */
public final class cma implements Comparable {
    public final float a;

    public static String a(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    public static final boolean b(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return Float.compare(this.a, ((cma) obj).a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cma) && Float.compare(this.a, ((cma) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
