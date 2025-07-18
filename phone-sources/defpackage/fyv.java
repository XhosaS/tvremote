package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fyv {
    public final float a;
    public final float b;
    public final float c;
    public final int d;
    public final long e;

    public fyv(float f, float f2, float f3, int i, long j) {
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
            fyv fyvVar = (fyv) obj;
            return this.a == fyvVar.a && this.b == fyvVar.b && this.c == fyvVar.c && this.d == fyvVar.d && this.e == fyvVar.e;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + this.d) * 31) + a.k(this.e);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.a + ", touchY=" + this.b + ", progress=" + this.c + ", swipeEdge=" + this.d + ", frameTimeMillis=" + this.e + ')';
    }
}
