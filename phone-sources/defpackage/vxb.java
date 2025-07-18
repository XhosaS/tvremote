package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vxb<K, V> implements Map.Entry<K, V>, yli {
    private final /* synthetic */ Map.Entry a;

    public vxb(Map.Entry entry) {
        entry.getClass();
        this.a = entry;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return (K) this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return (V) this.a.getValue();
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
