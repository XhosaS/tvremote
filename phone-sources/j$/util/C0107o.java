package j$.util;

import java.util.Map;

/* renamed from: j$.util.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0107o implements Map.Entry {
    public final Map.Entry a;

    public C0107o(Map.Entry entry) {
        entry.getClass();
        this.a = entry;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Map.Entry entry2 = this.a;
                Object key = entry2.getKey();
                Object key2 = entry.getKey();
                if (key == null ? key2 == null : key.equals(key2)) {
                    Object value = entry2.getValue();
                    Object value2 = entry.getValue();
                    if (value == null ? value2 == null : value.equals(value2)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.a.getValue();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return this.a.toString();
    }
}
