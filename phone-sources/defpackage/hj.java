package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hj<K, V> implements Map.Entry<K, V> {
    public final Object a;
    public final Object b;
    hj c;
    public hj d;

    public hj(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hj)) {
            return false;
        }
        hj hjVar = (hj) obj;
        return this.a.equals(hjVar.a) && this.b.equals(hjVar.b);
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
    public final int hashCode() {
        Object obj = this.b;
        return obj.hashCode() ^ this.a.hashCode();
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.a + "=" + this.b;
    }
}
