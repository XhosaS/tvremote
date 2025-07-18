package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zjj extends zjh {
    public static final ConcurrentMap a = new ConcurrentHashMap();
    private final byte[] b;
    private String c = null;

    public zjj(byte[] bArr) {
        this.b = bArr;
    }

    static void f(int i) {
        if (i > 4096) {
            throw new IllegalArgumentException("exceeded relative OID contents length limit");
        }
    }

    static void g(ByteArrayOutputStream byteArrayOutputStream, long j) {
        byte[] bArr = new byte[9];
        int i = 8;
        bArr[8] = (byte) (((int) j) & 127);
        while (j >= 128) {
            j >>= 7;
            i--;
            bArr[i] = (byte) (((int) j) | 128);
        }
        byteArrayOutputStream.write(bArr, i, 9 - i);
    }

    static void h(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int iBitLength = (bigInteger.bitLength() + 6) / 7;
        if (iBitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        int i = iBitLength - 1;
        byte[] bArr = new byte[iBitLength];
        for (int i2 = i; i2 >= 0; i2--) {
            bArr[i2] = (byte) (bigInteger.intValue() | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i] = (byte) (bArr[i] & Byte.MAX_VALUE);
        byteArrayOutputStream.write(bArr, 0, iBitLength);
    }

    static boolean i(byte[] bArr) {
        if (bArr.length <= 0) {
            return false;
        }
        boolean z = true;
        for (int i = 0; i < bArr.length; i++) {
            if (z && (bArr[i] & 255) == 128) {
                return false;
            }
            z = (bArr[i] & 128) == 0;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static boolean j(java.lang.String r8, int r9) {
        /*
            int r0 = r8.length()
            r1 = 0
            r2 = r1
        L6:
            int r3 = r0 + (-1)
            r4 = 48
            r5 = 1
            if (r3 < r9) goto L2d
            char r6 = r8.charAt(r3)
            r7 = 46
            if (r6 != r7) goto L22
            if (r2 == 0) goto L21
            if (r2 <= r5) goto L1f
            char r0 = r8.charAt(r0)
            if (r0 == r4) goto L21
        L1f:
            r2 = r1
            goto L2a
        L21:
            return r1
        L22:
            if (r6 < r4) goto L2c
            r0 = 57
            if (r6 > r0) goto L2c
            int r2 = r2 + 1
        L2a:
            r0 = r3
            goto L6
        L2c:
            return r1
        L2d:
            if (r2 == 0) goto L39
            if (r2 <= r5) goto L38
            char r8 = r8.charAt(r0)
            if (r8 != r4) goto L38
            goto L39
        L38:
            return r5
        L39:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zjj.j(java.lang.String, int):boolean");
    }

    @Override // defpackage.zjh
    public final int a(boolean z) {
        return zjf.b(z, this.b.length);
    }

    public final synchronized String b() {
        if (this.c == null) {
            byte[] bArr = this.b;
            StringBuffer stringBuffer = new StringBuffer();
            boolean z = true;
            long j = 0;
            BigInteger bigIntegerShiftLeft = null;
            for (int i = 0; i != bArr.length; i++) {
                byte b = bArr[i];
                long j2 = b & Byte.MAX_VALUE;
                int i2 = b & 128;
                if (j <= 72057594037927808L) {
                    long j3 = j + j2;
                    if (i2 == 0) {
                        if (!z) {
                            stringBuffer.append('.');
                        }
                        stringBuffer.append(j3);
                        z = false;
                        j = 0;
                    } else {
                        j = j3 << 7;
                    }
                } else {
                    if (bigIntegerShiftLeft == null) {
                        bigIntegerShiftLeft = BigInteger.valueOf(j);
                    }
                    BigInteger bigIntegerOr = bigIntegerShiftLeft.or(BigInteger.valueOf(j2));
                    if (i2 == 0) {
                        if (!z) {
                            stringBuffer.append('.');
                        }
                        stringBuffer.append(bigIntegerOr);
                        z = false;
                        j = 0;
                        bigIntegerShiftLeft = null;
                    } else {
                        bigIntegerShiftLeft = bigIntegerOr.shiftLeft(7);
                    }
                }
            }
            this.c = stringBuffer.toString();
        }
        return this.c;
    }

    @Override // defpackage.zjh
    public final void c(zjf zjfVar, boolean z) throws IOException {
        zjfVar.j(z, 13, this.b);
    }

    @Override // defpackage.zjh
    public final boolean d(zjh zjhVar) {
        if (this == zjhVar) {
            return true;
        }
        if (zjhVar instanceof zjj) {
            return Arrays.equals(this.b, ((zjj) zjhVar).b);
        }
        return false;
    }

    @Override // defpackage.zjh
    public final boolean e() {
        return false;
    }

    @Override // defpackage.zix
    public final int hashCode() {
        return vxr.ba(this.b);
    }

    public final String toString() {
        return b();
    }
}
