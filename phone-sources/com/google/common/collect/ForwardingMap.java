package com.google.common.collect;

import com.google.common.collect.Maps;
import defpackage.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ForwardingMap<K, V> extends ForwardingObject implements Map<K, V> {

    /* compiled from: PG */
    public abstract class StandardEntrySet extends Maps.EntrySet<K, V> {
        final /* synthetic */ ForwardingMap this$0;

        protected StandardEntrySet(ForwardingMap forwardingMap) {
            forwardingMap.getClass();
            this.this$0 = forwardingMap;
        }

        @Override // com.google.common.collect.Maps.EntrySet
        public Map<K, V> map() {
            return this.this$0;
        }
    }

    /* compiled from: PG */
    public class StandardKeySet extends Maps.KeySet<K, V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StandardKeySet(ForwardingMap forwardingMap) {
            super(forwardingMap);
            forwardingMap.getClass();
        }
    }

    /* compiled from: PG */
    public class StandardValues extends Maps.Values<K, V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StandardValues(ForwardingMap forwardingMap) {
            super(forwardingMap);
            forwardingMap.getClass();
        }
    }

    protected ForwardingMap() {
    }

    public void clear() {
        delegate().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return delegate().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return delegate().containsValue(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingObject
    public abstract Map<K, V> delegate();

    public Set<Map.Entry<K, V>> entrySet() {
        return delegate().entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return obj == this || delegate().equals(obj);
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return delegate().get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return delegate().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    public Set<K> keySet() {
        return delegate().keySet();
    }

    public V put(K k, V v) {
        return delegate().put(k, v);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        delegate().putAll(map);
    }

    public V remove(Object obj) {
        return delegate().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return delegate().size();
    }

    protected void standardClear() {
        Iterators.clear(entrySet().iterator());
    }

    protected boolean standardContainsKey(Object obj) {
        return Maps.containsKeyImpl(this, obj);
    }

    protected boolean standardContainsValue(Object obj) {
        return Maps.containsValueImpl(this, obj);
    }

    protected boolean standardEquals(Object obj) {
        return Maps.equalsImpl(this, obj);
    }

    protected int standardHashCode() {
        return Sets.hashCodeImpl(entrySet());
    }

    protected boolean standardIsEmpty() {
        return !entrySet().iterator().hasNext();
    }

    protected void standardPutAll(Map<? extends K, ? extends V> map) {
        Maps.putAllImpl(this, map);
    }

    protected V standardRemove(Object obj) {
        Iterator<Map.Entry<K, V>> it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (a.Q(next.getKey(), obj)) {
                V value = next.getValue();
                it.remove();
                return value;
            }
        }
        return null;
    }

    protected String standardToString() {
        return Maps.toStringImpl(this);
    }

    public Collection<V> values() {
        return delegate().values();
    }
}
