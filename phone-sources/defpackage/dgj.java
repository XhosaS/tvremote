package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dgj extends dgg {
    @Override // defpackage.dgg
    public final int a(String str, byte[] bArr, int i, int i2) {
        long j;
        char c;
        long j2;
        char c2;
        int i3;
        char cCharAt;
        int i4 = i2;
        int length = str.length();
        if (length <= i4) {
            long j3 = i;
            if (bArr.length - i4 >= i) {
                int i5 = 0;
                long j4 = j3;
                while (true) {
                    j = 1;
                    c = 128;
                    if (i5 >= length || (cCharAt = str.charAt(i5)) >= 128) {
                        break;
                    }
                    dgf.k(bArr, j4, (byte) cCharAt);
                    i5++;
                    j4 = 1 + j4;
                }
                if (i5 == length) {
                    return (int) j4;
                }
                while (i5 < length) {
                    long j5 = i4 + j3;
                    long j6 = j;
                    char cCharAt2 = str.charAt(i5);
                    if (cCharAt2 < c && j4 < j5) {
                        dgf.k(bArr, j4, (byte) cCharAt2);
                        j2 = j3;
                        j4 += j6;
                    } else if (cCharAt2 >= 2048 || j4 > j5 - 2) {
                        if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || j4 > j5 - 3) {
                            j2 = j3;
                            if (j4 > j5 - 4) {
                                if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i3 = i5 + 1) == length || !Character.isSurrogatePair(cCharAt2, str.charAt(i3)))) {
                                    throw new dgi(i5, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j4);
                            }
                            int i6 = i5 + 1;
                            if (i6 != length) {
                                char cCharAt3 = str.charAt(i6);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    dgf.k(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                                    c2 = 128;
                                    dgf.k(bArr, j4 + j6, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j7 = j4 + 3;
                                    dgf.k(bArr, j4 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j4 += 4;
                                    dgf.k(bArr, j7, (byte) ((codePoint & 63) | 128));
                                    i5 = i6;
                                } else {
                                    i5 = i6;
                                }
                            }
                            throw new dgi(i5 - 1, length);
                        }
                        dgf.k(bArr, j4, (byte) ((cCharAt2 >>> '\f') | 480));
                        long j8 = j4 + 2;
                        j2 = j3;
                        dgf.k(bArr, j4 + j6, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                        j4 += 3;
                        dgf.k(bArr, j8, (byte) ((cCharAt2 & '?') | 128));
                        c2 = 128;
                        i5++;
                        i4 = i2;
                        c = c2;
                        j = j6;
                        j3 = j2;
                    } else {
                        long j9 = j4 + j6;
                        dgf.k(bArr, j4, (byte) ((cCharAt2 >>> 6) | 960));
                        j4 += 2;
                        dgf.k(bArr, j9, (byte) ((cCharAt2 & '?') | c));
                        j2 = j3;
                    }
                    c2 = c;
                    i5++;
                    i4 = i2;
                    c = c2;
                    j = j6;
                    j3 = j2;
                }
                return (int) j4;
            }
        }
        throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length - 1) + " at index " + (i + i2));
    }

    @Override // defpackage.dgg
    public final String b(byte[] bArr, int i, int i2) throws der {
        Charset charset = dep.a;
        String str = new String(bArr, i, i2, charset);
        if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
            throw new der("Protocol message had invalid UTF-8.");
        }
        return str;
    }
}
