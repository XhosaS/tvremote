package com.google.common.collect;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.Table;
import defpackage.tsl;
import defpackage.tsv;
import defpackage.tsy;
import defpackage.tta;
import defpackage.ttb;
import defpackage.ttc;
import defpackage.ttm;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
class StandardTable<R, C, V> extends AbstractTable<R, C, V> implements Serializable {
    private static final long serialVersionUID = 0;

    @GwtTransient
    final Map<R, Map<C, V>> backingMap;
    private transient Set<C> columnKeySet;
    private transient StandardTable<R, C, V>.ColumnMap columnMap;

    @GwtTransient
    final ttm<? extends Map<C, V>> factory;
    private transient Map<R, Map<C, V>> rowMap;

    /* compiled from: PG */
    class CellIterator implements Iterator<Table.Cell<R, C, V>> {
        Iterator<Map.Entry<C, V>> columnIterator;
        Map.Entry<R, Map<C, V>> rowEntry;
        final Iterator<Map.Entry<R, Map<C, V>>> rowIterator;
        final /* synthetic */ StandardTable this$0;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.rowIterator.hasNext() || this.columnIterator.hasNext();
        }

        @Override // java.util.Iterator
        public Table.Cell<R, C, V> next() {
            if (!this.columnIterator.hasNext()) {
                Map.Entry<R, Map<C, V>> next = this.rowIterator.next();
                this.rowEntry = next;
                this.columnIterator = next.getValue().entrySet().iterator();
            }
            this.rowEntry.getClass();
            Map.Entry<C, V> next2 = this.columnIterator.next();
            return Tables.immutableCell(this.rowEntry.getKey(), next2.getKey(), next2.getValue());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.columnIterator.remove();
            Map.Entry<R, Map<C, V>> entry = this.rowEntry;
            entry.getClass();
            if (entry.getValue().isEmpty()) {
                this.rowIterator.remove();
                this.rowEntry = null;
            }
        }

