package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abpt {
    static final int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 31, -1, -1, 10, 11, 12, -1, 13, 14, 15, -1, 16, 17, 18, 19, 20, -1, 21, 22, 23, 24, 25, -1, 26, 27, 28, 29, 30, -1, -1, -1, -1, -1};
    private static final String[] b = {"/m/", "/g/", "/t/", "/x/", "/n/", "/p/", "/r/", "/s/"};

    public static long a(String str) {
        if (str.length() > 3) {
            if (str.charAt(0) == '/') {
                int i = 2;
                if (str.charAt(2) == '/') {
                    char cCharAt = str.charAt(1);
                    if (cCharAt == 'g') {
                        i = 1;
                    } else if (cCharAt == 'p') {
                        i = 5;
                    } else if (cCharAt != 't') {
                        if (cCharAt == 'x') {
                            i = 3;
                        } else if (cCharAt == 'm') {
                            i = 0;
                        } else {
                            if (cCharAt != 'n') {
                                throw new IllegalArgumentException("Invalid MID prefix: " + cCharAt);
                            }
                            i = 4;
                        }
                    }
                    String strSubstring = str.substring(3);
                    char cCharAt2 = strSubstring.charAt(0);
                    int[] iArr = a;
                    int i2 = iArr[cCharAt2];
                    int i3 = i2 >>> 3;
                    if (i3 != 0) {
                        throw new IllegalArgumentException(a.b(i3, "Invalid MID version: "));
                    }
                    int i4 = i2 & 7;
                    String strSubstring2 = strSubstring.substring(1);
                    if (strSubstring2.length() <= 13) {
                        long j = 0;
                        if (strSubstring2.length() != 13 || iArr[strSubstring2.charAt(0)] <= 15) {
                            for (int i5 = 0; i5 < strSubstring2.length(); i5++) {
                                int i6 = iArr[strSubstring2.charAt(i5)];
                                if (i6 < 0) {
                                    throw new IllegalArgumentException("Invalid munch character");
                                }
                                j = (j << 5) + i6;
                            }
                            long jF = f(i4, j);
                            if (c(jF) == i) {
                                return jF;
                            }
                            int i7 = (int) (jF >>> 62);
                            if (i7 != 0) {
                                throw new IllegalArgumentException(a.b(i7, "Invalid MID version: "));
                            }
                            throw new IllegalArgumentException("Inconsistent MID prefix: " + str + " (expected " + e(c(jF)) + ")");
                        }
                    }
                    throw new IllegalArgumentException("65-bit value");
                }
            }
        }
        if (str.startsWith("/guid/")) {
            return d(str.substring(6));
        }
        if (str.startsWith("#")) {
            return d(str.substring(1));
        }
        throw new IllegalArgumentException("Unknown ID format: ".concat(String.valueOf(str)));
    }

    public static boolean b(String str) {
        if (!str.startsWith("/guid") && !str.startsWith("#")) {
            try {
                a(str);
                return true;
            } catch (IllegalArgumentException unused) {
            }
        }
        return false;
    }

    private static final int c(long j) {
        return (int) ((j >>> 59) & 7);
    }

    private static long d(String str) {
        if (str.length() != 32) {
            throw new IllegalArgumentException("Invalid GUID length");
        }
        String strSubstring = str.substring(0, 16);
        String strSubstring2 = str.substring(16, 32);
        long jB = ztq.b(strSubstring);
        long jB2 = ztq.b(strSubstring2);
        long j = jB + 7925586850557696993L;
        if (j >= 8 || ((-17179869184L) & jB2) != Long.MIN_VALUE) {
            throw new IllegalArgumentException("Invalid GUID: ".concat(String.valueOf(str)));
        }
        return f((int) j, jB2 & 17179869183L);
    }

    private static final String e(int i) {
        boolean z = false;
        if (i >= 0 && i < 6) {
            z = true;
        }
        yqw.D(z, "Invalid graph ID: %i", i);
        return b[i];
    }

    private static final long f(int i, long j) {
        if (((-576460752303423488L) & j) == 0) {
            return j | (i << 59);
        }
        throw new IllegalArgumentException("MID exceeds max size 0x" + Long.toHexString(576460752303423487L) + " for namespace " + e(i) + ": 0x" + Long.toHexString(j));
    }
}
