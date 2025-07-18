package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mi {
    public final float a;
    public final float b;
    public final long c;

    public mi(float f, float f2, long j) {
        this.a = f;
        this.b = f2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mi)) {
            return false;
        }
        mi miVar = (mi) obj;
        return Float.compare(this.a, miVar.a) == 0 && Float.compare(this.b, miVar.b) == 0 && this.c == miVar.c;
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + a.k(this.c);
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.a + ", distance=" + this.b + ", duration=" + this.c + ')';
    }
}
