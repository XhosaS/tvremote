package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bum implements buo {
    private final /* synthetic */ int a;

    public bum(int i) {
        this.a = i;
    }

    @Override // defpackage.buo
    public final long a(long j, long j2) {
        int i = this.a;
        if (i == 0) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L));
            long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat2);
            int i2 = bwr.a;
            return (jFloatToRawIntBits2 & 4294967295L) | (jFloatToRawIntBits << 32);
        }
        if (i == 1) {
            float fMax = Math.max(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fMax);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fMax);
            int i3 = bwr.a;
            return (jFloatToRawIntBits3 << 32) | (jFloatToRawIntBits4 & 4294967295L);
        }
        if (i == 2) {
            float fI = bty.i(j, j2);
            long jFloatToRawIntBits5 = Float.floatToRawIntBits(fI);
            long jFloatToRawIntBits6 = Float.floatToRawIntBits(fI);
            int i4 = bwr.a;
            return (jFloatToRawIntBits5 << 32) | (jFloatToRawIntBits6 & 4294967295L);
        }
        if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            long jFloatToRawIntBits7 = Float.floatToRawIntBits(1.0f);
            long jFloatToRawIntBits8 = Float.floatToRawIntBits(1.0f);
            int i5 = bwr.a;
            return (jFloatToRawIntBits7 << 32) | (jFloatToRawIntBits8 & 4294967295L);
        }
        float fI2 = bty.i(j, j2);
        long jFloatToRawIntBits9 = Float.floatToRawIntBits(fI2);
        long jFloatToRawIntBits10 = Float.floatToRawIntBits(fI2);
        int i6 = bwr.a;
        return (jFloatToRawIntBits9 << 32) | (jFloatToRawIntBits10 & 4294967295L);
    }
}
