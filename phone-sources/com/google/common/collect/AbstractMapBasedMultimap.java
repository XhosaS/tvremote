package com.google.common.collect;

import com.google.common.collect.AbstractMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimaps;
import defpackage.a;
import defpackage.sij;
import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class AbstractMapBasedMultimap<K, V> extends AbstractMultimap<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    private transient Map<K, Collection<V>> map;
    private transient int totalSize;

    /* compiled from: PG */
    class AsMap extends Maps.ViewCachingAbstractMap<K, Collection<V>> {
        final transient Map<K, Collection<V>> submap;
        final /* synthetic */ AbstractMapBasedMultimap this$0;

        /* compiled from: PG */
        class AsMapEntries extends Maps.EntrySet<K, Collection<V>> {
            final /* synthetic */ AsMap this$1;

            public AsMapEntries(AsMap asMap) {
                asMap.getClass();
                this.this$1 = asMap;
            }

            @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return Collections2.safeContains(this.this$1.submap.entrySet(), obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new AsMapIterator(this.this$1);
            }

            @Override // com.google.common.collect.Maps.EntrySet
            public Map<K, Collection<V>> map() {
                return this.this$1;
            }

            @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                this.this$1.this$0.removeValuesForKey(entry.getKey());
                return true;
            }
        }

        /* compiled from: PG */
        class AsMapIterator implements Iterator<Map.Entry<K, Collection<V>>> {
            Collection<V> collection;
            final Iterator<Map.Entry<K, Collection<V>>> delegateIterator;
            final /* synthetic */ AsMap this$1;

            public AsMapIterator(AsMap asMap) {
                asMap.getClass();
                this.this$1 = asMap;
                this.delegateIterator = asMap.submap.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.delegateIterator.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                sij.x(this.collection != null, "no calls to next() since the last call to remove()");
                this.delegateIterator.remove();
                this.this$1.this$0.totalSize -= this.collection.size();
                this.collection.clear();
                this.collection = null;
            }

            @Override // java.util.Iterator
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry<K, Collection<V>> next = this.delegateIterator.next();
                this.collection = next.getValue();
                return this.this$1.wrapEntry(next);
            }
        }

        public AsMap(AbstractMapBasedMultimap abstractMapBasedMultimap, Map<K, Collection<V>> map) {
            abstractMapBasedMultimap.getClass();
            this.this$0 = abstractMapBasedMultimap;
            this.submap = map;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.submap == this.this$0.map) {
                this.this$0.clear();
            } else {
                Iterators.clear(new AsMapIterator(this));
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return Maps.safeContainsKey(this.submap, obj);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public Set<Map.Entry<K, Collection<V>>> createEntrySet() {
            return new AsMapEntries(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.submap.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.submap.hashCode();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return this.this$0.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.submap.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.submap.toString();
        }

        public Map.Entry<K, Collection<V>> wrapEntry(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return Maps.immutableEntry(key, this.this$0.wrapCollection(key, entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> get(Object obj) {
            Collection<V> collection = (Collection) Maps.safeGet(this.submap, obj);
            if (collection == null) {
                return null;
            }
            return this.this$0.wrapCollection(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> remove(Object obj) {
            Collection<V> collectionRemove = this.submap.remove(obj);
            if (collectionRemove == null) {
                return null;
            }
            Collection<V> collectionCreateCollection = this.this$0.createCollection();
            collectionCreateCollection.addAll(collectionRemove);
            this.this$0.totalSize -= collectionRemove.size();
            collectionRemove.clear();
            return collectionCreateCollection;
        }
    }

    /* compiled from: PG */
    abstract class Itr<T> implements Iterator<T> {
        Collection<V> collection;
        K key;
        final Iterator<Map.Entry<K, Collection<V>>> keyIterator;
        final /* synthetic */ AbstractMapBasedMultimap this$0;
        Iterator<V> valueIterator;

        public Itr(AbstractMapBasedMultimap abstractMapBasedMultimap) {
            abstractMapBasedMultimap.getClass();
            this.this$0 = abstractMapBasedMultimap;
            this.keyIterator = abstractMapBasedMultimap.map.entrySet().iterator();
            this.key = null;
            this.collection = null;
            this.valueIterator = Iterators.emptyModifiableIterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.keyIterator.hasNext() || this.valueIterator.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.valueIterator.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.keyIterator.next();
                this.key = next.getKey();
                Collection<V> value = next.getValue();
                this.collection = value;
                this.valueIterator = value.iterator();
            }
            return output(this.key, this.valueIterator.next());
        }

        public abstract T output(K k, V v);

        @Override // java.util.Iterator
        public void remove() {
            this.valueIterator.remove();
            Collection<V> collection = this.collection;
            collection.getClass();
            if (collection.isEmpty()) {
                this.keyIterator.remove();
            }
            AbstractMapBasedMultimap abstractMapBasedMultimap = this.this$0;
            abstractMapBasedMultimap.totalSize--;
        }
    }

    /* compiled from: PG */
    class KeySet extends Maps.KeySet<K, Collection<V>> {
        final /* synthetic */ AbstractMapBasedMultimap this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KeySet(AbstractMapBasedMultimap abstractMapBasedMultimap, Map<K, Collection<V>> map) {
            super(map);
            abstractMapBasedMultimap.getClass();
            this.this$0 = abstractMapBasedMultimap;
        }

        @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            Iterators.clear(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return map().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return this == obj || map().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return map().keySet().hashCode();
        }

        @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            final Iterator<Map.Entry<K, Collection<V>>> it = map().entrySet().iterator();
            return new Iterator<K>(this) { // from class: com.google.common.collect.AbstractMapBasedMultimap.KeySet.1
                Map.Entry<K, Collection<V>> entry;
                final /* synthetic */ KeySet this$1;

                {
                    this.getClass();
                    this.this$1 = this;
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return it.hasNext();
                }

                @Override // java.util.Iterator
                public K next() {
                    Map.Entry<K, Collection<V>> entry = (Map.Entry) it.next();
                    this.entry = entry;
                    return entry.getKey();
                }

                @Override // java.util.Iterator
                public void remove() {
                    sij.x(this.entry != null, "no calls to next() since the last call to remove()");
                    Collection<V> value = this.entry.getValue();
                    it.remove();
                    this.this$1.this$0.totalSize -= value.size();
                    value.clear();
                    this.entry = null;
                }
            };
        }

        @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Collection<V> collectionRemove = map().remove(obj);
            if (collectionRemove == null) {
                return false;
            }
            int size = collectionRemove.size();
            collectionRemove.clear();
            this.this$0.totalSize -= size;
            return size > 0;
        }
    }

    /* compiled from: PG */
    final class NavigableAsMap extends AbstractMapBasedMultimap<K, V>.SortedAsMap implements NavigableMap<K, Collection<V>> {
        final /* synthetic */ AbstractMapBasedMultimap this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigableAsMap(AbstractMapBasedMultimap abstractMapBasedMultimap, NavigableMap<K, Collection<V>> navigableMap) {
            super(abstractMapBasedMultimap, navigableMap);
            abstractMapBasedMultimap.getClass();
            this.this$0 = abstractMapBasedMultimap;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> ceilingEntry(K k) {
            Map.Entry<K, Collection<V>> entryCeilingEntry = sortedMap().ceilingEntry(k);
            if (entryCeilingEntry == null) {
                return null;
            }
            return wrapEntry(entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k) {
            return sortedMap().ceilingKey(k);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, com.google.common.collect.Maps.ViewCachingAbstractMap
        public NavigableSet<K> createKeySet() {
            return new NavigableKeySet(this.this$0, sortedMap());
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> descendingMap() {
            return new NavigableAsMap(this.this$0, sortedMap().descendingMap());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> entryFirstEntry = sortedMap().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return wrapEntry(entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> floorEntry(K k) {
            Map.Entry<K, Collection<V>> entryFloorEntry = sortedMap().floorEntry(k);
            if (entryFloorEntry == null) {
                return null;
            }
            return wrapEntry(entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k) {
            return sortedMap().floorKey(k);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(K k) {
            return headMap(k, false);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> higherEntry(K k) {
            Map.Entry<K, Collection<V>> entryHigherEntry = sortedMap().higherEntry(k);
            if (entryHigherEntry == null) {
                return null;
            }
            return wrapEntry(entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k) {
            return sortedMap().higherKey(k);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, com.google.common.collect.AbstractMapBasedMultimap.AsMap, com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public NavigableSet<K> keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> entryLastEntry = sortedMap().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return wrapEntry(entryLastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lowerEntry(K k) {
            Map.Entry<K, Collection<V>> entryLowerEntry = sortedMap().lowerEntry(k);
            if (entryLowerEntry == null) {
                return null;
            }
            return wrapEntry(entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k) {
            return sortedMap().lowerKey(k);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return keySet();
        }

        public Map.Entry<K, Collection<V>> pollAsMapEntry(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it.next();
            Collection<V> collectionCreateCollection = this.this$0.createCollection();
            collectionCreateCollection.addAll(next.getValue());
            it.remove();
            return Maps.immutableEntry(next.getKey(), this.this$0.unmodifiableCollectionSubclass(collectionCreateCollection));
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return pollAsMapEntry(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return pollAsMapEntry(descendingMap().entrySet().iterator());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap
        public NavigableMap<K, Collection<V>> sortedMap() {
            return (NavigableMap) super.sortedMap();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(K k, K k2) {
            return subMap(k, true, k2, false);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(K k) {
            return tailMap(k, true);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public /* bridge */ /* synthetic */ SortedMap headMap(Object obj) {
            return headMap((NavigableAsMap) obj);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public /* bridge */ /* synthetic */ SortedMap tailMap(Object obj) {
            return tailMap((NavigableAsMap) obj);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(K k, boolean z) {
            return new NavigableAsMap(this.this$0, sortedMap().headMap(k, z));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(K k, boolean z, K k2, boolean z2) {
            return new NavigableAsMap(this.this$0, sortedMap().subMap(k, z, k2, z2));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(K k, boolean z) {
            return new NavigableAsMap(this.this$0, sortedMap().tailMap(k, z));
        }
    }

    /* compiled from: PG */
    final class NavigableKeySet extends AbstractMapBasedMultimap<K, V>.SortedKeySet implements NavigableSet<K> {
        final /* synthetic */ AbstractMapBasedMultimap this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigableKeySet(AbstractMapBasedMultimap abstractMapBasedMultimap, NavigableMap<K, Collection<V>> navigableMap) {
            super(abstractMapBasedMultimap, navigableMap);
            abstractMapBasedMultimap.getClass();
            this.this$0 = abstractMapBasedMultimap;
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k) {
            return sortedMap().ceilingKey(k);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return new NavigableKeySet(this.this$0, sortedMap().descendingMap());
        }

        @Override // java.util.NavigableSet
        public K floor(K k) {
            return sortedMap().floorKey(k);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public NavigableSet<K> headSet(K k) {
            return headSet(k, false);
        }

        @Override // java.util.NavigableSet
        public K higher(K k) {
            return sortedMap().higherKey(k);
        }

        @Override // java.util.NavigableSet
        public K lower(K k) {
            return sortedMap().lowerKey(k);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) Iterators.pollNext(iterator());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) Iterators.pollNext(descendingIterator());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet
        public NavigableMap<K, Collection<V>> sortedMap() {
            return (NavigableMap) super.sortedMap();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public NavigableSet<K> subSet(K k, K k2) {
            return subSet(k, true, k2, false);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public NavigableSet<K> tailSet(K k) {
            return tailSet(k, true);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public /* bridge */ /* synthetic */ SortedSet headSet(Object obj) {
            return headSet((NavigableKeySet) obj);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public /* bridge */ /* synthetic */ SortedSet tailSet(Object obj) {
            return tailSet((NavigableKeySet) obj);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k, boolean z) {
            return new NavigableKeySet(this.this$0, sortedMap().headMap(k, z));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
            return new NavigableKeySet(this.this$0, sortedMap().subMap(k, z, k2, z2));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k, boolean z) {
            return new NavigableKeySet(this.this$0, sortedMap().tailMap(k, z));
        }
    }

    /* compiled from: PG */
    class RandomAccessWrappedList extends AbstractMapBasedMultimap<K, V>.WrappedList implements RandomAccess {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RandomAccessWrappedList(AbstractMapBasedMultimap abstractMapBasedMultimap, K k, List<V> list, AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection) {
            super(abstractMapBasedMultimap, k, list, wrappedCollection);
            abstractMapBasedMultimap.getClass();
        }
    }

    /* compiled from: PG */
    class SortedAsMap extends AbstractMapBasedMultimap<K, V>.AsMap implements SortedMap<K, Collection<V>> {
        SortedSet<K> sortedKeySet;
        final /* synthetic */ AbstractMapBasedMultimap this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SortedAsMap(AbstractMapBasedMultimap abstractMapBasedMultimap, SortedMap<K, Collection<V>> sortedMap) {
            super(abstractMapBasedMultimap, sortedMap);
            abstractMapBasedMultimap.getClass();
            this.this$0 = abstractMapBasedMultimap;
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return sortedMap().comparator();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return sortedMap().firstKey();
        }

        public SortedMap<K, Collection<V>> headMap(K k) {
            return new SortedAsMap(this.this$0, sortedMap().headMap(k));
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return sortedMap().lastKey();
        }

        public SortedMap<K, Collection<V>> sortedMap() {
            return (SortedMap) this.submap;
        }

        public SortedMap<K, Collection<V>> subMap(K k, K k2) {
            return new SortedAsMap(this.this$0, sortedMap().subMap(k, k2));
        }

        public SortedMap<K, Collection<V>> tailMap(K k) {
            return new SortedAsMap(this.this$0, sortedMap().tailMap(k));
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public SortedSet<K> createKeySet() {
            return new SortedKeySet(this.this$0, sortedMap());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.AsMap, com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.sortedKeySet;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> sortedSetCreateKeySet = createKeySet();
            this.sortedKeySet = sortedSetCreateKeySet;
            return sortedSetCreateKeySet;
        }
    }

    /* compiled from: PG */
    class SortedKeySet extends AbstractMapBasedMultimap<K, V>.KeySet implements SortedSet<K> {
        final /* synthetic */ AbstractMapBasedMultimap this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SortedKeySet(AbstractMapBasedMultimap abstractMapBasedMultimap, SortedMap<K, Collection<V>> sortedMap) {
            super(abstractMapBasedMultimap, sortedMap);
            abstractMapBasedMultimap.getClass();
            this.this$0 = abstractMapBasedMultimap;
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return sortedMap().comparator();
        }

        @Override // java.util.SortedSet
        public K first() {
            return sortedMap().firstKey();
        }

        public SortedSet<K> headSet(K k) {
            return new SortedKeySet(this.this$0, sortedMap().headMap(k));
        }

        @Override // java.util.SortedSet
        public K last() {
            return sortedMap().lastKey();
        }

        public SortedMap<K, Collection<V>> sortedMap() {
            return (SortedMap) super.map();
        }

        public SortedSet<K> subSet(K k, K k2) {
            return new SortedKeySet(this.this$0, sortedMap().subMap(k, k2));
        }

        public SortedSet<K> tailSet(K k) {
            return new SortedKeySet(this.this$0, sortedMap().tailMap(k));
        }
    }

    /* compiled from: PG */
    class WrappedList extends AbstractMapBasedMultimap<K, V>.WrappedCollection implements List<V> {
        final /* synthetic */ AbstractMapBasedMultimap this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WrappedList(AbstractMapBasedMultimap abstractMapBasedMultimap, K k, List<V> list, AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection) {
            super(abstractMapBasedMultimap, k, list, wrappedCollection);
            abstractMapBasedMultimap.getClass();
            this.this$0 = abstractMapBasedMultimap;
        }

        @Override // java.util.List
        public void add(int i, V v) {
            refreshIfEmpty();
            boolean zIsEmpty = getDelegate().isEmpty();
            getListDelegate().add(i, v);
            this.this$0.totalSize++;
            if (zIsEmpty) {
                addToMap();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = getListDelegate().addAll(i, collection);
            if (!zAddAll) {
                return zAddAll;
            }
            int size2 = getDelegate().size();
            this.this$0.totalSize += size2 - size;
            if (size != 0) {
                return zAddAll;
            }
            addToMap();
            return true;
        }

        @Override // java.util.List
        public V get(int i) {
            refreshIfEmpty();
            return getListDelegate().get(i);
        }

        public List<V> getListDelegate() {
            return (List) getDelegate();
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            refreshIfEmpty();
            return getListDelegate().indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            refreshIfEmpty();
            return getListDelegate().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            refreshIfEmpty();
            return new WrappedListIterator(this);
        }

        @Override // java.util.List
        public V remove(int i) {
            refreshIfEmpty();
            V vRemove = getListDelegate().remove(i);
            AbstractMapBasedMultimap abstractMapBasedMultimap = this.this$0;
            abstractMapBasedMultimap.totalSize--;
            removeIfEmpty();
            return vRemove;
        }

        @Override // java.util.List
        public V set(int i, V v) {
            refreshIfEmpty();
            return getListDelegate().set(i, v);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public List<V> subList(int i, int i2) {
            refreshIfEmpty();
            return this.this$0.wrapList(getKey(), getListDelegate().subList(i, i2), getAncestor() == null ? this : getAncestor());
        }

        /* compiled from: PG */
        class WrappedListIterator extends AbstractMapBasedMultimap<K, V>.WrappedCollection.WrappedIterator implements ListIterator<V> {
            final /* synthetic */ WrappedList this$1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WrappedListIterator(WrappedList wrappedList) {
                super(wrappedList);
                wrappedList.getClass();
                this.this$1 = wrappedList;
            }

            private ListIterator<V> getDelegateListIterator() {
                return (ListIterator) getDelegateIterator();
            }

            @Override // java.util.ListIterator
            public void add(V v) {
                boolean zIsEmpty = this.this$1.isEmpty();
                getDelegateListIterator().add(v);
                this.this$1.this$0.totalSize++;
                if (zIsEmpty) {
                    this.this$1.addToMap();
                }
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return getDelegateListIterator().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return getDelegateListIterator().nextIndex();
            }

            @Override // java.util.ListIterator
            public V previous() {
                return getDelegateListIterator().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return getDelegateListIterator().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(V v) {
                getDelegateListIterator().set(v);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WrappedListIterator(WrappedList wrappedList, int i) {
                super(wrappedList, wrappedList.getListDelegate().listIterator(i));
                wrappedList.getClass();
                this.this$1 = wrappedList;
            }
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i) {
            refreshIfEmpty();
            return new WrappedListIterator(this, i);
        }
    }

    /* compiled from: PG */
    class WrappedNavigableSet extends AbstractMapBasedMultimap<K, V>.WrappedSortedSet implements NavigableSet<V> {
        final /* synthetic */ AbstractMapBasedMultimap this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WrappedNavigableSet(AbstractMapBasedMultimap abstractMapBasedMultimap, K k, NavigableSet<V> navigableSet, AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection) {
            super(abstractMapBasedMultimap, k, navigableSet, wrappedCollection);
            abstractMapBasedMultimap.getClass();
            this.this$0 = abstractMapBasedMultimap;
        }

        private NavigableSet<V> wrap(NavigableSet<V> navigableSet) {
            return new WrappedNavigableSet(this.this$0, this.key, navigableSet, getAncestor() == null ? this : getAncestor());
        }

        @Override // java.util.NavigableSet
        public V ceiling(V v) {
            return getSortedSetDelegate().ceiling(v);
        }

        @Override // java.util.NavigableSet
        public Iterator<V> descendingIterator() {
            return new WrappedCollection.WrappedIterator(this, getSortedSetDelegate().descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> descendingSet() {
            return wrap(getSortedSetDelegate().descendingSet());
        }

        @Override // java.util.NavigableSet
        public V floor(V v) {
            return getSortedSetDelegate().floor(v);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.WrappedSortedSet
        public NavigableSet<V> getSortedSetDelegate() {
            return (NavigableSet) super.getSortedSetDelegate();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> headSet(V v, boolean z) {
            return wrap(getSortedSetDelegate().headSet(v, z));
        }

        @Override // java.util.NavigableSet
        public V higher(V v) {
            return getSortedSetDelegate().higher(v);
        }

        @Override // java.util.NavigableSet
        public V lower(V v) {
            return getSortedSetDelegate().lower(v);
        }

        @Override // java.util.NavigableSet
        public V pollFirst() {
            return (V) Iterators.pollNext(iterator());
        }

        @Override // java.util.NavigableSet
        public V pollLast() {
            return (V) Iterators.pollNext(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> subSet(V v, boolean z, V v2, boolean z2) {
            return wrap(getSortedSetDelegate().subSet(v, z, v2, z2));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> tailSet(V v, boolean z) {
            return wrap(getSortedSetDelegate().tailSet(v, z));
        }
    }

    /* compiled from: PG */
    class WrappedSet extends AbstractMapBasedMultimap<K, V>.WrappedCollection implements Set<V> {
        final /* synthetic */ AbstractMapBasedMultimap this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WrappedSet(AbstractMapBasedMultimap abstractMapBasedMultimap, K k, Set<V> set) {
            super(abstractMapBasedMultimap, k, set, null);
            abstractMapBasedMultimap.getClass();
            this.this$0 = abstractMapBasedMultimap;
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.WrappedCollection, java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAllImpl = Sets.removeAllImpl((Set<?>) this.delegate, collection);
            if (zRemoveAllImpl) {
                int size2 = this.delegate.size();
                this.this$0.totalSize += size2 - size;
                removeIfEmpty();
            }
            return zRemoveAllImpl;
        }
    }

    /* compiled from: PG */
    class WrappedSortedSet extends AbstractMapBasedMultimap<K, V>.WrappedCollection implements SortedSet<V> {
        final /* synthetic */ AbstractMapBasedMultimap this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WrappedSortedSet(AbstractMapBasedMultimap abstractMapBasedMultimap, K k, SortedSet<V> sortedSet, AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection) {
            super(abstractMapBasedMultimap, k, sortedSet, wrappedCollection);
            abstractMapBasedMultimap.getClass();
            this.this$0 = abstractMapBasedMultimap;
        }

        @Override // java.util.SortedSet
        public Comparator<? super V> comparator() {
            return getSortedSetDelegate().comparator();
        }

        @Override // java.util.SortedSet
        public V first() {
            refreshIfEmpty();
            return getSortedSetDelegate().first();
        }

        public SortedSet<V> getSortedSetDelegate() {
            return (SortedSet) getDelegate();
        }

        @Override // java.util.SortedSet
        public SortedSet<V> headSet(V v) {
            refreshIfEmpty();
            return new WrappedSortedSet(this.this$0, getKey(), getSortedSetDelegate().headSet(v), getAncestor() == null ? this : getAncestor());
        }

        @Override // java.util.SortedSet
        public V last() {
            refreshIfEmpty();
            return getSortedSetDelegate().last();
        }

        @Override // java.util.SortedSet
        public SortedSet<V> subSet(V v, V v2) {
            refreshIfEmpty();
            return new WrappedSortedSet(this.this$0, getKey(), getSortedSetDelegate().subSet(v, v2), getAncestor() == null ? this : getAncestor());
        }

        @Override // java.util.SortedSet
        public SortedSet<V> tailSet(V v) {
            refreshIfEmpty();
            return new WrappedSortedSet(this.this$0, getKey(), getSortedSetDelegate().tailSet(v), getAncestor() == null ? this : getAncestor());
        }
    }

    protected AbstractMapBasedMultimap(Map<K, Collection<V>> map) {
        a.H(map.isEmpty());
        this.map = map;
    }

    private Collection<V> getOrCreateCollection(K k) {
        Collection<V> collection = this.map.get(k);
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionCreateCollection = createCollection(k);
        this.map.put(k, collectionCreateCollection);
        return collectionCreateCollection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Iterator<E> iteratorOrListIterator(Collection<E> collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeValuesForKey(Object obj) {
        Collection collection = (Collection) Maps.safeRemove(this.map, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.totalSize -= size;
        }
    }

    public Map<K, Collection<V>> backingMap() {
        return this.map;
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
        Iterator<Collection<V>> it = this.map.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.map.clear();
        this.totalSize = 0;
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(Object obj) {
        return this.map.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Map<K, Collection<V>> createAsMap() {
        return new AsMap(this, this.map);
    }

    public abstract Collection<V> createCollection();

    public Collection<V> createCollection(K k) {
        return createCollection();
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Collection<Map.Entry<K, V>> createEntries() {
        return this instanceof SetMultimap ? new AbstractMultimap.EntrySet(this) : new AbstractMultimap.Entries(this);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Set<K> createKeySet() {
        return new KeySet(this, this.map);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Multiset<K> createKeys() {
        return new Multimaps.Keys(this);
    }

    final Map<K, Collection<V>> createMaybeNavigableAsMap() {
        Map<K, Collection<V>> map = this.map;
        return map instanceof NavigableMap ? new NavigableAsMap(this, (NavigableMap) map) : map instanceof SortedMap ? new SortedAsMap(this, (SortedMap) map) : new AsMap(this, map);
    }

    final Set<K> createMaybeNavigableKeySet() {
        Map<K, Collection<V>> map = this.map;
        return map instanceof NavigableMap ? new NavigableKeySet(this, (NavigableMap) map) : map instanceof SortedMap ? new SortedKeySet(this, (SortedMap) map) : new KeySet(this, map);
    }

    public Collection<V> createUnmodifiableEmptyCollection() {
        return (Collection<V>) unmodifiableCollectionSubclass(createCollection());
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Collection<V> createValues() {
        return new AbstractMultimap.Values(this);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public Collection<Map.Entry<K, V>> entries() {
        return super.entries();
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Iterator<Map.Entry<K, V>> entryIterator() {
        return new AbstractMapBasedMultimap<K, V>.Itr<Map.Entry<K, V>>(this) { // from class: com.google.common.collect.AbstractMapBasedMultimap.2
            {
                this.getClass();
            }

            @Override // com.google.common.collect.AbstractMapBasedMultimap.Itr
            public Map.Entry<K, V> output(K k, V v) {
                return Maps.immutableEntry(k, v);
            }

            @Override // com.google.common.collect.AbstractMapBasedMultimap.Itr
            public /* bridge */ /* synthetic */ Object output(Object obj, Object obj2) {
                return output((AnonymousClass2) obj, obj2);
            }
        };
    }

    @Override // com.google.common.collect.Multimap
    public Collection<V> get(K k) {
        Collection<V> collectionCreateCollection = this.map.get(k);
        if (collectionCreateCollection == null) {
            collectionCreateCollection = createCollection(k);
        }
        return wrapCollection(k, collectionCreateCollection);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public boolean put(K k, V v) {
        Collection<V> collection = this.map.get(k);
        if (collection != null) {
            if (!collection.add(v)) {
                return false;
            }
            this.totalSize++;
            return true;
        }
        Collection<V> collectionCreateCollection = createCollection(k);
        if (!collectionCreateCollection.add(v)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.totalSize++;
        this.map.put(k, collectionCreateCollection);
        return true;
    }

    @Override // com.google.common.collect.Multimap
    public Collection<V> removeAll(Object obj) {
        Collection<V> collectionRemove = this.map.remove(obj);
        if (collectionRemove == null) {
            return createUnmodifiableEmptyCollection();
        }
        Collection collectionCreateCollection = createCollection();
        collectionCreateCollection.addAll(collectionRemove);
        this.totalSize -= collectionRemove.size();
        collectionRemove.clear();
        return (Collection<V>) unmodifiableCollectionSubclass(collectionCreateCollection);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public Collection<V> replaceValues(K k, Iterable<? extends V> iterable) {
        Iterator<? extends V> it = iterable.iterator();
        if (!it.hasNext()) {
            return removeAll(k);
        }
        Collection<V> orCreateCollection = getOrCreateCollection(k);
        Collection<V> collectionCreateCollection = createCollection();
        collectionCreateCollection.addAll(orCreateCollection);
        this.totalSize -= orCreateCollection.size();
        orCreateCollection.clear();
        while (it.hasNext()) {
            if (orCreateCollection.add(it.next())) {
                this.totalSize++;
            }
        }
        return (Collection<V>) unmodifiableCollectionSubclass(collectionCreateCollection);
    }

    final void setMap(Map<K, Collection<V>> map) {
        this.map = map;
        this.totalSize = 0;
        for (Collection<V> collection : map.values()) {
            a.H(!collection.isEmpty());
            this.totalSize += collection.size();
        }
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
        return this.totalSize;
    }

    public <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
        return DesugarCollections.unmodifiableCollection(collection);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Iterator<V> valueIterator() {
        return new AbstractMapBasedMultimap<K, V>.Itr<V>(this) { // from class: com.google.common.collect.AbstractMapBasedMultimap.1
            {
                this.getClass();
            }

            @Override // com.google.common.collect.AbstractMapBasedMultimap.Itr
            public V output(K k, V v) {
                return v;
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public Collection<V> values() {
        return super.values();
    }

    public Collection<V> wrapCollection(K k, Collection<V> collection) {
        return new WrappedCollection(this, k, collection, null);
    }

    final List<V> wrapList(K k, List<V> list, AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection) {
        return list instanceof RandomAccess ? new RandomAccessWrappedList(this, k, list, wrappedCollection) : new WrappedList(this, k, list, wrappedCollection);
    }

    /* compiled from: PG */
    class WrappedCollection extends AbstractCollection<V> {
        final AbstractMapBasedMultimap<K, V>.WrappedCollection ancestor;
        final Collection<V> ancestorDelegate;
        Collection<V> delegate;
        final K key;
        final /* synthetic */ AbstractMapBasedMultimap this$0;

        public WrappedCollection(AbstractMapBasedMultimap abstractMapBasedMultimap, K k, Collection<V> collection, AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection) {
            abstractMapBasedMultimap.getClass();
            this.this$0 = abstractMapBasedMultimap;
            this.key = k;
            this.delegate = collection;
            this.ancestor = wrappedCollection;
            this.ancestorDelegate = wrappedCollection == null ? null : wrappedCollection.getDelegate();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(V v) {
            refreshIfEmpty();
            boolean zIsEmpty = this.delegate.isEmpty();
            boolean zAdd = this.delegate.add(v);
            if (zAdd) {
                this.this$0.totalSize++;
                if (zIsEmpty) {
                    addToMap();
                    return true;
                }
            }
            return zAdd;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = this.delegate.addAll(collection);
            if (!zAddAll) {
                return zAddAll;
            }
            int size2 = this.delegate.size();
            this.this$0.totalSize += size2 - size;
            if (size != 0) {
                return zAddAll;
            }
            addToMap();
            return true;
        }

        public void addToMap() {
            AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection = this.ancestor;
            if (wrappedCollection != null) {
                wrappedCollection.addToMap();
                return;
            }
            AbstractMapBasedMultimap abstractMapBasedMultimap = this.this$0;
            abstractMapBasedMultimap.map.put(this.key, this.delegate);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.delegate.clear();
            this.this$0.totalSize -= size;
            removeIfEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            refreshIfEmpty();
            return this.delegate.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            refreshIfEmpty();
            return this.delegate.containsAll(collection);
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            refreshIfEmpty();
            return this.delegate.equals(obj);
        }

        public AbstractMapBasedMultimap<K, V>.WrappedCollection getAncestor() {
            return this.ancestor;
        }

        public Collection<V> getDelegate() {
            return this.delegate;
        }

        public K getKey() {
            return this.key;
        }

        @Override // java.util.Collection
        public int hashCode() {
            refreshIfEmpty();
            return this.delegate.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            refreshIfEmpty();
            return new WrappedIterator(this);
        }

        public void refreshIfEmpty() {
            AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection = this.ancestor;
            if (wrappedCollection != null) {
                wrappedCollection.refreshIfEmpty();
                AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection2 = this.ancestor;
                if (wrappedCollection2.getDelegate() != this.ancestorDelegate) {
                    throw new ConcurrentModificationException();
                }
                return;
            }
            if (this.delegate.isEmpty()) {
                AbstractMapBasedMultimap abstractMapBasedMultimap = this.this$0;
                Collection<V> collection = (Collection) abstractMapBasedMultimap.map.get(this.key);
                if (collection != null) {
                    this.delegate = collection;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            refreshIfEmpty();
            boolean zRemove = this.delegate.remove(obj);
            if (zRemove) {
                AbstractMapBasedMultimap abstractMapBasedMultimap = this.this$0;
                abstractMapBasedMultimap.totalSize--;
                removeIfEmpty();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAll = this.delegate.removeAll(collection);
            if (zRemoveAll) {
                int size2 = this.delegate.size();
                this.this$0.totalSize += size2 - size;
                removeIfEmpty();
            }
            return zRemoveAll;
        }

        public void removeIfEmpty() {
            AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection = this.ancestor;
            if (wrappedCollection != null) {
                wrappedCollection.removeIfEmpty();
            } else if (this.delegate.isEmpty()) {
                AbstractMapBasedMultimap abstractMapBasedMultimap = this.this$0;
                abstractMapBasedMultimap.map.remove(this.key);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            collection.getClass();
            int size = size();
            boolean zRetainAll = this.delegate.retainAll(collection);
            if (zRetainAll) {
                int size2 = this.delegate.size();
                this.this$0.totalSize += size2 - size;
                removeIfEmpty();
            }
            return zRetainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            refreshIfEmpty();
            return this.delegate.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            refreshIfEmpty();
            return this.delegate.toString();
        }

        /* compiled from: PG */
        class WrappedIterator implements Iterator<V> {
            final Iterator<V> delegateIterator;
            final Collection<V> originalDelegate;
            final /* synthetic */ WrappedCollection this$1;

            public WrappedIterator(WrappedCollection wrappedCollection) {
                wrappedCollection.getClass();
                this.this$1 = wrappedCollection;
                this.originalDelegate = wrappedCollection.delegate;
                this.delegateIterator = AbstractMapBasedMultimap.iteratorOrListIterator(wrappedCollection.delegate);
            }

            public Iterator<V> getDelegateIterator() {
                validateIterator();
                return this.delegateIterator;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                validateIterator();
                return this.delegateIterator.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                validateIterator();
                return this.delegateIterator.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.delegateIterator.remove();
                AbstractMapBasedMultimap abstractMapBasedMultimap = this.this$1.this$0;
                abstractMapBasedMultimap.totalSize--;
                this.this$1.removeIfEmpty();
            }

            public void validateIterator() {
                this.this$1.refreshIfEmpty();
                if (this.this$1.delegate != this.originalDelegate) {
                    throw new ConcurrentModificationException();
                }
            }

            public WrappedIterator(WrappedCollection wrappedCollection, Iterator<V> it) {
                wrappedCollection.getClass();
                this.this$1 = wrappedCollection;
                this.originalDelegate = wrappedCollection.delegate;
                this.delegateIterator = it;
            }
        }
    }
}
