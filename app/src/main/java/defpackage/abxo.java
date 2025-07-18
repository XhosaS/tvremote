package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
class abxo implements Map.Entry {
    final /* synthetic */ abxr a;
    private final Map.Entry b;

    public abxo(abxr abxrVar, Map.Entry entry) {
        this.a = abxrVar;
        this.b = entry;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof Map.Entry) && getKey().equals(((Map.Entry) obj).getKey()) && getValue().equals(getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.a.a.a((Integer) this.b.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        abxn abxnVar = this.a.a;
        Object value = this.b.setValue(abxnVar.b((abxf) obj));
        if (value == null) {
            return null;
        }
        return abxnVar.a((Integer) value);
    }
}
