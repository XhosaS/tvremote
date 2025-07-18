package com.google.common.collect;

import com.google.common.collect.AbstractMapBasedMultimap;
import com.google.common.collect.AbstractMultimap;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.collect.Sets;
import defpackage.sij;
import defpackage.tsl;
import defpackage.tsv;
import defpackage.ttm;
import j$.util.DesugarCollections;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class Multimaps {

    /* compiled from: PG */
    final class AsMap<K, V> extends Maps.ViewCachingAbstractMap<K, Collection<V>> {
        private final Multimap<K, V> multimap;

        /* compiled from: PG */
        class EntrySet extends Maps.EntrySet<K, Collection<V>> {
            final /* synthetic */ AsMap this$0;

            public EntrySet(AsMap asMap) {
                asMap.getClass();
                this.this$0 = asMap;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                Set<K> setKeySet = this.this$0.multimap.keySet();
                final Multimap multimap = this.this$0.multimap;
                multimap.getClass();
                return Maps.asMapEntryIterator(setKeySet, new tsl() { // from class: com.google.common.collect.Multimaps$AsMap$EntrySet$$ExternalSyntheticLambda0
                    @Override // defpackage.tsl
                    public final Object apply(Object obj) {
                        return multimap.get(obj);
                    }
                });
            }

            @Override // com.google.common.collect.Maps.EntrySet
            public Map<K, Collection<V>> map() {
                return this.this$0;
            }

            @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                this.this$0.removeValuesForKey(entry.getKey());
                return true;
            }
        }

        public AsMap(Multimap<K, V> multimap) {
            multimap.getClass();
            this.multimap = multimap;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.multimap.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.multimap.containsKey(obj);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public Set<Map.Entry<K, Collection<V>>> createEntrySet() {
            return new EntrySet(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.multimap.isEmpty();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return this.multimap.keySet();
        }

        public void removeValuesForKey(Object obj) {
            this.multimap.keySet().remove(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.multimap.keySet().size();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> get(Object obj) {
            if (containsKey(obj)) {
                return this.multimap.get(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> remove(Object obj) {
            if (containsKey(obj)) {
                return this.multimap.removeAll(obj);
            }
            return null;
        }
    }

    /* compiled from: PG */
    class CustomListMultimap<K, V> extends AbstractListMultimap<K, V> {
        private static final long serialVersionUID = 0;
        transient ttm<? extends List<V>> factory;

        public CustomListMultimap(Map<K, Collection<V>> map, ttm<? extends List<V>> ttmVar) {
            super(map);
            ttmVar.getClass();
            this.factory = ttmVar;
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            Object object = objectInputStream.readObject();
            object.getClass();
            this.factory = (ttm) object;
            Object object2 = objectInputStream.readObject();
            object2.getClass();
            setMap((Map) object2);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.factory);
            objectOutputStream.writeObject(backingMap());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        public Map<K, Collection<V>> createAsMap() {
            return createMaybeNavigableAsMap();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        public Set<K> createKeySet() {
            return createMaybeNavigableKeySet();
        }

        @Override // com.google.common.collect.AbstractListMultimap, com.google.common.collect.AbstractMapBasedMultimap
        public List<V> createCollection() {
            return this.factory.get();
        }
    }

    /* compiled from: PG */
    class CustomMultimap<K, V> extends AbstractMapBasedMultimap<K, V> {
        private static final long serialVersionUID = 0;
        transient ttm<? extends Collection<V>> factory;

        public CustomMultimap(Map<K, Collection<V>> map, ttm<? extends Collection<V>> ttmVar) {
            super(map);
            ttmVar.getClass();
            this.factory = ttmVar;
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            Object object = objectInputStream.readObject();
            object.getClass();
            this.factory = (ttm) object;
            Object object2 = objectInputStream.readObject();
            object2.getClass();
            setMap((Map) object2);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.factory);
            objectOutputStream.writeObject(backingMap());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        public Map<K, Collection<V>> createAsMap() {
            return createMaybeNavigableAsMap();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap
        public Collection<V> createCollection() {
            return this.factory.get();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        public Set<K> createKeySet() {
            return createMaybeNavigableKeySet();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap
        public <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
            return collection instanceof NavigableSet ? Sets.unmodifiableNavigableSet((NavigableSet) collection) : collection instanceof SortedSet ? DesugarCollections.unmodifiableSortedSet((SortedSet) collection) : collection instanceof Set ? DesugarCollections.unmodifiableSet((Set) collection) : collection instanceof List ? DesugarCollections.unmodifiableList((List) collection) : DesugarCollections.unmodifiableCollection(collection);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap
        public Collection<V> wrapCollection(K k, Collection<V> collection) {
            return collection instanceof List ? wrapList(k, (List) collection, null) : collection instanceof NavigableSet ? new AbstractMapBasedMultimap.WrappedNavigableSet(this, k, (NavigableSet) collection, null) : collection instanceof SortedSet ? new AbstractMapBasedMultimap.WrappedSortedSet(this, k, (SortedSet) collection, null) : collection instanceof Set ? new AbstractMapBasedMultimap.WrappedSet(this, k, (Set) collection) : new AbstractMapBasedMultimap.WrappedCollection(this, k, collection, null);
        }
    }

    /* compiled from: PG */
    class CustomSetMultimap<K, V> extends AbstractSetMultimap<K, V> {
        private static final long serialVersionUID = 0;
        transient ttm<? extends Set<V>> factory;

        public CustomSetMultimap(Map<K, Collection<V>> map, ttm<? extends Set<V>> ttmVar) {
            super(map);
            ttmVar.getClass();
            this.factory = ttmVar;
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            Object object = objectInputStream.readObject();
            object.getClass();
            this.factory = (ttm) object;
            Object object2 = objectInputStream.readObject();
            object2.getClass();
            setMap((Map) object2);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.factory);
            objectOutputStream.writeObject(backingMap());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        public Map<K, Collection<V>> createAsMap() {
            return createMaybeNavigableAsMap();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        public Set<K> createKeySet() {
            return createMaybeNavigableKeySet();
        }

        @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        public <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
            return collection instanceof NavigableSet ? Sets.unmodifiableNavigableSet((NavigableSet) collection) : collection instanceof SortedSet ? DesugarCollections.unmodifiableSortedSet((SortedSet) collection) : DesugarCollections.unmodifiableSet((Set) collection);
        }

        @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        public Collection<V> wrapCollection(K k, Collection<V> collection) {
            return collection instanceof NavigableSet ? new AbstractMapBasedMultimap.WrappedNavigableSet(this, k, (NavigableSet) collection, null) : collection instanceof SortedSet ? new AbstractMapBasedMultimap.WrappedSortedSet(this, k, (SortedSet) collection, null) : new AbstractMapBasedMultimap.WrappedSet(this, k, (Set) collection);
        }

        @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        public Set<V> createCollection() {
            return this.factory.get();
        }
    }

    /* compiled from: PG */
    abstract class Entries<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            multimap().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return multimap().containsEntry(entry.getKey(), entry.getValue());
        }

        public abstract Multimap<K, V> multimap();

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return multimap().remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return multimap().size();
        }
    }

    /* compiled from: PG */
    class Keys<K, V> extends AbstractMultiset<K> {
        final Multimap<K, V> multimap;

        public Keys(Multimap<K, V> multimap) {
            this.multimap = multimap;
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.multimap.clear();
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public boolean contains(Object obj) {
            return this.multimap.containsKey(obj);
        }

        @Override // com.google.common.collect.Multiset
        public int count(Object obj) {
            Collection collection = (Collection) Maps.safeGet(this.multimap.asMap(), obj);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        @Override // com.google.common.collect.AbstractMultiset
        public int distinctElements() {
            return this.multimap.asMap().size();
        }

        @Override // com.google.common.collect.AbstractMultiset
        public Iterator<K> elementIterator() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public Set<K> elementSet() {
            return this.multimap.keySet();
        }

        @Override // com.google.common.collect.AbstractMultiset
        public Iterator<Multiset.Entry<K>> entryIterator() {
            return new TransformedIterator<Map.Entry<K, Collection<V>>, Multiset.Entry<K>>(this, this.multimap.asMap().entrySet().iterator()) { // from class: com.google.common.collect.Multimaps.Keys.1
                {
                    this.getClass();
                }

                @Override // com.google.common.collect.TransformedIterator
                public Multiset.Entry<K> transform(final Map.Entry<K, Collection<V>> entry) {
                    return new Multisets.AbstractEntry<K>(this) { // from class: com.google.common.collect.Multimaps.Keys.1.1
                        {
                            this.getClass();
                        }

                        @Override // com.google.common.collect.Multiset.Entry
                        public int getCount() {
                            return ((Collection) entry.getValue()).size();
                        }

                        @Override // com.google.common.collect.Multiset.Entry
                        public K getElement() {
                            return (K) entry.getKey();
                        }
                    };
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
        public Iterator<K> iterator() {
            return Maps.keyIterator(this.multimap.entries().iterator());
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public int remove(Object obj, int i) {
            CollectPreconditions.checkNonnegative(i, "occurrences");
            if (i == 0) {
                return count(obj);
            }
            Collection collection = (Collection) Maps.safeGet(this.multimap.asMap(), obj);
            if (collection == null) {
                return 0;
            }
            int size = collection.size();
            if (i >= size) {
                collection.clear();
                return size;
            }
            Iterator it = collection.iterator();
            for (int i2 = 0; i2 < i; i2++) {
                it.next();
                it.remove();
            }
            return size;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public int size() {
            return this.multimap.size();
        }
    }

    /* compiled from: PG */
    class MapMultimap<K, V> extends AbstractMultimap<K, V> implements SetMultimap<K, V>, Serializable {
        private static final long serialVersionUID = 7845222491160860175L;
        final Map<K, V> map;

        public MapMultimap(Map<K, V> map) {
            map.getClass();
            this.map = map;
        }

        @Override // com.google.common.collect.Multimap
        public void clear() {
            this.map.clear();
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean containsEntry(Object obj, Object obj2) {
            return this.map.entrySet().contains(Maps.immutableEntry(obj, obj2));
        }

        @Override // com.google.common.collect.Multimap
        public boolean containsKey(Object obj) {
            return this.map.containsKey(obj);
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean containsValue(Object obj) {
            return this.map.containsValue(obj);
        }

        @Override // com.google.common.collect.AbstractMultimap
        public Map<K, Collection<V>> createAsMap() {
            return new AsMap(this);
        }

        @Override // com.google.common.collect.AbstractMultimap
        public Collection<Map.Entry<K, V>> createEntries() {
            throw new AssertionError("unreachable");
        }

        @Override // com.google.common.collect.AbstractMultimap
        public Set<K> createKeySet() {
            return this.map.keySet();
        }

        @Override // com.google.common.collect.AbstractMultimap
        public Multiset<K> createKeys() {
            return new Keys(this);
        }

        @Override // com.google.common.collect.AbstractMultimap
        public Collection<V> createValues() {
            return this.map.values();
        }

        @Override // com.google.common.collect.AbstractMultimap
        public Iterator<Map.Entry<K, V>> entryIterator() {
            return this.map.entrySet().iterator();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Multimap
        public /* bridge */ /* synthetic */ Collection get(Object obj) {
            return get((MapMultimap<K, V>) obj);
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public int hashCode() {
            return this.map.hashCode();
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean put(K k, V v) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean putAll(Multimap<? extends K, ? extends V> multimap) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean remove(Object obj, Object obj2) {
            return this.map.entrySet().remove(Maps.immutableEntry(obj, obj2));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
            return replaceValues((MapMultimap<K, V>) obj, iterable);
        }

        @Override // com.google.common.collect.Multimap
        public int size() {
            return this.map.size();
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public Set<Map.Entry<K, V>> entries() {
            return this.map.entrySet();
        }

        @Override // com.google.common.collect.Multimap
        public Set<V> get(final K k) {
            return new Sets.ImprovedAbstractSet<V>(this) { // from class: com.google.common.collect.Multimaps.MapMultimap.1
                final /* synthetic */ MapMultimap this$0;

                {
                    this.getClass();
                    this.this$0 = this;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator<V> iterator() {
                    final Object obj = k;
                    return new Iterator<V>(this) { // from class: com.google.common.collect.Multimaps.MapMultimap.1.1
                        int i;
                        final /* synthetic */ AnonymousClass1 this$1;

                        {
                            this.getClass();
                            this.this$1 = this;
                        }

                        @Override // java.util.Iterator
                        public boolean hasNext() {
                            return this.i == 0 && this.this$1.this$0.map.containsKey(obj);
                        }

                        @Override // java.util.Iterator
                        public V next() {
                            if (!hasNext()) {
                                throw new NoSuchElementException();
                            }
                            this.i++;
                            return this.this$1.this$0.map.get(obj);
                        }

                        @Override // java.util.Iterator
                        public void remove() {
                            CollectPreconditions.checkRemove(this.i == 1);
                            this.i = -1;
                            this.this$1.this$0.map.remove(obj);
                        }
                    };
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public int size() {
                    return this.this$0.map.containsKey(k) ? 1 : 0;
                }
            };
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean putAll(K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimap
        public Set<V> removeAll(Object obj) {
            HashSet hashSet = new HashSet(2);
            if (!this.map.containsKey(obj)) {
                return hashSet;
            }
            hashSet.add(this.map.remove(obj));
            return hashSet;
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public Set<V> replaceValues(K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: PG */
    final class TransformedEntriesListMultimap<K, V1, V2> extends TransformedEntriesMultimap<K, V1, V2> implements ListMultimap<K, V2> {
        public TransformedEntriesListMultimap(ListMultimap<K, V1> listMultimap, Maps.EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
            super(listMultimap, entryTransformer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$transform$0(Object obj, Object obj2) {
            return this.transformer.transformEntry(obj, obj2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Multimaps.TransformedEntriesMultimap, com.google.common.collect.Multimap
        public /* bridge */ /* synthetic */ Collection get(Object obj) {
            return get((TransformedEntriesListMultimap<K, V1, V2>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Multimaps.TransformedEntriesMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
            return replaceValues((TransformedEntriesListMultimap<K, V1, V2>) obj, iterable);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Multimaps.TransformedEntriesMultimap
        public /* bridge */ /* synthetic */ Collection transform(Object obj, Collection collection) {
            return transform((TransformedEntriesListMultimap<K, V1, V2>) obj, collection);
        }

        @Override // com.google.common.collect.Multimaps.TransformedEntriesMultimap, com.google.common.collect.Multimap
        public List<V2> get(K k) {
            return transform((TransformedEntriesListMultimap<K, V1, V2>) k, (Collection) this.fromMultimap.get(k));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Multimaps.TransformedEntriesMultimap, com.google.common.collect.Multimap
        public List<V2> removeAll(Object obj) {
            return transform((TransformedEntriesListMultimap<K, V1, V2>) obj, (Collection) this.fromMultimap.removeAll(obj));
        }

        @Override // com.google.common.collect.Multimaps.TransformedEntriesMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public List<V2> replaceValues(K k, Iterable<? extends V2> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.TransformedEntriesMultimap
        public List<V2> transform(final K k, Collection<V1> collection) {
            return Lists.transform((List) collection, new tsl() { // from class: com.google.common.collect.Multimaps$TransformedEntriesListMultimap$$ExternalSyntheticLambda0
                @Override // defpackage.tsl
                public final Object apply(Object obj) {
                    return this.f$0.lambda$transform$0(k, obj);
                }
            });
        }
    }

    /* compiled from: PG */
    class TransformedEntriesMultimap<K, V1, V2> extends AbstractMultimap<K, V2> {
        final Multimap<K, V1> fromMultimap;
        final Maps.EntryTransformer<? super K, ? super V1, V2> transformer;

        public TransformedEntriesMultimap(Multimap<K, V1> multimap, Maps.EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
            multimap.getClass();
            this.fromMultimap = multimap;
            entryTransformer.getClass();
            this.transformer = entryTransformer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$createValues$0(Map.Entry entry) {
            return this.transformer.transformEntry((Object) entry.getKey(), (Object) entry.getValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$transform$0(Object obj, Object obj2) {
            return this.transformer.transformEntry(obj, obj2);
        }

        @Override // com.google.common.collect.Multimap
        public void clear() {
            this.fromMultimap.clear();
        }

        @Override // com.google.common.collect.Multimap
        public boolean containsKey(Object obj) {
            return this.fromMultimap.containsKey(obj);
        }

        @Override // com.google.common.collect.AbstractMultimap
        public Map<K, Collection<V2>> createAsMap() {
            return Maps.transformEntries(this.fromMultimap.asMap(), new Maps.EntryTransformer() { // from class: com.google.common.collect.Multimaps$TransformedEntriesMultimap$$ExternalSyntheticLambda1
                @Override // com.google.common.collect.Maps.EntryTransformer
                public final Object transformEntry(Object obj, Object obj2) {
                    return this.f$0.transform(obj, (Collection) obj2);
                }
            });
        }

        @Override // com.google.common.collect.AbstractMultimap
        public Collection<Map.Entry<K, V2>> createEntries() {
            return new AbstractMultimap.Entries(this);
        }

        @Override // com.google.common.collect.AbstractMultimap
        public Set<K> createKeySet() {
            return this.fromMultimap.keySet();
        }

        @Override // com.google.common.collect.AbstractMultimap
        public Multiset<K> createKeys() {
            return this.fromMultimap.keys();
        }

        @Override // com.google.common.collect.AbstractMultimap
        public Collection<V2> createValues() {
            return Collections2.transform(this.fromMultimap.entries(), new tsl() { // from class: com.google.common.collect.Multimaps$TransformedEntriesMultimap$$ExternalSyntheticLambda0
                @Override // defpackage.tsl
                public final Object apply(Object obj) {
                    return this.f$0.lambda$createValues$0((Map.Entry) obj);
                }
            });
        }

        @Override // com.google.common.collect.AbstractMultimap
        public Iterator<Map.Entry<K, V2>> entryIterator() {
            return Iterators.transform(this.fromMultimap.entries().iterator(), Maps.asEntryToEntryFunction(this.transformer));
        }

        @Override // com.google.common.collect.Multimap
        public Collection<V2> get(K k) {
            return transform(k, this.fromMultimap.get(k));
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean isEmpty() {
            return this.fromMultimap.isEmpty();
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean put(K k, V2 v2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean putAll(Multimap<? extends K, ? extends V2> multimap) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean remove(Object obj, Object obj2) {
            return get(obj).remove(obj2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Multimap
        public Collection<V2> removeAll(Object obj) {
            return transform(obj, this.fromMultimap.removeAll(obj));
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public Collection<V2> replaceValues(K k, Iterable<? extends V2> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimap
        public int size() {
            return this.fromMultimap.size();
        }

        public Collection<V2> transform(final K k, Collection<V1> collection) {
            tsl tslVar = new tsl() { // from class: com.google.common.collect.Multimaps$TransformedEntriesMultimap$$ExternalSyntheticLambda2
                @Override // defpackage.tsl
                public final Object apply(Object obj) {
                    return this.f$0.lambda$transform$0(k, obj);
                }
            };
            return collection instanceof List ? Lists.transform((List) collection, tslVar) : Collections2.transform(collection, tslVar);
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean putAll(K k, Iterable<? extends V2> iterable) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: PG */
    class UnmodifiableListMultimap<K, V> extends UnmodifiableMultimap<K, V> implements ListMultimap<K, V> {
        private static final long serialVersionUID = 0;

        public UnmodifiableListMultimap(ListMultimap<K, V> listMultimap) {
            super(listMultimap);
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
        public ListMultimap<K, V> delegate() {
            return (ListMultimap) super.delegate();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public /* bridge */ /* synthetic */ Collection get(Object obj) {
            return get((UnmodifiableListMultimap<K, V>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
            return replaceValues((UnmodifiableListMultimap<K, V>) obj, iterable);
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public List<V> get(K k) {
            return DesugarCollections.unmodifiableList(delegate().get((ListMultimap<K, V>) k));
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public List<V> removeAll(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public List<V> replaceValues(K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: PG */
    class UnmodifiableMultimap<K, V> extends ForwardingMultimap<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        final Multimap<K, V> delegate;
        transient Collection<Map.Entry<K, V>> entries;
        transient Set<K> keySet;
        transient Multiset<K> keys;
        transient Map<K, Collection<V>> map;
        transient Collection<V> values;

        public UnmodifiableMultimap(Multimap<K, V> multimap) {
            multimap.getClass();
            this.delegate = multimap;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Map<K, Collection<V>> asMap() {
            Map<K, Collection<V>> map = this.map;
            if (map != null) {
                return map;
            }
            Map<K, Collection<V>> mapUnmodifiableMap = DesugarCollections.unmodifiableMap(Maps.transformValues(this.delegate.asMap(), new tsl() { // from class: com.google.common.collect.Multimaps$UnmodifiableMultimap$$ExternalSyntheticLambda0
                @Override // defpackage.tsl
                public final Object apply(Object obj) {
                    return Multimaps.unmodifiableValueCollection((Collection) obj);
                }
            }));
            this.map = mapUnmodifiableMap;
            return mapUnmodifiableMap;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public void clear() {
            throw new UnsupportedOperationException();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
        public Multimap<K, V> delegate() {
            return this.delegate;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public Collection<Map.Entry<K, V>> entries() {
            Collection<Map.Entry<K, V>> collection = this.entries;
            if (collection != null) {
                return collection;
            }
            Collection<Map.Entry<K, V>> collectionUnmodifiableEntries = Multimaps.unmodifiableEntries(this.delegate.entries());
            this.entries = collectionUnmodifiableEntries;
            return collectionUnmodifiableEntries;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public Collection<V> get(K k) {
            return Multimaps.unmodifiableValueCollection(this.delegate.get(k));
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public Set<K> keySet() {
            Set<K> set = this.keySet;
            if (set != null) {
                return set;
            }
            Set<K> setUnmodifiableSet = DesugarCollections.unmodifiableSet(this.delegate.keySet());
            this.keySet = setUnmodifiableSet;
            return setUnmodifiableSet;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public Multiset<K> keys() {
            Multiset<K> multiset = this.keys;
            if (multiset != null) {
                return multiset;
            }
            Multiset<K> multisetUnmodifiableMultiset = Multisets.unmodifiableMultiset(this.delegate.keys());
            this.keys = multisetUnmodifiableMultiset;
            return multisetUnmodifiableMultiset;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public boolean put(K k, V v) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public boolean putAll(Multimap<? extends K, ? extends V> multimap) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public boolean remove(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public Collection<V> removeAll(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public Collection<V> replaceValues(K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public Collection<V> values() {
            Collection<V> collection = this.values;
            if (collection != null) {
                return collection;
            }
            Collection<V> collectionUnmodifiableCollection = DesugarCollections.unmodifiableCollection(this.delegate.values());
            this.values = collectionUnmodifiableCollection;
            return collectionUnmodifiableCollection;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public boolean putAll(K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: PG */
    class UnmodifiableSetMultimap<K, V> extends UnmodifiableMultimap<K, V> implements SetMultimap<K, V> {
        private static final long serialVersionUID = 0;

        public UnmodifiableSetMultimap(SetMultimap<K, V> setMultimap) {
            super(setMultimap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public /* bridge */ /* synthetic */ Collection get(Object obj) {
            return get((UnmodifiableSetMultimap<K, V>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
            return replaceValues((UnmodifiableSetMultimap<K, V>) obj, iterable);
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
        public SetMultimap<K, V> delegate() {
            return (SetMultimap) super.delegate();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public Set<Map.Entry<K, V>> entries() {
            return Maps.unmodifiableEntrySet(delegate().entries());
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public Set<V> get(K k) {
            return DesugarCollections.unmodifiableSet(delegate().get((SetMultimap<K, V>) k));
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public Set<V> removeAll(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public Set<V> replaceValues(K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: PG */
    class UnmodifiableSortedSetMultimap<K, V> extends UnmodifiableSetMultimap<K, V> implements SortedSetMultimap<K, V> {
        private static final long serialVersionUID = 0;

        public UnmodifiableSortedSetMultimap(SortedSetMultimap<K, V> sortedSetMultimap) {
            super(sortedSetMultimap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public /* bridge */ /* synthetic */ Collection get(Object obj) {
            return get((UnmodifiableSortedSetMultimap<K, V>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
            return replaceValues((UnmodifiableSortedSetMultimap<K, V>) obj, iterable);
        }

        @Override // com.google.common.collect.SortedSetMultimap
        public Comparator<? super V> valueComparator() {
            return delegate().valueComparator();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public /* bridge */ /* synthetic */ Set get(Object obj) {
            return get((UnmodifiableSortedSetMultimap<K, V>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public /* bridge */ /* synthetic */ Set replaceValues(Object obj, Iterable iterable) {
            return replaceValues((UnmodifiableSortedSetMultimap<K, V>) obj, iterable);
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
        public SortedSetMultimap<K, V> delegate() {
            return (SortedSetMultimap) super.delegate();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public SortedSet<V> get(K k) {
            return DesugarCollections.unmodifiableSortedSet(delegate().get((SortedSetMultimap<K, V>) k));
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public SortedSet<V> removeAll(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public SortedSet<V> replaceValues(K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }
    }

    private Multimaps() {
    }

    public static <K, V> Map<K, List<V>> asMap(ListMultimap<K, V> listMultimap) {
        return listMultimap.asMap();
    }

    static boolean equalsImpl(Multimap<?, ?> multimap, Object obj) {
        if (obj == multimap) {
            return true;
        }
        if (obj instanceof Multimap) {
            return multimap.asMap().equals(((Multimap) obj).asMap());
        }
        return false;
    }

    public static <K, V> Multimap<K, V> filterEntries(Multimap<K, V> multimap, tsv<? super Map.Entry<K, V>> tsvVar) {
        tsvVar.getClass();
        if (multimap instanceof SetMultimap) {
            return filterEntries((SetMultimap) multimap, (tsv) tsvVar);
        }
        if (multimap instanceof FilteredMultimap) {
            return filterFiltered((FilteredMultimap) multimap, tsvVar);
        }
        multimap.getClass();
        return new FilteredEntryMultimap(multimap, tsvVar);
    }

    private static <K, V> Multimap<K, V> filterFiltered(FilteredMultimap<K, V> filteredMultimap, tsv<? super Map.Entry<K, V>> tsvVar) {
        return new FilteredEntryMultimap(filteredMultimap.unfiltered(), sij.n(filteredMultimap.entryPredicate(), tsvVar));
    }

    public static <K, V> ListMultimap<K, V> filterKeys(ListMultimap<K, V> listMultimap, tsv<? super K> tsvVar) {
        if (!(listMultimap instanceof FilteredKeyListMultimap)) {
            return new FilteredKeyListMultimap(listMultimap, tsvVar);
        }
        FilteredKeyListMultimap filteredKeyListMultimap = (FilteredKeyListMultimap) listMultimap;
        return new FilteredKeyListMultimap(filteredKeyListMultimap.unfiltered(), sij.n(filteredKeyListMultimap.keyPredicate, tsvVar));
    }

    public static <K, V> Multimap<K, V> filterValues(Multimap<K, V> multimap, tsv<? super V> tsvVar) {
        return filterEntries(multimap, Maps.valuePredicateOnEntries(tsvVar));
    }

    public static <T, K, V, M extends Multimap<K, V>> Collector<T, ?, M> flatteningToMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends Stream<? extends V>> function2, Supplier<M> supplier) {
        return CollectCollectors.flatteningToMultimap(function, function2, supplier);
    }

    public static <K, V> SetMultimap<K, V> forMap(Map<K, V> map) {
        return new MapMultimap(map);
    }

    public static <K, V> ImmutableListMultimap<K, V> index(Iterable<V> iterable, tsl<? super V, K> tslVar) {
        return index(iterable.iterator(), tslVar);
    }

    public static <K, V, M extends Multimap<K, V>> M invertFrom(Multimap<? extends V, ? extends K> multimap, M m) {
        m.getClass();
        for (Map.Entry<? extends V, ? extends K> entry : multimap.entries()) {
            m.put(entry.getValue(), entry.getKey());
        }
        return m;
    }

    public static <K, V> ListMultimap<K, V> newListMultimap(Map<K, Collection<V>> map, ttm<? extends List<V>> ttmVar) {
        return new CustomListMultimap(map, ttmVar);
    }

    public static <K, V> Multimap<K, V> newMultimap(Map<K, Collection<V>> map, ttm<? extends Collection<V>> ttmVar) {
        return new CustomMultimap(map, ttmVar);
    }

    public static <K, V> SetMultimap<K, V> newSetMultimap(Map<K, Collection<V>> map, ttm<? extends Set<V>> ttmVar) {
        return new CustomSetMultimap(map, ttmVar);
    }

    public static <K, V> SortedSetMultimap<K, V> newSortedSetMultimap(Map<K, Collection<V>> map, ttm<? extends SortedSet<V>> ttmVar) {
        return new CustomSortedSetMultimap(map, ttmVar);
    }

    public static <K, V> ListMultimap<K, V> synchronizedListMultimap(ListMultimap<K, V> listMultimap) {
        return Synchronized.listMultimap(listMultimap, null);
    }

    public static <K, V> Multimap<K, V> synchronizedMultimap(Multimap<K, V> multimap) {
        return Synchronized.multimap(multimap, null);
    }

    public static <K, V> SetMultimap<K, V> synchronizedSetMultimap(SetMultimap<K, V> setMultimap) {
        return Synchronized.setMultimap(setMultimap, null);
    }

    public static <K, V> SortedSetMultimap<K, V> synchronizedSortedSetMultimap(SortedSetMultimap<K, V> sortedSetMultimap) {
        return Synchronized.sortedSetMultimap(sortedSetMultimap, null);
    }

    public static <T, K, V, M extends Multimap<K, V>> Collector<T, ?, M> toMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, Supplier<M> supplier) {
        return CollectCollectors.toMultimap(function, function2, supplier);
    }

    public static <K, V1, V2> ListMultimap<K, V2> transformEntries(ListMultimap<K, V1> listMultimap, Maps.EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        return new TransformedEntriesListMultimap(listMultimap, entryTransformer);
    }

    public static <K, V1, V2> ListMultimap<K, V2> transformValues(ListMultimap<K, V1> listMultimap, final tsl<? super V1, V2> tslVar) {
        tslVar.getClass();
        return transformEntries((ListMultimap) listMultimap, new Maps.EntryTransformer() { // from class: com.google.common.collect.Multimaps$$ExternalSyntheticLambda0
            @Override // com.google.common.collect.Maps.EntryTransformer
            public final Object transformEntry(Object obj, Object obj2) {
                return tslVar.apply(obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> Collection<Map.Entry<K, V>> unmodifiableEntries(Collection<Map.Entry<K, V>> collection) {
        return collection instanceof Set ? Maps.unmodifiableEntrySet((Set) collection) : new Maps.UnmodifiableEntries(DesugarCollections.unmodifiableCollection(collection));
    }

    @Deprecated
    public static <K, V> ListMultimap<K, V> unmodifiableListMultimap(ImmutableListMultimap<K, V> immutableListMultimap) {
        immutableListMultimap.getClass();
        return immutableListMultimap;
    }

    @Deprecated
    public static <K, V> Multimap<K, V> unmodifiableMultimap(ImmutableMultimap<K, V> immutableMultimap) {
        immutableMultimap.getClass();
        return immutableMultimap;
    }

    @Deprecated
    public static <K, V> SetMultimap<K, V> unmodifiableSetMultimap(ImmutableSetMultimap<K, V> immutableSetMultimap) {
        immutableSetMultimap.getClass();
        return immutableSetMultimap;
    }

    public static <K, V> SortedSetMultimap<K, V> unmodifiableSortedSetMultimap(SortedSetMultimap<K, V> sortedSetMultimap) {
        return sortedSetMultimap instanceof UnmodifiableSortedSetMultimap ? sortedSetMultimap : new UnmodifiableSortedSetMultimap(sortedSetMultimap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <V> Collection<V> unmodifiableValueCollection(Collection<V> collection) {
        return collection instanceof SortedSet ? DesugarCollections.unmodifiableSortedSet((SortedSet) collection) : collection instanceof Set ? DesugarCollections.unmodifiableSet((Set) collection) : collection instanceof List ? DesugarCollections.unmodifiableList((List) collection) : DesugarCollections.unmodifiableCollection(collection);
    }

    /* compiled from: PG */
    class CustomSortedSetMultimap<K, V> extends AbstractSortedSetMultimap<K, V> {
        private static final long serialVersionUID = 0;
        transient ttm<? extends SortedSet<V>> factory;
        transient Comparator<? super V> valueComparator;

        public CustomSortedSetMultimap(Map<K, Collection<V>> map, ttm<? extends SortedSet<V>> ttmVar) {
            super(map);
            ttmVar.getClass();
            this.factory = ttmVar;
            this.valueComparator = ttmVar.get().comparator();
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            Object object = objectInputStream.readObject();
            object.getClass();
            ttm<? extends SortedSet<V>> ttmVar = (ttm) object;
            this.factory = ttmVar;
            this.valueComparator = ttmVar.get().comparator();
            Object object2 = objectInputStream.readObject();
            object2.getClass();
            setMap((Map) object2);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.factory);
            objectOutputStream.writeObject(backingMap());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        public Map<K, Collection<V>> createAsMap() {
            return createMaybeNavigableAsMap();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        public Set<K> createKeySet() {
            return createMaybeNavigableKeySet();
        }

        @Override // com.google.common.collect.SortedSetMultimap
        public Comparator<? super V> valueComparator() {
            return this.valueComparator;
        }

        @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        public SortedSet<V> createCollection() {
            return this.factory.get();
        }
    }

    public static <K, V> Map<K, Collection<V>> asMap(Multimap<K, V> multimap) {
        return multimap.asMap();
    }

    public static <K, V> SetMultimap<K, V> filterValues(SetMultimap<K, V> setMultimap, tsv<? super V> tsvVar) {
        return filterEntries((SetMultimap) setMultimap, Maps.valuePredicateOnEntries(tsvVar));
    }

    public static <K, V> ImmutableListMultimap<K, V> index(Iterator<V> it, tsl<? super V, K> tslVar) {
        tslVar.getClass();
        ImmutableListMultimap.Builder builder = ImmutableListMultimap.builder();
        while (it.hasNext()) {
            V next = it.next();
            next.getClass();
            builder.put((ImmutableListMultimap.Builder) tslVar.apply(next), (K) next);
        }
        return builder.build();
    }

    public static <K, V1, V2> Multimap<K, V2> transformEntries(Multimap<K, V1> multimap, Maps.EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        return new TransformedEntriesMultimap(multimap, entryTransformer);
    }

    public static <K, V> ListMultimap<K, V> unmodifiableListMultimap(ListMultimap<K, V> listMultimap) {
        return ((listMultimap instanceof UnmodifiableListMultimap) || (listMultimap instanceof ImmutableListMultimap)) ? listMultimap : new UnmodifiableListMultimap(listMultimap);
    }

    public static <K, V> Multimap<K, V> unmodifiableMultimap(Multimap<K, V> multimap) {
        return ((multimap instanceof UnmodifiableMultimap) || (multimap instanceof ImmutableMultimap)) ? multimap : new UnmodifiableMultimap(multimap);
    }

    public static <K, V> SetMultimap<K, V> unmodifiableSetMultimap(SetMultimap<K, V> setMultimap) {
        return ((setMultimap instanceof UnmodifiableSetMultimap) || (setMultimap instanceof ImmutableSetMultimap)) ? setMultimap : new UnmodifiableSetMultimap(setMultimap);
    }

    public static <K, V> Map<K, Set<V>> asMap(SetMultimap<K, V> setMultimap) {
        return setMultimap.asMap();
    }

    private static <K, V> SetMultimap<K, V> filterFiltered(FilteredSetMultimap<K, V> filteredSetMultimap, tsv<? super Map.Entry<K, V>> tsvVar) {
        return new FilteredEntrySetMultimap(filteredSetMultimap.unfiltered(), sij.n(filteredSetMultimap.entryPredicate(), tsvVar));
    }

    public static <K, V1, V2> Multimap<K, V2> transformValues(Multimap<K, V1> multimap, final tsl<? super V1, V2> tslVar) {
        tslVar.getClass();
        return transformEntries(multimap, new Maps.EntryTransformer() { // from class: com.google.common.collect.Multimaps$$ExternalSyntheticLambda1
            @Override // com.google.common.collect.Maps.EntryTransformer
            public final Object transformEntry(Object obj, Object obj2) {
                return tslVar.apply(obj2);
            }
        });
    }

    public static <K, V> Map<K, SortedSet<V>> asMap(SortedSetMultimap<K, V> sortedSetMultimap) {
        return sortedSetMultimap.asMap();
    }

    public static <K, V> Multimap<K, V> filterKeys(Multimap<K, V> multimap, tsv<? super K> tsvVar) {
        if (multimap instanceof SetMultimap) {
            return filterKeys((SetMultimap) multimap, (tsv) tsvVar);
        }
        if (multimap instanceof ListMultimap) {
            return filterKeys((ListMultimap) multimap, (tsv) tsvVar);
        }
        if (multimap instanceof FilteredKeyMultimap) {
            FilteredKeyMultimap filteredKeyMultimap = (FilteredKeyMultimap) multimap;
            return new FilteredKeyMultimap(filteredKeyMultimap.unfiltered, sij.n(filteredKeyMultimap.keyPredicate, tsvVar));
        }
        if (multimap instanceof FilteredMultimap) {
            return filterFiltered((FilteredMultimap) multimap, Maps.keyPredicateOnEntries(tsvVar));
        }
        return new FilteredKeyMultimap(multimap, tsvVar);
    }

    public static <K, V> SetMultimap<K, V> filterEntries(SetMultimap<K, V> setMultimap, tsv<? super Map.Entry<K, V>> tsvVar) {
        tsvVar.getClass();
        if (setMultimap instanceof FilteredSetMultimap) {
            return filterFiltered((FilteredSetMultimap) setMultimap, (tsv) tsvVar);
        }
        setMultimap.getClass();
        return new FilteredEntrySetMultimap(setMultimap, tsvVar);
    }

    public static <K, V> SetMultimap<K, V> filterKeys(SetMultimap<K, V> setMultimap, tsv<? super K> tsvVar) {
        if (setMultimap instanceof FilteredKeySetMultimap) {
            FilteredKeySetMultimap filteredKeySetMultimap = (FilteredKeySetMultimap) setMultimap;
            return new FilteredKeySetMultimap(filteredKeySetMultimap.unfiltered(), sij.n(filteredKeySetMultimap.keyPredicate, tsvVar));
        }
        if (setMultimap instanceof FilteredSetMultimap) {
            return filterFiltered((FilteredSetMultimap) setMultimap, Maps.keyPredicateOnEntries(tsvVar));
        }
        return new FilteredKeySetMultimap(setMultimap, tsvVar);
    }
}
