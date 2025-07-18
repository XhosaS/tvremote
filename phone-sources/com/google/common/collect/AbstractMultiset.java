package com.google.common.collect;

import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class AbstractMultiset<E> extends AbstractCollection<E> implements Multiset<E> {
    private transient Set<E> elementSet;
    private transient Set<Multiset.Entry<E>> entrySet;

    /* compiled from: PG */
    class ElementSet extends Multisets.ElementSet<E> {
        final /* synthetic */ AbstractMultiset this$0;

        public ElementSet(AbstractMultiset abstractMultiset) {
            abstractMultiset.getClass();
            this.this$0 = abstractMultiset;
        }

        @Override // com.google.common.collect.Multisets.ElementSet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return this.this$0.elementIterator();
        }

        @Override // com.google.common.collect.Multisets.ElementSet
        public Multiset<E> multiset() {
            return this.this$0;
        }
    }

    /* compiled from: PG */
    class EntrySet extends Multisets.EntrySet<E> {
        final /* synthetic */ AbstractMultiset this$0;

        public EntrySet(AbstractMultiset abstractMultiset) {
            abstractMultiset.getClass();
            this.this$0 = abstractMultiset;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Multiset.Entry<E>> iterator() {
            return this.this$0.entryIterator();
        }

        @Override // com.google.common.collect.Multisets.EntrySet
        public Multiset<E> multiset() {
            return this.this$0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.this$0.distinctElements();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public final boolean add(E e) {
        add(e, 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        return Multisets.addAllImpl(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract void clear();

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public boolean contains(Object obj) {
        return count(obj) > 0;
    }

    public Set<E> createElementSet() {
        return new ElementSet(this);
    }

    public Set<Multiset.Entry<E>> createEntrySet() {
        return new EntrySet(this);
    }

    public abstract int distinctElements();

    public abstract Iterator<E> elementIterator();

    @Override // com.google.common.collect.Multiset
    public Set<E> elementSet() {
        Set<E> set = this.elementSet;
        if (set != null) {
            return set;
        }
        Set<E> setCreateElementSet = createElementSet();
        this.elementSet = setCreateElementSet;
        return setCreateElementSet;
    }

    public abstract Iterator<Multiset.Entry<E>> entryIterator();

    @Override // com.google.common.collect.Multiset
    public Set<Multiset.Entry<E>> entrySet() {
        Set<Multiset.Entry<E>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        Set<Multiset.Entry<E>> setCreateEntrySet = createEntrySet();
        this.entrySet = setCreateEntrySet;
        return setCreateEntrySet;
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public final boolean equals(Object obj) {
        return Multisets.equalsImpl(this, obj);
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public final boolean remove(Object obj) {
        return remove(obj, 1) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public final boolean removeAll(Collection<?> collection) {
        return Multisets.removeAllImpl(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public final boolean retainAll(Collection<?> collection) {
        return Multisets.retainAllImpl(this, collection);
    }

    public int setCount(E e, int i) {
        return Multisets.setCountImpl(this, e, i);
    }

    @Override // java.util.AbstractCollection, com.google.common.collect.Multiset
    public final String toString() {
        return entrySet().toString();
    }

    public int add(E e, int i) {
        throw new UnsupportedOperationException();
    }

    public int remove(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    public boolean setCount(E e, int i, int i2) {
        return Multisets.setCountImpl(this, e, i, i2);
    }
}
