package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cwp {
    public static int a(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((i >> 24) & 255) / 255.0f;
        float f3 = ((((i2 >> 24) & 255) / 255.0f) - f2) * f;
        float fB = b(((i >> 16) & 255) / 255.0f);
        float fB2 = b(((i >> 8) & 255) / 255.0f);
        float fB3 = b((i & 255) / 255.0f);
        float fB4 = fB + ((b(((i2 >> 16) & 255) / 255.0f) - fB) * f);
        float fB5 = fB2 + ((b(((i2 >> 8) & 255) / 255.0f) - fB2) * f);
        float fB6 = fB3 + (f * (b((i2 & 255) / 255.0f) - fB3));
        float fC = c(fB4) * 255.0f;
        float fC2 = c(fB5) * 255.0f;
        float fC3 = c(fB6) * 255.0f;
        return (Math.round(fC) << 16) | (Math.round((f2 + f3) * 255.0f) << 24) | (Math.round(fC2) << 8) | Math.round(fC3);
    }

    private static float b(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    private static float c(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }
}
