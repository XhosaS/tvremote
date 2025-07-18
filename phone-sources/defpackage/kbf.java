package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kbf {
    public static final np a;
    public static final long b;
    public static final long c;
    public static final long d;

    static {
        long j = ynm.a;
        a = fh.i((int) ynm.k(ylh.o(800, yno.c)), nm.a, 2);
        b = (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
        long j2 = bnq.a;
        c = bny.k(bnq.d(j2), bnq.c(j2), bnq.b(j2), 0.6f, bnq.f(j2));
        long j3 = bnq.a;
        d = bny.k(bnq.d(j3), bnq.c(j3), bnq.b(j3), 0.0f, bnq.f(j3));
    }

    public static final bnn a(long j) {
        yfw[] yfwVarArr = {new yfw(Float.valueOf(0.0f), new bnq(bny.k(bnq.d(j), bnq.c(j), bnq.b(j), 0.0f, bnq.f(j)))), new yfw(Float.valueOf(1.0f), new bnq(bny.k(bnq.d(j), bnq.c(j), bnq.b(j), 1.0f, bnq.f(j))))};
        return bny.t((yfw[]) Arrays.copyOf(yfwVarArr, yfwVarArr.length), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & 4294967295L));
    }
}
