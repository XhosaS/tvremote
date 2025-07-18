package com.google.common.collect;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface PeekingIterator<E> extends Iterator<E> {
    @Override // java.util.Iterator
    E next();

    E peek();

    @Override // java.util.Iterator
    void remove();
}
