package defpackage;

import android.support.v7.widget.ActivityChooserView;
import android.support.v7.widget.RecyclerView;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddu extends ddv {
    public final byte[] a;
    public int b;
    public int c;
    public int d;
    private final InputStream i;
    private int j;
    private int k;
    private int l = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;

    public ddu(InputStream inputStream) {
        Charset charset = dep.a;
        this.i = inputStream;
        this.a = new byte[RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT];
        this.b = 0;
        this.c = 0;
        this.d = 0;
    }

    private final boolean A(int i) throws der {
        int i2 = this.c;
        int i3 = i2 + i;
        int i4 = this.b;
        if (i3 <= i4) {
            throw new IllegalStateException(a.cd(i, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i5 = this.d;
        if (i > (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i5) - i2 || i5 + i2 + i > this.l) {
            return false;
        }
        if (i2 > 0) {
            if (i4 > i2) {
                byte[] bArr = this.a;
                System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
            }
            i5 = this.d + i2;
            this.d = i5;
            i4 = this.b - i2;
            this.b = i4;
            this.c = 0;
        }
        InputStream inputStream = this.i;
        int iY = y(inputStream, this.a, i4, Math.min(4096 - i4, (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i5) - i4));
        if (iY == 0 || iY < -1 || iY > 4096) {
            throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + iY + "\nThe InputStream implementation is buggy.");
        }
        if (iY <= 0) {
            return false;
        }
        this.b += iY;
        z();
        if (this.b >= i) {
            return true;
        }
        return A(i);
    }

    private static int y(InputStream inputStream, byte[] bArr, int i, int i2) throws der {
        try {
            return inputStream.read(bArr, i, i2);
        } catch (der e) {
            e.a();
            throw e;
        }
    }

    private final void z() {
        int i = this.b + this.j;
        this.b = i;
        int i2 = this.d + i;
        int i3 = this.l;
        if (i2 <= i3) {
            this.j = 0;
            return;
        }
        int i4 = i2 - i3;
        this.j = i4;
        this.b = i - i4;
    }

    public final byte a() {
        if (this.c == this.b) {
            t(1);
        }
        byte[] bArr = this.a;
        int i = this.c;
        this.c = i + 1;
        return bArr[i];
    }

    @Override // defpackage.ddv
    public final double b() {
        return Double.longBitsToDouble(p());
    }

    @Override // defpackage.ddv
    public final float c() {
        return Float.intBitsToFloat(f());
    }

    @Override // defpackage.ddv
    public final int d() {
        return this.d + this.c;
    }

    @Override // defpackage.ddv
    public final int e(int i) throws der {
        if (i < 0) {
            throw new der("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = i + this.d + this.c;
        if (i2 < 0) {
            throw new der("Failed to parse the message.");
        }
        int i3 = this.l;
        if (i2 > i3) {
            throw new der("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.l = i2;
        z();
        return i3;
    }

    public final int f() {
        int i = this.c;
        if (this.b - i < 4) {
            t(4);
            i = this.c;
        }
        byte[] bArr = this.a;
        this.c = i + 4;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    @Override // defpackage.ddv
    public final int g() {
        int iL = l();
        return (iL >>> 1) ^ (-(iL & 1));
    }

    @Override // defpackage.ddv
    public final int h() throws der {
        if (m()) {
            this.k = 0;
            return 0;
        }
        int iL = l();
        this.k = iL;
        if (dgn.a(iL) != 0) {
            return iL;
        }
        throw new der("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.ddv
    public final long i() {
        long jQ = q();
        return (jQ >>> 1) ^ (-(1 & jQ));
    }

    @Override // defpackage.ddv
    public final void j(int i) throws der {
        if (this.k != i) {
            throw new der("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.ddv
    public final void k(int i) {
        this.l = i;
        z();
    }

    public final int l() {
        int i;
        int i2 = this.c;
        int i3 = this.b;
        if (i3 != i2) {
            byte[] bArr = this.a;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.c = i4;
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
                this.c = i5;
                return i;
            }
        }
        return (int) r();
    }

    @Override // defpackage.ddv
    public final boolean m() {
        return this.c == this.b && !A(1);
    }

    @Override // defpackage.ddv
    public final boolean n() {
        return q() != 0;
    }

    @Override // defpackage.ddv
    public final boolean o(int i) throws der {
        int iB = dgn.b(i);
        int i2 = 0;
        if (iB == 0) {
            if (this.b - this.c < 10) {
                while (i2 < 10) {
                    if (a() < 0) {
                        i2++;
                    }
                }
                throw new der("CodedInputStream encountered a malformed varint.");
            }
            while (i2 < 10) {
                byte[] bArr = this.a;
                int i3 = this.c;
                this.c = i3 + 1;
                if (bArr[i3] < 0) {
                    i2++;
                }
            }
            throw new der("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (iB == 1) {
            u(8);
            return true;
        }
        if (iB == 2) {
            u(l());
            return true;
        }
        if (iB == 3) {
            x();
            j(dgn.c(dgn.a(i), 4));
            return true;
        }
        if (iB == 4) {
            return false;
        }
        if (iB != 5) {
            throw new deq();
        }
        u(4);
        return true;
    }

    public final long p() {
        int i = this.c;
        if (this.b - i < 8) {
            t(8);
            i = this.c;
        }
        byte[] bArr = this.a;
        this.c = i + 8;
        long j = bArr[i];
        long j2 = bArr[i + 2];
        long j3 = bArr[i + 3];
        return ((bArr[i + 6] & 255) << 48) | (j & 255) | ((bArr[i + 1] & 255) << 8) | ((j2 & 255) << 16) | ((j3 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 7] & 255) << 56);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b7, code lost:
    
        if (r2[r5] >= 0) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long q() {
        /*
            Method dump skipped, instructions count: 196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddu.q():long");
    }

    final long r() throws der {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((a() & 128) == 0) {
                return j;
            }
        }
        throw new der("CodedInputStream encountered a malformed varint.");
    }

    public final List s(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.i.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw new der("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.d += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final void t(int i) {
        if (A(i)) {
            return;
        }
        if (i <= (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - this.d) - this.c) {
            throw new der("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new der("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void u(int i) throws der {
        int i2 = this.b;
        int i3 = this.c;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.c = i3 + i;
            return;
        }
        if (i < 0) {
            throw new der("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i5 = this.d;
        int i6 = i5 + i3;
        int i7 = this.l;
        if (i6 + i > i7) {
            u((i7 - i5) - i3);
            throw new der("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.d = i6;
        this.b = 0;
        this.c = 0;
        while (i4 < i) {
            try {
                long j = i - i4;
                try {
                    long jSkip = this.i.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(this.i.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i4 += (int) jSkip;
                    }
                } catch (der e) {
                    e.a();
                    throw e;
                }
            } finally {
                this.d += i4;
                z();
            }
        }
        if (i4 >= i) {
            return;
        }
        int i8 = this.b;
        int i9 = i8 - this.c;
        this.c = i8;
        t(1);
        while (true) {
            int i10 = i - i9;
            int i11 = this.b;
            if (i10 <= i11) {
                this.c = i10;
                return;
            } else {
                i9 += i11;
                this.c = i11;
                t(1);
            }
        }
    }

    public final byte[] v(int i) {
        if (i == 0) {
            return dep.b;
        }
        int i2 = this.d;
        int i3 = this.c;
        int i4 = i2 + i3 + i;
        if ((-2147483647) + i4 > 0) {
            throw new der("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.l;
        if (i4 > i5) {
            u((i5 - i2) - i3);
            throw new der("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i6 = this.b - i3;
        int i7 = i - i6;
        if (i7 >= 4096) {
            try {
                if (i7 > this.i.available()) {
                    return null;
                }
            } catch (der e) {
                e.a();
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.a, this.c, bArr, 0, i6);
        this.d += this.b;
        this.c = 0;
        this.b = 0;
        while (i6 < i) {
            int iY = y(this.i, bArr, i6, i - i6);
            if (iY == -1) {
                throw new der("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.d += iY;
            i6 += iY;
        }
        return bArr;
    }

    public final byte[] w(int i) {
        byte[] bArrV = v(i);
        if (bArrV != null) {
            return bArrV;
        }
        int i2 = this.c;
        int i3 = this.b;
        int i4 = i3 - i2;
        this.d += i3;
        this.c = 0;
        this.b = 0;
        List<byte[]> listS = s(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.a, i2, bArr, 0, i4);
        for (byte[] bArr2 : listS) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }
}
