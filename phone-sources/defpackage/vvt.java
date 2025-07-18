package defpackage;

import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vvt<E> extends vsj<E> implements RandomAccess {
    public static final vvt a;
    private static final Object[] c;
    public Object[] b;
    private int d;

    static {
        Object[] objArr = new Object[0];
        c = objArr;
        a = new vvt(objArr, 0, false);
    }

    vvt() {
        this(c, 0, true);
    }

    private final String e(int i) {
        return "Index:" + i + ", Size:" + this.d;
    }

    private final void f(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(e(i));
        }
    }

    @Override // defpackage.vsj, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        eA();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(e(i));
        }
        int i3 = i + 1;
        Object[] objArr = this.b;
        int length = objArr.length;
        if (i2 < length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.b, 0, objArr2, 0, i);
            System.arraycopy(this.b, i, objArr2, i3, this.d - i);
            this.b = objArr2;
        }
        this.b[i] = e;
        this.d++;
        this.modCount++;
    }

    @Override // defpackage.vun
    public final /* bridge */ /* synthetic */ vun d(int i) {
        if (i >= this.d) {
            return new vvt(i == 0 ? c : Arrays.copyOf(this.b, i), this.d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        f(i);
        return (E) this.b[i];
    }

    @Override // defpackage.vsj, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        eA();
        f(i);
        Object[] objArr = this.b;
        E e = (E) objArr[i];
        if (i < this.d - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.d--;
        this.modCount++;
        return e;
    }

    @Override // defpackage.vsj, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        eA();
        f(i);
        Object[] objArr = this.b;
        E e2 = (E) objArr[i];
        objArr[i] = e;
        this.modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    private vvt(Object[] objArr, int i, boolean z) {
        super(z);
        this.b = objArr;
        this.d = i;
    }

    @Override // defpackage.vsj, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        eA();
        int i = this.d;
        int length = this.b.length;
        if (i == length) {
            this.b = Arrays.copyOf(this.b, Math.max(((length * 3) / 2) + 1, 10));
        }
        Object[] objArr = this.b;
        int i2 = this.d;
        this.d = i2 + 1;
        objArr[i2] = e;
        this.modCount++;
        return true;
    }
}
