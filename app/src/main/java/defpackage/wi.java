package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wi {
    public Object[] a;
    public int b;
    public int c;
    public int d;

    public wi() {
        this(8);
    }

    public final int a() {
        return (this.c - this.b) & this.d;
    }

    public final void b() {
        Object[] objArr = this.a;
        int length = objArr.length;
        int i = this.b;
        int i2 = length - i;
        int i3 = length + length;
        if (i3 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        Object[] objArr2 = new Object[i3];
        agqj.f(objArr, objArr2, 0, i, length);
        agqj.f(this.a, objArr2, i2, 0, this.b);
        this.a = objArr2;
        this.b = 0;
        this.c = length;
        this.d = i3 - 1;
    }

    public final void c(int i) {
        if (i <= 0) {
            return;
        }
        if (i > a()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i2 = this.c;
        int i3 = i < i2 ? i2 - i : 0;
        for (int i4 = i3; i4 < i2; i4++) {
            this.a[i4] = null;
        }
        int i5 = this.c;
        int i6 = i5 - i3;
        int i7 = i - i6;
        this.c = i5 - i6;
        if (i7 > 0) {
            int length = this.a.length;
            this.c = length;
            int i8 = length - i7;
            for (int i9 = i8; i9 < length; i9++) {
                this.a[i9] = null;
            }
            this.c = i8;
        }
    }

    public final void d(int i) {
        if (i <= 0) {
            return;
        }
        if (i > a()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int length = this.a.length;
        int i2 = this.b;
        if (i < length - i2) {
            length = i2 + i;
        }
        while (i2 < length) {
            this.a[i2] = null;
            i2++;
        }
        int i3 = this.b;
        int i4 = length - i3;
        int i5 = i - i4;
        this.b = this.d & (i3 + i4);
        if (i5 > 0) {
            for (int i6 = 0; i6 < i5; i6++) {
                this.a[i6] = null;
            }
            this.b = i5;
        }
    }

    public wi(int i) {
        if (Integer.bitCount(i) != 1) {
            int iHighestOneBit = Integer.highestOneBit(i - 1);
            i = iHighestOneBit + iHighestOneBit;
        }
        this.d = i - 1;
        this.a = new Object[i];
    }
}
