package com.google.common.collect;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ForwardingNavigableMap<K, V> extends ForwardingSortedMap<K, V> implements NavigableMap<K, V> {

    /* compiled from: PG */
    public class StandardDescendingMap extends Maps.DescendingMap<K, V> {
        final /* synthetic */ ForwardingNavigableMap this$0;

        public StandardDescendingMap(ForwardingNavigableMap forwardingNavigableMap) {
            forwardingNavigableMap.getClass();
            this.this$0 = forwardingNavigableMap;
        }

        @Override // com.google.common.collect.Maps.DescendingMap
        public Iterator<Map.Entry<K, V>> entryIterator() {
            return new Iterator<Map.Entry<K, V>>(this) { // from class: com.google.common.collect.ForwardingNavigableMap.StandardDescendingMap.1
                private Map.Entry<K, V> nextOrNull;
                final /* synthetic */ StandardDescendingMap this$1;
                private Map.Entry<K, V> toRemove;

                {
                    this.getClass();
                    this.this$1 = this;
                    this.toRemove = null;
                    this.nextOrNull = this.forward().lastEntry();
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return this.nextOrNull != null;
                }

                @Override // java.util.Iterator
                public void remove() {
                    if (this.toRemove == null) {
                        throw new IllegalStateException("no calls to next() since the last call to remove()");
                    }
                    this.this$1.forward().remove(this.toRemove.getKey());
                    this.toRemove = null;
                }

                @Override // java.util.Iterator
                public Map.Entry<K, V> next() {
                    Map.Entry<K, V> entry = this.nextOrNull;
                    if (entry == null) {
                        throw new NoSuchElementException();
                    }
                    this.toRemove = entry;
                    this.nextOrNull = this.this$1.forward().lowerEntry(this.nextOrNull.getKey());
                    return entry;
                }
            };
        }

        @Override // com.google.common.collect.Maps.DescendingMap
        public NavigableMap<K, V> forward() {
            return this.this$0;
        }
    }

    /* compiled from: PG */
    public class StandardNavigableKeySet extends Maps.NavigableKeySet<K, V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StandardNavigableKeySet(ForwardingNavigableMap forwardingNavigableMap) {
            super(forwardingNavigableMap);
            forwardingNavigableMap.getClass();
        }
    }

    protected ForwardingNavigableMap() {
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> ceilingEntry(K k) {
        return delegate().ceilingEntry(k);
    }

    @Override // java.util.NavigableMap
    public K ceilingKey(K k) {
        return delegate().ceilingKey(k);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingSortedMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public abstract NavigableMap<K, V> delegate();

    @Override // java.util.NavigableMap
    public NavigableSet<K> descendingKeySet() {
        return delegate().descendingKeySet();
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> descendingMap() {
        return delegate().descendingMap();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> firstEntry() {
        return delegate().firstEntry();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> floorEntry(K k) {
        return delegate().floorEntry(k);
    }

    @Override // java.util.NavigableMap
    public K floorKey(K k) {
        return delegate().floorKey(k);
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> headMap(K k, boolean z) {
        return delegate().headMap(k, z);
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> higherEntry(K k) {
        return delegate().higherEntry(k);
    }

    @Override // java.util.NavigableMap
    public K higherKey(K k) {
        return delegate().higherKey(k);
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> lastEntry() {
        return delegate().lastEntry();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> lowerEntry(K k) {
        return delegate().lowerEntry(k);
    }

    @Override // java.util.NavigableMap
    public K lowerKey(K k) {
        return delegate().lowerKey(k);
    }

    @Override // java.util.NavigableMap
    public NavigableSet<K> navigableKeySet() {
        return delegate().navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> pollFirstEntry() {
        return delegate().pollFirstEntry();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> pollLastEntry() {
        return delegate().pollLastEntry();
    }

    protected Map.Entry<K, V> standardCeilingEntry(K k) {
        return tailMap(k, true).firstEntry();
    }

    protected K standardCeilingKey(K k) {
        return (K) Maps.keyOrNull(ceilingEntry(k));
    }

    protected NavigableSet<K> standardDescendingKeySet() {
        return descendingMap().navigableKeySet();
    }

    protected Map.Entry<K, V> standardFirstEntry() {
        return (Map.Entry) Iterables.getFirst(entrySet(), null);
    }

    protected K standardFirstKey() {
        Map.Entry<K, V> entryFirstEntry = firstEntry();
        if (entryFirstEntry != null) {
            return entryFirstEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    protected Map.Entry<K, V> standardFloorEntry(K k) {
        return headMap(k, true).lastEntry();
    }

    protected K standardFloorKey(K k) {
        return (K) Maps.keyOrNull(floorEntry(k));
    }

    protected SortedMap<K, V> standardHeadMap(K k) {
        return headMap(k, false);
    }

    protected Map.Entry<K, V> standardHigherEntry(K k) {
        return tailMap(k, false).firstEntry();
    }

    protected K standardHigherKey(K k) {
        return (K) Maps.keyOrNull(higherEntry(k));
    }

    protected Map.Entry<K, V> standardLastEntry() {
        return (Map.Entry) Iterables.getFirst(descendingMap().entrySet(), null);
    }

    protected K standardLastKey() {
        Map.Entry<K, V> entryLastEntry = lastEntry();
        if (entryLastEntry != null) {
            return entryLastEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    protected Map.Entry<K, V> standardLowerEntry(K k) {
        return headMap(k, false).lastEntry();
    }

    protected K standardLowerKey(K k) {
        return (K) Maps.keyOrNull(lowerEntry(k));
    }

    protected Map.Entry<K, V> standardPollFirstEntry() {
        return (Map.Entry) Iterators.pollNext(entrySet().iterator());
    }

    protected Map.Entry<K, V> standardPollLastEntry() {
        return (Map.Entry) Iterators.pollNext(descendingMap().entrySet().iterator());
    }

    @Override // com.google.common.collect.ForwardingSortedMap
    protected SortedMap<K, V> standardSubMap(K k, K k2) {
        return subMap(k, true, k2, false);
    }

    protected SortedMap<K, V> standardTailMap(K k) {
        return tailMap(k, true);
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> subMap(K k, boolean z, K k2, boolean z2) {
        return delegate().subMap(k, z, k2, z2);
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> tailMap(K k, boolean z) {
        return delegate().tailMap(k, z);
    }
}
