package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class md {
    public int[] a;
    public int b;
    public int c;

    public md() {
        int i = 8;
        if (Integer.bitCount(8) != 1) {
            int iHighestOneBit = Integer.highestOneBit(7);
            i = iHighestOneBit + iHighestOneBit;
        }
        this.c = i - 1;
        this.a = new int[i];
    }

    public final int a(int i) {
        if (i < 0 || i >= b()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.a[i & this.c];
    }

    public final int b() {
        return this.b & this.c;
    }

    public final void c(int i) {
        int[] iArr = this.a;
        int i2 = this.b;
        iArr[i2] = i;
        int i3 = this.c & (i2 + 1);
        this.b = i3;
        if (i3 == 0) {
            int length = iArr.length;
            int i4 = length + length;
            if (i4 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            int[] iArr2 = new int[i4];
            dnx.aU(iArr, iArr2, 0, 0, length);
            dnx.aU(this.a, iArr2, length, 0, 0);
            this.a = iArr2;
            this.b = length;
            this.c = i4 - 1;
        }
    }

    public final void d() {
        this.b = 0;
    }
}
