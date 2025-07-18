package defpackage;

import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zxg {
    static {
        BigInteger.valueOf(0L);
        BigInteger.valueOf(1L);
        BigInteger.valueOf(2L);
        BigInteger.valueOf(4L);
    }

    public static int a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i < 0) {
            i = -i;
        }
        int i2 = 0;
        while (i > 0) {
            i >>>= 8;
            i2++;
        }
        return i2;
    }
}
