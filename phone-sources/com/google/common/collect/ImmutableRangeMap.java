package com.google.common.collect;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.SortedLists;
import defpackage.a;
import defpackage.sij;
import defpackage.tsl;
import j$.util.stream.Collector;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ImmutableRangeMap<K extends Comparable, V> implements RangeMap<K, V>, Serializable {
    private static final ImmutableRangeMap<Comparable<?>, Object> EMPTY = new ImmutableRangeMap<>(ImmutableList.of(), ImmutableList.of());
    private static final long serialVersionUID = 0;
    private final transient ImmutableList<Range<K>> ranges;
    private final transient ImmutableList<V> values;

    /* compiled from: PG */
    public final class Builder<K extends Comparable<?>, V> {
        private final List<Map.Entry<Range<K>, V>> entries = new ArrayList();

        public ImmutableRangeMap<K, V> build() {
            Collections.sort(this.entries, Range.rangeLexOrdering().onKeys());
            ImmutableList.Builder builder = new ImmutableList.Builder(this.entries.size());
            ImmutableList.Builder builder2 = new ImmutableList.Builder(this.entries.size());
            for (int i = 0; i < this.entries.size(); i++) {
                Range<K> key = this.entries.get(i).getKey();
                if (i > 0) {
                    Range<K> key2 = this.entries.get(i - 1).getKey();
                    if (key.isConnected(key2) && !key.intersection(key2).isEmpty()) {
                        throw new IllegalArgumentException(a.cA(key, key2, "Overlapping ranges: range ", " overlaps with entry "));
                    }
                }
                builder.add((ImmutableList.Builder) key);
                builder2.add((ImmutableList.Builder) this.entries.get(i).getValue());
            }
            return new ImmutableRangeMap<>(builder.build(), builder2.build());
        }

        public Builder<K, V> combine(Builder<K, V> builder) {
            this.entries.addAll(builder.entries);
            return this;
        }

        public Builder<K, V> put(Range<K> range, V v) {
            range.getClass();
            v.getClass();
            sij.s(!range.isEmpty(), "Range must not be empty, but was %s", range);
            this.entries.add(Maps.immutableEntry(range, v));
            return this;
        }

        public Builder<K, V> putAll(RangeMap<K, ? extends V> rangeMap) {
            for (Map.Entry<Range<K>, ? extends V> entry : rangeMap.asMapOfRanges().entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
            return this;
        }
    }

    /* compiled from: PG */
    class SerializedForm<K extends Comparable<?>, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final ImmutableMap<Range<K>, V> mapOfRanges;

        public SerializedForm(ImmutableMap<Range<K>, V> immutableMap) {
            this.mapOfRanges = immutableMap;
        }

        public Object createRangeMap() {
            Builder builder = new Builder();
            UnmodifiableIterator<Map.Entry<Range<K>, V>> it = this.mapOfRanges.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Range<K>, V> next = it.next();
                builder.put(next.getKey(), next.getValue());
            }
            return builder.build();
        }

        Object readResolve() {
            return this.mapOfRanges.isEmpty() ? ImmutableRangeMap.of() : createRangeMap();
        }
    }

    public ImmutableRangeMap(ImmutableList<Range<K>> immutableList, ImmutableList<V> immutableList2) {
        this.ranges = immutableList;
        this.values = immutableList2;
    }

    public static <K extends Comparable<?>, V> Builder<K, V> builder() {
        return new Builder<>();
    }

    public static <K extends Comparable<?>, V> ImmutableRangeMap<K, V> copyOf(RangeMap<K, ? extends V> rangeMap) {
        if (rangeMap instanceof ImmutableRangeMap) {
            return (ImmutableRangeMap) rangeMap;
        }
        Map<Range<K>, ? extends V> mapAsMapOfRanges = rangeMap.asMapOfRanges();
        ImmutableList.Builder builder = new ImmutableList.Builder(mapAsMapOfRanges.size());
        ImmutableList.Builder builder2 = new ImmutableList.Builder(mapAsMapOfRanges.size());
        for (Map.Entry<Range<K>, ? extends V> entry : mapAsMapOfRanges.entrySet()) {
            builder.add((ImmutableList.Builder) entry.getKey());
            builder2.add((ImmutableList.Builder) entry.getValue());
        }
        return new ImmutableRangeMap<>(builder.build(), builder2.build());
    }

    public static <K extends Comparable<?>, V> ImmutableRangeMap<K, V> of() {
        return EMPTY;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <T, K extends Comparable<? super K>, V> Collector<T, ?, ImmutableRangeMap<K, V>> toImmutableRangeMap(Function<? super T, Range<K>> function, Function<? super T, ? extends V> function2) {
        return CollectCollectors.toImmutableRangeMap(function, function2);
    }

    @Override // com.google.common.collect.RangeMap
    public ImmutableMap<Range<K>, V> asDescendingMapOfRanges() {
        return this.ranges.isEmpty() ? ImmutableMap.of() : new ImmutableSortedMap(new RegularImmutableSortedSet(this.ranges.reverse(), Range.rangeLexOrdering().reverse()), this.values.reverse());
    }

    @Override // com.google.common.collect.RangeMap
    public ImmutableMap<Range<K>, V> asMapOfRanges() {
        return this.ranges.isEmpty() ? ImmutableMap.of() : new ImmutableSortedMap(new RegularImmutableSortedSet(this.ranges, Range.rangeLexOrdering()), this.values);
    }

    @Override // com.google.common.collect.RangeMap
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.RangeMap
    public boolean equals(Object obj) {
        if (obj instanceof RangeMap) {
            return asMapOfRanges().equals(((RangeMap) obj).asMapOfRanges());
        }
        return false;
    }

    @Override // com.google.common.collect.RangeMap
    public V get(K k) {
        int iBinarySearch = SortedLists.binarySearch(this.ranges, new ImmutableRangeMap$$ExternalSyntheticLambda1(), Cut.belowValue(k), SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_LOWER);
        if (iBinarySearch != -1 && this.ranges.get(iBinarySearch).contains(k)) {
            return this.values.get(iBinarySearch);
        }
        return null;
    }

    @Override // com.google.common.collect.RangeMap
    public Map.Entry<Range<K>, V> getEntry(K k) {
        int iBinarySearch = SortedLists.binarySearch(this.ranges, new ImmutableRangeMap$$ExternalSyntheticLambda1(), Cut.belowValue(k), SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_LOWER);
        if (iBinarySearch == -1) {
            return null;
        }
        Range<K> range = this.ranges.get(iBinarySearch);
        if (range.contains(k)) {
            return Maps.immutableEntry(range, this.values.get(iBinarySearch));
        }
        return null;
    }

    @Override // com.google.common.collect.RangeMap
    public int hashCode() {
        return asMapOfRanges().hashCode();
    }

    @Override // com.google.common.collect.RangeMap
    @Deprecated
    public final void merge(Range<K> range, V v, BiFunction<? super V, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.RangeMap
    @Deprecated
    public final void put(Range<K> range, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.RangeMap
    @Deprecated
    public final void putAll(RangeMap<K, ? extends V> rangeMap) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.RangeMap
    @Deprecated
    public final void putCoalescing(Range<K> range, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.RangeMap
    @Deprecated
    public final void remove(Range<K> range) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.RangeMap
    public Range<K> span() {
        if (this.ranges.isEmpty()) {
            throw new NoSuchElementException();
        }
        return Range.create(this.ranges.get(0).lowerBound, this.ranges.get(r1.size() - 1).upperBound);
    }

    @Override // com.google.common.collect.RangeMap
    public ImmutableRangeMap<K, V> subRangeMap(final Range<K> range) {
        range.getClass();
        if (!range.isEmpty()) {
            if (this.ranges.isEmpty() || range.encloses(span())) {
                return this;
            }
            final int iBinarySearch = SortedLists.binarySearch(this.ranges, (tsl<? super E, Comparable>) new tsl() { // from class: com.google.common.collect.ImmutableRangeMap$$ExternalSyntheticLambda0
                @Override // defpackage.tsl
                public final Object apply(Object obj) {
                    return ((Range) obj).upperBound();
                }
            }, range.lowerBound, SortedLists.KeyPresentBehavior.FIRST_AFTER, SortedLists.KeyAbsentBehavior.NEXT_HIGHER);
            int iBinarySearch2 = SortedLists.binarySearch(this.ranges, new ImmutableRangeMap$$ExternalSyntheticLambda1(), range.upperBound, SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_HIGHER);
            if (iBinarySearch < iBinarySearch2) {
                final int i = iBinarySearch2 - iBinarySearch;
                return (ImmutableRangeMap<K, V>) new ImmutableRangeMap<K, V>(this, new ImmutableList<Range<K>>(this) { // from class: com.google.common.collect.ImmutableRangeMap.1
                    final /* synthetic */ ImmutableRangeMap this$0;

                    {
                        this.getClass();
                        this.this$0 = this;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.List
                    public Range<K> get(int i2) {
                        sij.B(i2, i);
                        if (i2 == 0 || i2 == i - 1) {
                            return ((Range) this.this$0.ranges.get(i2 + iBinarySearch)).intersection(range);
                        }
                        return (Range) this.this$0.ranges.get(i2 + iBinarySearch);
                    }

                    @Override // com.google.common.collect.ImmutableCollection
                    public boolean isPartialView() {
                        return true;
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                    public int size() {
                        return i;
                    }

                    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
                    public Object writeReplace() {
                        return super.writeReplace();
                    }
                }, this.values.subList(iBinarySearch, iBinarySearch2)) { // from class: com.google.common.collect.ImmutableRangeMap.2
                    {
                        this.getClass();
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.common.collect.ImmutableRangeMap, com.google.common.collect.RangeMap
                    public ImmutableRangeMap<K, V> subRangeMap(Range<K> range2) {
                        return range.isConnected(range2) ? this.subRangeMap((Range) range2.intersection(range)) : ImmutableRangeMap.of();
                    }

                    @Override // com.google.common.collect.ImmutableRangeMap
                    public Object writeReplace() {
                        return super.writeReplace();
                    }

                    @Override // com.google.common.collect.ImmutableRangeMap, com.google.common.collect.RangeMap
                    public /* bridge */ /* synthetic */ RangeMap subRangeMap(Range range2) {
                        return subRangeMap(range2);
                    }
                };
            }
        }
        return of();
    }

    @Override // com.google.common.collect.RangeMap
    public String toString() {
        return asMapOfRanges().toString();
    }

    public Object writeReplace() {
        return new SerializedForm(asMapOfRanges());
    }

    public static <K extends Comparable<?>, V> ImmutableRangeMap<K, V> of(Range<K> range, V v) {
        return new ImmutableRangeMap<>(ImmutableList.of(range), ImmutableList.of(v));
    }
}
