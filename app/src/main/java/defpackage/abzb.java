package defpackage;

import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abzb extends abuw implements RandomAccess {
    public static final Object[] a;
    public static final abzb b;
    private Object[] c;
    private int d;

    static {
        Object[] objArr = new Object[0];
        a = objArr;
        b = new abzb(objArr, 0, false);
    }

    abzb() {
        this(a, 0, true);
    }

    private static int f(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    private final String g(int i) {
        return "Index:" + i + ", Size:" + this.d;
    }

    private final void h(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(g(i));
        }
    }

    @Override // defpackage.abuw, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        fd();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(g(i));
        }
        int i3 = i + 1;
        Object[] objArr = this.c;
        int length = objArr.length;
        if (i2 < length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[f(length)];
            System.arraycopy(this.c, 0, objArr2, 0, i);
            System.arraycopy(this.c, i, objArr2, i3, this.d - i);
            this.c = objArr2;
        }
        this.c[i] = obj;
        this.d++;
        this.modCount++;
    }

    @Override // defpackage.abxs
    public final /* bridge */ /* synthetic */ abxs d(int i) {
        if (i >= this.d) {
            return new abzb(i == 0 ? a : Arrays.copyOf(this.c, i), this.d, true);
        }
        throw new IllegalArgumentException();
    }

    final void e(int i) {
        int length = this.c.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.c = new Object[Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = f(length);
        }
        this.c = Arrays.copyOf(this.c, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        h(i);
        return this.c[i];
    }

    @Override // defpackage.abuw, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        fd();
        h(i);
        Object[] objArr = this.c;
        Object obj = objArr[i];
        if (i < this.d - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.d--;
        this.modCount++;
        return obj;
    }

    @Override // defpackage.abuw, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        fd();
        h(i);
        Object[] objArr = this.c;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        this.modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    public abzb(Object[] objArr, int i, boolean z) {
        super(z);
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.abuw, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        fd();
        int i = this.d;
        int length = this.c.length;
        if (i == length) {
            this.c = Arrays.copyOf(this.c, f(length));
        }
        Object[] objArr = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        objArr[i2] = obj;
        this.modCount++;
        return true;
    }
}
