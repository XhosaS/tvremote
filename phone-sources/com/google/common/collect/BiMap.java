package com.google.common.collect;

import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface BiMap<K, V> extends Map<K, V> {

    /* compiled from: PG */
    /* renamed from: com.google.common.collect.BiMap$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    V forcePut(K k, V v);

    BiMap<V, K> inverse();

    V put(K k, V v);

    void putAll(Map<? extends K, ? extends V> map);

    @Override // java.util.Map
    Set<V> values();
}
