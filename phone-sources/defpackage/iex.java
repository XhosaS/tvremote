package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iex {
    int a;
    int b;
    int c;
    Object d;

    public iex() {
    }

    private final void k() {
        int i;
        int i2 = this.c;
        boolean z = false;
        if (i2 >= 0 && (i2 < (i = this.b) || (i2 == i && this.a == 0))) {
            z = true;
        }
        a.ab(z);
    }

    private final boolean l(int i) {
        if (i < 2 || i >= this.b) {
            return false;
        }
        byte[] bArr = (byte[]) this.d;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i + (-1)] == 0;
    }

    public final int a(int i) {
        int i2;
        this.a += i;
        int i3 = 0;
        while (true) {
            i2 = this.a;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.a = i4;
            Object obj = this.d;
            int i5 = this.c;
            i3 |= (((byte[]) obj)[i5] & 255) << i4;
            if (true != l(i5 + 1)) {
                i = 1;
            }
            this.c = i5 + i;
        }
        Object obj2 = this.d;
        int i6 = this.c;
        int i7 = i3 | ((((byte[]) obj2)[i6] & 255) >> (8 - i2));
        int i8 = 32 - i;
        if (i2 == 8) {
            this.a = 0;
            this.c = i6 + (true != l(i6 + 1) ? 1 : 2);
        }
        int i9 = ((-1) >>> i8) & i7;
        k();
        return i9;
    }

    public final int b() {
        int i = 0;
        while (!j()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? a(i) : 0);
    }

    public final int c() {
        int iB = b();
        return (iB % 2 == 0 ? -1 : 1) * ((iB + 1) / 2);
    }

    public final void d() {
        int i = this.a;
        if (i > 0) {
            g(8 - i);
        }
    }

    public final void e(byte[] bArr, int i, int i2) {
        this.d = bArr;
        this.c = i;
        this.b = i2;
        this.a = 0;
        k();
    }

    public final void f() {
        int i = this.a + 1;
        this.a = i;
        if (i == 8) {
            this.a = 0;
            int i2 = this.c;
            this.c = i2 + (true == l(i2 + 1) ? 2 : 1);
        }
        k();
    }

    public final void g(int i) {
        int i2 = this.c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.c = i4;
        int i5 = this.a + (i - (i3 * 8));
        this.a = i5;
        if (i5 > 7) {
            this.c = i4 + 1;
            this.a = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.c) {
                k();
                return;
            } else if (l(i2)) {
                this.c++;
                i2 += 2;
            }
        }
    }

    public final boolean h(int i) {
        int i2 = this.c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.a + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.b) {
                break;
            }
            if (l(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.b;
        if (i4 >= i6) {
            return i4 == i6 && i5 == 0;
        }
        return true;
    }

    public final boolean i() {
        int i = this.c;
        int i2 = this.a;
        int i3 = 0;
        while (this.c < this.b && !j()) {
            i3++;
        }
        int i4 = this.c;
        int i5 = this.b;
        this.c = i;
        this.a = i2;
        return i4 != i5 && h((i3 + i3) + 1);
    }

    public final boolean j() {
        int i = ((byte[]) this.d)[this.c] & (128 >> this.a);
        f();
        return i != 0;
    }

    public iex(byte[] bArr, int i, int i2) {
        e(bArr, i, i2);
    }
}
