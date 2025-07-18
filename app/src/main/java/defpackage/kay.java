package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kay {
    public static long a(byte[] bArr, int i) {
        byte[] bArr2 = bArr;
        if (i > bArr2.length) {
            throw new IndexOutOfBoundsException(a.b(i, "Out of bound index with offput: 0 and length: "));
        }
        char c = '/';
        long j = -5435081209227447693L;
        boolean z = false;
        if (i <= 32) {
            if (i > 16) {
                long jD = d(bArr2, 0) * (-5435081209227447693L);
                long jD2 = d(bArr2, 8);
                long j2 = (i + i) - 7286425919675154353L;
                long jD3 = d(bArr2, i - 8) * j2;
                return c(Long.rotateRight(jD + jD2, 43) + Long.rotateRight(jD3, 30) + (d(bArr2, i - 16) * (-7286425919675154353L)), jD + Long.rotateRight(jD2 - 7286425919675154353L, 18) + jD3, j2);
            }
            if (i >= 8) {
                long j3 = (i + i) - 7286425919675154353L;
                long jD4 = d(bArr2, 0) - 7286425919675154353L;
                long jD5 = d(bArr2, i - 8);
                return c((Long.rotateRight(jD5, 37) * j3) + jD4, (Long.rotateRight(jD4, 25) + jD5) * j3, j3);
            }
            if (i >= 4) {
                return c(i + ((b(bArr2, 0) & 4294967295L) << 3), b(bArr2, i - 4) & 4294967295L, (i + i) - 7286425919675154353L);
            }
            if (i <= 0) {
                return -7286425919675154353L;
            }
            long j4 = (((bArr2[0] & 255) + ((bArr2[i >> 1] & 255) << 8)) * (-7286425919675154353L)) ^ ((((bArr2[i - 1] & 255) << 2) + i) * (-4348849565147123417L));
            return (j4 ^ (j4 >>> 47)) * (-7286425919675154353L);
        }
        char c2 = '@';
        if (i <= 64) {
            long jD6 = d(bArr2, 0) * (-7286425919675154353L);
            long jD7 = d(bArr2, 8);
            long j5 = (i + i) - 7286425919675154353L;
            long jD8 = d(bArr2, i - 8) * j5;
            long jD9 = d(bArr2, i - 16) * (-7286425919675154353L);
            long jRotateRight = Long.rotateRight(jD6 + jD7, 43) + Long.rotateRight(jD8, 30);
            long jRotateRight2 = Long.rotateRight(jD7 - 7286425919675154353L, 18) + jD6;
            long jD10 = d(bArr2, 16) * j5;
            long jD11 = d(bArr2, 24);
            long j6 = jRotateRight + jD9;
            long jD12 = j6 + d(bArr2, i - 32);
            long jC = c(j6, jRotateRight2 + jD8, j5) + d(bArr2, i - 24);
            long j7 = jD12 * j5;
            return c(Long.rotateRight(jD10 + jD11, 43) + Long.rotateRight(j7, 30) + (jC * j5), jD10 + Long.rotateRight(jD11 + jD6, 18) + j7, j5);
        }
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long jD13 = d(bArr2, 0) + 95310865018149119L;
        long j8 = 1390051526045402406L;
        long j9 = 2480279821605975764L;
        int i2 = 0;
        while (true) {
            int i3 = i - 1;
            boolean z2 = z;
            int i4 = (i3 >> 6) * 64;
            char c3 = c2;
            long jRotateRight3 = Long.rotateRight(jD13 + j9 + jArr[z2 ? 1 : 0] + d(bArr2, i2 + 8), 37) * j;
            long j10 = j;
            long jRotateRight4 = Long.rotateRight(j9 + jArr[1] + d(bArr2, i2 + 48), 42) * j10;
            long j11 = jArr2[1] ^ jRotateRight3;
            char c4 = c;
            long jD14 = jArr[z2 ? 1 : 0] + d(bArr2, i2 + 40);
            long jRotateRight5 = Long.rotateRight(j8 + jArr2[z2 ? 1 : 0], 33) * j10;
            int i5 = i2;
            e(bArr2, i5, jArr[1] * j10, j11 + jArr2[z2 ? 1 : 0], jArr);
            long[] jArr3 = jArr;
            long j12 = jRotateRight4 + jD14;
            e(bArr2, i5 + 32, jRotateRight5 + jArr2[1], d(bArr2, i5 + 16) + j12, jArr2);
            i2 = i5 + 64;
            if (i2 == i4) {
                int i6 = i3 & 63;
                int i7 = i4 + i6;
                long j13 = 255 & j11;
                long j14 = j13 + j13 + j10;
                long j15 = jArr2[z2 ? 1 : 0] + i6;
                long j16 = jArr3[z2 ? 1 : 0] + j15;
                jArr3[z2 ? 1 : 0] = j16;
                jArr2[z2 ? 1 : 0] = j15 + j16;
                long jRotateRight6 = Long.rotateRight(jRotateRight5 + j12 + j16 + d(bArr2, i7 - 55), 37) * j14;
                long jRotateRight7 = Long.rotateRight(j12 + jArr3[1] + d(bArr2, i7 - 15), 42) * j14;
                long j17 = jArr2[1] * 9;
                long jD15 = (jArr3[z2 ? 1 : 0] * 9) + d(bArr2, i7 - 23);
                long jRotateRight8 = Long.rotateRight(jArr2[z2 ? 1 : 0] + j11, 33) * j14;
                long j18 = jRotateRight6 ^ j17;
                e(bArr2, i7 - 63, jArr3[1] * j14, j18 + jArr2[z2 ? 1 : 0], jArr3);
                long j19 = jRotateRight7 + jD15;
                e(bArr2, i7 - 31, jArr2[1] + jRotateRight8, d(bArr2, i7 - 47) + j19, jArr2);
                return c(c(jArr3[z2 ? 1 : 0], jArr2[z2 ? 1 : 0], j14) + (((j19 >>> c4) ^ j19) * (-4348849565147123417L)) + j18, c(jArr3[1], jArr2[1], j14) + jRotateRight8, j14);
            }
            bArr2 = bArr;
            j8 = j11;
            c2 = c3;
            z = z2 ? 1 : 0;
            c = c4;
            jArr = jArr3;
            jD13 = jRotateRight5;
            j9 = j12;
            j = j10;
        }
    }

    private static int b(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    private static long c(long j, long j2, long j3) {
        long j4 = (j ^ j2) * j3;
        long j5 = ((j4 ^ (j4 >>> 47)) ^ j2) * j3;
        return (j5 ^ (j5 >>> 47)) * j3;
    }

    private static long d(byte[] bArr, int i) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, 8);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        return byteBufferWrap.getLong();
    }

    private static void e(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long jD = j + d(bArr, i);
        long jD2 = d(bArr, i + 8);
        long jD3 = d(bArr, i + 16);
        long jD4 = d(bArr, i + 24);
        long j3 = jD2 + jD + jD3;
        long jRotateRight = Long.rotateRight(j2 + jD + jD4, 21) + Long.rotateRight(j3, 44);
        jArr[0] = j3 + jD4;
        jArr[1] = jRotateRight + jD;
    }
}
