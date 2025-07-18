package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface SetMultimap<K, V> extends Multimap<K, V> {

    /* compiled from: PG */
    /* renamed from: com.google.common.collect.SetMultimap$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    Map<K, Collection<V>> asMap();

    @Override // com.google.common.collect.Multimap
    Set<Map.Entry<K, V>> entries();

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    boolean equals(Object obj);

    @Override // com.google.common.collect.Multimap
    Set<V> get(K k);

    @Override // com.google.common.collect.Multimap
    Set<V> removeAll(Object obj);

    @Override // com.google.common.collect.Multimap
    Set<V> replaceValues(K k, Iterable<? extends V> iterable);
}
