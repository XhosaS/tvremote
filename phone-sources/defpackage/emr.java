package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class emr extends ebv {
    public boolean e;
    public long f;
    private int g;
    private int h;
    private byte[] j;
    private byte[] m;
    private int i = 0;
    private int k = 0;
    private int l = 0;

    public emr() {
        a.H(true);
        byte[] bArr = edt.b;
        this.j = bArr;
        this.m = bArr;
    }

    private final int n(int i) {
        int i2 = this.g;
        return (i / i2) * i2;
    }

    private final int o(int i) {
        int iP = ((p(2000000L) - this.i) * this.g) - (this.j.length >> 1);
        a.ab(iP >= 0);
        return n((int) Math.min((i * 0.2f) + 0.5f, iP));
    }

    private final int p(long j) {
        return (int) ((j * this.b.b) / 1000000);
    }

    private static int q(byte b, byte b2) {
        return (b << 8) | (b2 & 255);
    }

    private final void r(boolean z) {
        int i;
        int length;
        int i2 = this.l;
        int length2 = this.j.length;
        if (i2 != length2) {
            if (!z) {
                return;
            } else {
                z = true;
            }
        }
        if (this.i == 0) {
            if (z) {
                s(i2, 3);
                length = i2;
            } else {
                a.ab(i2 >= (length2 >> 1));
                length = this.j.length >> 1;
                s(length, 0);
            }
            i = length;
        } else {
            int i3 = length2 >> 1;
            int i4 = i2 - i3;
            if (z) {
                int iO = o(i4) + (this.j.length >> 1);
                s(iO, 2);
                int i5 = i3 + i4;
                i = iO;
                length = i5;
            } else {
                int iO2 = o(i4);
                s(iO2, 1);
                i = iO2;
                length = i4;
            }
        }
        eci.b(length % this.g == 0, a.cf(length, "bytesConsumed is not aligned to frame size: %s"));
        a.ab(i2 >= i);
        this.l -= length;
        int i6 = this.k + length;
        this.k = i6;
        this.k = i6 % this.j.length;
        this.i = this.i + (i / this.g);
        this.f += (length - i) / r2;
    }

    private final void s(int i, int i2) {
        int i3;
        if (i == 0) {
            return;
        }
        a.H(this.l >= i);
        if (i2 == 2) {
            int i4 = this.k;
            int i5 = this.l;
            int i6 = i4 + i5;
            byte[] bArr = this.j;
            int length = bArr.length;
            if (i6 <= length) {
                System.arraycopy(bArr, i6 - i, this.m, 0, i);
            } else {
                int i7 = i5 - (length - i4);
                if (i7 >= i) {
                    System.arraycopy(bArr, i7 - i, this.m, 0, i);
                } else {
                    int i8 = i - i7;
                    System.arraycopy(bArr, length - i8, this.m, 0, i8);
                    System.arraycopy(this.j, 0, this.m, i8, i7);
                }
            }
        } else {
            int i9 = this.k;
            int i10 = i9 + i;
            byte[] bArr2 = this.j;
            int length2 = bArr2.length;
            if (i10 <= length2) {
                System.arraycopy(bArr2, i9, this.m, 0, i);
            } else {
                int i11 = length2 - i9;
                System.arraycopy(bArr2, i9, this.m, 0, i11);
                System.arraycopy(this.j, 0, this.m, i11, i - i11);
            }
        }
        eci.a(i % this.g == 0, a.cf(i, "sizeToOutput is not aligned to frame size: "));
        a.ab(this.k < this.j.length);
        byte[] bArr3 = this.m;
        eci.a(i % this.g == 0, a.cf(i, "byteOutput size is not aligned to frame size "));
        if (i2 != 3) {
            for (int i12 = 0; i12 < i; i12 += 2) {
                int i13 = i12 + 1;
                int iQ = q(bArr3[i13], bArr3[i12]);
                if (i2 == 0) {
                    i3 = ((((i12 * 1000) / (i - 1)) * (-90)) / 1000) + 100;
                } else {
                    i3 = 10;
                    if (i2 == 2) {
                        i3 = 10 + (((90000 * i12) / (i - 1)) / 1000);
                    }
                }
                int i14 = (iQ * i3) / 100;
                if (i14 >= 32767) {
                    bArr3[i12] = -1;
                    bArr3[i13] = Byte.MAX_VALUE;
                } else if (i14 <= -32768) {
                    bArr3[i12] = 0;
                    bArr3[i13] = Byte.MIN_VALUE;
                } else {
                    bArr3[i12] = (byte) (i14 & 255);
                    bArr3[i13] = (byte) (i14 >> 8);
                }
            }
        }
        j(i).put(bArr3, 0, i).flip();
    }

    private static final boolean t(byte b, byte b2) {
        return Math.abs(q(b, b2)) > 1024;
    }

    @Override // defpackage.ebu
    public final void e(ByteBuffer byteBuffer) {
        int iLimit;
        int i;
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.d.hasRemaining()) {
            if (this.h != 0) {
                a.ab(this.k < this.j.length);
                int iLimit2 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    } else {
                        if (t(byteBuffer.get(iPosition2), byteBuffer.get(iPosition2 - 1))) {
                            int i2 = this.g;
                            iLimit = i2 * (iPosition2 / i2);
                            break;
                        }
                        iPosition2 += 2;
                    }
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int i3 = this.k;
                int i4 = this.l;
                int i5 = i3 + i4;
                int length = this.j.length;
                if (i5 < length) {
                    i = length - i5;
                } else {
                    i5 = i4 - (length - i3);
                    i = i3 - i5;
                }
                int iMin = Math.min(iPosition3, i);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.j, i5, iMin);
                int i6 = this.l + iMin;
                this.l = i6;
                a.ab(i6 <= this.j.length);
                boolean z = iLimit < iLimit2 && iPosition3 < i;
                r(z);
                if (z) {
                    this.h = 0;
                    this.i = 0;
                }
                byteBuffer.limit(iLimit2);
            } else {
                int iLimit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit3, byteBuffer.position() + this.j.length));
                int iLimit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit4 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else {
                        if (t(byteBuffer.get(iLimit4), byteBuffer.get(iLimit4 - 1))) {
                            int i7 = this.g;
                            iPosition = ((iLimit4 / i7) * i7) + i7;
                            break;
                        }
                        iLimit4 -= 2;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.h = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    j(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit3);
            }
        }
    }

    @Override // defpackage.ebv, defpackage.ebu
    public final boolean g() {
        return super.g() && this.e;
    }

    @Override // defpackage.ebv
    protected final ebs i(ebs ebsVar) throws ebt {
        if (ebsVar.d == 2) {
            return ebsVar.b == -1 ? ebs.a : ebsVar;
        }
        throw new ebt(ebsVar);
    }

    @Override // defpackage.ebv
    public final void k() {
        if (g()) {
            int i = this.b.c;
            this.g = i + i;
            int iN = n(p(100000L) / 2);
            int i2 = iN + iN;
            if (this.j.length != i2) {
                this.j = new byte[i2];
                this.m = new byte[i2];
            }
        }
        this.h = 0;
        this.f = 0L;
        this.i = 0;
        this.k = 0;
        this.l = 0;
    }

    @Override // defpackage.ebv
    public final void l() {
        if (this.l > 0) {
            r(true);
            this.i = 0;
        }
    }

    @Override // defpackage.ebv
    public final void m() {
        this.e = false;
        byte[] bArr = edt.b;
        this.j = bArr;
        this.m = bArr;
    }
}
