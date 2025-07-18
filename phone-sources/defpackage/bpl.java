package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpl extends bov {
    public bpl() {
        super("Generic XYZ", 12884901889L, 14);
    }

    @Override // defpackage.bov
    public final float a(int i) {
        return 2.0f;
    }

    @Override // defpackage.bov
    public final float b(int i) {
        return -2.0f;
    }

    @Override // defpackage.bov
    public final float c(float f, float f2, float f3) {
        if (f3 < -2.0f) {
            f3 = -2.0f;
        }
        if (f3 > 2.0f) {
            return 2.0f;
        }
        return f3;
    }

    @Override // defpackage.bov
    public final long d(float f, float f2, float f3) {
        if (f < -2.0f) {
            f = -2.0f;
        }
        if (f > 2.0f) {
            f = 2.0f;
        }
        long jFloatToRawIntBits = Float.floatToRawIntBits(f);
        if (f2 < -2.0f) {
            f2 = -2.0f;
        }
        return (Float.floatToRawIntBits(f2 <= 2.0f ? f2 : 2.0f) & 4294967295L) | (jFloatToRawIntBits << 32);
    }

    @Override // defpackage.bov
    public final long e(float f, float f2, float f3, float f4, bov bovVar) {
        if (f < -2.0f) {
            f = -2.0f;
        }
        if (f > 2.0f) {
            f = 2.0f;
        }
        if (f2 < -2.0f) {
            f2 = -2.0f;
        }
        if (f2 > 2.0f) {
            f2 = 2.0f;
        }
        if (f3 < -2.0f) {
            f3 = -2.0f;
        }
        return bny.k(f, f2, f3 <= 2.0f ? f3 : 2.0f, f4, bovVar);
    }
}
