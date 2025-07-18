package com.google.common.collect;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Serialization;
import defpackage.a;
import j$.util.function.Function$CC;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ImmutableListMultimap<K, V> extends ImmutableMultimap<K, V> implements ListMultimap<K, V> {
    private static final long serialVersionUID = 0;
    private transient ImmutableListMultimap<V, K> inverse;

    /* compiled from: PG */
    public final class Builder<K, V> extends ImmutableMultimap.Builder<K, V> {
        public Builder() {
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public ImmutableListMultimap<K, V> build() {
            return (ImmutableListMultimap) super.build();
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public Builder<K, V> combine(ImmutableMultimap.Builder<K, V> builder) {
            super.combine((ImmutableMultimap.Builder) builder);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public Builder<K, V> expectedValuesPerKey(int i) {
            super.expectedValuesPerKey(i);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public Builder<K, V> orderKeysBy(Comparator<? super K> comparator) {
            super.orderKeysBy((Comparator) comparator);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public Builder<K, V> orderValuesBy(Comparator<? super V> comparator) {
            super.orderValuesBy((Comparator) comparator);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public Builder<K, V> put(K k, V v) {
            super.put((Builder<K, V>) k, (K) v);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public Builder<K, V> putAll(Multimap<? extends K, ? extends V> multimap) {
            super.putAll((Multimap) multimap);
            return this;
        }

        public Builder(int i) {
            super(i);
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public /* bridge */ /* synthetic */ ImmutableMultimap.Builder combine(ImmutableMultimap.Builder builder) {
            combine(builder);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public /* bridge */ /* synthetic */ ImmutableMultimap.Builder expectedValuesPerKey(int i) {
            expectedValuesPerKey(i);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public /* bridge */ /* synthetic */ ImmutableMultimap.Builder orderKeysBy(Comparator comparator) {
            orderKeysBy(comparator);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public /* bridge */ /* synthetic */ ImmutableMultimap.Builder orderValuesBy(Comparator comparator) {
            orderValuesBy(comparator);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public /* bridge */ /* synthetic */ ImmutableMultimap.Builder put(Object obj, Object obj2) {
            put((Builder<K, V>) obj, obj2);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public /* bridge */ /* synthetic */ ImmutableMultimap.Builder putAll(Multimap multimap) {
            putAll(multimap);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public Builder<K, V> put(Map.Entry<? extends K, ? extends V> entry) {
            super.put((Map.Entry) entry);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public Builder<K, V> putAll(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.putAll((Iterable) iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public /* bridge */ /* synthetic */ ImmutableMultimap.Builder put(Map.Entry entry) {
            put(entry);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public /* bridge */ /* synthetic */ ImmutableMultimap.Builder putAll(Iterable iterable) {
            putAll(iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public Builder<K, V> putAll(K k, Iterable<? extends V> iterable) {
            super.putAll((Builder<K, V>) k, (Iterable) iterable);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public /* bridge */ /* synthetic */ ImmutableMultimap.Builder putAll(Object obj, Iterable iterable) {
            putAll((Builder<K, V>) obj, iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public Builder<K, V> putAll(K k, V... vArr) {
            super.putAll((Builder<K, V>) k, (Object[]) vArr);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public /* bridge */ /* synthetic */ ImmutableMultimap.Builder putAll(Object obj, Object[] objArr) {
            putAll((Builder<K, V>) obj, objArr);
            return this;
        }
    }

    public ImmutableListMultimap(ImmutableMap<K, ImmutableList<V>> immutableMap, int i) {
        super(immutableMap, i);
    }

    public static <K, V> Builder<K, V> builder() {
        return new Builder<>();
    }

    public static <K, V> Builder<K, V> builderWithExpectedKeys(int i) {
        CollectPreconditions.checkNonnegative(i, "expectedKeys");
        return new Builder<>(i);
    }

    public static <K, V> ImmutableListMultimap<K, V> copyOf(Multimap<? extends K, ? extends V> multimap) {
        if (multimap.isEmpty()) {
            return of();
        }
        if (multimap instanceof ImmutableListMultimap) {
            ImmutableListMultimap<K, V> immutableListMultimap = (ImmutableListMultimap) multimap;
            if (!immutableListMultimap.isPartialView()) {
                return immutableListMultimap;
            }
        }
        return fromMapEntries(multimap.asMap().entrySet(), null);
    }

    public static <K, V> Collector<Map.Entry<? extends K, ? extends V>, ?, ImmutableListMultimap<K, V>> entriesToImmutableListMultimap() {
        return toImmutableListMultimap(new Function() { // from class: com.google.common.collect.ImmutableListMultimap$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public /* synthetic */ Function mo439andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Map.Entry) obj).getKey();
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: com.google.common.collect.ImmutableListMultimap$$ExternalSyntheticLambda1
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public /* synthetic */ Function mo439andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Map.Entry) obj).getValue();
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public static <T, K, V> Collector<T, ?, ImmutableListMultimap<K, V>> flatteningToImmutableListMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends Stream<? extends V>> function2) {
        return CollectCollectors.flatteningToImmutableListMultimap(function, function2);
    }

    static <K, V> ImmutableListMultimap<K, V> fromMapBuilderEntries(Collection<? extends Map.Entry<K, ImmutableCollection.Builder<V>>> collection, Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return of();
        }
        ImmutableMap.Builder builder = new ImmutableMap.Builder(collection.size());
        int size = 0;
        for (Map.Entry<K, ImmutableCollection.Builder<V>> entry : collection) {
            K key = entry.getKey();
            ImmutableList.Builder builder2 = (ImmutableList.Builder) entry.getValue();
            ImmutableList immutableListBuild = comparator == null ? builder2.build() : builder2.buildSorted(comparator);
            builder.put(key, immutableListBuild);
            size += immutableListBuild.size();
        }
        return new ImmutableListMultimap<>(builder.buildOrThrow(), size);
    }

    static <K, V> ImmutableListMultimap<K, V> fromMapEntries(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return of();
        }
        ImmutableMap.Builder builder = new ImmutableMap.Builder(collection.size());
        int size = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            Collection<? extends V> value = entry.getValue();
            ImmutableList immutableListCopyOf = comparator == null ? ImmutableList.copyOf((Collection) value) : ImmutableList.sortedCopyOf(comparator, value);
            if (!immutableListCopyOf.isEmpty()) {
                builder.put(key, immutableListCopyOf);
                size += immutableListCopyOf.size();
            }
        }
        return new ImmutableListMultimap<>(builder.buildOrThrow(), size);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ImmutableListMultimap<V, K> invert() {
        Builder builder = builder();
        UnmodifiableIterator it = entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            builder.put((Builder) entry.getValue(), entry.getKey());
        }
        ImmutableListMultimap<V, K> immutableListMultimapBuild = builder.build();
        immutableListMultimapBuild.inverse = this;
        return immutableListMultimapBuild;
    }

    public static <K, V> ImmutableListMultimap<K, V> of() {
        return EmptyImmutableListMultimap.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, ClassNotFoundException, IOException, IllegalArgumentException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(a.cf(i, "Invalid key count "));
        }
        ImmutableMap.Builder builder = ImmutableMap.builder();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object object = objectInputStream.readObject();
            object.getClass();
            int i4 = objectInputStream.readInt();
            if (i4 <= 0) {
                throw new InvalidObjectException(a.cf(i4, "Invalid value count "));
            }
            ImmutableList.Builder builder2 = ImmutableList.builder();
            for (int i5 = 0; i5 < i4; i5++) {
                Object object2 = objectInputStream.readObject();
                object2.getClass();
                builder2.add((ImmutableList.Builder) object2);
            }
            builder.put(object, builder2.build());
            i2 += i4;
        }
        try {
            ImmutableMultimap.FieldSettersHolder.MAP_FIELD_SETTER.set((Serialization.FieldSetter<? super ImmutableMultimap<?, ?>>) this, (Object) builder.buildOrThrow());
            ImmutableMultimap.FieldSettersHolder.SIZE_FIELD_SETTER.set((Serialization.FieldSetter<? super ImmutableMultimap<?, ?>>) this, i2);
        } catch (IllegalArgumentException e) {
            throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
        }
    }

    public static <T, K, V> Collector<T, ?, ImmutableListMultimap<K, V>> toImmutableListMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        return CollectCollectors.toImmutableListMultimap(function, function2);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Serialization.writeMultimap(this, objectOutputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ ImmutableCollection get(Object obj) {
        return get((ImmutableListMultimap<K, V>) obj);
    }

    @Override // com.google.common.collect.ImmutableMultimap
    public ImmutableListMultimap<V, K> inverse() {
        ImmutableListMultimap<V, K> immutableListMultimap = this.inverse;
        if (immutableListMultimap != null) {
            return immutableListMultimap;
        }
        ImmutableListMultimap<V, K> immutableListMultimapInvert = invert();
        this.inverse = immutableListMultimapInvert;
        return immutableListMultimapInvert;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @Deprecated
    public /* bridge */ /* synthetic */ ImmutableCollection replaceValues(Object obj, Iterable iterable) {
        return replaceValues((ImmutableListMultimap<K, V>) obj, iterable);
    }

    public static <K, V> ImmutableListMultimap<K, V> of(K k, V v) {
        Builder builder = builder();
        builder.put((Builder) k, (K) v);
        return builder.build();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap
    public ImmutableList<V> get(K k) {
        ImmutableList<V> immutableList = (ImmutableList) this.map.get(k);
        return immutableList == null ? ImmutableList.of() : immutableList;
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap
    @Deprecated
    public final ImmutableList<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @Deprecated
    public final ImmutableList<V> replaceValues(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @Deprecated
    public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues((ImmutableListMultimap<K, V>) obj, iterable);
    }

    public static <K, V> ImmutableListMultimap<K, V> of(K k, V v, K k2, V v2) {
        Builder builder = builder();
        builder.put((Builder) k, (K) v);
        builder.put((Builder) k2, (K) v2);
        return builder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ Collection get(Object obj) {
        return get((ImmutableListMultimap<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @Deprecated
    public /* bridge */ /* synthetic */ List replaceValues(Object obj, Iterable iterable) {
        return replaceValues((ImmutableListMultimap<K, V>) obj, iterable);
    }

    public static <K, V> ImmutableListMultimap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        Builder builder = new Builder();
        builder.putAll((Iterable) iterable);
        return builder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ List get(Object obj) {
        return get((ImmutableListMultimap<K, V>) obj);
    }

    public static <K, V> ImmutableListMultimap<K, V> of(K k, V v, K k2, V v2, K k3, V v3) {
        Builder builder = builder();
        builder.put((Builder) k, (K) v);
        builder.put((Builder) k2, (K) v2);
        builder.put((Builder) k3, (K) v3);
        return builder.build();
    }

    public static <K, V> ImmutableListMultimap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        Builder builder = builder();
        builder.put((Builder) k, (K) v);
        builder.put((Builder) k2, (K) v2);
        builder.put((Builder) k3, (K) v3);
        builder.put((Builder) k4, (K) v4);
        return builder.build();
    }

    public static <K, V> ImmutableListMultimap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        Builder builder = builder();
        builder.put((Builder) k, (K) v);
        builder.put((Builder) k2, (K) v2);
        builder.put((Builder) k3, (K) v3);
        builder.put((Builder) k4, (K) v4);
        builder.put((Builder) k5, (K) v5);
        return builder.build();
    }
}
