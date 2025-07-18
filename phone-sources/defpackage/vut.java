package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vut<K> implements Map.Entry<K, Object> {
    public final Map.Entry a;

    public vut(Map.Entry entry) {
        this.a = entry;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return (K) this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((vuv) this.a.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof vvj)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        vuv vuvVar = (vuv) this.a.getValue();
        vvj vvjVar = vuvVar.a;
        vuvVar.b = null;
        vuvVar.a = (vvj) obj;
        return vvjVar;
    }
}
