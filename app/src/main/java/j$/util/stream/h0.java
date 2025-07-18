package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class h0 extends AbstractC0085c implements Iterable, j$.lang.a {
    public Object d;
    public Object[] e;

    public Object b() {
        long jCount = count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) jCount];
        h(0, iArr);
        return iArr;
    }

    @Override // j$.util.stream.AbstractC0085c
    public final void clear() {
        Object[] objArr = this.e;
        if (objArr != null) {
            this.d = objArr[0];
            this.e = null;
            this.c = null;
        }
        this.a = 0;
        this.b = 0;
    }

    public void h(int i, Object obj) {
        long j = i;
        long jCount = count() + j;
        if (jCount > ((int[]) obj).length || jCount < j) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.b == 0) {
            System.arraycopy(this.d, 0, obj, i, this.a);
            return;
        }
        for (int i2 = 0; i2 < this.b; i2++) {
            Object obj2 = this.e[i2];
            System.arraycopy(obj2, 0, obj, i, ((int[]) obj2).length);
            i += ((int[]) this.e[i2]).length;
        }
        int i3 = this.a;
        if (i3 > 0) {
            System.arraycopy(this.d, 0, obj, i, i3);
        }
    }

    public abstract void q(Object obj, int i, int i2, Object obj2);

    /* JADX WARN: Multi-variable type inference failed */
    public final void r(long j) {
        int i = this.b;
        long length = i == 0 ? ((int[]) this.d).length : this.c[i] + ((int[]) this.e[i]).length;
        if (j > length) {
            if (this.e == null) {
                int[][] iArr = new int[8][];
                this.e = iArr;
                this.c = new long[8];
                iArr[0] = this.d;
            }
            int i2 = i + 1;
            while (j > length) {
                Object[] objArr = this.e;
                if (i2 >= objArr.length) {
                    int length2 = objArr.length * 2;
                    this.e = Arrays.copyOf(objArr, length2);
                    this.c = Arrays.copyOf(this.c, length2);
                }
                int iMin = 1 << ((i2 == 0 || i2 == 1) ? 4 : Math.min(i2 + 3, 30));
                this.e[i2] = new int[iMin];
                long[] jArr = this.c;
                jArr[i2] = jArr[i2 - 1] + ((int[]) r5[r7]).length;
                length += iMin;
                i2++;
            }
        }
    }

    public void t(Object obj) {
        for (int i = 0; i < this.b; i++) {
            Object obj2 = this.e[i];
            q(obj2, 0, ((int[]) obj2).length, obj);
        }
        q(this.d, 0, this.a, obj);
    }
}
