package defpackage;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yho<E> extends ygs<E> implements List<E>, RandomAccess, Serializable, ylk {
    public Object[] a;
    public final int b;
    public int c;
    public final yhp d;
    private final yho e;

    public yho(Object[] objArr, int i, int i2, yho yhoVar, yhp yhpVar) {
        objArr.getClass();
        yhpVar.getClass();
        this.a = objArr;
        this.b = i;
        this.c = i2;
        this.e = yhoVar;
        this.d = yhpVar;
        this.modCount = yhpVar.modCount;
    }

    private final int c(int i, int i2, Collection collection, boolean z) {
        int iC;
        yho yhoVar = this.e;
        if (yhoVar != null) {
            iC = yhoVar.c(i, i2, collection, z);
        } else {
            yhp yhpVar = this.d;
            yhp yhpVar2 = yhp.a;
            iC = yhpVar.c(i, i2, collection, z);
        }
        if (iC > 0) {
            j();
        }
        this.c -= iC;
        return iC;
    }

    private final Object e(int i) {
        Object objE;
        j();
        yho yhoVar = this.e;
        if (yhoVar != null) {
            objE = yhoVar.e(i);
        } else {
            yhp yhpVar = this.d;
            yhp yhpVar2 = yhp.a;
            objE = yhpVar.e(i);
        }
        this.c--;
        return objE;
    }

    private final void f(int i, Collection collection, int i2) {
        j();
        yho yhoVar = this.e;
        if (yhoVar != null) {
            yhoVar.f(i, collection, i2);
        } else {
            yhp yhpVar = this.d;
            yhp yhpVar2 = yhp.a;
            yhpVar.f(i, collection, i2);
        }
        yhp yhpVar3 = this.d;
        yhp yhpVar4 = yhp.a;
        this.a = yhpVar3.b;
        this.c += i2;
    }

    private final void g(int i, Object obj) {
        j();
        yho yhoVar = this.e;
        if (yhoVar != null) {
            yhoVar.g(i, obj);
        } else {
            yhp yhpVar = this.d;
            yhp yhpVar2 = yhp.a;
            yhpVar.g(i, obj);
        }
        yhp yhpVar3 = this.d;
        yhp yhpVar4 = yhp.a;
        this.a = yhpVar3.b;
        this.c++;
    }

    private final void h() {
        yhp yhpVar = yhp.a;
        if (this.d.modCount != this.modCount) {
            throw new ConcurrentModificationException();
        }
    }

    private final void i() {
        if (l()) {
            throw new UnsupportedOperationException();
        }
    }

    private final void j() {
        this.modCount++;
    }

    private final void k(int i, int i2) {
        if (i2 > 0) {
            j();
        }
        yho yhoVar = this.e;
        if (yhoVar != null) {
            yhoVar.k(i, i2);
        } else {
            yhp yhpVar = this.d;
            yhp yhpVar2 = yhp.a;
            yhpVar.i(i, i2);
        }
        this.c -= i2;
    }

    private final boolean l() {
        yhp yhpVar = yhp.a;
        return this.d.d;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (l()) {
            return new yhy(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        i();
        h();
        a.aB(i, this.c);
        g(this.b + i, e);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        collection.getClass();
        i();
        h();
        a.aB(i, this.c);
        int size = collection.size();
        f(this.b + i, collection, size);
        return size > 0;
    }

    @Override // defpackage.ygs
    public final int b() {
        h();
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        i();
        h();
        k(this.b, this.c);
    }

    @Override // defpackage.ygs
    public final Object d(int i) {
        i();
        h();
        a.aA(i, this.c);
        return e(this.b + i);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        h();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (wcq.af(this.a, this.b, this.c, (List) obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        h();
        a.aA(i, this.c);
        return (E) this.a[this.b + i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        h();
        return wcq.ab(this.a, this.b, this.c);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        h();
        for (int i = 0; i < this.c; i++) {
            if (yks.e(this.a[this.b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        h();
        return this.c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        h();
        for (int i = this.c - 1; i >= 0; i--) {
            if (yks.e(this.a[this.b + i], obj)) {
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
        i();
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
        i();
        h();
        return c(this.b, this.c, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<?> collection) {
        collection.getClass();
        i();
        h();
        return c(this.b, this.c, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        i();
        h();
        a.aA(i, this.c);
        Object[] objArr = this.a;
        int i2 = this.b + i;
        E e2 = (E) objArr[i2];
        objArr[i2] = e;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List<E> subList(int i, int i2) {
        a.aC(i, i2, this.c);
        return new yho(this.a, this.b + i, i2 - i, this, this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        h();
        Object[] objArr = this.a;
        int i = this.b;
        return yfm.aH(objArr, i, this.c + i);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        h();
        return wcq.ac(this.a, this.b, this.c, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int i) {
        h();
        a.aB(i, this.c);
        return new yhn(this, i, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        h();
        int length = tArr.length;
        int i = this.c;
        if (length < i) {
            Object[] objArr = this.a;
            int i2 = this.b;
            T[] tArr2 = (T[]) Arrays.copyOfRange(objArr, i2, i + i2, tArr.getClass());
            tArr2.getClass();
            return tArr2;
        }
        Object[] objArr2 = this.a;
        int i3 = this.b;
        yfm.bj(objArr2, tArr, 0, i3, i + i3);
        yfm.y(this.c, tArr);
        return tArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        i();
        h();
        g(this.b + this.c, e);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        collection.getClass();
        i();
        h();
        int size = collection.size();
        f(this.b + this.c, collection, size);
        return size > 0;
    }
}
