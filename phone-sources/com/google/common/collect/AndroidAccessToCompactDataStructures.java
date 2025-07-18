package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AndroidAccessToCompactDataStructures {
    private AndroidAccessToCompactDataStructures() {
    }

    public static <K, V> Map<K, V> newCompactHashMap() {
        return CompactHashMap.create();
    }

    public static <E> Set<E> newCompactHashSet() {
        return CompactHashSet.create();
    }

    public static <K, V> Map<K, V> newCompactLinkedHashMap() {
        return CompactLinkedHashMap.create();
    }

    public static <E> Set<E> newCompactLinkedHashSet() {
        return CompactLinkedHashSet.create();
    }

    public static <K, V> Map<K, V> newCompactHashMap(int i) {
        return CompactHashMap.createWithExpectedSize(i);
    }

    public static <E> Set<E> newCompactHashSet(int i) {
        return CompactHashSet.createWithExpectedSize(i);
    }

    public static <K, V> Map<K, V> newCompactLinkedHashMap(int i) {
        return CompactLinkedHashMap.createWithExpectedSize(i);
    }

    public static <E> Set<E> newCompactLinkedHashSet(int i) {
        return CompactLinkedHashSet.createWithExpectedSize(i);
    }

    public static <E> Set<E> newCompactHashSet(Collection<? extends E> collection) {
        return CompactHashSet.create(collection);
    }

    public static <E> Set<E> newCompactLinkedHashSet(Collection<? extends E> collection) {
        return CompactLinkedHashSet.create((Collection) collection);
    }

    @SafeVarargs
    public static <E> Set<E> newCompactHashSet(E... eArr) {
        return CompactHashSet.create(eArr);
    }

    @SafeVarargs
    public static <E> Set<E> newCompactLinkedHashSet(E... eArr) {
        return CompactLinkedHashSet.create((Object[]) eArr);
    }
}
