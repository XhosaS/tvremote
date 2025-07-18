package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vtg extends vtj {
    final byte[] a;
    final int b;
    int c;
    int d;
    private final OutputStream g;

    public vtg(OutputStream outputStream, int i) {
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

    private final void aA() throws IOException {
        this.g.write(this.a, 0, this.c);
        this.c = 0;
    }

    private final void aB(int i) throws IOException {
        if (this.b - this.c < i) {
            aA();
        }
    }

    @Override // defpackage.vtj
    public final void A(String str) throws IOException {
        int iB;
        try {
            int length = str.length() * 3;
            int iAc = ac(length);
            int i = iAc + length;
            int i2 = this.b;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int iA = vwn.a(str, bArr, 0, length);
                D(iA);
                l(bArr, 0, iA);
                return;
            }
            if (i > i2 - this.c) {
                aA();
            }
            int iAc2 = ac(str.length());
            int i3 = this.c;
            try {
                if (iAc2 == iAc) {
                    int i4 = i3 + iAc2;
                    this.c = i4;
                    int iA2 = vwn.a(str, this.a, i4, i2 - i4);
                    this.c = i3;
                    iB = (iA2 - i3) - iAc2;
                    h(iB);
                    this.c = iA2;
                } else {
                    iB = vwn.b(str);
                    h(iB);
                    this.c = vwn.a(str, this.a, this.c, iB);
                }
                this.d += iB;
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new vti(e);
            } catch (vwm e2) {
                this.d -= this.c - i3;
                this.c = i3;
                throw e2;
            }
        } catch (vwm e3) {
            aj(str, e3);
        }
    }

    @Override // defpackage.vtj
    public final void B(int i, int i2) throws IOException {
        D(vwq.c(i, i2));
    }

    @Override // defpackage.vtj
    public final void C(int i, int i2) throws IOException {
        aB(20);
        g(i, 0);
        h(i2);
    }

    @Override // defpackage.vtj
    public final void D(int i) throws IOException {
        aB(5);
        h(i);
    }

    @Override // defpackage.vtj
    public final void E(int i, long j) throws IOException {
        aB(20);
        g(i, 0);
        i(j);
    }

    @Override // defpackage.vtj
    public final void F(long j) throws IOException {
        aB(10);
        i(j);
    }

    @Override // defpackage.vtj
    public final void G(byte[] bArr, int i) throws IOException {
        D(i);
        l(bArr, 0, i);
    }

    @Override // defpackage.vsq
    public final void a(ByteBuffer byteBuffer) throws IOException {
        int iRemaining = byteBuffer.remaining();
        int i = this.b;
        int i2 = this.c;
        int i3 = i - i2;
        if (i3 >= iRemaining) {
            byteBuffer.get(this.a, i2, iRemaining);
            this.c += iRemaining;
            this.d += iRemaining;
            return;
        }
        byte[] bArr = this.a;
        byteBuffer.get(bArr, i2, i3);
        this.c = i;
        this.d += i3;
        aA();
        int i4 = iRemaining - i3;
        while (i4 > i) {
            byteBuffer.get(bArr, 0, i);
            this.g.write(bArr, 0, i);
            this.d += i;
            i4 -= i;
        }
        byteBuffer.get(bArr, 0, i4);
        this.c = i4;
        this.d += i4;
    }

    @Override // defpackage.vtj, defpackage.vsq
    public final void b(byte[] bArr, int i, int i2) throws IOException {
        l(bArr, i, i2);
    }

    @Override // defpackage.vtj
    public final int c() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    final void d(byte b) {
        byte[] bArr = this.a;
        int i = this.c;
        bArr[i] = b;
        this.c = i + 1;
        this.d++;
    }

    final void e(int i) {
        int i2 = this.c;
        byte[] bArr = this.a;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.c = i2 + 4;
        this.d += 4;
    }

    final void f(long j) {
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

    final void g(int i, int i2) {
        h(vwq.c(i, i2));
    }

    final void h(int i) {
        if (!vtj.e) {
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
            vwl.n(bArr3, i4, (byte) (i | 128));
            i >>>= 7;
        }
        byte[] bArr4 = this.a;
        int i5 = this.c;
        this.c = i5 + 1;
        vwl.n(bArr4, i5, (byte) i);
        this.d += (int) (this.c - j);
    }

    final void i(long j) {
        if (vtj.e) {
            long j2 = this.c;
            while (true) {
                int i = (int) j;
                if ((j & (-128)) == 0) {
                    byte[] bArr = this.a;
                    int i2 = this.c;
                    this.c = i2 + 1;
                    vwl.n(bArr, i2, (byte) i);
                    this.d += (int) (this.c - j2);
                    return;
                }
                byte[] bArr2 = this.a;
                int i3 = this.c;
                this.c = i3 + 1;
                vwl.n(bArr2, i3, (byte) (i | 128));
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

    @Override // defpackage.vtj
    public final void j() throws IOException {
        if (this.c > 0) {
            aA();
        }
    }

    @Override // defpackage.vtj
    public final void k(byte b) throws IOException {
        if (this.c == this.b) {
            aA();
        }
        d(b);
    }

    public final void l(byte[] bArr, int i, int i2) throws IOException {
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
        aA();
        int i7 = i2 - i5;
        if (i7 <= i3) {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.c = i7;
        } else {
            this.g.write(bArr, i6, i7);
        }
        this.d += i7;
    }

    @Override // defpackage.vtj
    public final void m(int i, boolean z) throws IOException {
        aB(11);
        g(i, 0);
        d(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.vtj
    public final void n(int i, vsz vszVar) throws IOException {
        B(i, 2);
        o(vszVar);
    }

    @Override // defpackage.vtj
    public final void o(vsz vszVar) throws IOException {
        D(vszVar.d());
        vszVar.m(this);
    }

    @Override // defpackage.vtj
    public final void p(int i, int i2) throws IOException {
        aB(14);
        g(i, 5);
        e(i2);
    }

    @Override // defpackage.vtj
    public final void q(int i) throws IOException {
        aB(4);
        e(i);
    }

    @Override // defpackage.vtj
    public final void r(int i, long j) throws IOException {
        aB(18);
        g(i, 1);
        f(j);
    }

    @Override // defpackage.vtj
    public final void s(long j) throws IOException {
        aB(8);
        f(j);
    }

    @Override // defpackage.vtj
    public final void t(int i, int i2) throws IOException {
        aB(20);
        g(i, 0);
        if (i2 >= 0) {
            h(i2);
        } else {
            i(i2);
        }
    }

    @Override // defpackage.vtj
    public final void u(int i) throws IOException {
        if (i >= 0) {
            D(i);
        } else {
            F(i);
        }
    }

    @Override // defpackage.vtj
    public final void v(int i, vvj vvjVar, vvy vvyVar) throws IOException {
        B(i, 2);
        D(((vsg) vvjVar).d(vvyVar));
        vvyVar.m(vvjVar, this.f);
    }

    @Override // defpackage.vtj
    public final void w(vvj vvjVar) throws IOException {
        D(vvjVar.l());
        vvjVar.dO(this);
    }

    @Override // defpackage.vtj
    public final void x(int i, vvj vvjVar) throws IOException {
        B(1, 3);
        C(2, i);
        B(3, 2);
        w(vvjVar);
        B(1, 4);
    }

    @Override // defpackage.vtj
    public final void y(int i, vsz vszVar) throws IOException {
        B(1, 3);
        C(2, i);
        n(3, vszVar);
        B(1, 4);
    }

    @Override // defpackage.vtj
    public final void z(int i, String str) throws IOException {
        B(i, 2);
        A(str);
    }
}
