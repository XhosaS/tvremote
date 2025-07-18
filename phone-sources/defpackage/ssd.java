package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ssd {
    public final double a;
    public final double b;
    public final double c;
    public final int d;

    public ssd(int i) {
        this.d = i;
        int i2 = sry.b;
        ssl sslVar = ssl.a;
        double dC = srz.c((i >> 16) & 255);
        double dC2 = srz.c((i >> 8) & 255);
        double dC3 = srz.c(i & 255);
        double[][] dArr = sry.a;
        double[] dArr2 = dArr[0];
        double d = (0.41233895d * dC) + (0.35762064d * dC2) + (0.18051042d * dC3);
        double d2 = dArr2[0] * d;
        double d3 = (0.2126d * dC) + (0.7152d * dC2) + (0.0722d * dC3);
        double d4 = dArr2[1] * d3;
        double d5 = (dC * 0.01932141d) + (dC2 * 0.11916382d) + (dC3 * 0.95034478d);
        double d6 = dArr2[2] * d5;
        double[] dArr3 = dArr[1];
        double d7 = dArr3[0] * d;
        double d8 = dArr3[1] * d3;
        double d9 = dArr3[2] * d5;
        double[] dArr4 = dArr[2];
        double d10 = d * dArr4[0];
        double d11 = d3 * dArr4[1];
        double d12 = d5 * dArr4[2];
        double[] dArr5 = sslVar.g;
        double d13 = dArr5[0] * (d2 + d4 + d6);
        double d14 = dArr5[1] * (d7 + d8 + d9);
        double d15 = dArr5[2] * (d10 + d11 + d12);
        double dPow = Math.pow((sslVar.h * Math.abs(d13)) / 100.0d, 0.42d);
        double dPow2 = Math.pow((sslVar.h * Math.abs(d14)) / 100.0d, 0.42d);
        double dPow3 = Math.pow((sslVar.h * Math.abs(d15)) / 100.0d, 0.42d);
        double dSignum = ((Math.signum(d13) * 400.0d) * dPow) / (dPow + 27.13d);
        double dSignum2 = ((Math.signum(d14) * 400.0d) * dPow2) / (dPow2 + 27.13d);
        double dSignum3 = ((Math.signum(d15) * 400.0d) * dPow3) / (dPow3 + 27.13d);
        double d16 = (((dSignum * 11.0d) + ((-12.0d) * dSignum2)) + dSignum3) / 11.0d;
        double d17 = ((dSignum + dSignum2) - (dSignum3 + dSignum3)) / 9.0d;
        double degrees = Math.toDegrees(Math.atan2(d17, d16));
        if (degrees < 0.0d) {
            degrees += 360.0d;
        } else if (degrees >= 360.0d) {
            degrees -= 360.0d;
        }
        double d18 = dSignum2 * 20.0d;
        double radians = Math.toRadians(degrees);
        double dPow4 = Math.pow((((((40.0d * dSignum) + d18) + dSignum3) / 20.0d) * sslVar.c) / sslVar.b, sslVar.j * sslVar.e) * 100.0d;
        double d19 = sslVar.e;
        double d20 = dPow4 / 100.0d;
        Math.sqrt(d20);
        double d21 = sslVar.b;
        double d22 = sslVar.i;
        double dPow5 = Math.pow(1.64d - Math.pow(0.29d, sslVar.f), 0.73d) * Math.pow((((((Math.cos(Math.toRadians(degrees < 20.14d ? degrees + 360.0d : degrees) + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d) * sslVar.d) * Math.hypot(d16, d17)) / (((((dSignum * 20.0d) + d18) + (dSignum3 * 21.0d)) / 20.0d) + 0.305d), 0.9d);
        double dSqrt = Math.sqrt(d20) * dPow5;
        double d23 = sslVar.i * dSqrt;
        Math.sqrt((dPow5 * sslVar.e) / (sslVar.b + 4.0d));
        Math.log1p(d23 * 0.0228d);
        Math.cos(radians);
        Math.sin(radians);
        this.a = degrees;
        this.b = dSqrt;
        this.c = (srz.a(qtl.aM(new double[]{srz.c(srz.k(i)), srz.c(srz.j(i)), srz.c(srz.h(i))}, srz.a)[1] / 100.0d) * 116.0d) - 16.0d;
    }

    public static ssd a(double d, double d2, double d3) {
        int iG;
        double d4;
        double d5;
        double d6;
        int i;
        int iE;
        int iF;
        double[] dArr;
        double[] dArr2;
        double d7;
        double dSqrt;
        double[] dArrAM;
        int i2 = sse.e;
        if (d2 < 1.0E-4d || d3 < 1.0E-4d || d3 > 99.9999d) {
            int i3 = srz.i(srz.e(d3));
            iG = srz.g(i3, i3, i3);
        } else {
            double dF = sik.f(d);
            double dE = srz.e(d3);
            double dSqrt2 = Math.sqrt(dE) * 11.0d;
            ssl sslVar = ssl.a;
            double dPow = 1.0d / Math.pow(1.64d - Math.pow(0.29d, sslVar.f), 0.73d);
            double d8 = (dF / 180.0d) * 3.141592653589793d;
            double d9 = 2.0d;
            double dCos = (Math.cos(d8 + 2.0d) + 3.8d) * 0.25d * 3846.153846153846d * sslVar.d;
            double dSin = Math.sin(d8);
            double dCos2 = Math.cos(d8);
            int i4 = 0;
            while (true) {
                d4 = d9;
                if (i4 >= 5) {
                    d5 = d8;
                    d6 = dE;
                    i = 1;
                    break;
                }
                i = 1;
                double d10 = dSqrt2 / 100.0d;
                if (d2 == 0.0d || dSqrt2 == 0.0d) {
                    d7 = d10;
                    dSqrt = 0.0d;
                } else {
                    dSqrt = d2 / Math.sqrt(d10);
                    d7 = d10;
                }
                double d11 = dSqrt * dPow;
                d5 = d8;
                double d12 = sslVar.b;
                double d13 = (1.0d / sslVar.e) / sslVar.j;
                d6 = dE;
                double dPow2 = Math.pow(d11, 1.1111111111111112d);
                double dPow3 = (Math.pow(d7, d13) * d12) / sslVar.c;
                double d14 = (((0.305d + dPow3) * 23.0d) * dPow2) / (((23.0d * dCos) + ((dPow2 * 11.0d) * dCos2)) + ((dPow2 * 108.0d) * dSin));
                double d15 = d14 * dCos2;
                double d16 = d14 * dSin;
                double d17 = dPow3 * 460.0d;
                dArrAM = qtl.aM(new double[]{sse.c(((d17 + (451.0d * d15)) + (288.0d * d16)) / 1403.0d), sse.c(((d17 - (891.0d * d15)) - (261.0d * d16)) / 1403.0d), sse.c(((d17 - (d15 * 220.0d)) - (d16 * 6300.0d)) / 1403.0d)}, sse.b);
                double d18 = dArrAM[0];
                if (d18 < 0.0d) {
                    break;
                }
                double d19 = dArrAM[1];
                if (d19 < 0.0d) {
                    break;
                }
                double d20 = dArrAM[2];
                if (d20 < 0.0d) {
                    break;
                }
                double[] dArr3 = sse.c;
                double d21 = (dArr3[0] * d18) + (dArr3[1] * d19) + (dArr3[2] * d20);
                if (d21 <= 0.0d) {
                    break;
                }
                if (i4 == 4) {
                    break;
                }
                double d22 = d21 - d6;
                if (Math.abs(d22) < 0.002d) {
                    break;
                }
                dSqrt2 -= (d22 * dSqrt2) / (d21 + d21);
                i4++;
                d9 = d4;
                d8 = d5;
                dE = d6;
            }
            iG = (dArrAM[0] > 100.01d || dArrAM[1] > 100.01d || dArrAM[2] > 100.01d) ? 0 : srz.f(dArrAM);
            if (iG == 0) {
                double[] dArr4 = new double[3];
                double d23 = -1.0d;
                dArr4[0] = -1.0d;
                dArr4[i] = -1.0d;
                dArr4[2] = -1.0d;
                double[] dArr5 = dArr4;
                boolean z = false;
                int i5 = 0;
                double d24 = 0.0d;
                double d25 = 0.0d;
                int i6 = i;
                while (i5 < 12) {
                    double[] dArr6 = sse.c;
                    double d26 = dArr6[0];
                    double d27 = dArr6[i];
                    double d28 = dArr6[2];
                    int i7 = i5 % 4;
                    double d29 = i5 % 2 == 0 ? 0.0d : 100.0d;
                    double d30 = d23;
                    double d31 = i7 <= i ? 0.0d : 100.0d;
                    if (i5 < 4) {
                        double d32 = ((d6 - (d27 * d31)) - (d28 * d29)) / d26;
                        dArr = sse.h(d32) ? new double[]{d32, d31, d29} : new double[]{d30, d30, d30};
                    } else if (i5 < 8) {
                        double d33 = ((d6 - (d26 * d29)) - (d28 * d31)) / d27;
                        if (sse.h(d33)) {
                            dArr2 = new double[]{d29, d33, d31};
                            dArr = dArr2;
                        } else {
                            dArr = new double[]{d30, d30, d30};
                        }
                    } else {
                        double d34 = ((d6 - (d26 * d31)) - (d27 * d29)) / d28;
                        if (sse.h(d34)) {
                            dArr2 = new double[]{d31, d29, d34};
                            dArr = dArr2;
                        } else {
                            dArr = new double[]{d30, d30, d30};
                        }
                    }
                    if (dArr[0] >= 0.0d) {
                        double dB = sse.b(dArr);
                        if (z) {
                            if (i6 != 0 || sse.g(d25, dB, d24)) {
                                double d35 = dB;
                                double d36 = d25;
                                double d37 = d5;
                                d25 = d36;
                                d5 = d37;
                                double d38 = d35;
                                if (sse.g(d36, d37, d35)) {
                                    d24 = d38;
                                    dArr5 = dArr;
                                } else {
                                    d25 = d38;
                                    dArr4 = dArr;
                                }
                            }
                            i6 = 0;
                        } else {
                            d24 = dB;
                            d25 = d24;
                            dArr4 = dArr;
                            dArr5 = dArr4;
                        }
                        z = true;
                    }
                    i5++;
                    d23 = d30;
                    i = 1;
                }
                double[][] dArr7 = {dArr4, dArr5};
                double[] dArr8 = dArr7[0];
                double dB2 = sse.b(dArr8);
                double[] dArr9 = dArr7[1];
                for (int i8 = 0; i8 < 3; i8++) {
                    double d39 = dArr8[i8];
                    double d40 = dArr9[i8];
                    if (d39 != d40) {
                        if (d39 < d40) {
                            iE = sse.f(qtl.aL(d39));
                            iF = sse.e(qtl.aL(dArr9[i8]));
                        } else {
                            iE = sse.e(qtl.aL(d39));
                            iF = sse.f(qtl.aL(dArr9[i8]));
                        }
                        int i9 = 0;
                        while (i9 < 8 && Math.abs(iF - iE) > 1) {
                            int iFloor = (int) Math.floor((iE + iF) / d4);
                            double d41 = sse.d[iFloor];
                            double d42 = dArr8[i8];
                            double d43 = d41 - d42;
                            double d44 = dArr9[i8] - d42;
                            double d45 = dArr8[0];
                            double d46 = d43 / d44;
                            double d47 = dArr8[1];
                            double d48 = dArr8[2];
                            double[] dArr10 = {d45 + ((dArr9[0] - d45) * d46), d47 + ((dArr9[1] - d47) * d46), d48 + ((dArr9[2] - d48) * d46)};
                            double dB3 = sse.b(dArr10);
                            double d49 = dB2;
                            boolean zG = sse.g(d49, d5, dB3);
                            double d50 = d49;
                            if (true == zG) {
                                iF = iFloor;
                            }
                            if (true != zG) {
                                iE = iFloor;
                            }
                            if (true == zG) {
                                dArr9 = dArr10;
                            }
                            if (true != zG) {
                                d50 = dB3;
                            }
                            if (true != zG) {
                                dArr8 = dArr10;
                            }
                            i9++;
                            dB2 = d50;
                        }
                        dB2 = dB2;
                    }
                }
                iG = srz.f(new double[]{(dArr8[0] + dArr9[0]) / d4, (dArr8[1] + dArr9[1]) / d4, (dArr8[2] + dArr9[2]) / d4});
            }
        }
        return new ssd(iG);
    }
}
