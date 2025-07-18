package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ckx extends cky {
    private final InputStream e;
    private final byte[] f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l = Integer.MAX_VALUE;

    public ckx(InputStream inputStream) {
        byte[] bArr = cmf.b;
        this.e = inputStream;
        this.f = new byte[4096];
        this.g = 0;
        this.i = 0;
        this.k = 0;
    }

    private static int G(InputStream inputStream, byte[] bArr, int i, int i2) throws cmh {
        try {
            return inputStream.read(bArr, i, i2);
        } catch (cmh e) {
            e.a();
            throw e;
        }
    }

    private final List Q(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.e.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw new cmh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.k += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void R() {
        int i = this.g + this.h;
        this.g = i;
        int i2 = this.k + i;
        int i3 = this.l;
        if (i2 <= i3) {
            this.h = 0;
            return;
        }
        int i4 = i2 - i3;
        this.h = i4;
        this.g = i - i4;
    }

    private final void S(int i) throws cmh {
        if (T(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.k) - this.i) {
            throw new cmh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new cmh("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    private final boolean T(int i) throws cmh {
        int i2 = this.i;
        int i3 = i2 + i;
        int i4 = this.g;
        if (i3 <= i4) {
            throw new IllegalStateException(b.h(i, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i5 = this.k;
        if (i > (Integer.MAX_VALUE - i5) - i2 || i5 + i2 + i > this.l) {
            return false;
        }
        if (i2 > 0) {
            if (i4 > i2) {
                byte[] bArr = this.f;
                System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
            }
            i5 = this.k + i2;
            this.k = i5;
            i4 = this.g - i2;
            this.g = i4;
            this.i = 0;
        }
        InputStream inputStream = this.e;
        int iG = G(inputStream, this.f, i4, Math.min(4096 - i4, (Integer.MAX_VALUE - i5) - i4));
        if (iG != 0 && iG >= -1 && iG <= 4096) {
            if (iG <= 0) {
                return false;
            }
            this.g += iG;
            R();
            return this.g >= i || T(i);
        }
        throw new IllegalStateException(String.valueOf(inputStream.getClass()) + "#read(byte[]) returned invalid result: " + iG + "\nThe InputStream implementation is buggy.");
    }

    private final byte[] U(int i) throws cmh {
        if (i == 0) {
            return cmf.b;
        }
        int i2 = this.k;
        int i3 = this.i;
        int i4 = i2 + i3 + i;
        if ((-2147483647) + i4 > 0) {
            throw new cmh("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i5 = this.l;
        if (i4 > i5) {
            B((i5 - i2) - i3);
            throw new cmh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i6 = this.g - i3;
        int i7 = i - i6;
        if (i7 >= 4096) {
            try {
                if (i7 > this.e.available()) {
                    return null;
                }
            } catch (cmh e) {
                e.a();
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f, this.i, bArr, 0, i6);
        this.k += this.g;
        this.i = 0;
        this.g = 0;
        while (i6 < i) {
            int iG = G(this.e, bArr, i6, i - i6);
            if (iG == -1) {
                throw new cmh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.k += iG;
            i6 += iG;
        }
        return bArr;
    }

    private final byte[] V(int i) throws IOException {
        byte[] bArrU = U(i);
        if (bArrU != null) {
            return bArrU;
        }
        int i2 = this.i;
        int i3 = this.g;
        int i4 = i3 - i2;
        this.k += i3;
        this.i = 0;
        this.g = 0;
        List<byte[]> listQ = Q(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f, i2, bArr, 0, i4);
        for (byte[] bArr2 : listQ) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    @Override // defpackage.cky
    public final void A(int i) {
        this.l = i;
        R();
    }

    public final void B(int i) throws cmh {
        int i2 = this.g;
        int i3 = this.i;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.i = i3 + i;
            return;
        }
        if (i < 0) {
            throw new cmh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i5 = this.k;
        int i6 = i5 + i3;
        int i7 = this.l;
        if (i6 + i > i7) {
            B((i7 - i5) - i3);
            throw new cmh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.k = i6;
        this.g = 0;
        this.i = 0;
        while (i4 < i) {
            try {
                long j = i - i4;
                try {
                    long jSkip = this.e.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(String.valueOf(this.e.getClass()) + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i4 += (int) jSkip;
                    }
                } catch (cmh e) {
                    e.a();
                    throw e;
                }
            } finally {
                this.k += i4;
                R();
            }
        }
        if (i4 >= i) {
            return;
        }
        int i8 = this.g;
        int i9 = i8 - this.i;
        this.i = i8;
        S(1);
        while (true) {
            int i10 = i - i9;
            int i11 = this.g;
            if (i10 <= i11) {
                this.i = i10;
                return;
            } else {
                i9 += i11;
                this.i = i11;
                S(1);
            }
        }
    }

    @Override // defpackage.cky
    public final boolean C() {
        return this.i == this.g && !T(1);
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
            if (this.g - this.i < 10) {
                while (i2 < 10) {
                    if (a() < 0) {
                        i2++;
                    }
                }
                throw new cmh("CodedInputStream encountered a malformed varint.");
            }
            while (i2 < 10) {
                byte[] bArr = this.f;
                int i3 = this.i;
                this.i = i3 + 1;
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
    public final byte[] F() throws cmh {
        int iJ = j();
        int i = this.g;
        int i2 = this.i;
        if (iJ > i - i2 || iJ <= 0) {
            if (iJ >= 0) {
                return V(iJ);
            }
            throw new cmh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(this.f, i2, i2 + iJ);
        this.i += iJ;
        return bArrCopyOfRange;
    }

    public final byte a() throws cmh {
        if (this.i == this.g) {
            S(1);
        }
        byte[] bArr = this.f;
        int i = this.i;
        this.i = i + 1;
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
        return this.k + this.i;
    }

    @Override // defpackage.cky
    public final int e(int i) throws cmh {
        if (i < 0) {
            throw new cmh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = i + this.k + this.i;
        if (i2 < 0) {
            throw new cmh("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i3 = this.l;
        if (i2 > i3) {
            throw new cmh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.l = i2;
        R();
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
        int i = this.i;
        if (this.g - i < 4) {
            S(4);
            i = this.i;
        }
        byte[] bArr = this.f;
        this.i = i + 4;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    @Override // defpackage.cky
    public final int j() {
        int i;
        int i2 = this.i;
        int i3 = this.g;
        if (i3 != i2) {
            byte[] bArr = this.f;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.i = i4;
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
                this.i = i5;
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
            this.j = 0;
            return 0;
        }
        int iJ = j();
        this.j = iJ;
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
        int i = this.i;
        if (this.g - i < 8) {
            S(8);
            i = this.i;
        }
        byte[] bArr = this.f;
        this.i = i + 8;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckx.r():long");
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
    public final ckv w() throws IOException {
        int iJ = j();
        int i = this.g;
        int i2 = this.i;
        if (iJ <= i - i2 && iJ > 0) {
            ckv ckvVarQ = ckv.q(this.f, i2, iJ);
            this.i += iJ;
            return ckvVarQ;
        }
        if (iJ == 0) {
            return ckv.b;
        }
        if (iJ < 0) {
            throw new cmh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrU = U(iJ);
        if (bArrU != null) {
            return ckv.p(bArrU);
        }
        int i3 = this.i;
        int i4 = this.g;
        int i5 = i4 - i3;
        this.k += i4;
        this.i = 0;
        this.g = 0;
        List<byte[]> listQ = Q(iJ - i5);
        byte[] bArr = new byte[iJ];
        System.arraycopy(this.f, i3, bArr, 0, i5);
        for (byte[] bArr2 : listQ) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i5, length);
            i5 += length;
        }
        ckv ckvVar = ckv.b;
        return new ckt(bArr);
    }

    @Override // defpackage.cky
    public final String x() throws cmh {
        int iJ = j();
        if (iJ > 0) {
            int i = this.g;
            int i2 = this.i;
            if (iJ <= i - i2) {
                String str = new String(this.f, i2, iJ, cmf.a);
                this.i += iJ;
                return str;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ < 0) {
            throw new cmh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (iJ > this.g) {
            return new String(V(iJ), cmf.a);
        }
        S(iJ);
        String str2 = new String(this.f, this.i, iJ, cmf.a);
        this.i += iJ;
        return str2;
    }

    @Override // defpackage.cky
    public final String y() throws IOException {
        byte[] bArrV;
        int iJ = j();
        int i = this.i;
        int i2 = this.g;
        if (iJ <= i2 - i && iJ > 0) {
            bArrV = this.f;
            this.i = i + iJ;
        } else {
            if (iJ == 0) {
                return "";
            }
            if (iJ < 0) {
                throw new cmh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i = 0;
            if (iJ <= i2) {
                S(iJ);
                bArrV = this.f;
                this.i = iJ;
            } else {
                bArrV = V(iJ);
            }
        }
        int i3 = cof.a;
        return dnx.bq(bArrV, i, iJ);
    }

    @Override // defpackage.cky
    public final void z(int i) throws cmh {
        if (this.j != i) {
            throw new cmh("Protocol message end-group tag did not match expected tag.");
        }
    }
}
