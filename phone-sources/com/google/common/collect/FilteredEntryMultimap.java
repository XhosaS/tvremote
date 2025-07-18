package com.google.common.collect;

import com.google.common.collect.Maps;
import com.google.common.collect.Multimaps;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import defpackage.sij;
import defpackage.tsv;
import defpackage.tsy;
import defpackage.ttb;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
class FilteredEntryMultimap<K, V> extends AbstractMultimap<K, V> implements FilteredMultimap<K, V> {
    final tsv<? super Map.Entry<K, V>> predicate;
    final Multimap<K, V> unfiltered;

    /* compiled from: PG */
    class AsMap extends Maps.ViewCachingAbstractMap<K, Collection<V>> {
        final /* synthetic */ FilteredEntryMultimap this$0;

        public AsMap(FilteredEntryMultimap filteredEntryMultimap) {
            filteredEntryMultimap.getClass();
            this.this$0 = filteredEntryMultimap;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.this$0.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return get(obj) != null;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public Set<Map.Entry<K, Collection<V>>> createEntrySet() {
            return new Maps.EntrySet<K, Collection<V>>(this) { // from class: com.google.common.collect.FilteredEntryMultimap.AsMap.1EntrySetImpl
                final /* synthetic */ AsMap this$1;

                {
                    this.getClass();
                    this.this$1 = this;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                    return new AbstractIterator<Map.Entry<K, Collection<V>>>(this) { // from class: com.google.common.collect.FilteredEntryMultimap.AsMap.1EntrySetImpl.1
                        final Iterator<Map.Entry<K, Collection<V>>> backingIterator;
                        final /* synthetic */ C1EntrySetImpl this$2;

                        {
                            this.getClass();
                            this.this$2 = this;
                            this.backingIterator = this.this$1.this$0.unfiltered.asMap().entrySet().iterator();
                        }

                        /* JADX INFO: Access modifiers changed from: protected */
                        @Override // com.google.common.collect.AbstractIterator
                        public Map.Entry<K, Collection<V>> computeNext() {
                            while (this.backingIterator.hasNext()) {
                                Map.Entry<K, Collection<V>> next = this.backingIterator.next();
                                K key = next.getKey();
                                Collection collectionFilterCollection = FilteredEntryMultimap.filterCollection(next.getValue(), new ValuePredicate(this.this$2.this$1.this$0, key));
                                if (!collectionFilterCollection.isEmpty()) {
                                    return Maps.immutableEntry(key, collectionFilterCollection);
                                }
                            }
                            endOfData();
                            return null;
                        }
                    };
                }

                @Override // com.google.common.collect.Maps.EntrySet
                public Map<K, Collection<V>> map() {
                    return this.this$1;
                }

                @Override // com.google.common.collect.Maps.EntrySet, com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean removeAll(Collection<?> collection) {
                    return this.this$1.this$0.removeEntriesIf(new tsy(collection));
                }

                @Override // com.google.common.collect.Maps.EntrySet, com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean retainAll(Collection<?> collection) {
                    return this.this$1.this$0.removeEntriesIf(new ttb(new tsy(collection)));
                }

                @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public int size() {
                    return Iterators.size(iterator());
                }
            };
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public Set<K> createKeySet() {
            return new Maps.KeySet<K, Collection<V>>(this) { // from class: com.google.common.collect.FilteredEntryMultimap.AsMap.1KeySetImpl
                final /* synthetic */ AsMap this$1;

                {
                    this.getClass();
                    this.this$1 = this;
                }

                @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean remove(Object obj) {
                    return this.this$1.remove(obj) != null;
                }

                @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean removeAll(Collection<?> collection) {
                    return this.this$1.this$0.removeEntriesIf(Maps.keyPredicateOnEntries(new tsy(collection)));
                }

                @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean retainAll(Collection<?> collection) {
                    return this.this$1.this$0.removeEntriesIf(Maps.keyPredicateOnEntries(new ttb(new tsy(collection))));
                }
            };
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public Collection<Collection<V>> createValues() {
            return new Maps.Values<K, Collection<V>>(this) { // from class: com.google.common.collect.FilteredEntryMultimap.AsMap.1ValuesImpl
                final /* synthetic */ AsMap this$1;

                {
                    this.getClass();
                    this.this$1 = this;
                }

                @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
                public boolean remove(Object obj) {
                    if (!(obj instanceof Collection)) {
                        return false;
                    }
                    Collection collection = (Collection) obj;
                    Iterator<Map.Entry<K, Collection<V>>> it = this.this$1.this$0.unfiltered.asMap().entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry<K, Collection<V>> next = it.next();
                        Collection collectionFilterCollection = FilteredEntryMultimap.filterCollection(next.getValue(), new ValuePredicate(this.this$1.this$0, next.getKey()));
                        if (!collectionFilterCollection.isEmpty() && collection.equals(collectionFilterCollection)) {
                            if (collectionFilterCollection.size() == next.getValue().size()) {
                                it.remove();
                                return true;
                            }
                            collectionFilterCollection.clear();
                            return true;
                        }
                    }
                    return false;
                }

                @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
                public boolean removeAll(Collection<?> collection) {
                    return this.this$1.this$0.removeEntriesIf(Maps.valuePredicateOnEntries(new tsy(collection)));
                }

                @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
                public boolean retainAll(Collection<?> collection) {
                    return this.this$1.this$0.removeEntriesIf(Maps.valuePredicateOnEntries(new ttb(new tsy(collection))));
                }
            };
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> get(Object obj) {
            Collection<V> collection = this.this$0.unfiltered.asMap().get(obj);
            if (collection == null) {
                return null;
            }
            Collection<V> collectionFilterCollection = FilteredEntryMultimap.filterCollection(collection, new ValuePredicate(this.this$0, obj));
            if (collectionFilterCollection.isEmpty()) {
                return null;
            }
            return collectionFilterCollection;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> remove(Object obj) {
            Collection<V> collection = this.this$0.unfiltered.asMap().get(obj);
            if (collection == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<V> it = collection.iterator();
            while (it.hasNext()) {
                V next = it.next();
                if (this.this$0.satisfies(obj, next)) {
                    it.remove();
                    arrayList.add(next);
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return this.this$0.unfiltered instanceof SetMultimap ? DesugarCollections.unmodifiableSet(new LinkedHashSet(arrayList)) : DesugarCollections.unmodifiableList(arrayList);
        }
    }

    /* compiled from: PG */
    class Keys extends Multimaps.Keys<K, V> {
        final /* synthetic */ FilteredEntryMultimap this$0;

        /* compiled from: PG */
        /* renamed from: com.google.common.collect.FilteredEntryMultimap$Keys$1, reason: invalid class name */
        class AnonymousClass1 extends Multisets.EntrySet<K> {
            final /* synthetic */ Keys this$1;

            public AnonymousClass1(Keys keys) {
                keys.getClass();
                this.this$1 = keys;
            }

            private boolean removeEntriesIf(final tsv<? super Multiset.Entry<K>> tsvVar) {
                return this.this$1.this$0.removeEntriesIf(new tsv() { // from class: com.google.common.collect.FilteredEntryMultimap$Keys$1$$ExternalSyntheticLambda0
                    @Override // defpackage.tsv
                    public final boolean apply(Object obj) {
                        Map.Entry entry = (Map.Entry) obj;
                        return tsvVar.apply(Multisets.immutableEntry(entry.getKey(), ((Collection) entry.getValue()).size()));
                    }
                });
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Multiset.Entry<K>> iterator() {
                return this.this$1.entryIterator();
            }

            @Override // com.google.common.collect.Multisets.EntrySet
            public Multiset<K> multiset() {
                return this.this$1;
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                return removeEntriesIf(new tsy(collection));
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return removeEntriesIf(new ttb(new tsy(collection)));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return this.this$1.this$0.keySet().size();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Keys(FilteredEntryMultimap filteredEntryMultimap) {
            super(filteredEntryMultimap);
            filteredEntryMultimap.getClass();
            this.this$0 = filteredEntryMultimap;
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public Set<Multiset.Entry<K>> entrySet() {
            return new AnonymousClass1(this);
        }

        @Override // com.google.common.collect.Multimaps.Keys, com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public int remove(Object obj, int i) {
            CollectPreconditions.checkNonnegative(i, "occurrences");
            if (i == 0) {
                return count(obj);
            }
            Collection<V> collection = this.this$0.unfiltered.asMap().get(obj);
            int i2 = 0;
            if (collection == null) {
                return 0;
            }
            Iterator<V> it = collection.iterator();
            while (it.hasNext()) {
                if (this.this$0.satisfies(obj, it.next()) && (i2 = i2 + 1) <= i) {
                    it.remove();
                }
            }
            return i2;
        }
    }

    /* compiled from: PG */
    final class ValuePredicate implements tsv<V> {
        private final K key;
        final /* synthetic */ FilteredEntryMultimap this$0;

        public ValuePredicate(FilteredEntryMultimap filteredEntryMultimap, K k) {
            filteredEntryMultimap.getClass();
            this.this$0 = filteredEntryMultimap;
            this.key = k;
        }

        @Override // defpackage.tsv
        public boolean apply(V v) {
            return this.this$0.satisfies(this.key, v);
        }
    }

    public FilteredEntryMultimap(Multimap<K, V> multimap, tsv<? super Map.Entry<K, V>> tsvVar) {
        multimap.getClass();
        this.unfiltered = multimap;
        tsvVar.getClass();
        this.predicate = tsvVar;
    }

    static <E> Collection<E> filterCollection(Collection<E> collection, tsv<? super E> tsvVar) {
        return collection instanceof Set ? Sets.filter((Set) collection, tsvVar) : Collections2.filter(collection, tsvVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean satisfies(K k, V v) {
        return this.predicate.apply(Maps.immutableEntry(k, v));
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
        entries().clear();
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(Object obj) {
        return asMap().get(obj) != null;
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Map<K, Collection<V>> createAsMap() {
        return new AsMap(this);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Collection<Map.Entry<K, V>> createEntries() {
        return filterCollection(this.unfiltered.entries(), this.predicate);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Set<K> createKeySet() {
        return asMap().keySet();
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Multiset<K> createKeys() {
        return new Keys(this);
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
        return this.predicate;
    }

    @Override // com.google.common.collect.Multimap
    public Collection<V> get(K k) {
        return filterCollection(this.unfiltered.get(k), new ValuePredicate(this, k));
    }

    @Override // com.google.common.collect.Multimap
    public Collection<V> removeAll(Object obj) {
        return (Collection) sij.I(asMap().remove(obj), unmodifiableEmptyCollection());
    }

    public boolean removeEntriesIf(tsv<? super Map.Entry<K, Collection<V>>> tsvVar) {
        Iterator<Map.Entry<K, Collection<V>>> it = this.unfiltered.asMap().entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            Map.Entry<K, Collection<V>> next = it.next();
            K key = next.getKey();
            Collection collectionFilterCollection = filterCollection(next.getValue(), new ValuePredicate(this, key));
            if (!collectionFilterCollection.isEmpty() && tsvVar.apply(Maps.immutableEntry(key, collectionFilterCollection))) {
                if (collectionFilterCollection.size() == next.getValue().size()) {
                    it.remove();
                } else {
                    collectionFilterCollection.clear();
                }
                z = true;
            }
        }
        return z;
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
        return entries().size();
    }

    @Override // com.google.common.collect.FilteredMultimap
    public Multimap<K, V> unfiltered() {
        return this.unfiltered;
    }

    public Collection<V> unmodifiableEmptyCollection() {
        return this.unfiltered instanceof SetMultimap ? Collections.EMPTY_SET : Collections.EMPTY_LIST;
    }
}
