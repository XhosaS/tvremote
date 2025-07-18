package com.google.common.collect;

import com.google.common.collect.Maps;
import defpackage.sij;
import java.util.Comparator;
import java.util.SortedMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ForwardingSortedMap<K, V> extends ForwardingMap<K, V> implements SortedMap<K, V> {

    /* compiled from: PG */
    public class StandardKeySet extends Maps.SortedKeySet<K, V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StandardKeySet(ForwardingSortedMap forwardingSortedMap) {
            super(forwardingSortedMap);
            forwardingSortedMap.getClass();
        }
    }

    protected ForwardingSortedMap() {
    }

    static int unsafeCompare(Comparator<?> comparator, Object obj, Object obj2) {
        return comparator == null ? ((Comparable) obj).compareTo(obj2) : comparator.compare(obj, obj2);
    }

    @Override // java.util.SortedMap
    public Comparator<? super K> comparator() {
        return delegate().comparator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public abstract SortedMap<K, V> delegate();

    @Override // java.util.SortedMap
    public K firstKey() {
        return delegate().firstKey();
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> headMap(K k) {
        return delegate().headMap(k);
    }

    @Override // java.util.SortedMap
    public K lastKey() {
        return delegate().lastKey();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ForwardingMap
    protected boolean standardContainsKey(Object obj) {
        return unsafeCompare(comparator(), tailMap(obj).firstKey(), obj) == 0;
    }

    protected SortedMap<K, V> standardSubMap(K k, K k2) {
        sij.o(unsafeCompare(comparator(), k, k2) <= 0, "fromKey must be <= toKey");
        return tailMap(k).headMap(k2);
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> subMap(K k, K k2) {
        return delegate().subMap(k, k2);
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> tailMap(K k) {
        return delegate().tailMap(k);
    }
}
