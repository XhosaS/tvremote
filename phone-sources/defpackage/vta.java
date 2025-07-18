package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vta extends vte {
    private final byte[] a;
    private final boolean h;
    private int i;
    private int j;
    private int k;
    private final int l;
    private int m;
    private boolean n;
    private int o = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;

    public vta(byte[] bArr, int i, int i2, boolean z) {
        this.a = bArr;
        this.i = i2 + i;
        this.k = i;
        this.l = i;
        this.h = z;
    }

    private final void T() {
        int i = this.i + this.j;
        this.i = i;
        int i2 = i - this.l;
        int i3 = this.o;
        if (i2 <= i3) {
            this.j = 0;
            return;
        }
        int i4 = i2 - i3;
        this.j = i4;
        this.i = i - i4;
    }

    @Override // defpackage.vte
    public final void A(int i) {
        this.o = i;
        T();
    }

    public final void B(int i) throws vuq {
        if (i >= 0) {
            int i2 = this.i;
            int i3 = this.k;
            if (i <= i2 - i3) {
                this.k = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw new vuq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new vuq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // defpackage.vte
    public final boolean C() {
        return this.k == this.i;
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
                byte[] bArr = this.a;
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
    public final byte[] F() {
        return G(j());
    }

    public final byte[] G(int i) throws vuq {
        if (i > 0) {
            int i2 = this.i;
            int i3 = this.k;
            if (i <= i2 - i3) {
                int i4 = i + i3;
                this.k = i4;
                return Arrays.copyOfRange(this.a, i3, i4);
            }
        }
        if (i > 0) {
            throw new vuq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i == 0) {
            return vuo.b;
        }
        throw new vuq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // defpackage.vte
    public final void H() {
        this.n = true;
    }

    public final byte a() throws vuq {
        int i = this.k;
        if (i == this.i) {
            throw new vuq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.a;
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
        return this.k - this.l;
    }

    @Override // defpackage.vte
    public final int e(int i) {
        if (i < 0) {
            throw new vuq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int iD = i + d();
        if (iD < 0) {
            throw new vuq("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i2 = this.o;
        if (iD > i2) {
            throw new vuq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.o = iD;
        T();
        return i2;
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
            throw new vuq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.a;
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
            byte[] bArr = this.a;
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
            this.m = 0;
            return 0;
        }
        int iJ = j();
        this.m = iJ;
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
            throw new vuq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.a;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vta.r():long");
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
    public final vsz w() throws vuq {
        vsz vszVarR;
        int iJ = j();
        if (iJ > 0) {
            int i = this.i;
            int i2 = this.k;
            if (iJ <= i - i2) {
                if (this.h && this.n) {
                    byte[] bArr = this.a;
                    vsz vszVar = vsz.b;
                    vszVarR = new vst(bArr, i2, iJ);
                } else {
                    vszVarR = vsz.r(this.a, i2, iJ);
                }
                this.k += iJ;
                return vszVarR;
            }
        }
        if (iJ == 0) {
            return vsz.b;
        }
        byte[] bArrG = G(iJ);
        vsz vszVar2 = vsz.b;
        return new vsw(bArrG);
    }

    @Override // defpackage.vte
    public final String x() throws vuq {
        int iJ = j();
        if (iJ > 0) {
            int i = this.i;
            int i2 = this.k;
            if (iJ <= i - i2) {
                String str = new String(this.a, i2, iJ, vuo.a);
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
        throw new vuq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // defpackage.vte
    public final String y() throws vuq {
        int iJ = j();
        if (iJ > 0) {
            int i = this.i;
            int i2 = this.k;
            if (iJ <= i - i2) {
                byte[] bArr = this.a;
                int i3 = vwn.a;
                String strN = vxr.n(bArr, i2, iJ);
                this.k += iJ;
                return strN;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ <= 0) {
            throw new vuq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new vuq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // defpackage.vte
    public final void z(int i) throws vuq {
        if (this.m != i) {
            throw new vuq("Protocol message end-group tag did not match expected tag.");
        }
    }
}
