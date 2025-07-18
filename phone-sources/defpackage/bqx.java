package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqx extends brh {
    public final float a;
    public final float b;
    public final float c;
    public final boolean d;
    public final boolean e;
    public final float f;
    public final float g;

    public bqx(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(false, false, 3);
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = z;
        this.e = z2;
        this.f = f4;
        this.g = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqx)) {
            return false;
        }
        bqx bqxVar = (bqx) obj;
        return Float.compare(this.a, bqxVar.a) == 0 && Float.compare(this.b, bqxVar.b) == 0 && Float.compare(this.c, bqxVar.c) == 0 && this.d == bqxVar.d && this.e == bqxVar.e && Float.compare(this.f, bqxVar.f) == 0 && Float.compare(this.g, bqxVar.g) == 0;
    }

    public final int hashCode() {
        int iFloatToIntBits = (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c);
        float f = this.f;
        return (((((((iFloatToIntBits * 31) + a.q(this.d)) * 31) + a.q(this.e)) * 31) + Float.floatToIntBits(f)) * 31) + Float.floatToIntBits(this.g);
    }

    public final String toString() {
        return "RelativeArcTo(horizontalEllipseRadius=" + this.a + ", verticalEllipseRadius=" + this.b + ", theta=" + this.c + ", isMoreThanHalf=" + this.d + ", isPositiveArc=" + this.e + ", arcStartDx=" + this.f + ", arcStartDy=" + this.g + ')';
    }
}
