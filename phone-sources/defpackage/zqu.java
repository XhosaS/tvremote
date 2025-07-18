package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zqu extends zqv {
    protected static final short c(int i) {
        int i2 = i & 8191;
        int i3 = i >>> 13;
        int i4 = i2 ^ i3;
        int i5 = (i3 + i3) ^ ((i3 << 4) ^ (i3 << 3));
        int i6 = i5 >>> 13;
        return (short) (((i5 & 8191) ^ (i4 ^ i6)) ^ (((i6 << 4) ^ (i6 << 3)) ^ (i6 + i6)));
    }

    private static final short d(short s) {
        return c(wef.X(c(wef.X(s))));
    }

    private static final short e(short s, short s2) {
        long j = s;
        long j2 = s2;
        long j3 = (j << 21) ^ j;
        long j4 = j2 << 9;
        long j5 = j3 & 2147483656L;
        long j6 = j2 << 6;
        long j7 = j3 & 1073741828;
        long j8 = j2 << 3;
        long j9 = j3 & 536870914;
        long j10 = (((((((j2 << 18) * (j & 64)) ^ (j2 * (j3 & 268435457))) ^ (j8 * j9)) ^ (j6 * j7)) ^ (j4 * j5)) ^ ((j2 << 12) * (4294967312L & j3))) ^ ((j2 << 15) * (8589934624L & j3));
        long j11 = 2305834213120671744L & j10;
        long j12 = j10 ^ ((j11 >>> 26) ^ (((j11 >>> 18) ^ (j11 >>> 20)) ^ (j11 >>> 24)));
        long j13 = 8796025913344L & j12;
        return c(((int) (j12 ^ ((j13 >>> 26) ^ (((j13 >>> 18) ^ (j13 >>> 20)) ^ (j13 >>> 24))))) & 67108863);
    }

    private static final short f(short s, short s2) {
        long j = s;
        long j2 = s2;
        long j3 = (j << 7) ^ j;
        long j4 = j2 << 3;
        long j5 = j3 & 131080;
        long j6 = j2 << 2;
        long j7 = j3 & 65540;
        long j8 = j2 + j2;
        long j9 = j3 & 32770;
        long j10 = (((((((j2 << 6) * (j & 64)) ^ (j2 * (j3 & 16385))) ^ (j8 * j9)) ^ (j6 * j7)) ^ (j4 * j5)) ^ ((j2 << 4) * (262160 & j3))) ^ ((j2 << 5) * (524320 & j3));
        long j11 = 137371844608L & j10;
        return c(((int) (j10 ^ ((j11 >>> 26) ^ (((j11 >>> 18) ^ (j11 >>> 20)) ^ (j11 >>> 24))))) & 67108863);
    }

    @Override // defpackage.zqv
    public final short a(short s) {
        short sF = f(s, s);
        short sE = e(sF, sF);
        return f(e(d(e(d(sE), sE)), sE), (short) 1);
    }

    @Override // defpackage.zqv
    public final short b(short s, short s2) {
        int i = (s2 & 1) * s;
        for (int i2 = 1; i2 < 13; i2++) {
            i ^= ((1 << i2) & s2) * s;
        }
        return c(i);
    }
}
