package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ssl {
    public static final ssl a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double[] g;
    public final double h;
    public final double i;
    public final double j;

    static {
        double[] dArr = srz.c;
        double dMax = Math.max(0.1d, 50.0d);
        double[][] dArr2 = sry.a;
        double d = dArr[0];
        double[] dArr3 = dArr2[0];
        double d2 = dArr3[0] * d;
        double d3 = dArr[1];
        double d4 = dArr3[1] * d3;
        double d5 = dArr[2];
        double d6 = dArr3[2] * d5;
        double[] dArr4 = dArr2[1];
        double d7 = dArr4[0] * d;
        double d8 = dArr4[1] * d3;
        double d9 = dArr4[2] * d5;
        double[] dArr5 = dArr2[2];
        double d10 = d * dArr5[0];
        double d11 = d3 * dArr5[1];
        double d12 = d5 * dArr5[2];
        double dE = (srz.e(50.0d) * 63.66197723675813d) / 100.0d;
        double d13 = d2 + d4 + d6;
        double dI = sik.i(1.0d, 1.0d - (Math.exp(((-dE) - 42.0d) / 92.0d) * 0.2777777777777778d));
        double d14 = d7 + d8 + d9;
        double d15 = d10 + d11 + d12;
        double[] dArr6 = {(((100.0d / d13) * dI) + 1.0d) - dI, (((100.0d / d14) * dI) + 1.0d) - dI, (((100.0d / d15) * dI) + 1.0d) - dI};
        double d16 = 5.0d * dE;
        double d17 = 1.0d / (d16 + 1.0d);
        double d18 = d17 * d17 * d17 * d17;
        double d19 = 1.0d - d18;
        double dCbrt = d19 * 0.1d * d19 * Math.cbrt(d16);
        double dE2 = srz.e(dMax) / dArr[1];
        double dSqrt = Math.sqrt(dE2) + 1.48d;
        double dPow = 0.725d / Math.pow(dE2, 0.2d);
        double d20 = (d18 * dE) + dCbrt;
        double dPow2 = Math.pow(((dArr6[0] * d20) * d13) / 100.0d, 0.42d);
        double dPow3 = Math.pow(((dArr6[1] * d20) * d14) / 100.0d, 0.42d);
        double dPow4 = Math.pow(((dArr6[2] * d20) * d15) / 100.0d, 0.42d);
        double[] dArr7 = {dPow2, dPow3, dPow4};
        double d21 = dArr7[0];
        double d22 = (d21 * 400.0d) / (d21 + 27.13d);
        double d23 = dArr7[1];
        double d24 = (400.0d * dPow4) / (dPow4 + 27.13d);
        double[] dArr8 = {d22, (d23 * 400.0d) / (d23 + 27.13d), d24};
        double d25 = dArr8[0];
        a = new ssl(dE2, (d25 + d25 + dArr8[1] + (d24 * 0.05d)) * dPow, dPow, dPow, sik.e(0.59d, 0.69d, 0.9999999999999998d), dArr6, d20, Math.pow(d20, 0.25d), dSqrt);
    }

    private ssl(double d, double d2, double d3, double d4, double d5, double[] dArr, double d6, double d7, double d8) {
        this.f = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = d5;
        this.g = dArr;
        this.h = d6;
        this.i = d7;
        this.j = d8;
    }
}
