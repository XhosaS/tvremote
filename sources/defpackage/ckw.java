package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ckw extends cky {
    private final byte[] e;
    private int f;
    private int g;
    private int i;
    private int j = Integer.MAX_VALUE;
    private int h = 0;

    public ckw(byte[] bArr, int i) {
        this.e = bArr;
        this.f = i;
    }

    private final void Q() {
        int i = this.f + this.g;
        this.f = i;
        int i2 = this.j;
        if (i <= i2) {
            this.g = 0;
            return;
        }
        int i3 = i - i2;
        this.g = i3;
        this.f = i - i3;
    }

    @Override // defpackage.cky
    public final void A(int i) {
        this.j = i;
        Q();
    }

    public final void B(int i) throws cmh {
        if (i >= 0) {
            int i2 = this.f;
            int i3 = this.h;
            if (i <= i2 - i3) {
                this.h = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw new cmh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new cmh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // defpackage.cky
    public final boolean C() {
        return this.h == this.f;
    }

    @Override // defpackage.cky
    public final boolean D() {
        return r() != 0;
    }

    @Override // defpackage.cky
    public final boolean E(int i) throws cmh {
        int iB = coi.b(i);
        int i2 = 0;
        if (iB == 0) {
            if (this.f - this.h < 10) {
                while (i2 < 10) {
                    if (a() < 0) {
                        i2++;
                    }
                }
                throw new cmh("CodedInputStream encountered a malformed varint.");
            }
            while (i2 < 10) {
                byte[] bArr = this.e;
                int i3 = this.h;
                this.h = i3 + 1;
                if (bArr[i3] < 0) {
                    i2++;
                }
            }
            throw new cmh("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (iB == 1) {
            B(8);
            return true;
        }
        if (iB == 2) {
            B(j());
            return true;
        }
        if (iB == 3) {
            O();
            z(coi.c(coi.a(i), 4));
            return true;
        }
        if (iB == 4) {
            N();
            return false;
        }
        if (iB != 5) {
            throw new cmg();
        }
        B(4);
        return true;
    }

    @Override // defpackage.cky
    public final byte[] F() {
        return G(j());
    }

    public final byte[] G(int i) throws cmh {
        if (i > 0) {
            int i2 = this.f;
            int i3 = this.h;
            if (i <= i2 - i3) {
                int i4 = i + i3;
                this.h = i4;
                return Arrays.copyOfRange(this.e, i3, i4);
            }
        }
        if (i > 0) {
            throw new cmh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i == 0) {
            return cmf.b;
        }
        throw new cmh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public final byte a() throws cmh {
        int i = this.h;
        if (i == this.f) {
            throw new cmh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.e;
        this.h = i + 1;
        return bArr[i];
    }

    @Override // defpackage.cky
    public final double b() {
        return Double.longBitsToDouble(q());
    }

    @Override // defpackage.cky
    public final float c() {
        return Float.intBitsToFloat(i());
    }

    @Override // defpackage.cky
    public final int d() {
        return this.h;
    }

    @Override // defpackage.cky
    public final int e(int i) {
        if (i < 0) {
            throw new cmh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = i + this.h;
        if (i2 < 0) {
            throw new cmh("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i3 = this.j;
        if (i2 > i3) {
            throw new cmh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.j = i2;
        Q();
        return i3;
    }

    @Override // defpackage.cky
    public final int f() {
        return j();
    }

    @Override // defpackage.cky
    public final int g() {
        return i();
    }

    @Override // defpackage.cky
    public final int h() {
        return j();
    }

    public final int i() throws cmh {
        int i = this.h;
        if (this.f - i < 4) {
            throw new cmh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.e;
        this.h = i + 4;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    @Override // defpackage.cky
    public final int j() {
        int i;
        int i2 = this.h;
        int i3 = this.f;
        if (i3 != i2) {
            byte[] bArr = this.e;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.h = i4;
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
                this.h = i5;
                return i;
            }
        }
        return (int) s();
    }

    @Override // defpackage.cky
    public final int k() {
        return i();
    }

    @Override // defpackage.cky
    public final int l() {
        return H(j());
    }

    @Override // defpackage.cky
    public final int m() throws cmh {
        if (C()) {
            this.i = 0;
            return 0;
        }
        int iJ = j();
        this.i = iJ;
        if (coi.a(iJ) != 0) {
            return iJ;
        }
        throw new cmh("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.cky
    public final int n() {
        return j();
    }

    @Override // defpackage.cky
    public final long o() {
        return q();
    }

    @Override // defpackage.cky
    public final long p() {
        return r();
    }

    public final long q() throws cmh {
        int i = this.h;
        if (this.f - i < 8) {
            throw new cmh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.e;
        this.h = i + 8;
        long j = bArr[i];
        long j2 = bArr[i + 2];
        long j3 = bArr[i + 3];
        return ((bArr[i + 6] & 255) << 48) | (j & 255) | ((bArr[i + 1] & 255) << 8) | ((j2 & 255) << 16) | ((j3 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 7] & 255) << 56);
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x00b7, code lost:
    
        if (r2[r5] >= 0) goto L74;
     */
    @Override // defpackage.cky
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long r() {
        /*
            Method dump skipped, instructions count: 196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckw.r():long");
    }

    final long s() throws cmh {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((a() & 128) == 0) {
                return j;
            }
        }
        throw new cmh("CodedInputStream encountered a malformed varint.");
    }

    @Override // defpackage.cky
    public final long t() {
        return q();
    }

    @Override // defpackage.cky
    public final long u() {
        return J(r());
    }

    @Override // defpackage.cky
    public final long v() {
        return r();
    }

    @Override // defpackage.cky
    public final ckv w() throws cmh {
        int iJ = j();
        if (iJ > 0) {
            int i = this.f;
            int i2 = this.h;
            if (iJ <= i - i2) {
                ckv ckvVarQ = ckv.q(this.e, i2, iJ);
                this.h += iJ;
                return ckvVarQ;
            }
        }
        if (iJ == 0) {
            return ckv.b;
        }
        byte[] bArrG = G(iJ);
        ckv ckvVar = ckv.b;
        return new ckt(bArrG);
    }

    @Override // defpackage.cky
    public final String x() throws cmh {
        int iJ = j();
        if (iJ > 0) {
            int i = this.f;
            int i2 = this.h;
            if (iJ <= i - i2) {
                String str = new String(this.e, i2, iJ, cmf.a);
                this.h += iJ;
                return str;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ < 0) {
            throw new cmh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new cmh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // defpackage.cky
    public final String y() throws cmh {
        int iJ = j();
        if (iJ > 0) {
            int i = this.f;
            int i2 = this.h;
            if (iJ <= i - i2) {
                byte[] bArr = this.e;
                int i3 = cof.a;
                String strBq = dnx.bq(bArr, i2, iJ);
                this.h += iJ;
                return strBq;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ <= 0) {
            throw new cmh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new cmh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // defpackage.cky
    public final void z(int i) throws cmh {
        if (this.i != i) {
            throw new cmh("Protocol message end-group tag did not match expected tag.");
        }
    }
}
