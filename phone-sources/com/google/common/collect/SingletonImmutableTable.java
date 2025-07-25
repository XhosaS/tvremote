package com.google.common.collect;

import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
class SingletonImmutableTable<R, C, V> extends ImmutableTable<R, C, V> {
    final C singleColumnKey;
    final R singleRowKey;
    final V singleValue;

    public SingletonImmutableTable(Table.Cell<R, C, V> cell) {
        this(cell.getRowKey(), cell.getColumnKey(), cell.getValue());
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public ImmutableMap<R, V> column(C c) {
        c.getClass();
        return containsColumn(c) ? ImmutableMap.of(this.singleRowKey, (Object) this.singleValue) : ImmutableMap.of();
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public ImmutableMap<C, Map<R, V>> columnMap() {
        return ImmutableMap.of(this.singleColumnKey, ImmutableMap.of(this.singleRowKey, (Object) this.singleValue));
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    public ImmutableSet<Table.Cell<R, C, V>> createCellSet() {
        return ImmutableSet.of(cellOf(this.singleRowKey, this.singleColumnKey, this.singleValue));
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    public ImmutableCollection<V> createValues() {
        return ImmutableSet.of(this.singleValue);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public ImmutableMap<R, Map<C, V>> rowMap() {
        return ImmutableMap.of(this.singleRowKey, ImmutableMap.of(this.singleColumnKey, (Object) this.singleValue));
    }

    @Override // com.google.common.collect.Table
    public int size() {
        return 1;
    }

    @Override // com.google.common.collect.ImmutableTable
    Object writeReplace() {
        return ImmutableTable.SerializedForm.create(this, new int[]{0}, new int[]{0});
    }

    public SingletonImmutableTable(R r, C c, V v) {
        r.getClass();
        this.singleRowKey = r;
        c.getClass();
        this.singleColumnKey = c;
        v.getClass();
        this.singleValue = v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Map column(Object obj) {
        return column((SingletonImmutableTable<R, C, V>) obj);
    }
}
