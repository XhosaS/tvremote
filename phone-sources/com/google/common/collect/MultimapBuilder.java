package com.google.common.collect;

import defpackage.ttm;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class MultimapBuilder<K0, V0> {
    private static final int DEFAULT_EXPECTED_KEYS = 8;

    /* compiled from: PG */
    final class ArrayListSupplier<V> implements Serializable, ttm {
        private final int expectedValuesPerKey;

        public ArrayListSupplier(int i) {
            CollectPreconditions.checkNonnegative(i, "expectedValuesPerKey");
            this.expectedValuesPerKey = i;
        }

        @Override // defpackage.ttm
        public List<V> get() {
            return new ArrayList(this.expectedValuesPerKey);
        }
    }

    /* compiled from: PG */
    final class EnumSetSupplier<V extends Enum<V>> implements Serializable, ttm {
        private final Class<V> clazz;

        public EnumSetSupplier(Class<V> cls) {
            cls.getClass();
            this.clazz = cls;
        }

        @Override // defpackage.ttm
        public Set<V> get() {
            return EnumSet.noneOf(this.clazz);
        }
    }

    /* compiled from: PG */
    final class HashSetSupplier<V> implements Serializable, ttm {
        private final int expectedValuesPerKey;

        public HashSetSupplier(int i) {
            CollectPreconditions.checkNonnegative(i, "expectedValuesPerKey");
            this.expectedValuesPerKey = i;
        }

        @Override // defpackage.ttm
        public Set<V> get() {
            return Platform.newHashSetWithExpectedSize(this.expectedValuesPerKey);
        }
    }

    /* compiled from: PG */
    final class LinkedHashSetSupplier<V> implements Serializable, ttm {
        private final int expectedValuesPerKey;

        public LinkedHashSetSupplier(int i) {
            CollectPreconditions.checkNonnegative(i, "expectedValuesPerKey");
            this.expectedValuesPerKey = i;
        }

        @Override // defpackage.ttm
        public Set<V> get() {
            return Platform.newLinkedHashSetWithExpectedSize(this.expectedValuesPerKey);
        }
    }

    /* compiled from: PG */
    enum LinkedListSupplier implements ttm<List<?>> {
        INSTANCE;

        public static <V> ttm<List<V>> instance() {
            return INSTANCE;
        }

        @Override // defpackage.ttm
        public List<?> get() {
            return new LinkedList();
        }
    }

    /* compiled from: PG */
    public abstract class ListMultimapBuilder<K0, V0> extends MultimapBuilder<K0, V0> {
        public ListMultimapBuilder() {
            super();
        }

        @Override // com.google.common.collect.MultimapBuilder
        public abstract <K extends K0, V extends V0> ListMultimap<K, V> build();

        @Override // com.google.common.collect.MultimapBuilder
        public <K extends K0, V extends V0> ListMultimap<K, V> build(Multimap<? extends K, ? extends V> multimap) {
            return (ListMultimap) super.build((Multimap) multimap);
        }
    }

    /* compiled from: PG */
    public abstract class MultimapBuilderWithKeys<K0> {
        private static final int DEFAULT_EXPECTED_VALUES_PER_KEY = 2;

        public ListMultimapBuilder<K0, Object> arrayListValues() {
            return arrayListValues(2);
        }

        public abstract <K extends K0, V> Map<K, Collection<V>> createMap();

        public <V0 extends Enum<V0>> SetMultimapBuilder<K0, V0> enumSetValues(final Class<V0> cls) {
            cls.getClass();
            return new SetMultimapBuilder<K0, V0>(this) { // from class: com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys.6
                final /* synthetic */ MultimapBuilderWithKeys this$0;

                {
                    this.getClass();
                    this.this$0 = this;
                }

                @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
                public <K extends K0, V extends V0> SetMultimap<K, V> build() {
                    return Multimaps.newSetMultimap(this.this$0.createMap(), new EnumSetSupplier(cls));
                }
            };
        }

        public SetMultimapBuilder<K0, Object> hashSetValues() {
            return hashSetValues(2);
        }

        public SetMultimapBuilder<K0, Object> linkedHashSetValues() {
            return linkedHashSetValues(2);
        }

        public ListMultimapBuilder<K0, Object> linkedListValues() {
            return new ListMultimapBuilder<K0, Object>(this) { // from class: com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys.2
                final /* synthetic */ MultimapBuilderWithKeys this$0;

                {
                    this.getClass();
                    this.this$0 = this;
                }

                @Override // com.google.common.collect.MultimapBuilder.ListMultimapBuilder, com.google.common.collect.MultimapBuilder
                public <K extends K0, V> ListMultimap<K, V> build() {
                    return Multimaps.newListMultimap(this.this$0.createMap(), LinkedListSupplier.instance());
                }
            };
        }

        public SortedSetMultimapBuilder<K0, Comparable> treeSetValues() {
            return treeSetValues(Ordering.natural());
        }

        public ListMultimapBuilder<K0, Object> arrayListValues(final int i) {
            CollectPreconditions.checkNonnegative(i, "expectedValuesPerKey");
            return new ListMultimapBuilder<K0, Object>(this) { // from class: com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys.1
                final /* synthetic */ MultimapBuilderWithKeys this$0;

                {
                    this.getClass();
                    this.this$0 = this;
                }

                @Override // com.google.common.collect.MultimapBuilder.ListMultimapBuilder, com.google.common.collect.MultimapBuilder
                public <K extends K0, V> ListMultimap<K, V> build() {
                    return Multimaps.newListMultimap(this.this$0.createMap(), new ArrayListSupplier(i));
                }
            };
        }

        public SetMultimapBuilder<K0, Object> hashSetValues(final int i) {
            CollectPreconditions.checkNonnegative(i, "expectedValuesPerKey");
            return new SetMultimapBuilder<K0, Object>(this) { // from class: com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys.3
                final /* synthetic */ MultimapBuilderWithKeys this$0;

                {
                    this.getClass();
                    this.this$0 = this;
                }

                @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
                public <K extends K0, V> SetMultimap<K, V> build() {
                    return Multimaps.newSetMultimap(this.this$0.createMap(), new HashSetSupplier(i));
                }
            };
        }

        public SetMultimapBuilder<K0, Object> linkedHashSetValues(final int i) {
            CollectPreconditions.checkNonnegative(i, "expectedValuesPerKey");
            return new SetMultimapBuilder<K0, Object>(this) { // from class: com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys.4
                final /* synthetic */ MultimapBuilderWithKeys this$0;

                {
                    this.getClass();
                    this.this$0 = this;
                }

                @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
                public <K extends K0, V> SetMultimap<K, V> build() {
                    return Multimaps.newSetMultimap(this.this$0.createMap(), new LinkedHashSetSupplier(i));
                }
            };
        }

        public <V0> SortedSetMultimapBuilder<K0, V0> treeSetValues(final Comparator<V0> comparator) {
            comparator.getClass();
            return new SortedSetMultimapBuilder<K0, V0>(this) { // from class: com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys.5
                final /* synthetic */ MultimapBuilderWithKeys this$0;

                {
                    this.getClass();
                    this.this$0 = this;
                }

                @Override // com.google.common.collect.MultimapBuilder.SortedSetMultimapBuilder, com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
                public <K extends K0, V extends V0> SortedSetMultimap<K, V> build() {
                    return Multimaps.newSortedSetMultimap(this.this$0.createMap(), new TreeSetSupplier(comparator));
                }
            };
        }
    }

    /* compiled from: PG */
    final class TreeSetSupplier<V> implements Serializable, ttm {
        private final Comparator<? super V> comparator;

        public TreeSetSupplier(Comparator<? super V> comparator) {
            comparator.getClass();
            this.comparator = comparator;
        }

        @Override // defpackage.ttm
        public SortedSet<V> get() {
            return new TreeSet(this.comparator);
        }
    }

    private MultimapBuilder() {
    }

    public static <K0 extends Enum<K0>> MultimapBuilderWithKeys<K0> enumKeys(final Class<K0> cls) {
        cls.getClass();
        return new MultimapBuilderWithKeys<K0>() { // from class: com.google.common.collect.MultimapBuilder.4
            @Override // com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys
            public <K extends K0, V> Map<K, Collection<V>> createMap() {
                return new EnumMap(cls);
            }
        };
    }

    public static MultimapBuilderWithKeys<Object> hashKeys() {
        return hashKeys(8);
    }

    public static MultimapBuilderWithKeys<Object> linkedHashKeys() {
        return linkedHashKeys(8);
    }

    public static MultimapBuilderWithKeys<Comparable> treeKeys() {
        return treeKeys(Ordering.natural());
    }

    public abstract <K extends K0, V extends V0> Multimap<K, V> build();

    public <K extends K0, V extends V0> Multimap<K, V> build(Multimap<? extends K, ? extends V> multimap) {
        Multimap<K, V> multimapBuild = build();
        multimapBuild.putAll(multimap);
        return multimapBuild;
    }

    /* compiled from: PG */
    public abstract class SetMultimapBuilder<K0, V0> extends MultimapBuilder<K0, V0> {
        public SetMultimapBuilder() {
            super();
        }

        @Override // com.google.common.collect.MultimapBuilder
        public abstract <K extends K0, V extends V0> SetMultimap<K, V> build();

        @Override // com.google.common.collect.MultimapBuilder
        public <K extends K0, V extends V0> SetMultimap<K, V> build(Multimap<? extends K, ? extends V> multimap) {
            return (SetMultimap) super.build((Multimap) multimap);
        }
    }

    public static MultimapBuilderWithKeys<Object> hashKeys(final int i) {
        CollectPreconditions.checkNonnegative(i, "expectedKeys");
        return new MultimapBuilderWithKeys<Object>() { // from class: com.google.common.collect.MultimapBuilder.1
            @Override // com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys
            public <K, V> Map<K, Collection<V>> createMap() {
                return Platform.newHashMapWithExpectedSize(i);
            }
        };
    }

    public static MultimapBuilderWithKeys<Object> linkedHashKeys(final int i) {
        CollectPreconditions.checkNonnegative(i, "expectedKeys");
        return new MultimapBuilderWithKeys<Object>() { // from class: com.google.common.collect.MultimapBuilder.2
            @Override // com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys
            public <K, V> Map<K, Collection<V>> createMap() {
                return Platform.newLinkedHashMapWithExpectedSize(i);
            }
        };
    }

    public static <K0> MultimapBuilderWithKeys<K0> treeKeys(final Comparator<K0> comparator) {
        comparator.getClass();
        return new MultimapBuilderWithKeys<K0>() { // from class: com.google.common.collect.MultimapBuilder.3
            @Override // com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys
            public <K extends K0, V> Map<K, Collection<V>> createMap() {
                return new TreeMap(comparator);
            }
        };
    }

    /* compiled from: PG */
    public abstract class SortedSetMultimapBuilder<K0, V0> extends SetMultimapBuilder<K0, V0> {
        @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
        public abstract <K extends K0, V extends V0> SortedSetMultimap<K, V> build();

        @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
        public <K extends K0, V extends V0> SortedSetMultimap<K, V> build(Multimap<? extends K, ? extends V> multimap) {
            return (SortedSetMultimap) super.build((Multimap) multimap);
        }
    }
}
