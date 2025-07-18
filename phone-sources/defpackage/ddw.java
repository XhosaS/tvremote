package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddw extends ddz {
    final byte[] a;
    final int b;
    public int c;
    int d;
    private final OutputStream g;

    public ddw(OutputStream outputStream, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i, 20)];
        this.a = bArr;
        this.b = bArr.length;
        this.g = outputStream;
    }

    private final void au(int i) throws IOException {
        if (this.b - this.c < i) {
            i();
        }
    }

    @Override // defpackage.ddz
    public final void A(int i, int i2) throws IOException {
        au(20);
        f(i, 0);
        g(i2);
    }

    @Override // defpackage.ddz
    public final void B(int i) throws IOException {
        au(5);
        g(i);
    }

    @Override // defpackage.ddz
    public final void C(int i, long j) throws IOException {
        au(20);
        f(i, 0);
        h(j);
    }

    @Override // defpackage.ddz
    public final void D(long j) throws IOException {
        au(10);
        h(j);
    }

    @Override // defpackage.ddz
    public final void E(byte[] bArr, int i) throws IOException {
        B(i);
        F(bArr, i);
    }

    public final void F(byte[] bArr, int i) throws IOException {
        int i2 = this.b;
        int i3 = this.c;
        int i4 = i2 - i3;
        if (i4 >= i) {
            System.arraycopy(bArr, 0, this.a, i3, i);
            this.c += i;
            this.d += i;
            return;
        }
        byte[] bArr2 = this.a;
        System.arraycopy(bArr, 0, bArr2, i3, i4);
        this.c = i2;
        this.d += i4;
        i();
        int i5 = i - i4;
        if (i5 <= i2) {
            System.arraycopy(bArr, i4, bArr2, 0, i5);
            this.c = i5;
        } else {
            this.g.write(bArr, i4, i5);
        }
        this.d += i5;
    }

    @Override // defpackage.ddz, defpackage.ddm
    public final void a(byte[] bArr, int i) throws IOException {
        F(bArr, i);
    }

    @Override // defpackage.ddz
    public final int b() {
        throw null;
    }

    final void c(byte b) {
        int i = this.c;
        this.c = i + 1;
        this.a[i] = b;
        this.d++;
    }

    final void d(int i) {
        int i2 = this.c;
        int i3 = i2 + 1;
        this.c = i3;
        byte[] bArr = this.a;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.c = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i2 + 3;
        this.c = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.c = i2 + 4;
        bArr[i5] = (byte) ((i >> 24) & 255);
        this.d += 4;
    }

    final void e(long j) {
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        byte[] bArr = this.a;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.c = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i + 3;
        this.c = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i + 4;
        this.c = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i + 5;
        this.c = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i + 6;
        this.c = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i + 7;
        this.c = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.c = i + 8;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        this.d += 8;
    }

    final void f(int i, int i2) {
        g(dgn.c(i, i2));
    }

    final void g(int i) {
        if (!ddz.e) {
            while ((i & (-128)) != 0) {
                byte[] bArr = this.a;
                int i2 = this.c;
                this.c = i2 + 1;
                bArr[i2] = (byte) ((i | 128) & 255);
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
            dgf.k(bArr3, i4, (byte) ((i | 128) & 255));
            i >>>= 7;
        }
        byte[] bArr4 = this.a;
        int i5 = this.c;
        this.c = i5 + 1;
        dgf.k(bArr4, i5, (byte) i);
        this.d += (int) (this.c - j);
    }

    final void h(long j) {
        if (ddz.e) {
            long j2 = this.c;
            while (true) {
                int i = (int) j;
                if ((j & (-128)) == 0) {
                    byte[] bArr = this.a;
                    int i2 = this.c;
                    this.c = i2 + 1;
                    dgf.k(bArr, i2, (byte) i);
                    this.d += (int) (this.c - j2);
                    return;
                }
                byte[] bArr2 = this.a;
                int i3 = this.c;
                this.c = i3 + 1;
                dgf.k(bArr2, i3, (byte) ((i | 128) & 255));
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
                bArr4[i6] = (byte) ((i4 | 128) & 255);
                this.d++;
                j >>>= 7;
            }
        }
    }

    public final void i() throws IOException {
        this.g.write(this.a, 0, this.c);
        this.c = 0;
    }

    @Override // defpackage.ddz
    public final void j(byte b) throws IOException {
        if (this.c == this.b) {
            i();
        }
        c(b);
    }

    @Override // defpackage.ddz
    public final void k(int i, boolean z) throws IOException {
        au(11);
        f(i, 0);
        c(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.ddz
    public final void l(int i, dds ddsVar) throws IOException {
        z(i, 2);
        m(ddsVar);
    }

    @Override // defpackage.ddz
    public final void m(dds ddsVar) throws IOException {
        B(ddsVar.c());
        ddsVar.f(this);
    }

    @Override // defpackage.ddz
    public final void n(int i, int i2) throws IOException {
        au(14);
        f(i, 5);
        d(i2);
    }

    @Override // defpackage.ddz
    public final void o(int i) throws IOException {
        au(4);
        d(i);
    }

    @Override // defpackage.ddz
    public final void p(int i, long j) throws IOException {
        au(18);
        f(i, 1);
        e(j);
    }

    @Override // defpackage.ddz
    public final void q(long j) throws IOException {
        au(8);
        e(j);
    }

    @Override // defpackage.ddz
    public final void r(int i, int i2) throws IOException {
        au(20);
        f(i, 0);
        if (i2 >= 0) {
            g(i2);
        } else {
            h(i2);
        }
    }

    @Override // defpackage.ddz
    public final void s(int i) throws IOException {
        if (i >= 0) {
            B(i);
        } else {
            D(i);
        }
    }

    @Override // defpackage.ddz
    public final void t(int i, dfh dfhVar, dfs dfsVar) throws IOException {
        z(i, 2);
        B(((ddi) dfhVar).c(dfsVar));
        dfsVar.j(dfhVar, this.f);
    }

    @Override // defpackage.ddz
    public final void u(dfh dfhVar) throws IOException {
        B(dfhVar.h());
        dfhVar.r(this);
    }

    @Override // defpackage.ddz
    public final void v(int i, dfh dfhVar) throws IOException {
        z(1, 3);
        A(2, i);
        z(3, 2);
        u(dfhVar);
        z(1, 4);
    }

    @Override // defpackage.ddz
    public final void w(int i, dds ddsVar) throws IOException {
        z(1, 3);
        A(2, i);
        l(3, ddsVar);
        z(1, 4);
    }

    @Override // defpackage.ddz
    public final void x(int i, String str) throws IOException {
        z(i, 2);
        y(str);
    }

    @Override // defpackage.ddz
    public final void y(String str) throws IOException {
        int iB;
        try {
            int length = str.length() * 3;
            int iY = Y(length);
            int i = iY + length;
            int i2 = this.b;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int iA = dgk.a(str, bArr, 0, length);
                B(iA);
                F(bArr, iA);
                return;
            }
            if (i > i2 - this.c) {
                i();
            }
            int iY2 = Y(str.length());
            int i3 = this.c;
            try {
                try {
                    if (iY2 == iY) {
                        int i4 = i3 + iY2;
                        this.c = i4;
                        int iA2 = dgk.a(str, this.a, i4, i2 - i4);
                        this.c = i3;
                        iB = (iA2 - i3) - iY2;
                        g(iB);
                        this.c = iA2;
                    } else {
                        iB = dgk.b(str);
                        g(iB);
                        this.c = dgk.a(str, this.a, this.c, iB);
                    }
                    this.d += iB;
                } catch (dgi e) {
                    this.d -= this.c - i3;
                    this.c = i3;
                    throw e;
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new ddy(e2);
            }
        } catch (dgi e3) {
            ad(str, e3);
        }
    }

    @Override // defpackage.ddz
    public final void z(int i, int i2) throws IOException {
        B(dgn.c(i, i2));
    }
}
