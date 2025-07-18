package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgb<T> implements Set<T>, yli {
    public final kk a;

    public bgb(kk kkVar) {
        this.a = kkVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!this.a.a(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.a.b();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return ykr.e(new jg(this, (yih) null, 4));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return this.a.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return ykm.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) ykm.b(this, tArr);
    }
}
