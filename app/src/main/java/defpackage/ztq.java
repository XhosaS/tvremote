package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ztq {
    public static int a(long j, long j2) {
        return Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
    }

    public static long b(String str) {
        str.getClass();
        if (str.length() == 0) {
            throw new NumberFormatException("empty string");
        }
        int i = ztp.c[16] - 1;
        long j = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            int iDigit = Character.digit(str.charAt(i2), 16);
            if (iDigit == -1) {
                throw new NumberFormatException(str);
            }
            if (i2 > i) {
                if (j >= 0) {
                    long j2 = ztp.a[16];
                    if (j >= j2 && (j > j2 || iDigit > ztp.b[16])) {
                    }
                }
                throw new NumberFormatException("Too large for unsigned long: ".concat(str));
            }
            j = (j * 16) + iDigit;
        }
        return j;
    }
}
