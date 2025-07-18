package com.google.common.collect;

import defpackage.sij;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class TreeRangeSet<C extends Comparable> extends AbstractRangeSet<C> implements Serializable {
    private transient Set<Range<C>> asDescendingSetOfRanges;
    private transient Set<Range<C>> asRanges;
    private transient RangeSet<C> complement;
    final NavigableMap<Cut<C>, Range<C>> rangesByLowerBound;

    /* compiled from: PG */
    final class AsRanges extends ForwardingCollection<Range<C>> implements Set<Range<C>> {
        final Collection<Range<C>> delegate;

        public AsRanges(TreeRangeSet treeRangeSet, Collection<Range<C>> collection) {
            treeRangeSet.getClass();
            this.delegate = collection;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return Sets.equalsImpl(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return Sets.hashCodeImpl(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Collection<Range<C>> delegate() {
            return this.delegate;
        }
    }

    /* compiled from: PG */
    final class Complement extends TreeRangeSet<C> {
        final /* synthetic */ TreeRangeSet this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Complement(TreeRangeSet treeRangeSet) {
            super(new ComplementRangesByLowerBound(treeRangeSet.rangesByLowerBound));
            treeRangeSet.getClass();
            this.this$0 = treeRangeSet;
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public void add(Range<C> range) {
            this.this$0.remove(range);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.RangeSet
        public RangeSet<C> complement() {
            return this.this$0;
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public boolean contains(C c) {
            return !this.this$0.contains(c);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public void remove(Range<C> range) {
            this.this$0.add(range);
        }
    }

    /* compiled from: PG */
    final class ComplementRangesByLowerBound<C extends Comparable<?>> extends AbstractNavigableMap<Cut<C>, Range<C>> {
        private final Range<Cut<C>> complementLowerBoundWindow;
        private final NavigableMap<Cut<C>, Range<C>> positiveRangesByLowerBound;
        private final NavigableMap<Cut<C>, Range<C>> positiveRangesByUpperBound;

        public ComplementRangesByLowerBound(NavigableMap<Cut<C>, Range<C>> navigableMap) {
            this(navigableMap, Range.all());
        }

        @Override // java.util.SortedMap
        public Comparator<? super Cut<C>> comparator() {
            return Ordering.natural();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return get(obj) != null;
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        public Iterator<Map.Entry<Cut<C>, Range<C>>> descendingEntryIterator() {
            Cut<C> cutHigherKey;
            Cut<C> cutAboveAll = this.complementLowerBoundWindow.hasUpperBound() ? (Cut) this.complementLowerBoundWindow.upperEndpoint() : Cut.aboveAll();
            boolean z = false;
            if (this.complementLowerBoundWindow.hasUpperBound() && this.complementLowerBoundWindow.upperBoundType() == BoundType.CLOSED) {
                z = true;
            }
            PeekingIterator peekingIterator = Iterators.peekingIterator(this.positiveRangesByUpperBound.headMap(cutAboveAll, z).descendingMap().values().iterator());
            if (peekingIterator.hasNext()) {
                cutHigherKey = ((Range) peekingIterator.peek()).upperBound == Cut.aboveAll() ? ((Range) peekingIterator.next()).lowerBound : this.positiveRangesByLowerBound.higherKey(((Range) peekingIterator.peek()).upperBound);
            } else {
                if (!this.complementLowerBoundWindow.contains(Cut.belowAll()) || this.positiveRangesByLowerBound.containsKey(Cut.belowAll())) {
                    return Iterators.emptyIterator();
                }
                cutHigherKey = this.positiveRangesByLowerBound.higherKey(Cut.belowAll());
            }
            return new AbstractIterator<Map.Entry<Cut<C>, Range<C>>>(this, (Cut) sij.I(cutHigherKey, Cut.aboveAll()), peekingIterator) { // from class: com.google.common.collect.TreeRangeSet.ComplementRangesByLowerBound.2
                Cut<C> nextComplementRangeUpperBound;
                final /* synthetic */ ComplementRangesByLowerBound this$0;
                final /* synthetic */ Cut val$firstComplementRangeUpperBound;
                final /* synthetic */ PeekingIterator val$positiveItr;

                {
                    this.val$firstComplementRangeUpperBound = cut;
                    this.val$positiveItr = peekingIterator;
                    this.getClass();
                    this.this$0 = this;
                    this.nextComplementRangeUpperBound = cut;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                public Map.Entry<Cut<C>, Range<C>> computeNext() {
                    if (this.nextComplementRangeUpperBound == Cut.belowAll()) {
                        endOfData();
                        return null;
                    }
                    if (this.val$positiveItr.hasNext()) {
                        Range range = (Range) this.val$positiveItr.next();
                        Range rangeCreate = Range.create(range.upperBound, this.nextComplementRangeUpperBound);
                        this.nextComplementRangeUpperBound = range.lowerBound;
                        if (this.this$0.complementLowerBoundWindow.lowerBound.isLessThan(rangeCreate.lowerBound)) {
                            return Maps.immutableEntry(rangeCreate.lowerBound, rangeCreate);
                        }
                    } else if (this.this$0.complementLowerBoundWindow.lowerBound.isLessThan(Cut.belowAll())) {
                        Range rangeCreate2 = Range.create(Cut.belowAll(), this.nextComplementRangeUpperBound);
                        this.nextComplementRangeUpperBound = Cut.belowAll();
                        return Maps.immutableEntry(Cut.belowAll(), rangeCreate2);
                    }
                    endOfData();
                    return null;
                }
            };
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public Iterator<Map.Entry<Cut<C>, Range<C>>> entryIterator() {
            Collection<Range<C>> collectionValues;
            Cut<C> cutBelowAll;
            if (this.complementLowerBoundWindow.hasLowerBound()) {
                collectionValues = this.positiveRangesByUpperBound.tailMap((Cut) this.complementLowerBoundWindow.lowerEndpoint(), this.complementLowerBoundWindow.lowerBoundType() == BoundType.CLOSED).values();
            } else {
                collectionValues = this.positiveRangesByUpperBound.values();
            }
            PeekingIterator peekingIterator = Iterators.peekingIterator(collectionValues.iterator());
            if (this.complementLowerBoundWindow.contains(Cut.belowAll()) && (!peekingIterator.hasNext() || ((Range) peekingIterator.peek()).lowerBound != Cut.belowAll())) {
                cutBelowAll = Cut.belowAll();
            } else {
                if (!peekingIterator.hasNext()) {
                    return Iterators.emptyIterator();
                }
                cutBelowAll = ((Range) peekingIterator.next()).upperBound;
            }
            return new AbstractIterator<Map.Entry<Cut<C>, Range<C>>>(this, cutBelowAll, peekingIterator) { // from class: com.google.common.collect.TreeRangeSet.ComplementRangesByLowerBound.1
                Cut<C> nextComplementRangeLowerBound;
                final /* synthetic */ ComplementRangesByLowerBound this$0;
                final /* synthetic */ Cut val$firstComplementRangeLowerBound;
                final /* synthetic */ PeekingIterator val$positiveItr;

                {
                    this.val$firstComplementRangeLowerBound = cutBelowAll;
                    this.val$positiveItr = peekingIterator;
                    this.getClass();
                    this.this$0 = this;
                    this.nextComplementRangeLowerBound = cutBelowAll;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                public Map.Entry<Cut<C>, Range<C>> computeNext() {
                    Range rangeCreate;
                    if (this.this$0.complementLowerBoundWindow.upperBound.isLessThan(this.nextComplementRangeLowerBound) || this.nextComplementRangeLowerBound == Cut.aboveAll()) {
                        endOfData();
                        return null;
                    }
                    if (this.val$positiveItr.hasNext()) {
                        Range range = (Range) this.val$positiveItr.next();
                        rangeCreate = Range.create(this.nextComplementRangeLowerBound, range.lowerBound);
                        this.nextComplementRangeLowerBound = range.upperBound;
                    } else {
                        rangeCreate = Range.create(this.nextComplementRangeLowerBound, Cut.aboveAll());
                        this.nextComplementRangeLowerBound = Cut.aboveAll();
                    }
                    return Maps.immutableEntry(rangeCreate.lowerBound, rangeCreate);
                }
            };
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.AbstractMap, java.util.Map
        public Range<C> get(Object obj) {
            if (obj instanceof Cut) {
                try {
                    Cut<C> cut = (Cut) obj;
                    Map.Entry<Cut<C>, Range<C>> entryFirstEntry = tailMap((Cut) cut, true).firstEntry();
                    if (entryFirstEntry != null && entryFirstEntry.getKey().equals(cut)) {
                        return entryFirstEntry.getValue();
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Cut<C>, Range<C>> headMap(Cut<C> cut, boolean z) {
            return subMap(Range.upTo(cut, BoundType.forBoolean(z)));
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
            return Iterators.size(entryIterator());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Cut<C>, Range<C>> subMap(Cut<C> cut, boolean z, Cut<C> cut2, boolean z2) {
            return subMap(Range.range(cut, BoundType.forBoolean(z), cut2, BoundType.forBoolean(z2)));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Cut<C>, Range<C>> tailMap(Cut<C> cut, boolean z) {
            return subMap(Range.downTo(cut, BoundType.forBoolean(z)));
        }

        private ComplementRangesByLowerBound(NavigableMap<Cut<C>, Range<C>> navigableMap, Range<Cut<C>> range) {
            this.positiveRangesByLowerBound = navigableMap;
            this.positiveRangesByUpperBound = new RangesByUpperBound(navigableMap);
            this.complementLowerBoundWindow = range;
        }

        private NavigableMap<Cut<C>, Range<C>> subMap(Range<Cut<C>> range) {
            if (!this.complementLowerBoundWindow.isConnected(range)) {
                return ImmutableSortedMap.of();
            }
            return new ComplementRangesByLowerBound(this.positiveRangesByLowerBound, range.intersection(this.complementLowerBoundWindow));
        }
    }

    /* compiled from: PG */
    final class SubRangeSet extends TreeRangeSet<C> {
        private final Range<C> restriction;
        final /* synthetic */ TreeRangeSet this$0;

        /* JADX WARN: Illegal instructions before constructor call */
        public SubRangeSet(TreeRangeSet treeRangeSet, Range<C> range) {
            treeRangeSet.getClass();
            this.this$0 = treeRangeSet;
            super(new SubRangeSetRangesByLowerBound(Range.all(), range, treeRangeSet.rangesByLowerBound));
            this.restriction = range;
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public void add(Range<C> range) {
            Range<C> range2 = this.restriction;
            sij.v(range2.encloses(range), "Cannot add range %s to subRangeSet(%s)", range, range2);
            this.this$0.add(range);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public void clear() {
            this.this$0.remove(this.restriction);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public boolean contains(C c) {
            return this.restriction.contains(c) && this.this$0.contains(c);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public boolean encloses(Range<C> range) {
            Range rangeRangeEnclosing;
            return (this.restriction.isEmpty() || !this.restriction.encloses(range) || (rangeRangeEnclosing = this.this$0.rangeEnclosing(range)) == null || rangeRangeEnclosing.intersection(this.restriction).isEmpty()) ? false : true;
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public Range<C> rangeContaining(C c) {
            Range<C> rangeRangeContaining;
            if (this.restriction.contains(c) && (rangeRangeContaining = this.this$0.rangeContaining(c)) != null) {
                return rangeRangeContaining.intersection(this.restriction);
            }
            return null;
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public void remove(Range<C> range) {
            if (range.isConnected(this.restriction)) {
                this.this$0.remove(range.intersection(this.restriction));
            }
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.RangeSet
        public RangeSet<C> subRangeSet(Range<C> range) {
            return range.encloses(this.restriction) ? this : range.isConnected(this.restriction) ? new SubRangeSet(this, this.restriction.intersection(range)) : ImmutableRangeSet.of();
        }
    }

    /* compiled from: PG */
    final class SubRangeSetRangesByLowerBound<C extends Comparable<?>> extends AbstractNavigableMap<Cut<C>, Range<C>> {
        private final Range<Cut<C>> lowerBoundWindow;
        private final NavigableMap<Cut<C>, Range<C>> rangesByLowerBound;
        private final NavigableMap<Cut<C>, Range<C>> rangesByUpperBound;
        private final Range<C> restriction;

        @Override // java.util.SortedMap
        public Comparator<? super Cut<C>> comparator() {
            return Ordering.natural();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return get(obj) != null;
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        public Iterator<Map.Entry<Cut<C>, Range<C>>> descendingEntryIterator() {
            if (this.restriction.isEmpty()) {
                return Iterators.emptyIterator();
            }
            Cut cut = (Cut) Ordering.natural().min(this.lowerBoundWindow.upperBound, Cut.belowValue(this.restriction.upperBound));
            final Iterator<Range<C>> it = this.rangesByLowerBound.headMap((Cut) cut.endpoint(), cut.typeAsUpperBound() == BoundType.CLOSED).descendingMap().values().iterator();
            return new AbstractIterator<Map.Entry<Cut<C>, Range<C>>>(this) { // from class: com.google.common.collect.TreeRangeSet.SubRangeSetRangesByLowerBound.2
                final /* synthetic */ SubRangeSetRangesByLowerBound this$0;

                {
                    this.getClass();
                    this.this$0 = this;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                public Map.Entry<Cut<C>, Range<C>> computeNext() {
                    if (!it.hasNext()) {
                        endOfData();
                        return null;
                    }
                    Range range = (Range) it.next();
                    if (this.this$0.restriction.lowerBound.compareTo((Cut) range.upperBound) >= 0) {
                        endOfData();
                        return null;
                    }
                    Range<C> rangeIntersection = range.intersection(this.this$0.restriction);
                    if (this.this$0.lowerBoundWindow.contains(rangeIntersection.lowerBound)) {
                        return Maps.immutableEntry(rangeIntersection.lowerBound, rangeIntersection);
                    }
                    endOfData();
                    return null;
                }
            };
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public Iterator<Map.Entry<Cut<C>, Range<C>>> entryIterator() {
            final Iterator<Range<C>> it;
            if (this.restriction.isEmpty()) {
                return Iterators.emptyIterator();
            }
            if (this.lowerBoundWindow.upperBound.isLessThan(this.restriction.lowerBound)) {
                return Iterators.emptyIterator();
            }
            if (this.lowerBoundWindow.lowerBound.isLessThan(this.restriction.lowerBound)) {
                it = this.rangesByUpperBound.tailMap(this.restriction.lowerBound, false).values().iterator();
            } else {
                it = this.rangesByLowerBound.tailMap((Cut) this.lowerBoundWindow.lowerBound.endpoint(), this.lowerBoundWindow.lowerBoundType() == BoundType.CLOSED).values().iterator();
            }
            final Cut cut = (Cut) Ordering.natural().min(this.lowerBoundWindow.upperBound, Cut.belowValue(this.restriction.upperBound));
            return new AbstractIterator<Map.Entry<Cut<C>, Range<C>>>(this) { // from class: com.google.common.collect.TreeRangeSet.SubRangeSetRangesByLowerBound.1
                final /* synthetic */ SubRangeSetRangesByLowerBound this$0;

                {
                    this.getClass();
                    this.this$0 = this;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                public Map.Entry<Cut<C>, Range<C>> computeNext() {
                    if (!it.hasNext()) {
                        endOfData();
                        return null;
                    }
                    Range range = (Range) it.next();
                    if (cut.isLessThan(range.lowerBound)) {
                        endOfData();
                        return null;
                    }
                    Range<C> rangeIntersection = range.intersection(this.this$0.restriction);
                    return Maps.immutableEntry(rangeIntersection.lowerBound, rangeIntersection);
                }
            };
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.AbstractMap, java.util.Map
        public Range<C> get(Object obj) {
            if (obj instanceof Cut) {
                try {
                    Cut<C> cut = (Cut) obj;
                    if (this.lowerBoundWindow.contains(cut) && cut.compareTo((Cut) this.restriction.lowerBound) >= 0 && cut.compareTo((Cut) this.restriction.upperBound) < 0) {
                        if (cut.equals(this.restriction.lowerBound)) {
                            Range range = (Range) Maps.valueOrNull(this.rangesByLowerBound.floorEntry(cut));
                            if (range != null && range.upperBound.compareTo((Cut) this.restriction.lowerBound) > 0) {
                                return range.intersection(this.restriction);
                            }
                        } else {
                            Range range2 = (Range) this.rangesByLowerBound.get(cut);
                            if (range2 != null) {
                                return range2.intersection(this.restriction);
                            }
                        }
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Cut<C>, Range<C>> headMap(Cut<C> cut, boolean z) {
            return subMap(Range.upTo(cut, BoundType.forBoolean(z)));
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
            return Iterators.size(entryIterator());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Cut<C>, Range<C>> subMap(Cut<C> cut, boolean z, Cut<C> cut2, boolean z2) {
            return subMap(Range.range(cut, BoundType.forBoolean(z), cut2, BoundType.forBoolean(z2)));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Cut<C>, Range<C>> tailMap(Cut<C> cut, boolean z) {
            return subMap(Range.downTo(cut, BoundType.forBoolean(z)));
        }

        private SubRangeSetRangesByLowerBound(Range<Cut<C>> range, Range<C> range2, NavigableMap<Cut<C>, Range<C>> navigableMap) {
            range.getClass();
            this.lowerBoundWindow = range;
            range2.getClass();
            this.restriction = range2;
            navigableMap.getClass();
            this.rangesByLowerBound = navigableMap;
            this.rangesByUpperBound = new RangesByUpperBound(navigableMap);
        }

        private NavigableMap<Cut<C>, Range<C>> subMap(Range<Cut<C>> range) {
            if (!range.isConnected(this.lowerBoundWindow)) {
                return ImmutableSortedMap.of();
            }
            return new SubRangeSetRangesByLowerBound(this.lowerBoundWindow.intersection(range), this.restriction, this.rangesByLowerBound);
        }
    }

    private TreeRangeSet(NavigableMap<Cut<C>, Range<C>> navigableMap) {
        this.rangesByLowerBound = navigableMap;
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> create() {
        return new TreeRangeSet<>(new TreeMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Range<C> rangeEnclosing(Range<C> range) {
        range.getClass();
        Map.Entry<Cut<C>, Range<C>> entryFloorEntry = this.rangesByLowerBound.floorEntry(range.lowerBound);
        if (entryFloorEntry == null || !entryFloorEntry.getValue().encloses(range)) {
            return null;
        }
        return entryFloorEntry.getValue();
    }

    private void replaceRangeWithSameLowerBound(Range<C> range) {
        if (range.isEmpty()) {
            this.rangesByLowerBound.remove(range.lowerBound);
        } else {
            this.rangesByLowerBound.put(range.lowerBound, range);
        }
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public void add(Range<C> range) {
        range.getClass();
        if (range.isEmpty()) {
            return;
        }
        Cut<C> cut = range.lowerBound;
        Cut<C> cut2 = range.upperBound;
        Map.Entry<Cut<C>, Range<C>> entryLowerEntry = this.rangesByLowerBound.lowerEntry(cut);
        if (entryLowerEntry != null) {
            Range<C> value = entryLowerEntry.getValue();
            if (value.upperBound.compareTo((Cut) cut) >= 0) {
                if (value.upperBound.compareTo((Cut) cut2) >= 0) {
                    cut2 = value.upperBound;
                }
                cut = value.lowerBound;
            }
        }
        Map.Entry<Cut<C>, Range<C>> entryFloorEntry = this.rangesByLowerBound.floorEntry(cut2);
        if (entryFloorEntry != null) {
            Range<C> value2 = entryFloorEntry.getValue();
            if (value2.upperBound.compareTo((Cut) cut2) >= 0) {
                cut2 = value2.upperBound;
            }
        }
        this.rangesByLowerBound.subMap(cut, cut2).clear();
        replaceRangeWithSameLowerBound(Range.create(cut, cut2));
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void addAll(RangeSet rangeSet) {
        super.addAll(rangeSet);
    }

    @Override // com.google.common.collect.RangeSet
    public Set<Range<C>> asDescendingSetOfRanges() {
        Set<Range<C>> set = this.asDescendingSetOfRanges;
        if (set != null) {
            return set;
        }
        AsRanges asRanges = new AsRanges(this, this.rangesByLowerBound.descendingMap().values());
        this.asDescendingSetOfRanges = asRanges;
        return asRanges;
    }

    @Override // com.google.common.collect.RangeSet
    public Set<Range<C>> asRanges() {
        Set<Range<C>> set = this.asRanges;
        if (set != null) {
            return set;
        }
        AsRanges asRanges = new AsRanges(this, this.rangesByLowerBound.values());
        this.asRanges = asRanges;
        return asRanges;
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.RangeSet
    public RangeSet<C> complement() {
        RangeSet<C> rangeSet = this.complement;
        if (rangeSet != null) {
            return rangeSet;
        }
        Complement complement = new Complement(this);
        this.complement = complement;
        return complement;
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return super.contains(comparable);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public boolean encloses(Range<C> range) {
        range.getClass();
        Map.Entry<Cut<C>, Range<C>> entryFloorEntry = this.rangesByLowerBound.floorEntry(range.lowerBound);
        return entryFloorEntry != null && entryFloorEntry.getValue().encloses(range);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean enclosesAll(RangeSet rangeSet) {
        return super.enclosesAll(rangeSet);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public boolean intersects(Range<C> range) {
        range.getClass();
        Map.Entry<Cut<C>, Range<C>> entryCeilingEntry = this.rangesByLowerBound.ceilingEntry(range.lowerBound);
        if (entryCeilingEntry != null && entryCeilingEntry.getValue().isConnected(range) && !entryCeilingEntry.getValue().intersection(range).isEmpty()) {
            return true;
        }
        Map.Entry<Cut<C>, Range<C>> entryLowerEntry = this.rangesByLowerBound.lowerEntry(range.lowerBound);
        return (entryLowerEntry == null || !entryLowerEntry.getValue().isConnected(range) || entryLowerEntry.getValue().intersection(range).isEmpty()) ? false : true;
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public Range<C> rangeContaining(C c) {
        c.getClass();
        Map.Entry<Cut<C>, Range<C>> entryFloorEntry = this.rangesByLowerBound.floorEntry(Cut.belowValue(c));
        if (entryFloorEntry == null || !entryFloorEntry.getValue().contains(c)) {
            return null;
        }
        return entryFloorEntry.getValue();
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public void remove(Range<C> range) {
        range.getClass();
        if (range.isEmpty()) {
            return;
        }
        Map.Entry<Cut<C>, Range<C>> entryLowerEntry = this.rangesByLowerBound.lowerEntry(range.lowerBound);
        if (entryLowerEntry != null) {
            Range<C> value = entryLowerEntry.getValue();
            if (value.upperBound.compareTo((Cut) range.lowerBound) >= 0) {
                if (range.hasUpperBound() && value.upperBound.compareTo((Cut) range.upperBound) >= 0) {
                    replaceRangeWithSameLowerBound(Range.create(range.upperBound, value.upperBound));
                }
                replaceRangeWithSameLowerBound(Range.create(value.lowerBound, range.lowerBound));
            }
        }
        Map.Entry<Cut<C>, Range<C>> entryFloorEntry = this.rangesByLowerBound.floorEntry(range.upperBound);
        if (entryFloorEntry != null) {
            Range<C> value2 = entryFloorEntry.getValue();
            if (range.hasUpperBound() && value2.upperBound.compareTo((Cut) range.upperBound) >= 0) {
                replaceRangeWithSameLowerBound(Range.create(range.upperBound, value2.upperBound));
            }
        }
        this.rangesByLowerBound.subMap(range.lowerBound, range.upperBound).clear();
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void removeAll(RangeSet rangeSet) {
        super.removeAll(rangeSet);
    }

    @Override // com.google.common.collect.RangeSet
    public Range<C> span() {
        NavigableMap<Cut<C>, Range<C>> navigableMap = this.rangesByLowerBound;
        Map.Entry<Cut<C>, Range<C>> entryFirstEntry = navigableMap.firstEntry();
        Map.Entry<Cut<C>, Range<C>> entryLastEntry = navigableMap.lastEntry();
        if (entryFirstEntry == null || entryLastEntry == null) {
            throw new NoSuchElementException();
        }
        return Range.create(entryFirstEntry.getValue().lowerBound, entryLastEntry.getValue().upperBound);
    }

    @Override // com.google.common.collect.RangeSet
    public RangeSet<C> subRangeSet(Range<C> range) {
        return range.equals(Range.all()) ? this : new SubRangeSet(this, range);
    }

    /* compiled from: PG */
    final class RangesByUpperBound<C extends Comparable<?>> extends AbstractNavigableMap<Cut<C>, Range<C>> {
        private final NavigableMap<Cut<C>, Range<C>> rangesByLowerBound;
        private final Range<Cut<C>> upperBoundWindow;

        public RangesByUpperBound(NavigableMap<Cut<C>, Range<C>> navigableMap) {
            this.rangesByLowerBound = navigableMap;
            this.upperBoundWindow = Range.all();
        }

        @Override // java.util.SortedMap
        public Comparator<? super Cut<C>> comparator() {
            return Ordering.natural();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return get(obj) != null;
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        public Iterator<Map.Entry<Cut<C>, Range<C>>> descendingEntryIterator() {
            final PeekingIterator peekingIterator = Iterators.peekingIterator((this.upperBoundWindow.hasUpperBound() ? this.rangesByLowerBound.headMap((Cut) this.upperBoundWindow.upperEndpoint(), false).descendingMap().values() : this.rangesByLowerBound.descendingMap().values()).iterator());
            if (peekingIterator.hasNext() && this.upperBoundWindow.upperBound.isLessThan(((Range) peekingIterator.peek()).upperBound)) {
                peekingIterator.next();
            }
            return new AbstractIterator<Map.Entry<Cut<C>, Range<C>>>(this) { // from class: com.google.common.collect.TreeRangeSet.RangesByUpperBound.2
                final /* synthetic */ RangesByUpperBound this$0;

                {
                    this.getClass();
                    this.this$0 = this;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                public Map.Entry<Cut<C>, Range<C>> computeNext() {
                    if (!peekingIterator.hasNext()) {
                        endOfData();
                        return null;
                    }
                    Range range = (Range) peekingIterator.next();
                    if (this.this$0.upperBoundWindow.lowerBound.isLessThan(range.upperBound)) {
                        return Maps.immutableEntry(range.upperBound, range);
                    }
                    endOfData();
                    return null;
                }
            };
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public Iterator<Map.Entry<Cut<C>, Range<C>>> entryIterator() {
            Map.Entry<Cut<C>, Range<C>> entryLowerEntry;
            final Iterator<Range<C>> it = (this.upperBoundWindow.hasLowerBound() && (entryLowerEntry = this.rangesByLowerBound.lowerEntry((Cut) this.upperBoundWindow.lowerEndpoint())) != null) ? this.upperBoundWindow.lowerBound.isLessThan(entryLowerEntry.getValue().upperBound) ? this.rangesByLowerBound.tailMap(entryLowerEntry.getKey(), true).values().iterator() : this.rangesByLowerBound.tailMap((Cut) this.upperBoundWindow.lowerEndpoint(), true).values().iterator() : this.rangesByLowerBound.values().iterator();
            return new AbstractIterator<Map.Entry<Cut<C>, Range<C>>>(this) { // from class: com.google.common.collect.TreeRangeSet.RangesByUpperBound.1
                final /* synthetic */ RangesByUpperBound this$0;

                {
                    this.getClass();
                    this.this$0 = this;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                public Map.Entry<Cut<C>, Range<C>> computeNext() {
                    if (!it.hasNext()) {
                        endOfData();
                        return null;
                    }
                    Range range = (Range) it.next();
                    if (!this.this$0.upperBoundWindow.upperBound.isLessThan(range.upperBound)) {
                        return Maps.immutableEntry(range.upperBound, range);
                    }
                    endOfData();
                    return null;
                }
            };
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.AbstractMap, java.util.Map
        public Range<C> get(Object obj) {
            Map.Entry<Cut<C>, Range<C>> entryLowerEntry;
            if (obj instanceof Cut) {
                try {
                    Cut<C> cut = (Cut) obj;
                    if (this.upperBoundWindow.contains(cut) && (entryLowerEntry = this.rangesByLowerBound.lowerEntry(cut)) != null && entryLowerEntry.getValue().upperBound.equals(cut)) {
                        return entryLowerEntry.getValue();
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Cut<C>, Range<C>> headMap(Cut<C> cut, boolean z) {
            return subMap(Range.upTo(cut, BoundType.forBoolean(z)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.upperBoundWindow.equals(Range.all()) ? this.rangesByLowerBound.isEmpty() : !entryIterator().hasNext();
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.upperBoundWindow.equals(Range.all()) ? this.rangesByLowerBound.size() : Iterators.size(entryIterator());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Cut<C>, Range<C>> subMap(Cut<C> cut, boolean z, Cut<C> cut2, boolean z2) {
            return subMap(Range.range(cut, BoundType.forBoolean(z), cut2, BoundType.forBoolean(z2)));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Cut<C>, Range<C>> tailMap(Cut<C> cut, boolean z) {
            return subMap(Range.downTo(cut, BoundType.forBoolean(z)));
        }

        private RangesByUpperBound(NavigableMap<Cut<C>, Range<C>> navigableMap, Range<Cut<C>> range) {
            this.rangesByLowerBound = navigableMap;
            this.upperBoundWindow = range;
        }

        private NavigableMap<Cut<C>, Range<C>> subMap(Range<Cut<C>> range) {
            if (range.isConnected(this.upperBoundWindow)) {
                return new RangesByUpperBound(this.rangesByLowerBound, range.intersection(this.upperBoundWindow));
            }
            return ImmutableSortedMap.of();
        }
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> create(RangeSet<C> rangeSet) {
        TreeRangeSet<C> treeRangeSetCreate = create();
        treeRangeSetCreate.addAll(rangeSet);
        return treeRangeSetCreate;
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void addAll(Iterable iterable) {
        super.addAll(iterable);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean enclosesAll(Iterable iterable) {
        return super.enclosesAll(iterable);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void removeAll(Iterable iterable) {
        super.removeAll(iterable);
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> create(Iterable<Range<C>> iterable) {
        TreeRangeSet<C> treeRangeSetCreate = create();
        treeRangeSetCreate.addAll(iterable);
        return treeRangeSetCreate;
    }
}
