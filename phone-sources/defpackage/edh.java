package defpackage;

import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class edh {
    public int a;
    public int b;
    public Object c;
    private int d;

    public edh(byte[] bArr, int i) {
        this.c = bArr;
        this.d = i;
    }

    public final int a() {
        return ((this.d - this.a) * 8) - this.b;
    }

    public final int b() {
        a.ab(this.b == 0);
        return this.a;
    }

    public final int c() {
        return (this.a * 8) + this.b;
    }

    public final int d(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.b += i;
        int i3 = 0;
        while (true) {
            i2 = this.b;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.b = i4;
            Object obj = this.c;
            int i5 = this.a;
            this.a = i5 + 1;
            i3 |= (((byte[]) obj)[i5] & 255) << i4;
        }
        Object obj2 = this.c;
        int i6 = this.a;
        int i7 = i3 | ((((byte[]) obj2)[i6] & 255) >> (8 - i2));
        int i8 = 32 - i;
        if (i2 == 8) {
            this.b = 0;
            this.a = i6 + 1;
        }
        int i9 = ((-1) >>> i8) & i7;
        g();
        return i9;
    }

    public final long e(int i) {
        return i <= 32 ? edt.E(d(i)) : edt.D(d(i - 32), d(32));
    }

    public final String f(int i, Charset charset) {
        byte[] bArr = new byte[i];
        r(bArr, i);
        return new String(bArr, charset);
    }

    public final void g() {
        int i;
        int i2 = this.a;
        boolean z = false;
        if (i2 >= 0 && (i2 < (i = this.d) || (i2 == i && this.b == 0))) {
            z = true;
        }
        a.ab(z);
    }

    public final void h() {
        if (this.b == 0) {
            return;
        }
        this.b = 0;
        this.a++;
        g();
    }

    public final void i(edi ediVar) {
        k(ediVar.a, ediVar.c);
        l(ediVar.b * 8);
    }

    public final void j(byte[] bArr) {
        k(bArr, bArr.length);
    }

    public final void k(byte[] bArr, int i) {
        this.c = bArr;
        this.a = 0;
        this.b = 0;
        this.d = i;
    }

    public final void l(int i) {
        int i2 = i / 8;
        this.a = i2;
        this.b = i - (i2 * 8);
        g();
    }

    public final void m() {
        int i = this.b + 1;
        this.b = i;
        if (i == 8) {
            this.b = 0;
            this.a++;
        }
        g();
    }

    public final void n(int i) {
        int i2 = i / 8;
        int i3 = this.a + i2;
        this.a = i3;
        int i4 = this.b + (i - (i2 * 8));
        this.b = i4;
        if (i4 > 7) {
            this.a = i3 + 1;
            this.b = i4 - 8;
        }
        g();
    }

    public final void o(int i) {
        a.ab(this.b == 0);
        this.a += i;
        g();
    }

    public final boolean p() {
        int i = ((byte[]) this.c)[this.a] & (128 >> this.b);
        m();
        return i != 0;
    }

    public final void q(byte[] bArr, int i) {
        int i2;
        int i3 = 0;
        while (true) {
            i2 = i >> 3;
            if (i3 >= i2) {
                break;
            }
            Object obj = this.c;
            int i4 = this.a;
            int i5 = i4 + 1;
            this.a = i5;
            byte[] bArr2 = (byte[]) obj;
            byte b = bArr2[i4];
            int i6 = this.b;
            byte b2 = (byte) (b << i6);
            bArr[i3] = b2;
            bArr[i3] = (byte) (((bArr2[i5] & 255) >> (8 - i6)) | b2);
            i3++;
        }
        int i7 = i & 7;
        if (i7 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i2] & (255 >> i7));
        bArr[i2] = b3;
        int i8 = this.b;
        if (i8 + i7 > 8) {
            Object obj2 = this.c;
            int i9 = this.a;
            this.a = i9 + 1;
            b3 = (byte) (b3 | ((((byte[]) obj2)[i9] & 255) << i8));
            bArr[i2] = b3;
            i8 -= 8;
        }
        int i10 = i8 + i7;
        this.b = i10;
        Object obj3 = this.c;
        int i11 = this.a;
        bArr[i2] = (byte) (((byte) (((255 & ((byte[]) obj3)[i11]) >> (8 - i10)) << (8 - i7))) | b3);
        if (i10 == 8) {
            this.b = 0;
            this.a = i11 + 1;
        }
        g();
    }

    public final void r(byte[] bArr, int i) {
        a.ab(this.b == 0);
        System.arraycopy(this.c, this.a, bArr, 0, i);
        this.a += i;
        g();
    }

    public final int s() {
        int i = this.d;
        if (i == this.a) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i2 = ((int[]) this.c)[i];
        this.d = (i + 1) & this.b;
        return i2;
    }

    public final void t(int i) {
        Object obj = this.c;
        int i2 = this.a;
        int[] iArr = (int[]) obj;
        iArr[i2] = i;
        int i3 = this.b & (i2 + 1);
        this.a = i3;
        int i4 = this.d;
        if (i3 == i4) {
            int length = iArr.length;
            int i5 = length - i4;
            int i6 = length + length;
            if (i6 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            int[] iArr2 = new int[i6];
            yfm.bh(iArr, iArr2, 0, i4, length);
            yfm.bh((int[]) this.c, iArr2, i5, 0, this.d);
            this.c = iArr2;
            this.d = 0;
            this.a = length;
            this.b = i6 - 1;
        }
    }

    public final void u() {
        this.a = this.d;
    }

    public final boolean v() {
        return this.d == this.a;
    }

    public edh(char[] cArr) {
        int i = 8;
        if (Integer.bitCount(8) != 1) {
            int iHighestOneBit = Integer.highestOneBit(7);
            i = iHighestOneBit + iHighestOneBit;
        }
        this.b = i - 1;
        this.c = new int[i];
    }

    public edh() {
        this.c = edt.b;
    }

    public edh(byte[] bArr) {
        this(bArr, bArr.length);
    }
}
