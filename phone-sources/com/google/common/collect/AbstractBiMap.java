package com.google.common.collect;

import defpackage.a;
import defpackage.sij;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class AbstractBiMap<K, V> extends ForwardingMap<K, V> implements BiMap<K, V>, Serializable {
    private static final long serialVersionUID = 0;
    private transient Map<K, V> delegate;
    private transient Set<Map.Entry<K, V>> entrySet;
    transient AbstractBiMap<V, K> inverse;
    private transient Set<K> keySet;
    private transient Set<V> valueSet;

    /* compiled from: PG */
    class BiMapEntry extends ForwardingMapEntry<K, V> {
        private final Map.Entry<K, V> delegate;
        final /* synthetic */ AbstractBiMap this$0;

        public BiMapEntry(AbstractBiMap abstractBiMap, Map.Entry<K, V> entry) {
            abstractBiMap.getClass();
            this.this$0 = abstractBiMap;
            this.delegate = entry;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
        public Map.Entry<K, V> delegate() {
            return this.delegate;
        }

        @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
        public V setValue(V v) {
            this.this$0.checkValue(v);
            sij.x(this.this$0.entrySet().contains(this), "entry no longer in map");
            if (a.Q(v, getValue())) {
                return v;
            }
            sij.s(!this.this$0.containsValue(v), "value already present: %s", v);
            V value = this.delegate.setValue(v);
            sij.x(a.Q(v, this.this$0.get(getKey())), "entry no longer in map");
            this.this$0.updateInverseMap(getKey(), true, value, v);
            return value;
        }
    }

    /* compiled from: PG */
    class EntrySet extends ForwardingSet<Map.Entry<K, V>> {
        final Set<Map.Entry<K, V>> esDelegate;
        final /* synthetic */ AbstractBiMap this$0;

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.this$0.clear();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return Maps.containsEntryImpl(delegate(), obj);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return standardContainsAll(collection);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Set<Map.Entry<K, V>> delegate() {
            return this.esDelegate;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return this.this$0.entrySetIterator();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!this.esDelegate.contains(obj) || !(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            ((AbstractBiMap) this.this$0.inverse).delegate.remove(entry.getValue());
            this.esDelegate.remove(entry);
            return true;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return standardRemoveAll(collection);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return standardRetainAll(collection);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return standardToArray();
        }

        private EntrySet(AbstractBiMap abstractBiMap) {
            abstractBiMap.getClass();
            this.this$0 = abstractBiMap;
            this.esDelegate = abstractBiMap.delegate.entrySet();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) standardToArray(tArr);
        }
    }

    /* compiled from: PG */
    class Inverse<K, V> extends AbstractBiMap<K, V> {
        private static final long serialVersionUID = 0;

        public Inverse(Map<K, V> map, AbstractBiMap<V, K> abstractBiMap) {
            super(map, abstractBiMap);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            Object object = objectInputStream.readObject();
            object.getClass();
            setInverse((AbstractBiMap) object);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(inverse());
        }

        @Override // com.google.common.collect.AbstractBiMap
        public K checkKey(K k) {
            return this.inverse.checkValue(k);
        }

        @Override // com.google.common.collect.AbstractBiMap
        public V checkValue(V v) {
            return this.inverse.checkKey(v);
        }

        Object readResolve() {
            return inverse().inverse();
        }
    }

    /* compiled from: PG */
    class KeySet extends ForwardingSet<K> {
        final /* synthetic */ AbstractBiMap this$0;

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.this$0.clear();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return Maps.keyIterator(this.this$0.entrySet().iterator());
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            this.this$0.removeFromBothMaps(obj);
            return true;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return standardRemoveAll(collection);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return standardRetainAll(collection);
        }

        private KeySet(AbstractBiMap abstractBiMap) {
            abstractBiMap.getClass();
            this.this$0 = abstractBiMap;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Set<K> delegate() {
            return this.this$0.delegate.keySet();
        }
    }

    /* compiled from: PG */
    class ValueSet extends ForwardingSet<V> {
        final /* synthetic */ AbstractBiMap this$0;
        final Set<V> valuesDelegate;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Set<V> delegate() {
            return this.valuesDelegate;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<V> iterator() {
            return Maps.valueIterator(this.this$0.entrySet().iterator());
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return standardToArray();
        }

        @Override // com.google.common.collect.ForwardingObject
        public String toString() {
            return standardToString();
        }

        private ValueSet(AbstractBiMap abstractBiMap) {
            abstractBiMap.getClass();
            this.this$0 = abstractBiMap;
            this.valuesDelegate = abstractBiMap.inverse.keySet();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) standardToArray(tArr);
        }
    }

    private AbstractBiMap(Map<K, V> map, AbstractBiMap<V, K> abstractBiMap) {
        this.delegate = map;
        this.inverse = abstractBiMap;
    }

    private V putInBothMaps(K k, V v, boolean z) {
        checkKey(k);
        checkValue(v);
        boolean zContainsKey = containsKey(k);
        if (zContainsKey && a.Q(v, get(k))) {
            return v;
        }
        if (z) {
            inverse().remove(v);
        } else {
            sij.s(!containsValue(v), "value already present: %s", v);
        }
        V vPut = this.delegate.put(k, v);
        updateInverseMap(k, zContainsKey, vPut, v);
        return vPut;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V removeFromBothMaps(Object obj) {
        V vRemove = this.delegate.remove(obj);
        removeFromInverseMap(vRemove);
        return vRemove;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFromInverseMap(V v) {
        this.inverse.delegate.remove(v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateInverseMap(K k, boolean z, V v, V v2) {
        if (z) {
            removeFromInverseMap(v);
        }
        this.inverse.delegate.put(v2, k);
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public void clear() {
        this.delegate.clear();
        this.inverse.delegate.clear();
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public boolean containsValue(Object obj) {
        return this.inverse.containsKey(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public Map<K, V> delegate() {
        return this.delegate;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        EntrySet entrySet = new EntrySet();
        this.entrySet = entrySet;
        return entrySet;
    }

    public Iterator<Map.Entry<K, V>> entrySetIterator() {
        final Iterator<Map.Entry<K, V>> it = this.delegate.entrySet().iterator();
        return new Iterator<Map.Entry<K, V>>(this) { // from class: com.google.common.collect.AbstractBiMap.1
            Map.Entry<K, V> entry;
            final /* synthetic */ AbstractBiMap this$0;

            {
                this.getClass();
                this.this$0 = this;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                Map.Entry<K, V> entry = this.entry;
                if (entry == null) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                Iterator it2 = it;
                V value = entry.getValue();
                it2.remove();
                this.this$0.removeFromInverseMap(value);
                this.entry = null;
            }

            @Override // java.util.Iterator
            public Map.Entry<K, V> next() {
                this.entry = (Map.Entry) it.next();
                return new BiMapEntry(this.this$0, this.entry);
            }
        };
    }

    @Override // com.google.common.collect.BiMap
    public V forcePut(K k, V v) {
        return putInBothMaps(k, v, true);
    }

    @Override // com.google.common.collect.BiMap
    public BiMap<V, K> inverse() {
        return this.inverse;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        KeySet keySet = new KeySet();
        this.keySet = keySet;
        return keySet;
    }

    public AbstractBiMap<V, K> makeInverse(Map<V, K> map) {
        return new Inverse(map, this);
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    public V put(K k, V v) {
        return putInBothMaps(k, v, false);
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public V remove(Object obj) {
        if (containsKey(obj)) {
            return removeFromBothMaps(obj);
        }
        return null;
    }

    public void setDelegates(Map<K, V> map, Map<V, K> map2) {
        a.ab(this.delegate == null);
        a.ab(this.inverse == null);
        a.H(map.isEmpty());
        a.H(map2.isEmpty());
        a.H(map != map2);
        this.delegate = map;
        this.inverse = makeInverse(map2);
    }

    public void setInverse(AbstractBiMap<V, K> abstractBiMap) {
        this.inverse = abstractBiMap;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public Set<V> values() {
        Set<V> set = this.valueSet;
        if (set != null) {
            return set;
        }
        ValueSet valueSet = new ValueSet();
        this.valueSet = valueSet;
        return valueSet;
    }

    public AbstractBiMap(Map<K, V> map, Map<V, K> map2) {
        setDelegates(map, map2);
    }

    public K checkKey(K k) {
        return k;
    }

    public V checkValue(V v) {
        return v;
    }
}
