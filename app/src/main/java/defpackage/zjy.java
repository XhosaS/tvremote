package defpackage;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zjy extends zjh implements Serializable {
    public static final zjn a = new zjy(0);
    public static final zjn b = new zjy(zjr.a);
    private static final long serialVersionUID = 0;
    private final int c;
    private final boolean d = true;

    public zjy(int i) {
        this.c = i;
    }

    public static int d(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16) | (bArr[i + 3] << 24) | ((bArr[i + 1] & 255) << 8);
    }

    public static int e(int i, int i2) {
        return (Integer.rotateLeft(i ^ i2, 13) * 5) - 430675100;
    }

    public static int f(int i) {
        return Integer.rotateLeft(i * (-862048943), 15) * 461845907;
    }

    public static long g(char c) {
        int i = ((c >>> 6) & 63) | 128;
        return (i << 8) | (c >>> '\f') | 224 | (((c & '?') | 128) << 16);
    }

    public static long h(char c) {
        return (c >>> 6) | 192 | (((c & '?') | 128) << 8);
    }

    public static long i(int i) {
        return (((i & 63) | 128) << 24) | ((((i >>> 12) & 63) | 128) << 8) | (i >>> 18) | 240 | ((((i >>> 6) & 63) | 128) << 16);
    }

    public static zjm j(int i, int i2) {
        int i3 = zjm.b;
        int i4 = i ^ i2;
        int i5 = (i4 ^ (i4 >>> 16)) * (-2048144789);
        int i6 = (i5 ^ (i5 >>> 13)) * (-1028477387);
        return new zjl(i6 ^ (i6 >>> 16));
    }

    @Override // defpackage.zjh, defpackage.zjn
    public final zjm a(CharSequence charSequence, Charset charset) {
        long jG;
        if (!charset.equals(StandardCharsets.UTF_8)) {
            byte[] bytes = charSequence.toString().getBytes(charset);
            return b(bytes, bytes.length);
        }
        int length = charSequence.length();
        int iE = this.c;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i2 + 4;
            jG = 0;
            if (i4 > length) {
                break;
            }
            char cCharAt = charSequence.charAt(i2);
            char cCharAt2 = charSequence.charAt(i2 + 1);
            char cCharAt3 = charSequence.charAt(i2 + 2);
            char cCharAt4 = charSequence.charAt(i2 + 3);
            if (cCharAt >= 128 || cCharAt2 >= 128 || cCharAt3 >= 128 || cCharAt4 >= 128) {
                break;
            }
            iE = e(iE, f((cCharAt2 << '\b') | cCharAt | (cCharAt3 << 16) | (cCharAt4 << 24)));
            i3 += 4;
            i2 = i4;
        }
        while (i2 < length) {
            char cCharAt5 = charSequence.charAt(i2);
            if (cCharAt5 < 128) {
                jG |= cCharAt5 << i;
                i3++;
                i += 8;
            } else if (cCharAt5 < 2048) {
                jG |= h(cCharAt5) << i;
                i3 += 2;
                i += 16;
            } else if (cCharAt5 < 55296 || cCharAt5 > 57343) {
                jG |= g(cCharAt5) << i;
                i3 += 3;
                i += 24;
            } else {
                int iCodePointAt = Character.codePointAt(charSequence, i2);
                if (iCodePointAt == cCharAt5) {
                    byte[] bytes2 = charSequence.toString().getBytes(charset);
                    return b(bytes2, bytes2.length);
                }
                jG |= i(iCodePointAt) << i;
                i3 += 4;
                i += 32;
                i2++;
            }
            if (i >= 32) {
                iE = e(iE, f((int) jG));
                jG >>>= 32;
                i -= 32;
            }
            i2++;
        }
        return j(f((int) jG) ^ iE, i3);
    }

    @Override // defpackage.zjh
    public final zjm b(byte[] bArr, int i) {
        int i2 = 0;
        yqw.K(0, i, bArr.length);
        int iE = this.c;
        int i3 = 0;
        while (true) {
            int i4 = i3 + 4;
            if (i4 > i) {
                break;
            }
            iE = e(iE, f(d(bArr, i3)));
            i3 = i4;
        }
        int i5 = i3;
        int i6 = 0;
        while (i5 < i) {
            i2 ^= (bArr[i5] & 255) << i6;
            i5++;
            i6 += 8;
        }
        return j(f(i2) ^ iE, i);
    }

    @Override // defpackage.zjn
    public final zjo c() {
        return new zjx(this.c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zjy)) {
            return false;
        }
        zjy zjyVar = (zjy) obj;
        if (this.c != zjyVar.c) {
            return false;
        }
        boolean z = zjyVar.d;
        return true;
    }

    public final int hashCode() {
        return getClass().hashCode() ^ this.c;
    }

    public final String toString() {
        return "Hashing.murmur3_32(" + this.c + ")";
    }
}
