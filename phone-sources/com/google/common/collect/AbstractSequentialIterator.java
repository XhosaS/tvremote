package com.google.common.collect;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class AbstractSequentialIterator<T> extends UnmodifiableIterator<T> {
    private T nextOrNull;

    protected AbstractSequentialIterator(T t) {
        this.nextOrNull = t;
    }

    protected abstract T computeNext(T t);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.nextOrNull != null;
    }

    @Override // java.util.Iterator
    public final T next() {
        T t = this.nextOrNull;
        if (t == null) {
            throw new NoSuchElementException();
        }
        this.nextOrNull = computeNext(t);
        return t;
    }
}
