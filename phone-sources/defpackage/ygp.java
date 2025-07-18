package defpackage;

import j$.util.List;
import j$.util.Spliterator;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class ygp<E> extends ygk<E> implements List<E>, j$.util.List<E>, yli {
    protected ygp() {
    }

    @Override // java.util.List
    public final void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void addFirst(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void addLast(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        collection.getClass();
        if (size() != collection.size()) {
            return false;
        }
        Iterator<E> it = collection.iterator();
        Iterator<E> it2 = iterator();
        while (it2.hasNext()) {
            if (!yks.e(it2.next(), it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract E get(int i);

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        Iterator<E> it = iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            E next = it.next();
            iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
        }
        return iHashCode;
    }

    public int indexOf(Object obj) {
        Iterator<E> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (yks.e(it.next(), obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new ygm(this);
    }

    public int lastIndexOf(Object obj) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (yks.e(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return new ygn(this, 0);
    }

    @Override // java.util.List
    public final E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final E removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final E removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, j$.util.List
    public final void replaceAll(UnaryOperator<E> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, j$.util.List
    public final void sort(Comparator<? super E> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // defpackage.ygk, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.util.List, j$.lang.a
    public final /* synthetic */ Spliterator spliterator() {
        return List.CC.$default$spliterator(this);
    }

    public java.util.List<E> subList(int i, int i2) {
        return new ygo(this, i, i2);
    }

    public ListIterator<E> listIterator(int i) {
        return new ygn(this, i);
    }
}
