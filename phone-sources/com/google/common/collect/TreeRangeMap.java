package com.google.common.collect;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import defpackage.a;
import defpackage.sij;
import defpackage.tsv;
import defpackage.tsx;
import defpackage.tsy;
import defpackage.ttb;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.BiFunction;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class TreeRangeMap<K extends Comparable, V> implements RangeMap<K, V> {
    private static final RangeMap<Comparable<?>, Object> EMPTY_SUB_RANGE_MAP = new RangeMap<Comparable<?>, Object>() { // from class: com.google.common.collect.TreeRangeMap.1
        @Override // com.google.common.collect.RangeMap
        public Map<Range<Comparable<?>>, Object> asDescendingMapOfRanges() {
            return Collections.EMPTY_MAP;
        }

        @Override // com.google.common.collect.RangeMap
        public Map<Range<Comparable<?>>, Object> asMapOfRanges() {
            return Collections.EMPTY_MAP;
        }

        @Override // com.google.common.collect.RangeMap
        public Object get(Comparable<?> comparable) {
            return null;
        }

        @Override // com.google.common.collect.RangeMap
        public Map.Entry<Range<Comparable<?>>, Object> getEntry(Comparable<?> comparable) {
            return null;
        }

        @Override // com.google.common.collect.RangeMap
        public void merge(Range<Comparable<?>> range, Object obj, BiFunction<? super Object, ? super Object, ? extends Object> biFunction) {
            range.getClass();
            throw new IllegalArgumentException(a.ch(range, "Cannot merge range ", " into an empty subRangeMap"));
        }

        @Override // com.google.common.collect.RangeMap
        public void put(Range<Comparable<?>> range, Object obj) {
            range.getClass();
            throw new IllegalArgumentException(a.ch(range, "Cannot insert range ", " into an empty subRangeMap"));
        }

        @Override // com.google.common.collect.RangeMap
        public void putAll(RangeMap<Comparable<?>, ? extends Object> rangeMap) {
            if (!rangeMap.asMapOfRanges().isEmpty()) {
                throw new IllegalArgumentException("Cannot putAll(nonEmptyRangeMap) into an empty subRangeMap");
            }
        }

        @Override // com.google.common.collect.RangeMap
        public void putCoalescing(Range<Comparable<?>> range, Object obj) {
            range.getClass();
            throw new IllegalArgumentException(a.ch(range, "Cannot insert range ", " into an empty subRangeMap"));
        }

        @Override // com.google.common.collect.RangeMap
        public void remove(Range<Comparable<?>> range) {
            range.getClass();
        }

        @Override // com.google.common.collect.RangeMap
        public Range<Comparable<?>> span() {
            throw new NoSuchElementException();
        }

        @Override // com.google.common.collect.RangeMap
        public RangeMap<Comparable<?>, Object> subRangeMap(Range<Comparable<?>> range) {
            range.getClass();
            return this;
        }

        @Override // com.google.common.collect.RangeMap
        public void clear() {
        }
    };
    private final NavigableMap<Cut<K>, RangeMapEntry<K, V>> entriesByLowerBound;

    /* compiled from: PG */
    final class AsMapOfRanges extends Maps.IteratorBasedAbstractMap<Range<K>, V> {
        final Iterable<Map.Entry<Range<K>, V>> entryIterable;
        final /* synthetic */ TreeRangeMap this$0;

        public AsMapOfRanges(TreeRangeMap treeRangeMap, Iterable<RangeMapEntry<K, V>> iterable) {
            treeRangeMap.getClass();
            this.this$0 = treeRangeMap;
            this.entryIterable = iterable;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return get(obj) != null;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public Iterator<Map.Entry<Range<K>, V>> entryIterator() {
            return this.entryIterable.iterator();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            if (!(obj instanceof Range)) {
                return null;
            }
            Range range = (Range) obj;
            RangeMapEntry rangeMapEntry = (RangeMapEntry) this.this$0.entriesByLowerBound.get(range.lowerBound);
            if (rangeMapEntry == null || !rangeMapEntry.getKey().equals(range)) {
                return null;
            }
            return (V) rangeMapEntry.getValue();
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.this$0.entriesByLowerBound.size();
        }
    }

    /* compiled from: PG */
    final class RangeMapEntry<K extends Comparable, V> extends AbstractMapEntry<Range<K>, V> {
        private final Range<K> range;
        private final V value;

        public RangeMapEntry(Range<K> range, V v) {
            this.range = range;
            this.value = v;
        }

        public boolean contains(K k) {
            return this.range.contains(k);
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public Range<K> getKey() {
            return this.range;
        }

        public Cut<K> getLowerBound() {
            return (Cut<K>) this.range.lowerBound;
        }

        public Cut<K> getUpperBound() {
            return (Cut<K>) this.range.upperBound;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        public RangeMapEntry(Cut<K> cut, Cut<K> cut2, V v) {
            this(Range.create(cut, cut2), v);
        }
    }

    /* compiled from: PG */
    class SubRangeMap implements RangeMap<K, V> {
        private final Range<K> subRange;
        final /* synthetic */ TreeRangeMap this$0;

        /* compiled from: PG */
        class SubRangeMapAsMap extends AbstractMap<Range<K>, V> {
            final /* synthetic */ SubRangeMap this$1;

            public SubRangeMapAsMap(SubRangeMap subRangeMap) {
                subRangeMap.getClass();
                this.this$1 = subRangeMap;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean removeEntryIf(tsv<? super Map.Entry<Range<K>, V>> tsvVar) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<Range<K>, V> entry : entrySet()) {
                    if (tsvVar.apply(entry)) {
                        arrayList.add(entry.getKey());
                    }
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    this.this$1.this$0.remove((Range) arrayList.get(i));
                }
                return !arrayList.isEmpty();
            }

            @Override // java.util.AbstractMap, java.util.Map
            public void clear() {
                this.this$1.clear();
            }

            @Override // java.util.AbstractMap, java.util.Map
            public boolean containsKey(Object obj) {
                return get(obj) != null;
            }

            public Iterator<Map.Entry<Range<K>, V>> entryIterator() {
                if (this.this$1.subRange.isEmpty()) {
                    return Iterators.emptyIterator();
                }
                final Iterator<V> it = this.this$1.this$0.entriesByLowerBound.tailMap((Cut) sij.I((Cut) this.this$1.this$0.entriesByLowerBound.floorKey(this.this$1.subRange.lowerBound), this.this$1.subRange.lowerBound), true).values().iterator();
                return new AbstractIterator<Map.Entry<Range<K>, V>>(this) { // from class: com.google.common.collect.TreeRangeMap.SubRangeMap.SubRangeMapAsMap.3
                    final /* synthetic */ SubRangeMapAsMap this$2;

                    {
                        this.getClass();
                        this.this$2 = this;
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.google.common.collect.AbstractIterator
                    public Map.Entry<Range<K>, V> computeNext() {
                        while (it.hasNext()) {
                            RangeMapEntry rangeMapEntry = (RangeMapEntry) it.next();
                            if (rangeMapEntry.getLowerBound().compareTo((Cut) this.this$2.this$1.subRange.upperBound) >= 0) {
                                endOfData();
                                return null;
                            }
                            if (rangeMapEntry.getUpperBound().compareTo((Cut) this.this$2.this$1.subRange.lowerBound) > 0) {
                                return Maps.immutableEntry(rangeMapEntry.getKey().intersection(this.this$2.this$1.subRange), rangeMapEntry.getValue());
                            }
                        }
                        endOfData();
                        return null;
                    }
                };
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Set<Map.Entry<Range<K>, V>> entrySet() {
                return new Maps.EntrySet<Range<K>, V>(this) { // from class: com.google.common.collect.TreeRangeMap.SubRangeMap.SubRangeMapAsMap.2
                    final /* synthetic */ SubRangeMapAsMap this$2;

                    {
                        this.getClass();
                        this.this$2 = this;
                    }

                    @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                    public boolean isEmpty() {
                        return !iterator().hasNext();
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                    public Iterator<Map.Entry<Range<K>, V>> iterator() {
                        return this.this$2.entryIterator();
                    }

                    @Override // com.google.common.collect.Maps.EntrySet
                    public Map<Range<K>, V> map() {
                        return this.this$2;
                    }

                    @Override // com.google.common.collect.Maps.EntrySet, com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                    public boolean retainAll(Collection<?> collection) {
                        return this.this$2.removeEntryIf(new ttb(new tsy(collection)));
                    }

                    @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                    public int size() {
                        return Iterators.size(iterator());
                    }
                };
            }

            @Override // java.util.AbstractMap, java.util.Map
            public V get(Object obj) {
                RangeMapEntry rangeMapEntry;
                try {
                    if (obj instanceof Range) {
                        Range range = (Range) obj;
                        if (this.this$1.subRange.encloses(range) && !range.isEmpty()) {
                            if (range.lowerBound.compareTo((Cut) this.this$1.subRange.lowerBound) == 0) {
                                Map.Entry entryFloorEntry = this.this$1.this$0.entriesByLowerBound.floorEntry(range.lowerBound);
                                rangeMapEntry = entryFloorEntry != null ? (RangeMapEntry) entryFloorEntry.getValue() : null;
                            } else {
                                rangeMapEntry = (RangeMapEntry) this.this$1.this$0.entriesByLowerBound.get(range.lowerBound);
                            }
                            if (rangeMapEntry != null && rangeMapEntry.getKey().isConnected(this.this$1.subRange) && rangeMapEntry.getKey().intersection(this.this$1.subRange).equals(range)) {
                                return (V) rangeMapEntry.getValue();
                            }
                        }
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Set<Range<K>> keySet() {
                return new Maps.KeySet<Range<K>, V>(this, this) { // from class: com.google.common.collect.TreeRangeMap.SubRangeMap.SubRangeMapAsMap.1
                    final /* synthetic */ SubRangeMapAsMap this$2;

                    {
                        this.getClass();
                        this.this$2 = this;
                    }

                    @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                    public boolean remove(Object obj) {
                        return this.this$2.remove(obj) != null;
                    }

                    @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                    public boolean retainAll(Collection<?> collection) {
                        return this.this$2.removeEntryIf(new tsx(new ttb(new tsy(collection)), Maps.keyFunction()));
                    }
                };
            }

            @Override // java.util.AbstractMap, java.util.Map
            public V remove(Object obj) {
                V v = (V) get(obj);
                if (v == null) {
                    return null;
                }
                obj.getClass();
                this.this$1.this$0.remove((Range) obj);
                return v;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Collection<V> values() {
                return new Maps.Values<Range<K>, V>(this, this) { // from class: com.google.common.collect.TreeRangeMap.SubRangeMap.SubRangeMapAsMap.4
                    final /* synthetic */ SubRangeMapAsMap this$2;

                    {
                        this.getClass();
                        this.this$2 = this;
                    }

                    @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
                    public boolean removeAll(Collection<?> collection) {
                        return this.this$2.removeEntryIf(new tsx(new tsy(collection), Maps.valueFunction()));
                    }

                    @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
                    public boolean retainAll(Collection<?> collection) {
                        return this.this$2.removeEntryIf(new tsx(new ttb(new tsy(collection)), Maps.valueFunction()));
                    }
                };
            }
        }

        public SubRangeMap(TreeRangeMap treeRangeMap, Range<K> range) {
            treeRangeMap.getClass();
            this.this$0 = treeRangeMap;
            this.subRange = range;
        }

        @Override // com.google.common.collect.RangeMap
        public Map<Range<K>, V> asDescendingMapOfRanges() {
            return new TreeRangeMap<K, V>.SubRangeMap.SubRangeMapAsMap(this) { // from class: com.google.common.collect.TreeRangeMap.SubRangeMap.1
                final /* synthetic */ SubRangeMap this$1;

                {
                    this.getClass();
                    this.this$1 = this;
                }

                @Override // com.google.common.collect.TreeRangeMap.SubRangeMap.SubRangeMapAsMap
                public Iterator<Map.Entry<Range<K>, V>> entryIterator() {
                    if (this.this$1.subRange.isEmpty()) {
                        return Iterators.emptyIterator();
                    }
                    final Iterator<V> it = this.this$1.this$0.entriesByLowerBound.headMap(this.this$1.subRange.upperBound, false).descendingMap().values().iterator();
                    return new AbstractIterator<Map.Entry<Range<K>, V>>(this) { // from class: com.google.common.collect.TreeRangeMap.SubRangeMap.1.1
                        final /* synthetic */ AnonymousClass1 this$2;

                        {
                            this.getClass();
                            this.this$2 = this;
                        }

                        /* JADX INFO: Access modifiers changed from: protected */
                        @Override // com.google.common.collect.AbstractIterator
                        public Map.Entry<Range<K>, V> computeNext() {
                            if (!it.hasNext()) {
                                endOfData();
                                return null;
                            }
                            RangeMapEntry rangeMapEntry = (RangeMapEntry) it.next();
                            if (rangeMapEntry.getUpperBound().compareTo((Cut) this.this$2.this$1.subRange.lowerBound) > 0) {
                                return Maps.immutableEntry(rangeMapEntry.getKey().intersection(this.this$2.this$1.subRange), rangeMapEntry.getValue());
                            }
                            endOfData();
                            return null;
                        }
                    };
                }
            };
        }

        @Override // com.google.common.collect.RangeMap
        public Map<Range<K>, V> asMapOfRanges() {
            return new SubRangeMapAsMap(this);
        }

        @Override // com.google.common.collect.RangeMap
        public void clear() {
            this.this$0.remove(this.subRange);
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
            if (this.subRange.contains(k)) {
                return (V) this.this$0.get(k);
            }
            return null;
        }

        @Override // com.google.common.collect.RangeMap
        public Map.Entry<Range<K>, V> getEntry(K k) {
            Map.Entry<Range<K>, V> entry;
            if (!this.subRange.contains(k) || (entry = this.this$0.getEntry(k)) == null) {
                return null;
            }
            return Maps.immutableEntry(entry.getKey().intersection(this.subRange), entry.getValue());
        }

        @Override // com.google.common.collect.RangeMap
        public int hashCode() {
            return asMapOfRanges().hashCode();
        }

        @Override // com.google.common.collect.RangeMap
        public void merge(Range<K> range, V v, BiFunction<? super V, ? super V, ? extends V> biFunction) {
            Range<K> range2 = this.subRange;
            sij.v(range2.encloses(range), "Cannot merge range %s into a subRangeMap(%s)", range, range2);
            this.this$0.merge(range, v, biFunction);
        }

        @Override // com.google.common.collect.RangeMap
        public void put(Range<K> range, V v) {
            Range<K> range2 = this.subRange;
            sij.v(range2.encloses(range), "Cannot put range %s into a subRangeMap(%s)", range, range2);
            this.this$0.put(range, v);
        }

        @Override // com.google.common.collect.RangeMap
        public void putAll(RangeMap<K, ? extends V> rangeMap) {
            if (rangeMap.asMapOfRanges().isEmpty()) {
                return;
            }
            Range<K> rangeSpan = rangeMap.span();
            sij.v(this.subRange.encloses(rangeSpan), "Cannot putAll rangeMap with span %s into a subRangeMap(%s)", rangeSpan, this.subRange);
            this.this$0.putAll(rangeMap);
        }

        @Override // com.google.common.collect.RangeMap
        public void putCoalescing(Range<K> range, V v) {
            if (this.this$0.entriesByLowerBound.isEmpty() || !this.subRange.encloses(range)) {
                put(range, v);
                return;
            }
            TreeRangeMap treeRangeMap = this.this$0;
            v.getClass();
            put(treeRangeMap.coalescedRange(range, v).intersection(this.subRange), v);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.RangeMap
        public void remove(Range<K> range) {
            if (range.isConnected(this.subRange)) {
                this.this$0.remove(range.intersection(this.subRange));
            }
        }

        @Override // com.google.common.collect.RangeMap
        public Range<K> span() {
            Cut cut;
            Map.Entry entryFloorEntry = this.this$0.entriesByLowerBound.floorEntry(this.subRange.lowerBound);
            if (entryFloorEntry == null || ((RangeMapEntry) entryFloorEntry.getValue()).getUpperBound().compareTo((Cut) this.subRange.lowerBound) <= 0) {
                cut = (Cut) this.this$0.entriesByLowerBound.ceilingKey(this.subRange.lowerBound);
                if (cut == null || cut.compareTo((Cut) this.subRange.upperBound) >= 0) {
                    throw new NoSuchElementException();
                }
            } else {
                cut = this.subRange.lowerBound;
            }
            Map.Entry entryLowerEntry = this.this$0.entriesByLowerBound.lowerEntry(this.subRange.upperBound);
            if (entryLowerEntry != null) {
                return Range.create(cut, ((RangeMapEntry) entryLowerEntry.getValue()).getUpperBound().compareTo((Cut) this.subRange.upperBound) >= 0 ? this.subRange.upperBound : ((RangeMapEntry) entryLowerEntry.getValue()).getUpperBound());
            }
            throw new NoSuchElementException();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.RangeMap
        public RangeMap<K, V> subRangeMap(Range<K> range) {
            return !range.isConnected(this.subRange) ? this.this$0.emptySubRangeMap() : this.this$0.subRangeMap(range.intersection(this.subRange));
        }

        @Override // com.google.common.collect.RangeMap
        public String toString() {
            return asMapOfRanges().toString();
        }
    }

    private TreeRangeMap(NavigableMap<Cut<K>, RangeMapEntry<K, V>> navigableMap) {
        this.entriesByLowerBound = navigableMap;
    }

    private static <K extends Comparable, V> Range<K> coalesce(Range<K> range, V v, Map.Entry<Cut<K>, RangeMapEntry<K, V>> entry) {
        return (entry != null && entry.getValue().getKey().isConnected(range) && entry.getValue().getValue().equals(v)) ? (Range<K>) range.span(entry.getValue().getKey()) : range;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Range<K> coalescedRange(Range<K> range, V v) {
        return coalesce(coalesce(range, v, this.entriesByLowerBound.lowerEntry(range.lowerBound)), v, this.entriesByLowerBound.floorEntry(range.upperBound));
    }

    public static <K extends Comparable<?>, V> TreeRangeMap<K, V> copyOf(RangeMap<K, ? extends V> rangeMap) {
        if (rangeMap instanceof TreeRangeMap) {
            TreeMap treeMapNewTreeMap = Maps.newTreeMap();
            treeMapNewTreeMap.putAll(((TreeRangeMap) rangeMap).entriesByLowerBound);
            return new TreeRangeMap<>(treeMapNewTreeMap);
        }
        TreeMap treeMapNewTreeMap2 = Maps.newTreeMap();
        for (Map.Entry<Range<K>, ? extends V> entry : rangeMap.asMapOfRanges().entrySet()) {
            treeMapNewTreeMap2.put(entry.getKey().lowerBound(), new RangeMapEntry(entry.getKey(), entry.getValue()));
        }
        return new TreeRangeMap<>(treeMapNewTreeMap2);
    }

    public static <K extends Comparable, V> TreeRangeMap<K, V> create() {
        return new TreeRangeMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RangeMap<K, V> emptySubRangeMap() {
        return EMPTY_SUB_RANGE_MAP;
    }

    private void putRangeMapEntry(Cut<K> cut, Cut<K> cut2, V v) {
        this.entriesByLowerBound.put(cut, new RangeMapEntry(cut, cut2, v));
    }

    private void split(Cut<K> cut) {
        Map.Entry<Cut<K>, RangeMapEntry<K, V>> entryLowerEntry = this.entriesByLowerBound.lowerEntry(cut);
        if (entryLowerEntry == null) {
            return;
        }
        RangeMapEntry<K, V> value = entryLowerEntry.getValue();
        if (value.getUpperBound().compareTo((Cut) cut) > 0) {
            putRangeMapEntry(value.getLowerBound(), cut, value.getValue());
            putRangeMapEntry(cut, value.getUpperBound(), value.getValue());
        }
    }

    @Override // com.google.common.collect.RangeMap
    public Map<Range<K>, V> asDescendingMapOfRanges() {
        return new AsMapOfRanges(this, this.entriesByLowerBound.descendingMap().values());
    }

    @Override // com.google.common.collect.RangeMap
    public Map<Range<K>, V> asMapOfRanges() {
        return new AsMapOfRanges(this, this.entriesByLowerBound.values());
    }

    @Override // com.google.common.collect.RangeMap
    public void clear() {
        this.entriesByLowerBound.clear();
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
        Map.Entry<Range<K>, V> entry = getEntry(k);
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }

    @Override // com.google.common.collect.RangeMap
    public Map.Entry<Range<K>, V> getEntry(K k) {
        Map.Entry<Cut<K>, RangeMapEntry<K, V>> entryFloorEntry = this.entriesByLowerBound.floorEntry(Cut.belowValue(k));
        if (entryFloorEntry == null || !entryFloorEntry.getValue().contains(k)) {
            return null;
        }
        return entryFloorEntry.getValue();
    }

    @Override // com.google.common.collect.RangeMap
    public int hashCode() {
        return asMapOfRanges().hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.RangeMap
    public void merge(Range<K> range, V v, BiFunction<? super V, ? super V, ? extends V> biFunction) {
        range.getClass();
        biFunction.getClass();
        if (range.isEmpty()) {
            return;
        }
        split(range.lowerBound);
        split(range.upperBound);
        Set setEntrySet = this.entriesByLowerBound.subMap(range.lowerBound, range.upperBound).entrySet();
        ImmutableMap.Builder builder = ImmutableMap.builder();
        if (v != null) {
            Iterator it = setEntrySet.iterator();
            Cut upperBound = range.lowerBound;
            while (it.hasNext()) {
                RangeMapEntry rangeMapEntry = (RangeMapEntry) ((Map.Entry) it.next()).getValue();
                Cut<K> lowerBound = rangeMapEntry.getLowerBound();
                if (!upperBound.equals(lowerBound)) {
                    builder.put(upperBound, new RangeMapEntry(upperBound, lowerBound, v));
                }
                upperBound = rangeMapEntry.getUpperBound();
            }
            if (!upperBound.equals(range.upperBound)) {
                builder.put(upperBound, new RangeMapEntry(upperBound, range.upperBound, v));
            }
        }
        Iterator it2 = setEntrySet.iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Object objApply = biFunction.apply(((RangeMapEntry) entry.getValue()).getValue(), v);
            if (objApply == null) {
                it2.remove();
            } else {
                entry.setValue(new RangeMapEntry(((RangeMapEntry) entry.getValue()).getLowerBound(), ((RangeMapEntry) entry.getValue()).getUpperBound(), objApply));
            }
        }
        this.entriesByLowerBound.putAll(builder.build());
    }

    @Override // com.google.common.collect.RangeMap
    public void put(Range<K> range, V v) {
        if (range.isEmpty()) {
            return;
        }
        v.getClass();
        remove(range);
        this.entriesByLowerBound.put(range.lowerBound, new RangeMapEntry(range, v));
    }

    @Override // com.google.common.collect.RangeMap
    public void putAll(RangeMap<K, ? extends V> rangeMap) {
        for (Map.Entry<Range<K>, ? extends V> entry : rangeMap.asMapOfRanges().entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.common.collect.RangeMap
    public void putCoalescing(Range<K> range, V v) {
        if (this.entriesByLowerBound.isEmpty()) {
            put(range, v);
        } else {
            v.getClass();
            put(coalescedRange(range, v), v);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.RangeMap
    public void remove(Range<K> range) {
        if (range.isEmpty()) {
            return;
        }
        Map.Entry entryLowerEntry = this.entriesByLowerBound.lowerEntry(range.lowerBound);
        if (entryLowerEntry != null) {
            RangeMapEntry rangeMapEntry = (RangeMapEntry) entryLowerEntry.getValue();
            if (rangeMapEntry.getUpperBound().compareTo((Cut) range.lowerBound) > 0) {
                if (rangeMapEntry.getUpperBound().compareTo((Cut) range.upperBound) > 0) {
                    putRangeMapEntry(range.upperBound, rangeMapEntry.getUpperBound(), ((RangeMapEntry) entryLowerEntry.getValue()).getValue());
                }
                putRangeMapEntry(rangeMapEntry.getLowerBound(), range.lowerBound, ((RangeMapEntry) entryLowerEntry.getValue()).getValue());
            }
        }
        Map.Entry entryLowerEntry2 = this.entriesByLowerBound.lowerEntry(range.upperBound);
        if (entryLowerEntry2 != null) {
            RangeMapEntry rangeMapEntry2 = (RangeMapEntry) entryLowerEntry2.getValue();
            if (rangeMapEntry2.getUpperBound().compareTo((Cut) range.upperBound) > 0) {
                putRangeMapEntry(range.upperBound, rangeMapEntry2.getUpperBound(), ((RangeMapEntry) entryLowerEntry2.getValue()).getValue());
            }
        }
        this.entriesByLowerBound.subMap(range.lowerBound, range.upperBound).clear();
    }

    @Override // com.google.common.collect.RangeMap
    public Range<K> span() {
        NavigableMap<Cut<K>, RangeMapEntry<K, V>> navigableMap = this.entriesByLowerBound;
        Map.Entry<Cut<K>, RangeMapEntry<K, V>> entryFirstEntry = navigableMap.firstEntry();
        Map.Entry<Cut<K>, RangeMapEntry<K, V>> entryLastEntry = navigableMap.lastEntry();
        if (entryFirstEntry == null || entryLastEntry == null) {
            throw new NoSuchElementException();
        }
        return Range.create(entryFirstEntry.getValue().getKey().lowerBound, entryLastEntry.getValue().getKey().upperBound);
    }

    @Override // com.google.common.collect.RangeMap
    public RangeMap<K, V> subRangeMap(Range<K> range) {
        return range.equals(Range.all()) ? this : new SubRangeMap(this, range);
    }

    @Override // com.google.common.collect.RangeMap
    public String toString() {
        return this.entriesByLowerBound.values().toString();
    }

    private TreeRangeMap() {
        this.entriesByLowerBound = Maps.newTreeMap();
    }
}
