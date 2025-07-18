package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ira {
    public Object a;
    public int b;

    public ira() {
    }

    private final long j(int i, boolean z) {
        int iMax;
        Object obj = this.a;
        int i2 = this.b;
        if (i2 < 0) {
            iMax = i;
        } else if (z) {
            int iMin = i;
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = i3 * 3;
                int[] iArr = (int[]) obj;
                int i5 = iArr[i4];
                int i6 = iArr[i4 + 1];
                int i7 = iArr[i4 + 2];
                long jK = k(iMin, i5, i6, i7, z);
                long jK2 = k(i, i5, i6, i7, z);
                int iE = chb.e(jK);
                int iE2 = chb.e(jK2);
                int iA = chb.a(jK);
                int iA2 = chb.a(jK2);
                iMin = Math.min(iE, iE2);
                i = Math.max(iA, iA2);
            }
            iMax = i;
            i = iMin;
        } else {
            iMax = i;
            for (int i8 = i2 - 1; i8 >= 0; i8--) {
                int i9 = i8 * 3;
                int[] iArr2 = (int[]) obj;
                int i10 = iArr2[i9];
                int i11 = iArr2[i9 + 1];
                int i12 = iArr2[i9 + 2];
                long jK3 = k(i, i10, i11, i12, z);
                long jK4 = k(iMax, i10, i11, i12, z);
                int iE3 = chb.e(jK3);
                int iE4 = chb.e(jK4);
                int iA3 = chb.a(jK3);
                int iA4 = chb.a(jK4);
                i = Math.min(iE3, iE4);
                iMax = Math.max(iA3, iA4);
            }
        }
        long jN = ccf.N(i, iMax);
        long j = chb.a;
        return jN;
    }

    private static final long k(int i, int i2, int i3, int i4, boolean z) {
        if (i < i2) {
            long jN = ccf.N(i, i);
            long j = chb.a;
            return jN;
        }
        int i5 = true != z ? i3 : i4;
        if (true != z) {
            i3 = i4;
        }
        if (i == i2) {
            if (i3 == 0) {
                long jN2 = ccf.N(i2, i5 + i2);
                long j2 = chb.a;
                return jN2;
            }
            long jN3 = ccf.N(i2, i2);
            long j3 = chb.a;
            return jN3;
        }
        if (i >= i2 + i3) {
            int i6 = (i - i3) + i5;
            long jN4 = ccf.N(i6, i6);
            long j4 = chb.a;
            return jN4;
        }
        if (i5 == 0) {
            long jN5 = ccf.N(i2, i2);
            long j5 = chb.a;
            return jN5;
        }
        long jN6 = ccf.N(i2, i5 + i2);
        long j6 = chb.a;
        return jN6;
    }

    public final long a(int i) {
        if (i >= 0 && i < this.b) {
            return ((long[]) this.a)[i];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.b);
    }

    public final void b(long j) {
        int i = this.b;
        long[] jArr = (long[]) this.a;
        if (i == jArr.length) {
            this.a = Arrays.copyOf(jArr, i + i);
        }
        Object obj = this.a;
        int i2 = this.b;
        this.b = i2 + 1;
        ((long[]) obj)[i2] = j;
    }

    public final void c(long[] jArr) {
        int i = this.b;
        int length = jArr.length;
        int i2 = i + length;
        long[] jArr2 = (long[]) this.a;
        int length2 = jArr2.length;
        if (i2 > length2) {
            this.a = Arrays.copyOf(jArr2, Math.max(length2 + length2, i2));
        }
        System.arraycopy(jArr, 0, this.a, this.b, length);
        this.b = i2;
    }

    public final int d(int i) {
        int i2 = this.b - 1;
        return i2 >= 0 ? ((int[]) this.a)[i2] : i;
    }

    public final int e() {
        Object obj = this.a;
        int i = this.b - 1;
        this.b = i;
        return ((int[]) obj)[i];
    }

    public final void f() {
        this.b = 0;
    }

    public final void g(int i) {
        Object objCopyOf = this.a;
        int i2 = this.b;
        int[] iArr = (int[]) objCopyOf;
        int length = iArr.length;
        if (i2 >= length) {
            objCopyOf = Arrays.copyOf(iArr, length + length);
            objCopyOf.getClass();
            this.a = objCopyOf;
        }
        int i3 = this.b;
        this.b = i3 + 1;
        ((int[]) objCopyOf)[i3] = i;
    }

    public final long h(int i) {
        return j(i, false);
    }

    public final long i(int i) {
        return j(i, true);
    }

    public ira(byte[] bArr, byte[] bArr2) {
        this.a = new int[30];
    }

    public ira(char[] cArr) {
        this.a = new int[10];
    }

    public ira(byte[] bArr) {
        this(32);
    }

    public ira(int i) {
        this.a = new long[i];
    }
}
