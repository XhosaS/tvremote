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
/* loaded from: classes2.dex */
public final class agrv extends agqf implements List, RandomAccess, Serializable {
    public Object[] a;
    public final int b;
    public int c;
    public final agrx d;
    private final agrv e;

    public agrv(Object[] objArr, int i, int i2, agrv agrvVar, agrx agrxVar) {
        objArr.getClass();
        agrxVar.getClass();
        this.a = objArr;
        this.b = i;
        this.c = i2;
        this.e = agrvVar;
        this.d = agrxVar;
        this.modCount = agrxVar.modCount;
    }

    private final int d(int i, int i2, Collection collection, boolean z) {
        int iD;
        agrv agrvVar = this.e;
        if (agrvVar != null) {
            iD = agrvVar.d(i, i2, collection, z);
        } else {
            agrx agrxVar = this.d;
            agrx agrxVar2 = agrx.a;
            iD = agrxVar.d(i, i2, collection, z);
        }
        if (iD > 0) {
            j();
        }
        this.c -= iD;
        return iD;
    }

    private final Object e(int i) {
        Object objE;
        j();
        agrv agrvVar = this.e;
        if (agrvVar != null) {
            objE = agrvVar.e(i);
        } else {
            agrx agrxVar = this.d;
            agrx agrxVar2 = agrx.a;
            objE = agrxVar.e(i);
        }
        this.c--;
        return objE;
    }

    private final void f(int i, Collection collection, int i2) {
        j();
        agrv agrvVar = this.e;
        if (agrvVar != null) {
            agrvVar.f(i, collection, i2);
        } else {
            agrx agrxVar = this.d;
            agrx agrxVar2 = agrx.a;
            agrxVar.f(i, collection, i2);
        }
        agrx agrxVar3 = this.d;
        agrx agrxVar4 = agrx.a;
        this.a = agrxVar3.b;
        this.c += i2;
    }

    private final void g(int i, Object obj) {
        j();
        agrv agrvVar = this.e;
        if (agrvVar != null) {
            agrvVar.g(i, obj);
        } else {
            agrx agrxVar = this.d;
            agrx agrxVar2 = agrx.a;
            agrxVar.g(i, obj);
        }
        agrx agrxVar3 = this.d;
        agrx agrxVar4 = agrx.a;
        this.a = agrxVar3.b;
        this.c++;
    }

    private final void h() {
        agrx agrxVar = agrx.a;
        if (this.d.modCount != this.modCount) {
            throw new ConcurrentModificationException();
        }
    }

    private final void i() {
        agrx agrxVar = agrx.a;
        if (this.d.d) {
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
        agrv agrvVar = this.e;
        if (agrvVar != null) {
            agrvVar.k(i, i2);
        } else {
            agrx agrxVar = this.d;
            agrx agrxVar2 = agrx.a;
            agrxVar.i(i, i2);
        }
        this.c -= i2;
    }

    private final Object writeReplace() throws NotSerializableException {
        agrx agrxVar = agrx.a;
        if (this.d.d) {
            return new agsj(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // defpackage.agqf
    public final int a() {
        h();
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        i();
        h();
        agqd.a.c(i, this.c);
        g(this.b + i, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        i();
        h();
        agqd.a.c(i, this.c);
        int i2 = this.b + i;
        int size = collection.size();
        f(i2, collection, size);
        return size > 0;
    }

    @Override // defpackage.agqf
    public final Object b(int i) {
        i();
        h();
        agqd.a.b(i, this.c);
        return e(this.b + i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        i();
        h();
        k(this.b, this.c);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        h();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (agry.d(this.a, this.b, this.c, (List) obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        h();
        agqd.a.b(i, this.c);
        return this.a[this.b + i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        h();
        return agry.a(this.a, this.b, this.c);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        h();
        for (int i = 0; i < this.c; i++) {
            if (agvy.c(this.a[this.b + i], obj)) {
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
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        h();
        for (int i = this.c - 1; i >= 0; i--) {
            if (agvy.c(this.a[this.b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        i();
        h();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            b(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        i();
        h();
        return d(this.b, this.c, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        i();
        h();
        return d(this.b, this.c, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        i();
        h();
        agqd.a.b(i, this.c);
        int i2 = this.b;
        Object[] objArr = this.a;
        int i3 = i2 + i;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        agqd.a.d(i, i2, this.c);
        return new agrv(this.a, this.b + i, i2 - i, this, this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        h();
        Object[] objArr = this.a;
        int i = this.b;
        return agqj.d(objArr, i, this.c + i);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        h();
        return agry.b(this.a, this.b, this.c, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        h();
        agqd.a.c(i, this.c);
        return new agru(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        h();
        int length = objArr.length;
        int i = this.c;
        if (length < i) {
            Object[] objArr2 = this.a;
            int i2 = this.b;
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        Object[] objArr3 = this.a;
        int i3 = this.b;
        agqj.f(objArr3, objArr, 0, i3, i + i3);
        agqq.b(this.c, objArr);
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        i();
        h();
        g(this.b + this.c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        i();
        h();
        int size = collection.size();
        f(this.b + this.c, collection, size);
        return size > 0;
    }
}
