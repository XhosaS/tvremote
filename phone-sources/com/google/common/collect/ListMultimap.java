package com.google.common.collect;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface ListMultimap<K, V> extends Multimap<K, V> {

    /* compiled from: PG */
    /* renamed from: com.google.common.collect.ListMultimap$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    Map<K, Collection<V>> asMap();

    boolean equals(Object obj);

    @Override // com.google.common.collect.Multimap
    List<V> get(K k);

    @Override // com.google.common.collect.Multimap
    List<V> removeAll(Object obj);

    @Override // com.google.common.collect.Multimap
    List<V> replaceValues(K k, Iterable<? extends V> iterable);
}
