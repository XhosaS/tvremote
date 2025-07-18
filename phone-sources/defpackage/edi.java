package defpackage;

import com.google.common.collect.ImmutableSet;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class edi {
    private static final char[] d = {'\r', '\n'};
    private static final char[] e = {'\n'};
    private static final ImmutableSet f = ImmutableSet.of(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    public byte[] a;
    public int b;
    public int c;

    public edi(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
    }

    private final char M(ByteOrder byteOrder, int i) {
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.a;
            int i2 = this.b + i;
            return sfy.af(bArr[i2], bArr[i2 + 1]);
        }
        byte[] bArr2 = this.a;
        int i3 = this.b + i;
        return sfy.af(bArr2[i3 + 1], bArr2[i3]);
    }

    private final char N(Charset charset, char[] cArr) {
        int iQ;
        if (a() >= P(charset) && (iQ = Q(charset)) != 0) {
            long j = iQ >>> 8;
            sij.r(true, "out of range: %s", j);
            int i = (int) j;
            if (!Character.isSupplementaryCodePoint(i)) {
                long j2 = i;
                char c = (char) j2;
                sij.r(((long) c) == j2, "Out of range: %s", j2);
                for (char c2 : cArr) {
                    if (c2 == c) {
                        this.b += sfy.W(iQ & 255);
                        return c;
                    }
                }
            }
        }
        return (char) 0;
    }

    private static int O(int i, int i2, int i3, int i4) {
        return sfy.Z((byte) 0, sfy.Q(((i & 7) << 2) | ((i2 & 48) >> 4)), sfy.Q(((i3 & 60) >> 2) | ((i2 & 15) << 4)), sfy.Q((i4 & 63) | ((i3 & 3) << 6)));
    }

    private static int P(Charset charset) {
        eci.a(f.contains(charset), "Unsupported charset: ".concat(String.valueOf(String.valueOf(charset))));
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    private final int Q(Charset charset) {
        int codePoint;
        int i;
        int iR;
        eci.a(f.contains(charset), "Unsupported charset: ".concat(String.valueOf(String.valueOf(charset))));
        if (a() < P(charset)) {
            throw new IndexOutOfBoundsException("position=" + this.b + ", limit=" + this.c);
        }
        int i2 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b = this.a[this.b];
            if ((b & 128) == 0) {
                codePoint = sfy.R(b);
                return (codePoint << 8) | i2;
            }
            return 0;
        }
        if (charset.equals(StandardCharsets.UTF_8)) {
            byte b2 = this.a[this.b];
            if ((b2 & 128) == 0) {
                i = 1;
            } else if ((b2 & 224) == 192 && a() >= 2 && R(this.a[this.b + 1])) {
                i = 2;
            } else {
                if ((this.a[this.b] & 240) == 224 && a() >= 3) {
                    byte[] bArr = this.a;
                    int i3 = this.b;
                    if (R(bArr[i3 + 1]) && R(bArr[i3 + 2])) {
                        i = 3;
                    }
                }
                if ((this.a[this.b] & 248) == 240 && a() >= 4) {
                    byte[] bArr2 = this.a;
                    int i4 = this.b;
                    if (R(bArr2[i4 + 1]) && R(bArr2[i4 + 2]) && R(bArr2[i4 + 3])) {
                        i = 4;
                    }
                }
                i = 0;
            }
            if (i == 1) {
                iR = sfy.R(this.a[this.b]);
            } else if (i == 2) {
                byte[] bArr3 = this.a;
                int i5 = this.b;
                iR = O(0, 0, bArr3[i5], bArr3[i5 + 1]);
            } else {
                if (i != 3) {
                    if (i == 4) {
                        byte[] bArr4 = this.a;
                        int i6 = this.b;
                        iR = O(bArr4[i6], bArr4[i6 + 1], bArr4[i6 + 2], bArr4[i6 + 3]);
                    }
                    return 0;
                }
                byte[] bArr5 = this.a;
                int i7 = this.b;
                iR = O(0, bArr5[i7] & 15, bArr5[i7 + 1], bArr5[i7 + 2]);
            }
            i2 = i;
            codePoint = iR;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char cM = M(byteOrder, 0);
            if (!Character.isHighSurrogate(cM) || a() < 4) {
                codePoint = cM;
                i2 = 2;
            } else {
                codePoint = Character.toCodePoint(cM, M(byteOrder, 2));
                i2 = 4;
            }
        }
        return (codePoint << 8) | i2;
    }

    private static boolean R(byte b) {
        return (b & 192) == 128;
    }

    public final Charset A() {
        if (a() >= 3) {
            byte[] bArr = this.a;
            int i = this.b;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.b = i + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.a;
        int i2 = this.b;
        byte b = bArr2[i2];
        if (b == -2) {
            if (bArr2[i2 + 1] != -1) {
                return null;
            }
            this.b = i2 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.b = i2 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final short B() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return (short) (((bArr[i2] & 255) << 8) | i3);
    }

    public final short C() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return (short) ((bArr[i2] & 255) | (i3 << 8));
    }

    public final void D(int i) {
        if (i > b()) {
            this.a = Arrays.copyOf(this.a, i);
        }
    }

    public final void E(edh edhVar, int i) {
        F((byte[]) edhVar.c, 0, i);
        edhVar.l(0);
    }

    public final void F(byte[] bArr, int i, int i2) {
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public final void G(int i) {
        I(b() < i ? new byte[i] : this.a, i);
    }

    public final void H(byte[] bArr) {
        I(bArr, bArr.length);
    }

    public final void I(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
        this.b = 0;
    }

    public final void J(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.a.length) {
            z = true;
        }
        a.H(z);
        this.c = i;
    }

    public final void K(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.c) {
            z = true;
        }
        a.H(z);
        this.b = i;
    }

    public final void L(int i) {
        K(this.b + i);
    }

    public final int a() {
        return Math.max(this.c - this.b, 0);
    }

    public final int b() {
        return this.a.length;
    }

    public final int c(Charset charset) {
        if (Q(charset) != 0) {
            return sfy.W(r3 >>> 8);
        }
        return 1114112;
    }

    public final int d() {
        return this.a[this.b] & 255;
    }

    public final int e() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.b = i4;
        int i5 = bArr[i2] & 255;
        int i6 = i + 3;
        this.b = i6;
        int i7 = bArr[i4] & 255;
        this.b = i + 4;
        return (bArr[i6] & 255) | (i3 << 24) | (i5 << 16) | (i7 << 8);
    }

    public final int f() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.b = i4;
        int i5 = bArr[i2] & 255;
        int i6 = i + 3;
        this.b = i6;
        int i7 = bArr[i4] & 255;
        this.b = i + 4;
        return ((bArr[i6] & 255) << 24) | (i5 << 8) | i3 | (i7 << 16);
    }

    public final int g() {
        int iF = f();
        if (iF >= 0) {
            return iF;
        }
        throw new IllegalStateException(a.cf(iF, "Top bit not zero: "));
    }

    public final int h() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public final int i() {
        return (j() << 21) | (j() << 14) | (j() << 7) | j();
    }

    public final int j() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & 255;
    }

    public final int k() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        int i4 = bArr[i2] & 255;
        this.b = i + 4;
        return i4 | (i3 << 8);
    }

    public final int l() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.b = i4;
        int i5 = bArr[i2] & 255;
        this.b = i + 3;
        return (bArr[i4] & 255) | (i3 << 16) | (i5 << 8);
    }

    public final int m() {
        int iE = e();
        if (iE >= 0) {
            return iE;
        }
        throw new IllegalStateException(a.cf(iE, "Top bit not zero: "));
    }

    public final int n() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return (bArr[i2] & 255) | (i3 << 8);
    }

    public final long o() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.b = i3;
        long j2 = bArr[i2];
        int i4 = i + 3;
        this.b = i4;
        long j3 = bArr[i3];
        int i5 = i + 4;
        this.b = i5;
        long j4 = bArr[i4];
        int i6 = i + 5;
        this.b = i6;
        long j5 = bArr[i5];
        int i7 = i + 6;
        this.b = i7;
        long j6 = bArr[i6];
        this.b = i + 7;
        long j7 = bArr[i7];
        this.b = i + 8;
        return ((bArr[r3] & 255) << 56) | (255 & j) | ((j2 & 255) << 8) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | ((j6 & 255) << 40) | ((j7 & 255) << 48);
    }

    public final long p() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.b = i3;
        long j2 = bArr[i2];
        this.b = i + 3;
        long j3 = bArr[i3];
        this.b = i + 4;
        return ((bArr[r2] & 255) << 24) | (j & 255) | ((j2 & 255) << 8) | ((j3 & 255) << 16);
    }

    public final long q() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.b = i3;
        long j2 = bArr[i2];
        int i4 = i + 3;
        this.b = i4;
        long j3 = bArr[i3];
        int i5 = i + 4;
        this.b = i5;
        long j4 = bArr[i4];
        int i6 = i + 5;
        this.b = i6;
        long j5 = bArr[i5];
        int i7 = i + 6;
        this.b = i7;
        long j6 = bArr[i6];
        this.b = i + 7;
        long j7 = bArr[i7];
        this.b = i + 8;
        return (bArr[r3] & 255) | ((j & 255) << 56) | ((j2 & 255) << 48) | ((j3 & 255) << 40) | ((j4 & 255) << 32) | ((j5 & 255) << 24) | ((j6 & 255) << 16) | ((j7 & 255) << 8);
    }

    public final long r() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.b = i3;
        long j2 = bArr[i2];
        this.b = i + 3;
        long j3 = bArr[i3];
        this.b = i + 4;
        return (bArr[r2] & 255) | ((j & 255) << 24) | ((j2 & 255) << 16) | ((j3 & 255) << 8);
    }

    public final long s() {
        long jQ = q();
        if (jQ >= 0) {
            return jQ;
        }
        throw new IllegalStateException(a.cs(jQ, "Top bit not zero: "));
    }

    public final long t() {
        int i;
        int i2;
        long j = this.a[this.b];
        int i3 = 7;
        while (true) {
            i = 0;
            if (i3 < 0) {
                break;
            }
            if (((1 << i3) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= r7 - 1;
                i = 7 - i3;
            } else if (i3 == 7) {
                i = 1;
            }
        }
        if (i == 0) {
            throw new NumberFormatException(a.cs(j, "Invalid UTF-8 sequence first byte: "));
        }
        for (i2 = 1; i2 < i; i2++) {
            if ((this.a[this.b + i2] & 192) != 128) {
                throw new NumberFormatException(a.cs(j, "Invalid UTF-8 sequence continuation byte: "));
            }
            j = (j << 6) | (r2 & 63);
        }
        this.b += i;
        return j;
    }

    public final String u() {
        return v(StandardCharsets.UTF_8);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String v(java.nio.charset.Charset r5) {
        /*
            r4 = this;
            com.google.common.collect.ImmutableSet r0 = defpackage.edi.f
            boolean r0 = r0.contains(r5)
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Unsupported charset: "
            java.lang.String r1 = r2.concat(r1)
            defpackage.eci.a(r0, r1)
            int r0 = r4.a()
            if (r0 != 0) goto L1f
            r5 = 0
            return r5
        L1f:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.US_ASCII
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L2a
            r4.A()
        L2a:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            boolean r0 = r5.equals(r0)
            r1 = 1
            if (r0 != 0) goto L68
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.US_ASCII
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L3c
            goto L68
        L3c:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16
            boolean r0 = r5.equals(r0)
            r1 = 2
            if (r0 != 0) goto L68
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16LE
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L68
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16BE
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L56
            goto L68
        L56:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r5 = r2.concat(r5)
            r0.<init>(r5)
            throw r0
        L68:
            int r0 = r4.b
        L6a:
            int r2 = r4.c
            int r3 = r1 + (-1)
            int r3 = r2 - r3
            if (r0 >= r3) goto Lc7
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L82
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.US_ASCII
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L8c
        L82:
            byte[] r2 = r4.a
            r2 = r2[r0]
            boolean r2 = defpackage.edt.am(r2)
            if (r2 != 0) goto Lc8
        L8c:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L9c
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16BE
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto Lac
        L9c:
            byte[] r2 = r4.a
            r3 = r2[r0]
            if (r3 != 0) goto Lac
            int r3 = r0 + 1
            r2 = r2[r3]
            boolean r2 = defpackage.edt.am(r2)
            if (r2 != 0) goto Lc8
        Lac:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16LE
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto Lc5
            int r2 = r0 + 1
            byte[] r3 = r4.a
            r2 = r3[r2]
            if (r2 != 0) goto Lc5
            r2 = r3[r0]
            boolean r2 = defpackage.edt.am(r2)
            if (r2 == 0) goto Lc5
            goto Lc8
        Lc5:
            int r0 = r0 + r1
            goto L6a
        Lc7:
            r0 = r2
        Lc8:
            int r1 = r4.b
            int r0 = r0 - r1
            java.lang.String r0 = r4.z(r0, r5)
            int r1 = r4.b
            int r2 = r4.c
            if (r1 == r2) goto Le4
            char[] r1 = defpackage.edi.d
            char r1 = r4.N(r5, r1)
            r2 = 13
            if (r1 != r2) goto Le4
            char[] r1 = defpackage.edi.e
            r4.N(r5, r1)
        Le4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.edi.v(java.nio.charset.Charset):java.lang.String");
    }

    public final String w() {
        if (a() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && this.a[i] != 0) {
            i++;
        }
        byte[] bArr = this.a;
        int i2 = this.b;
        String strT = edt.T(bArr, i2, i - i2);
        this.b = i;
        if (i >= this.c) {
            return strT;
        }
        this.b = i + 1;
        return strT;
    }

    public final String x(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.b;
        int i3 = (i2 + i) - 1;
        String strT = edt.T(this.a, i2, (i3 >= this.c || this.a[i3] != 0) ? i : i - 1);
        this.b += i;
        return strT;
    }

    public final String y(int i) {
        return z(i, StandardCharsets.UTF_8);
    }

    public final String z(int i, Charset charset) {
        byte[] bArr = this.a;
        int i2 = this.b;
        String str = new String(bArr, i2, i, charset);
        this.b = i2 + i;
        return str;
    }

    public edi() {
        this.a = edt.b;
    }

    public edi(int i) {
        this.a = new byte[i];
        this.c = i;
    }

    public edi(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }
}
