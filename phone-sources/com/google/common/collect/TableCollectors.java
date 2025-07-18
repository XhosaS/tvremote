package com.google.common.collect;

import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;
import com.google.common.collect.TableCollectors;
import com.google.common.collect.Tables;
import defpackage.a;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collector;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
final class TableCollectors {

    /* compiled from: PG */
    final class ImmutableTableCollectorState<R, C, V> {
        final List<MutableCell<R, C, V>> insertionOrder;
        final Table<R, C, MutableCell<R, C, V>> table;

        public ImmutableTableCollectorState<R, C, V> combine(ImmutableTableCollectorState<R, C, V> immutableTableCollectorState, BinaryOperator<V> binaryOperator) {
            for (MutableCell<R, C, V> mutableCell : immutableTableCollectorState.insertionOrder) {
                put(mutableCell.getRowKey(), mutableCell.getColumnKey(), mutableCell.getValue(), binaryOperator);
            }
            return this;
        }

        public void put(R r, C c, V v, BinaryOperator<V> binaryOperator) {
            MutableCell<R, C, V> mutableCell = this.table.get(r, c);
            if (mutableCell != null) {
                mutableCell.merge(v, binaryOperator);
                return;
            }
            MutableCell<R, C, V> mutableCell2 = new MutableCell<>(r, c, v);
            this.insertionOrder.add(mutableCell2);
            this.table.put(r, c, mutableCell2);
        }

        public ImmutableTable<R, C, V> toTable() {
            return ImmutableTable.copyOf(this.insertionOrder);
        }

        private ImmutableTableCollectorState() {
            this.insertionOrder = new ArrayList();
            this.table = HashBasedTable.create();
        }
    }

    /* compiled from: PG */
    final class MutableCell<R, C, V> extends Tables.AbstractCell<R, C, V> {
        private final C column;
        private final R row;
        private V value;

        public MutableCell(R r, C c, V v) {
            r.getClass();
            this.row = r;
            c.getClass();
            this.column = c;
            v.getClass();
            this.value = v;
        }

        @Override // com.google.common.collect.Table.Cell
        public C getColumnKey() {
            return this.column;
        }

        @Override // com.google.common.collect.Table.Cell
        public R getRowKey() {
            return this.row;
        }

        @Override // com.google.common.collect.Table.Cell
        public V getValue() {
            return this.value;
        }

        public void merge(V v, BinaryOperator<V> binaryOperator) {
            v.getClass();
            V v2 = (V) binaryOperator.apply(this.value, v);
            v2.getClass();
            this.value = v2;
        }
    }

    public static /* synthetic */ ImmutableTableCollectorState $r8$lambda$XCCl4Fy1_17qq8EsUnS1cqg4pg8() {
        return new ImmutableTableCollectorState();
    }

    private TableCollectors() {
    }

    static /* synthetic */ ImmutableTableCollectorState lambda$toImmutableTable$2(BinaryOperator binaryOperator, ImmutableTableCollectorState immutableTableCollectorState, ImmutableTableCollectorState immutableTableCollectorState2) {
        immutableTableCollectorState.combine(immutableTableCollectorState2, binaryOperator);
        return immutableTableCollectorState;
    }

    static /* synthetic */ Object lambda$toTable$0(Object obj, Object obj2) {
        throw new IllegalStateException(a.cA(obj2, obj, "Conflicting values ", " and "));
    }

    static /* synthetic */ Table lambda$toTable$2(BinaryOperator binaryOperator, Table table, Table table2) {
        for (Table.Cell cell : table2.cellSet()) {
            mergeTables(table, cell.getRowKey(), cell.getColumnKey(), cell.getValue(), binaryOperator);
        }
        return table;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static <R, C, V> void mergeTables(Table<R, C, V> table, R r, C c, V v, BinaryOperator<V> binaryOperator) {
        v.getClass();
        Object obj = table.get(r, c);
        if (obj == null) {
            table.put(r, c, v);
            return;
        }
        Object objApply = binaryOperator.apply(obj, v);
        if (objApply == null) {
            table.remove(r, c);
        } else {
            table.put(r, c, objApply);
        }
    }

    static <T, R, C, V> Collector<T, ?, ImmutableTable<R, C, V>> toImmutableTable(final Function<? super T, ? extends R> function, final Function<? super T, ? extends C> function2, final Function<? super T, ? extends V> function3) {
        function.getClass();
        function2.getClass();
        function3.getClass();
        return Collector.CC.of(new Supplier() { // from class: com.google.common.collect.TableCollectors$$ExternalSyntheticLambda7
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ImmutableTable.Builder();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.TableCollectors$$ExternalSyntheticLambda8
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ImmutableTable.Builder) obj).put(function.apply(obj2), function2.apply(obj2), function3.apply(obj2));
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.TableCollectors$$ExternalSyntheticLambda9
            public /* synthetic */ BiFunction andThen(Function function4) {
                return BiFunction$CC.$default$andThen(this, function4);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                ImmutableTable.Builder builder = (ImmutableTable.Builder) obj;
                builder.combine((ImmutableTable.Builder) obj2);
                return builder;
            }
        }, new Function() { // from class: com.google.common.collect.TableCollectors$$ExternalSyntheticLambda10
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public /* synthetic */ Function mo439andThen(Function function4) {
                return Function$CC.$default$andThen(this, function4);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableTable.Builder) obj).buildOrThrow();
            }

