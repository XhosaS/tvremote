package defpackage;

import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abvq extends abvt {
    private final Iterable a;
    private final Iterator h;
    private ByteBuffer i;
    private int j;
    private int k;
    private int m;
    private long o;
    private long p;
    private long q;
    private int l = Integer.MAX_VALUE;
    private int n = 0;

    public abvq(Iterable iterable, int i) {
        this.j = i;
        this.a = iterable;
        this.h = iterable.iterator();
        if (i != 0) {
            T();
            return;
        }
        this.i = abxt.c;
        this.o = 0L;
        this.p = 0L;
        this.q = 0L;
    }

    private final int G() {
        return (int) (((this.j - this.n) - this.o) + this.p);
    }

    private final void R() throws abxv {
        if (!this.h.hasNext()) {
            throw new abxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        T();
    }

    private final void S() {
        int i = this.j + this.k;
        this.j = i;
        int i2 = this.l;
        if (i <= i2) {
            this.k = 0;
            return;
        }
        int i3 = i - i2;
        this.k = i3;
        this.j = i - i3;
    }

    private final void T() {
        ByteBuffer byteBuffer = (ByteBuffer) this.h.next();
        this.i = byteBuffer;
        this.n += (int) (this.o - this.p);
        long jPosition = byteBuffer.position();
        this.o = jPosition;
        this.p = jPosition;
        this.q = this.i.limit();
        long jA = acah.a(this.i);
        this.o += jA;
        this.p += jA;
        this.q += jA;
    }

    private final void U(byte[] bArr, int i) throws abxv {
        if (i > G()) {
            if (i > 0) {
                throw new abxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            return;
        }
        int i2 = i;
        while (i2 > 0) {
            if (this.q - this.o == 0) {
                R();
            }
            int iMin = Math.min(i2, (int) (this.q - this.o));
            long j = iMin;
            acah.a.d(this.o, bArr, i - i2, j);
            i2 -= iMin;
            this.o += j;
        }
    }

    @Override // defpackage.abvt
    public final void A(int i) {
        this.l = i;
        S();
    }

    public final void B(int i) throws abxv {
        if (i >= 0) {
            if (i <= ((this.j - this.n) - this.o) + this.p) {
                while (i > 0) {
                    if (this.q - this.o == 0) {
                        R();
                    }
                    int iMin = Math.min(i, (int) (this.q - this.o));
                    i -= iMin;
                    this.o += iMin;
                }
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
        return (((long) this.n) + this.o) - this.p == ((long) this.j);
    }

    @Override // defpackage.abvt
    public final boolean D() {
        return r() != 0;
    }

    @Override // defpackage.abvt
    public final boolean E(int i) throws abxv {
        int i2 = i & 7;
        if (i2 == 0) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (a() >= 0) {
                    return true;
                }
            }
            throw new abxv("CodedInputStream encountered a malformed varint.");
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
        if (iJ >= 0) {
            long j = this.q;
            long j2 = this.o;
            long j3 = iJ;
            if (j3 <= j - j2) {
                byte[] bArr = new byte[iJ];
                acah.a.d(j2, bArr, 0L, j3);
                this.o += j3;
                return bArr;
            }
        }
        if (iJ >= 0 && iJ <= G()) {
            byte[] bArr2 = new byte[iJ];
            U(bArr2, iJ);
            return bArr2;
        }
        if (iJ > 0) {
            throw new abxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (iJ == 0) {
            return abxt.b;
        }
        throw new abxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public final byte a() throws abxv {
        if (this.q - this.o == 0) {
            R();
        }
        long j = this.o;
        this.o = 1 + j;
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
        return (int) ((this.n + this.o) - this.p);
    }

    @Override // defpackage.abvt
    public final int e(int i) throws abxv {
        if (i < 0) {
            throw new abxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int iD = i + d();
        int i2 = this.l;
        if (iD > i2) {
            throw new abxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.l = iD;
        S();
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

    public final int i() {
        long j = this.q;
        long j2 = this.o;
        if (j - j2 < 4) {
            int iA = a() & 255;
            int iA2 = (a() & 255) << 8;
            return iA | iA2 | ((a() & 255) << 16) | ((a() & 255) << 24);
        }
        this.o = 4 + j2;
        acag acagVar = acah.a;
        int iA3 = acagVar.a(j2) & 255;
        int iA4 = (acagVar.a(1 + j2) & 255) << 8;
        return ((acagVar.a(j2 + 3) & 255) << 24) | iA3 | iA4 | ((acagVar.a(2 + j2) & 255) << 16);
    }

    @Override // defpackage.abvt
    public final int j() {
        int i;
        long j = this.o;
        if (this.q != j) {
            long j2 = j + 1;
            acag acagVar = acah.a;
            byte bA = acagVar.a(j);
            if (bA >= 0) {
                this.o++;
                return bA;
            }
            if (this.q - this.o >= 10) {
                long j3 = 2 + j;
                int iA = (acagVar.a(j2) << 7) ^ bA;
                if (iA < 0) {
                    i = iA ^ (-128);
                } else {
                    long j4 = 3 + j;
                    int iA2 = (acagVar.a(j3) << 14) ^ iA;
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
                                            j4 = 9 + j;
                                            if (acagVar.a(j5) < 0) {
                                                long j6 = j + 10;
                                                if (acagVar.a(j4) >= 0) {
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
                this.o = j3;
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
            this.m = 0;
            return 0;
        }
        int iJ = j();
        this.m = iJ;
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

    public final long q() {
        long j = this.q;
        long j2 = this.o;
        if (j - j2 < 8) {
            return ((a() & 255) << 56) | (a() & 255) | ((a() & 255) << 8) | ((a() & 255) << 16) | ((a() & 255) << 24) | ((a() & 255) << 32) | ((a() & 255) << 40) | ((a() & 255) << 48);
        }
        this.o = 8 + j2;
        acag acagVar = acah.a;
        long jA = acagVar.a(j2) & 255;
        long jA2 = (acagVar.a(j2 + 1) & 255) << 8;
        long jA3 = (acagVar.a(j2 + 2) & 255) << 16;
        long jA4 = (acagVar.a(3 + j2) & 255) << 24;
        long jA5 = (acagVar.a(j2 + 4) & 255) << 32;
        return ((acagVar.a(j2 + 7) & 255) << 56) | jA | jA2 | jA3 | jA4 | jA5 | ((acagVar.a(j2 + 5) & 255) << 40) | ((acagVar.a(j2 + 6) & 255) << 48);
    }

    @Override // defpackage.abvt
    public final long r() {
        long j;
        long j2;
        long j3;
        long j4 = this.o;
        if (this.q != j4) {
            long j5 = j4 + 1;
            acag acagVar = acah.a;
            byte bA = acagVar.a(j4);
            if (bA >= 0) {
                this.o++;
                return bA;
            }
            if (this.q - this.o >= 10) {
                long j6 = 2 + j4;
                int iA = (acagVar.a(j5) << 7) ^ bA;
                if (iA < 0) {
                    j = iA ^ (-128);
                } else {
                    long j7 = 3 + j4;
                    int iA2 = (acagVar.a(j6) << 14) ^ iA;
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
                            long jA = (acagVar.a(j8) << 28) ^ iA3;
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
                                            j7 = 9 + j4;
                                            long jA3 = (jA2 ^ (acagVar.a(j9) << 56)) ^ 71499008037633920L;
                                            if (jA3 < 0) {
                                                long j10 = j4 + 10;
                                                if (acagVar.a(j7) >= 0) {
                                                    j6 = j10;
                                                    j = jA3;
                                                }
                                            } else {
                                                j = jA3;
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
                this.o = j6;
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
        if (iJ > 0) {
            long j = this.q;
            long j2 = this.o;
            long j3 = iJ;
            if (j3 <= j - j2) {
                byte[] bArr = new byte[iJ];
                acah.a.d(j2, bArr, 0L, j3);
                this.o += j3;
                abvo abvoVar = abvo.b;
                return new abvm(bArr);
            }
        }
        if (iJ > 0 && iJ <= G()) {
            byte[] bArr2 = new byte[iJ];
            U(bArr2, iJ);
            abvo abvoVar2 = abvo.b;
            return new abvm(bArr2);
        }
        if (iJ == 0) {
            return abvo.b;
        }
        if (iJ < 0) {
            throw new abxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new abxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // defpackage.abvt
    public final String x() throws abxv {
        int iJ = j();
        if (iJ > 0) {
            long j = this.q;
            long j2 = this.o;
            long j3 = iJ;
            if (j3 <= j - j2) {
                byte[] bArr = new byte[iJ];
                acah.a.d(j2, bArr, 0L, j3);
                String str = new String(bArr, abxt.a);
                this.o += j3;
                return str;
            }
        }
        if (iJ > 0 && iJ <= G()) {
            byte[] bArr2 = new byte[iJ];
            U(bArr2, iJ);
            return new String(bArr2, abxt.a);
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
            long j = this.q;
            long j2 = this.o;
            long j3 = iJ;
            if (j3 <= j - j2) {
                String strB = acam.a.b(this.i, (int) (j2 - this.p), iJ);
                this.o += j3;
                return strB;
            }
        }
        if (iJ >= 0 && iJ <= G()) {
            byte[] bArr = new byte[iJ];
            U(bArr, iJ);
            return acam.a.c(bArr, 0, iJ);
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
        if (this.m != i) {
            throw new abxv("Protocol message end-group tag did not match expected tag.");
        }
    }
}
