package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
class kh<E> implements Set<E>, yli {
    public final ke b;

    public kh(ke keVar) {
        this.b = keVar;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.b.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        collection.getClass();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!this.b.a(it.next())) {
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
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return yks.e(this.b, ((kh) obj).b);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.b.b();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return ykr.e(new kg(this, null));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return this.b.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return ykm.a(this);
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        return (T[]) ykm.b(this, tArr);
    }
}
