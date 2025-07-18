package com.google.common.collect;

import com.google.common.collect.Multimaps;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class AbstractMultimap<K, V> implements Multimap<K, V> {
    private transient Map<K, Collection<V>> asMap;
    private transient Collection<Map.Entry<K, V>> entries;
    private transient Set<K> keySet;
    private transient Multiset<K> keys;
    private transient Collection<V> values;

    /* compiled from: PG */
    class Entries extends Multimaps.Entries<K, V> {
        final /* synthetic */ AbstractMultimap this$0;

        public Entries(AbstractMultimap abstractMultimap) {
            abstractMultimap.getClass();
            this.this$0 = abstractMultimap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return this.this$0.entryIterator();
        }

        @Override // com.google.common.collect.Multimaps.Entries
        public Multimap<K, V> multimap() {
            return this.this$0;
        }
    }

    /* compiled from: PG */
    class EntrySet extends AbstractMultimap<K, V>.Entries implements Set<Map.Entry<K, V>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EntrySet(AbstractMultimap abstractMultimap) {
            super(abstractMultimap);
            abstractMultimap.getClass();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return Sets.equalsImpl(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return Sets.hashCodeImpl(this);
        }
    }

    /* compiled from: PG */
    class Values extends AbstractCollection<V> {
        final /* synthetic */ AbstractMultimap this$0;

        public Values(AbstractMultimap abstractMultimap) {
            abstractMultimap.getClass();
            this.this$0 = abstractMultimap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.this$0.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.this$0.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return this.this$0.valueIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.this$0.size();
        }
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Map<K, Collection<V>> asMap() {
        Map<K, Collection<V>> map = this.asMap;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> mapCreateAsMap = createAsMap();
        this.asMap = mapCreateAsMap;
        return mapCreateAsMap;
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsEntry(Object obj, Object obj2) {
        Collection<V> collection = asMap().get(obj);
        return collection != null && collection.contains(obj2);
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsValue(Object obj) {
        Iterator<Collection<V>> it = asMap().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Map<K, Collection<V>> createAsMap();

    public abstract Collection<Map.Entry<K, V>> createEntries();

    public abstract Set<K> createKeySet();

    public abstract Multiset<K> createKeys();

    public abstract Collection<V> createValues();

    @Override // com.google.common.collect.Multimap
    public Collection<Map.Entry<K, V>> entries() {
        Collection<Map.Entry<K, V>> collection = this.entries;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<K, V>> collectionCreateEntries = createEntries();
        this.entries = collectionCreateEntries;
        return collectionCreateEntries;
    }

    public abstract Iterator<Map.Entry<K, V>> entryIterator();

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public boolean equals(Object obj) {
        return Multimaps.equalsImpl(this, obj);
    }

    @Override // com.google.common.collect.Multimap
    public int hashCode() {
        return asMap().hashCode();
    }

    @Override // com.google.common.collect.Multimap
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // com.google.common.collect.Multimap
    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        Set<K> setCreateKeySet = createKeySet();
        this.keySet = setCreateKeySet;
        return setCreateKeySet;
    }

    @Override // com.google.common.collect.Multimap
    public Multiset<K> keys() {
        Multiset<K> multiset = this.keys;
        if (multiset != null) {
            return multiset;
        }
        Multiset<K> multisetCreateKeys = createKeys();
        this.keys = multisetCreateKeys;
        return multisetCreateKeys;
    }

    @Override // com.google.common.collect.Multimap
    public boolean put(K k, V v) {
        return get(k).add(v);
    }

    @Override // com.google.common.collect.Multimap
    public boolean putAll(Multimap<? extends K, ? extends V> multimap) {
        boolean zPut = false;
        for (Map.Entry<? extends K, ? extends V> entry : multimap.entries()) {
            zPut |= put(entry.getKey(), entry.getValue());
        }
        return zPut;
    }

    @Override // com.google.common.collect.Multimap
    public boolean remove(Object obj, Object obj2) {
        Collection<V> collection = asMap().get(obj);
        return collection != null && collection.remove(obj2);
    }

    @Override // com.google.common.collect.Multimap
    public Collection<V> replaceValues(K k, Iterable<? extends V> iterable) {
        iterable.getClass();
        Collection<V> collectionRemoveAll = removeAll(k);
        putAll(k, iterable);
        return collectionRemoveAll;
    }

    public String toString() {
        return asMap().toString();
    }

    public Iterator<V> valueIterator() {
        return Maps.valueIterator(entries().iterator());
    }

    @Override // com.google.common.collect.Multimap
    public Collection<V> values() {
        Collection<V> collection = this.values;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionCreateValues = createValues();
        this.values = collectionCreateValues;
        return collectionCreateValues;
    }

    @Override // com.google.common.collect.Multimap
    public boolean putAll(K k, Iterable<? extends V> iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection<? extends V> collection = (Collection) iterable;
            return !collection.isEmpty() && get(k).addAll(collection);
        }
        Iterator<? extends V> it = iterable.iterator();
        return it.hasNext() && Iterators.addAll(get(k), it);
    }
}
