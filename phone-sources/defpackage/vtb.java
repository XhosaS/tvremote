package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vtb extends vte {
    private final Iterable a;
    private final Iterator h;
    private ByteBuffer i;
    private boolean j;
    private int k;
    private int l;
    private int n;
    private long p;
    private long q;
    private long r;
    private long s;
    private int m = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    private int o = 0;

    public vtb(Iterable iterable, int i) {
        this.k = i;
        this.a = iterable;
        this.h = iterable.iterator();
        if (i != 0) {
            X();
            return;
        }
        this.i = vuo.c;
        this.p = 0L;
        this.q = 0L;
        this.s = 0L;
        this.r = 0L;
    }

    private final int G() {
        return (int) (((this.k - this.o) - this.p) + this.q);
    }

    private final long T() {
        return this.s - this.p;
    }

    private final ByteBuffer U(int i, int i2) {
        int iPosition = this.i.position();
        int iLimit = this.i.limit();
        ByteBuffer byteBuffer = this.i;
        try {
            try {
                byteBuffer.position(i);
                byteBuffer.limit(i2);
                return this.i.slice();
            } catch (IllegalArgumentException unused) {
                throw new vuq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        } finally {
            byteBuffer.position(iPosition);
            byteBuffer.limit(iLimit);
        }
    }

    private final void V() throws vuq {
        if (!this.h.hasNext()) {
            throw new vuq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        X();
    }

    private final void W() {
        int i = this.k + this.l;
        this.k = i;
        int i2 = this.m;
        if (i <= i2) {
            this.l = 0;
            return;
        }
        int i3 = i - i2;
        this.l = i3;
        this.k = i - i3;
    }

    private final void X() {
        ByteBuffer byteBuffer = (ByteBuffer) this.h.next();
        this.i = byteBuffer;
        this.o += (int) (this.p - this.q);
        long jPosition = byteBuffer.position();
        this.p = jPosition;
        this.q = jPosition;
        this.s = this.i.limit();
        long jE = vwl.e(this.i);
        this.r = jE;
        this.p += jE;
        this.q += jE;
        this.s += jE;
    }

    private final void Y(byte[] bArr, int i) throws vuq {
        if (i > G()) {
            if (i > 0) {
                throw new vuq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            return;
        }
        int i2 = i;
        while (i2 > 0) {
            if (T() == 0) {
                V();
            }
            int iMin = Math.min(i2, (int) T());
            long j = iMin;
            vwl.k(this.p, bArr, i - i2, j);
            i2 -= iMin;
            this.p += j;
        }
    }

    @Override // defpackage.vte
    public final void A(int i) {
        this.m = i;
        W();
    }

    public final void B(int i) throws vuq {
        if (i >= 0) {
            if (i <= ((this.k - this.o) - this.p) + this.q) {
                while (i > 0) {
                    if (T() == 0) {
                        V();
                    }
                    int iMin = Math.min(i, (int) T());
                    i -= iMin;
                    this.p += iMin;
                }
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
        return (((long) this.o) + this.p) - this.q == ((long) this.k);
    }

    @Override // defpackage.vte
    public final boolean D() {
        return r() != 0;
    }

    @Override // defpackage.vte
    public final boolean E(int i) throws vuq {
        int iB = vwq.b(i);
        if (iB == 0) {
            for (int i2 = 0; i2 < 10; i2++) {
                if (a() >= 0) {
                    return true;
                }
            }
            throw new vuq("CodedInputStream encountered a malformed varint.");
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
        if (iJ >= 0) {
            long j = iJ;
            if (j <= T()) {
                byte[] bArr = new byte[iJ];
                vwl.k(this.p, bArr, 0L, j);
                this.p += j;
                return bArr;
            }
        }
        if (iJ >= 0 && iJ <= G()) {
            byte[] bArr2 = new byte[iJ];
            Y(bArr2, iJ);
            return bArr2;
        }
        if (iJ > 0) {
            throw new vuq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (iJ == 0) {
            return vuo.b;
        }
        throw new vuq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // defpackage.vte
    public final void H() {
        this.j = true;
    }

    public final byte a() throws vuq {
        if (T() == 0) {
            V();
        }
        long j = this.p;
        this.p = 1 + j;
        return vwl.a(j);
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
        return (int) ((this.o + this.p) - this.q);
    }

    @Override // defpackage.vte
    public final int e(int i) throws vuq {
        if (i < 0) {
            throw new vuq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int iD = i + d();
        int i2 = this.m;
        if (iD > i2) {
            throw new vuq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.m = iD;
        W();
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

    public final int i() {
        if (T() < 4) {
            int iA = a() & 255;
            int iA2 = (a() & 255) << 8;
            return iA | iA2 | ((a() & 255) << 16) | ((a() & 255) << 24);
        }
        long j = this.p;
        this.p = 4 + j;
        int iA3 = vwl.a(j) & 255;
        int iA4 = (vwl.a(1 + j) & 255) << 8;
        return ((vwl.a(j + 3) & 255) << 24) | iA3 | iA4 | ((vwl.a(2 + j) & 255) << 16);
    }

    @Override // defpackage.vte
    public final int j() {
        int i;
        long j = this.p;
        if (this.s != j) {
            long j2 = j + 1;
            byte bA = vwl.a(j);
            if (bA >= 0) {
                this.p++;
                return bA;
            }
            if (this.s - this.p >= 10) {
                long j3 = 2 + j;
                int iA = (vwl.a(j2) << 7) ^ bA;
                if (iA < 0) {
                    i = iA ^ (-128);
                } else {
                    long j4 = 3 + j;
                    int iA2 = (vwl.a(j3) << 14) ^ iA;
                    if (iA2 >= 0) {
                        i = iA2 ^ 16256;
                    } else {
                        long j5 = 4 + j;
                        int iA3 = iA2 ^ (vwl.a(j4) << 21);
                        if (iA3 < 0) {
                            i = (-2080896) ^ iA3;
                        } else {
                            j4 = 5 + j;
                            byte bA2 = vwl.a(j5);
                            int i2 = (iA3 ^ (bA2 << 28)) ^ 266354560;
                            if (bA2 < 0) {
                                j5 = 6 + j;
                                if (vwl.a(j4) < 0) {
                                    j4 = 7 + j;
                                    if (vwl.a(j5) < 0) {
                                        j5 = 8 + j;
                                        if (vwl.a(j4) < 0) {
                                            j4 = 9 + j;
                                            if (vwl.a(j5) < 0) {
                                                long j6 = j + 10;
                                                if (vwl.a(j4) >= 0) {
                                                    i = i2;
                                                    j3 = j6;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i2;
                            }
                            i = i2;
                        }
                        j3 = j5;
                    }
                    j3 = j4;
                }
                this.p = j3;
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
            this.n = 0;
            return 0;
        }
        int iJ = j();
        this.n = iJ;
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

    public final long q() {
        if (T() < 8) {
            return ((a() & 255) << 56) | (a() & 255) | ((a() & 255) << 8) | ((a() & 255) << 16) | ((a() & 255) << 24) | ((a() & 255) << 32) | ((a() & 255) << 40) | ((a() & 255) << 48);
        }
        this.p = 8 + this.p;
        return ((vwl.a(r13 + 6) & 255) << 48) | ((vwl.a(2 + r13) & 255) << 16) | (vwl.a(r13) & 255) | ((vwl.a(1 + r13) & 255) << 8) | ((vwl.a(3 + r13) & 255) << 24) | ((vwl.a(r13 + 4) & 255) << 32) | ((vwl.a(r13 + 5) & 255) << 40) | ((vwl.a(r13 + 7) & 255) << 56);
    }

    @Override // defpackage.vte
    public final long r() {
        long j;
        long j2;
        long j3 = this.p;
        if (this.s != j3) {
            long j4 = j3 + 1;
            byte bA = vwl.a(j3);
            if (bA >= 0) {
                this.p++;
                return bA;
            }
            if (this.s - this.p >= 10) {
                long j5 = 2 + j3;
                int iA = (vwl.a(j4) << 7) ^ bA;
                if (iA < 0) {
                    j = iA ^ (-128);
                } else {
                    long j6 = 3 + j3;
                    int iA2 = (vwl.a(j5) << 14) ^ iA;
                    if (iA2 >= 0) {
                        j = iA2 ^ 16256;
                    } else {
                        long j7 = 4 + j3;
                        int iA3 = iA2 ^ (vwl.a(j6) << 21);
                        if (iA3 < 0) {
                            j = (-2080896) ^ iA3;
                            j5 = j7;
                        } else {
                            j6 = 5 + j3;
                            long jA = (vwl.a(j7) << 28) ^ iA3;
                            if (jA >= 0) {
                                j = 266354560 ^ jA;
                            } else {
                                long j8 = 6 + j3;
                                long jA2 = jA ^ (vwl.a(j6) << 35);
                                if (jA2 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    long j9 = 7 + j3;
                                    long jA3 = jA2 ^ (vwl.a(j8) << 42);
                                    if (jA3 >= 0) {
                                        j = 4363953127296L ^ jA3;
                                    } else {
                                        j8 = 8 + j3;
                                        jA2 = jA3 ^ (vwl.a(j9) << 49);
                                        if (jA2 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            j9 = 9 + j3;
                                            long jA4 = (jA2 ^ (vwl.a(j8) << 56)) ^ 71499008037633920L;
                                            if (jA4 < 0) {
                                                long j10 = j3 + 10;
                                                if (vwl.a(j9) >= 0) {
                                                    j5 = j10;
                                                    j = jA4;
                                                }
                                            } else {
                                                j = jA4;
                                            }
                                        }
                                    }
                                    j5 = j9;
                                }
                                j = j2 ^ jA2;
                                j5 = j8;
                            }
                        }
                    }
                    j5 = j6;
                }
                this.p = j5;
                return j;
            }
        }
        return s();
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
        int iJ = j();
        if (iJ > 0) {
            long j = this.s;
            long j2 = this.p;
            long j3 = iJ;
            if (j3 <= j - j2) {
                if (this.j) {
                    int i = (int) (j2 - this.r);
                    vsz vszVarU = vsz.u(U(i, iJ + i));
                    this.p += j3;
                    return vszVarU;
                }
                byte[] bArr = new byte[iJ];
                vwl.k(j2, bArr, 0L, j3);
                this.p += j3;
                vsz vszVar = vsz.b;
                return new vsw(bArr);
            }
        }
        if (iJ <= 0 || iJ > G()) {
            if (iJ == 0) {
                return vsz.b;
            }
            if (iJ < 0) {
                throw new vuq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new vuq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (!this.j) {
            byte[] bArr2 = new byte[iJ];
            Y(bArr2, iJ);
            vsz vszVar2 = vsz.b;
            return new vsw(bArr2);
        }
        ArrayList arrayList = new ArrayList();
        while (iJ > 0) {
            if (T() == 0) {
                V();
            }
            int iMin = Math.min(iJ, (int) T());
            int i2 = (int) (this.p - this.r);
            arrayList.add(vsz.u(U(i2, i2 + iMin)));
            iJ -= iMin;
            this.p += iMin;
        }
        return vsz.p(arrayList);
    }

    @Override // defpackage.vte
    public final String x() throws vuq {
        int iJ = j();
        if (iJ > 0) {
            long j = this.s;
            long j2 = this.p;
            long j3 = iJ;
            if (j3 <= j - j2) {
                byte[] bArr = new byte[iJ];
                vwl.k(j2, bArr, 0L, j3);
                String str = new String(bArr, vuo.a);
                this.p += j3;
                return str;
            }
        }
        if (iJ > 0 && iJ <= G()) {
            byte[] bArr2 = new byte[iJ];
            Y(bArr2, iJ);
            return new String(bArr2, vuo.a);
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
            long j = this.s;
            long j2 = this.p;
            long j3 = iJ;
            if (j3 <= j - j2) {
                String strD = vwn.d(this.i, (int) (j2 - this.q), iJ);
                this.p += j3;
                return strD;
            }
        }
        if (iJ >= 0 && iJ <= G()) {
            byte[] bArr = new byte[iJ];
            Y(bArr, iJ);
            int i = vwn.a;
            return vxr.n(bArr, 0, iJ);
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
        if (this.n != i) {
            throw new vuq("Protocol message end-group tag did not match expected tag.");
        }
    }
}
