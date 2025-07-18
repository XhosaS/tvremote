package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ng {
    public final float a;
    public final float b;
    public float c;
    public float d;
    public final float e;
    public final float f;
    public final boolean g;
    public final float h;
    public final float i;
    private final float j;
    private final float k;
    private final float l;
    private final float m;
    private float n;
    private final float[] o;
    private final float p;
    private final float q;
    private final float r;

    public ng(int i, float f, float f2, float f3, float f4, float f5, float f6) {
        float[] fArr;
        this.a = f;
        this.b = f2;
        this.j = f3;
        this.k = f4;
        this.l = f5;
        this.m = f6;
        float f7 = f6 - f4;
        boolean z = false;
        boolean z2 = i == 1 || (i == 4 ? f7 > 0.0f : !(i != 5 || f7 >= 0.0f));
        float f8 = f5 - f3;
        float f9 = true != z2 ? 1.0f : -1.0f;
        this.r = f9;
        float f10 = 1.0f / (f2 - f);
        this.p = f10;
        float[] fArr2 = new float[101];
        this.o = fArr2;
        if (i == 3 || Math.abs(f8) < 0.001f || Math.abs(f7) < 0.001f) {
            float fHypot = (float) Math.hypot(f7, f8);
            this.n = fHypot;
            this.q = fHypot * f10;
            this.h = f8 * f10;
            this.i = f7 * f10;
            this.e = Float.NaN;
            this.f = Float.NaN;
            z = true;
        } else {
            this.e = f8 * f9;
            this.f = f7 * (-f9);
            this.h = z2 ? f5 : f3;
            this.i = z2 ? f4 : f6;
            float f11 = f5 - f3;
            float f12 = f4 - f6;
            float[] fArr3 = nh.a;
            float f13 = f12;
            int i2 = 1;
            float fHypot2 = 0.0f;
            float f14 = 0.0f;
            while (true) {
                double radians = (float) Math.toRadians((i2 * 90.0d) / 90.0d);
                float fSin = ((float) Math.sin(radians)) * f11;
                float fCos = ((float) Math.cos(radians)) * f12;
                double d = fSin - f14;
                fArr = fArr2;
                fHypot2 += (float) Math.hypot(d, fCos - f13);
                fArr3[i2] = fHypot2;
                if (i2 == 90) {
                    break;
                }
                i2++;
                f13 = fCos;
                fArr2 = fArr;
                f14 = fSin;
            }
            this.n = fHypot2;
            int i3 = 1;
            while (true) {
                fArr3[i3] = fArr3[i3] / fHypot2;
                if (i3 == 90) {
                    break;
                } else {
                    i3++;
                }
            }
            for (int i4 = 0; i4 < 101; i4++) {
                float f15 = i4 / 100.0f;
                int iBinarySearch = Arrays.binarySearch(fArr3, 0, 91, f15);
                if (iBinarySearch >= 0) {
                    fArr[i4] = iBinarySearch / 90.0f;
                } else if (iBinarySearch == -1) {
                    fArr[i4] = 0.0f;
                } else {
                    int i5 = -iBinarySearch;
                    int i6 = i5 - 1;
                    int i7 = i5 - 2;
                    float f16 = fArr3[i7];
                    fArr[i4] = (i7 + ((f15 - f16) / (fArr3[i6] - f16))) / 90.0f;
                }
            }
            this.q = this.n * this.p;
        }
        this.g = z;
    }

    public final float a() {
        float f = this.e * this.d;
        return f * this.r * (this.q / ((float) Math.hypot(f, (-this.f) * this.c)));
    }

    public final float b() {
        float f = this.e * this.d;
        float f2 = (-this.f) * this.c;
        return f2 * this.r * (this.q / ((float) Math.hypot(f, f2)));
    }

    public final float c(float f) {
        float f2 = this.l;
        float f3 = this.j;
        return f3 + ((f - this.a) * this.p * (f2 - f3));
    }

    public final float d(float f) {
        float f2 = this.m;
        float f3 = this.k;
        return f3 + ((f - this.a) * this.p * (f2 - f3));
    }

    public final void e(float f) {
        float f2 = (this.r == -1.0f ? this.b - f : f - this.a) * this.p;
        float f3 = 0.0f;
        if (f2 > 0.0f) {
            f3 = 1.0f;
            if (f2 < 1.0f) {
                float f4 = f2 * 100.0f;
                float[] fArr = this.o;
                int i = (int) f4;
                float f5 = fArr[i];
                f3 = f5 + ((f4 - i) * (fArr[i + 1] - f5));
            }
        }
        double d = f3 * 1.5707964f;
        this.c = (float) Math.sin(d);
        this.d = (float) Math.cos(d);
    }
}
