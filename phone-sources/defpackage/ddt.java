package defpackage;

import android.support.v7.widget.ActivityChooserView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ddt extends ddv {
    public int b;
    private final byte[] i;
    private int j;
    public int d = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    public int a = 0;
    public int c = 0;

    public ddt(byte[] bArr) {
        this.i = bArr;
    }

    public final byte a() throws der {
        int i = this.c;
        if (i == this.a) {
            throw new der("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.i;
        this.c = i + 1;
        return bArr[i];
    }

    @Override // defpackage.ddv
    public final double b() {
        throw null;
    }

    @Override // defpackage.ddv
    public final float c() {
        throw null;
    }

    @Override // defpackage.ddv
    public final int d() {
        throw null;
    }

    @Override // defpackage.ddv
    public final int e(int i) {
        throw null;
    }

    public final int f() throws der {
        int i;
        int i2 = this.c;
        int i3 = this.a;
        if (i3 != i2) {
            byte[] bArr = this.i;
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
        long j = 0;
        for (int i13 = 0; i13 < 64; i13 += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i13;
            if ((a() & 128) == 0) {
                return (int) j;
            }
        }
        throw new der("CodedInputStream encountered a malformed varint.");
    }

    @Override // defpackage.ddv
    public final int g() {
        throw null;
    }

    @Override // defpackage.ddv
    public final int h() throws der {
        if (this.c == this.a) {
            this.j = 0;
            return 0;
        }
        int iF = f();
        this.j = iF;
        if (dgn.a(iF) != 0) {
            return iF;
        }
        throw new der("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.ddv
    public final long i() {
        throw null;
    }

    @Override // defpackage.ddv
    public final void j(int i) {
        throw null;
    }

    @Override // defpackage.ddv
    public final void k(int i) {
        throw null;
    }

    public final void l(int i) throws der {
        if (i >= 0) {
            int i2 = this.a;
            int i3 = this.c;
            if (i <= i2 - i3) {
                this.c = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw new der("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new der("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // defpackage.ddv
    public final boolean m() {
        throw null;
    }

    @Override // defpackage.ddv
    public final boolean n() {
        throw null;
    }

    @Override // defpackage.ddv
    public final boolean o(int i) throws der {
        int iB = dgn.b(i);
        int i2 = 0;
        if (iB == 0) {
            if (this.a - this.c < 10) {
                while (i2 < 10) {
                    if (a() < 0) {
                        i2++;
                    }
                }
                throw new der("CodedInputStream encountered a malformed varint.");
            }
            while (i2 < 10) {
                byte[] bArr = this.i;
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
            l(8);
            return true;
        }
        if (iB == 2) {
            l(f());
            return true;
        }
        if (iB == 3) {
            x();
            if (this.j == dgn.c(dgn.a(i), 4)) {
                return true;
            }
            throw new der("Protocol message end-group tag did not match expected tag.");
        }
        if (iB == 4) {
            return false;
        }
        if (iB != 5) {
            throw new deq();
        }
        l(4);
        return true;
    }
}
