package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ky {
    public static final /* synthetic */ int a = 0;
    private static final float[] b = new float[101];
    private static final float[] c = new float[101];

    static {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        int i = 0;
        float f11 = 0.0f;
        float f12 = 0.0f;
        while (true) {
            float[] fArr = b;
            float[] fArr2 = c;
            float f13 = 1.0f;
            if (i >= 100) {
                fArr2[100] = 1.0f;
                fArr[100] = 1.0f;
                return;
            }
            float f14 = i;
            float f15 = 1.0f;
            while (true) {
                f = f14 / 100.0f;
                f2 = ((f15 - f11) / 2.0f) + f11;
                f3 = f13 - f2;
                f4 = f2 * 3.0f * f3;
                f5 = f2 * f2 * f2;
                float f16 = (((f3 * 0.175f) + (f2 * 0.35000002f)) * f4) + f5;
                f6 = f13;
                if (Math.abs(f16 - f) < 1.0E-5d) {
                    break;
                }
                if (f16 > f) {
                    f15 = f2;
                } else {
                    f11 = f2;
                }
                f13 = f6;
            }
            fArr[i] = (f4 * ((f3 * 0.5f) + f2)) + f5;
            float f17 = f6;
            while (true) {
                f7 = ((f17 - f12) / 2.0f) + f12;
                f8 = f6 - f7;
                f9 = f7 * 3.0f * f8;
                f10 = f7 * f7 * f7;
                float f18 = (((f8 * 0.5f) + f7) * f9) + f10;
                if (Math.abs(f18 - f) >= 1.0E-5d) {
                    if (f18 > f) {
                        f17 = f7;
                    } else {
                        f12 = f7;
                    }
                }
            }
            fArr2[i] = (f9 * ((f8 * 0.175f) + (f7 * 0.35000002f))) + f10;
            i++;
        }
    }

    public static final kx a(float f) {
        float f2 = 0.0f;
        float f3 = 1.0f;
        float fI = ykn.i(f, 0.0f, 1.0f);
        int i = (int) (fI * 100.0f);
        if (i < 100) {
            float f4 = i / 100.0f;
            int i2 = i + 1;
            float[] fArr = b;
            float f5 = fArr[i];
            float f6 = fI - f4;
            f2 = (fArr[i2] - f5) / ((i2 / 100.0f) - f4);
            f3 = f5 + (f6 * f2);
        }
        return new kx(f3, f2);
    }
}
