package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class znt implements znp {
    private static final long[] g = {1, 32898, -9223372036854742902L, -9223372034707259392L, 32907, 2147483649L, -9223372034707259263L, -9223372036854743031L, 138, 136, 2147516425L, 2147483658L, 2147516555L, -9223372036854775669L, -9223372036854742903L, -9223372036854743037L, -9223372036854743038L, -9223372036854775680L, 32778, -9223372034707292150L, -9223372034707259263L, -9223372036854742912L, 2147483649L, -9223372034707259384L};
    protected final long[] a = new long[25];
    protected final byte[] b = new byte[192];
    protected int c;
    protected int d;
    protected int e;
    protected boolean f;

    public znt(int i) {
        n(i);
        k();
        znn.a();
    }

    private final void l(byte[] bArr, int i) {
        int i2 = this.c >>> 6;
        for (int i3 = 0; i3 < i2; i3++) {
            long[] jArr = this.a;
            jArr[i3] = jArr[i3] ^ vxr.aS(bArr, i);
            i += 8;
        }
        m();
    }

    private final void m() {
        long[] jArr = this.a;
        long j = jArr[0];
        long j2 = jArr[1];
        char c = 2;
        long j3 = jArr[2];
        char c2 = 3;
        long j4 = jArr[3];
        char c3 = 4;
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = jArr[8];
        long j10 = jArr[9];
        long j11 = jArr[10];
        long j12 = jArr[11];
        long j13 = jArr[12];
        long j14 = jArr[13];
        long j15 = jArr[14];
        long j16 = jArr[15];
        long j17 = jArr[16];
        long j18 = jArr[17];
        long j19 = jArr[18];
        long j20 = jArr[19];
        long j21 = jArr[20];
        long j22 = jArr[21];
        long j23 = jArr[22];
        long j24 = jArr[23];
        int i = 24;
        long j25 = jArr[24];
        int i2 = 0;
        while (i2 < i) {
            long j26 = (((j ^ j6) ^ j11) ^ j16) ^ j21;
            long j27 = (((j2 ^ j7) ^ j12) ^ j17) ^ j22;
            long j28 = (((j3 ^ j8) ^ j13) ^ j18) ^ j23;
            long j29 = (((j4 ^ j9) ^ j14) ^ j19) ^ j24;
            long j30 = (((j5 ^ j10) ^ j15) ^ j20) ^ j25;
            long j31 = ((j27 + j27) | (j27 >>> (-1))) ^ j30;
            long j32 = j ^ j31;
            long j33 = j6 ^ j31;
            long j34 = j11 ^ j31;
            long j35 = j16 ^ j31;
            long j36 = j21 ^ j31;
            long j37 = ((j28 + j28) | (j28 >>> (-1))) ^ j26;
            long j38 = j2 ^ j37;
            long j39 = j7 ^ j37;
            long j40 = j12 ^ j37;
            long j41 = j17 ^ j37;
            long j42 = j22 ^ j37;
            long j43 = ((j29 + j29) | (j29 >>> (-1))) ^ j27;
            long j44 = j3 ^ j43;
            long j45 = j8 ^ j43;
            long j46 = j13 ^ j43;
            long j47 = j18 ^ j43;
            long j48 = j23 ^ j43;
            long j49 = ((j30 + j30) | (j30 >>> (-1))) ^ j28;
            long j50 = j4 ^ j49;
            long j51 = j9 ^ j49;
            long j52 = j14 ^ j49;
            long j53 = j19 ^ j49;
            long j54 = j24 ^ j49;
            long j55 = ((j26 + j26) | (j26 >>> (-1))) ^ j29;
            long j56 = j5 ^ j55;
            long j57 = j10 ^ j55;
            long j58 = j15 ^ j55;
            long j59 = j20 ^ j55;
            long j60 = j25 ^ j55;
            long j61 = j48 >>> c2;
            long[] jArr2 = g;
            long j62 = j38 + j38;
            long j63 = j50 >>> 36;
            long j64 = j50 << 28;
            long j65 = j38 >>> 63;
            long j66 = (j44 << 62) | (j44 >>> c);
            char c4 = c2;
            long j67 = (j42 << c) | (j42 >>> 62);
            char c5 = c3;
            long j68 = (j35 << 41) | (j35 >>> 23);
            char c6 = c;
            long j69 = (j51 << 55) | (j51 >>> 9);
            int i3 = i;
            long j70 = (j54 << 56) | (j54 >>> 8);
            long j71 = (j47 << 15) | (j47 >>> 49);
            int i4 = i2;
            long j72 = (j40 << 10) | (j40 >>> 54);
            long j73 = (j36 << 18) | (j36 >>> 46);
            long j74 = (j59 << 8) | (j59 >>> 56);
            long j75 = (j45 << 6) | (j45 >>> 58);
            long j76 = (j48 << 61) | j61;
            long j77 = (j41 << 45) | (j41 >>> 19);
            long j78 = (j34 << c2) | (j34 >>> 61);
            long j79 = (j57 << 20) | (j57 >>> 44);
            long j80 = (j60 << 14) | (j60 >>> 50);
            long j81 = (j53 << 21) | (j53 >>> 43);
            long j82 = (j46 << 43) | (j46 >>> 21);
            long j83 = (j39 << 44) | (j39 >>> 20);
            long j84 = j64 | j63;
            long j85 = (j52 << 25) | (j52 >>> 39);
            long j86 = j62 | j65;
            long j87 = (j33 << 36) | (j33 >>> 28);
            long j88 = (j56 << 27) | (j56 >>> 37);
            long j89 = (j58 << 39) | (j58 >>> 25);
            long j90 = ~j32;
            long j91 = (~j80) & j32;
            long j92 = (((~j83) & j82) ^ j32) ^ jArr2[i4];
            long j93 = ((~j82) & j81) ^ j83;
            long j94 = ((~j81) & j80) ^ j82;
            long j95 = j81 ^ j91;
            long j96 = j80 ^ (j90 & j83);
            long j97 = j84 ^ ((~j79) & j78);
            long j98 = ((~j78) & j77) ^ j79;
            long j99 = j78 ^ ((~j77) & j76);
            long j100 = j77 ^ ((~j76) & j84);
            long j101 = j76 ^ ((~j84) & j79);
            long j102 = j86 ^ ((~j75) & j85);
            long j103 = j75 ^ ((~j85) & j74);
            long j104 = j85 ^ ((~j74) & j73);
            long j105 = j74 ^ ((~j73) & j86);
            long j106 = j73 ^ ((~j86) & j75);
            long j107 = j88 ^ ((~j87) & j72);
            long j108 = j87 ^ ((~j72) & j71);
            long j109 = j72 ^ ((~j71) & j70);
            long j110 = j71 ^ ((~j70) & j88);
            long j111 = j70 ^ ((~j88) & j87);
            long j112 = j66 ^ ((~j69) & j89);
            long j113 = j69 ^ ((~j89) & j68);
            long j114 = j89 ^ ((~j68) & j67);
            j24 = j68 ^ ((~j67) & j66);
            j25 = j67 ^ ((~j66) & j69);
            j16 = j107;
            j23 = j114;
            j12 = j103;
            j10 = j101;
            jArr = jArr;
            i = i3;
            j21 = j112;
            j19 = j110;
            j15 = j106;
            j9 = j100;
            j18 = j109;
            j13 = j104;
            j20 = j111;
            j22 = j113;
            j17 = j108;
            j11 = j102;
            j14 = j105;
            j8 = j99;
            j6 = j97;
            j7 = j98;
            c2 = c4;
            j4 = j95;
            j2 = j93;
            c3 = c5;
            j5 = j96;
            c = c6;
            j3 = j94;
            j = j92;
            i2 = i4 + 1;
        }
        long[] jArr3 = jArr;
        jArr3[0] = j;
        jArr3[1] = j2;
        jArr3[c] = j3;
        jArr3[c2] = j4;
        jArr3[c3] = j5;
        jArr3[5] = j6;
        jArr3[6] = j7;
        jArr3[7] = j8;
        jArr3[8] = j9;
        jArr3[9] = j10;
        jArr3[10] = j11;
        jArr3[11] = j12;
        jArr3[12] = j13;
        jArr3[13] = j14;
        jArr3[14] = j15;
        jArr3[15] = j16;
        jArr3[16] = j17;
        jArr3[17] = j18;
        jArr3[18] = j19;
        jArr3[19] = j20;
        jArr3[20] = j21;
        jArr3[21] = j22;
        jArr3[22] = j23;
        jArr3[23] = j24;
        jArr3[i] = j25;
    }

    private final void n(int i) {
        if (i != 128 && i != 224 && i != 256 && i != 288 && i != 384 && i != 512) {
            throw new IllegalArgumentException("bitLength must be one of 128, 224, 256, 288, 384, or 512.");
        }
        int i2 = 1600 - (i + i);
        if (i2 >= 1600 || (i2 & 63) != 0) {
            throw new IllegalStateException("invalid rate value");
        }
        this.c = i2;
        int i3 = 0;
        while (true) {
            long[] jArr = this.a;
            if (i3 >= 25) {
                Arrays.fill(this.b, (byte) 0);
                this.d = 0;
                this.f = false;
                this.e = (1600 - i2) >> 1;
                return;
            }
            jArr[i3] = 0;
            i3++;
        }
    }

    @Override // defpackage.znp
    public int a(byte[] bArr, int i) {
        j(bArr, i, this.e);
        i();
        return b();
    }

    @Override // defpackage.znp
    public int b() {
        return this.e >> 3;
    }

    @Override // defpackage.znp
    public String c() {
        return "Keccak-" + this.e;
    }

    @Override // defpackage.znp
    public final void d(byte b) {
        f(b);
    }

    @Override // defpackage.znp
    public final void e(byte[] bArr, int i, int i2) {
        g(bArr, i, i2);
    }

    public final void f(byte b) {
        int i = this.d;
        if (i % 8 != 0) {
            throw new IllegalStateException("attempt to absorb with odd length queue");
        }
        if (this.f) {
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
        byte[] bArr = this.b;
        bArr[i >>> 3] = b;
        int i2 = i + 8;
        this.d = i2;
        if (i2 == this.c) {
            l(bArr, 0);
            this.d = 0;
        }
    }

    public final void g(byte[] bArr, int i, int i2) {
        int i3 = this.d;
        if (i3 % 8 != 0) {
            throw new IllegalStateException("attempt to absorb with odd length queue");
        }
        if (this.f) {
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
        int i4 = i3 >>> 3;
        int i5 = this.c >>> 3;
        int i6 = i5 - i4;
        if (i2 < i6) {
            System.arraycopy(bArr, i, this.b, i4, i2);
            this.d += i2 << 3;
            return;
        }
        if (i4 > 0) {
            byte[] bArr2 = this.b;
            System.arraycopy(bArr, i, bArr2, i4, i6);
            l(bArr2, 0);
        } else {
            i6 = 0;
        }
        while (true) {
            int i7 = i + i6;
            int i8 = i2 - i6;
            if (i8 < i5) {
                System.arraycopy(bArr, i7, this.b, 0, i8);
                this.d = i8 << 3;
                return;
            } else {
                l(bArr, i7);
                i6 += i5;
            }
        }
    }

    protected final void h(int i, int i2) {
        int i3 = this.d;
        if (i3 % 8 != 0) {
            throw new IllegalStateException("attempt to absorb with odd length queue");
        }
        if (this.f) {
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
        this.b[i3 >>> 3] = (byte) (i & ((1 << i2) - 1));
        this.d = i3 + i2;
    }

    public final void i() {
        n(this.e);
    }

    protected final void j(byte[] bArr, int i, long j) {
        if (!this.f) {
            byte[] bArr2 = this.b;
            int i2 = this.d;
            int i3 = i2 >>> 3;
            bArr2[i3] = (byte) (((byte) (1 << (i2 & 7))) | bArr2[i3]);
            int i4 = i2 + 1;
            this.d = i4;
            if (i4 == this.c) {
                l(bArr2, 0);
            } else {
                int i5 = i4 >>> 6;
                int i6 = i4 & 63;
                int i7 = 0;
                for (int i8 = 0; i8 < i5; i8++) {
                    long[] jArr = this.a;
                    jArr[i8] = jArr[i8] ^ vxr.aS(bArr2, i7);
                    i7 += 8;
                }
                if (i6 > 0) {
                    long j2 = 1 << i6;
                    long[] jArr2 = this.a;
                    jArr2[i5] = (vxr.aS(bArr2, i7) & (j2 - 1)) ^ jArr2[i5];
                }
            }
            long[] jArr3 = this.a;
            int i9 = (this.c - 1) >>> 6;
            jArr3[i9] = jArr3[i9] ^ Long.MIN_VALUE;
            this.d = 0;
            this.f = true;
        }
        long j3 = 0;
        if ((j & 7) != 0) {
            throw new IllegalStateException("outputLength not a multiple of 8");
        }
        while (j3 < j) {
            int i10 = this.d;
            if (i10 == 0) {
                m();
                long[] jArr4 = this.a;
                int i11 = this.c >>> 6;
                byte[] bArr3 = this.b;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    vxr.aX(jArr4[i13], bArr3, i12);
                    i12 += 8;
                }
                i10 = this.c;
                this.d = i10;
            }
            int iMin = (int) Math.min(i10, j - j3);
            System.arraycopy(this.b, (this.c - this.d) / 8, bArr, ((int) (j3 / 8)) + i, iMin / 8);
            this.d -= iMin;
            j3 += iMin;
        }
    }

    protected void k() {
        wef.Z(this);
    }
}
