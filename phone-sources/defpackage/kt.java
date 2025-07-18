package defpackage;

import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kt<K, V> implements Collection<V>, j$.util.Collection<V>, yli {
    public final ki a;

    public kt(ki kiVar) {
        this.a = kiVar;
    }

    @Override // java.util.Collection
    public final boolean add(V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends V> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.b(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!this.a.b(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.a.c();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return ykr.e(new jg(this, (yih) null, 3));
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, j$.util.Collection
    public final boolean removeIf(Predicate<? super V> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return this.a.e;
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.util.List, j$.lang.a
    public final /* synthetic */ Spliterator spliterator() {
        return Collection.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return ykm.a(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        return (T[]) ykm.b(this, tArr);
    }
}