            public /* synthetic */ Function compose(Function function4) {
                return Function$CC.$default$compose(this, function4);
            }
        }, new Collector.Characteristics[0]);
    }

    static <T, R, C, V, I extends Table<R, C, V>> Collector<T, ?, I> toTable(final Function<? super T, ? extends R> function, final Function<? super T, ? extends C> function2, final Function<? super T, ? extends V> function3, final BinaryOperator<V> binaryOperator, Supplier<I> supplier) {
        function.getClass();
        function2.getClass();
        function3.getClass();
        binaryOperator.getClass();
        supplier.getClass();
        return Collector.CC.of(supplier, new BiConsumer() { // from class: com.google.common.collect.TableCollectors$$ExternalSyntheticLambda1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                Table table = (Table) obj;
                TableCollectors.mergeTables(table, function.apply(obj2), function2.apply(obj2), function3.apply(obj2), binaryOperator);
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.TableCollectors$$ExternalSyntheticLambda2
            public /* synthetic */ BiFunction andThen(Function function4) {
                return BiFunction$CC.$default$andThen(this, function4);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Table table = (Table) obj;
                TableCollectors.lambda$toTable$2(binaryOperator, table, (Table) obj2);
                return table;
            }
        }, new Collector.Characteristics[0]);
    }

    static <T, R, C, V> Collector<T, ?, ImmutableTable<R, C, V>> toImmutableTable(final Function<? super T, ? extends R> function, final Function<? super T, ? extends C> function2, final Function<? super T, ? extends V> function3, final BinaryOperator<V> binaryOperator) {
        function.getClass();
        function2.getClass();
        function3.getClass();
        binaryOperator.getClass();
        return Collector.CC.of(new Supplier() { // from class: com.google.common.collect.TableCollectors$$ExternalSyntheticLambda3
            @Override // java.util.function.Supplier
            public final Object get() {
                return TableCollectors.$r8$lambda$XCCl4Fy1_17qq8EsUnS1cqg4pg8();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.TableCollectors$$ExternalSyntheticLambda4
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                TableCollectors.ImmutableTableCollectorState immutableTableCollectorState = (TableCollectors.ImmutableTableCollectorState) obj;
                immutableTableCollectorState.put(function.apply(obj2), function2.apply(obj2), function3.apply(obj2), binaryOperator);
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.TableCollectors$$ExternalSyntheticLambda5
            public /* synthetic */ BiFunction andThen(Function function4) {
                return BiFunction$CC.$default$andThen(this, function4);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                TableCollectors.ImmutableTableCollectorState immutableTableCollectorState = (TableCollectors.ImmutableTableCollectorState) obj;
                TableCollectors.lambda$toImmutableTable$2(binaryOperator, immutableTableCollectorState, (TableCollectors.ImmutableTableCollectorState) obj2);
                return immutableTableCollectorState;
            }
        }, new Function() { // from class: com.google.common.collect.TableCollectors$$ExternalSyntheticLambda6
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public /* synthetic */ Function mo439andThen(Function function4) {
                return Function$CC.$default$andThen(this, function4);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((TableCollectors.ImmutableTableCollectorState) obj).toTable();
            }

            public /* synthetic */ Function compose(Function function4) {
                return Function$CC.$default$compose(this, function4);
            }
        }, new Collector.Characteristics[0]);
    }

    static <T, R, C, V, I extends Table<R, C, V>> Collector<T, ?, I> toTable(Function<? super T, ? extends R> function, Function<? super T, ? extends C> function2, Function<? super T, ? extends V> function3, Supplier<I> supplier) {
        return toTable(function, function2, function3, new BinaryOperator() { // from class: com.google.common.collect.TableCollectors$$ExternalSyntheticLambda0
            public /* synthetic */ BiFunction andThen(Function function4) {
                return BiFunction$CC.$default$andThen(this, function4);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return TableCollectors.lambda$toTable$0(obj, obj2);
            }
        }, supplier);
    }
}
