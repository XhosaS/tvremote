package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class den extends dek {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private final int[] f = new int[80];
    private int g;

    public den() {
        dnx.X(this);
        def.a();
        j();
    }

    private static final int k(int i, int i2, int i3) {
        return (i & i2) | ((~i) & i3);
    }

    private static final int l(int i, int i2, int i3) {
        return (i & (i2 | i3)) | (i2 & i3);
    }

    @Override // defpackage.deh
    public final int a(byte[] bArr, int i) {
        f();
        dos.g(this.a, bArr, i);
        dos.g(this.b, bArr, i + 4);
        dos.g(this.c, bArr, i + 8);
        dos.g(this.d, bArr, i + 12);
        dos.g(this.e, bArr, i + 16);
        j();
        return 20;
    }

    @Override // defpackage.deh
    public final int b() {
        return 20;
    }

    @Override // defpackage.deh
    public final String c() {
        return "SHA-1";
    }

    @Override // defpackage.dek
    protected final void g() {
        for (int i = 16; i < 80; i++) {
            int[] iArr = this.f;
            int i2 = ((iArr[i - 3] ^ iArr[i - 8]) ^ iArr[i - 14]) ^ iArr[i - 16];
            iArr[i] = (i2 >>> 31) | (i2 + i2);
        }
        int i3 = this.a;
        int iL = this.b;
        int i4 = this.c;
        int i5 = this.d;
        int i6 = this.e;
        int i7 = 0;
        for (int i8 = 0; i8 < 4; i8++) {
            int iK = k(iL, i4, i5);
            int[] iArr2 = this.f;
            int i9 = i6 + ((i3 << 5) | (i3 >>> 27)) + iK + iArr2[i7] + 1518500249;
            int i10 = (iL >>> 2) | (iL << 30);
            int iK2 = i5 + ((i9 << 5) | (i9 >>> 27)) + k(i3, i10, i4) + iArr2[i7 + 1] + 1518500249;
            int i11 = (i3 >>> 2) | (i3 << 30);
            int iK3 = i4 + ((iK2 << 5) | (iK2 >>> 27)) + k(i9, i11, i10) + iArr2[i7 + 2] + 1518500249;
            int i12 = i7 + 4;
            i6 = (i9 >>> 2) | (i9 << 30);
            iL = i10 + ((iK3 << 5) | (iK3 >>> 27)) + k(iK2, i6, i11) + iArr2[i7 + 3] + 1518500249;
            i7 += 5;
            i5 = (iK2 >>> 2) | (iK2 << 30);
            int iK4 = ((iL << 5) | (iL >>> 27)) + k(iK3, i5, i6) + iArr2[i12];
            i4 = (iK3 >>> 2) | (iK3 << 30);
            i3 = i11 + iK4 + 1518500249;
        }
        for (int i13 = 0; i13 < 4; i13++) {
            int[] iArr3 = this.f;
            int i14 = i6 + ((i3 << 5) | (i3 >>> 27)) + ((iL ^ i4) ^ i5) + iArr3[i7] + 1859775393;
            int i15 = (iL >>> 2) | (iL << 30);
            int i16 = i5 + ((i14 << 5) | (i14 >>> 27)) + ((i3 ^ i15) ^ i4) + iArr3[i7 + 1] + 1859775393;
            int i17 = (i3 >>> 2) | (i3 << 30);
            int i18 = i4 + ((i16 << 5) | (i16 >>> 27)) + ((i14 ^ i17) ^ i15) + iArr3[i7 + 2] + 1859775393;
            int i19 = i7 + 4;
            i6 = (i14 >>> 2) | (i14 << 30);
            iL = i15 + ((i18 << 5) | (i18 >>> 27)) + ((i16 ^ i6) ^ i17) + iArr3[i7 + 3] + 1859775393;
            i7 += 5;
            i5 = (i16 >>> 2) | (i16 << 30);
            int i20 = ((iL << 5) | (iL >>> 27)) + ((i18 ^ i5) ^ i6) + iArr3[i19];
            i4 = (i18 >>> 2) | (i18 << 30);
            i3 = i17 + i20 + 1859775393;
        }
        for (int i21 = 0; i21 < 4; i21++) {
            int iL2 = l(iL, i4, i5);
            int i22 = i6 + (((((i3 << 5) | (i3 >>> 27)) + iL2) + r14[i7]) - 1894007588);
            int iL3 = i5 + (((((i22 << 5) | (i22 >>> 27)) + l(i3, r3, i4)) + r14[i7 + 1]) - 1894007588);
            int iL4 = i4 + (((((iL3 << 5) | (iL3 >>> 27)) + l(i22, r2, r3)) + r14[i7 + 2]) - 1894007588);
            int i23 = i7 + 4;
            i6 = (i22 >>> 2) | (i22 << 30);
            iL = ((iL >>> 2) | (iL << 30)) + (((((iL4 << 5) | (iL4 >>> 27)) + l(iL3, i6, r2)) + r14[i7 + 3]) - 1894007588);
            i7 += 5;
            i5 = (iL3 >>> 2) | (iL3 << 30);
            int iL5 = ((iL << 5) | (iL >>> 27)) + l(iL4, i5, i6) + this.f[i23];
            i4 = (iL4 >>> 2) | (iL4 << 30);
            i3 = ((i3 >>> 2) | (i3 << 30)) + (iL5 - 1894007588);
        }
        for (int i24 = 0; i24 <= 3; i24++) {
            int i25 = i6 + (((((i3 << 5) | (i3 >>> 27)) + ((iL ^ i4) ^ i5)) + r13[i7]) - 899497514);
            int i26 = i5 + (((((i25 << 5) | (i25 >>> 27)) + ((i3 ^ r3) ^ i4)) + r13[i7 + 1]) - 899497514);
            int i27 = i4 + (((((i26 << 5) | (i26 >>> 27)) + ((i25 ^ r2) ^ r3)) + r13[i7 + 2]) - 899497514);
            int i28 = i7 + 4;
            i6 = (i25 >>> 2) | (i25 << 30);
            iL = ((iL >>> 2) | (iL << 30)) + (((((i27 << 5) | (i27 >>> 27)) + ((i26 ^ i6) ^ r2)) + r13[i7 + 3]) - 899497514);
            i7 += 5;
            i5 = (i26 >>> 2) | (i26 << 30);
            int i29 = ((iL << 5) | (iL >>> 27)) + ((i27 ^ i5) ^ i6) + this.f[i28];
            i4 = (i27 >>> 2) | (i27 << 30);
            i3 = ((i3 >>> 2) | (i3 << 30)) + (i29 - 899497514);
        }
        this.a += i3;
        this.b += iL;
        this.c += i4;
        this.d += i5;
        this.e += i6;
        this.g = 0;
        for (int i30 = 0; i30 < 16; i30++) {
            this.f[i30] = 0;
        }
    }

    @Override // defpackage.dek
    protected final void h(long j) {
        if (this.g > 14) {
            g();
        }
        int[] iArr = this.f;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
    }

    @Override // defpackage.dek
    protected final void i(byte[] bArr, int i) {
        this.f[this.g] = dos.c(bArr, i);
        int i2 = this.g + 1;
        this.g = i2;
        if (i2 == 16) {
            g();
        }
    }

    @Override // defpackage.dek
    public final void j() {
        super.j();
        this.a = 1732584193;
        this.b = -271733879;
        this.c = -1732584194;
        this.d = 271733878;
        this.e = -1009589776;
        this.g = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f;
            if (i == 80) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }
}
