package com.google.common.collect;

import defpackage.tsv;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class FilteredKeySetMultimap<K, V> extends FilteredKeyMultimap<K, V> implements FilteredSetMultimap<K, V> {

    /* compiled from: PG */
    class EntrySet extends FilteredKeyMultimap<K, V>.Entries implements Set<Map.Entry<K, V>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EntrySet(FilteredKeySetMultimap filteredKeySetMultimap) {
            super(filteredKeySetMultimap);
            filteredKeySetMultimap.getClass();
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

    public FilteredKeySetMultimap(SetMultimap<K, V> setMultimap, tsv<? super K> tsvVar) {
        super(setMultimap, tsvVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.FilteredKeyMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ Collection get(Object obj) {
        return get((FilteredKeySetMultimap<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues((FilteredKeySetMultimap<K, V>) obj, iterable);
    }

    @Override // com.google.common.collect.FilteredKeyMultimap, com.google.common.collect.AbstractMultimap
    public Set<Map.Entry<K, V>> createEntries() {
        return new EntrySet(this);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public Set<Map.Entry<K, V>> entries() {
        return (Set) super.entries();
    }

    @Override // com.google.common.collect.FilteredKeyMultimap, com.google.common.collect.Multimap
    public Set<V> get(K k) {
        return (Set) super.get((FilteredKeySetMultimap<K, V>) k);
    }

    @Override // com.google.common.collect.FilteredKeyMultimap, com.google.common.collect.Multimap
    public Set<V> removeAll(Object obj) {
        return (Set) super.removeAll(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public Set<V> replaceValues(K k, Iterable<? extends V> iterable) {
        return (Set) super.replaceValues((FilteredKeySetMultimap<K, V>) k, (Iterable) iterable);
    }

    @Override // com.google.common.collect.FilteredKeyMultimap, com.google.common.collect.FilteredMultimap
    public SetMultimap<K, V> unfiltered() {
        return (SetMultimap) this.unfiltered;
    }
}
