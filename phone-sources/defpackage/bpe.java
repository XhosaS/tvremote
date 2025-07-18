package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpe extends bov {
    public bpe() {
        super("Generic L*a*b*", 12884901890L, 15);
    }

    @Override // defpackage.bov
    public final float a(int i) {
        return i == 0 ? 100.0f : 128.0f;
    }

    @Override // defpackage.bov
    public final float b(int i) {
        return i == 0 ? 0.0f : -128.0f;
    }

    @Override // defpackage.bov
    public final float c(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 100.0f) {
            f = 100.0f;
        }
        if (f3 < -128.0f) {
            f3 = -128.0f;
        }
        if (f3 > 128.0f) {
            f3 = 128.0f;
        }
        float f4 = ((f + 16.0f) / 116.0f) - (f3 * 0.005f);
        float f5 = f4 > 0.20689656f ? f4 * f4 * f4 : 0.12841855f * (f4 - 0.13793103f);
        bpk bpkVar = bpd.a;
        return f5 * bpd.e[2];
    }

    @Override // defpackage.bov
    public final long d(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 100.0f) {
            f = 100.0f;
        }
        if (f2 < -128.0f) {
            f2 = -128.0f;
        }
        if (f2 > 128.0f) {
            f2 = 128.0f;
        }
        float f4 = (f + 16.0f) / 116.0f;
        float f5 = (f2 * 0.002f) + f4;
        float f6 = f5 > 0.20689656f ? f5 * f5 * f5 : (f5 - 0.13793103f) * 0.12841855f;
        float f7 = f4 > 0.20689656f ? f4 * f4 * f4 : (f4 - 0.13793103f) * 0.12841855f;
        bpk bpkVar = bpd.a;
        float f8 = f6 * bpd.e[0];
        return (Float.floatToRawIntBits(f7 * r5[1]) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32);
    }

    @Override // defpackage.bov
    public final long e(float f, float f2, float f3, float f4, bov bovVar) {
        bpk bpkVar = bpd.a;
        float[] fArr = bpd.e;
        float f5 = f / fArr[0];
        float f6 = f2 / fArr[1];
        float f7 = f3 / fArr[2];
        float fCbrt = f5 > 0.008856452f ? (float) Math.cbrt(f5) : (f5 * 7.787037f) + 0.13793103f;
        float fCbrt2 = f6 > 0.008856452f ? (float) Math.cbrt(f6) : (f6 * 7.787037f) + 0.13793103f;
        float f8 = 116.0f * fCbrt2;
        float f9 = fCbrt - fCbrt2;
        float fCbrt3 = fCbrt2 - (f7 > 0.008856452f ? (float) Math.cbrt(f7) : (f7 * 7.787037f) + 0.13793103f);
        float f10 = f8 - 16.0f;
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 100.0f) {
            f10 = 100.0f;
        }
        float f11 = f9 * 500.0f;
        if (f11 < -128.0f) {
            f11 = -128.0f;
        }
        if (f11 > 128.0f) {
            f11 = 128.0f;
        }
        float f12 = fCbrt3 * 200.0f;
        float f13 = f12 >= -128.0f ? f12 : -128.0f;
        return bny.k(f10, f11, f13 <= 128.0f ? f13 : 128.0f, f4, bovVar);
    }
}
