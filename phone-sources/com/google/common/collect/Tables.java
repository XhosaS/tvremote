package com.google.common.collect;

import com.google.common.collect.Table;
import defpackage.a;
import defpackage.tsl;
import defpackage.ttm;
import j$.util.DesugarCollections;
import j$.util.stream.Collector;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class Tables {

    /* compiled from: PG */
    abstract class AbstractCell<R, C, V> implements Table.Cell<R, C, V> {
        @Override // com.google.common.collect.Table.Cell
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof Table.Cell) {
                Table.Cell cell = (Table.Cell) obj;
                if (a.Q(getRowKey(), cell.getRowKey()) && a.Q(getColumnKey(), cell.getColumnKey()) && a.Q(getValue(), cell.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.Table.Cell
        public int hashCode() {
            return Arrays.hashCode(new Object[]{getRowKey(), getColumnKey(), getValue()});
        }

        public String toString() {
            return "(" + String.valueOf(getRowKey()) + "," + String.valueOf(getColumnKey()) + ")=" + String.valueOf(getValue());
        }
    }

    /* compiled from: PG */
    final class ImmutableCell<R, C, V> extends AbstractCell<R, C, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final C columnKey;
        private final R rowKey;
        private final V value;

        public ImmutableCell(R r, C c, V v) {
            this.rowKey = r;
            this.columnKey = c;
            this.value = v;
        }

        @Override // com.google.common.collect.Table.Cell
        public C getColumnKey() {
            return this.columnKey;
        }

        @Override // com.google.common.collect.Table.Cell
        public R getRowKey() {
            return this.rowKey;
        }

        @Override // com.google.common.collect.Table.Cell
        public V getValue() {
            return this.value;
        }
    }

    /* compiled from: PG */
    class TransformedTable<R, C, V1, V2> extends AbstractTable<R, C, V2> {
        final Table<R, C, V1> fromTable;
        final tsl<? super V1, V2> function;

        public TransformedTable(Table<R, C, V1> table, tsl<? super V1, V2> tslVar) {
            table.getClass();
            this.fromTable = table;
            tslVar.getClass();
            this.function = tslVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Map lambda$columnMap$0(Map map) {
            return Maps.transformValues(map, this.function);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Map lambda$rowMap$0(Map map) {
            return Maps.transformValues(map, this.function);
        }

        public Table.Cell<R, C, V2> applyToValue(Table.Cell<R, C, V1> cell) {
            return Tables.immutableCell(cell.getRowKey(), cell.getColumnKey(), this.function.apply(cell.getValue()));
        }

        @Override // com.google.common.collect.AbstractTable
        public Iterator<Table.Cell<R, C, V2>> cellIterator() {
            return Iterators.transform(this.fromTable.cellSet().iterator(), new tsl() { // from class: com.google.common.collect.Tables$TransformedTable$$ExternalSyntheticLambda0
                @Override // defpackage.tsl
                public final Object apply(Object obj) {
                    return this.f$0.applyToValue((Table.Cell) obj);
                }
            });
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public void clear() {
            this.fromTable.clear();
        }

        @Override // com.google.common.collect.Table
        public Map<R, V2> column(C c) {
            return Maps.transformValues(this.fromTable.column(c), this.function);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public Set<C> columnKeySet() {
            return this.fromTable.columnKeySet();
        }

        @Override // com.google.common.collect.Table
        public Map<C, Map<R, V2>> columnMap() {
            return Maps.transformValues(this.fromTable.columnMap(), new tsl() { // from class: com.google.common.collect.Tables$TransformedTable$$ExternalSyntheticLambda2
                @Override // defpackage.tsl
                public final Object apply(Object obj) {
                    return this.f$0.lambda$columnMap$0((Map) obj);
                }
            });
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public boolean contains(Object obj, Object obj2) {
            return this.fromTable.contains(obj, obj2);
        }

        @Override // com.google.common.collect.AbstractTable
        public Collection<V2> createValues() {
            return Collections2.transform(this.fromTable.values(), this.function);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public V2 get(Object obj, Object obj2) {
            if (contains(obj, obj2)) {
                return this.function.apply(this.fromTable.get(obj, obj2));
            }
            return null;
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public V2 put(R r, C c, V2 v2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public void putAll(Table<? extends R, ? extends C, ? extends V2> table) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public V2 remove(Object obj, Object obj2) {
            if (contains(obj, obj2)) {
                return this.function.apply(this.fromTable.remove(obj, obj2));
            }
            return null;
        }

        @Override // com.google.common.collect.Table
        public Map<C, V2> row(R r) {
            return Maps.transformValues(this.fromTable.row(r), this.function);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public Set<R> rowKeySet() {
            return this.fromTable.rowKeySet();
        }

        @Override // com.google.common.collect.Table
        public Map<R, Map<C, V2>> rowMap() {
            return Maps.transformValues(this.fromTable.rowMap(), new tsl() { // from class: com.google.common.collect.Tables$TransformedTable$$ExternalSyntheticLambda1
                @Override // defpackage.tsl
                public final Object apply(Object obj) {
                    return this.f$0.lambda$rowMap$0((Map) obj);
                }
            });
        }

        @Override // com.google.common.collect.Table
        public int size() {
            return this.fromTable.size();
        }
    }

    /* compiled from: PG */
    class TransposeTable<C, R, V> extends AbstractTable<C, R, V> {
        final Table<R, C, V> original;

        public TransposeTable(Table<R, C, V> table) {
            table.getClass();
            this.original = table;
        }

        @Override // com.google.common.collect.AbstractTable
        public Iterator<Table.Cell<C, R, V>> cellIterator() {
            return Iterators.transform(this.original.cellSet().iterator(), new tsl() { // from class: com.google.common.collect.Tables$TransposeTable$$ExternalSyntheticLambda0
                @Override // defpackage.tsl
                public final Object apply(Object obj) {
                    return Tables.transposeCell((Table.Cell) obj);
                }
            });
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public void clear() {
            this.original.clear();
        }

        @Override // com.google.common.collect.Table
        public Map<C, V> column(R r) {
            return this.original.row(r);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public Set<R> columnKeySet() {
            return this.original.rowKeySet();
        }

        @Override // com.google.common.collect.Table
        public Map<R, Map<C, V>> columnMap() {
            return this.original.rowMap();
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public boolean contains(Object obj, Object obj2) {
            return this.original.contains(obj2, obj);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public boolean containsColumn(Object obj) {
            return this.original.containsRow(obj);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public boolean containsRow(Object obj) {
            return this.original.containsColumn(obj);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public boolean containsValue(Object obj) {
            return this.original.containsValue(obj);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public V get(Object obj, Object obj2) {
            return this.original.get(obj2, obj);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public V put(C c, R r, V v) {
            return this.original.put(r, c, v);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public void putAll(Table<? extends C, ? extends R, ? extends V> table) {
            this.original.putAll(Tables.transpose(table));
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public V remove(Object obj, Object obj2) {
            return this.original.remove(obj2, obj);
        }

        @Override // com.google.common.collect.Table
        public Map<R, V> row(C c) {
            return this.original.column(c);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public Set<C> rowKeySet() {
            return this.original.columnKeySet();
        }

        @Override // com.google.common.collect.Table
        public Map<C, Map<R, V>> rowMap() {
            return this.original.columnMap();
        }

        @Override // com.google.common.collect.Table
        public int size() {
            return this.original.size();
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public Collection<V> values() {
            return this.original.values();
        }
    }

    /* compiled from: PG */
    final class UnmodifiableRowSortedMap<R, C, V> extends UnmodifiableTable<R, C, V> implements RowSortedTable<R, C, V> {
        private static final long serialVersionUID = 0;

        public UnmodifiableRowSortedMap(RowSortedTable<R, ? extends C, ? extends V> rowSortedTable) {
            super(rowSortedTable);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.ForwardingObject
        public RowSortedTable<R, C, V> delegate() {
            return (RowSortedTable) super.delegate();
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public SortedSet<R> rowKeySet() {
            return DesugarCollections.unmodifiableSortedSet(delegate().rowKeySet());
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public SortedMap<R, Map<C, V>> rowMap() {
            return DesugarCollections.unmodifiableSortedMap(Maps.transformValues((SortedMap) delegate().rowMap(), new tsl() { // from class: com.google.common.collect.Tables$UnmodifiableRowSortedMap$$ExternalSyntheticLambda0
                @Override // defpackage.tsl
                public final Object apply(Object obj) {
                    return DesugarCollections.unmodifiableMap((Map) obj);
                }
            }));
        }
    }

    /* compiled from: PG */
    class UnmodifiableTable<R, C, V> extends ForwardingTable<R, C, V> implements Serializable {
        private static final long serialVersionUID = 0;
        final Table<? extends R, ? extends C, ? extends V> delegate;

        public UnmodifiableTable(Table<? extends R, ? extends C, ? extends V> table) {
            table.getClass();
            this.delegate = table;
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Set<Table.Cell<R, C, V>> cellSet() {
            return DesugarCollections.unmodifiableSet(super.cellSet());
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Map<R, V> column(C c) {
            return DesugarCollections.unmodifiableMap(super.column(c));
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Set<C> columnKeySet() {
            return DesugarCollections.unmodifiableSet(super.columnKeySet());
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Map<C, Map<R, V>> columnMap() {
            return DesugarCollections.unmodifiableMap(Maps.transformValues(super.columnMap(), new Tables$UnmodifiableTable$$ExternalSyntheticLambda0()));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.ForwardingObject
        public Table<R, C, V> delegate() {
            return this.delegate;
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public V put(R r, C c, V v) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public void putAll(Table<? extends R, ? extends C, ? extends V> table) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public V remove(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Map<C, V> row(R r) {
            return DesugarCollections.unmodifiableMap(super.row(r));
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Set<R> rowKeySet() {
            return DesugarCollections.unmodifiableSet(super.rowKeySet());
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Map<R, Map<C, V>> rowMap() {
            return DesugarCollections.unmodifiableMap(Maps.transformValues(super.rowMap(), new Tables$UnmodifiableTable$$ExternalSyntheticLambda0()));
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Collection<V> values() {
            return DesugarCollections.unmodifiableCollection(super.values());
        }
    }

    private Tables() {
    }

    static boolean equalsImpl(Table<?, ?, ?> table, Object obj) {
        if (obj == table) {
            return true;
        }
        if (obj instanceof Table) {
            return table.cellSet().equals(((Table) obj).cellSet());
        }
        return false;
    }

    public static <R, C, V> Table.Cell<R, C, V> immutableCell(R r, C c, V v) {
        return new ImmutableCell(r, c, v);
    }

    public static <R, C, V> Table<R, C, V> newCustomTable(Map<R, Map<C, V>> map, ttm<? extends Map<C, V>> ttmVar) {
        a.H(map.isEmpty());
        ttmVar.getClass();
        return new StandardTable(map, ttmVar);
    }

    public static <R, C, V> Table<R, C, V> synchronizedTable(Table<R, C, V> table) {
        return Synchronized.table(table, null);
    }

    public static <T, R, C, V, I extends Table<R, C, V>> Collector<T, ?, I> toTable(Function<? super T, ? extends R> function, Function<? super T, ? extends C> function2, Function<? super T, ? extends V> function3, BinaryOperator<V> binaryOperator, Supplier<I> supplier) {
        return TableCollectors.toTable(function, function2, function3, binaryOperator, supplier);
    }

    public static <R, C, V1, V2> Table<R, C, V2> transformValues(Table<R, C, V1> table, tsl<? super V1, V2> tslVar) {
        return new TransformedTable(table, tslVar);
    }

    public static <R, C, V> Table<C, R, V> transpose(Table<R, C, V> table) {
        return table instanceof TransposeTable ? ((TransposeTable) table).original : new TransposeTable(table);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <R, C, V> Table.Cell<C, R, V> transposeCell(Table.Cell<R, C, V> cell) {
        return immutableCell(cell.getColumnKey(), cell.getRowKey(), cell.getValue());
    }

    public static <R, C, V> RowSortedTable<R, C, V> unmodifiableRowSortedTable(RowSortedTable<R, ? extends C, ? extends V> rowSortedTable) {
        return new UnmodifiableRowSortedMap(rowSortedTable);
    }

    public static <R, C, V> Table<R, C, V> unmodifiableTable(Table<? extends R, ? extends C, ? extends V> table) {
        return new UnmodifiableTable(table);
    }

    public static <T, R, C, V, I extends Table<R, C, V>> Collector<T, ?, I> toTable(Function<? super T, ? extends R> function, Function<? super T, ? extends C> function2, Function<? super T, ? extends V> function3, Supplier<I> supplier) {
        return TableCollectors.toTable(function, function2, function3, supplier);
    }
}
