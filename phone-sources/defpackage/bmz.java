package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmz {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        d.t(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public bmz(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final float a() {
        return this.d - this.b;
    }

    public final float b() {
        return this.c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bmz)) {
            return false;
        }
        bmz bmzVar = (bmz) obj;
        return Float.compare(this.a, bmzVar.a) == 0 && Float.compare(this.b, bmzVar.b) == 0 && Float.compare(this.c, bmzVar.c) == 0 && Float.compare(this.d, bmzVar.d) == 0 && a.s(this.e, bmzVar.e) && a.s(this.f, bmzVar.f) && a.s(this.g, bmzVar.g) && a.s(this.h, bmzVar.h);
    }

    public final int hashCode() {
        int iFloatToIntBits = (((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d);
        long j = this.h;
        long j2 = this.g;
        return (((((((iFloatToIntBits * 31) + a.k(this.e)) * 31) + a.k(this.f)) * 31) + a.k(j2)) * 31) + a.k(j);
    }

    public final String toString() {
        String str = d.y(this.a) + ", " + d.y(this.b) + ", " + d.y(this.c) + ", " + d.y(this.d);
        long j = this.f;
        long j2 = this.g;
        long j3 = this.h;
        long j4 = this.e;
        if (!a.s(j4, j) || !a.s(j, j2) || !a.s(j2, j3)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) bmv.a(j4)) + ", topRight=" + ((Object) bmv.a(j)) + ", bottomRight=" + ((Object) bmv.a(j2)) + ", bottomLeft=" + ((Object) bmv.a(j3)) + ')';
        }
        int i = (int) (4294967295L & j4);
        int i2 = (int) (j4 >> 32);
        if (Float.intBitsToFloat(i2) == Float.intBitsToFloat(i)) {
            return "RoundRect(rect=" + str + ", radius=" + d.y(Float.intBitsToFloat(i2)) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + d.y(Float.intBitsToFloat(i2)) + ", y=" + d.y(Float.intBitsToFloat(i)) + ')';
    }
}
