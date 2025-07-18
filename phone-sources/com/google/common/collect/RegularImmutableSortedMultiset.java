package com.google.common.collect;

import com.google.common.collect.Multiset;
import defpackage.sfy;
import defpackage.sij;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class RegularImmutableSortedMultiset<E> extends ImmutableSortedMultiset<E> {
    private final transient long[] cumulativeCounts;
    final transient RegularImmutableSortedSet<E> elementSet;
    private final transient int length;
    private final transient int offset;
    private static final long[] zeroCumulativeCounts = {0};
    static final ImmutableSortedMultiset<?> NATURAL_EMPTY_MULTISET = new RegularImmutableSortedMultiset(Ordering.natural());

    public RegularImmutableSortedMultiset(RegularImmutableSortedSet<E> regularImmutableSortedSet, long[] jArr, int i, int i2) {
        this.elementSet = regularImmutableSortedSet;
        this.cumulativeCounts = jArr;
        this.offset = i;
        this.length = i2;
    }

    private int getCount(int i) {
        long[] jArr = this.cumulativeCounts;
        int i2 = this.offset + i;
        return (int) (jArr[i2 + 1] - jArr[i2]);
    }

    @Override // com.google.common.collect.Multiset
    public int count(Object obj) {
        int iIndexOf = this.elementSet.indexOf(obj);
        if (iIndexOf >= 0) {
            return getCount(iIndexOf);
        }
        return 0;
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return getEntry(0);
    }

    @Override // com.google.common.collect.ImmutableMultiset
    public Multiset.Entry<E> getEntry(int i) {
        return Multisets.immutableEntry(this.elementSet.asList().get(i), getCount(i));
    }

    public ImmutableSortedMultiset<E> getSubMultiset(int i, int i2) {
        sij.w(i, i2, this.length);
        if (i == i2) {
            return emptyMultiset(comparator());
        }
        if (i == 0) {
            if (i2 == this.length) {
                return this;
            }
            i = 0;
        }
        RegularImmutableSortedSet<E> regularImmutableSortedSet = this.elementSet;
        return new RegularImmutableSortedMultiset(regularImmutableSortedSet.getSubSet(i, i2), this.cumulativeCounts, this.offset + i, i2 - i);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public ImmutableSortedMultiset<E> headMultiset(E e, BoundType boundType) {
        boundType.getClass();
        return getSubMultiset(0, this.elementSet.headIndex(e, boundType == BoundType.CLOSED));
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return this.offset > 0 || this.length < this.cumulativeCounts.length + (-1);
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return getEntry(this.length - 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
        long[] jArr = this.cumulativeCounts;
        int i = this.offset;
        return sfy.ab(jArr[this.length + i] - jArr[i]);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public ImmutableSortedMultiset<E> tailMultiset(E e, BoundType boundType) {
        boundType.getClass();
        return getSubMultiset(this.elementSet.tailIndex(e, boundType == BoundType.CLOSED), this.length);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }

    public RegularImmutableSortedMultiset(Comparator<? super E> comparator) {
        this.elementSet = ImmutableSortedSet.emptySet(comparator);
        this.cumulativeCounts = zeroCumulativeCounts;
        this.offset = 0;
        this.length = 0;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public ImmutableSortedSet<E> elementSet() {
        return this.elementSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ SortedMultiset headMultiset(Object obj, BoundType boundType) {
        return headMultiset((RegularImmutableSortedMultiset<E>) obj, boundType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ SortedMultiset tailMultiset(Object obj, BoundType boundType) {
        return tailMultiset((RegularImmutableSortedMultiset<E>) obj, boundType);
    }
}
