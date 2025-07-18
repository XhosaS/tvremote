package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class mer<T> implements Queue<T> {
    private final LinkedList a = new LinkedList();

    public final Object a(Class cls) {
        return cls.cast(peek());
    }

    @Override // java.util.Queue, java.util.Collection
    public final boolean add(T t) {
        this.a.add(0, t);
        return true;
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        Iterator<? extends T> it = collection.iterator();
        while (it.hasNext()) {
            this.a.add(0, it.next());
        }
        return true;
    }

    @Override // java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public final T element() {
        LinkedList linkedList = this.a;
        if (linkedList.isEmpty()) {
            throw new NoSuchElementException();
        }
        return (T) linkedList.get(0);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return this.a.iterator();
    }

    @Override // java.util.Queue
    public final boolean offer(T t) {
        this.a.add(0, t);
        return true;
    }

    @Override // java.util.Queue
    public final T peek() {
        LinkedList linkedList = this.a;
        if (linkedList.isEmpty()) {
            return null;
        }
        return (T) linkedList.get(0);
    }

    @Override // java.util.Queue
    public final T poll() {
        LinkedList linkedList = this.a;
        if (linkedList.isEmpty()) {
            return null;
        }
        return (T) linkedList.remove(0);
    }

    @Override // java.util.Queue
    public final T remove() {
        LinkedList linkedList = this.a;
        if (linkedList.isEmpty()) {
            throw new NoSuchElementException();
        }
        return (T) linkedList.remove(0);
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final <U> U[] toArray(U[] uArr) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }
}
