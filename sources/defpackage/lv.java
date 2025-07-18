package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lv implements Set {
    final /* synthetic */ lz a;

    public lv(lz lzVar) {
        this.a = lzVar;
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
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
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
        lz lzVar = this.a;
        int iHashCode = 0;
        for (int i = lzVar.f - 1; i >= 0; i--) {
            Object objC = lzVar.c(i);
            iHashCode += objC == null ? 0 : objC.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new lu(this.a);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        lz lzVar = this.a;
        int iB = lzVar.b(obj);
        if (iB < 0) {
            return false;
        }
        lzVar.d(iB);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        lz lzVar = this.a;
        int i = lzVar.f;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            lzVar.remove(it.next());
        }
        return i != lzVar.f;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        lz lzVar = this.a;
        int i = lzVar.f;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(lzVar.c(i2))) {
                lzVar.d(i2);
            }
        }
        return i != lzVar.f;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.a.f;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        lz lzVar = this.a;
        int i = lzVar.f;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = lzVar.c(i2);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        int size = size();
        if (objArr.length < size) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        }
        for (int i = 0; i < size; i++) {
            objArr[i] = this.a.c(i);
        }
        if (objArr.length > size) {
            objArr[size] = null;
        }
        return objArr;
    }
}
