package defpackage;

import java.math.RoundingMode;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ztc {
    public static long a(long j, long j2) {
        long j3 = j + j2;
        ztd.a(((j ^ j2) < 0) | ((j ^ j3) >= 0), "checkedAdd", j, j2);
        return j3;
    }

    public static long b(long j, long j2) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j2);
        long j3 = j * j2;
        if (iNumberOfLeadingZeros > 65) {
            return j3;
        }
        ztd.a(iNumberOfLeadingZeros >= 64, "checkedMultiply", j, j2);
        ztd.a(j == 0 || j3 / j == j2, "checkedMultiply", j, j2);
        return j3;
    }

    public static long c(long j, long j2) {
        long j3 = j - j2;
        ztd.a(((j ^ j2) >= 0) | ((j ^ j3) >= 0), "checkedSubtract", j, j2);
        return j3;
    }

    public static long d(long j, long j2, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j3 = j / j2;
        long j4 = j - (j2 * j3);
        if (j4 == 0) {
            return j3;
        }
        int i = ((int) ((j ^ j2) >> 63)) | 1;
        switch (ztb.a[roundingMode.ordinal()]) {
            case 1:
                ztd.b(false);
                return j3;
            case 2:
                return j3;
            case 3:
                if (i >= 0) {
                    return j3;
                }
                break;
            case 4:
                break;
            case 5:
                if (i <= 0) {
                    return j3;
                }
                break;
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j4);
                long jAbs2 = jAbs - (Math.abs(j2) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j3) == 0)) {
                        return j3;
                    }
                } else if (jAbs2 <= 0) {
                    return j3;
                }
                break;
            default:
                throw new AssertionError();
        }
        return j3 + i;
    }
}
