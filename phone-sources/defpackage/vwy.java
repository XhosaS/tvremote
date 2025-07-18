package defpackage;

import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vwy<E> implements ListIterator<E>, yli {
    private final /* synthetic */ ListIterator a;

    public vwy(ListIterator listIterator) {
        listIterator.getClass();
        this.a = listIterator;
    }

    @Override // java.util.ListIterator
    public final void add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final E next() {
        return (E) this.a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final E previous() {
        return (E) this.a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
