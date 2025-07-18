package com.google.common.collect;

import com.google.common.collect.Maps;
import defpackage.a;
import defpackage.tsl;
import defpackage.ttm;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class TreeBasedTable<R, C, V> extends StandardRowSortedTable<R, C, V> {
    private static final long serialVersionUID = 0;
    private final Comparator<? super C> columnComparator;

    /* compiled from: PG */
    class Factory<C, V> implements Serializable, ttm {
        private static final long serialVersionUID = 0;
        final Comparator<? super C> comparator;

        public Factory(Comparator<? super C> comparator) {
            this.comparator = comparator;
        }

        @Override // defpackage.ttm
        public Map<C, V> get() {
            return new TreeMap(this.comparator);
        }
    }

    /* compiled from: PG */
    class TreeRow extends StandardTable<R, C, V>.Row implements SortedMap<C, V> {
        final C lowerBound;
        final /* synthetic */ TreeBasedTable this$0;
        final C upperBound;
        transient SortedMap<C, V> wholeRow;

        public TreeRow(TreeBasedTable treeBasedTable, R r) {
            this(treeBasedTable, r, null, null);
        }

        @Override // java.util.SortedMap
        public Comparator<? super C> comparator() {
            return this.this$0.columnComparator();
        }

        public int compare(Object obj, Object obj2) {
            return comparator().compare(obj, obj2);
        }

        @Override // com.google.common.collect.StandardTable.Row, java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return rangeContains(obj) && super.containsKey(obj);
        }

        @Override // java.util.SortedMap
        public C firstKey() {
            updateBackingRowMapField();
            Map<C, V> map = this.backingRowMap;
            if (map != null) {
                return (C) ((SortedMap) map).firstKey();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.SortedMap
        public SortedMap<C, V> headMap(C c) {
            c.getClass();
            a.H(rangeContains(c));
            return new TreeRow(this.this$0, this.rowKey, this.lowerBound, c);
        }

        @Override // java.util.SortedMap
        public C lastKey() {
            updateBackingRowMapField();
            Map<C, V> map = this.backingRowMap;
            if (map != null) {
                return (C) ((SortedMap) map).lastKey();
            }
            throw new NoSuchElementException();
        }

        @Override // com.google.common.collect.StandardTable.Row
        public void maintainEmptyInvariant() {
            updateWholeRowField();
            SortedMap<C, V> sortedMap = this.wholeRow;
            if (sortedMap == null || !sortedMap.isEmpty()) {
                return;
            }
            TreeBasedTable treeBasedTable = this.this$0;
            treeBasedTable.backingMap.remove(this.rowKey);
            this.wholeRow = null;
            this.backingRowMap = null;
        }

        @Override // com.google.common.collect.StandardTable.Row, java.util.AbstractMap, java.util.Map
        public V put(C c, V v) {
            c.getClass();
            a.H(rangeContains(c));
            return (V) super.put(c, v);
        }

        public boolean rangeContains(Object obj) {
            if (obj == null) {
                return false;
            }
            C c = this.lowerBound;
            if (c != null && compare(c, obj) > 0) {
                return false;
            }
            C c2 = this.upperBound;
            return c2 == null || compare(c2, obj) > 0;
        }

        @Override // java.util.SortedMap
        public SortedMap<C, V> subMap(C c, C c2) {
            c.getClass();
            boolean z = false;
            if (rangeContains(c)) {
                c2.getClass();
                if (rangeContains(c2)) {
                    z = true;
                }
            }
            a.H(z);
            return new TreeRow(this.this$0, this.rowKey, c, c2);
        }

        @Override // java.util.SortedMap
        public SortedMap<C, V> tailMap(C c) {
            c.getClass();
            a.H(rangeContains(c));
            return new TreeRow(this.this$0, this.rowKey, c, this.upperBound);
        }

        public void updateWholeRowField() {
            SortedMap<C, V> sortedMap = this.wholeRow;
            if (sortedMap != null) {
                if (!sortedMap.isEmpty()) {
                    return;
                }
                TreeBasedTable treeBasedTable = this.this$0;
                if (!treeBasedTable.backingMap.containsKey(this.rowKey)) {
                    return;
                }
            }
            TreeBasedTable treeBasedTable2 = this.this$0;
            this.wholeRow = (SortedMap) treeBasedTable2.backingMap.get(this.rowKey);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TreeRow(TreeBasedTable treeBasedTable, R r, C c, C c2) {
            super(treeBasedTable, r);
            treeBasedTable.getClass();
            this.this$0 = treeBasedTable;
            this.lowerBound = c;
            this.upperBound = c2;
            boolean z = true;
            if (c != null && c2 != null && compare(c, c2) > 0) {
                z = false;
            }
            a.H(z);
        }

        @Override // com.google.common.collect.StandardTable.Row
        public SortedMap<C, V> computeBackingRowMap() {
            updateWholeRowField();
            SortedMap<C, V> sortedMapTailMap = this.wholeRow;
            if (sortedMapTailMap == null) {
                return null;
            }
            C c = this.lowerBound;
            if (c != null) {
                sortedMapTailMap = sortedMapTailMap.tailMap(c);
            }
            C c2 = this.upperBound;
            return c2 != null ? sortedMapTailMap.headMap(c2) : sortedMapTailMap;
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public SortedSet<C> keySet() {
            return new Maps.SortedKeySet(this);
        }
    }

    public TreeBasedTable(Comparator<? super R> comparator, Comparator<? super C> comparator2) {
        super(new TreeMap(comparator), new Factory(comparator2));
        this.columnComparator = comparator2;
    }

    public static <R extends Comparable, C extends Comparable, V> TreeBasedTable<R, C, V> create() {
        return new TreeBasedTable<>(Ordering.natural(), Ordering.natural());
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Set cellSet() {
        return super.cellSet();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Map column(Object obj) {
        return super.column(obj);
    }

    @Deprecated
    public Comparator<? super C> columnComparator() {
        return this.columnComparator;
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Set columnKeySet() {
        return super.columnKeySet();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Map columnMap() {
        return super.columnMap();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean contains(Object obj, Object obj2) {
        return super.contains(obj, obj2);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean containsColumn(Object obj) {
        return super.containsColumn(obj);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean containsRow(Object obj) {
        return super.containsRow(obj);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // com.google.common.collect.StandardTable
    public Iterator<C> createColumnKeyIterator() {
        Map<R, Map<C, V>> map = this.backingMap;
        final Comparator<? super C> comparatorColumnComparator = columnComparator();
        final UnmodifiableIterator unmodifiableIteratorMergeSorted = Iterators.mergeSorted(Iterables.transform(map.values(), new tsl() { // from class: com.google.common.collect.TreeBasedTable$$ExternalSyntheticLambda0
            @Override // defpackage.tsl
            public final Object apply(Object obj) {
                return ((Map) obj).keySet().iterator();
            }
        }), comparatorColumnComparator);
        return new AbstractIterator<C>(this) { // from class: com.google.common.collect.TreeBasedTable.1
            C lastValue;

            {
                this.getClass();
            }

            @Override // com.google.common.collect.AbstractIterator
            protected C computeNext() {
                while (unmodifiableIteratorMergeSorted.hasNext()) {
                    C c = (C) unmodifiableIteratorMergeSorted.next();
                    C c2 = this.lastValue;
                    if (c2 == null || comparatorColumnComparator.compare(c, c2) != 0) {
                        this.lastValue = c;
                        return c;
                    }
                }
                this.lastValue = null;
                endOfData();
                return null;
            }
        };
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Object get(Object obj, Object obj2) {
        return super.get(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2, Object obj3) {
        return super.put(obj, obj2, obj3);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ void putAll(Table table) {
        super.putAll(table);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Object remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Map row(Object obj) {
        return row((TreeBasedTable<R, C, V>) obj);
    }

    @Deprecated
    public final Comparator<? super R> rowComparator() {
        Comparator<? super R> comparator = rowKeySet().comparator();
        comparator.getClass();
        return comparator;
    }

    @Override // com.google.common.collect.StandardRowSortedTable, com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ SortedSet rowKeySet() {
        return super.rowKeySet();
    }

    @Override // com.google.common.collect.StandardRowSortedTable, com.google.common.collect.StandardTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ SortedMap rowMap() {
        return super.rowMap();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.AbstractTable
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    public static <R, C, V> TreeBasedTable<R, C, V> create(TreeBasedTable<R, C, ? extends V> treeBasedTable) {
        Comparator<? super R> comparator = treeBasedTable.rowKeySet().comparator();
        comparator.getClass();
        TreeBasedTable<R, C, V> treeBasedTable2 = new TreeBasedTable<>(comparator, treeBasedTable.columnComparator());
        treeBasedTable2.putAll(treeBasedTable);
        return treeBasedTable2;
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public SortedMap<C, V> row(R r) {
        return new TreeRow(this, r);
    }

    public static <R, C, V> TreeBasedTable<R, C, V> create(Comparator<? super R> comparator, Comparator<? super C> comparator2) {
        comparator.getClass();
        comparator2.getClass();
        return new TreeBasedTable<>(comparator, comparator2);
    }
}
