package com.google.common.collect;

import defpackage.sij;

/* compiled from: PG */
/* loaded from: classes.dex */
class RegularImmutableList<E> extends ImmutableList<E> {
    static final ImmutableList<Object> EMPTY = new RegularImmutableList(new Object[0], 0);
    final transient Object[] array;
    private final transient int size;

    public RegularImmutableList(Object[] objArr, int i) {
        this.array = objArr;
        this.size = i;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    public int copyIntoArray(Object[] objArr, int i) {
        System.arraycopy(this.array, 0, objArr, i, this.size);
        return i + this.size;
    }

    @Override // java.util.List
    public E get(int i) {
        sij.B(i, this.size);
        E e = (E) this.array[i];
        e.getClass();
        return e;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object[] internalArray() {
        return this.array;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int internalArrayEnd() {
        return this.size;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int internalArrayStart() {
        return 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }
}
