package defpackage;

import android.graphics.Color;

/* compiled from: PG */
/* loaded from: classes.dex */
public class abx {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public abx(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    static abx b(int i) {
        acq acqVar = acq.a;
        int i2 = aby.e;
        float fA = aby.a(Color.red(i));
        float fA2 = aby.a(Color.green(i));
        float fA3 = aby.a(Color.blue(i));
        float[][] fArr = aby.d;
        float[] fArr2 = fArr[0];
        float f = (fArr2[0] * fA) + (fArr2[1] * fA2);
        float[] fArr3 = fArr[1];
        float f2 = (fArr3[0] * fA) + (fArr3[1] * fA2);
        float[] fArr4 = fArr[2];
        float f3 = (fA * fArr4[0]) + (fA2 * fArr4[1]) + (fA3 * fArr4[2]);
        float[] fArr5 = {f + (fArr2[2] * fA3), f2 + (fArr3[2] * fA3), f3};
        float[][] fArr6 = aby.a;
        float f4 = fArr5[0];
        float[] fArr7 = fArr6[0];
        float f5 = fArr7[0] * f4;
        float f6 = fArr5[1];
        float f7 = fArr7[1] * f6;
        float f8 = fArr7[2] * f3;
        float[] fArr8 = fArr6[1];
        float f9 = fArr8[0] * f4;
        float f10 = fArr8[1] * f6;
        float f11 = fArr8[2] * f3;
        float[] fArr9 = fArr6[2];
        float f12 = f4 * fArr9[0];
        float f13 = f6 * fArr9[1];
        float f14 = f3 * fArr9[2];
        float[] fArr10 = acqVar.g;
        float f15 = fArr10[0] * (f5 + f7 + f8);
        float f16 = fArr10[1] * (f9 + f10 + f11);
        float f17 = fArr10[2] * (f12 + f13 + f14);
        float f18 = acqVar.h;
        float fPow = (float) Math.pow((Math.abs(f15) * f18) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow((Math.abs(f16) * f18) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow((f18 * Math.abs(f17)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f15) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f16) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f17) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d = fSignum3;
        float fAtan2 = (((float) Math.atan2(((float) ((fSignum + fSignum2) - (d + d))) / 9.0f, ((float) (((fSignum * 11.0d) + (fSignum2 * (-12.0d))) + d)) / 11.0f)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f19 = fSignum2 * 20.0f;
        float f20 = (3.1415927f * fAtan2) / 180.0f;
        float f21 = ((((40.0f * fSignum) + f19) + fSignum3) / 20.0f) * acqVar.c;
        float f22 = acqVar.b;
        float f23 = acqVar.e;
        float fPow4 = ((float) Math.pow(f21 / f22, acqVar.j * 0.69f)) * 100.0f;
        float fSqrt = (float) Math.sqrt(fPow4 / 100.0f);
        float f24 = acqVar.i;
        float f25 = fSqrt * 5.7971015f * (f22 + 4.0f) * f24;
        float fSqrt2 = ((float) Math.sqrt(fPow4 / 100.0d)) * ((float) Math.pow(1.64d - Math.pow(0.29d, acqVar.f), 0.73d)) * ((float) Math.pow(((((((float) (Math.cos((((((double) fAtan2) < 20.14d ? fAtan2 + 360.0f : fAtan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * acqVar.d) * ((float) Math.sqrt((r3 * r3) + (r5 * r5)))) / (((((fSignum * 20.0f) + f19) + (fSignum3 * 21.0f)) / 20.0f) + 0.305f), 0.9d));
        float fSqrt3 = (float) Math.sqrt((r0 * 0.69f) / r6);
        double d2 = f20;
        float fLog = ((float) Math.log((0.0228f * r10) + 1.0f)) * 43.85965f;
        float fCos = (float) Math.cos(d2);
        float fSin = (float) Math.sin(d2);
        fArr5[0] = fAtan2;
        fArr5[1] = fSqrt2;
        float f26 = fLog * fSin;
        float[] fArr11 = {fPow4, f25, f24 * fSqrt2, fSqrt3 * 50.0f, (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f), fCos * fLog, f26};
        return new abx(fAtan2, fSqrt2, fArr11[0], fArr11[4], fArr11[5], f26);
    }

    public static abx c(float f, float f2, float f3, acq acqVar) {
        float f4 = acqVar.e;
        Math.sqrt(f / 100.0d);
        float f5 = acqVar.b + 4.0f;
        float f6 = acqVar.i * f2;
        Math.sqrt(((f2 / ((float) Math.sqrt(r0))) * 0.69f) / f5);
        double d = (3.1415927f * f3) / 180.0f;
        float fLog = ((float) Math.log((f6 * 0.0228d) + 1.0d)) * 43.85965f;
        return new abx(f3, f2, f, (1.7f * f) / ((0.007f * f) + 1.0f), fLog * ((float) Math.cos(d)), fLog * ((float) Math.sin(d)));
    }

    final int a(acq acqVar) {
        float f = this.b;
        float fSqrt = 0.0f;
        if (f != 0.0d) {
            double d = this.c;
            if (d != 0.0d) {
                fSqrt = f / ((float) Math.sqrt(d / 100.0d));
            }
        }
        float fPow = (float) Math.pow(fSqrt / Math.pow(1.64d - Math.pow(0.29d, acqVar.f), 0.73d), 1.1111111111111112d);
        double d2 = (this.a * 3.1415927f) / 180.0f;
        double dCos = Math.cos(2.0d + d2) + 3.8d;
        float f2 = acqVar.e;
        float fPow2 = acqVar.b * ((float) Math.pow(this.c / 100.0d, 1.4492753673265821d / acqVar.j));
        float f3 = ((float) dCos) * 0.25f * 3846.1538f * acqVar.d;
        float f4 = fPow2 / acqVar.c;
        float fSin = (float) Math.sin(d2);
        float fCos = (float) Math.cos(d2);
        float f5 = (((0.305f + f4) * 23.0f) * fPow) / (((f3 * 23.0f) + ((11.0f * fPow) * fCos)) + ((108.0f * fPow) * fSin));
        float f6 = fCos * f5;
        float f7 = f5 * fSin;
        float f8 = f4 * 460.0f;
        float fMax = (float) Math.max(0.0d, (Math.abs(r2) * 27.13d) / (400.0d - Math.abs(r2)));
        float f9 = 100.0f / acqVar.h;
        float fSignum = Math.signum((((451.0f * f6) + f8) + (288.0f * f7)) / 1403.0f) * f9;
        float fPow3 = (float) Math.pow(fMax, 2.380952380952381d);
        float fMax2 = (float) Math.max(0.0d, (Math.abs(r9) * 27.13d) / (400.0d - Math.abs(r9)));
        float fSignum2 = Math.signum(((f8 - (891.0f * f6)) - (261.0f * f7)) / 1403.0f) * f9;
        float fPow4 = (float) Math.pow(fMax2, 2.380952380952381d);
        float f10 = ((f8 - (f6 * 220.0f)) - (f7 * 6300.0f)) / 1403.0f;
        float fMax3 = (float) Math.max(0.0d, (Math.abs(f10) * 27.13d) / (400.0d - Math.abs(f10)));
        float fSignum3 = Math.signum(f10) * f9;
        float fPow5 = (float) Math.pow(fMax3, 2.380952380952381d);
        float[] fArr = acqVar.g;
        float f11 = (fSignum * fPow3) / fArr[0];
        float f12 = (fSignum2 * fPow4) / fArr[1];
        float f13 = (fSignum3 * fPow5) / fArr[2];
        float[][] fArr2 = aby.b;
        float[] fArr3 = fArr2[0];
        float f14 = fArr3[0] * f11;
        float f15 = fArr3[1] * f12;
        float f16 = fArr3[2] * f13;
        float[] fArr4 = fArr2[1];
        float f17 = fArr4[0] * f11;
        float f18 = fArr4[1] * f12;
        float f19 = fArr4[2] * f13;
        float[] fArr5 = fArr2[2];
        return acr.c(f14 + f15 + f16, f17 + f18 + f19, (f11 * fArr5[0]) + (f12 * fArr5[1]) + (f13 * fArr5[2]));
    }
}
