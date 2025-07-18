package defpackage;

import j$.util.List;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bzs extends bzl implements List, RandomAccess, j$.util.List {
    private static final cbk a = new cbk(cax.a, 0);
    public static final /* synthetic */ int d = 0;
    private static final long serialVersionUID = -889275714;

    public static bzo j(int i) {
        bit.h(i, "expectedSize");
        return new bzo(i);
    }

    public static bzs k(Object[] objArr) {
        return l(objArr, objArr.length);
    }

    static bzs l(Object[] objArr, int i) {
        return i == 0 ? cax.a : new cax(objArr, i);
    }

    public static bzs m(Object... objArr) {
        bjz.h(objArr);
        return k(objArr);
    }

    public static bzs n(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return o((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return cax.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return q(next);
        }
        bzo bzoVar = new bzo();
        bzoVar.g(next);
        bzoVar.i(it);
        return bzoVar.f();
    }

    public static bzs o(Collection collection) {
        if (!(collection instanceof bzl)) {
            return m(collection.toArray());
        }
        bzs bzsVarD = ((bzl) collection).d();
        return bzsVarD.f() ? k(bzsVarD.toArray()) : bzsVarD;
    }

    public static bzs p(Object[] objArr) {
        return objArr.length == 0 ? cax.a : m((Object[]) objArr.clone());
    }

    public static bzs q(Object obj) {
        return m(obj);
    }

    public static bzs r(Object obj, Object obj2) {
        return m(obj, obj2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.bzl
    public int a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.bzl, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // defpackage.bzl
    /* renamed from: e */
    public final cbj listIterator() {
        return iterator();
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return biu.h(this, obj);
    }

    public bzs h() {
        return size() <= 1 ? this : new bzp(this);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public bzs subList(int i, int i2) {
        bdq.i(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? cax.a : new bzr(this, i, i3);
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List
    /* renamed from: s, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final cbk listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }

    @Override // java.util.List
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final cbk listIterator(int i) {
        bdq.o(i, size());
        return isEmpty() ? a : new cbk(this, i);
    }

    @Override // defpackage.bzl
    public Object writeReplace() {
        return new bzq(toArray());
    }

    @Override // defpackage.bzl
    @Deprecated
    public final bzs d() {
        return this;
    }
}
