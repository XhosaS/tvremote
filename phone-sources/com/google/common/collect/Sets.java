package com.google.common.collect;

import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import defpackage.sij;
import defpackage.tsv;
import defpackage.udo;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.stream.Collector;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class Sets {

    /* compiled from: PG */
    final class CartesianSet<E> extends ForwardingCollection<List<E>> implements Set<List<E>> {
        private final transient ImmutableList<ImmutableSet<E>> axes;
        private final transient CartesianList<E> delegate;

        private CartesianSet(ImmutableList<ImmutableSet<E>> immutableList, CartesianList<E> cartesianList) {
            this.axes = immutableList;
            this.delegate = cartesianList;
        }

        static <E> Set<List<E>> create(List<? extends Set<? extends E>> list) {
            ImmutableList.Builder builder = new ImmutableList.Builder(list.size());
            Iterator<? extends Set<? extends E>> it = list.iterator();
            while (it.hasNext()) {
                ImmutableSet immutableSetCopyOf = ImmutableSet.copyOf((Collection) it.next());
                if (immutableSetCopyOf.isEmpty()) {
                    return ImmutableSet.of();
                }
                builder.add((ImmutableList.Builder) immutableSetCopyOf);
            }
            final ImmutableList<E> immutableListBuild = builder.build();
            return new CartesianSet(immutableListBuild, new CartesianList(new ImmutableList<List<E>>() { // from class: com.google.common.collect.Sets.CartesianSet.1
                @Override // com.google.common.collect.ImmutableCollection
                public boolean isPartialView() {
                    return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                    return immutableListBuild.size();
                }

                @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
                public Object writeReplace() {
                    return super.writeReplace();
                }

                @Override // java.util.List
                public List<E> get(int i) {
                    return ((ImmutableSet) immutableListBuild.get(i)).asList();
                }
            }));
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (list.size() != this.axes.size()) {
                return false;
            }
            Iterator<E> it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (!this.axes.get(i).contains(it.next())) {
                    return false;
                }
                i++;
            }
            return true;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            if (obj instanceof CartesianSet) {
                return this.axes.equals(((CartesianSet) obj).axes);
            }
            if (obj instanceof Set) {
                Set set = (Set) obj;
                if (size() == set.size() && containsAll(set)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            int size = size() - 1;
            for (int i = 0; i < this.axes.size(); i++) {
                size *= 31;
            }
            UnmodifiableIterator<ImmutableSet<E>> it = this.axes.iterator();
            int size2 = 1;
            while (it.hasNext()) {
                ImmutableSet<E> next = it.next();
                size2 = (size2 * 31) + ((size() / next.size()) * next.hashCode());
            }
            return size2 + size;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Collection<List<E>> delegate() {
            return this.delegate;
        }
    }

    /* compiled from: PG */
    class DescendingSet<E> extends ForwardingNavigableSet<E> {
        private final NavigableSet<E> forward;

        public DescendingSet(NavigableSet<E> navigableSet) {
            this.forward = navigableSet;
        }

        private static <T> Ordering<T> reverse(Comparator<T> comparator) {
            return Ordering.from(comparator).reverse();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public E ceiling(E e) {
            return this.forward.floor(e);
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public Comparator<? super E> comparator() {
            Comparator<? super E> comparator = this.forward.comparator();
            return comparator == null ? Ordering.natural().reverse() : reverse(comparator);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public NavigableSet<E> delegate() {
            return this.forward;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return this.forward.iterator();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return this.forward;
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public E first() {
            return this.forward.last();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public E floor(E e) {
            return this.forward.ceiling(e);
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<E> headSet(E e) {
            return standardHeadSet(e);
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public E higher(E e) {
            return this.forward.lower(e);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return this.forward.descendingIterator();
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public E last() {
            return this.forward.first();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public E lower(E e) {
            return this.forward.higher(e);
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public E pollFirst() {
            return this.forward.pollLast();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public E pollLast() {
            return this.forward.pollFirst();
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<E> subSet(E e, E e2) {
            return standardSubSet(e, e2);
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<E> tailSet(E e) {
            return standardTailSet(e);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return standardToArray();
        }

        @Override // com.google.common.collect.ForwardingObject
        public String toString() {
            return standardToString();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<E> headSet(E e, boolean z) {
            return this.forward.tailSet(e, z).descendingSet();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<E> subSet(E e, boolean z, E e2, boolean z2) {
            return this.forward.subSet(e2, z2, e, z).descendingSet();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<E> tailSet(E e, boolean z) {
            return this.forward.headSet(e, z).descendingSet();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) standardToArray(tArr);
        }
    }

    /* compiled from: PG */
    class FilteredNavigableSet<E> extends FilteredSortedSet<E> implements NavigableSet<E> {
        public FilteredNavigableSet(NavigableSet<E> navigableSet, tsv<? super E> tsvVar) {
            super(navigableSet, tsvVar);
        }

        @Override // java.util.NavigableSet
        public E ceiling(E e) {
            return (E) Iterables.find(unfiltered().tailSet(e, true), this.predicate, null);
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return Iterators.filter(unfiltered().descendingIterator(), this.predicate);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return Sets.filter((NavigableSet) unfiltered().descendingSet(), (tsv) this.predicate);
        }

        @Override // java.util.NavigableSet
        public E floor(E e) {
            return (E) Iterators.find(unfiltered().headSet(e, true).descendingIterator(), this.predicate, null);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(E e, boolean z) {
            return Sets.filter((NavigableSet) unfiltered().headSet(e, z), (tsv) this.predicate);
        }

        @Override // java.util.NavigableSet
        public E higher(E e) {
            return (E) Iterables.find(unfiltered().tailSet(e, false), this.predicate, null);
        }

        @Override // com.google.common.collect.Sets.FilteredSortedSet, java.util.SortedSet
        public E last() {
            return (E) Iterators.find(unfiltered().descendingIterator(), this.predicate);
        }

        @Override // java.util.NavigableSet
        public E lower(E e) {
            return (E) Iterators.find(unfiltered().headSet(e, false).descendingIterator(), this.predicate, null);
        }

        @Override // java.util.NavigableSet
        public E pollFirst() {
            return (E) Iterables.removeFirstMatching(unfiltered(), this.predicate);
        }

        @Override // java.util.NavigableSet
        public E pollLast() {
            return (E) Iterables.removeFirstMatching(unfiltered().descendingSet(), this.predicate);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(E e, boolean z, E e2, boolean z2) {
            return Sets.filter((NavigableSet) unfiltered().subSet(e, z, e2, z2), (tsv) this.predicate);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(E e, boolean z) {
            return Sets.filter((NavigableSet) unfiltered().tailSet(e, z), (tsv) this.predicate);
        }

        public NavigableSet<E> unfiltered() {
            return (NavigableSet) this.unfiltered;
        }
    }

    /* compiled from: PG */
    class FilteredSet<E> extends Collections2.FilteredCollection<E> implements Set<E> {
        public FilteredSet(Set<E> set, tsv<? super E> tsvVar) {
            super(set, tsvVar);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return Sets.equalsImpl(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return Sets.hashCodeImpl(this);
        }
    }

    /* compiled from: PG */
    class FilteredSortedSet<E> extends FilteredSet<E> implements SortedSet<E> {
        public FilteredSortedSet(SortedSet<E> sortedSet, tsv<? super E> tsvVar) {
            super(sortedSet, tsvVar);
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            return ((SortedSet) this.unfiltered).comparator();
        }

        @Override // java.util.SortedSet
        public E first() {
            return (E) Iterators.find(this.unfiltered.iterator(), this.predicate);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(E e) {
            return new FilteredSortedSet(((SortedSet) this.unfiltered).headSet(e), this.predicate);
        }

        public E last() {
            SortedSet sortedSetHeadSet = (SortedSet) this.unfiltered;
            while (true) {
                tsv<? super E> tsvVar = this.predicate;
                E e = (Object) sortedSetHeadSet.last();
                if (tsvVar.apply(e)) {
                    return e;
                }
                sortedSetHeadSet = sortedSetHeadSet.headSet(e);
            }
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(E e, E e2) {
            return new FilteredSortedSet(((SortedSet) this.unfiltered).subSet(e, e2), this.predicate);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(E e) {
            return new FilteredSortedSet(((SortedSet) this.unfiltered).tailSet(e), this.predicate);
        }
    }

    /* compiled from: PG */
    abstract class ImprovedAbstractSet<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return Sets.removeAllImpl(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            collection.getClass();
            return super.retainAll(collection);
        }
    }

    /* compiled from: PG */
    final class PowerSet<E> extends AbstractSet<Set<E>> {
        final ImmutableMap<E, Integer> inputSet;

        public PowerSet(Set<E> set) {
            sij.q(set.size() <= 30, "Too many elements to create power set: %s > 30", set.size());
            this.inputSet = Maps.indexMap(set);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Set)) {
                return false;
            }
            return this.inputSet.keySet().containsAll((Set) obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return obj instanceof PowerSet ? this.inputSet.keySet().equals(((PowerSet) obj).inputSet.keySet()) : super.equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return this.inputSet.keySet().hashCode() << (this.inputSet.size() - 1);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Set<E>> iterator() {
            return new AbstractIndexedListIterator<Set<E>>(this, size()) { // from class: com.google.common.collect.Sets.PowerSet.1
                final /* synthetic */ PowerSet this$0;

                {
                    this.getClass();
                    this.this$0 = this;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIndexedListIterator
                public Set<E> get(int i) {
                    return new SubSet(this.this$0.inputSet, i);
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return 1 << this.inputSet.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return "powerSet(" + String.valueOf(this.inputSet) + ")";
        }
    }

    /* compiled from: PG */
    public abstract class SetView<E> extends AbstractSet<E> {
        static int maxSize(Set<?> set) {
            return set instanceof SetView ? ((SetView) set).maxSize() : set.size();
        }

        static int minSize(Set<?> set) {
            return set instanceof SetView ? ((SetView) set).minSize() : set.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean add(E e) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        public <S extends Set<E>> S copyInto(S s) {
            s.addAll(this);
            return s;
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            Set set;
            int iMaxSize;
            int iMinSize;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Set) || minSize() > (iMaxSize = maxSize((set = (Set) obj))) || maxSize() < (iMinSize = minSize(set))) {
                return false;
            }
            UnmodifiableIterator<E> it = iterator();
            int i = 0;
            while (it.hasNext()) {
                if (!set.contains(it.next())) {
                    return false;
                }
                i++;
            }
            if (i == iMaxSize) {
                return true;
            }
            if (i < iMinSize) {
                return false;
            }
            Iterator<E> it2 = set.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                it2.next();
                i2++;
                if (i2 > i) {
                    return false;
                }
            }
            return true;
        }

        public ImmutableSet<E> immutableCopy() {
            int iMaxSize = maxSize();
            if (iMaxSize == 0) {
                return ImmutableSet.of();
            }
            ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(iMaxSize);
            UnmodifiableIterator<E> it = iterator();
            while (it.hasNext()) {
                E next = it.next();
                next.getClass();
                builderBuilderWithExpectedSize.add((ImmutableSet.Builder) next);
            }
            return builderBuilderWithExpectedSize.build();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public abstract UnmodifiableIterator<E> iterator();

        public abstract int maxSize();

        public abstract int minSize();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        private SetView() {
        }
    }

    /* compiled from: PG */
    final class SubSet<E> extends AbstractSet<E> {
        private final ImmutableMap<E, Integer> inputSet;
        private final int mask;

        public SubSet(ImmutableMap<E, Integer> immutableMap, int i) {
            this.inputSet = immutableMap;
            this.mask = i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Integer num = this.inputSet.get(obj);
            if (num != null) {
                return ((1 << num.intValue()) & this.mask) != 0;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return new UnmodifiableIterator<E>(this) { // from class: com.google.common.collect.Sets.SubSet.1
                final ImmutableList<E> elements;
                int remainingSetBits;
                final /* synthetic */ SubSet this$0;

                {
                    this.getClass();
                    this.this$0 = this;
                    this.elements = this.inputSet.keySet().asList();
                    this.remainingSetBits = this.mask;
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return this.remainingSetBits != 0;
                }

                @Override // java.util.Iterator
                public E next() {
                    int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(this.remainingSetBits);
                    if (iNumberOfTrailingZeros == 32) {
                        throw new NoSuchElementException();
                    }
                    this.remainingSetBits &= ~(1 << iNumberOfTrailingZeros);
                    return this.elements.get(iNumberOfTrailingZeros);
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return Integer.bitCount(this.mask);
        }
    }

    private Sets() {
    }

    public static <B> Set<List<B>> cartesianProduct(List<? extends Set<? extends B>> list) {
        return CartesianSet.create(list);
    }

    public static <E> Set<Set<E>> combinations(Set<E> set, final int i) {
        final ImmutableMap immutableMapIndexMap = Maps.indexMap(set);
        CollectPreconditions.checkNonnegative(i, "size");
        sij.t(i <= immutableMapIndexMap.size(), "size (%s) must be <= set.size() (%s)", i, immutableMapIndexMap.size());
        return i == 0 ? ImmutableSet.of(ImmutableSet.of()) : i == immutableMapIndexMap.size() ? ImmutableSet.of(immutableMapIndexMap.keySet()) : new AbstractSet<Set>() { // from class: com.google.common.collect.Sets.5
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                if (obj instanceof Set) {
                    Set set2 = (Set) obj;
                    if (set2.size() == i && immutableMapIndexMap.keySet().containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Set> iterator() {
                return new AbstractIterator<Set>(this, immutableMapIndexMap, i) { // from class: com.google.common.collect.Sets.5.1
                    final BitSet bits;
                    final /* synthetic */ ImmutableMap val$index;
                    final /* synthetic */ int val$size;

                    {
                        this.val$index = immutableMap;
                        this.val$size = i;
                        this.getClass();
                        this.bits = new BitSet(immutableMap.size());
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.google.common.collect.AbstractIterator
                    public Set computeNext() {
                        if (this.bits.isEmpty()) {
                            this.bits.set(0, this.val$size);
                        } else {
                            int iNextSetBit = this.bits.nextSetBit(0);
                            int iNextClearBit = this.bits.nextClearBit(iNextSetBit);
                            if (iNextClearBit == this.val$index.size()) {
                                endOfData();
                                return null;
                            }
                            int i2 = (iNextClearBit - iNextSetBit) - 1;
                            this.bits.set(0, i2);
                            this.bits.clear(i2, iNextClearBit);
                            this.bits.set(iNextClearBit);
                        }
                        final BitSet bitSet = (BitSet) this.bits.clone();
                        final ImmutableMap immutableMap = this.val$index;
                        final int i3 = this.val$size;
                        return new AbstractSet(this) { // from class: com.google.common.collect.Sets.5.1.1
                            {
                                this.getClass();
                            }

                            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                            public boolean contains(Object obj) {
                                Integer num = (Integer) immutableMap.get(obj);
                                return num != null && bitSet.get(num.intValue());
                            }

                            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                            public Iterator iterator() {
                                final BitSet bitSet2 = bitSet;
                                final ImmutableMap immutableMap2 = immutableMap;
                                return new AbstractIterator(this) { // from class: com.google.common.collect.Sets.5.1.1.1
                                    int i;

                                    {
                                        this.getClass();
                                        this.i = -1;
                                    }

                                    @Override // com.google.common.collect.AbstractIterator
                                    protected Object computeNext() {
                                        int iNextSetBit2 = bitSet2.nextSetBit(this.i + 1);
                                        this.i = iNextSetBit2;
                                        if (iNextSetBit2 != -1) {
                                            return immutableMap2.keySet().asList().get(this.i);
                                        }
                                        endOfData();
                                        return null;
                                    }
                                };
                            }

                            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                            public int size() {
                                return i3;
                            }
                        };
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return udo.a(immutableMapIndexMap.size(), i);
            }

            @Override // java.util.AbstractCollection
            public String toString() {
                return "Sets.combinations(" + String.valueOf(immutableMapIndexMap.keySet()) + ", " + i + ")";
            }
        };
    }

    public static <E extends Enum<E>> EnumSet<E> complementOf(Collection<E> collection) {
        if (collection instanceof EnumSet) {
            return EnumSet.complementOf((EnumSet) collection);
        }
        sij.o(!collection.isEmpty(), "collection is empty; use the other version of this method");
        return makeComplementByHand(collection, collection.iterator().next().getDeclaringClass());
    }

    public static <E> SetView<E> difference(final Set<E> set, final Set set2) {
        set.getClass();
        set2.getClass();
        return new SetView() { // from class: com.google.common.collect.Sets.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return set.contains(obj) && !set2.contains(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                return set2.containsAll(set);
            }

            @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator iterator() {
                return new AbstractIterator(this, set, set2) { // from class: com.google.common.collect.Sets.3.1
                    final Iterator itr;
                    final /* synthetic */ Set val$set1;
                    final /* synthetic */ Set val$set2;

                    {
                        this.val$set1 = set;
                        this.val$set2 = set;
                        this.getClass();
                        this.itr = set.iterator();
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    protected Object computeNext() {
                        while (this.itr.hasNext()) {
                            Iterator it = this.itr;
                            Set set3 = this.val$set2;
                            Object next = it.next();
                            if (!set3.contains(next)) {
                                return next;
                            }
                        }
                        endOfData();
                        return null;
                    }
                };
            }

            @Override // com.google.common.collect.Sets.SetView
            public int maxSize() {
                return maxSize(set);
            }

            @Override // com.google.common.collect.Sets.SetView
            public int minSize() {
                return Math.max(minSize(set) - maxSize(set2), 0);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                Iterator it = set.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (!set2.contains(it.next())) {
                        i++;
                    }
                }
                return i;
            }
        };
    }

    static boolean equalsImpl(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> NavigableSet<E> filter(NavigableSet<E> navigableSet, tsv<? super E> tsvVar) {
        if (navigableSet instanceof FilteredSet) {
            FilteredSet filteredSet = (FilteredSet) navigableSet;
            return new FilteredNavigableSet((NavigableSet) filteredSet.unfiltered, sij.n(filteredSet.predicate, tsvVar));
        }
        navigableSet.getClass();
        tsvVar.getClass();
        return new FilteredNavigableSet(navigableSet, tsvVar);
    }

    static int hashCodeImpl(Set<?> set) {
        Iterator<?> it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    public static <E extends Enum<E>> ImmutableSet<E> immutableEnumSet(E e, E... eArr) {
        return ImmutableEnumSet.asImmutable(EnumSet.of((Enum) e, (Enum[]) eArr));
    }

    public static <E> SetView<E> intersection(final Set<E> set, final Set set2) {
        set.getClass();
        set2.getClass();
        return new SetView() { // from class: com.google.common.collect.Sets.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return set.contains(obj) && set2.contains(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean containsAll(Collection<?> collection) {
                return set.containsAll(collection) && set2.containsAll(collection);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                return Collections.disjoint(set2, set);
            }

            @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator iterator() {
                return new AbstractIterator(this, set, set2) { // from class: com.google.common.collect.Sets.2.1
                    final Iterator itr;
                    final /* synthetic */ Set val$set1;
                    final /* synthetic */ Set val$set2;

                    {
                        this.val$set1 = set;
                        this.val$set2 = set;
                        this.getClass();
                        this.itr = set.iterator();
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    protected Object computeNext() {
                        while (this.itr.hasNext()) {
                            Iterator it = this.itr;
                            Set set3 = this.val$set2;
                            Object next = it.next();
                            if (set3.contains(next)) {
                                return next;
                            }
                        }
                        endOfData();
                        return null;
                    }
                };
            }

            @Override // com.google.common.collect.Sets.SetView
            public int maxSize() {
                return Math.min(maxSize(set), maxSize(set2));
            }

            @Override // com.google.common.collect.Sets.SetView
            public int minSize() {
                return 0;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                Iterator it = set.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (set2.contains(it.next())) {
                        i++;
                    }
                }
                return i;
            }
        };
    }

    private static <E extends Enum<E>> EnumSet<E> makeComplementByHand(Collection<E> collection, Class<E> cls) {
        EnumSet<E> enumSetAllOf = EnumSet.allOf(cls);
        enumSetAllOf.removeAll(collection);
        return enumSetAllOf;
    }

    public static <E> Set<E> newConcurrentHashSet() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public static <E> CopyOnWriteArraySet<E> newCopyOnWriteArraySet() {
        return new CopyOnWriteArraySet<>();
    }

    public static <E extends Enum<E>> EnumSet<E> newEnumSet(Iterable<E> iterable, Class<E> cls) {
        EnumSet<E> enumSetNoneOf = EnumSet.noneOf(cls);
        Iterables.addAll(enumSetNoneOf, iterable);
        return enumSetNoneOf;
    }

    public static <E> HashSet<E> newHashSet() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> newHashSetWithExpectedSize(int i) {
        return new HashSet<>(Maps.capacity(i));
    }

    public static <E> Set<E> newIdentityHashSet() {
        return Collections.newSetFromMap(Maps.newIdentityHashMap());
    }

    public static <E> LinkedHashSet<E> newLinkedHashSet() {
        return new LinkedHashSet<>();
    }

    public static <E> LinkedHashSet<E> newLinkedHashSetWithExpectedSize(int i) {
        return new LinkedHashSet<>(Maps.capacity(i));
    }

    @Deprecated
    public static <E> Set<E> newSetFromMap(Map<E, Boolean> map) {
        return Collections.newSetFromMap(map);
    }

    public static <E extends Comparable> TreeSet<E> newTreeSet() {
        return new TreeSet<>();
    }

    public static <E> Set<Set<E>> powerSet(Set<E> set) {
        return new PowerSet(set);
    }

    static boolean removeAllImpl(Set<?> set, Collection<?> collection) {
        collection.getClass();
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).elementSet();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? removeAllImpl(set, collection.iterator()) : Iterators.removeAll(set.iterator(), collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K extends Comparable<? super K>> NavigableSet<K> subSet(NavigableSet<K> navigableSet, Range<K> range) {
        if (navigableSet.comparator() != null && navigableSet.comparator() != Ordering.natural() && range.hasLowerBound() && range.hasUpperBound()) {
            sij.o(navigableSet.comparator().compare(range.lowerEndpoint(), range.upperEndpoint()) <= 0, "set is using a custom comparator which is inconsistent with the natural ordering.");
        }
        if (range.hasLowerBound() && range.hasUpperBound()) {
            return navigableSet.subSet(range.lowerEndpoint(), range.lowerBoundType() == BoundType.CLOSED, range.upperEndpoint(), range.upperBoundType() == BoundType.CLOSED);
        }
        if (range.hasLowerBound()) {
            return navigableSet.tailSet(range.lowerEndpoint(), range.lowerBoundType() == BoundType.CLOSED);
        }
        if (range.hasUpperBound()) {
            return navigableSet.headSet(range.upperEndpoint(), range.upperBoundType() == BoundType.CLOSED);
        }
        navigableSet.getClass();
        return navigableSet;
    }

    public static <E> SetView<E> symmetricDifference(final Set<? extends E> set, final Set<? extends E> set2) {
        set.getClass();
        set2.getClass();
        return new SetView() { // from class: com.google.common.collect.Sets.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                Set set3 = set2;
                return set3.contains(obj) ^ set.contains(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                return set.equals(set2);
            }

            @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator iterator() {
                final Set set3 = set;
                final Iterator it = set3.iterator();
                final Set set4 = set2;
                final Iterator it2 = set4.iterator();
                return new AbstractIterator(this) { // from class: com.google.common.collect.Sets.4.1
                    {
                        this.getClass();
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    public Object computeNext() {
                        while (it.hasNext()) {
                            Iterator it3 = it;
                            Set set5 = set4;
                            Object next = it3.next();
                            if (!set5.contains(next)) {
                                return next;
                            }
                        }
                        while (it2.hasNext()) {
                            Iterator it4 = it2;
                            Set set6 = set3;
                            Object next2 = it4.next();
                            if (!set6.contains(next2)) {
                                return next2;
                            }
                        }
                        endOfData();
                        return null;
                    }
                };
            }

            @Override // com.google.common.collect.Sets.SetView
            public int maxSize() {
                return udo.f(maxSize(set), maxSize(set2));
            }

            @Override // com.google.common.collect.Sets.SetView
            public int minSize() {
                int iMinSize = minSize(set) - maxSize(set2);
                if (iMinSize >= 0) {
                    return iMinSize;
                }
                return Math.max(minSize(set2) - maxSize(set), 0);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                Iterator it = set.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (!set2.contains(it.next())) {
                        i++;
                    }
                }
                Iterator it2 = set2.iterator();
                while (it2.hasNext()) {
                    if (!set.contains(it2.next())) {
                        i++;
                    }
                }
                return i;
            }
        };
    }

    public static <E> NavigableSet<E> synchronizedNavigableSet(NavigableSet<E> navigableSet) {
        return Synchronized.navigableSet(navigableSet);
    }

    public static <E extends Enum<E>> Collector<E, ?, ImmutableSet<E>> toImmutableEnumSet() {
        return CollectCollectors.toImmutableEnumSet();
    }

    public static <E> SetView<E> union(final Set<? extends E> set, final Set<? extends E> set2) {
        set.getClass();
        set2.getClass();
        return new SetView() { // from class: com.google.common.collect.Sets.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return set.contains(obj) || set2.contains(obj);
            }

            @Override // com.google.common.collect.Sets.SetView
            public <S extends Set> S copyInto(S s) {
                s.addAll(set);
                s.addAll(set2);
                return s;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                return set.isEmpty() && set2.isEmpty();
            }

            @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator iterator() {
                return new AbstractIterator(this, set, set2) { // from class: com.google.common.collect.Sets.1.1
                    final Iterator itr1;
                    final Iterator itr2;
                    final /* synthetic */ Set val$set1;
                    final /* synthetic */ Set val$set2;

                    {
                        this.val$set1 = set;
                        this.val$set2 = set;
                        this.getClass();
                        this.itr1 = set.iterator();
                        this.itr2 = set.iterator();
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    protected Object computeNext() {
                        if (this.itr1.hasNext()) {
                            return this.itr1.next();
                        }
                        while (this.itr2.hasNext()) {
                            Iterator it = this.itr2;
                            Set set3 = this.val$set1;
                            Object next = it.next();
                            if (!set3.contains(next)) {
                                return next;
                            }
                        }
                        endOfData();
                        return null;
                    }
                };
            }

            @Override // com.google.common.collect.Sets.SetView
            public int maxSize() {
                return udo.f(maxSize(set), maxSize(set2));
            }

            @Override // com.google.common.collect.Sets.SetView
            public int minSize() {
                return Math.max(minSize(set), minSize(set2));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                Set set3 = set2;
                int size = set.size();
                Iterator it = set3.iterator();
                while (it.hasNext()) {
                    if (!set.contains(it.next())) {
                        size++;
                    }
                }
                return size;
            }
        };
    }

    public static <E> NavigableSet<E> unmodifiableNavigableSet(NavigableSet<E> navigableSet) {
        return ((navigableSet instanceof ImmutableCollection) || (navigableSet instanceof UnmodifiableNavigableSet)) ? navigableSet : new UnmodifiableNavigableSet(navigableSet);
    }

    @SafeVarargs
    public static <B> Set<List<B>> cartesianProduct(Set<? extends B>... setArr) {
        return cartesianProduct(Arrays.asList(setArr));
    }

    public static <E extends Enum<E>> ImmutableSet<E> immutableEnumSet(Iterable<E> iterable) {
        if (iterable instanceof ImmutableEnumSet) {
            return (ImmutableEnumSet) iterable;
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            return collection.isEmpty() ? ImmutableSet.of() : ImmutableEnumSet.asImmutable(EnumSet.copyOf(collection));
        }
        Iterator<E> it = iterable.iterator();
        if (!it.hasNext()) {
            return ImmutableSet.of();
        }
        EnumSet enumSetOf = EnumSet.of((Enum) it.next());
        Iterators.addAll(enumSetOf, it);
        return ImmutableEnumSet.asImmutable(enumSetOf);
    }

    public static <E> Set<E> newConcurrentHashSet(Iterable<? extends E> iterable) {
        Set<E> setNewConcurrentHashSet = newConcurrentHashSet();
        Iterables.addAll(setNewConcurrentHashSet, iterable);
        return setNewConcurrentHashSet;
    }

    public static <E> CopyOnWriteArraySet<E> newCopyOnWriteArraySet(Iterable<? extends E> iterable) {
        return new CopyOnWriteArraySet<>(iterable instanceof Collection ? (Collection) iterable : Lists.newArrayList(iterable));
    }

    public static <E> HashSet<E> newHashSet(Iterable<? extends E> iterable) {
        return iterable instanceof Collection ? new HashSet<>((Collection) iterable) : newHashSet(iterable.iterator());
    }

    public static <E> LinkedHashSet<E> newLinkedHashSet(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new LinkedHashSet<>((Collection) iterable);
        }
        LinkedHashSet<E> linkedHashSet = new LinkedHashSet<>();
        Iterables.addAll(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static <E extends Comparable> TreeSet<E> newTreeSet(Iterable<? extends E> iterable) {
        TreeSet<E> treeSetNewTreeSet = newTreeSet();
        Iterables.addAll(treeSetNewTreeSet, iterable);
        return treeSetNewTreeSet;
    }

    /* compiled from: PG */
    final class UnmodifiableNavigableSet<E> extends ForwardingSortedSet<E> implements NavigableSet<E>, Serializable {
        private static final long serialVersionUID = 0;
        private final NavigableSet<E> delegate;
        private transient UnmodifiableNavigableSet<E> descendingSet;
        private final SortedSet<E> unmodifiableDelegate;

        public UnmodifiableNavigableSet(NavigableSet<E> navigableSet) {
            navigableSet.getClass();
            this.delegate = navigableSet;
            this.unmodifiableDelegate = DesugarCollections.unmodifiableSortedSet(navigableSet);
        }

        @Override // java.util.NavigableSet
        public E ceiling(E e) {
            return this.delegate.ceiling(e);
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return Iterators.unmodifiableIterator(this.delegate.descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            UnmodifiableNavigableSet<E> unmodifiableNavigableSet = this.descendingSet;
            if (unmodifiableNavigableSet != null) {
                return unmodifiableNavigableSet;
            }
            UnmodifiableNavigableSet<E> unmodifiableNavigableSet2 = new UnmodifiableNavigableSet<>(this.delegate.descendingSet());
            this.descendingSet = unmodifiableNavigableSet2;
            unmodifiableNavigableSet2.descendingSet = this;
            return unmodifiableNavigableSet2;
        }

        @Override // java.util.NavigableSet
        public E floor(E e) {
            return this.delegate.floor(e);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(E e, boolean z) {
            return Sets.unmodifiableNavigableSet(this.delegate.headSet(e, z));
        }

        @Override // java.util.NavigableSet
        public E higher(E e) {
            return this.delegate.higher(e);
        }

        @Override // java.util.NavigableSet
        public E lower(E e) {
            return this.delegate.lower(e);
        }

        @Override // java.util.NavigableSet
        public E pollFirst() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        public E pollLast() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(E e, boolean z, E e2, boolean z2) {
            return Sets.unmodifiableNavigableSet(this.delegate.subSet(e, z, e2, z2));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(E e, boolean z) {
            return Sets.unmodifiableNavigableSet(this.delegate.tailSet(e, z));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public SortedSet<E> delegate() {
            return this.unmodifiableDelegate;
        }
    }

    public static <E> TreeSet<E> newTreeSet(Comparator<? super E> comparator) {
        comparator.getClass();
        return new TreeSet<>(comparator);
    }

    public static <E> HashSet<E> newHashSet(Iterator<? extends E> it) {
        HashSet<E> hashSet = new HashSet<>();
        Iterators.addAll(hashSet, it);
        return hashSet;
    }

    public static <E> Set<E> filter(Set<E> set, tsv<? super E> tsvVar) {
        if (set instanceof SortedSet) {
            return filter((SortedSet) set, (tsv) tsvVar);
        }
        if (set instanceof FilteredSet) {
            FilteredSet filteredSet = (FilteredSet) set;
            return new FilteredSet((Set) filteredSet.unfiltered, sij.n(filteredSet.predicate, tsvVar));
        }
        set.getClass();
        tsvVar.getClass();
        return new FilteredSet(set, tsvVar);
    }

    static boolean removeAllImpl(Set<?> set, Iterator<?> it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    public static <E extends Enum<E>> EnumSet<E> complementOf(Collection<E> collection, Class<E> cls) {
        collection.getClass();
        if (collection instanceof EnumSet) {
            return EnumSet.complementOf((EnumSet) collection);
        }
        return makeComplementByHand(collection, cls);
    }

    public static <E> HashSet<E> newHashSet(E... eArr) {
        HashSet<E> hashSetNewHashSetWithExpectedSize = newHashSetWithExpectedSize(eArr.length);
        Collections.addAll(hashSetNewHashSetWithExpectedSize, eArr);
        return hashSetNewHashSetWithExpectedSize;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> SortedSet<E> filter(SortedSet<E> sortedSet, tsv<? super E> tsvVar) {
        if (sortedSet instanceof FilteredSet) {
            FilteredSet filteredSet = (FilteredSet) sortedSet;
            return new FilteredSortedSet((SortedSet) filteredSet.unfiltered, sij.n(filteredSet.predicate, tsvVar));
        }
        sortedSet.getClass();
        tsvVar.getClass();
        return new FilteredSortedSet(sortedSet, tsvVar);
    }
}
