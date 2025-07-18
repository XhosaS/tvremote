package defpackage;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yhp<E> extends ygs<E> implements List<E>, RandomAccess, Serializable, ylk {
    public static final yhp a;
    public Object[] b;
    public int c;
    public boolean d;

    static {
        yhp yhpVar = new yhp(0);
        yhpVar.d = true;
        a = yhpVar;
    }

    public yhp() {
        this((byte[]) null);
    }

    private final void j(int i, int i2) {
        int i3 = this.c + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.b;
        int length = objArr.length;
        if (i3 > length) {
            this.b = wcq.ah(objArr, yfm.bv(length, i3));
        }
        Object[] objArr2 = this.b;
        yfm.bj(objArr2, objArr2, i + i2, i, this.c);
        this.c += i2;
    }

    private final void k() {
        this.modCount++;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.d) {
            return new yhy(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        h();
        a.aB(i, this.c);
        g(i, e);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        collection.getClass();
        h();
        a.aB(i, this.c);
        int size = collection.size();
        f(i, collection, size);
        return size > 0;
    }

    @Override // defpackage.ygs
    public final int b() {
        return this.c;
    }

    public final int c(int i, int i2, Collection collection, boolean z) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i3 + 1;
            int i6 = i3 + i;
            if (collection.contains(this.b[i6]) == z) {
                Object[] objArr = this.b;
                objArr[i + i4] = objArr[i6];
                i4++;
            }
            i3 = i5;
        }
        int i7 = i2 - i4;
        Object[] objArr2 = this.b;
        yfm.bj(objArr2, objArr2, i + i4, i + i2, this.c);
        Object[] objArr3 = this.b;
        int i8 = this.c;
        wcq.ae(objArr3, i8 - i7, i8);
        if (i7 > 0) {
            k();
        }
        this.c -= i7;
        return i7;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        i(0, this.c);
    }

    @Override // defpackage.ygs
    public final Object d(int i) {
        h();
        a.aA(i, this.c);
        return e(i);
    }

    public final Object e(int i) {
        k();
        Object[] objArr = this.b;
        Object obj = objArr[i];
        yfm.bj(objArr, objArr, i, i + 1, this.c);
        wcq.ad(this.b, this.c - 1);
        this.c--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (wcq.af(this.b, 0, this.c, (List) obj)) {
                return true;
            }
        }
        return false;
    }

    public final void f(int i, Collection collection, int i2) {
        k();
        j(i, i2);
        Iterator<E> it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.b[i + i3] = it.next();
        }
    }

    public final void g(int i, Object obj) {
        k();
        j(i, 1);
        this.b[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        a.aA(i, this.c);
        return (E) this.b[i];
    }

    public final void h() {
        if (this.d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        return wcq.ab(this.b, 0, this.c);
    }

    public final void i(int i, int i2) {
        if (i2 > 0) {
            k();
        }
        Object[] objArr = this.b;
        yfm.bj(objArr, objArr, i, i + i2, this.c);
        Object[] objArr2 = this.b;
        int i3 = this.c;
        wcq.ae(objArr2, i3 - i2, i3);
        this.c -= i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.c; i++) {
            if (yks.e(this.b[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.c - 1; i >= 0; i--) {
            if (yks.e(this.b[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        h();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            d(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> collection) {
        collection.getClass();
        h();
        return c(0, this.c, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<?> collection) {
        collection.getClass();
        h();
        return c(0, this.c, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        h();
        a.aA(i, this.c);
        Object[] objArr = this.b;
        E e2 = (E) objArr[i];
        objArr[i] = e;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List<E> subList(int i, int i2) {
        a.aC(i, i2, this.c);
        return new yho(this.b, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return yfm.aH(this.b, 0, this.c);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return wcq.ac(this.b, 0, this.c, this);
    }

    public yhp(int i) {
        this.b = wcq.ag(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int i) {
        a.aB(i, this.c);
        return new yhn(this, i, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int length = tArr.length;
        int i = this.c;
        if (length < i) {
            T[] tArr2 = (T[]) Arrays.copyOfRange(this.b, 0, i, tArr.getClass());
            tArr2.getClass();
            return tArr2;
        }
        yfm.bj(this.b, tArr, 0, 0, i);
        yfm.y(this.c, tArr);
        return tArr;
    }

    public /* synthetic */ yhp(byte[] bArr) {
        this(10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        h();
        g(this.c, e);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        collection.getClass();
        h();
        int size = collection.size();
        f(this.c, collection, size);
        return size > 0;
    }
}
