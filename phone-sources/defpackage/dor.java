package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dor extends dot {
    private final byte[] a;
    private final int b;
    private int c;

    public dor(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i)));
        }
        this.a = bArr;
        this.c = 0;
        this.b = i;
    }

    @Override // defpackage.dot
    public final void A(int i, long j) throws dos {
        x(i, 0);
        B(j);
    }

    @Override // defpackage.dot
    public final void B(long j) throws dos {
        if (!dot.e || b() < 10) {
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr = this.a;
                    int i = this.c;
                    this.c = i + 1;
                    bArr[i] = (byte) ((((int) j) | 128) & 255);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new dos(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.c), Integer.valueOf(this.b), 1), e);
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
                dra.k(bArr3, i4, (byte) i3);
                return;
            }
            byte[] bArr4 = this.a;
            int i5 = this.c;
            this.c = i5 + 1;
            dra.k(bArr4, i5, (byte) ((i3 | 128) & 255));
            j >>>= 7;
        }
    }

    @Override // defpackage.dot, defpackage.doe
    public final void a(byte[] bArr, int i) throws dos {
        d(bArr, i);
    }

    @Override // defpackage.dot
    public final int b() {
        return this.b - this.c;
    }

    public final void c(String str) throws dos {
        int i = this.c;
        try {
            int iV = V(str.length() * 3);
            int iV2 = V(str.length());
            if (iV2 != iV) {
                z(drf.b(str));
                this.c = drf.a(str, this.a, this.c, b());
                return;
            }
            int i2 = i + iV2;
            this.c = i2;
            int iA = drf.a(str, this.a, i2, b());
            this.c = i;
            z((iA - i) - iV2);
            this.c = iA;
        } catch (drd e) {
            this.c = i;
            aa(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new dos(e2);
        }
    }

    public final void d(byte[] bArr, int i) throws dos {
        try {
            System.arraycopy(bArr, 0, this.a, this.c, i);
            this.c += i;
        } catch (IndexOutOfBoundsException e) {
            throw new dos(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.c), Integer.valueOf(this.b), Integer.valueOf(i)), e);
        }
    }

    @Override // defpackage.dot
    public final void j(byte b) throws dos {
        try {
            byte[] bArr = this.a;
            int i = this.c;
            this.c = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new dos(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.c), Integer.valueOf(this.b), 1), e);
        }
    }

    @Override // defpackage.dot
    public final void k(int i, boolean z) throws dos {
        x(i, 0);
        j(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.dot
    public final void l(int i, dol dolVar) throws dos {
        x(i, 2);
        z(dolVar.c());
        dolVar.e(this);
    }

    @Override // defpackage.dot
    public final void m(int i, int i2) throws dos {
        x(i, 5);
        n(i2);
    }

    @Override // defpackage.dot
    public final void n(int i) throws dos {
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
            throw new dos(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.c), Integer.valueOf(this.b), 1), e);
        }
    }

    @Override // defpackage.dot
    public final void o(int i, long j) throws dos {
        x(i, 1);
        p(j);
    }

    @Override // defpackage.dot
    public final void p(long j) throws dos {
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
            throw new dos(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.c), Integer.valueOf(this.b), 1), e);
        }
    }

    @Override // defpackage.dot
    public final void q(int i, int i2) throws dos {
        x(i, 0);
        r(i2);
    }

    @Override // defpackage.dot
    public final void r(int i) throws dos {
        if (i >= 0) {
            z(i);
        } else {
            B(i);
        }
    }

    @Override // defpackage.dot
    public final void s(int i, dqa dqaVar, dqk dqkVar) throws dos {
        x(i, 2);
        z(((doa) dqaVar).b(dqkVar));
        dqkVar.i(dqaVar, this.f);
    }

    @Override // defpackage.dot
    public final void t(int i, dqa dqaVar) throws dos {
        x(1, 3);
        y(2, i);
        x(3, 2);
        z(dqaVar.g());
        dqaVar.r(this);
        x(1, 4);
    }

    @Override // defpackage.dot
    public final void u(int i, dol dolVar) throws dos {
        x(1, 3);
        y(2, i);
        l(3, dolVar);
        x(1, 4);
    }

    @Override // defpackage.dot
    public final void v(int i, String str) throws dos {
        x(i, 2);
        c(str);
    }

    @Override // defpackage.dot
    public final void x(int i, int i2) throws dos {
        z(dri.c(i, i2));
    }

    @Override // defpackage.dot
    public final void y(int i, int i2) throws dos {
        x(i, 0);
        z(i2);
    }

    @Override // defpackage.dot
    public final void z(int i) throws dos {
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.a;
                int i2 = this.c;
                this.c = i2 + 1;
                bArr[i2] = (byte) ((i | 128) & 255);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new dos(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.c), Integer.valueOf(this.b), 1), e);
            }
        }
        byte[] bArr2 = this.a;
        int i3 = this.c;
        this.c = i3 + 1;
        bArr2[i3] = (byte) i;
    }
}
