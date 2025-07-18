package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yhx<V> extends ygr<V> implements Collection<V>, ylj {
    private final yhu a;

    public yhx(yhu yhuVar) {
        this.a = yhuVar;
    }

    @Override // defpackage.ygr
    public final int a() {
        return this.a.g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends V> collection) {
        collection.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return new yht(this.a, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        yhu yhuVar = this.a;
        yhuVar.f();
        int iC = yhuVar.c(obj);
        if (iC < 0) {
            return false;
        }
        yhuVar.g(iC);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        collection.getClass();
        this.a.f();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        collection.getClass();
        this.a.f();
        return super.retainAll(collection);
    }
}
