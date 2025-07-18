package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class in implements Set {
    final /* synthetic */ ir a;

    public in(ir irVar) {
        this.a = irVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!this.a.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        ir irVar = this.a;
        int iHashCode = 0;
        for (int i = irVar.d - 1; i >= 0; i--) {
            Object objD = irVar.d(i);
            iHashCode += objD == null ? 0 : objD.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new im(this.a);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        ir irVar = this.a;
        int iC = irVar.c(obj);
        if (iC < 0) {
            return false;
        }
        irVar.e(iC);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        ir irVar = this.a;
        int i = irVar.d;
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            irVar.remove(it.next());
        }
        return i != irVar.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        return this.a.a(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.a.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        ir irVar = this.a;
        int i = irVar.d;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = irVar.d(i2);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        int size = size();
        if (tArr.length < size) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        }
        for (int i = 0; i < size; i++) {
            tArr[i] = this.a.d(i);
        }
        if (tArr.length > size) {
            tArr[size] = null;
        }
        return tArr;
    }
}
