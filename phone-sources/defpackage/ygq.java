package defpackage;

import j$.util.Map;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class ygq<K, V> implements Map<K, V>, j$.util.Map<K, V>, yli {
    protected ygq() {
    }

    private final Map.Entry b(Object obj) {
        Object next;
        Iterator it = d().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (yks.e(((Map.Entry) next).getKey(), obj)) {
                break;
            }
        }
        return (Map.Entry) next;
    }

    public int a() {
        throw null;
    }

    public Collection c() {
        throw null;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public final V compute(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public final V computeIfAbsent(K k, Function<? super K, ? extends V> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public final V computeIfPresent(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return b(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set setD = d();
        if (setD.isEmpty()) {
            return false;
        }
        Iterator it = setD.iterator();
        while (it.hasNext()) {
            if (yks.e(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Set d();

    public Set e() {
        throw null;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return d();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (a() != map.size()) {
            return false;
        }
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return true;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (entry == null) {
                return false;
            }
            Object key = entry.getKey();
            Object value = entry.getValue();
            V v = get(key);
            if (!yks.e(value, v)) {
                return false;
            }
            if (v == null && !containsKey(key)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public V get(Object obj) {
        Map.Entry entryB = b(obj);
        if (entryB != null) {
            return (V) entryB.getValue();
        }
        return null;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    public final String h(Object obj) {
        return obj == this ? "(this Map)" : String.valueOf(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return d().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return a() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return e();
    }

    @Override // java.util.Map, j$.util.Map
    public final V merge(K k, V v, BiFunction<? super V, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public final V putIfAbsent(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public final V replace(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public final void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return a();
    }

    public final String toString() {
        return yfm.ax(d(), ", ", "{", "}", new psn(this, 20), 24);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return c();
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean replace(K k, V v, V v2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
