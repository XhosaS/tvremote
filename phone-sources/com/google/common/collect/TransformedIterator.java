package com.google.common.collect;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class TransformedIterator<F, T> implements Iterator<T> {
    final Iterator<? extends F> backingIterator;

    public TransformedIterator(Iterator<? extends F> it) {
        it.getClass();
        this.backingIterator = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.backingIterator.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return transform(this.backingIterator.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.backingIterator.remove();
    }

    public abstract T transform(F f);
}
