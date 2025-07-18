package com.google.common.collect;

import com.google.common.collect.Table;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class TableExtensionsKt {
    public static final /* synthetic */ Object component1(Table.Cell cell) {
        cell.getClass();
        return cell.getRowKey();
    }

    public static final /* synthetic */ Object component2(Table.Cell cell) {
        cell.getClass();
        return cell.getColumnKey();
    }

    public static final /* synthetic */ Object component3(Table.Cell cell) {
        cell.getClass();
        return cell.getValue();
    }

    public static final /* synthetic */ void set(Table table, Object obj, Object obj2, Object obj3) {
        table.getClass();
        table.put(obj, obj2, obj3);
    }
}
