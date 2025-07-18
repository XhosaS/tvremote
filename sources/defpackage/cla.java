package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cla extends cld {
    final byte[] a;
    final int b;
    int c;
    int d;
    private final OutputStream g;

    public cla(OutputStream outputStream, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i, 20)];
        this.a = bArr;
        this.b = bArr.length;
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.g = outputStream;
    }

    private final void aA(int i) throws IOException {
        if (this.b - this.c < i) {
            az();
        }
    }

    private final void az() throws IOException {
        this.g.write(this.a, 0, this.c);
        this.c = 0;
    }

    @Override // defpackage.cld
    public final void A(int i, int i2) throws IOException {
        C(coi.c(i, i2));
    }

    @Override // defpackage.cld
    public final void B(int i, int i2) throws IOException {
        aA(20);
        f(i, 0);
        g(i2);
    }

    @Override // defpackage.cld
    public final void C(int i) throws IOException {
        aA(5);
        g(i);
    }

    @Override // defpackage.cld
    public final void D(int i, long j) throws IOException {
        aA(20);
        f(i, 0);
        h(j);
    }

    @Override // defpackage.cld
    public final void E(long j) throws IOException {
        aA(10);
        h(j);
    }

    @Override // defpackage.cld
    public final void F(byte[] bArr, int i) throws IOException {
        C(i);
        k(bArr, 0, i);
    }

    @Override // defpackage.cld, defpackage.ckn
    public final void a(byte[] bArr, int i, int i2) throws IOException {
        k(bArr, i, i2);
    }

    @Override // defpackage.cld
    public final int b() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    final void c(byte b) {
        byte[] bArr = this.a;
        int i = this.c;
        bArr[i] = b;
        this.c = i + 1;
        this.d++;
    }

    final void d(int i) {
        int i2 = this.c;
        byte[] bArr = this.a;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.c = i2 + 4;
        this.d += 4;
    }

    final void e(long j) {
        int i = this.c;
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
        this.d += 8;
    }

    final void f(int i, int i2) {
        g(coi.c(i, i2));
    }

    final void g(int i) {
        if (!cld.e) {
            while ((i & (-128)) != 0) {
                byte[] bArr = this.a;
                int i2 = this.c;
                this.c = i2 + 1;
                bArr[i2] = (byte) (i | 128);
                this.d++;
                i >>>= 7;
            }
            byte[] bArr2 = this.a;
            int i3 = this.c;
            this.c = i3 + 1;
            bArr2[i3] = (byte) i;
            this.d++;
            return;
        }
        long j = this.c;
        while ((i & (-128)) != 0) {
            byte[] bArr3 = this.a;
            int i4 = this.c;
            this.c = i4 + 1;
            cod.k(bArr3, i4, (byte) (i | 128));
            i >>>= 7;
        }
        byte[] bArr4 = this.a;
        int i5 = this.c;
        this.c = i5 + 1;
        cod.k(bArr4, i5, (byte) i);
        this.d += (int) (this.c - j);
    }

    final void h(long j) {
        if (cld.e) {
            long j2 = this.c;
            while (true) {
                int i = (int) j;
                if ((j & (-128)) == 0) {
                    byte[] bArr = this.a;
                    int i2 = this.c;
                    this.c = i2 + 1;
                    cod.k(bArr, i2, (byte) i);
                    this.d += (int) (this.c - j2);
                    return;
                }
                byte[] bArr2 = this.a;
                int i3 = this.c;
                this.c = i3 + 1;
                cod.k(bArr2, i3, (byte) (i | 128));
                j >>>= 7;
            }
        } else {
            while (true) {
                int i4 = (int) j;
                if ((j & (-128)) == 0) {
                    byte[] bArr3 = this.a;
                    int i5 = this.c;
                    this.c = i5 + 1;
                    bArr3[i5] = (byte) i4;
                    this.d++;
                    return;
                }
                byte[] bArr4 = this.a;
                int i6 = this.c;
                this.c = i6 + 1;
                bArr4[i6] = (byte) (i4 | 128);
                this.d++;
                j >>>= 7;
            }
        }
    }

    @Override // defpackage.cld
    public final void i() throws IOException {
        if (this.c > 0) {
            az();
        }
    }

    @Override // defpackage.cld
    public final void j(byte b) throws IOException {
        if (this.c == this.b) {
            az();
        }
        c(b);
    }

    public final void k(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.b;
        int i4 = this.c;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, this.a, i4, i2);
            this.c += i2;
            this.d += i2;
            return;
        }
        byte[] bArr2 = this.a;
        System.arraycopy(bArr, i, bArr2, i4, i5);
        int i6 = i + i5;
        this.c = i3;
        this.d += i5;
        az();
        int i7 = i2 - i5;
        if (i7 <= i3) {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.c = i7;
        } else {
            this.g.write(bArr, i6, i7);
        }
        this.d += i7;
    }

    @Override // defpackage.cld
    public final void l(int i, boolean z) throws IOException {
        aA(11);
        f(i, 0);
        c(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.cld
    public final void m(int i, ckv ckvVar) throws IOException {
        A(i, 2);
        n(ckvVar);
    }

    @Override // defpackage.cld
    public final void n(ckv ckvVar) throws IOException {
        C(ckvVar.d());
        ckvVar.k(this);
    }

    @Override // defpackage.cld
    public final void o(int i, int i2) throws IOException {
        aA(14);
        f(i, 5);
        d(i2);
    }

    @Override // defpackage.cld
    public final void p(int i) throws IOException {
        aA(4);
        d(i);
    }

    @Override // defpackage.cld
    public final void q(int i, long j) throws IOException {
        aA(18);
        f(i, 1);
        e(j);
    }

    @Override // defpackage.cld
    public final void r(long j) throws IOException {
        aA(8);
        e(j);
    }

    @Override // defpackage.cld
    public final void s(int i, int i2) throws IOException {
        aA(20);
        f(i, 0);
        if (i2 >= 0) {
            g(i2);
        } else {
            h(i2);
        }
    }

    @Override // defpackage.cld
    public final void t(int i) throws IOException {
        if (i >= 0) {
            C(i);
        } else {
            E(i);
        }
    }

    @Override // defpackage.cld
    public final void u(int i, cmz cmzVar, cno cnoVar) throws IOException {
        A(i, 2);
        C(((cke) cmzVar).c(cnoVar));
        cnoVar.m(cmzVar, this.f);
    }

    @Override // defpackage.cld
    public final void v(cmz cmzVar) throws IOException {
        C(cmzVar.n());
        cmzVar.e(this);
    }

    @Override // defpackage.cld
    public final void w(int i, cmz cmzVar) throws IOException {
        A(1, 3);
        B(2, i);
        A(3, 2);
        v(cmzVar);
        A(1, 4);
    }

    @Override // defpackage.cld
    public final void x(int i, ckv ckvVar) throws IOException {
        A(1, 3);
        B(2, i);
        m(3, ckvVar);
        A(1, 4);
    }

    @Override // defpackage.cld
    public final void y(int i, String str) throws IOException {
        A(i, 2);
        z(str);
    }

    @Override // defpackage.cld
    public final void z(String str) throws IOException {
        int iB;
        try {
            int length = str.length() * 3;
            int iAb = ab(length);
            int i = iAb + length;
            int i2 = this.b;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int iA = cof.a(str, bArr, 0, length);
                C(iA);
                k(bArr, 0, iA);
                return;
            }
            if (i > i2 - this.c) {
                az();
            }
            int iAb2 = ab(str.length());
            int i3 = this.c;
            try {
                if (iAb2 == iAb) {
                    int i4 = i3 + iAb2;
                    this.c = i4;
                    int iA2 = cof.a(str, this.a, i4, i2 - i4);
                    this.c = i3;
                    iB = (iA2 - i3) - iAb2;
                    g(iB);
                    this.c = iA2;
                } else {
                    iB = cof.b(str);
                    g(iB);
                    this.c = cof.a(str, this.a, this.c, iB);
                }
                this.d += iB;
            } catch (coe e) {
                this.d -= this.c - i3;
                this.c = i3;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new clc(e2);
            }
        } catch (coe e3) {
            ai(str, e3);
        }
    }
}
