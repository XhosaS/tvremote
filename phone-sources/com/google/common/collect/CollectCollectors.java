package com.google.common.collect;

import com.google.common.collect.CollectCollectors;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.MultimapBuilder;
import defpackage.a;
import j$.util.Map;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collector;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

/* compiled from: PG */
/* loaded from: classes.dex */
final class CollectCollectors {
    private static final Collector<Object, ?, ImmutableList<Object>> TO_IMMUTABLE_LIST = Collector.CC.of(new Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda17
        @Override // java.util.function.Supplier
        public final Object get() {
            return ImmutableList.builder();
        }
    }, new BiConsumer() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda20
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((ImmutableList.Builder) obj).add((ImmutableList.Builder) obj2);
        }

        public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
            return BiConsumer$CC.$default$andThen(this, biConsumer);
        }
    }, new BinaryOperator() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda21
        public /* synthetic */ BiFunction andThen(Function function) {
            return BiFunction$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            ImmutableList.Builder builder = (ImmutableList.Builder) obj;
            builder.combine((ImmutableList.Builder) obj2);
            return builder;
        }
    }, new Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda22
        @Override // java.util.function.Function
        /* renamed from: andThen */
        public /* synthetic */ Function mo439andThen(Function function) {
            return Function$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((ImmutableList.Builder) obj).build();
        }

        public /* synthetic */ Function compose(Function function) {
            return Function$CC.$default$compose(this, function);
        }
    }, new Collector.Characteristics[0]);
    private static final Collector<Object, ?, ImmutableSet<Object>> TO_IMMUTABLE_SET = Collector.CC.of(new Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda23
        @Override // java.util.function.Supplier
        public final Object get() {
            return ImmutableSet.builder();
        }
    }, new BiConsumer() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda24
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((ImmutableSet.Builder) obj).add((ImmutableSet.Builder) obj2);
        }

        public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
            return BiConsumer$CC.$default$andThen(this, biConsumer);
        }
    }, new BinaryOperator() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda25
        public /* synthetic */ BiFunction andThen(Function function) {
            return BiFunction$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return ((ImmutableSet.Builder) obj).combine((ImmutableSet.Builder) obj2);
        }
    }, new Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda26
        @Override // java.util.function.Function
        /* renamed from: andThen */
        public /* synthetic */ Function mo439andThen(Function function) {
            return Function$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((ImmutableSet.Builder) obj).build();
        }

        public /* synthetic */ Function compose(Function function) {
            return Function$CC.$default$compose(this, function);
        }
    }, new Collector.Characteristics[0]);
    private static final Collector<Range<Comparable<?>>, ?, ImmutableRangeSet<Comparable<?>>> TO_IMMUTABLE_RANGE_SET = Collector.CC.of(new Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda27
        @Override // java.util.function.Supplier
        public final Object get() {
            return ImmutableRangeSet.builder();
        }
    }, new BiConsumer() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda28
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((ImmutableRangeSet.Builder) obj).add((Range) obj2);
        }

        public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
            return BiConsumer$CC.$default$andThen(this, biConsumer);
        }
    }, new BinaryOperator() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda18
        public /* synthetic */ BiFunction andThen(Function function) {
            return BiFunction$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return ((ImmutableRangeSet.Builder) obj).combine((ImmutableRangeSet.Builder) obj2);
        }
    }, new Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda19
        @Override // java.util.function.Function
        /* renamed from: andThen */
        public /* synthetic */ Function mo439andThen(Function function) {
            return Function$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((ImmutableRangeSet.Builder) obj).build();
        }

        public /* synthetic */ Function compose(Function function) {
            return Function$CC.$default$compose(this, function);
        }
    }, new Collector.Characteristics[0]);

    /* compiled from: PG */
    class EnumMapAccumulator<K extends Enum<K>, V> {
        private EnumMap<K, V> map = null;
        private final BinaryOperator<V> mergeFunction;

        public EnumMapAccumulator(BinaryOperator<V> binaryOperator) {
            this.mergeFunction = binaryOperator;
        }

        public EnumMapAccumulator<K, V> combine(EnumMapAccumulator<K, V> enumMapAccumulator) {
            if (this.map == null) {
                return enumMapAccumulator;
            }
            EnumMap<K, V> enumMap = enumMapAccumulator.map;
            if (enumMap == null) {
                return this;
            }
            Map.EL.forEach(enumMap, new BiConsumer() { // from class: com.google.common.collect.CollectCollectors$EnumMapAccumulator$$ExternalSyntheticLambda0
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    this.f$0.put((Enum) obj, obj2);
                }

                public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return BiConsumer$CC.$default$andThen(this, biConsumer);
                }
            });
            return this;
        }

        public void put(K k, V v) {
            EnumMap<K, V> enumMap = this.map;
            if (enumMap == null) {
                this.map = new EnumMap<>(Collections.singletonMap(k, v));
            } else {
                Map.EL.merge(enumMap, k, v, this.mergeFunction);
            }
        }

        public ImmutableMap<K, V> toImmutableMap() {
            EnumMap<K, V> enumMap = this.map;
            return enumMap == null ? ImmutableMap.of() : ImmutableEnumMap.asImmutable(enumMap);
        }
    }

    /* compiled from: PG */
    final class EnumSetAccumulator<E extends Enum<E>> {
        static final Collector<Enum<?>, ?, ImmutableSet<? extends Enum<?>>> TO_IMMUTABLE_ENUM_SET = CollectCollectors.toImmutableEnumSetGeneric();
        private EnumSet<E> set;

        private EnumSetAccumulator() {
        }

        public void add(E e) {
            EnumSet<E> enumSet = this.set;
            if (enumSet == null) {
                this.set = EnumSet.of((Enum) e);
            } else {
                enumSet.add(e);
            }
        }

        public EnumSetAccumulator<E> combine(EnumSetAccumulator<E> enumSetAccumulator) {
            EnumSet<E> enumSet = this.set;
            if (enumSet == null) {
                return enumSetAccumulator;
            }
            EnumSet<E> enumSet2 = enumSetAccumulator.set;
            if (enumSet2 == null) {
                return this;
            }
            enumSet.addAll(enumSet2);
            return this;
        }

        public ImmutableSet<E> toImmutableSet() {
            EnumSet<E> enumSet = this.set;
            if (enumSet == null) {
                return ImmutableSet.of();
            }
            ImmutableSet<E> immutableSetAsImmutable = ImmutableEnumSet.asImmutable(enumSet);
            this.set = null;
            return immutableSetAsImmutable;
        }
    }

    /* renamed from: $r8$lambda$XEOS3SBVkrJzmN-eR6tLspDQTgs, reason: not valid java name */
    public static /* synthetic */ EnumSetAccumulator m158$r8$lambda$XEOS3SBVkrJzmNeR6tLspDQTgs() {
        return new EnumSetAccumulator();
    }

    private CollectCollectors() {
    }

    static <T, K, V> Collector<T, ?, ImmutableListMultimap<K, V>> flatteningToImmutableListMultimap(final Function<? super T, ? extends K> function, final Function<? super T, ? extends Stream<? extends V>> function2) {
        function.getClass();
        function2.getClass();
        Function function3 = new Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda31
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public /* synthetic */ Function mo439andThen(Function function4) {
                return Function$CC.$default$andThen(this, function4);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return CollectCollectors.lambda$flatteningToImmutableListMultimap$0(function, obj);
            }

            public /* synthetic */ Function compose(Function function4) {
                return Function$CC.$default$compose(this, function4);
            }
        };
        Function function4 = new Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda32
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public /* synthetic */ Function mo439andThen(Function function5) {
                return Function$CC.$default$andThen(this, function5);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Stream) function2.apply(obj)).peek(new CollectCollectors$$ExternalSyntheticLambda45());
            }

            public /* synthetic */ Function compose(Function function5) {
                return Function$CC.$default$compose(this, function5);
            }
        };
        final MultimapBuilder.ListMultimapBuilder<Object, Object> listMultimapBuilderArrayListValues = MultimapBuilder.linkedHashKeys().arrayListValues();
        listMultimapBuilderArrayListValues.getClass();
        return Collectors.collectingAndThen(flatteningToMultimap(function3, function4, new Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda33
            @Override // java.util.function.Supplier
            public final Object get() {
                return listMultimapBuilderArrayListValues.build();
            }
        }), new Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda34
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public /* synthetic */ Function mo439andThen(Function function5) {
                return Function$CC.$default$andThen(this, function5);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ImmutableListMultimap.copyOf((Multimap) obj);
            }

            public /* synthetic */ Function compose(Function function5) {
                return Function$CC.$default$compose(this, function5);
            }
        });
    }

    static <T, K, V> Collector<T, ?, ImmutableSetMultimap<K, V>> flatteningToImmutableSetMultimap(final Function<? super T, ? extends K> function, final Function<? super T, ? extends Stream<? extends V>> function2) {
        function.getClass();
        function2.getClass();
        Function function3 = new Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda39
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public /* synthetic */ Function mo439andThen(Function function4) {
                return Function$CC.$default$andThen(this, function4);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return CollectCollectors.lambda$flatteningToImmutableSetMultimap$0(function, obj);
            }

            public /* synthetic */ Function compose(Function function4) {
                return Function$CC.$default$compose(this, function4);
            }
        };
        Function function4 = new Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda40
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public /* synthetic */ Function mo439andThen(Function function5) {
                return Function$CC.$default$andThen(this, function5);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Stream) function2.apply(obj)).peek(new CollectCollectors$$ExternalSyntheticLambda45());
            }

            public /* synthetic */ Function compose(Function function5) {
                return Function$CC.$default$compose(this, function5);
            }
        };
        final MultimapBuilder.SetMultimapBuilder<Object, Object> setMultimapBuilderLinkedHashSetValues = MultimapBuilder.linkedHashKeys().linkedHashSetValues();
        setMultimapBuilderLinkedHashSetValues.getClass();
        return Collectors.collectingAndThen(flatteningToMultimap(function3, function4, new Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda41
            @Override // java.util.function.Supplier
            public final Object get() {
                return setMultimapBuilderLinkedHashSetValues.build();
            }
        }), new Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda42
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public /* synthetic */ Function mo439andThen(Function function5) {
                return Function$CC.$default$andThen(this, function5);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ImmutableSetMultimap.copyOf((Multimap) obj);
            }

            public /* synthetic */ Function compose(Function function5) {
                return Function$CC.$default$compose(this, function5);
            }
        });
    }

    static <T, K, V, M extends Multimap<K, V>> Collector<T, ?, M> flatteningToMultimap(final Function<? super T, ? extends K> function, final Function<? super T, ? extends Stream<? extends V>> function2, Supplier<M> supplier) {
        function.getClass();
        function2.getClass();
        supplier.getClass();
        return Collector.CC.of(supplier, new BiConsumer() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda29
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                CollectCollectors.lambda$flatteningToMultimap$0(function, function2, (Multimap) obj, obj2);
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda30
            public /* synthetic */ BiFunction andThen(Function function3) {
                return BiFunction$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Multimap multimap = (Multimap) obj;
                CollectCollectors.lambda$flatteningToMultimap$1(multimap, (Multimap) obj2);
                return multimap;
            }
        }, new Collector.Characteristics[0]);
    }

    static /* synthetic */ Object lambda$flatteningToImmutableListMultimap$0(Function function, Object obj) {
        Object objApply = function.apply(obj);
        objApply.getClass();
        return objApply;
    }

    static /* synthetic */ Object lambda$flatteningToImmutableSetMultimap$0(Function function, Object obj) {
        Object objApply = function.apply(obj);
        objApply.getClass();
        return objApply;
    }

    static /* synthetic */ void lambda$flatteningToMultimap$0(Function function, Function function2, Multimap multimap, Object obj) {
        final Collection collection = multimap.get(function.apply(obj));
        Stream stream = (Stream) function2.apply(obj);
        collection.getClass();
        stream.forEachOrdered(new Consumer() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda8
            @Override // java.util.function.Consumer
            public final void accept(Object obj2) {
                collection.add(obj2);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    static /* synthetic */ Multimap lambda$flatteningToMultimap$1(Multimap multimap, Multimap multimap2) {
        multimap.putAll(multimap2);
        return multimap;
    }

    static /* synthetic */ EnumMapAccumulator lambda$toImmutableEnumMap$0() {
        return new EnumMapAccumulator(new BinaryOperator() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda68
            public /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return CollectCollectors.lambda$toImmutableEnumMap$1(obj, obj2);
            }
        });
    }

    static /* synthetic */ Object lambda$toImmutableEnumMap$1(Object obj, Object obj2) {
        throw new IllegalArgumentException(a.cA(obj2, obj, "Multiple values for key: ", ", "));
    }

    static /* synthetic */ void lambda$toImmutableEnumMap$2(Function function, Function function2, EnumMapAccumulator enumMapAccumulator, Object obj) {
        Enum r0 = (Enum) function.apply(obj);
        Object objApply = function2.apply(obj);
        r0.getClass();
        objApply.getClass();
        enumMapAccumulator.put(r0, objApply);
    }

    static /* synthetic */ EnumMapAccumulator lambda$toImmutableEnumMap$3(BinaryOperator binaryOperator) {
        return new EnumMapAccumulator(binaryOperator);
    }

    static /* synthetic */ void lambda$toImmutableEnumMap$4(Function function, Function function2, EnumMapAccumulator enumMapAccumulator, Object obj) {
        Enum r0 = (Enum) function.apply(obj);
        Object objApply = function2.apply(obj);
        r0.getClass();
        objApply.getClass();
        enumMapAccumulator.put(r0, objApply);
    }

    static /* synthetic */ void lambda$toImmutableMultiset$0(Function function, ToIntFunction toIntFunction, Multiset multiset, Object obj) {
        Object objApply = function.apply(obj);
        objApply.getClass();
        multiset.add(objApply, toIntFunction.applyAsInt(obj));
    }

    static /* synthetic */ Multiset lambda$toImmutableMultiset$1(Multiset multiset, Multiset multiset2) {
        multiset.addAll(multiset2);
        return multiset;
    }

    static /* synthetic */ ImmutableSortedMap.Builder lambda$toImmutableSortedMap$0(Comparator comparator) {
        return new ImmutableSortedMap.Builder(comparator);
    }

    static /* synthetic */ TreeMap lambda$toImmutableSortedMap$2(Comparator comparator) {
        return new TreeMap(comparator);
    }

    static /* synthetic */ ImmutableSortedSet.Builder lambda$toImmutableSortedSet$0(Comparator comparator) {
        return new ImmutableSortedSet.Builder(comparator);
    }

    static /* synthetic */ Multimap lambda$toMultimap$1(Multimap multimap, Multimap multimap2) {
        multimap.putAll(multimap2);
        return multimap;
    }

    static /* synthetic */ Multiset lambda$toMultiset$1(Multiset multiset, Multiset multiset2) {
        multiset.addAll(multiset2);
        return multiset;
    }

    static <T, K, V> Collector<T, ?, ImmutableBiMap<K, V>> toImmutableBiMap(final Function<? super T, ? extends K> function, final Function<? super T, ? extends V> function2) {
        function.getClass();
        function2.getClass();
        return Collector.CC.of(new Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda9
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ImmutableBiMap.Builder();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda10
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ImmutableBiMap.Builder) obj).put((ImmutableBiMap.Builder) function.apply(obj2), (ImmutableBiMap.Builder) function2.apply(obj2));
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda11
            public /* synthetic */ BiFunction andThen(Function function3) {
                return BiFunction$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                ImmutableBiMap.Builder builder = (ImmutableBiMap.Builder) obj;
                builder.combine((ImmutableMap.Builder) obj2);
                return builder;
            }
        }, new Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda12
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public /* synthetic */ Function mo439andThen(Function function3) {
                return Function$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableBiMap.Builder) obj).buildOrThrow();
            }

            public /* synthetic */ Function compose(Function function3) {
                return Function$CC.$default$compose(this, function3);
            }
        }, new Collector.Characteristics[0]);
    }

    static <T, K extends Enum<K>, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableEnumMap(final Function<? super T, ? extends K> function, final Function<? super T, ? extends V> function2) {
        function.getClass();
        function2.getClass();
        return Collector.CC.of(new Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda46
            @Override // java.util.function.Supplier
            public final Object get() {
                return CollectCollectors.lambda$toImmutableEnumMap$0();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda47
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                CollectCollectors.lambda$toImmutableEnumMap$2(function, function2, (CollectCollectors.EnumMapAccumulator) obj, obj2);
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new CollectCollectors$$ExternalSyntheticLambda48(), new CollectCollectors$$ExternalSyntheticLambda49(), Collector.Characteristics.UNORDERED);
    }

    static <E extends Enum<E>> Collector<E, ?, ImmutableSet<E>> toImmutableEnumSet() {
        return (Collector<E, ?, ImmutableSet<E>>) EnumSetAccumulator.TO_IMMUTABLE_ENUM_SET;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E extends Enum<E>> Collector<E, EnumSetAccumulator<E>, ImmutableSet<E>> toImmutableEnumSetGeneric() {
        return Collector.CC.of(new Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda13
            @Override // java.util.function.Supplier
            public final Object get() {
                return CollectCollectors.m158$r8$lambda$XEOS3SBVkrJzmNeR6tLspDQTgs();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda14
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((CollectCollectors.EnumSetAccumulator) obj).add((Enum) obj2);
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda15
            public /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((CollectCollectors.EnumSetAccumulator) obj).combine((CollectCollectors.EnumSetAccumulator) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda16
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public /* synthetic */ Function mo439andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((CollectCollectors.EnumSetAccumulator) obj).toImmutableSet();
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, Collector.Characteristics.UNORDERED);
    }

    static <E> Collector<E, ?, ImmutableList<E>> toImmutableList() {
        return (Collector<E, ?, ImmutableList<E>>) TO_IMMUTABLE_LIST;
    }

    static <T, K, V> Collector<T, ?, ImmutableListMultimap<K, V>> toImmutableListMultimap(final Function<? super T, ? extends K> function, final Function<? super T, ? extends V> function2) {
        function.getClass();
        function2.getClass();
        return Collector.CC.of(new Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda58
            @Override // java.util.function.Supplier
            public final Object get() {
                return ImmutableListMultimap.builder();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda59
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ImmutableListMultimap.Builder) obj).put((ImmutableListMultimap.Builder) function.apply(obj2), (ImmutableListMultimap.Builder) function2.apply(obj2));
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda60
            public /* synthetic */ BiFunction andThen(Function function3) {
                return BiFunction$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                ImmutableListMultimap.Builder builder = (ImmutableListMultimap.Builder) obj;
                builder.combine((ImmutableMultimap.Builder) obj2);
                return builder;
            }
        }, new Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda61
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public /* synthetic */ Function mo439andThen(Function function3) {
                return Function$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableListMultimap.Builder) obj).build();
            }

            public /* synthetic */ Function compose(Function function3) {
                return Function$CC.$default$compose(this, function3);
            }
        }, new Collector.Characteristics[0]);
    }

    static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableMap(final Function<? super T, ? extends K> function, final Function<? super T, ? extends V> function2) {
        function.getClass();
        function2.getClass();
        return Collector.CC.of(new Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda50
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ImmutableMap.Builder();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda51
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ImmutableMap.Builder) obj).put(function.apply(obj2), function2.apply(obj2));
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda52
            public /* synthetic */ BiFunction andThen(Function function3) {
                return BiFunction$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableMap.Builder) obj).combine((ImmutableMap.Builder) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda53
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public /* synthetic */ Function mo439andThen(Function function3) {
                return Function$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableMap.Builder) obj).buildOrThrow();
            }

            public /* synthetic */ Function compose(Function function3) {
                return Function$CC.$default$compose(this, function3);
            }
        }, new Collector.Characteristics[0]);
    }

    static <T, E> Collector<T, ?, ImmutableMultiset<E>> toImmutableMultiset(final Function<? super T, ? extends E> function, final ToIntFunction<? super T> toIntFunction) {
        function.getClass();
        toIntFunction.getClass();
        return Collector.CC.of(new Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda35
            @Override // java.util.function.Supplier
            public final Object get() {
                return LinkedHashMultiset.create();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda36
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                CollectCollectors.lambda$toImmutableMultiset$0(function, toIntFunction, (Multiset) obj, obj2);
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda37
            public /* synthetic */ BiFunction andThen(Function function2) {
                return BiFunction$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Multiset multiset = (Multiset) obj;
                CollectCollectors.lambda$toImmutableMultiset$1(multiset, (Multiset) obj2);
                return multiset;
            }
        }, new Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda38
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public /* synthetic */ Function mo439andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ImmutableMultiset.copyFromEntries(((Multiset) obj).entrySet());
            }

            public /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        }, new Collector.Characteristics[0]);
    }

    static <T, K extends Comparable<? super K>, V> Collector<T, ?, ImmutableRangeMap<K, V>> toImmutableRangeMap(final Function<? super T, Range<K>> function, final Function<? super T, ? extends V> function2) {
        function.getClass();
        function2.getClass();
        return Collector.CC.of(new Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final Object get() {
                return ImmutableRangeMap.builder();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ImmutableRangeMap.Builder) obj).put((Range) function.apply(obj2), function2.apply(obj2));
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda2
            public /* synthetic */ BiFunction andThen(Function function3) {
                return BiFunction$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                ImmutableRangeMap.Builder builder = (ImmutableRangeMap.Builder) obj;
                builder.combine((ImmutableRangeMap.Builder) obj2);
                return builder;
            }
        }, new Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda3
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public /* synthetic */ Function mo439andThen(Function function3) {
                return Function$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableRangeMap.Builder) obj).build();
            }

            public /* synthetic */ Function compose(Function function3) {
                return Function$CC.$default$compose(this, function3);
            }
        }, new Collector.Characteristics[0]);
    }

    static <E extends Comparable<? super E>> Collector<Range<E>, ?, ImmutableRangeSet<E>> toImmutableRangeSet() {
        return (Collector<Range<E>, ?, ImmutableRangeSet<E>>) TO_IMMUTABLE_RANGE_SET;
    }

    static <E> Collector<E, ?, ImmutableSet<E>> toImmutableSet() {
        return (Collector<E, ?, ImmutableSet<E>>) TO_IMMUTABLE_SET;
    }

    static <T, K, V> Collector<T, ?, ImmutableSetMultimap<K, V>> toImmutableSetMultimap(final Function<? super T, ? extends K> function, final Function<? super T, ? extends V> function2) {
        function.getClass();
        function2.getClass();
        return Collector.CC.of(new Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda62
            @Override // java.util.function.Supplier
            public final Object get() {
                return ImmutableSetMultimap.builder();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda63
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ImmutableSetMultimap.Builder) obj).put((ImmutableSetMultimap.Builder) function.apply(obj2), (ImmutableSetMultimap.Builder) function2.apply(obj2));
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda64
            public /* synthetic */ BiFunction andThen(Function function3) {
                return BiFunction$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                ImmutableSetMultimap.Builder builder = (ImmutableSetMultimap.Builder) obj;
                builder.combine((ImmutableMultimap.Builder) obj2);
                return builder;
            }
        }, new Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda65
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public /* synthetic */ Function mo439andThen(Function function3) {
                return Function$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableSetMultimap.Builder) obj).build();
            }

            public /* synthetic */ Function compose(Function function3) {
                return Function$CC.$default$compose(this, function3);
            }
        }, new Collector.Characteristics[0]);
    }

    static <T, K, V> Collector<T, ?, ImmutableSortedMap<K, V>> toImmutableSortedMap(final Comparator<? super K> comparator, final Function<? super T, ? extends K> function, final Function<? super T, ? extends V> function2) {
        comparator.getClass();
        function.getClass();
        function2.getClass();
        return Collector.CC.of(new Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda4
            @Override // java.util.function.Supplier
            public final Object get() {
                return CollectCollectors.lambda$toImmutableSortedMap$0(comparator);
            }
        }, new BiConsumer() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda5
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ImmutableSortedMap.Builder) obj).put((ImmutableSortedMap.Builder) function.apply(obj2), (ImmutableSortedMap.Builder) function2.apply(obj2));
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda6
            public /* synthetic */ BiFunction andThen(Function function3) {
                return BiFunction$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableSortedMap.Builder) obj).combine((ImmutableSortedMap.Builder) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda7
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public /* synthetic */ Function mo439andThen(Function function3) {
                return Function$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableSortedMap.Builder) obj).buildOrThrow();
            }

            public /* synthetic */ Function compose(Function function3) {
                return Function$CC.$default$compose(this, function3);
            }
        }, Collector.Characteristics.UNORDERED);
    }

    static <E> Collector<E, ?, ImmutableSortedSet<E>> toImmutableSortedSet(final Comparator<? super E> comparator) {
        comparator.getClass();
        return Collector.CC.of(new Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda54
            @Override // java.util.function.Supplier
            public final Object get() {
                return CollectCollectors.lambda$toImmutableSortedSet$0(comparator);
            }
        }, new BiConsumer() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda55
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ImmutableSortedSet.Builder) obj).add((ImmutableSortedSet.Builder) obj2);
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda56
            public /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                ImmutableSortedSet.Builder builder = (ImmutableSortedSet.Builder) obj;
                builder.combine((ImmutableSet.Builder) obj2);
                return builder;
            }
        }, new Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda57
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public /* synthetic */ Function mo439andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableSortedSet.Builder) obj).build();
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Collector.Characteristics[0]);
    }

    static <T, K, V, M extends Multimap<K, V>> Collector<T, ?, M> toMultimap(final Function<? super T, ? extends K> function, final Function<? super T, ? extends V> function2, Supplier<M> supplier) {
        function.getClass();
        function2.getClass();
        supplier.getClass();
        return Collector.CC.of(supplier, new BiConsumer() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda73
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((Multimap) obj).put(function.apply(obj2), function2.apply(obj2));
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda74
            public /* synthetic */ BiFunction andThen(Function function3) {
                return BiFunction$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Multimap multimap = (Multimap) obj;
                CollectCollectors.lambda$toMultimap$1(multimap, (Multimap) obj2);
                return multimap;
            }
        }, new Collector.Characteristics[0]);
    }

    static <T, E, M extends Multiset<E>> Collector<T, ?, M> toMultiset(final Function<? super T, E> function, final ToIntFunction<? super T> toIntFunction, Supplier<M> supplier) {
        function.getClass();
        toIntFunction.getClass();
        supplier.getClass();
        return Collector.CC.of(supplier, new BiConsumer() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda69
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((Multiset) obj).add(function.apply(obj2), toIntFunction.applyAsInt(obj2));
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda70
            public /* synthetic */ BiFunction andThen(Function function2) {
                return BiFunction$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Multiset multiset = (Multiset) obj;
                CollectCollectors.lambda$toMultiset$1(multiset, (Multiset) obj2);
                return multiset;
            }
        }, new Collector.Characteristics[0]);
    }

    static <T, K extends Enum<K>, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableEnumMap(final Function<? super T, ? extends K> function, final Function<? super T, ? extends V> function2, final BinaryOperator<V> binaryOperator) {
        function.getClass();
        function2.getClass();
        binaryOperator.getClass();
        return Collector.CC.of(new Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda71
            @Override // java.util.function.Supplier
            public final Object get() {
                return CollectCollectors.lambda$toImmutableEnumMap$3(binaryOperator);
            }
        }, new BiConsumer() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda72
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                CollectCollectors.lambda$toImmutableEnumMap$4(function, function2, (CollectCollectors.EnumMapAccumulator) obj, obj2);
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new CollectCollectors$$ExternalSyntheticLambda48(), new CollectCollectors$$ExternalSyntheticLambda49(), new Collector.Characteristics[0]);
    }

    static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, BinaryOperator<V> binaryOperator) {
        function.getClass();
        function2.getClass();
        binaryOperator.getClass();
        return Collectors.collectingAndThen(Collectors.toMap(function, function2, binaryOperator, new Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda66
            @Override // java.util.function.Supplier
            public final Object get() {
                return new LinkedHashMap();
            }
        }), new Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda67
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public /* synthetic */ Function mo439andThen(Function function3) {
                return Function$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ImmutableMap.copyOf((java.util.Map) obj);
            }

            public /* synthetic */ Function compose(Function function3) {
                return Function$CC.$default$compose(this, function3);
            }
        });
    }

    static <T, K, V> Collector<T, ?, ImmutableSortedMap<K, V>> toImmutableSortedMap(final Comparator<? super K> comparator, Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, BinaryOperator<V> binaryOperator) {
        comparator.getClass();
        function.getClass();
        function2.getClass();
        binaryOperator.getClass();
        return Collectors.collectingAndThen(Collectors.toMap(function, function2, binaryOperator, new Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda43
            @Override // java.util.function.Supplier
            public final Object get() {
                return CollectCollectors.lambda$toImmutableSortedMap$2(comparator);
            }
        }), new Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda44
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public /* synthetic */ Function mo439andThen(Function function3) {
                return Function$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ImmutableSortedMap.copyOfSorted((TreeMap) obj);
            }

            public /* synthetic */ Function compose(Function function3) {
                return Function$CC.$default$compose(this, function3);
            }
        });
    }
}
