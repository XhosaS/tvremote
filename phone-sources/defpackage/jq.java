package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jq<K, V> implements Map.Entry<K, V>, yli {
    private final Object a;
    private final Object b;

    public jq(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return (K) this.a;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return (V) this.b;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
