package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ddx extends ddz {
    private final byte[] a;
    private final int b;
    private int c;

    public ddx(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i)));
        }
        this.a = bArr;
        this.c = 0;
        this.b = i;
    }

    @Override // defpackage.ddz
    public final void A(int i, int i2) throws ddy {
        z(i, 0);
        B(i2);
    }

    @Override // defpackage.ddz
    public final void B(int i) throws ddy {
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.a;
                int i2 = this.c;
                this.c = i2 + 1;
                bArr[i2] = (byte) ((i | 128) & 255);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new ddy(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.c), Integer.valueOf(this.b), 1), e);
            }
        }
        byte[] bArr2 = this.a;
        int i3 = this.c;
        this.c = i3 + 1;
        bArr2[i3] = (byte) i;
    }

    @Override // defpackage.ddz
    public final void C(int i, long j) throws ddy {
        z(i, 0);
        D(j);
    }

    @Override // defpackage.ddz
    public final void D(long j) throws ddy {
        if (!ddz.e || b() < 10) {
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr = this.a;
                    int i = this.c;
                    this.c = i + 1;
                    bArr[i] = (byte) ((((int) j) | 128) & 255);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new ddy(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.c), Integer.valueOf(this.b), 1), e);
                }
            }
            byte[] bArr2 = this.a;
            int i2 = this.c;
            this.c = i2 + 1;
            bArr2[i2] = (byte) j;
            return;
        }
        while (true) {
            int i3 = (int) j;
            if ((j & (-128)) == 0) {
                byte[] bArr3 = this.a;
                int i4 = this.c;
                this.c = i4 + 1;
                dgf.k(bArr3, i4, (byte) i3);
                return;
            }
            byte[] bArr4 = this.a;
            int i5 = this.c;
            this.c = i5 + 1;
            dgf.k(bArr4, i5, (byte) ((i3 | 128) & 255));
            j >>>= 7;
        }
    }

    @Override // defpackage.ddz
    public final void E(byte[] bArr, int i) throws ddy {
        B(i);
        c(bArr, i);
    }

    @Override // defpackage.ddz, defpackage.ddm
    public final void a(byte[] bArr, int i) throws ddy {
        c(bArr, i);
    }

    @Override // defpackage.ddz
    public final int b() {
        return this.b - this.c;
    }

    public final void c(byte[] bArr, int i) throws ddy {
        try {
            System.arraycopy(bArr, 0, this.a, this.c, i);
            this.c += i;
        } catch (IndexOutOfBoundsException e) {
            throw new ddy(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.c), Integer.valueOf(this.b), Integer.valueOf(i)), e);
        }
    }

    @Override // defpackage.ddz
    public final void j(byte b) throws ddy {
        try {
            byte[] bArr = this.a;
            int i = this.c;
            this.c = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new ddy(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.c), Integer.valueOf(this.b), 1), e);
        }
    }

    @Override // defpackage.ddz
    public final void k(int i, boolean z) throws ddy {
        z(i, 0);
        j(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.ddz
    public final void l(int i, dds ddsVar) throws ddy {
        z(i, 2);
        m(ddsVar);
    }

    @Override // defpackage.ddz
    public final void m(dds ddsVar) throws ddy {
        B(ddsVar.c());
        ddsVar.f(this);
    }

    @Override // defpackage.ddz
    public final void n(int i, int i2) throws ddy {
        z(i, 5);
        o(i2);
    }

    @Override // defpackage.ddz
    public final void o(int i) throws ddy {
        try {
            byte[] bArr = this.a;
            int i2 = this.c;
            int i3 = i2 + 1;
            this.c = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.c = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.c = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.c = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new ddy(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.c), Integer.valueOf(this.b), 1), e);
        }
    }

    @Override // defpackage.ddz
    public final void p(int i, long j) throws ddy {
        z(i, 1);
        q(j);
    }

    @Override // defpackage.ddz
    public final void q(long j) throws ddy {
        try {
            byte[] bArr = this.a;
            int i = this.c;
            int i2 = i + 1;
            this.c = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.c = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.c = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.c = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
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
        } catch (IndexOutOfBoundsException e) {
            throw new ddy(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.c), Integer.valueOf(this.b), 1), e);
        }
    }

    @Override // defpackage.ddz
    public final void r(int i, int i2) throws ddy {
        z(i, 0);
        s(i2);
    }

    @Override // defpackage.ddz
    public final void s(int i) throws ddy {
        if (i >= 0) {
            B(i);
        } else {
            D(i);
        }
    }

    @Override // defpackage.ddz
    public final void t(int i, dfh dfhVar, dfs dfsVar) throws ddy {
        z(i, 2);
        B(((ddi) dfhVar).c(dfsVar));
        dfsVar.j(dfhVar, this.f);
    }

    @Override // defpackage.ddz
    public final void u(dfh dfhVar) throws ddy {
        B(dfhVar.h());
        dfhVar.r(this);
    }

    @Override // defpackage.ddz
    public final void v(int i, dfh dfhVar) throws ddy {
        z(1, 3);
        A(2, i);
        z(3, 2);
        u(dfhVar);
        z(1, 4);
    }

    @Override // defpackage.ddz
    public final void w(int i, dds ddsVar) throws ddy {
        z(1, 3);
        A(2, i);
        l(3, ddsVar);
        z(1, 4);
    }

    @Override // defpackage.ddz
    public final void x(int i, String str) throws ddy {
        z(i, 2);
        y(str);
    }

    @Override // defpackage.ddz
    public final void y(String str) throws ddy {
        int i = this.c;
        try {
            int iY = Y(str.length() * 3);
            int iY2 = Y(str.length());
            if (iY2 != iY) {
                B(dgk.b(str));
                this.c = dgk.a(str, this.a, this.c, b());
                return;
            }
            int i2 = i + iY2;
            this.c = i2;
            int iA = dgk.a(str, this.a, i2, b());
            this.c = i;
            B((iA - i) - iY2);
            this.c = iA;
        } catch (dgi e) {
            this.c = i;
            ad(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new ddy(e2);
        }
    }

    @Override // defpackage.ddz
    public final void z(int i, int i2) throws ddy {
        B(dgn.c(i, i2));
    }
}
