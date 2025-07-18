package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vtd extends vte {
    public static final /* synthetic */ int a = 0;
    private final ByteBuffer h;
    private final long i;
    private long j;
    private long k;
    private final long l;
    private int m;
    private int n;
    private boolean o;
    private int p = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;

    public vtd(ByteBuffer byteBuffer) {
        this.h = byteBuffer.duplicate();
        long jE = vwl.e(byteBuffer);
        this.i = jE;
        this.j = byteBuffer.limit() + jE;
        long jPosition = jE + byteBuffer.position();
        this.k = jPosition;
        this.l = jPosition;
    }

    private final int G(long j) {
        return (int) (j - this.i);
    }

    private final int T() {
        return (int) (this.j - this.k);
    }

    private final ByteBuffer U(long j, long j2) {
        ByteBuffer byteBuffer = this.h;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        try {
            try {
                byteBuffer.position(G(j));
                byteBuffer.limit(G(j2));
                return byteBuffer.slice();
            } catch (IllegalArgumentException e) {
                vuq vuqVar = new vuq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                vuqVar.initCause(e);
                throw vuqVar;
            }
        } finally {
            byteBuffer.position(iPosition);
            byteBuffer.limit(iLimit);
        }
    }

    private final void V() {
        long j = this.j + this.m;
        this.j = j;
        int i = (int) (j - this.l);
        int i2 = this.p;
        if (i <= i2) {
            this.m = 0;
            return;
        }
        int i3 = i - i2;
        this.m = i3;
        this.j = j - i3;
    }

    @Override // defpackage.vte
    public final void A(int i) {
        this.p = i;
        V();
    }

    public final void B(int i) throws vuq {
        if (i >= 0 && i <= T()) {
            this.k += i;
        } else {
            if (i >= 0) {
                throw new vuq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            throw new vuq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    @Override // defpackage.vte
    public final boolean C() {
        return this.k == this.j;
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
            if (T() < 10) {
                while (i2 < 10) {
                    if (a() < 0) {
                        i2++;
                    }
                }
                throw new vuq("CodedInputStream encountered a malformed varint.");
            }
            while (i2 < 10) {
                long j = this.k;
                this.k = 1 + j;
                if (vwl.a(j) < 0) {
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
        if (iJ < 0 || iJ > T()) {
            if (iJ > 0) {
                throw new vuq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (iJ == 0) {
                return vuo.b;
            }
            throw new vuq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArr = new byte[iJ];
        long j = this.k;
        long j2 = iJ;
        U(j, j + j2).get(bArr);
        this.k += j2;
        return bArr;
    }

    @Override // defpackage.vte
    public final void H() {
        this.o = true;
    }

    public final byte a() throws vuq {
        long j = this.k;
        if (j == this.j) {
            throw new vuq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.k = 1 + j;
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
        return (int) (this.k - this.l);
    }

    @Override // defpackage.vte
    public final int e(int i) throws vuq {
        if (i < 0) {
            throw new vuq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int iD = i + d();
        int i2 = this.p;
        if (iD > i2) {
            throw new vuq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.p = iD;
        V();
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
        long j = this.k;
        if (this.j - j < 4) {
            throw new vuq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.k = 4 + j;
        int iA = vwl.a(j) & 255;
        int iA2 = vwl.a(1 + j) & 255;
        int iA3 = vwl.a(2 + j) & 255;
        return ((vwl.a(j + 3) & 255) << 24) | (iA2 << 8) | iA | (iA3 << 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
    
        if (defpackage.vwl.a(r3) >= 0) goto L33;
     */
    @Override // defpackage.vte
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int j() {
        /*
            r9 = this;
            long r0 = r9.k
            long r2 = r9.j
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto L92
        La:
            r2 = 1
            long r2 = r2 + r0
            byte r4 = defpackage.vwl.a(r0)
            if (r4 < 0) goto L16
            r9.k = r2
            return r4
        L16:
            long r5 = r9.j
            long r5 = r5 - r2
            r7 = 9
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 < 0) goto L92
            r5 = 2
            long r5 = r5 + r0
            byte r2 = defpackage.vwl.a(r2)
            int r2 = r2 << 7
            r2 = r2 ^ r4
            if (r2 >= 0) goto L2e
            r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L8f
        L2e:
            r3 = 3
            long r3 = r3 + r0
            byte r5 = defpackage.vwl.a(r5)
            int r5 = r5 << 14
            r2 = r2 ^ r5
            if (r2 < 0) goto L3e
            r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
        L3c:
            r5 = r3
            goto L8f
        L3e:
            r5 = 4
            long r5 = r5 + r0
            byte r3 = defpackage.vwl.a(r3)
            int r3 = r3 << 21
            r2 = r2 ^ r3
            if (r2 >= 0) goto L4f
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L8f
        L4f:
            r3 = 5
            long r3 = r3 + r0
            byte r5 = defpackage.vwl.a(r5)
            int r6 = r5 << 28
            r2 = r2 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r2 = r2 ^ r6
            if (r5 >= 0) goto L8d
            r5 = 6
            long r5 = r5 + r0
            byte r3 = defpackage.vwl.a(r3)
            if (r3 >= 0) goto L8b
            r3 = 7
            long r3 = r3 + r0
            byte r5 = defpackage.vwl.a(r5)
            if (r5 >= 0) goto L8d
            r5 = 8
            long r5 = r5 + r0
            byte r3 = defpackage.vwl.a(r3)
            if (r3 >= 0) goto L8b
            long r3 = r0 + r7
            byte r5 = defpackage.vwl.a(r5)
            if (r5 >= 0) goto L8d
            r5 = 10
            long r5 = r5 + r0
            byte r0 = defpackage.vwl.a(r3)
            if (r0 < 0) goto L92
        L8b:
            r0 = r2
            goto L8f
        L8d:
            r0 = r2
            goto L3c
        L8f:
            r9.k = r5
            return r0
        L92:
            long r0 = r9.s()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vtd.j():int");
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

    public final long q() throws vuq {
        long j = this.k;
        if (this.j - j < 8) {
            throw new vuq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.k = 8 + j;
        long jA = vwl.a(j);
        long jA2 = vwl.a(1 + j);
        long jA3 = vwl.a(2 + j);
        long jA4 = vwl.a(3 + j);
        long jA5 = vwl.a(4 + j);
        return ((vwl.a(j + 7) & 255) << 56) | (jA & 255) | ((jA2 & 255) << 8) | ((jA3 & 255) << 16) | ((jA4 & 255) << 24) | ((jA5 & 255) << 32) | ((vwl.a(5 + j) & 255) << 40) | ((vwl.a(6 + j) & 255) << 48);
    }

    @Override // defpackage.vte
    public final long r() {
        long j;
        long j2;
        int i;
        long j3 = this.k;
        if (this.j != j3) {
            long j4 = 1 + j3;
            byte bA = vwl.a(j3);
            if (bA >= 0) {
                this.k = j4;
                return bA;
            }
            if (this.j - j4 >= 9) {
                long j5 = 2 + j3;
                int iA = (vwl.a(j4) << 7) ^ bA;
                if (iA >= 0) {
                    long j6 = 3 + j3;
                    int iA2 = iA ^ (vwl.a(j5) << 14);
                    if (iA2 >= 0) {
                        j = iA2 ^ 16256;
                    } else {
                        j5 = 4 + j3;
                        int iA3 = iA2 ^ (vwl.a(j6) << 21);
                        if (iA3 < 0) {
                            i = (-2080896) ^ iA3;
                        } else {
                            j6 = 5 + j3;
                            long jA = (vwl.a(j5) << 28) ^ iA3;
                            if (jA < 0) {
                                long j7 = 6 + j3;
                                long jA2 = (vwl.a(j6) << 35) ^ jA;
                                if (jA2 >= 0) {
                                    long j8 = 7 + j3;
                                    long jA3 = jA2 ^ (vwl.a(j7) << 42);
                                    if (jA3 >= 0) {
                                        j = 4363953127296L ^ jA3;
                                        j5 = j8;
                                    } else {
                                        j7 = 8 + j3;
                                        jA2 = jA3 ^ (vwl.a(j8) << 49);
                                        if (jA2 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            j5 = j3 + 9;
                                            long jA4 = (jA2 ^ (vwl.a(j7) << 56)) ^ 71499008037633920L;
                                            if (jA4 < 0) {
                                                long j9 = j3 + 10;
                                                if (vwl.a(j5) >= 0) {
                                                    j5 = j9;
                                                }
                                            }
                                            j = jA4;
                                        }
                                    }
                                    this.k = j5;
                                    return j;
                                }
                                j2 = -34093383808L;
                                j = j2 ^ jA2;
                                j5 = j7;
                                this.k = j5;
                                return j;
                            }
                            j = 266354560 ^ jA;
                        }
                    }
                    j5 = j6;
                    this.k = j5;
                    return j;
                }
                i = iA ^ (-128);
                j = i;
                this.k = j5;
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
        if (iJ <= 0 || iJ > T()) {
            if (iJ == 0) {
                return vsz.b;
            }
            if (iJ < 0) {
                throw new vuq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new vuq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        long j = iJ;
        if (this.o) {
            long j2 = this.k;
            ByteBuffer byteBufferU = U(j2, j2 + j);
            this.k += j;
            return vsz.u(byteBufferU);
        }
        byte[] bArr = new byte[iJ];
        vwl.k(this.k, bArr, 0L, j);
        this.k += j;
        vsz vszVar = vsz.b;
        return new vsw(bArr);
    }

    @Override // defpackage.vte
    public final String x() throws vuq {
        int iJ = j();
        if (iJ <= 0 || iJ > T()) {
            if (iJ == 0) {
                return "";
            }
            if (iJ < 0) {
                throw new vuq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new vuq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = new byte[iJ];
        long j = iJ;
        vwl.k(this.k, bArr, 0L, j);
        String str = new String(bArr, vuo.a);
        this.k += j;
        return str;
    }

    @Override // defpackage.vte
    public final String y() throws vuq {
        int iJ = j();
        if (iJ > 0 && iJ <= T()) {
            String strD = vwn.d(this.h, G(this.k), iJ);
            this.k += iJ;
            return strD;
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
