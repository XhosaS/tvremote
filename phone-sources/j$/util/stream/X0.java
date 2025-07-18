package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes4.dex */
public abstract class X0 extends AbstractC0115c implements Iterable, j$.lang.a {
    public Object d = newArray(16);
    public Object[] e;

    public abstract Object[] A();

    public final void B() {
        long jW;
        if (this.a == w(this.d)) {
            if (this.e == null) {
                Object[] objArrA = A();
                this.e = objArrA;
                this.c = new long[8];
                objArrA[0] = this.d;
            }
            int i = this.b;
            int i2 = i + 1;
            Object[] objArr = this.e;
            if (i2 >= objArr.length || objArr[i2] == null) {
                if (i == 0) {
                    jW = w(this.d);
                } else {
                    jW = w(objArr[i]) + this.c[i];
                }
                z(jW + 1);
            }
            this.a = 0;
            int i3 = this.b + 1;
            this.b = i3;
            this.d = this.e[i3];
        }
    }

    public Object b() {
        long jCount = count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object objNewArray = newArray((int) jCount);
        h(0, objNewArray);
        return objNewArray;
    }

    @Override // j$.util.stream.AbstractC0115c
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
        if (jCount > w(obj) || jCount < j) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.b == 0) {
            System.arraycopy(this.d, 0, obj, i, this.a);
            return;
        }
        for (int i2 = 0; i2 < this.b; i2++) {
            Object obj2 = this.e[i2];
            System.arraycopy(obj2, 0, obj, i, w(obj2));
            i += w(this.e[i2]);
        }
        int i3 = this.a;
        if (i3 > 0) {
            System.arraycopy(this.d, 0, obj, i, i3);
        }
    }

    public void i(Object obj) {
        for (int i = 0; i < this.b; i++) {
            Object obj2 = this.e[i];
            v(obj2, 0, w(obj2), obj);
        }
        v(this.d, 0, this.a, obj);
    }

    public abstract Object newArray(int i);

    public abstract void v(Object obj, int i, int i2, Object obj2);

    public abstract int w(Object obj);

    public final int x(long j) {
        if (this.b == 0) {
            if (j < this.a) {
                return 0;
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        if (j >= count()) {
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        for (int i = 0; i <= this.b; i++) {
            if (j < this.c[i] + w(this.e[i])) {
                return i;
            }
        }
        throw new IndexOutOfBoundsException(Long.toString(j));
    }

    public final void z(long j) {
        int i = this.b;
        long jW = i == 0 ? w(this.d) : w(this.e[i]) + this.c[i];
        if (j > jW) {
            if (this.e == null) {
                Object[] objArrA = A();
                this.e = objArrA;
                this.c = new long[8];
                objArrA[0] = this.d;
            }
            int i2 = this.b + 1;
            while (j > jW) {
                Object[] objArr = this.e;
                if (i2 >= objArr.length) {
                    int length = objArr.length * 2;
                    this.e = Arrays.copyOf(objArr, length);
                    this.c = Arrays.copyOf(this.c, length);
                }
                int iMin = 1 << ((i2 == 0 || i2 == 1) ? 4 : Math.min(i2 + 3, 30));
                this.e[i2] = newArray(iMin);
                long[] jArr = this.c;
                jArr[i2] = jArr[i2 - 1] + w(this.e[r6]);
                jW += iMin;
                i2++;
            }
        }
    }
}
