package com.google.common.collect;

import defpackage.a;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ForwardingMapEntry<K, V> extends ForwardingObject implements Map.Entry<K, V> {
    protected ForwardingMapEntry() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingObject
    public abstract Map.Entry<K, V> delegate();

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        return delegate().equals(obj);
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return delegate().getKey();
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return delegate().getValue();
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return delegate().hashCode();
    }

    public V setValue(V v) {
        return delegate().setValue(v);
    }

    protected boolean standardEquals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (a.Q(getKey(), entry.getKey()) && a.Q(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    protected int standardHashCode() {
        K key = getKey();
        V value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    protected String standardToString() {
        return String.valueOf(getKey()) + "=" + String.valueOf(getValue());
    }
}
