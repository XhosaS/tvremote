package com.google.common.collect;

import com.google.common.collect.Maps;
import defpackage.ttm;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: PG */
/* loaded from: classes.dex */
class StandardRowSortedTable<R, C, V> extends StandardTable<R, C, V> implements RowSortedTable<R, C, V> {
    private static final long serialVersionUID = 0;

    /* compiled from: PG */
    class RowSortedMap extends StandardTable<R, C, V>.RowMap implements SortedMap<R, Map<C, V>> {
        final /* synthetic */ StandardRowSortedTable this$0;

        @Override // java.util.SortedMap
        public Comparator<? super R> comparator() {
            return this.this$0.sortedBackingMap().comparator();
        }

        @Override // java.util.SortedMap
        public R firstKey() {
            return (R) this.this$0.sortedBackingMap().firstKey();
        }

        @Override // java.util.SortedMap
        public SortedMap<R, Map<C, V>> headMap(R r) {
            r.getClass();
            return new StandardRowSortedTable(this.this$0.sortedBackingMap().headMap(r), this.this$0.factory).rowMap();
        }

        @Override // java.util.SortedMap
        public R lastKey() {
            return (R) this.this$0.sortedBackingMap().lastKey();
        }

        @Override // java.util.SortedMap
        public SortedMap<R, Map<C, V>> subMap(R r, R r2) {
            r.getClass();
            r2.getClass();
            return new StandardRowSortedTable(this.this$0.sortedBackingMap().subMap(r, r2), this.this$0.factory).rowMap();
        }

        @Override // java.util.SortedMap
        public SortedMap<R, Map<C, V>> tailMap(R r) {
            r.getClass();
            return new StandardRowSortedTable(this.this$0.sortedBackingMap().tailMap(r), this.this$0.factory).rowMap();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private RowSortedMap(StandardRowSortedTable standardRowSortedTable) {
            super(standardRowSortedTable);
            standardRowSortedTable.getClass();
            this.this$0 = standardRowSortedTable;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public SortedSet<R> createKeySet() {
            return new Maps.SortedKeySet(this);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public SortedSet<R> keySet() {
            return (SortedSet) super.keySet();
        }
    }

    public StandardRowSortedTable(SortedMap<R, Map<C, V>> sortedMap, ttm<? extends Map<C, V>> ttmVar) {
        super(sortedMap, ttmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SortedMap<R, Map<C, V>> sortedBackingMap() {
        return (SortedMap) this.backingMap;
    }

    @Override // com.google.common.collect.StandardTable
    public SortedMap<R, Map<C, V>> createRowMap() {
        return new RowSortedMap();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public SortedSet<R> rowKeySet() {
        return (SortedSet) rowMap().keySet();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public SortedMap<R, Map<C, V>> rowMap() {
        return (SortedMap) super.rowMap();
    }
}
