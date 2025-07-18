package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class deo extends dek implements deh {
    static final int[] a = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private final int[] j = new int[64];
    private int k;

    public deo() {
        dnx.X(this);
        def.a();
        j();
    }

    private static int k(int i, int i2, int i3) {
        return (i & i2) ^ ((~i) & i3);
    }

    private static int l(int i, int i2, int i3) {
        return (i & i2) | (i3 & (i ^ i2));
    }

    private static int m(int i) {
        return (((i << 30) | (i >>> 2)) ^ ((i >>> 13) | (i << 19))) ^ ((i >>> 22) | (i << 10));
    }

    private static int n(int i) {
        return (((i << 26) | (i >>> 6)) ^ ((i >>> 11) | (i << 21))) ^ ((i >>> 25) | (i << 7));
    }

    @Override // defpackage.deh
    public final int a(byte[] bArr, int i) {
        f();
        dos.g(this.b, bArr, i);
        dos.g(this.c, bArr, i + 4);
        dos.g(this.d, bArr, i + 8);
        dos.g(this.e, bArr, i + 12);
        dos.g(this.f, bArr, i + 16);
        dos.g(this.g, bArr, i + 20);
        dos.g(this.h, bArr, i + 24);
        dos.g(this.i, bArr, i + 28);
        j();
        return 32;
    }

    @Override // defpackage.deh
    public final int b() {
        return 32;
    }

    @Override // defpackage.deh
    public final String c() {
        return "SHA-256";
    }

    @Override // defpackage.dek
    protected final void g() {
        for (int i = 16; i <= 63; i++) {
            int[] iArr = this.j;
            int i2 = iArr[i - 2];
            int i3 = ((i2 >>> 10) ^ (((i2 >>> 17) | (i2 << 15)) ^ ((i2 >>> 19) | (i2 << 13)))) + iArr[i - 7];
            int i4 = iArr[i - 15];
            iArr[i] = i3 + ((i4 >>> 3) ^ (((i4 >>> 7) | (i4 << 25)) ^ ((i4 >>> 18) | (i4 << 14)))) + iArr[i - 16];
        }
        int iM = this.b;
        int iM2 = this.c;
        int iM3 = this.d;
        int iM4 = this.e;
        int i5 = this.f;
        int i6 = this.g;
        int i7 = this.h;
        int i8 = this.i;
        int i9 = 0;
        int i10 = 0;
        while (i9 < 8) {
            int iN = n(i5);
            int iK = k(i5, i6, i7);
            int[] iArr2 = a;
            int i11 = iN + iK + iArr2[i10];
            int[] iArr3 = this.j;
            int i12 = i8 + i11 + iArr3[i10];
            int i13 = iM4 + i12;
            int iM5 = m(iM);
            int iL = l(iM, iM2, iM3);
            int i14 = i10 + 1;
            int iN2 = i7 + n(i13) + k(i13, i5, i6) + iArr2[i14] + iArr3[i14];
            int i15 = iM3 + iN2;
            int i16 = i12 + iM5 + iL;
            int iL2 = l(i16, iM, iM2);
            int i17 = i10 + 2;
            int iN3 = i6 + n(i15) + k(i15, i13, i5) + iArr2[i17] + iArr3[i17];
            int i18 = iM2 + iN3;
            int iM6 = iN2 + m(i16) + iL2;
            int iL3 = l(iM6, i16, iM);
            int i19 = i10 + 3;
            int iN4 = i5 + n(i18) + k(i18, i15, i13) + iArr2[i19] + iArr3[i19];
            int i20 = iM + iN4;
            int i21 = i10 + 4;
            int iN5 = n(i20) + k(i20, i18, i15) + iArr2[i21] + iArr3[i21];
            int i22 = i10 + 5;
            int i23 = i13 + iN5;
            int i24 = i16 + i23;
            int iN6 = n(i24) + k(i24, i20, i18) + iArr2[i22] + iArr3[i22];
            int i25 = i10 + 6;
            int i26 = i15 + iN6;
            int i27 = iM6 + i26;
            int iN7 = n(i27) + k(i27, i24, i20) + iArr2[i25] + iArr3[i25];
            int i28 = i10 + 7;
            int i29 = iArr2[i28];
            int iM7 = iN3 + m(iM6) + iL3;
            int i30 = i18 + iN7;
            int i31 = iM7 + i30;
            int iN8 = n(i31) + k(i31, i27, i24) + i29 + iArr3[i28];
            i10 += 8;
            int iM8 = iN4 + m(iM7) + l(iM7, iM6, i16);
            iM4 = i23 + m(iM8) + l(iM8, iM7, iM6);
            iM3 = i26 + m(iM4) + l(iM4, iM8, iM7);
            int i32 = i20 + iN8;
            iM2 = i30 + m(iM3) + l(iM3, iM4, iM8);
            i5 = iM8 + i32;
            i9++;
            i7 = i27;
            iM = m(iM2) + l(iM2, iM3, iM4) + i32;
            i8 = i24;
            i6 = i31;
        }
        this.b += iM;
        this.c += iM2;
        this.d += iM3;
        this.e += iM4;
        this.f += i5;
        this.g += i6;
        this.h += i7;
        this.i += i8;
        this.k = 0;
        for (int i33 = 0; i33 < 16; i33++) {
            this.j[i33] = 0;
        }
    }

    @Override // defpackage.dek
    protected final void h(long j) {
        if (this.k > 14) {
            g();
        }
        int[] iArr = this.j;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
    }

    @Override // defpackage.dek
    protected final void i(byte[] bArr, int i) {
        this.j[this.k] = dos.c(bArr, i);
        int i2 = this.k + 1;
        this.k = i2;
        if (i2 == 16) {
            g();
        }
    }

    @Override // defpackage.dek
    public final void j() {
        super.j();
        this.b = 1779033703;
        this.c = -1150833019;
        this.d = 1013904242;
        this.e = -1521486534;
        this.f = 1359893119;
        this.g = -1694144372;
        this.h = 528734635;
        this.i = 1541459225;
        this.k = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.j;
            if (i == 64) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }
}
