package com.google.common.collect;

import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import defpackage.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ForwardingMultiset<E> extends ForwardingCollection<E> implements Multiset<E> {

    /* compiled from: PG */
    public class StandardElementSet extends Multisets.ElementSet<E> {
        final /* synthetic */ ForwardingMultiset this$0;

        public StandardElementSet(ForwardingMultiset forwardingMultiset) {
            forwardingMultiset.getClass();
            this.this$0 = forwardingMultiset;
        }

        @Override // com.google.common.collect.Multisets.ElementSet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return Multisets.elementIterator(multiset().entrySet().iterator());
        }

        @Override // com.google.common.collect.Multisets.ElementSet
        public Multiset<E> multiset() {
            return this.this$0;
        }
    }

    protected ForwardingMultiset() {
    }

    @Override // com.google.common.collect.Multiset
    public int add(E e, int i) {
        return delegate().add(e, i);
    }

    @Override // com.google.common.collect.Multiset
    public int count(Object obj) {
        return delegate().count(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract Multiset<E> delegate();

    public Set<E> elementSet() {
        return delegate().elementSet();
    }

    public Set<Multiset.Entry<E>> entrySet() {
        return delegate().entrySet();
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public boolean equals(Object obj) {
        return obj == this || delegate().equals(obj);
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public int hashCode() {
        return delegate().hashCode();
    }

    @Override // com.google.common.collect.Multiset
    public int remove(Object obj, int i) {
        return delegate().remove(obj, i);
    }

    @Override // com.google.common.collect.Multiset
    public int setCount(E e, int i) {
        return delegate().setCount(e, i);
    }

    protected boolean standardAdd(E e) {
        add(e, 1);
        return true;
    }

    @Override // com.google.common.collect.ForwardingCollection
    protected boolean standardAddAll(Collection<? extends E> collection) {
        return Multisets.addAllImpl(this, collection);
    }

    @Override // com.google.common.collect.ForwardingCollection
    protected void standardClear() {
        Iterators.clear(entrySet().iterator());
    }

    @Override // com.google.common.collect.ForwardingCollection
    public boolean standardContains(Object obj) {
        return count(obj) > 0;
    }

    protected int standardCount(Object obj) {
        for (Multiset.Entry<E> entry : entrySet()) {
            if (a.Q(entry.getElement(), obj)) {
                return entry.getCount();
            }
        }
        return 0;
    }

    protected boolean standardEquals(Object obj) {
        return Multisets.equalsImpl(this, obj);
    }

    protected int standardHashCode() {
        return entrySet().hashCode();
    }

    protected Iterator<E> standardIterator() {
        return Multisets.iteratorImpl(this);
    }

    @Override // com.google.common.collect.ForwardingCollection
    protected boolean standardRemove(Object obj) {
        return remove(obj, 1) > 0;
    }

    @Override // com.google.common.collect.ForwardingCollection
    protected boolean standardRemoveAll(Collection<?> collection) {
        return Multisets.removeAllImpl(this, collection);
    }

    @Override // com.google.common.collect.ForwardingCollection
    protected boolean standardRetainAll(Collection<?> collection) {
        return Multisets.retainAllImpl(this, collection);
    }

    protected int standardSetCount(E e, int i) {
        return Multisets.setCountImpl(this, e, i);
    }

    protected int standardSize() {
        return Multisets.linearTimeSizeImpl(this);
    }

    @Override // com.google.common.collect.ForwardingCollection
    protected String standardToString() {
        return entrySet().toString();
    }

    @Override // com.google.common.collect.Multiset
    public boolean setCount(E e, int i, int i2) {
        return delegate().setCount(e, i, i2);
    }

    protected boolean standardSetCount(E e, int i, int i2) {
        return Multisets.setCountImpl(this, e, i, i2);
    }
}
