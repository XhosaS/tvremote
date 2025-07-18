package com.google.common.collect;

import java.util.Collection;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class LinkedHashMultimapGwtSerializationDependencies<K, V> extends AbstractSetMultimap<K, V> {
    public LinkedHashMultimapGwtSerializationDependencies(Map<K, Collection<V>> map) {
        super(map);
    }
}
