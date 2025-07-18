package com.google.common.collect;

/* compiled from: PG */
/* loaded from: classes.dex */
final class RegularImmutableSet<E> extends ImmutableSet<E> {
    static final RegularImmutableSet<Object> EMPTY;
    private static final Object[] EMPTY_ARRAY;
    final transient Object[] elements;
    private final transient int hashCode;
    private final transient int mask;
    private final transient int size;
    final transient Object[] table;

    static {
        Object[] objArr = new Object[0];
        EMPTY_ARRAY = objArr;
        EMPTY = new RegularImmutableSet<>(objArr, 0, objArr, 0, 0);
    }

    public RegularImmutableSet(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.elements = objArr;
        this.hashCode = i;
        this.table = objArr2;
        this.mask = i2;
        this.size = i3;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.table;
            if (objArr.length != 0) {
                int iSmearedHash = Hashing.smearedHash(obj);
                while (true) {
                    int i = iSmearedHash & this.mask;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iSmearedHash = i + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int copyIntoArray(Object[] objArr, int i) {
        System.arraycopy(this.elements, 0, objArr, i, this.size);
        return i + this.size;
    }

    @Override // com.google.common.collect.ImmutableSet
    public ImmutableList<E> createAsList() {
        return ImmutableList.asImmutableList(this.elements, this.size);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.hashCode;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object[] internalArray() {
        return this.elements;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int internalArrayEnd() {
        return this.size;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int internalArrayStart() {
        return 0;
    }

    @Override // com.google.common.collect.ImmutableSet
    public boolean isHashCodeFast() {
        return true;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public UnmodifiableIterator<E> iterator() {
        return asList().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.size;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }
}
