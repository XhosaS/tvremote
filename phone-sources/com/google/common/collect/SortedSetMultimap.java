package com.google.common.collect;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface SortedSetMultimap<K, V> extends SetMultimap<K, V> {

    /* compiled from: PG */
    /* renamed from: com.google.common.collect.SortedSetMultimap$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    @Override // com.google.common.collect.SetMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    Map<K, Collection<V>> asMap();

    @Override // com.google.common.collect.SetMultimap, com.google.common.collect.Multimap
    SortedSet<V> get(K k);

    @Override // com.google.common.collect.SetMultimap, com.google.common.collect.Multimap
    SortedSet<V> removeAll(Object obj);

    @Override // com.google.common.collect.SetMultimap, com.google.common.collect.Multimap
    SortedSet<V> replaceValues(K k, Iterable<? extends V> iterable);

    Comparator<? super V> valueComparator();
}
