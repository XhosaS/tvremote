package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class or {
    public float a = 1.0f;
    public double b = Math.sqrt(50.0d);
    public float c = 1.0f;

    public final float a() {
        double d = this.b;
        return (float) (d * d);
    }

    public final long b(float f, float f2, long j) {
        double dExp;
        double dExp2;
        float f3 = f - this.a;
        float f4 = this.c;
        double d = f4;
        double d2 = this.b;
        double d3 = (-f4) * d2;
        double d4 = f2;
        double d5 = f3;
        double d6 = d * d;
        double d7 = j / 1000.0d;
        if (f4 > 1.0f) {
            double dSqrt = d2 * Math.sqrt(d6 - 1.0d);
            double d8 = d3 + dSqrt;
            double d9 = d3 - dSqrt;
            double d10 = d9 * d7;
            double d11 = ((d9 * d5) - d4) / (d9 - d8);
            double d12 = d5 - d11;
            double dExp3 = Math.exp(d10) * d12;
            double d13 = d7 * d8;
            double dExp4 = Math.exp(d13) * d11;
            dExp2 = (d12 * d9 * Math.exp(d10)) + (d11 * d8 * Math.exp(d13));
            dExp = dExp3 + dExp4;
        } else if (f4 == 1.0f) {
            double d14 = (-d2) * d7;
            double d15 = d4 + (d2 * d5);
            double d16 = d5 + (d7 * d15);
            double dExp5 = Math.exp(d14) * d16;
            dExp2 = (d16 * Math.exp(d14) * (-this.b)) + (d15 * Math.exp(d14));
            dExp = dExp5;
        } else {
            double dSqrt2 = d2 * Math.sqrt(1.0d - d6);
            double d17 = dSqrt2 * d7;
            double d18 = d7 * d3;
            double d19 = (1.0d / dSqrt2) * (((-d3) * d5) + d4);
            dExp = Math.exp(d18) * ((Math.cos(d17) * d5) + (Math.sin(d17) * d19));
            dExp2 = (Math.exp(d18) * (((-dSqrt2) * d5 * Math.sin(d17)) + (dSqrt2 * d19 * Math.cos(d17)))) + (d3 * dExp);
        }
        return (Float.floatToRawIntBits((float) (dExp + this.a)) << 32) | (Float.floatToRawIntBits((float) dExp2) & 4294967295L);
    }
}
