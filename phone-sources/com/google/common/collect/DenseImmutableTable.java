package com.google.common.collect;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;
import java.lang.reflect.Array;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class DenseImmutableTable<R, C, V> extends RegularImmutableTable<R, C, V> {
    private final int[] cellColumnIndices;
    private final int[] cellRowIndices;
    private final int[] columnCounts;
    private final ImmutableMap<C, Integer> columnKeyToIndex;
    private final ImmutableMap<C, ImmutableMap<R, V>> columnMap;
    private final int[] rowCounts;
    private final ImmutableMap<R, Integer> rowKeyToIndex;
    private final ImmutableMap<R, ImmutableMap<C, V>> rowMap;
    private final V[][] values;

    /* compiled from: PG */
    final class Column extends ImmutableArrayMap<R, V> {
        private final int columnIndex;
        final /* synthetic */ DenseImmutableTable this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Column(DenseImmutableTable denseImmutableTable, int i) {
            super(denseImmutableTable.columnCounts[i]);
            denseImmutableTable.getClass();
            this.this$0 = denseImmutableTable;
            this.columnIndex = i;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public V getValue(int i) {
            return (V) this.this$0.values[i][this.columnIndex];
        }

        @Override // com.google.common.collect.ImmutableMap
        public boolean isPartialView() {
            return true;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public ImmutableMap<R, Integer> keyToIndex() {
            return this.this$0.rowKeyToIndex;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap, com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* compiled from: PG */
    final class ColumnMap extends ImmutableArrayMap<C, ImmutableMap<R, V>> {
        final /* synthetic */ DenseImmutableTable this$0;

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public ImmutableMap<R, V> getValue(int i) {
            return new Column(this.this$0, i);
        }

        @Override // com.google.common.collect.ImmutableMap
        public boolean isPartialView() {
            return false;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public ImmutableMap<C, Integer> keyToIndex() {
            return this.this$0.columnKeyToIndex;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap, com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public Object writeReplace() {
            return super.writeReplace();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private ColumnMap(DenseImmutableTable denseImmutableTable) {
            super(denseImmutableTable.columnCounts.length);
            denseImmutableTable.getClass();
            this.this$0 = denseImmutableTable;
        }
    }

    /* compiled from: PG */
    abstract class ImmutableArrayMap<K, V> extends ImmutableMap.IteratorBasedImmutableMap<K, V> {
        private final int size;

        public ImmutableArrayMap(int i) {
            this.size = i;
        }

        private boolean isFull() {
            return this.size == keyToIndex().size();
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public ImmutableSet<K> createKeySet() {
            return isFull() ? keyToIndex().keySet() : super.createKeySet();
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap
        public UnmodifiableIterator<Map.Entry<K, V>> entryIterator() {
            return new AbstractIterator<Map.Entry<K, V>>(this) { // from class: com.google.common.collect.DenseImmutableTable.ImmutableArrayMap.1
                private int index;
                private final int maxIndex;
                final /* synthetic */ ImmutableArrayMap this$0;

                {
                    this.getClass();
                    this.this$0 = this;
                    this.index = -1;
                    this.maxIndex = this.keyToIndex().size();
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                public Map.Entry<K, V> computeNext() {
                    this.index++;
                    while (true) {
                        int i = this.index;
                        if (i >= this.maxIndex) {
                            endOfData();
                            return null;
                        }
                        Object value = this.this$0.getValue(i);
                        if (value != null) {
                            return Maps.immutableEntry(this.this$0.getKey(this.index), value);
                        }
                        this.index++;
                    }
                }
            };
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public V get(Object obj) {
            Integer num = keyToIndex().get(obj);
            if (num == null) {
                return null;
            }
            return getValue(num.intValue());
        }

        public K getKey(int i) {
            return keyToIndex().keySet().asList().get(i);
        }

        public abstract V getValue(int i);

        public abstract ImmutableMap<K, Integer> keyToIndex();

        @Override // java.util.Map
        public int size() {
            return this.size;
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* compiled from: PG */
    final class Row extends ImmutableArrayMap<C, V> {
        private final int rowIndex;
        final /* synthetic */ DenseImmutableTable this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Row(DenseImmutableTable denseImmutableTable, int i) {
            super(denseImmutableTable.rowCounts[i]);
            denseImmutableTable.getClass();
            this.this$0 = denseImmutableTable;
            this.rowIndex = i;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public V getValue(int i) {
            return (V) this.this$0.values[this.rowIndex][i];
        }

        @Override // com.google.common.collect.ImmutableMap
        public boolean isPartialView() {
            return true;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public ImmutableMap<C, Integer> keyToIndex() {
            return this.this$0.columnKeyToIndex;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap, com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* compiled from: PG */
    final class RowMap extends ImmutableArrayMap<R, ImmutableMap<C, V>> {
        final /* synthetic */ DenseImmutableTable this$0;

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public ImmutableMap<C, V> getValue(int i) {
            return new Row(this.this$0, i);
        }

        @Override // com.google.common.collect.ImmutableMap
        public boolean isPartialView() {
            return false;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public ImmutableMap<R, Integer> keyToIndex() {
            return this.this$0.rowKeyToIndex;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap, com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public Object writeReplace() {
            return super.writeReplace();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private RowMap(DenseImmutableTable denseImmutableTable) {
            super(denseImmutableTable.rowCounts.length);
            denseImmutableTable.getClass();
            this.this$0 = denseImmutableTable;
        }
    }

    public DenseImmutableTable(ImmutableList<Table.Cell<R, C, V>> immutableList, ImmutableSet<R> immutableSet, ImmutableSet<C> immutableSet2) {
        this.values = (V[][]) ((Object[][]) Array.newInstance((Class<?>) Object.class, immutableSet.size(), immutableSet2.size()));
        ImmutableMap<R, Integer> immutableMapIndexMap = Maps.indexMap(immutableSet);
        this.rowKeyToIndex = immutableMapIndexMap;
        ImmutableMap<C, Integer> immutableMapIndexMap2 = Maps.indexMap(immutableSet2);
        this.columnKeyToIndex = immutableMapIndexMap2;
        this.rowCounts = new int[immutableMapIndexMap.size()];
        this.columnCounts = new int[immutableMapIndexMap2.size()];
        int[] iArr = new int[immutableList.size()];
        int[] iArr2 = new int[immutableList.size()];
        for (int i = 0; i < immutableList.size(); i++) {
            Table.Cell<R, C, V> cell = immutableList.get(i);
            R rowKey = cell.getRowKey();
            C columnKey = cell.getColumnKey();
            Integer num = this.rowKeyToIndex.get(rowKey);
            num.getClass();
            int iIntValue = num.intValue();
            Integer num2 = this.columnKeyToIndex.get(columnKey);
            num2.getClass();
            int iIntValue2 = num2.intValue();
            checkNoDuplicate(rowKey, columnKey, this.values[iIntValue][iIntValue2], cell.getValue());
            this.values[iIntValue][iIntValue2] = cell.getValue();
            int[] iArr3 = this.rowCounts;
            iArr3[iIntValue] = iArr3[iIntValue] + 1;
            int[] iArr4 = this.columnCounts;
            iArr4[iIntValue2] = iArr4[iIntValue2] + 1;
            iArr[i] = iIntValue;
            iArr2[i] = iIntValue2;
        }
        this.cellRowIndices = iArr;
        this.cellColumnIndices = iArr2;
        this.rowMap = new RowMap();
        this.columnMap = new ColumnMap();
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public ImmutableMap<C, Map<R, V>> columnMap() {
        return ImmutableMap.copyOf((Map) this.columnMap);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public V get(Object obj, Object obj2) {
        Integer num = this.rowKeyToIndex.get(obj);
        Integer num2 = this.columnKeyToIndex.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return this.values[num.intValue()][num2.intValue()];
    }

    @Override // com.google.common.collect.RegularImmutableTable
    public Table.Cell<R, C, V> getCell(int i) {
        int[] iArr = this.cellColumnIndices;
        int i2 = this.cellRowIndices[i];
        int i3 = iArr[i];
        R r = rowKeySet().asList().get(i2);
        C c = columnKeySet().asList().get(i3);
        V v = this.values[i2][i3];
        v.getClass();
        return cellOf(r, c, v);
    }

    @Override // com.google.common.collect.RegularImmutableTable
    public V getValue(int i) {
        V v = this.values[this.cellRowIndices[i]][this.cellColumnIndices[i]];
        v.getClass();
        return v;
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public ImmutableMap<R, Map<C, V>> rowMap() {
        return ImmutableMap.copyOf((Map) this.rowMap);
    }

    @Override // com.google.common.collect.Table
    public int size() {
        return this.cellRowIndices.length;
    }

    @Override // com.google.common.collect.RegularImmutableTable, com.google.common.collect.ImmutableTable
    Object writeReplace() {
        return ImmutableTable.SerializedForm.create(this, this.cellRowIndices, this.cellColumnIndices);
    }
}
