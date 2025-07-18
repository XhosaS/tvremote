package defpackage;

import java.lang.reflect.Array;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class djn {
    static final byte[][] a = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 256, 256);
    static final byte[] b = new byte[256];

    static {
        long j;
        int i = 1;
        long j2 = 72340172838076673L;
        while (true) {
            j = 506097522914230528L;
            if (i > 255) {
                break;
            }
            for (int i2 = 0; i2 < 256; i2 += 8) {
                dos.j(d(j2, j), a[i], i2);
                j += 578721382704613384L;
            }
            j2 += 72340172838076673L;
            i++;
        }
        for (int i3 = 0; i3 < 256; i3 += 8) {
            long jE = e(j);
            long jE2 = e(jE);
            long jD = d(d(jE2, jE), e(jE2));
            dos.j(d(jE, e(d(e(e(e(jD))), jD))), b, i3);
            j += 578721382704613384L;
        }
    }

    public static short a(short s, short s2) {
        return (short) (s ^ s2);
    }

    public static short b(short s, short s2) {
        return (short) (a[s][s2] & 255);
    }

    private static long c(long j, long j2) {
        long jG = g(j, j2);
        long j3 = 3689348814741910323L & jG;
        return (g(((j ^ (j << 2)) & (-3689348814741910324L)) ^ ((jG & (-3689348814741910324L)) >>> 2), ((j2 ^ (j2 << 2)) & (-3689348814741910324L)) ^ 2459565876494606882L) ^ (j3 << 2)) ^ j3;
    }

    private static long d(long j, long j2) {
        long jC = c(j, j2);
        long j3 = 1085102592571150095L & jC;
        return (c(((j ^ (j << 4)) & (-1085102592571150096L)) ^ ((jC & (-1085102592571150096L)) >>> 4), ((j2 ^ (j2 << 4)) & (-1085102592571150096L)) ^ 578721382704613384L) ^ (j3 << 4)) ^ j3;
    }

    private static long e(long j) {
        long j2 = j ^ (((-6148914691236517206L) & j) >>> 1);
        long jF = j2 ^ (f((-3689348814741910324L) & j2) >>> 2);
        long j3 = (-4557430888798830400L) & jF;
        long j4 = j3 >>> 2;
        return jF ^ ((f((((3472328296227680304L & jF) << 2) ^ j3) ^ j4) ^ j4) >>> 4);
    }

    private static long f(long j) {
        long j2 = (-6148914691236517206L) & j;
        long j3 = j & 6148914691236517205L;
        return ((j3 + j3) ^ j2) ^ (j2 >>> 1);
    }

    private static long g(long j, long j2) {
        long j3 = j & j2;
        long j4 = j2 + j2;
        return ((((j & j4) ^ (j2 & (j + j))) & (-6148914691236517206L)) ^ j3) ^ ((j3 & (-6148914691236517206L)) >>> 1);
    }
}
