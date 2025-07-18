package defpackage;

import java.nio.ByteBuffer;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vth extends vtj {
    private final byte[] a;
    private final int b;
    private int c;

    public vth(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int i3 = i + i2;
        int length = bArr.length;
        if ((i | i2 | (length - i3)) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        this.a = bArr;
        this.c = i;
        this.b = i3;
    }

    @Override // defpackage.vtj
    public final void A(String str) throws vti {
        int i = this.c;
        try {
            int iAc = ac(str.length() * 3);
            int iAc2 = ac(str.length());
            if (iAc2 != iAc) {
                D(vwn.b(str));
                this.c = vwn.a(str, this.a, this.c, c());
                return;
            }
            int i2 = i + iAc2;
            this.c = i2;
            int iA = vwn.a(str, this.a, i2, c());
            this.c = i;
            D((iA - i) - iAc2);
            this.c = iA;
        } catch (IndexOutOfBoundsException e) {
            throw new vti(e);
        } catch (vwm e2) {
            this.c = i;
            aj(str, e2);
        }
    }

    @Override // defpackage.vtj
    public final void B(int i, int i2) throws vti {
        D(vwq.c(i, i2));
    }

    @Override // defpackage.vtj
    public final void C(int i, int i2) throws vti {
        B(i, 0);
        D(i2);
    }

    @Override // defpackage.vtj
    public final void D(int i) throws vti {
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
                    throw new vti(i3, this.b, 1, e);
                }
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                throw new vti(i3, this.b, 1, e);
            }
        }
        i2 = i3 + 1;
        this.a[i3] = (byte) i;
        this.c = i2;
    }

    @Override // defpackage.vtj
    public final void E(int i, long j) throws vti {
        B(i, 0);
        F(j);
    }

    @Override // defpackage.vtj
    public final void F(long j) throws vti {
        int i;
        int i2;
        int i3 = this.c;
        if (!vtj.e || c() < 10) {
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
                    throw new vti(i3, this.b, 1, e);
                }
            }
            i = i3 + 1;
            try {
                this.a[i3] = (byte) j;
            } catch (IndexOutOfBoundsException e3) {
                e = e3;
                i3 = i;
                throw new vti(i3, this.b, 1, e);
            }
        } else {
            while ((j & (-128)) != 0) {
                vwl.n(this.a, i3, (byte) (((int) j) | 128));
                j >>>= 7;
                i3++;
            }
            i = i3 + 1;
            vwl.n(this.a, i3, (byte) j);
        }
        this.c = i;
    }

    @Override // defpackage.vtj
    public final void G(byte[] bArr, int i) throws vti {
        D(i);
        e(bArr, 0, i);
    }

    @Override // defpackage.vsq
    public final void a(ByteBuffer byteBuffer) throws vti {
        d(byteBuffer);
    }

    @Override // defpackage.vtj, defpackage.vsq
    public final void b(byte[] bArr, int i, int i2) throws vti {
        e(bArr, i, i2);
    }

    @Override // defpackage.vtj
    public final int c() {
        return this.b - this.c;
    }

    public final void d(ByteBuffer byteBuffer) throws vti {
        int iRemaining = byteBuffer.remaining();
        try {
            byteBuffer.get(this.a, this.c, iRemaining);
            this.c += iRemaining;
        } catch (IndexOutOfBoundsException e) {
            throw new vti(this.c, this.b, iRemaining, e);
        }
    }

    public final void e(byte[] bArr, int i, int i2) throws vti {
        try {
            System.arraycopy(bArr, i, this.a, this.c, i2);
            this.c += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new vti(this.c, this.b, i2, e);
        }
    }

    @Override // defpackage.vtj
    public final void k(byte b) throws vti {
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
            throw new vti(i2, this.b, 1, e);
        }
    }

    @Override // defpackage.vtj
    public final void m(int i, boolean z) throws vti {
        B(i, 0);
        k(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.vtj
    public final void n(int i, vsz vszVar) throws vti {
        B(i, 2);
        o(vszVar);
    }

    @Override // defpackage.vtj
    public final void o(vsz vszVar) throws vti {
        D(vszVar.d());
        vszVar.m(this);
    }

    @Override // defpackage.vtj
    public final void p(int i, int i2) throws vti {
        B(i, 5);
        q(i2);
    }

    @Override // defpackage.vtj
    public final void q(int i) throws vti {
        int i2 = this.c;
        try {
            byte[] bArr = this.a;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.c = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new vti(i2, this.b, 4, e);
        }
    }

    @Override // defpackage.vtj
    public final void r(int i, long j) throws vti {
        B(i, 1);
        s(j);
    }

    @Override // defpackage.vtj
    public final void s(long j) throws vti {
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
            throw new vti(i, this.b, 8, e);
        }
    }

    @Override // defpackage.vtj
    public final void t(int i, int i2) throws vti {
        B(i, 0);
        u(i2);
    }

    @Override // defpackage.vtj
    public final void u(int i) throws vti {
        if (i >= 0) {
            D(i);
        } else {
            F(i);
        }
    }

    @Override // defpackage.vtj
    public final void v(int i, vvj vvjVar, vvy vvyVar) throws vti {
        B(i, 2);
        D(((vsg) vvjVar).d(vvyVar));
        vvyVar.m(vvjVar, this.f);
    }

    @Override // defpackage.vtj
    public final void w(vvj vvjVar) throws vti {
        D(vvjVar.l());
        vvjVar.dO(this);
    }

    @Override // defpackage.vtj
    public final void x(int i, vvj vvjVar) throws vti {
        B(1, 3);
        C(2, i);
        B(3, 2);
        w(vvjVar);
        B(1, 4);
    }

    @Override // defpackage.vtj
    public final void y(int i, vsz vszVar) throws vti {
        B(1, 3);
        C(2, i);
        n(3, vszVar);
        B(1, 4);
    }

    @Override // defpackage.vtj
    public final void z(int i, String str) throws vti {
        B(i, 2);
        A(str);
    }

    @Override // defpackage.vtj
    public final void j() {
    }
}
