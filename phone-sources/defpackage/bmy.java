package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmy {
    public static final bmy a = new bmy(0.0f, 0.0f, 0.0f, 0.0f);
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public bmy(float f, float f2, float f3, float f4) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    public final long a() {
        float f = this.d;
        float f2 = this.b;
        return (Float.floatToRawIntBits(f2 + ((f - f2) / 2.0f)) << 32) | (Float.floatToRawIntBits(this.e) & 4294967295L);
    }

    public final long b() {
        return (Float.floatToRawIntBits(this.b) << 32) | (Float.floatToRawIntBits(this.e) & 4294967295L);
    }

    public final long c() {
        return (Float.floatToRawIntBits(this.d) << 32) | (Float.floatToRawIntBits(this.e) & 4294967295L);
    }

    public final long d() {
        float f = this.d;
        float f2 = this.b;
        long jFloatToRawIntBits = Float.floatToRawIntBits(f2 + ((f - f2) / 2.0f));
        float f3 = this.e;
        float f4 = this.c;
        return (jFloatToRawIntBits << 32) | (Float.floatToRawIntBits(f4 + ((f3 - f4) / 2.0f)) & 4294967295L);
    }

    public final long e() {
        return (Float.floatToRawIntBits(this.d - this.b) << 32) | (Float.floatToRawIntBits(this.e - this.c) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bmy)) {
            return false;
        }
        bmy bmyVar = (bmy) obj;
        return Float.compare(this.b, bmyVar.b) == 0 && Float.compare(this.c, bmyVar.c) == 0 && Float.compare(this.d, bmyVar.d) == 0 && Float.compare(this.e, bmyVar.e) == 0;
    }

    public final long f() {
        return (Float.floatToRawIntBits(this.b) << 32) | (Float.floatToRawIntBits(this.c) & 4294967295L);
    }

    public final bmy g(bmy bmyVar) {
        return new bmy(Math.max(this.b, bmyVar.b), Math.max(this.c, bmyVar.c), Math.min(this.d, bmyVar.d), Math.min(this.e, bmyVar.e));
    }

    public final bmy h(float f, float f2) {
        float f3 = this.e;
        float f4 = this.d;
        return new bmy(this.b + f, this.c + f2, f4 + f, f3 + f2);
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.b) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e);
    }

    public final bmy i(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new bmy(this.b + Float.intBitsToFloat(i), this.c + Float.intBitsToFloat(i2), this.d + Float.intBitsToFloat(i), this.e + Float.intBitsToFloat(i2));
    }

    public final boolean j(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float f = this.b;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (fIntBitsToFloat < this.d) & (fIntBitsToFloat >= f) & (fIntBitsToFloat2 >= this.c) & (fIntBitsToFloat2 < this.e);
    }

    public final boolean k(bmy bmyVar) {
        return (this.b < bmyVar.d) & (bmyVar.b < this.d) & (this.c < bmyVar.e) & (bmyVar.c < this.e);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + d.y(this.b) + ", " + d.y(this.c) + ", " + d.y(this.d) + ", " + d.y(this.e) + ')';
    }
}
