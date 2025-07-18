package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dek implements deh {
    private final byte[] a = new byte[4];
    private int b = 0;
    private long c;

    protected dek() {
    }

    @Override // defpackage.deh
    public final void d(byte b) {
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte[] bArr = this.a;
        bArr[i] = b;
        if (i2 == 4) {
            i(bArr, 0);
            this.b = 0;
        }
        this.c++;
    }

    @Override // defpackage.deh
    public final void e(byte[] bArr, int i, int i2) {
        int i3 = 0;
        int iMax = Math.max(0, i2);
        if (this.b != 0) {
            int i4 = 0;
            while (true) {
                if (i4 >= iMax) {
                    i3 = i4;
                    break;
                }
                byte[] bArr2 = this.a;
                int i5 = this.b;
                int i6 = i5 + 1;
                this.b = i6;
                int i7 = i4 + 1;
                bArr2[i5] = bArr[i4 + i];
                if (i6 == 4) {
                    i(bArr2, 0);
                    this.b = 0;
                    i3 = i7;
                    break;
                }
                i4 = i7;
            }
        }
        int i8 = iMax - 3;
        while (i3 < i8) {
            i(bArr, i + i3);
            i3 += 4;
        }
        while (i3 < iMax) {
            byte[] bArr3 = this.a;
            int i9 = this.b;
            this.b = i9 + 1;
            bArr3[i9] = bArr[i3 + i];
            i3++;
        }
        this.c += iMax;
    }

    public final void f() {
        long j = this.c << 3;
        d(Byte.MIN_VALUE);
        while (this.b != 0) {
            d((byte) 0);
        }
        h(j);
        g();
    }

    protected abstract void g();

    protected abstract void h(long j);

    protected abstract void i(byte[] bArr, int i);

    public void j() {
        this.c = 0L;
        this.b = 0;
        for (int i = 0; i < 4; i++) {
            this.a[i] = 0;
        }
    }
}
