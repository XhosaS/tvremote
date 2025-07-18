package defpackage;

import android.support.v7.widget.ActivityChooserView;
import android.support.v7.widget.RecyclerView;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vtc extends vte {
    private final InputStream a;
    private final byte[] h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;

    public vtc(InputStream inputStream, int i) {
        Charset charset = vuo.a;
        this.a = inputStream;
        this.h = new byte[i];
        this.i = 0;
        this.k = 0;
        this.m = 0;
    }

    private static int G(InputStream inputStream, byte[] bArr, int i, int i2) throws vuq {
        try {
            return inputStream.read(bArr, i, i2);
        } catch (vuq e) {
            e.a();
            throw e;
        }
    }

    private final List T(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.a.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw new vuq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.m += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void U() {
        int i = this.i + this.j;
        this.i = i;
        int i2 = this.m + i;
        int i3 = this.n;
        if (i2 <= i3) {
            this.j = 0;
            return;
        }
        int i4 = i2 - i3;
        this.j = i4;
        this.i = i - i4;
    }

    private final void V(int i) throws vuq {
        if (W(i)) {
            return;
        }
        if (i <= (this.e - this.m) - this.k) {
            throw new vuq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new vuq("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    private final boolean W(int i) throws vuq {
        int i2 = this.k;
        int i3 = i2 + i;
        int i4 = this.i;
        if (i3 <= i4) {
            throw new IllegalStateException(a.cd(i, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i5 = this.e;
        int i6 = this.m;
        if (i > (i5 - i6) - i2 || i6 + i2 + i > this.n) {
            return false;
        }
        if (i2 > 0) {
            if (i4 > i2) {
                byte[] bArr = this.h;
                System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
            }
            i6 = this.m + i2;
            this.m = i6;
            i4 = this.i - i2;
            this.i = i4;
            this.k = 0;
        }
        InputStream inputStream = this.a;
        byte[] bArr2 = this.h;
        int i7 = this.e - i6;
        int length = bArr2.length;
        int iG = G(inputStream, bArr2, i4, Math.min(length - i4, i7 - i4));
        if (iG != 0 && iG >= -1 && iG <= length) {
            if (iG <= 0) {
                return false;
            }
            this.i += iG;
            U();
            return this.i >= i || W(i);
        }
        throw new IllegalStateException(String.valueOf(inputStream.getClass()) + "#read(byte[]) returned invalid result: " + iG + "\nThe InputStream implementation is buggy.");
    }

    private final byte[] X(int i) throws vuq {
        if (i == 0) {
            return vuo.b;
        }
        int i2 = this.m;
        int i3 = this.k;
        int i4 = i2 + i3 + i;
        if (i4 - this.e > 0) {
            throw new vuq("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i5 = this.n;
        if (i4 > i5) {
            B((i5 - i2) - i3);
            throw new vuq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i6 = this.i - i3;
        int i7 = i - i6;
        if (i7 >= 4096) {
            try {
                if (i7 > this.a.available()) {
                    return null;
                }
            } catch (vuq e) {
                e.a();
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.h, this.k, bArr, 0, i6);
        this.m += this.i;
        this.k = 0;
        this.i = 0;
        while (i6 < i) {
            int iG = G(this.a, bArr, i6, i - i6);
            if (iG == -1) {
                throw new vuq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.m += iG;
            i6 += iG;
        }
        return bArr;
    }

    private final byte[] Y(int i) throws IOException {
        byte[] bArrX = X(i);
        if (bArrX != null) {
            return bArrX;
        }
        int i2 = this.k;
        int i3 = this.i;
        int i4 = i3 - i2;
        this.m += i3;
        this.k = 0;
        this.i = 0;
        List<byte[]> listT = T(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.h, i2, bArr, 0, i4);
        for (byte[] bArr2 : listT) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    @Override // defpackage.vte
    public final void A(int i) {
        this.n = i;
        U();
    }

    public final void B(int i) throws vuq {
        int i2 = this.i;
        int i3 = this.k;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.k = i3 + i;
            return;
        }
        if (i < 0) {
            throw new vuq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i5 = this.m;
        int i6 = i5 + i3;
        int i7 = this.n;
        if (i6 + i > i7) {
            B((i7 - i5) - i3);
            throw new vuq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.m = i6;
        this.i = 0;
        this.k = 0;
        while (i4 < i) {
            try {
                long j = i - i4;
                try {
                    long jSkip = this.a.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(String.valueOf(this.a.getClass()) + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i4 += (int) jSkip;
                    }
                } catch (vuq e) {
                    e.a();
                    throw e;
                }
            } finally {
                this.m += i4;
                U();
            }
        }
        if (i4 >= i) {
            return;
        }
        int i8 = this.i;
        int i9 = i8 - this.k;
        this.k = i8;
        V(1);
        while (true) {
            int i10 = i - i9;
            int i11 = this.i;
            if (i10 <= i11) {
                this.k = i10;
                return;
            } else {
                i9 += i11;
                this.k = i11;
                V(1);
            }
        }
    }

    @Override // defpackage.vte
    public final boolean C() {
        return this.k == this.i && !W(1);
    }

    @Override // defpackage.vte
    public final boolean D() {
        return r() != 0;
    }

    @Override // defpackage.vte
    public final boolean E(int i) throws vuq {
        int iB = vwq.b(i);
        int i2 = 0;
        if (iB == 0) {
            if (this.i - this.k < 10) {
                while (i2 < 10) {
                    if (a() < 0) {
                        i2++;
                    }
                }
                throw new vuq("CodedInputStream encountered a malformed varint.");
            }
            while (i2 < 10) {
                byte[] bArr = this.h;
                int i3 = this.k;
                this.k = i3 + 1;
                if (bArr[i3] < 0) {
                    i2++;
                }
            }
            throw new vuq("CodedInputStream encountered a malformed varint.");
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
            R();
            z(vwq.c(vwq.a(i), 4));
            return true;
        }
        if (iB == 4) {
            Q();
            return false;
        }
        if (iB != 5) {
            throw new vup();
        }
        B(4);
        return true;
    }

    @Override // defpackage.vte
    public final byte[] F() throws vuq {
        int iJ = j();
        int i = this.i;
        int i2 = this.k;
        if (iJ > i - i2 || iJ <= 0) {
            if (iJ >= 0) {
                return Y(iJ);
            }
            throw new vuq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(this.h, i2, i2 + iJ);
        this.k += iJ;
        return bArrCopyOfRange;
    }

    public final byte a() throws vuq {
        if (this.k == this.i) {
            V(1);
        }
        byte[] bArr = this.h;
        int i = this.k;
        this.k = i + 1;
        return bArr[i];
    }

    @Override // defpackage.vte
    public final double b() {
        return Double.longBitsToDouble(q());
    }

    @Override // defpackage.vte
    public final float c() {
        return Float.intBitsToFloat(i());
    }

    @Override // defpackage.vte
    public final int d() {
        return this.m + this.k;
    }

    @Override // defpackage.vte
    public final int e(int i) throws vuq {
        if (i < 0) {
            throw new vuq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = i + this.m + this.k;
        if (i2 < 0) {
            throw new vuq("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i3 = this.n;
        if (i2 > i3) {
            throw new vuq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.n = i2;
        U();
        return i3;
    }

    @Override // defpackage.vte
    public final int f() {
        return j();
    }

    @Override // defpackage.vte
    public final int g() {
        return i();
    }

    @Override // defpackage.vte
    public final int h() {
        return j();
    }

    public final int i() throws vuq {
        int i = this.k;
        if (this.i - i < 4) {
            V(4);
            i = this.k;
        }
        byte[] bArr = this.h;
        this.k = i + 4;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    @Override // defpackage.vte
    public final int j() {
        int i;
        int i2 = this.k;
        int i3 = this.i;
        if (i3 != i2) {
            byte[] bArr = this.h;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.k = i4;
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
                this.k = i5;
                return i;
            }
        }
        return (int) s();
    }

    @Override // defpackage.vte
    public final int k() {
        return i();
    }

    @Override // defpackage.vte
    public final int l() {
        return I(j());
    }

    @Override // defpackage.vte
    public final int m() throws vuq {
        if (C()) {
            this.l = 0;
            return 0;
        }
        int iJ = j();
        this.l = iJ;
        if (vwq.a(iJ) != 0) {
            return iJ;
        }
        throw new vuq("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.vte
    public final int n() {
        return j();
    }

    @Override // defpackage.vte
    public final long o() {
        return q();
    }

    @Override // defpackage.vte
    public final long p() {
        return r();
    }

    public final long q() throws vuq {
        int i = this.k;
        if (this.i - i < 8) {
            V(8);
            i = this.k;
        }
        byte[] bArr = this.h;
        this.k = i + 8;
        long j = bArr[i];
        long j2 = bArr[i + 2];
        long j3 = bArr[i + 3];
        return ((bArr[i + 6] & 255) << 48) | (j & 255) | ((bArr[i + 1] & 255) << 8) | ((j2 & 255) << 16) | ((j3 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 7] & 255) << 56);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b7, code lost:
    
        if (r2[r5] >= 0) goto L28;
     */
    @Override // defpackage.vte
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long r() {
        /*
            Method dump skipped, instructions count: 196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vtc.r():long");
    }

    final long s() throws vuq {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((a() & 128) == 0) {
                return j;
            }
        }
        throw new vuq("CodedInputStream encountered a malformed varint.");
    }

    @Override // defpackage.vte
    public final long t() {
        return q();
    }

    @Override // defpackage.vte
    public final long u() {
        return K(r());
    }

    @Override // defpackage.vte
    public final long v() {
        return r();
    }

    @Override // defpackage.vte
    public final vsz w() throws IOException {
        int iJ = j();
        int i = this.i;
        int i2 = this.k;
        if (iJ <= i - i2 && iJ > 0) {
            vsz vszVarR = vsz.r(this.h, i2, iJ);
            this.k += iJ;
            return vszVarR;
        }
        if (iJ == 0) {
            return vsz.b;
        }
        if (iJ < 0) {
            throw new vuq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrX = X(iJ);
        if (bArrX != null) {
            return vsz.q(bArrX);
        }
        int i3 = this.k;
        int i4 = this.i;
        int i5 = i4 - i3;
        this.m += i4;
        this.k = 0;
        this.i = 0;
        List<byte[]> listT = T(iJ - i5);
        byte[] bArr = new byte[iJ];
        System.arraycopy(this.h, i3, bArr, 0, i5);
        for (byte[] bArr2 : listT) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i5, length);
            i5 += length;
        }
        vsz vszVar = vsz.b;
        return new vsw(bArr);
    }

    @Override // defpackage.vte
    public final String x() throws vuq {
        int iJ = j();
        if (iJ > 0) {
            int i = this.i;
            int i2 = this.k;
            if (iJ <= i - i2) {
                String str = new String(this.h, i2, iJ, vuo.a);
                this.k += iJ;
                return str;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ < 0) {
            throw new vuq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (iJ > this.i) {
            return new String(Y(iJ), vuo.a);
        }
        V(iJ);
        String str2 = new String(this.h, this.k, iJ, vuo.a);
        this.k += iJ;
        return str2;
    }

    @Override // defpackage.vte
    public final String y() throws IOException {
        byte[] bArrY;
        int iJ = j();
        int i = this.k;
        int i2 = this.i;
        if (iJ <= i2 - i && iJ > 0) {
            bArrY = this.h;
            this.k = i + iJ;
        } else {
            if (iJ == 0) {
                return "";
            }
            if (iJ < 0) {
                throw new vuq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i = 0;
            if (iJ <= i2) {
                V(iJ);
                bArrY = this.h;
                this.k = iJ;
            } else {
                bArrY = Y(iJ);
            }
        }
        int i3 = vwn.a;
        return vxr.n(bArrY, i, iJ);
    }

    @Override // defpackage.vte
    public final void z(int i) throws vuq {
        if (this.l != i) {
            throw new vuq("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.vte
    public final void H() {
    }
}
