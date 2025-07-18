package com.google.common.collect;

import defpackage.a;
import defpackage.sij;
import defpackage.tsv;
import defpackage.tsy;
import defpackage.ttb;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class FilteredMultimapValues<K, V> extends AbstractCollection<V> {
    private final FilteredMultimap<K, V> multimap;

    public FilteredMultimapValues(FilteredMultimap<K, V> filteredMultimap) {
        filteredMultimap.getClass();
        this.multimap = filteredMultimap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.multimap.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.multimap.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return Maps.valueIterator(this.multimap.entries().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        FilteredMultimap<K, V> filteredMultimap = this.multimap;
        tsv<? super Map.Entry<K, V>> tsvVarEntryPredicate = filteredMultimap.entryPredicate();
        Iterator<Map.Entry<K, V>> it = filteredMultimap.unfiltered().entries().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (tsvVarEntryPredicate.apply(next) && a.Q(next.getValue(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return Iterables.removeIf(this.multimap.unfiltered().entries(), sij.n(this.multimap.entryPredicate(), Maps.valuePredicateOnEntries(new tsy(collection))));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return Iterables.removeIf(this.multimap.unfiltered().entries(), sij.n(this.multimap.entryPredicate(), Maps.valuePredicateOnEntries(new ttb(new tsy(collection)))));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.multimap.size();
    }
}
