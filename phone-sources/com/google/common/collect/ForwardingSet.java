package com.google.common.collect;

import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ForwardingSet<E> extends ForwardingCollection<E> implements Set<E> {
    protected ForwardingSet() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract Set<E> delegate();

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        return obj == this || delegate().equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return delegate().hashCode();
    }

    protected boolean standardEquals(Object obj) {
        return Sets.equalsImpl(this, obj);
    }

    protected int standardHashCode() {
        return Sets.hashCodeImpl(this);
    }

    @Override // com.google.common.collect.ForwardingCollection
    protected boolean standardRemoveAll(Collection<?> collection) {
        collection.getClass();
        return Sets.removeAllImpl(this, collection);
    }
}