        private CellIterator(StandardTable standardTable) {
            standardTable.getClass();
            this.this$0 = standardTable;
            this.rowIterator = standardTable.backingMap.entrySet().iterator();
            this.columnIterator = Iterators.emptyModifiableIterator();
        }
    }

    /* compiled from: PG */
    class Column extends Maps.ViewCachingAbstractMap<R, V> {
        final C columnKey;
        final /* synthetic */ StandardTable this$0;

        /* compiled from: PG */
        class EntrySet extends Sets.ImprovedAbstractSet<Map.Entry<R, V>> {
            final /* synthetic */ Column this$1;

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public void clear() {
                this.this$1.removeFromColumnIf(ttc.ALWAYS_TRUE);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.this$1.this$0.containsMapping(entry.getKey(), this.this$1.columnKey, entry.getValue());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                Column column = this.this$1;
                return !column.this$0.containsColumn(column.columnKey);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<R, V>> iterator() {
                return new EntrySetIterator();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.this$1.this$0.removeMapping(entry.getKey(), this.this$1.columnKey, entry.getValue());
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return this.this$1.removeFromColumnIf(new ttb(new tsy(collection)));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                Iterator<Map<C, V>> it = this.this$1.this$0.backingMap.values().iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (it.next().containsKey(this.this$1.columnKey)) {
                        i++;
                    }
                }
                return i;
            }

            private EntrySet(Column column) {
                column.getClass();
                this.this$1 = column;
            }
        }

        /* compiled from: PG */
        class EntrySetIterator extends AbstractIterator<Map.Entry<R, V>> {
            final Iterator<Map.Entry<R, Map<C, V>>> iterator;
            final /* synthetic */ Column this$1;

            private EntrySetIterator(Column column) {
                column.getClass();
                this.this$1 = column;
                this.iterator = column.this$0.backingMap.entrySet().iterator();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.AbstractIterator
            public Map.Entry<R, V> computeNext() {
                while (this.iterator.hasNext()) {
                    final Map.Entry<R, Map<C, V>> next = this.iterator.next();
                    if (next.getValue().containsKey(this.this$1.columnKey)) {
                        return new AbstractMapEntry<R, V>(this) { // from class: com.google.common.collect.StandardTable.Column.EntrySetIterator.1EntryImpl
                            final /* synthetic */ EntrySetIterator this$2;

                            {
                                this.getClass();
                                this.this$2 = this;
                            }

                            @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                            public R getKey() {
                                return (R) next.getKey();
                            }

                            @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                            public V getValue() {
                                return (V) ((Map) next.getValue()).get(this.this$2.this$1.columnKey);
                            }

                            @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                            public V setValue(V v) {
                                Map map = (Map) next.getValue();
                                C c = this.this$2.this$1.columnKey;
                                v.getClass();
                                return (V) map.put(c, v);
                            }
                        };
                    }
                }
                endOfData();
                return null;
            }
        }

        /* compiled from: PG */
        class KeySet extends Maps.KeySet<R, V> {
            final /* synthetic */ Column this$1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public KeySet(Column column) {
                super(column);
                column.getClass();
                this.this$1 = column;
            }

            @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                Column column = this.this$1;
                return column.this$0.contains(obj, column.columnKey);
            }

            @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                Column column = this.this$1;
                return column.this$0.remove(obj, column.columnKey) != null;
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return this.this$1.removeFromColumnIf(Maps.keyPredicateOnEntries(new ttb(new tsy(collection))));
            }
        }

        /* compiled from: PG */
        class Values extends Maps.Values<R, V> {
            final /* synthetic */ Column this$1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Values(Column column) {
                super(column);
                column.getClass();
                this.this$1 = column;
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public boolean remove(Object obj) {
                return obj != null && this.this$1.removeFromColumnIf(Maps.valuePredicateOnEntries(new tta(obj)));
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(Collection<?> collection) {
                return this.this$1.removeFromColumnIf(Maps.valuePredicateOnEntries(new tsy(collection)));
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(Collection<?> collection) {
                return this.this$1.removeFromColumnIf(Maps.valuePredicateOnEntries(new ttb(new tsy(collection))));
            }
        }

        public Column(StandardTable standardTable, C c) {
            standardTable.getClass();
            this.this$0 = standardTable;
            c.getClass();
            this.columnKey = c;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.this$0.contains(obj, this.columnKey);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public Set<Map.Entry<R, V>> createEntrySet() {
            return new EntrySet();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public Set<R> createKeySet() {
            return new KeySet(this);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public Collection<V> createValues() {
            return new Values(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            return this.this$0.get(obj, this.columnKey);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(R r, V v) {
            return this.this$0.put(r, this.columnKey, v);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
            return this.this$0.remove(obj, this.columnKey);
        }

        public boolean removeFromColumnIf(tsv<? super Map.Entry<R, V>> tsvVar) {
            Iterator<Map.Entry<R, Map<C, V>>> it = this.this$0.backingMap.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry<R, Map<C, V>> next = it.next();
                Map<C, V> value = next.getValue();
                V v = value.get(this.columnKey);
                if (v != null && tsvVar.apply(Maps.immutableEntry(next.getKey(), v))) {
                    value.remove(this.columnKey);
                    if (value.isEmpty()) {
                        it.remove();
                    }
                    z = true;
                }
            }
            return z;
        }
    }

    /* compiled from: PG */
    class ColumnKeyIterator extends AbstractIterator<C> {
        Iterator<Map.Entry<C, V>> entryIterator;
        final Iterator<Map<C, V>> mapIterator;
        final Map<C, V> seen;
        final /* synthetic */ StandardTable this$0;

        @Override // com.google.common.collect.AbstractIterator
        protected C computeNext() {
            while (true) {
                if (this.entryIterator.hasNext()) {
                    Map.Entry<C, V> next = this.entryIterator.next();
                    if (!this.seen.containsKey(next.getKey())) {
                        this.seen.put(next.getKey(), next.getValue());
                        return next.getKey();
                    }
                } else {
                    if (!this.mapIterator.hasNext()) {
                        endOfData();
                        return null;
                    }
                    this.entryIterator = this.mapIterator.next().entrySet().iterator();
                }
            }
        }

        private ColumnKeyIterator(StandardTable standardTable) {
            standardTable.getClass();
            this.this$0 = standardTable;
            this.seen = standardTable.factory.get();
            this.mapIterator = standardTable.backingMap.values().iterator();
            this.entryIterator = Iterators.emptyIterator();
        }
    }

    /* compiled from: PG */
    class ColumnKeySet extends StandardTable<R, C, V>.TableSet<C> {
        final /* synthetic */ StandardTable this$0;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.this$0.containsColumn(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<C> iterator() {
            return this.this$0.createColumnKeyIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            boolean z = false;
            if (obj == null) {
                return false;
            }
            Iterator<Map<C, V>> it = this.this$0.backingMap.values().iterator();
            while (it.hasNext()) {
                Map<C, V> next = it.next();
                if (next.keySet().remove(obj)) {
                    if (next.isEmpty()) {
                        it.remove();
                    }
                    z = true;
                }
            }
            return z;
        }

        @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            collection.getClass();
            Iterator<Map<C, V>> it = this.this$0.backingMap.values().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map<C, V> next = it.next();
                if (Iterators.removeAll(next.keySet().iterator(), collection)) {
                    if (next.isEmpty()) {
                        it.remove();
                    }
                    z = true;
                }
            }
            return z;
        }

        @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            collection.getClass();
            Iterator<Map<C, V>> it = this.this$0.backingMap.values().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map<C, V> next = it.next();
                if (next.keySet().retainAll(collection)) {
                    if (next.isEmpty()) {
                        it.remove();
                    }
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return Iterators.size(iterator());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private ColumnKeySet(StandardTable standardTable) {
            super();
            standardTable.getClass();
            this.this$0 = standardTable;
        }
    }

    /* compiled from: PG */
    class ColumnMap extends Maps.ViewCachingAbstractMap<C, Map<R, V>> {
        final /* synthetic */ StandardTable this$0;

        /* compiled from: PG */
        final class ColumnMapEntrySet extends StandardTable<R, C, V>.TableSet<Map.Entry<C, Map<R, V>>> {
            final /* synthetic */ ColumnMap this$1;

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (!this.this$1.this$0.containsColumn(entry.getKey())) {
                    return false;
                }
                Map<R, V> map = this.this$1.get(entry.getKey());
                map.getClass();
                return map.equals(entry.getValue());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<C, Map<R, V>>> iterator() {
                Set<C> setColumnKeySet = this.this$1.this$0.columnKeySet();
                final StandardTable standardTable = this.this$1.this$0;
                standardTable.getClass();
                return Maps.asMapEntryIterator(setColumnKeySet, new tsl() { // from class: com.google.common.collect.StandardTable$ColumnMap$ColumnMapEntrySet$$ExternalSyntheticLambda0
                    @Override // defpackage.tsl
                    public final Object apply(Object obj) {
                        return standardTable.column(obj);
                    }
                });
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj) || !(obj instanceof Map.Entry)) {
                    return false;
                }
                this.this$1.this$0.removeColumn(((Map.Entry) obj).getKey());
                return true;
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                collection.getClass();
                return Sets.removeAllImpl(this, collection.iterator());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                collection.getClass();
                ArrayList arrayListNewArrayList = Lists.newArrayList(this.this$1.this$0.columnKeySet().iterator());
                int size = arrayListNewArrayList.size();
                boolean z = false;
                for (int i = 0; i < size; i++) {
                    Object obj = arrayListNewArrayList.get(i);
                    if (!collection.contains(Maps.immutableEntry(obj, this.this$1.this$0.column(obj)))) {
                        this.this$1.this$0.removeColumn(obj);
                        z = true;
                    }
                }
                return z;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return this.this$1.this$0.columnKeySet().size();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private ColumnMapEntrySet(ColumnMap columnMap) {
                super();
                columnMap.getClass();
                this.this$1 = columnMap;
            }
        }

        /* compiled from: PG */
        class ColumnMapValues extends Maps.Values<C, Map<R, V>> {
            final /* synthetic */ ColumnMap this$1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ColumnMapValues(ColumnMap columnMap) {
                super(columnMap);
                columnMap.getClass();
                this.this$1 = columnMap;
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public boolean remove(Object obj) {
                for (Map.Entry<C, Map<R, V>> entry : this.this$1.entrySet()) {
                    if (entry.getValue().equals(obj)) {
                        this.this$1.this$0.removeColumn(entry.getKey());
                        return true;
                    }
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(Collection<?> collection) {
                collection.getClass();
                ArrayList arrayListNewArrayList = Lists.newArrayList(this.this$1.this$0.columnKeySet().iterator());
                int size = arrayListNewArrayList.size();
                boolean z = false;
                for (int i = 0; i < size; i++) {
                    Object obj = arrayListNewArrayList.get(i);
                    if (collection.contains(this.this$1.this$0.column(obj))) {
                        this.this$1.this$0.removeColumn(obj);
                        z = true;
                    }
                }
                return z;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(Collection<?> collection) {
                collection.getClass();
                ArrayList arrayListNewArrayList = Lists.newArrayList(this.this$1.this$0.columnKeySet().iterator());
                int size = arrayListNewArrayList.size();
                boolean z = false;
                for (int i = 0; i < size; i++) {
                    Object obj = arrayListNewArrayList.get(i);
                    if (!collection.contains(this.this$1.this$0.column(obj))) {
                        this.this$1.this$0.removeColumn(obj);
                        z = true;
                    }
                }
                return z;
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.this$0.containsColumn(obj);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public Set<Map.Entry<C, Map<R, V>>> createEntrySet() {
            return new ColumnMapEntrySet();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public Collection<Map<R, V>> createValues() {
            return new ColumnMapValues(this);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public Set<C> keySet() {
            return this.this$0.columnKeySet();
        }

        private ColumnMap(StandardTable standardTable) {
            standardTable.getClass();
            this.this$0 = standardTable;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Map<R, V> get(Object obj) {
            if (!this.this$0.containsColumn(obj)) {
                return null;
            }
            StandardTable standardTable = this.this$0;
            obj.getClass();
            return standardTable.column(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Map<R, V> remove(Object obj) {
            if (this.this$0.containsColumn(obj)) {
                return this.this$0.removeColumn(obj);
            }
            return null;
        }
    }

    /* compiled from: PG */
    class Row extends Maps.IteratorBasedAbstractMap<C, V> {
        Map<C, V> backingRowMap;
        final R rowKey;
        final /* synthetic */ StandardTable this$0;

        public Row(StandardTable standardTable, R r) {
            standardTable.getClass();
            this.this$0 = standardTable;
            r.getClass();
            this.rowKey = r;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public void clear() {
            updateBackingRowMapField();
            Map<C, V> map = this.backingRowMap;
            if (map != null) {
                map.clear();
            }
            maintainEmptyInvariant();
        }

        public Map<C, V> computeBackingRowMap() {
            return this.this$0.backingMap.get(this.rowKey);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            Map<C, V> map;
            updateBackingRowMapField();
            return (obj == null || (map = this.backingRowMap) == null || !Maps.safeContainsKey(map, obj)) ? false : true;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public Iterator<Map.Entry<C, V>> entryIterator() {
            updateBackingRowMapField();
            Map<C, V> map = this.backingRowMap;
            if (map == null) {
                return Iterators.emptyModifiableIterator();
            }
            final Iterator<Map.Entry<C, V>> it = map.entrySet().iterator();
            return new Iterator<Map.Entry<C, V>>(this) { // from class: com.google.common.collect.StandardTable.Row.1
                final /* synthetic */ Row this$1;

                {
                    this.getClass();
                    this.this$1 = this;
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return it.hasNext();
                }

                @Override // java.util.Iterator
                public void remove() {
                    it.remove();
                    this.this$1.maintainEmptyInvariant();
                }

                @Override // java.util.Iterator
                public Map.Entry<C, V> next() {
                    return this.this$1.wrapEntry((Map.Entry) it.next());
                }
            };
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            Map<C, V> map;
            updateBackingRowMapField();
            if (obj == null || (map = this.backingRowMap) == null) {
                return null;
            }
            return (V) Maps.safeGet(map, obj);
        }

        public void maintainEmptyInvariant() {
            updateBackingRowMapField();
            Map<C, V> map = this.backingRowMap;
            if (map == null || !map.isEmpty()) {
                return;
            }
            StandardTable standardTable = this.this$0;
            standardTable.backingMap.remove(this.rowKey);
            this.backingRowMap = null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(C c, V v) {
            c.getClass();
            v.getClass();
            Map<C, V> map = this.backingRowMap;
            return (map == null || map.isEmpty()) ? this.this$0.put(this.rowKey, c, v) : this.backingRowMap.put(c, v);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
            updateBackingRowMapField();
            Map<C, V> map = this.backingRowMap;
            if (map == null) {
                return null;
            }
            V v = (V) Maps.safeRemove(map, obj);
            maintainEmptyInvariant();
            return v;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
            updateBackingRowMapField();
            Map<C, V> map = this.backingRowMap;
            if (map == null) {
                return 0;
            }
            return map.size();
        }

        final void updateBackingRowMapField() {
            Map<C, V> map = this.backingRowMap;
            if (map != null) {
                if (!map.isEmpty()) {
                    return;
                }
                StandardTable standardTable = this.this$0;
                if (!standardTable.backingMap.containsKey(this.rowKey)) {
                    return;
                }
            }
            this.backingRowMap = computeBackingRowMap();
        }

        public Map.Entry<C, V> wrapEntry(final Map.Entry<C, V> entry) {
            return new ForwardingMapEntry<C, V>(this) { // from class: com.google.common.collect.StandardTable.Row.2
                {
                    this.getClass();
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
                public Map.Entry<C, V> delegate() {
                    return entry;
                }

                @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
                public boolean equals(Object obj) {
                    return standardEquals(obj);
                }

                @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
                public V setValue(V v) {
                    v.getClass();
                    return (V) super.setValue(v);
                }
            };
        }
    }

    /* compiled from: PG */
    class RowMap extends Maps.ViewCachingAbstractMap<R, Map<C, V>> {
        final /* synthetic */ StandardTable this$0;

        /* compiled from: PG */
        final class EntrySet extends StandardTable<R, C, V>.TableSet<Map.Entry<R, Map<C, V>>> {
            final /* synthetic */ RowMap this$1;

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (entry.getKey() != null && (entry.getValue() instanceof Map) && Collections2.safeContains(this.this$1.this$0.backingMap.entrySet(), entry)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<R, Map<C, V>>> iterator() {
                Set<R> setKeySet = this.this$1.this$0.backingMap.keySet();
                final StandardTable standardTable = this.this$1.this$0;
                standardTable.getClass();
                return Maps.asMapEntryIterator(setKeySet, new tsl() { // from class: com.google.common.collect.StandardTable$RowMap$EntrySet$$ExternalSyntheticLambda0
                    @Override // defpackage.tsl
                    public final Object apply(Object obj) {
                        return standardTable.row(obj);
                    }
                });
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (entry.getKey() != null && (entry.getValue() instanceof Map) && this.this$1.this$0.backingMap.entrySet().remove(entry)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return this.this$1.this$0.backingMap.size();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private EntrySet(RowMap rowMap) {
                super();
                rowMap.getClass();
                this.this$1 = rowMap;
            }
        }

        public RowMap(StandardTable standardTable) {
            standardTable.getClass();
            this.this$0 = standardTable;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.this$0.containsRow(obj);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public Set<Map.Entry<R, Map<C, V>>> createEntrySet() {
            return new EntrySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Map<C, V> get(Object obj) {
            if (!this.this$0.containsRow(obj)) {
                return null;
            }
            StandardTable standardTable = this.this$0;
            obj.getClass();
            return standardTable.row(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Map<C, V> remove(Object obj) {
            if (obj == null) {
                return null;
            }
            return this.this$0.backingMap.remove(obj);
        }
    }

    /* compiled from: PG */
    abstract class TableSet<T> extends Sets.ImprovedAbstractSet<T> {
        final /* synthetic */ StandardTable this$0;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.this$0.backingMap.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.this$0.backingMap.isEmpty();
        }

        private TableSet(StandardTable standardTable) {
            standardTable.getClass();
            this.this$0 = standardTable;
        }
    }

    public StandardTable(Map<R, Map<C, V>> map, ttm<? extends Map<C, V>> ttmVar) {
        this.backingMap = map;
        this.factory = ttmVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean containsMapping(Object obj, Object obj2, Object obj3) {
        return obj3 != null && obj3.equals(get(obj, obj2));
    }

    private Map<C, V> getOrCreate(R r) {
        Map<C, V> map = this.backingMap.get(r);
        if (map != null) {
            return map;
        }
        Map<C, V> map2 = this.factory.get();
        this.backingMap.put(r, map2);
        return map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<R, V> removeColumn(Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<R, Map<C, V>>> it = this.backingMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<R, Map<C, V>> next = it.next();
            V vRemove = next.getValue().remove(obj);
            if (vRemove != null) {
                linkedHashMap.put(next.getKey(), vRemove);
                if (next.getValue().isEmpty()) {
                    it.remove();
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean removeMapping(Object obj, Object obj2, Object obj3) {
        if (!containsMapping(obj, obj2, obj3)) {
            return false;
        }
        remove(obj, obj2);
        return true;
    }

    @Override // com.google.common.collect.AbstractTable
    public Iterator<Table.Cell<R, C, V>> cellIterator() {
        return new CellIterator();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public Set<Table.Cell<R, C, V>> cellSet() {
        return super.cellSet();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public void clear() {
        this.backingMap.clear();
    }

    @Override // com.google.common.collect.Table
    public Map<R, V> column(C c) {
        return new Column(this, c);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public Set<C> columnKeySet() {
        Set<C> set = this.columnKeySet;
        if (set != null) {
            return set;
        }
        ColumnKeySet columnKeySet = new ColumnKeySet();
        this.columnKeySet = columnKeySet;
        return columnKeySet;
    }

    @Override // com.google.common.collect.Table
    public Map<C, Map<R, V>> columnMap() {
        StandardTable<R, C, V>.ColumnMap columnMap = this.columnMap;
        if (columnMap != null) {
            return columnMap;
        }
        StandardTable<R, C, V>.ColumnMap columnMap2 = new ColumnMap();
        this.columnMap = columnMap2;
        return columnMap2;
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean contains(Object obj, Object obj2) {
        return (obj == null || obj2 == null || !super.contains(obj, obj2)) ? false : true;
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean containsColumn(Object obj) {
        if (obj == null) {
            return false;
        }
        Iterator<Map<C, V>> it = this.backingMap.values().iterator();
        while (it.hasNext()) {
            if (Maps.safeContainsKey(it.next(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean containsRow(Object obj) {
        return obj != null && Maps.safeContainsKey(this.backingMap, obj);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean containsValue(Object obj) {
        return obj != null && super.containsValue(obj);
    }

    public Iterator<C> createColumnKeyIterator() {
        return new ColumnKeyIterator();
    }

    public Map<R, Map<C, V>> createRowMap() {
        return new RowMap(this);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public V get(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return null;
        }
        return (V) super.get(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean isEmpty() {
        return this.backingMap.isEmpty();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public V put(R r, C c, V v) {
        r.getClass();
        c.getClass();
        v.getClass();
        return getOrCreate(r).put(c, v);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public V remove(Object obj, Object obj2) {
        Map map;
        if (obj == null || obj2 == null || (map = (Map) Maps.safeGet(this.backingMap, obj)) == null) {
            return null;
        }
        V v = (V) map.remove(obj2);
        if (map.isEmpty()) {
            this.backingMap.remove(obj);
        }
        return v;
    }

    @Override // com.google.common.collect.Table
    public Map<C, V> row(R r) {
        return new Row(this, r);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public Set<R> rowKeySet() {
        return rowMap().keySet();
    }

    @Override // com.google.common.collect.Table
    public Map<R, Map<C, V>> rowMap() {
        Map<R, Map<C, V>> map = this.rowMap;
        if (map != null) {
            return map;
        }
        Map<R, Map<C, V>> mapCreateRowMap = createRowMap();
        this.rowMap = mapCreateRowMap;
        return mapCreateRowMap;
    }

    @Override // com.google.common.collect.Table
    public int size() {
        Iterator<Map<C, V>> it = this.backingMap.values().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().size();
        }
        return size;
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public Collection<V> values() {
        return super.values();
    }
}
