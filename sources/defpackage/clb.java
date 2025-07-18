package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
final class clb extends cld {
    private final byte[] a;
    private final int b;
    private int c;

    public clb(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i)));
        }
        this.a = bArr;
        this.c = 0;
        this.b = i;
    }

    @Override // defpackage.cld
    public final void A(int i, int i2) throws clc {
        C(coi.c(i, i2));
    }

    @Override // defpackage.cld
    public final void B(int i, int i2) throws clc {
        A(i, 0);
        C(i2);
    }

    @Override // defpackage.cld
    public final void C(int i) throws clc {
        int i2;
        int i3 = this.c;
        while ((i & (-128)) != 0) {
            try {
                i2 = i3 + 1;
                try {
                    this.a[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                    i3 = i2;
                    throw new clc(i3, this.b, 1, e);
                }
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                throw new clc(i3, this.b, 1, e);
            }
        }
        i2 = i3 + 1;
        this.a[i3] = (byte) i;
        this.c = i2;
    }

    @Override // defpackage.cld
    public final void D(int i, long j) throws clc {
        A(i, 0);
        E(j);
    }

    @Override // defpackage.cld
    public final void E(long j) throws clc {
        int i;
        int i2;
        int i3 = this.c;
        if (!cld.e || b() < 10) {
            while ((j & (-128)) != 0) {
                try {
                    i2 = i3 + 1;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                }
                try {
                    this.a[i3] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e2) {
                    e = e2;
                    i3 = i2;
                    throw new clc(i3, this.b, 1, e);
                }
            }
            i = i3 + 1;
            try {
                this.a[i3] = (byte) j;
            } catch (IndexOutOfBoundsException e3) {
                e = e3;
                i3 = i;
                throw new clc(i3, this.b, 1, e);
            }
        } else {
            while ((j & (-128)) != 0) {
                cod.k(this.a, i3, (byte) (((int) j) | 128));
                j >>>= 7;
                i3++;
            }
            i = i3 + 1;
            cod.k(this.a, i3, (byte) j);
        }
        this.c = i;
    }

    @Override // defpackage.cld
    public final void F(byte[] bArr, int i) throws clc {
        C(i);
        c(bArr, 0, i);
    }

    @Override // defpackage.cld, defpackage.ckn
    public final void a(byte[] bArr, int i, int i2) throws clc {
        c(bArr, i, i2);
    }

    @Override // defpackage.cld
    public final int b() {
        return this.b - this.c;
    }

    public final void c(byte[] bArr, int i, int i2) throws clc {
        try {
            System.arraycopy(bArr, i, this.a, this.c, i2);
            this.c += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new clc(this.c, this.b, i2, e);
        }
    }

    @Override // defpackage.cld
    public final void j(byte b) throws clc {
        int i;
        int i2 = this.c;
        try {
            i = i2 + 1;
        } catch (IndexOutOfBoundsException e) {
            e = e;
        }
        try {
            this.a[i2] = b;
            this.c = i;
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            i2 = i;
            throw new clc(i2, this.b, 1, e);
        }
    }

    @Override // defpackage.cld
    public final void l(int i, boolean z) throws clc {
        A(i, 0);
        j(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.cld
    public final void m(int i, ckv ckvVar) throws clc {
        A(i, 2);
        n(ckvVar);
    }

    @Override // defpackage.cld
    public final void n(ckv ckvVar) throws clc {
        C(ckvVar.d());
        ckvVar.k(this);
    }

    @Override // defpackage.cld
    public final void o(int i, int i2) throws clc {
        A(i, 5);
        p(i2);
    }

    @Override // defpackage.cld
    public final void p(int i) throws clc {
        int i2 = this.c;
        try {
            byte[] bArr = this.a;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.c = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new clc(i2, this.b, 4, e);
        }
    }

    @Override // defpackage.cld
    public final void q(int i, long j) throws clc {
        A(i, 1);
        r(j);
    }

    @Override // defpackage.cld
    public final void r(long j) throws clc {
        int i = this.c;
        try {
            byte[] bArr = this.a;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.c = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new clc(i, this.b, 8, e);
        }
    }

    @Override // defpackage.cld
    public final void s(int i, int i2) throws clc {
        A(i, 0);
        t(i2);
    }

    @Override // defpackage.cld
    public final void t(int i) throws clc {
        if (i >= 0) {
            C(i);
        } else {
            E(i);
        }
    }

    @Override // defpackage.cld
    public final void u(int i, cmz cmzVar, cno cnoVar) throws clc {
        A(i, 2);
        C(((cke) cmzVar).c(cnoVar));
        cnoVar.m(cmzVar, this.f);
    }

    @Override // defpackage.cld
    public final void v(cmz cmzVar) throws clc {
        C(cmzVar.n());
        cmzVar.e(this);
    }

    @Override // defpackage.cld
    public final void w(int i, cmz cmzVar) throws clc {
        A(1, 3);
        B(2, i);
        A(3, 2);
        v(cmzVar);
        A(1, 4);
    }

    @Override // defpackage.cld
    public final void x(int i, ckv ckvVar) throws clc {
        A(1, 3);
        B(2, i);
        m(3, ckvVar);
        A(1, 4);
    }

    @Override // defpackage.cld
    public final void y(int i, String str) throws clc {
        A(i, 2);
        z(str);
    }

    @Override // defpackage.cld
    public final void z(String str) throws clc {
        int i = this.c;
        try {
            int iAb = ab(str.length() * 3);
            int iAb2 = ab(str.length());
            if (iAb2 != iAb) {
                C(cof.b(str));
                this.c = cof.a(str, this.a, this.c, b());
                return;
            }
            int i2 = i + iAb2;
            this.c = i2;
            int iA = cof.a(str, this.a, i2, b());
            this.c = i;
            C((iA - i) - iAb2);
            this.c = iA;
        } catch (coe e) {
            this.c = i;
            ai(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new clc(e2);
        }
    }

    @Override // defpackage.cld
    public final void i() {
    }
}
