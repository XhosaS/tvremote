package com.google.common.collect;

import defpackage.sij;
import defpackage.tsv;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
class FilteredKeyMultimap<K, V> extends AbstractMultimap<K, V> implements FilteredMultimap<K, V> {
    final tsv<? super K> keyPredicate;
    final Multimap<K, V> unfiltered;

    /* compiled from: PG */
    class Entries extends ForwardingCollection<Map.Entry<K, V>> {
        final /* synthetic */ FilteredKeyMultimap this$0;

        public Entries(FilteredKeyMultimap filteredKeyMultimap) {
            filteredKeyMultimap.getClass();
            this.this$0 = filteredKeyMultimap;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (this.this$0.unfiltered.containsKey(entry.getKey()) && this.this$0.keyPredicate.apply((Object) entry.getKey())) {
                return this.this$0.unfiltered.remove(entry.getKey(), entry.getValue());
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Collection<Map.Entry<K, V>> delegate() {
            return Collections2.filter(this.this$0.unfiltered.entries(), this.this$0.entryPredicate());
        }
    }

    public FilteredKeyMultimap(Multimap<K, V> multimap, tsv<? super K> tsvVar) {
        multimap.getClass();
        this.unfiltered = multimap;
        tsvVar.getClass();
        this.keyPredicate = tsvVar;
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
        keySet().clear();
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(Object obj) {
        if (this.unfiltered.containsKey(obj)) {
            return this.keyPredicate.apply(obj);
        }
        return false;
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Map<K, Collection<V>> createAsMap() {
        return Maps.filterKeys(this.unfiltered.asMap(), this.keyPredicate);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Collection<Map.Entry<K, V>> createEntries() {
        return new Entries(this);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Set<K> createKeySet() {
        return Sets.filter(this.unfiltered.keySet(), this.keyPredicate);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Multiset<K> createKeys() {
        return Multisets.filter(this.unfiltered.keys(), this.keyPredicate);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Collection<V> createValues() {
        return new FilteredMultimapValues(this);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Iterator<Map.Entry<K, V>> entryIterator() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.FilteredMultimap
    public tsv<? super Map.Entry<K, V>> entryPredicate() {
        return Maps.keyPredicateOnEntries(this.keyPredicate);
    }

    @Override // com.google.common.collect.Multimap
    public Collection<V> get(K k) {
        return this.keyPredicate.apply(k) ? this.unfiltered.get(k) : this.unfiltered instanceof SetMultimap ? new AddRejectingSet(k) : new AddRejectingList(k);
    }

    @Override // com.google.common.collect.Multimap
    public Collection<V> removeAll(Object obj) {
        return containsKey(obj) ? this.unfiltered.removeAll(obj) : unmodifiableEmptyCollection();
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
        Iterator<Collection<V>> it = asMap().values().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().size();
        }
        return size;
    }

    public Multimap<K, V> unfiltered() {
        return this.unfiltered;
    }

    public Collection<V> unmodifiableEmptyCollection() {
        return this.unfiltered instanceof SetMultimap ? Collections.EMPTY_SET : Collections.EMPTY_LIST;
    }

    /* compiled from: PG */
    class AddRejectingList<K, V> extends ForwardingList<V> {
        final K key;

        public AddRejectingList(K k) {
            this.key = k;
        }

        @Override // com.google.common.collect.ForwardingList, java.util.List
        public void add(int i, V v) {
            sij.C(i, 0);
            throw new IllegalArgumentException("Key does not satisfy predicate: ".concat(String.valueOf(String.valueOf(this.key))));
        }

        @Override // com.google.common.collect.ForwardingList, java.util.List
        public boolean addAll(int i, Collection<? extends V> collection) {
            collection.getClass();
            sij.C(i, 0);
            throw new IllegalArgumentException("Key does not satisfy predicate: ".concat(String.valueOf(String.valueOf(this.key))));
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public boolean add(V v) {
            add(0, v);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingList, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public List<V> delegate() {
            return Collections.EMPTY_LIST;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            addAll(0, collection);
            return true;
        }
    }

    /* compiled from: PG */
    class AddRejectingSet<K, V> extends ForwardingSet<V> {
        final K key;

        public AddRejectingSet(K k) {
            this.key = k;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public boolean add(V v) {
            throw new IllegalArgumentException("Key does not satisfy predicate: ".concat(String.valueOf(String.valueOf(this.key))));
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            collection.getClass();
            throw new IllegalArgumentException("Key does not satisfy predicate: ".concat(String.valueOf(String.valueOf(this.key))));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Set<V> delegate() {
            return Collections.EMPTY_SET;
        }
    }
}
