package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgz {
    public final float a;
    public final float b;
    public final float c;
    public final int d;
    public final long e;

    public bgz(float f, float f2, float f3, int i, long j) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bgz bgzVar = (bgz) obj;
            return this.a == bgzVar.a && this.b == bgzVar.b && this.c == bgzVar.c && this.d == bgzVar.d && this.e == bgzVar.e;
        }
        return false;
    }

    public final int hashCode() {
        int iFloatToIntBits = (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c);
        long j = this.e;
        return (((iFloatToIntBits * 31) + this.d) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.a + ", touchY=" + this.b + ", progress=" + this.c + ", swipeEdge=" + this.d + ", frameTimeMillis=" + this.e + ')';
    }
}
