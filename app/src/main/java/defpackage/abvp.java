package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abvp extends abvt {
    public boolean a;
    private final byte[] h;
    private final boolean i;
    private int j;
    private int k;
    private int l;
    private final int m;
    private int n;
    private int o = Integer.MAX_VALUE;

    public abvp(byte[] bArr, int i, int i2, boolean z) {
        this.h = bArr;
        this.j = i2 + i;
        this.l = i;
        this.m = i;
        this.i = z;
    }

    private final void R() {
        int i = this.j + this.k;
        this.j = i;
        int i2 = i - this.m;
        int i3 = this.o;
        if (i2 <= i3) {
            this.k = 0;
            return;
        }
        int i4 = i2 - i3;
        this.k = i4;
        this.j = i - i4;
    }

    @Override // defpackage.abvt
    public final void A(int i) {
        this.o = i;
        R();
    }

    public final void B(int i) throws abxv {
        if (i >= 0) {
            int i2 = this.j;
            int i3 = this.l;
            if (i <= i2 - i3) {
                this.l = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw new abxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new abxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // defpackage.abvt
    public final boolean C() {
        return this.l == this.j;
    }

    @Override // defpackage.abvt
    public final boolean D() {
        return r() != 0;
    }

    @Override // defpackage.abvt
    public final boolean E(int i) throws abxv {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.j - this.l < 10) {
                while (i3 < 10) {
                    if (a() < 0) {
                        i3++;
                    }
                }
                throw new abxv("CodedInputStream encountered a malformed varint.");
            }
            while (i3 < 10) {
                byte[] bArr = this.h;
                int i4 = this.l;
                this.l = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw new abxv("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i2 == 1) {
            B(8);
            return true;
        }
        if (i2 == 2) {
            B(j());
            return true;
        }
        if (i2 == 3) {
            O();
            z(((i >>> 3) << 3) | 4);
            return true;
        }
        if (i2 == 4) {
            N();
            return false;
        }
        if (i2 != 5) {
            throw new abxu();
        }
        B(4);
        return true;
    }

    @Override // defpackage.abvt
    public final byte[] F() {
        return G(j());
    }

    public final byte[] G(int i) throws abxv {
        if (i > 0) {
            int i2 = this.j;
            int i3 = this.l;
            if (i <= i2 - i3) {
                int i4 = i + i3;
                this.l = i4;
                return Arrays.copyOfRange(this.h, i3, i4);
            }
        }
        if (i > 0) {
            throw new abxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i == 0) {
            return abxt.b;
        }
        throw new abxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public final byte a() throws abxv {
        int i = this.l;
        if (i == this.j) {
            throw new abxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.h;
        this.l = i + 1;
        return bArr[i];
    }

    @Override // defpackage.abvt
    public final double b() {
        return Double.longBitsToDouble(q());
    }

    @Override // defpackage.abvt
    public final float c() {
        return Float.intBitsToFloat(i());
    }

    @Override // defpackage.abvt
    public final int d() {
        return this.l - this.m;
    }

    @Override // defpackage.abvt
    public final int e(int i) throws abxv {
        if (i < 0) {
            throw new abxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = i + (this.l - this.m);
        if (i2 < 0) {
            throw new abxv("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i3 = this.o;
        if (i2 > i3) {
            throw new abxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.o = i2;
        R();
        return i3;
    }

    @Override // defpackage.abvt
    public final int f() {
        return j();
    }

    @Override // defpackage.abvt
    public final int g() {
        return i();
    }

    @Override // defpackage.abvt
    public final int h() {
        return j();
    }

    public final int i() throws abxv {
        int i = this.l;
        if (this.j - i < 4) {
            throw new abxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.h;
        this.l = i + 4;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    @Override // defpackage.abvt
    public final int j() {
        int i;
        int i2 = this.l;
        int i3 = this.j;
        if (i3 != i2) {
            byte[] bArr = this.h;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.l = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.l = i5;
                return i;
            }
        }
        return (int) s();
    }

    @Override // defpackage.abvt
    public final int k() {
        return i();
    }

    @Override // defpackage.abvt
    public final int l() {
        return H(j());
    }

    @Override // defpackage.abvt
    public final int m() throws abxv {
        if (C()) {
            this.n = 0;
            return 0;
        }
        int iJ = j();
        this.n = iJ;
        if ((iJ >>> 3) != 0) {
            return iJ;
        }
        throw new abxv("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.abvt
    public final int n() {
        return j();
    }

    @Override // defpackage.abvt
    public final long o() {
        return q();
    }

    @Override // defpackage.abvt
    public final long p() {
        return r();
    }

    public final long q() throws abxv {
        int i = this.l;
        if (this.j - i < 8) {
            throw new abxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.h;
        this.l = i + 8;
        long j = bArr[i];
        long j2 = bArr[i + 2];
        long j3 = bArr[i + 3];
        return ((bArr[i + 6] & 255) << 48) | (j & 255) | ((bArr[i + 1] & 255) << 8) | ((j2 & 255) << 16) | ((j3 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 7] & 255) << 56);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b7, code lost:
    
        if (r2[r5] >= 0) goto L28;
     */
    @Override // defpackage.abvt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long r() {
        /*
            Method dump skipped, instructions count: 196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abvp.r():long");
    }

    final long s() throws abxv {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((a() & 128) == 0) {
                return j;
            }
        }
        throw new abxv("CodedInputStream encountered a malformed varint.");
    }

    @Override // defpackage.abvt
    public final long t() {
        return q();
    }

    @Override // defpackage.abvt
    public final long u() {
        return J(r());
    }

    @Override // defpackage.abvt
    public final long v() {
        return r();
    }

    @Override // defpackage.abvt
    public final abvo w() throws abxv {
        abvo abvoVarU;
        int iJ = j();
        if (iJ > 0) {
            int i = this.j;
            int i2 = this.l;
            if (iJ <= i - i2) {
                if (this.i && this.a) {
                    byte[] bArr = this.h;
                    abvo abvoVar = abvo.b;
                    abvoVarU = new abvi(bArr, i2, iJ);
                } else {
                    abvoVarU = abvo.u(this.h, i2, iJ);
                }
                this.l += iJ;
                return abvoVarU;
            }
        }
        if (iJ == 0) {
            return abvo.b;
        }
        byte[] bArrG = G(iJ);
        abvo abvoVar2 = abvo.b;
        return new abvm(bArrG);
    }

    @Override // defpackage.abvt
    public final String x() throws abxv {
        int iJ = j();
        if (iJ > 0) {
            int i = this.j;
            int i2 = this.l;
            if (iJ <= i - i2) {
                String str = new String(this.h, i2, iJ, abxt.a);
                this.l += iJ;
                return str;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ < 0) {
            throw new abxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new abxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // defpackage.abvt
    public final String y() throws abxv {
        int iJ = j();
        if (iJ > 0) {
            int i = this.j;
            int i2 = this.l;
            if (iJ <= i - i2) {
                String strC = acam.a.c(this.h, i2, iJ);
                this.l += iJ;
                return strC;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ <= 0) {
            throw new abxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new abxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // defpackage.abvt
    public final void z(int i) throws abxv {
        if (this.n != i) {
            throw new abxv("Protocol message end-group tag did not match expected tag.");
        }
    }
}
