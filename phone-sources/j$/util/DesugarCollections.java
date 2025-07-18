package j$.util;

import java.util.RandomAccess;
import java.util.SortedMap;

/* loaded from: classes4.dex */
public class DesugarCollections {
    public static <T> java.util.List<T> synchronizedList(java.util.List<T> list) {
        return list instanceof RandomAccess ? new C0101i(list) : new C0099g(list);
    }

    public static <K, V> java.util.Map<K, V> synchronizedMap(java.util.Map<K, V> map) {
        return new C0100h(map);
    }

    public static <T> java.util.Set<T> synchronizedSet(java.util.Set<T> set) {
        return new C0102j(set);
    }

    public static <T> java.util.Collection<T> unmodifiableCollection(java.util.Collection<? extends T> collection) {
        return new C0104l(collection);
    }

    public static <T> java.util.List<T> unmodifiableList(java.util.List<? extends T> list) {
        return list instanceof RandomAccess ? new r(list) : new C0106n(list);
    }

    public static <K, V> java.util.Map<K, V> unmodifiableMap(java.util.Map<? extends K, ? extends V> map) {
        return new C0109q(map);
    }

    public static <T> java.util.Set<T> unmodifiableSet(java.util.Set<? extends T> set) {
        return new C0110s(set);
    }

    public static <K, V> SortedMap<K, V> unmodifiableSortedMap(SortedMap<K, ? extends V> sortedMap) {
        return new C0162t(sortedMap);
    }

    public static <T> java.util.SortedSet<T> unmodifiableSortedSet(java.util.SortedSet<T> sortedSet) {
        return new C0163u(sortedSet);
    }
}
