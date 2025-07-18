package defpackage;

import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqi<E> extends dob<E> implements RandomAccess {
    public static final dqi a = new dqi(new Object[0], 0, false);
    private Object[] b;
    private int c;

    dqi() {
        this(new Object[10], 0, true);
    }

    private final String e(int i) {
        return "Index:" + i + ", Size:" + this.c;
    }

    private final void f(int i) {
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException(e(i));
        }
    }

    @Override // defpackage.dob, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        a();
        if (i < 0 || i > (i2 = this.c)) {
            throw new IndexOutOfBoundsException(e(i));
        }
        int i3 = i + 1;
        Object[] objArr = this.b;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.b, i, objArr2, i3, this.c - i);
            this.b = objArr2;
        }
        this.b[i] = e;
        this.c++;
        this.modCount++;
    }

    @Override // defpackage.dpj
    public final /* bridge */ /* synthetic */ dpj d(int i) {
        if (i >= this.c) {
            return new dqi(Arrays.copyOf(this.b, i), this.c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        f(i);
        return (E) this.b[i];
    }

    @Override // defpackage.dob, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        a();
        f(i);
        Object[] objArr = this.b;
        E e = (E) objArr[i];
        if (i < this.c - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.c--;
        this.modCount++;
        return e;
    }

    @Override // defpackage.dob, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        a();
        f(i);
        Object[] objArr = this.b;
        E e2 = (E) objArr[i];
        objArr[i] = e;
        this.modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    private dqi(Object[] objArr, int i, boolean z) {
        super(z);
        this.b = objArr;
        this.c = i;
    }

    @Override // defpackage.dob, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        a();
        int i = this.c;
        Object[] objArr = this.b;
        if (i == objArr.length) {
            this.b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        objArr2[i2] = e;
        this.modCount++;
        return true;
    }
}
