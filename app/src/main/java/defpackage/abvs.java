package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abvs extends abvt {
    public static final /* synthetic */ int a = 0;
    private final ByteBuffer h;
    private final long i;
    private long j;
    private long k;
    private final long l;
    private int m;
    private int n;
    private int o = Integer.MAX_VALUE;

    public abvs(ByteBuffer byteBuffer) {
        this.h = byteBuffer.duplicate();
        long jA = acah.a(byteBuffer);
        this.i = jA;
        this.j = byteBuffer.limit() + jA;
        long jPosition = jA + byteBuffer.position();
        this.k = jPosition;
        this.l = jPosition;
    }

    private final int G() {
        return (int) (this.j - this.k);
    }

    private final void R() {
        long j = this.j + this.m;
        this.j = j;
        int i = (int) (j - this.l);
        int i2 = this.o;
        if (i <= i2) {
            this.m = 0;
            return;
        }
        int i3 = i - i2;
        this.m = i3;
        this.j = j - i3;
    }

    @Override // defpackage.abvt
    public final void A(int i) {
        this.o = i;
        R();
    }

    public final void B(int i) throws abxv {
        if (i >= 0 && i <= G()) {
            this.k += i;
        } else {
            if (i >= 0) {
                throw new abxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            throw new abxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    @Override // defpackage.abvt
    public final boolean C() {
        return this.k == this.j;
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
            if (G() < 10) {
                while (i3 < 10) {
                    if (a() < 0) {
                        i3++;
                    }
                }
                throw new abxv("CodedInputStream encountered a malformed varint.");
            }
            while (i3 < 10) {
                long j = this.k;
                this.k = 1 + j;
                if (acah.a.a(j) < 0) {
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
    public final byte[] F() throws abxv {
        int iJ = j();
        if (iJ < 0 || iJ > G()) {
            if (iJ > 0) {
                throw new abxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (iJ == 0) {
                return abxt.b;
            }
            throw new abxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArr = new byte[iJ];
        long j = this.k;
        long j2 = iJ;
        long j3 = j + j2;
        ByteBuffer byteBuffer = this.h;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        try {
            try {
                long j4 = this.i;
                byteBuffer.position((int) (j - j4));
                byteBuffer.limit((int) (j3 - j4));
                ByteBuffer byteBufferSlice = byteBuffer.slice();
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
                byteBufferSlice.get(bArr);
                this.k += j2;
                return bArr;
            } catch (IllegalArgumentException e) {
                abxv abxvVar = new abxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                abxvVar.initCause(e);
                throw abxvVar;
            }
        } catch (Throwable th) {
            byteBuffer.position(iPosition);
            byteBuffer.limit(iLimit);
            throw th;
        }
    }

    public final byte a() throws abxv {
        long j = this.k;
        if (j == this.j) {
            throw new abxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.k = 1 + j;
        return acah.a.a(j);
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
        return (int) (this.k - this.l);
    }

    @Override // defpackage.abvt
    public final int e(int i) throws abxv {
        if (i < 0) {
            throw new abxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int iD = i + d();
        int i2 = this.o;
        if (iD > i2) {
            throw new abxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.o = iD;
        R();
        return i2;
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
        long j = this.k;
        if (this.j - j < 4) {
            throw new abxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.k = 4 + j;
        acag acagVar = acah.a;
        int iA = acagVar.a(j) & 255;
        int iA2 = acagVar.a(1 + j) & 255;
        int iA3 = acagVar.a(2 + j) & 255;
        return ((acagVar.a(j + 3) & 255) << 24) | (iA2 << 8) | iA | (iA3 << 16);
    }

    @Override // defpackage.abvt
    public final int j() {
        int i;
        long j = this.k;
        if (this.j != j) {
            long j2 = 1 + j;
            acag acagVar = acah.a;
            byte bA = acagVar.a(j);
            if (bA >= 0) {
                this.k = j2;
                return bA;
            }
            if (this.j - j2 >= 9) {
                long j3 = 2 + j;
                int iA = (acagVar.a(j2) << 7) ^ bA;
                if (iA < 0) {
                    i = iA ^ (-128);
                } else {
                    long j4 = 3 + j;
                    int iA2 = iA ^ (acagVar.a(j3) << 14);
                    if (iA2 >= 0) {
                        i = iA2 ^ 16256;
                    } else {
                        long j5 = 4 + j;
                        int iA3 = iA2 ^ (acagVar.a(j4) << 21);
                        if (iA3 < 0) {
                            i = (-2080896) ^ iA3;
                        } else {
                            j4 = 5 + j;
                            byte bA2 = acagVar.a(j5);
                            int i2 = (iA3 ^ (bA2 << 28)) ^ 266354560;
                            if (bA2 < 0) {
                                j5 = 6 + j;
                                if (acagVar.a(j4) < 0) {
                                    j4 = 7 + j;
                                    if (acagVar.a(j5) < 0) {
                                        j5 = 8 + j;
                                        if (acagVar.a(j4) < 0) {
                                            long j6 = 9 + j;
                                            if (acagVar.a(j5) < 0) {
                                                long j7 = j + 10;
                                                if (acagVar.a(j6) >= 0) {
                                                    j3 = j7;
                                                    i = i2;
                                                }
                                            } else {
                                                i = i2;
                                                j3 = j6;
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
                this.k = j3;
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
        long j = this.k;
        if (this.j - j < 8) {
            throw new abxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.k = 8 + j;
        acag acagVar = acah.a;
        long jA = acagVar.a(j);
        long jA2 = acagVar.a(1 + j);
        long jA3 = acagVar.a(2 + j);
        long jA4 = acagVar.a(3 + j);
        long jA5 = acagVar.a(4 + j);
        return ((acagVar.a(j + 7) & 255) << 56) | ((acagVar.a(j + 6) & 255) << 48) | (jA & 255) | ((jA2 & 255) << 8) | ((jA3 & 255) << 16) | ((jA4 & 255) << 24) | ((jA5 & 255) << 32) | ((acagVar.a(5 + j) & 255) << 40);
    }

    @Override // defpackage.abvt
    public final long r() {
        long j;
        long j2;
        long j3;
        long j4 = this.k;
        if (this.j != j4) {
            long j5 = 1 + j4;
            acag acagVar = acah.a;
            byte bA = acagVar.a(j4);
            if (bA >= 0) {
                this.k = j5;
                return bA;
            }
            if (this.j - j5 >= 9) {
                long j6 = 2 + j4;
                int iA = (acagVar.a(j5) << 7) ^ bA;
                if (iA < 0) {
                    j = iA ^ (-128);
                } else {
                    long j7 = 3 + j4;
                    int iA2 = iA ^ (acagVar.a(j6) << 14);
                    if (iA2 >= 0) {
                        j = iA2 ^ 16256;
                    } else {
                        long j8 = 4 + j4;
                        int iA3 = iA2 ^ (acagVar.a(j7) << 21);
                        if (iA3 < 0) {
                            j = (-2080896) ^ iA3;
                            j6 = j8;
                        } else {
                            j7 = 5 + j4;
                            long jA = iA3 ^ (acagVar.a(j8) << 28);
                            if (jA >= 0) {
                                j3 = 266354560;
                            } else {
                                long j9 = 6 + j4;
                                long jA2 = jA ^ (acagVar.a(j7) << 35);
                                if (jA2 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    j7 = 7 + j4;
                                    jA = jA2 ^ (acagVar.a(j9) << 42);
                                    if (jA >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        j9 = 8 + j4;
                                        jA2 = jA ^ (acagVar.a(j7) << 49);
                                        if (jA2 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            long j10 = 9 + j4;
                                            long jA3 = (jA2 ^ (acagVar.a(j9) << 56)) ^ 71499008037633920L;
                                            if (jA3 < 0) {
                                                long j11 = j4 + 10;
                                                if (acagVar.a(j10) >= 0) {
                                                    j6 = j11;
                                                    j = jA3;
                                                }
                                            } else {
                                                j = jA3;
                                                j6 = j10;
                                            }
                                        }
                                    }
                                }
                                j = j2 ^ jA2;
                                j6 = j9;
                            }
                            j = j3 ^ jA;
                        }
                    }
                    j6 = j7;
                }
                this.k = j6;
                return j;
            }
        }
        return s();
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
        int iJ = j();
        if (iJ <= 0 || iJ > G()) {
            if (iJ == 0) {
                return abvo.b;
            }
            if (iJ < 0) {
                throw new abxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new abxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = new byte[iJ];
        long j = iJ;
        acah.a.d(this.k, bArr, 0L, j);
        this.k += j;
        abvo abvoVar = abvo.b;
        return new abvm(bArr);
    }

    @Override // defpackage.abvt
    public final String x() throws abxv {
        int iJ = j();
        if (iJ <= 0 || iJ > G()) {
            if (iJ == 0) {
                return "";
            }
            if (iJ < 0) {
                throw new abxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new abxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = new byte[iJ];
        long j = iJ;
        acah.a.d(this.k, bArr, 0L, j);
        String str = new String(bArr, abxt.a);
        this.k += j;
        return str;
    }

    @Override // defpackage.abvt
    public final String y() throws abxv {
        int iJ = j();
        if (iJ <= 0 || iJ > G()) {
            if (iJ == 0) {
                return "";
            }
            if (iJ <= 0) {
                throw new abxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new abxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        String strB = acam.a.b(this.h, (int) (this.k - this.i), iJ);
        this.k += iJ;
        return strB;
    }

    @Override // defpackage.abvt
    public final void z(int i) throws abxv {
        if (this.n != i) {
            throw new abxv("Protocol message end-group tag did not match expected tag.");
        }
    }
}
