package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class biy {
    public int a;
    public long[] b = new long[16];
    public int[] c = new int[16];
    public int[] d;
    public int e;

    public biy() {
        int[] iArr = new int[16];
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        this.d = iArr;
    }

    public final long a(long j) {
        return this.a > 0 ? this.b[0] : j;
    }

    public final void b(int i) {
        long[] jArr = this.b;
        long j = jArr[i];
        while (i > 0) {
            int i2 = ((i + 1) >> 1) - 1;
            if (yks.b(jArr[i2], j) <= 0) {
                return;
            }
            c(i2, i);
            i = i2;
        }
    }

    public final void c(int i, int i2) {
        long[] jArr = this.b;
        int[] iArr = this.c;
        int[] iArr2 = this.d;
        long j = jArr[i];
        jArr[i] = jArr[i2];
        jArr[i2] = j;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        iArr[i] = i4;
        iArr[i2] = i3;
        iArr2[i4] = i;
        iArr2[i3] = i2;
    }
}
