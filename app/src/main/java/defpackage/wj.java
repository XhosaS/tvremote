package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wj {
    public int[] a;
    public int b;
    public int c;

    public wj() {
        int i = 8;
        if (Integer.bitCount(8) != 1) {
            int iHighestOneBit = Integer.highestOneBit(7);
            i = iHighestOneBit + iHighestOneBit;
        }
        this.c = i - 1;
        this.a = new int[i];
    }

    public final int a(int i) {
        if (i >= 0) {
            int i2 = this.b;
            int i3 = this.c;
            if (i < (i2 & i3)) {
                return this.a[i & i3];
            }
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final void b(int i) {
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
            agqj.e(iArr, iArr2, 0, 0, length);
            agqj.e(this.a, iArr2, length, 0, 0);
            this.a = iArr2;
            this.b = length;
            this.c = i4 - 1;
        }
    }
}
