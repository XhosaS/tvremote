package com.google.common.collect;

import android.support.v7.widget.ActivityChooserView;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.MapDifference;
import com.google.common.collect.Sets;
import defpackage.a;
import defpackage.sij;
import defpackage.tsg;
import defpackage.tsh;
import defpackage.tsk;
import defpackage.tsl;
import defpackage.tsv;
import defpackage.tsx;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.stream.Collector;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class Maps {

    /* compiled from: PG */
    abstract class AbstractFilteredMap<K, V> extends ViewCachingAbstractMap<K, V> {
        final tsv<? super Map.Entry<K, V>> predicate;
        final Map<K, V> unfiltered;

        public AbstractFilteredMap(Map<K, V> map, tsv<? super Map.Entry<K, V>> tsvVar) {
            this.unfiltered = map;
            this.predicate = tsvVar;
        }

        public boolean apply(Object obj, V v) {
            return this.predicate.apply(Maps.immutableEntry(obj, v));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.unfiltered.containsKey(obj) && apply(obj, this.unfiltered.get(obj));
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public Collection<V> createValues() {
            return new FilteredMapValues(this, this.unfiltered, this.predicate);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            V v = this.unfiltered.get(obj);
            if (v == null || !apply(obj, v)) {
                return null;
            }
            return v;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return entrySet().isEmpty();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k, V v) {
            a.H(apply(k, v));
            return this.unfiltered.put(k, v);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
                a.H(apply(entry.getKey(), entry.getValue()));
            }
            this.unfiltered.putAll(map);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
            if (containsKey(obj)) {
                return this.unfiltered.remove(obj);
            }
            return null;
        }
    }

    /* compiled from: PG */
    class AsMapView<K, V> extends ViewCachingAbstractMap<K, V> {
        final tsl<? super K, V> function;
        private final Set<K> set;

        public AsMapView(Set<K> set, tsl<? super K, V> tslVar) {
            set.getClass();
            this.set = set;
            tslVar.getClass();
            this.function = tslVar;
        }

        public Set<K> backingSet() {
            return this.set;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            backingSet().clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return backingSet().contains(obj);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public Set<Map.Entry<K, V>> createEntrySet() {
            return new EntrySet<K, V>(this) { // from class: com.google.common.collect.Maps.AsMapView.1EntrySetImpl
                final /* synthetic */ AsMapView this$0;

                {
                    this.getClass();
                    this.this$0 = this;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator<Map.Entry<K, V>> iterator() {
                    AsMapView asMapView = this.this$0;
                    return Maps.asMapEntryIterator(asMapView.backingSet(), asMapView.function);
                }

                @Override // com.google.common.collect.Maps.EntrySet
                public Map<K, V> map() {
                    return this.this$0;
                }
            };
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public Set<K> createKeySet() {
            return Maps.removeOnlySet(backingSet());
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public Collection<V> createValues() {
            return Collections2.transform(this.set, this.function);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            if (Collections2.safeContains(backingSet(), obj)) {
                return this.function.apply(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
            if (backingSet().remove(obj)) {
                return this.function.apply(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return backingSet().size();
        }
    }

    /* compiled from: PG */
    final class BiMapConverter<A, B> extends tsg<A, B> implements Serializable {
        private static final long serialVersionUID = 0;
        private final BiMap<A, B> bimap;

        public BiMapConverter(BiMap<A, B> biMap) {
            biMap.getClass();
            this.bimap = biMap;
        }

        private static <X, Y> Y convert(BiMap<X, Y> biMap, X x) {
            Y y = biMap.get(x);
            sij.s(y != null, "No non-null mapping present for input: %s", x);
            return y;
        }

        @Override // defpackage.tsg
        protected A doBackward(B b) {
            return (A) convert(this.bimap.inverse(), b);
        }

        @Override // defpackage.tsg
        protected B doForward(A a) {
            return (B) convert(this.bimap, a);
        }

        @Override // defpackage.tsg, defpackage.tsl
        public boolean equals(Object obj) {
            if (obj instanceof BiMapConverter) {
                return this.bimap.equals(((BiMapConverter) obj).bimap);
            }
            return false;
        }

        public int hashCode() {
            return this.bimap.hashCode();
        }

        public String toString() {
            return "Maps.asConverter(" + String.valueOf(this.bimap) + ")";
        }
    }

    /* compiled from: PG */
    abstract class DescendingMap<K, V> extends ForwardingMap<K, V> implements NavigableMap<K, V> {
        private transient Comparator<? super K> comparator;
        private transient Set<Map.Entry<K, V>> entrySet;
        private transient NavigableSet<K> navigableKeySet;

        private static <T> Ordering<T> reverse(Comparator<T> comparator) {
            return Ordering.from(comparator).reverse();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> ceilingEntry(K k) {
            return forward().floorEntry(k);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k) {
            return forward().floorKey(k);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            Comparator<? super K> comparator = this.comparator;
            if (comparator != null) {
                return comparator;
            }
            Comparator<? super K> comparator2 = forward().comparator();
            if (comparator2 == null) {
                comparator2 = Ordering.natural();
            }
            Ordering orderingReverse = reverse(comparator2);
            this.comparator = orderingReverse;
            return orderingReverse;
        }

        public Set<Map.Entry<K, V>> createEntrySet() {
            return new EntrySet<K, V>(this) { // from class: com.google.common.collect.Maps.DescendingMap.1EntrySetImpl
                final /* synthetic */ DescendingMap this$0;

                {
                    this.getClass();
                    this.this$0 = this;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator<Map.Entry<K, V>> iterator() {
                    return this.this$0.entryIterator();
                }

                @Override // com.google.common.collect.Maps.EntrySet
                public Map<K, V> map() {
                    return this.this$0;
                }
            };
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return forward().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            return forward();
        }

        public abstract Iterator<Map.Entry<K, V>> entryIterator();

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.entrySet;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> setCreateEntrySet = createEntrySet();
            this.entrySet = setCreateEntrySet;
            return setCreateEntrySet;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> firstEntry() {
            return forward().lastEntry();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return forward().lastKey();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> floorEntry(K k) {
            return forward().ceilingEntry(k);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k) {
            return forward().ceilingKey(k);
        }

        public abstract NavigableMap<K, V> forward();

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> headMap(K k) {
            return headMap(k, false);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> higherEntry(K k) {
            return forward().lowerEntry(k);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k) {
            return forward().lowerKey(k);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lastEntry() {
            return forward().firstEntry();
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return forward().firstKey();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lowerEntry(K k) {
            return forward().higherEntry(k);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k) {
            return forward().higherKey(k);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            NavigableSet<K> navigableSet = this.navigableKeySet;
            if (navigableSet != null) {
                return navigableSet;
            }
            NavigableKeySet navigableKeySet = new NavigableKeySet(this);
            this.navigableKeySet = navigableKeySet;
            return navigableKeySet;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> pollFirstEntry() {
            return forward().pollLastEntry();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> pollLastEntry() {
            return forward().pollFirstEntry();
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> subMap(K k, K k2) {
            return subMap(k, true, k2, false);
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> tailMap(K k) {
            return tailMap(k, true);
        }

        @Override // com.google.common.collect.ForwardingObject
        public String toString() {
            return standardToString();
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public Collection<V> values() {
            return new Values(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public final Map<K, V> delegate() {
            return forward();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(K k, boolean z) {
            return forward().tailMap(k, z).descendingMap();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(K k, boolean z, K k2, boolean z2) {
            return forward().subMap(k2, z2, k, z).descendingMap();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(K k, boolean z) {
            return forward().headMap(k, z).descendingMap();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PG */
    abstract class EntryFunction implements tsl<Map.Entry<?, ?>, Object> {
        private static final /* synthetic */ EntryFunction[] $VALUES = $values();
        public static final EntryFunction KEY;
        public static final EntryFunction VALUE;

        /* compiled from: PG */
        /* renamed from: com.google.common.collect.Maps$EntryFunction$1, reason: invalid class name */
        enum AnonymousClass1 extends EntryFunction {
            private AnonymousClass1(String str, int i) {
                super(str, i);
            }

            @Override // defpackage.tsl
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        }

        /* compiled from: PG */
        /* renamed from: com.google.common.collect.Maps$EntryFunction$2, reason: invalid class name */
        enum AnonymousClass2 extends EntryFunction {
            private AnonymousClass2(String str, int i) {
                super(str, i);
            }

            @Override // defpackage.tsl
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }

        private static /* synthetic */ EntryFunction[] $values() {
            return new EntryFunction[]{KEY, VALUE};
        }

        static {
            KEY = new AnonymousClass1("KEY", 0);
            VALUE = new AnonymousClass2("VALUE", 1);
        }

        public static EntryFunction valueOf(String str) {
            return (EntryFunction) Enum.valueOf(EntryFunction.class, str);
        }

        public static EntryFunction[] values() {
            return (EntryFunction[]) $VALUES.clone();
        }

        private EntryFunction(String str, int i) {
        }
    }

    /* compiled from: PG */
    abstract class EntrySet<K, V> extends Sets.ImprovedAbstractSet<Map.Entry<K, V>> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            map().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object objSafeGet = Maps.safeGet(map(), key);
                if (a.Q(objSafeGet, entry.getValue())) {
                    return objSafeGet != null || map().containsKey(key);
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return map().isEmpty();
        }

        public abstract Map<K, V> map();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (contains(obj) && (obj instanceof Map.Entry)) {
                return map().keySet().remove(((Map.Entry) obj).getKey());
            }
            return false;
        }

        @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            try {
                collection.getClass();
                return super.removeAll(collection);
            } catch (UnsupportedOperationException unused) {
                return Sets.removeAllImpl(this, collection.iterator());
            }
        }

        @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            try {
                collection.getClass();
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetNewHashSetWithExpectedSize = Sets.newHashSetWithExpectedSize(collection.size());
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        hashSetNewHashSetWithExpectedSize.add(((Map.Entry) obj).getKey());
                    }
                }
                return map().keySet().retainAll(hashSetNewHashSetWithExpectedSize);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return map().size();
        }
    }

    /* compiled from: PG */
    public interface EntryTransformer<K, V1, V2> {
        V2 transformEntry(K k, V1 v1);
    }

    /* compiled from: PG */
    final class FilteredEntryBiMap<K, V> extends FilteredEntryMap<K, V> implements BiMap<K, V> {
        private final BiMap<V, K> inverse;

        public FilteredEntryBiMap(BiMap<K, V> biMap, tsv<? super Map.Entry<K, V>> tsvVar) {
            super(biMap, tsvVar);
            this.inverse = new FilteredEntryBiMap(biMap.inverse(), inversePredicate(tsvVar), this);
        }

        private static <K, V> tsv<Map.Entry<V, K>> inversePredicate(final tsv<? super Map.Entry<K, V>> tsvVar) {
            return new tsv() { // from class: com.google.common.collect.Maps$FilteredEntryBiMap$$ExternalSyntheticLambda0
                @Override // defpackage.tsv
                public final boolean apply(Object obj) {
                    Map.Entry entry = (Map.Entry) obj;
                    return tsvVar.apply(Maps.immutableEntry(entry.getValue(), entry.getKey()));
                }
            };
        }

        @Override // com.google.common.collect.BiMap
        public V forcePut(K k, V v) {
            a.H(apply(k, v));
            return unfiltered().forcePut(k, v);
        }

        @Override // com.google.common.collect.BiMap
        public BiMap<V, K> inverse() {
            return this.inverse;
        }

        public BiMap<K, V> unfiltered() {
            return (BiMap) this.unfiltered;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public Set<V> values() {
            return this.inverse.keySet();
        }

        private FilteredEntryBiMap(BiMap<K, V> biMap, tsv<? super Map.Entry<K, V>> tsvVar, BiMap<V, K> biMap2) {
            super(biMap, tsvVar);
            this.inverse = biMap2;
        }
    }

    /* compiled from: PG */
    class FilteredEntryMap<K, V> extends AbstractFilteredMap<K, V> {
        final Set<Map.Entry<K, V>> filteredEntrySet;

        /* compiled from: PG */
        class EntrySet extends ForwardingSet<Map.Entry<K, V>> {
            final /* synthetic */ FilteredEntryMap this$0;

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return new TransformedIterator<Map.Entry<K, V>, Map.Entry<K, V>>(this, this.this$0.filteredEntrySet.iterator()) { // from class: com.google.common.collect.Maps.FilteredEntryMap.EntrySet.1
                    final /* synthetic */ EntrySet this$1;

                    {
                        this.getClass();
                        this.this$1 = this;
                    }

                    @Override // com.google.common.collect.TransformedIterator
                    public Map.Entry<K, V> transform(final Map.Entry<K, V> entry) {
                        return new ForwardingMapEntry<K, V>(this) { // from class: com.google.common.collect.Maps.FilteredEntryMap.EntrySet.1.1
                            final /* synthetic */ AnonymousClass1 this$2;

                            {
                                this.getClass();
                                this.this$2 = this;
                            }

                            /* JADX INFO: Access modifiers changed from: protected */
                            @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
                            public Map.Entry<K, V> delegate() {
                                return entry;
                            }

                            @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
                            public V setValue(V v) {
                                a.H(this.this$2.this$1.this$0.apply(getKey(), v));
                                return (V) super.setValue(v);
                            }
                        };
                    }
                };
            }

            private EntrySet(FilteredEntryMap filteredEntryMap) {
                filteredEntryMap.getClass();
                this.this$0 = filteredEntryMap;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
            public Set<Map.Entry<K, V>> delegate() {
                return this.this$0.filteredEntrySet;
            }
        }

        /* compiled from: PG */
        class KeySet extends KeySet<K, V> {
            final /* synthetic */ FilteredEntryMap this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public KeySet(FilteredEntryMap filteredEntryMap) {
                super(filteredEntryMap);
                filteredEntryMap.getClass();
                this.this$0 = filteredEntryMap;
            }

            @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!this.this$0.containsKey(obj)) {
                    return false;
                }
                this.this$0.unfiltered.remove(obj);
                return true;
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                FilteredEntryMap filteredEntryMap = this.this$0;
                return FilteredEntryMap.removeAllKeys(filteredEntryMap.unfiltered, filteredEntryMap.predicate, collection);
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                FilteredEntryMap filteredEntryMap = this.this$0;
                return FilteredEntryMap.retainAllKeys(filteredEntryMap.unfiltered, filteredEntryMap.predicate, collection);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public Object[] toArray() {
                return Lists.newArrayList(iterator()).toArray();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public <T> T[] toArray(T[] tArr) {
                return (T[]) Lists.newArrayList(iterator()).toArray(tArr);
            }
        }

        public FilteredEntryMap(Map<K, V> map, tsv<? super Map.Entry<K, V>> tsvVar) {
            super(map, tsvVar);
            this.filteredEntrySet = Sets.filter(map.entrySet(), this.predicate);
        }

        static <K, V> boolean removeAllKeys(Map<K, V> map, tsv<? super Map.Entry<K, V>> tsvVar, Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (tsvVar.apply(next) && collection.contains(next.getKey())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        static <K, V> boolean retainAllKeys(Map<K, V> map, tsv<? super Map.Entry<K, V>> tsvVar, Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (tsvVar.apply(next) && !collection.contains(next.getKey())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public Set<Map.Entry<K, V>> createEntrySet() {
            return new EntrySet();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public Set<K> createKeySet() {
            return new KeySet(this);
        }
    }

    /* compiled from: PG */
    class FilteredEntryNavigableMap<K, V> extends AbstractNavigableMap<K, V> {
        private final tsv<? super Map.Entry<K, V>> entryPredicate;
        private final Map<K, V> filteredDelegate;
        private final NavigableMap<K, V> unfiltered;

        public FilteredEntryNavigableMap(NavigableMap<K, V> navigableMap, tsv<? super Map.Entry<K, V>> tsvVar) {
            navigableMap.getClass();
            this.unfiltered = navigableMap;
            this.entryPredicate = tsvVar;
            this.filteredDelegate = new FilteredEntryMap(navigableMap, tsvVar);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.filteredDelegate.clear();
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return this.unfiltered.comparator();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.filteredDelegate.containsKey(obj);
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        public Iterator<Map.Entry<K, V>> descendingEntryIterator() {
            return Iterators.filter(this.unfiltered.descendingMap().entrySet().iterator(), this.entryPredicate);
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            return Maps.filterEntries((NavigableMap) this.unfiltered.descendingMap(), (tsv) this.entryPredicate);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public Iterator<Map.Entry<K, V>> entryIterator() {
            return Iterators.filter(this.unfiltered.entrySet().iterator(), this.entryPredicate);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set<Map.Entry<K, V>> entrySet() {
            return this.filteredDelegate.entrySet();
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            return this.filteredDelegate.get(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(K k, boolean z) {
            return Maps.filterEntries((NavigableMap) this.unfiltered.headMap(k, z), (tsv) this.entryPredicate);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return !Iterables.any(this.unfiltered.entrySet(), this.entryPredicate);
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return new NavigableKeySet<K, V>(this, this) { // from class: com.google.common.collect.Maps.FilteredEntryNavigableMap.1
                final /* synthetic */ FilteredEntryNavigableMap this$0;

                {
                    this.getClass();
                    this.this$0 = this;
                }

                @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean removeAll(Collection<?> collection) {
                    FilteredEntryNavigableMap filteredEntryNavigableMap = this.this$0;
                    return FilteredEntryMap.removeAllKeys(filteredEntryNavigableMap.unfiltered, filteredEntryNavigableMap.entryPredicate, collection);
                }

                @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean retainAll(Collection<?> collection) {
                    FilteredEntryNavigableMap filteredEntryNavigableMap = this.this$0;
                    return FilteredEntryMap.retainAllKeys(filteredEntryNavigableMap.unfiltered, filteredEntryNavigableMap.entryPredicate, collection);
                }
            };
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public Map.Entry<K, V> pollFirstEntry() {
            return (Map.Entry) Iterables.removeFirstMatching(this.unfiltered.entrySet(), this.entryPredicate);
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public Map.Entry<K, V> pollLastEntry() {
            return (Map.Entry) Iterables.removeFirstMatching(this.unfiltered.descendingMap().entrySet(), this.entryPredicate);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k, V v) {
            return this.filteredDelegate.put(k, v);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            this.filteredDelegate.putAll(map);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
            return this.filteredDelegate.remove(obj);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.filteredDelegate.size();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(K k, boolean z, K k2, boolean z2) {
            return Maps.filterEntries((NavigableMap) this.unfiltered.subMap(k, z, k2, z2), (tsv) this.entryPredicate);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(K k, boolean z) {
            return Maps.filterEntries((NavigableMap) this.unfiltered.tailMap(k, z), (tsv) this.entryPredicate);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Collection<V> values() {
            return new FilteredMapValues(this, this.unfiltered, this.entryPredicate);
        }
    }

    /* compiled from: PG */
    class FilteredEntrySortedMap<K, V> extends FilteredEntryMap<K, V> implements SortedMap<K, V> {

        /* compiled from: PG */
        class SortedKeySet extends FilteredEntryMap<K, V>.KeySet implements SortedSet<K> {
            final /* synthetic */ FilteredEntrySortedMap this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SortedKeySet(FilteredEntrySortedMap filteredEntrySortedMap) {
                super(filteredEntrySortedMap);
                filteredEntrySortedMap.getClass();
                this.this$0 = filteredEntrySortedMap;
            }

            @Override // java.util.SortedSet
            public Comparator<? super K> comparator() {
                return this.this$0.sortedMap().comparator();
            }

            @Override // java.util.SortedSet
            public K first() {
                return (K) this.this$0.firstKey();
            }

            @Override // java.util.SortedSet
            public SortedSet<K> headSet(K k) {
                return (SortedSet) this.this$0.headMap(k).keySet();
            }

            @Override // java.util.SortedSet
            public K last() {
                return (K) this.this$0.lastKey();
            }

            @Override // java.util.SortedSet
            public SortedSet<K> subSet(K k, K k2) {
                return (SortedSet) this.this$0.subMap(k, k2).keySet();
            }

            @Override // java.util.SortedSet
            public SortedSet<K> tailSet(K k) {
                return (SortedSet) this.this$0.tailMap(k).keySet();
            }
        }

        public FilteredEntrySortedMap(SortedMap<K, V> sortedMap, tsv<? super Map.Entry<K, V>> tsvVar) {
            super(sortedMap, tsvVar);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return sortedMap().comparator();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return keySet().iterator().next();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> headMap(K k) {
            return new FilteredEntrySortedMap(sortedMap().headMap(k), this.predicate);
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            SortedMap<K, V> sortedMap = sortedMap();
            while (true) {
                Map<K, V> map = this.unfiltered;
                K kLastKey = sortedMap.lastKey();
                if (apply(kLastKey, map.get(kLastKey))) {
                    return kLastKey;
                }
                sortedMap = sortedMap().headMap(kLastKey);
            }
        }

        public SortedMap<K, V> sortedMap() {
            return (SortedMap) this.unfiltered;
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> subMap(K k, K k2) {
            return new FilteredEntrySortedMap(sortedMap().subMap(k, k2), this.predicate);
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> tailMap(K k) {
            return new FilteredEntrySortedMap(sortedMap().tailMap(k), this.predicate);
        }

        @Override // com.google.common.collect.Maps.FilteredEntryMap, com.google.common.collect.Maps.ViewCachingAbstractMap
        public SortedSet<K> createKeySet() {
            return new SortedKeySet(this);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public SortedSet<K> keySet() {
            return (SortedSet) super.keySet();
        }
    }

    /* compiled from: PG */
    class FilteredKeyMap<K, V> extends AbstractFilteredMap<K, V> {
        final tsv<? super K> keyPredicate;

        public FilteredKeyMap(Map<K, V> map, tsv<? super K> tsvVar, tsv<? super Map.Entry<K, V>> tsvVar2) {
            super(map, tsvVar2);
            this.keyPredicate = tsvVar;
        }

        @Override // com.google.common.collect.Maps.AbstractFilteredMap, java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.unfiltered.containsKey(obj) && this.keyPredicate.apply(obj);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public Set<Map.Entry<K, V>> createEntrySet() {
            return Sets.filter(this.unfiltered.entrySet(), this.predicate);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public Set<K> createKeySet() {
            return Sets.filter(this.unfiltered.keySet(), this.keyPredicate);
        }
    }

    /* compiled from: PG */
    final class FilteredMapValues<K, V> extends Values<K, V> {
        final tsv<? super Map.Entry<K, V>> predicate;
        final Map<K, V> unfiltered;

        public FilteredMapValues(Map<K, V> map, Map<K, V> map2, tsv<? super Map.Entry<K, V>> tsvVar) {
            super(map);
            this.unfiltered = map2;
            this.predicate = tsvVar;
        }

        @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            Iterator<Map.Entry<K, V>> it = this.unfiltered.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.predicate.apply(next) && a.Q(next.getValue(), obj)) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = this.unfiltered.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.predicate.apply(next) && collection.contains(next.getValue())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = this.unfiltered.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.predicate.apply(next) && !collection.contains(next.getValue())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return Lists.newArrayList(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) Lists.newArrayList(iterator()).toArray(tArr);
        }
    }

    /* compiled from: PG */
    abstract class IteratorBasedAbstractMap<K, V> extends AbstractMap<K, V> {
        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            Iterators.clear(entryIterator());
        }

        public abstract Iterator<Map.Entry<K, V>> entryIterator();

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set<Map.Entry<K, V>> entrySet() {
            return new EntrySet<K, V>(this) { // from class: com.google.common.collect.Maps.IteratorBasedAbstractMap.1
                final /* synthetic */ IteratorBasedAbstractMap this$0;

                {
                    this.getClass();
                    this.this$0 = this;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator<Map.Entry<K, V>> iterator() {
                    return this.this$0.entryIterator();
                }

                @Override // com.google.common.collect.Maps.EntrySet
                public Map<K, V> map() {
                    return this.this$0;
                }
            };
        }

        @Override // java.util.AbstractMap, java.util.Map
        public abstract int size();
    }

    /* compiled from: PG */
    class KeySet<K, V> extends Sets.ImprovedAbstractSet<K> {
        final Map<K, V> map;

        public KeySet(Map<K, V> map) {
            map.getClass();
            this.map = map;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            map().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return map().containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return map().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return Maps.keyIterator(map().entrySet().iterator());
        }

        public Map<K, V> map() {
            return this.map;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            map().remove(obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return map().size();
        }
    }

    /* compiled from: PG */
    class MapDifferenceImpl<K, V> implements MapDifference<K, V> {
        final Map<K, MapDifference.ValueDifference<V>> differences;
        final Map<K, V> onBoth;
        final Map<K, V> onlyOnLeft;
        final Map<K, V> onlyOnRight;

        public MapDifferenceImpl(Map<K, V> map, Map<K, V> map2, Map<K, V> map3, Map<K, MapDifference.ValueDifference<V>> map4) {
            this.onlyOnLeft = Maps.unmodifiableMap(map);
            this.onlyOnRight = Maps.unmodifiableMap(map2);
            this.onBoth = Maps.unmodifiableMap(map3);
            this.differences = Maps.unmodifiableMap(map4);
        }

        @Override // com.google.common.collect.MapDifference
        public boolean areEqual() {
            return this.onlyOnLeft.isEmpty() && this.onlyOnRight.isEmpty() && this.differences.isEmpty();
        }

        @Override // com.google.common.collect.MapDifference
        public Map<K, MapDifference.ValueDifference<V>> entriesDiffering() {
            return this.differences;
        }

        @Override // com.google.common.collect.MapDifference
        public Map<K, V> entriesInCommon() {
            return this.onBoth;
        }

        @Override // com.google.common.collect.MapDifference
        public Map<K, V> entriesOnlyOnLeft() {
            return this.onlyOnLeft;
        }

        @Override // com.google.common.collect.MapDifference
        public Map<K, V> entriesOnlyOnRight() {
            return this.onlyOnRight;
        }

        @Override // com.google.common.collect.MapDifference
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof MapDifference) {
                MapDifference mapDifference = (MapDifference) obj;
                if (entriesOnlyOnLeft().equals(mapDifference.entriesOnlyOnLeft()) && entriesOnlyOnRight().equals(mapDifference.entriesOnlyOnRight()) && entriesInCommon().equals(mapDifference.entriesInCommon()) && entriesDiffering().equals(mapDifference.entriesDiffering())) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.MapDifference
        public int hashCode() {
            return Arrays.hashCode(new Object[]{entriesOnlyOnLeft(), entriesOnlyOnRight(), entriesInCommon(), entriesDiffering()});
        }

        public String toString() {
            if (areEqual()) {
                return "equal";
            }
            StringBuilder sb = new StringBuilder("not equal");
            if (!this.onlyOnLeft.isEmpty()) {
                sb.append(": only on left=");
                sb.append(this.onlyOnLeft);
            }
            if (!this.onlyOnRight.isEmpty()) {
                sb.append(": only on right=");
                sb.append(this.onlyOnRight);
            }
            if (!this.differences.isEmpty()) {
                sb.append(": value differences=");
                sb.append(this.differences);
            }
            return sb.toString();
        }
    }

    /* compiled from: PG */
    final class NavigableAsMapView<K, V> extends AbstractNavigableMap<K, V> {
        private final tsl<? super K, V> function;
        private final NavigableSet<K> set;

        public NavigableAsMapView(NavigableSet<K> navigableSet, tsl<? super K, V> tslVar) {
            navigableSet.getClass();
            this.set = navigableSet;
            tslVar.getClass();
            this.function = tslVar;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.set.clear();
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return this.set.comparator();
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        public Iterator<Map.Entry<K, V>> descendingEntryIterator() {
            return descendingMap().entrySet().iterator();
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            return Maps.asMap((NavigableSet) this.set.descendingSet(), (tsl) this.function);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public Iterator<Map.Entry<K, V>> entryIterator() {
            return Maps.asMapEntryIterator(this.set, this.function);
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            if (Collections2.safeContains(this.set, obj)) {
                return this.function.apply(obj);
            }
            return null;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(K k, boolean z) {
            return Maps.asMap((NavigableSet) this.set.headSet(k, z), (tsl) this.function);
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return Maps.removeOnlyNavigableSet(this.set);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.set.size();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(K k, boolean z, K k2, boolean z2) {
            return Maps.asMap((NavigableSet) this.set.subSet(k, z, k2, z2), (tsl) this.function);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(K k, boolean z) {
            return Maps.asMap((NavigableSet) this.set.tailSet(k, z), (tsl) this.function);
        }
    }

    /* compiled from: PG */
    class NavigableKeySet<K, V> extends SortedKeySet<K, V> implements NavigableSet<K> {
        public NavigableKeySet(NavigableMap<K, V> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k) {
            return map().ceilingKey(k);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return map().descendingKeySet();
        }

        @Override // java.util.NavigableSet
        public K floor(K k) {
            return map().floorKey(k);
        }

        @Override // com.google.common.collect.Maps.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> headSet(K k) {
            return headSet(k, false);
        }

        @Override // java.util.NavigableSet
        public K higher(K k) {
            return map().higherKey(k);
        }

        @Override // java.util.NavigableSet
        public K lower(K k) {
            return map().lowerKey(k);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) Maps.keyOrNull(map().pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) Maps.keyOrNull(map().pollLastEntry());
        }

        @Override // com.google.common.collect.Maps.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> subSet(K k, K k2) {
            return subSet(k, true, k2, false);
        }

        @Override // com.google.common.collect.Maps.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> tailSet(K k) {
            return tailSet(k, true);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k, boolean z) {
            return map().headMap(k, z).navigableKeySet();
        }

        @Override // com.google.common.collect.Maps.SortedKeySet, com.google.common.collect.Maps.KeySet
        public NavigableMap<K, V> map() {
            return (NavigableMap) this.map;
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
            return map().subMap(k, z, k2, z2).navigableKeySet();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k, boolean z) {
            return map().tailMap(k, z).navigableKeySet();
        }
    }

    /* compiled from: PG */
    class SortedAsMapView<K, V> extends AsMapView<K, V> implements SortedMap<K, V> {
        public SortedAsMapView(SortedSet<K> sortedSet, tsl<? super K, V> tslVar) {
            super(sortedSet, tslVar);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return backingSet().comparator();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return backingSet().first();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> headMap(K k) {
            return Maps.asMap((SortedSet) backingSet().headSet(k), (tsl) this.function);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return Maps.removeOnlySortedSet(backingSet());
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return backingSet().last();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> subMap(K k, K k2) {
            return Maps.asMap((SortedSet) backingSet().subSet(k, k2), (tsl) this.function);
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> tailMap(K k) {
            return Maps.asMap((SortedSet) backingSet().tailSet(k), (tsl) this.function);
        }

        @Override // com.google.common.collect.Maps.AsMapView
        public SortedSet<K> backingSet() {
            return (SortedSet) super.backingSet();
        }
    }

    /* compiled from: PG */
    class SortedKeySet<K, V> extends KeySet<K, V> implements SortedSet<K> {
        public SortedKeySet(SortedMap<K, V> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return map().comparator();
        }

        @Override // java.util.SortedSet
        public K first() {
            return map().firstKey();
        }

        public SortedSet<K> headSet(K k) {
            return new SortedKeySet(map().headMap(k));
        }

        @Override // java.util.SortedSet
        public K last() {
            return map().lastKey();
        }

        public SortedSet<K> subSet(K k, K k2) {
            return new SortedKeySet(map().subMap(k, k2));
        }

        public SortedSet<K> tailSet(K k) {
            return new SortedKeySet(map().tailMap(k));
        }

        @Override // com.google.common.collect.Maps.KeySet
        public SortedMap<K, V> map() {
            return (SortedMap) super.map();
        }
    }

    /* compiled from: PG */
    class SortedMapDifferenceImpl<K, V> extends MapDifferenceImpl<K, V> implements SortedMapDifference<K, V> {
        public SortedMapDifferenceImpl(SortedMap<K, V> sortedMap, SortedMap<K, V> sortedMap2, SortedMap<K, V> sortedMap3, SortedMap<K, MapDifference.ValueDifference<V>> sortedMap4) {
            super(sortedMap, sortedMap2, sortedMap3, sortedMap4);
        }

        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        public SortedMap<K, MapDifference.ValueDifference<V>> entriesDiffering() {
            return (SortedMap) super.entriesDiffering();
        }

        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        public SortedMap<K, V> entriesInCommon() {
            return (SortedMap) super.entriesInCommon();
        }

        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        public SortedMap<K, V> entriesOnlyOnLeft() {
            return (SortedMap) super.entriesOnlyOnLeft();
        }

        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        public SortedMap<K, V> entriesOnlyOnRight() {
            return (SortedMap) super.entriesOnlyOnRight();
        }
    }

    /* compiled from: PG */
    class TransformedEntriesMap<K, V1, V2> extends IteratorBasedAbstractMap<K, V2> {
        final Map<K, V1> fromMap;
        final EntryTransformer<? super K, ? super V1, V2> transformer;

        public TransformedEntriesMap(Map<K, V1> map, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
            map.getClass();
            this.fromMap = map;
            entryTransformer.getClass();
            this.transformer = entryTransformer;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.fromMap.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.fromMap.containsKey(obj);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public Iterator<Map.Entry<K, V2>> entryIterator() {
            return Iterators.transform(this.fromMap.entrySet().iterator(), Maps.asEntryToEntryFunction(this.transformer));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V2 get(Object obj) {
            V1 v1 = this.fromMap.get(obj);
            if (v1 != null || this.fromMap.containsKey(obj)) {
                return this.transformer.transformEntry(obj, v1);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return this.fromMap.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V2 remove(Object obj) {
            if (this.fromMap.containsKey(obj)) {
                return this.transformer.transformEntry(obj, this.fromMap.remove(obj));
            }
            return null;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.fromMap.size();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V2> values() {
            return new Values(this);
        }
    }

    /* compiled from: PG */
    class TransformedEntriesNavigableMap<K, V1, V2> extends TransformedEntriesSortedMap<K, V1, V2> implements NavigableMap<K, V2> {
        public TransformedEntriesNavigableMap(NavigableMap<K, V1> navigableMap, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
            super(navigableMap, entryTransformer);
        }

        private Map.Entry<K, V2> transformEntry(Map.Entry<K, V1> entry) {
            if (entry == null) {
                return null;
            }
            return Maps.transformEntry(this.transformer, entry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> ceilingEntry(K k) {
            return transformEntry(fromMap().ceilingEntry(k));
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k) {
            return fromMap().ceilingKey(k);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return fromMap().descendingKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> descendingMap() {
            return Maps.transformEntries((NavigableMap) fromMap().descendingMap(), (EntryTransformer) this.transformer);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> firstEntry() {
            return transformEntry(fromMap().firstEntry());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> floorEntry(K k) {
            return transformEntry(fromMap().floorEntry(k));
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k) {
            return fromMap().floorKey(k);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap
        public NavigableMap<K, V1> fromMap() {
            return (NavigableMap) super.fromMap();
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap<K, V2> headMap(K k) {
            return headMap(k, false);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> higherEntry(K k) {
            return transformEntry(fromMap().higherEntry(k));
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k) {
            return fromMap().higherKey(k);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> lastEntry() {
            return transformEntry(fromMap().lastEntry());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> lowerEntry(K k) {
            return transformEntry(fromMap().lowerEntry(k));
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k) {
            return fromMap().lowerKey(k);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return fromMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> pollFirstEntry() {
            return transformEntry(fromMap().pollFirstEntry());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> pollLastEntry() {
            return transformEntry(fromMap().pollLastEntry());
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap<K, V2> subMap(K k, K k2) {
            return subMap(k, true, k2, false);
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap<K, V2> tailMap(K k) {
            return tailMap(k, true);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public /* bridge */ /* synthetic */ SortedMap headMap(Object obj) {
            return headMap((TransformedEntriesNavigableMap<K, V1, V2>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public /* bridge */ /* synthetic */ SortedMap tailMap(Object obj) {
            return tailMap((TransformedEntriesNavigableMap<K, V1, V2>) obj);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> headMap(K k, boolean z) {
            return Maps.transformEntries((NavigableMap) fromMap().headMap(k, z), (EntryTransformer) this.transformer);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> subMap(K k, boolean z, K k2, boolean z2) {
            return Maps.transformEntries((NavigableMap) fromMap().subMap(k, z, k2, z2), (EntryTransformer) this.transformer);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> tailMap(K k, boolean z) {
            return Maps.transformEntries((NavigableMap) fromMap().tailMap(k, z), (EntryTransformer) this.transformer);
        }
    }

    /* compiled from: PG */
    class TransformedEntriesSortedMap<K, V1, V2> extends TransformedEntriesMap<K, V1, V2> implements SortedMap<K, V2> {
        public TransformedEntriesSortedMap(SortedMap<K, V1> sortedMap, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
            super(sortedMap, entryTransformer);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return fromMap().comparator();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return fromMap().firstKey();
        }

        protected SortedMap<K, V1> fromMap() {
            return (SortedMap) this.fromMap;
        }

        public SortedMap<K, V2> headMap(K k) {
            return Maps.transformEntries((SortedMap) fromMap().headMap(k), (EntryTransformer) this.transformer);
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return fromMap().lastKey();
        }

        public SortedMap<K, V2> subMap(K k, K k2) {
            return Maps.transformEntries((SortedMap) fromMap().subMap(k, k2), (EntryTransformer) this.transformer);
        }

        public SortedMap<K, V2> tailMap(K k) {
            return Maps.transformEntries((SortedMap) fromMap().tailMap(k), (EntryTransformer) this.transformer);
        }
    }

    /* compiled from: PG */
    class UnmodifiableBiMap<K, V> extends ForwardingMap<K, V> implements BiMap<K, V>, Serializable {
        private static final long serialVersionUID = 0;
        final BiMap<? extends K, ? extends V> delegate;
        BiMap<V, K> inverse;
        final Map<K, V> unmodifiableMap;
        transient Set<V> values;

        public UnmodifiableBiMap(BiMap<? extends K, ? extends V> biMap, BiMap<V, K> biMap2) {
            this.unmodifiableMap = DesugarCollections.unmodifiableMap(biMap);
            this.delegate = biMap;
            this.inverse = biMap2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public Map<K, V> delegate() {
            return this.unmodifiableMap;
        }

        @Override // com.google.common.collect.BiMap
        public V forcePut(K k, V v) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.BiMap
        public BiMap<V, K> inverse() {
            BiMap<V, K> biMap = this.inverse;
            if (biMap != null) {
                return biMap;
            }
            UnmodifiableBiMap unmodifiableBiMap = new UnmodifiableBiMap(this.delegate.inverse(), this);
            this.inverse = unmodifiableBiMap;
            return unmodifiableBiMap;
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public Set<V> values() {
            Set<V> set = this.values;
            if (set != null) {
                return set;
            }
            Set<V> setUnmodifiableSet = DesugarCollections.unmodifiableSet(this.delegate.values());
            this.values = setUnmodifiableSet;
            return setUnmodifiableSet;
        }
    }

    /* compiled from: PG */
    class UnmodifiableEntries<K, V> extends ForwardingCollection<Map.Entry<K, V>> {
        private final Collection<Map.Entry<K, V>> entries;

        public UnmodifiableEntries(Collection<Map.Entry<K, V>> collection) {
            this.entries = collection;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Collection<Map.Entry<K, V>> delegate() {
            return this.entries;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return Maps.unmodifiableEntryIterator(this.entries.iterator());
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return standardToArray();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) standardToArray(tArr);
        }
    }

    /* compiled from: PG */
    class UnmodifiableEntrySet<K, V> extends UnmodifiableEntries<K, V> implements Set<Map.Entry<K, V>> {
        public UnmodifiableEntrySet(Set<Map.Entry<K, V>> set) {
            super(set);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return Sets.equalsImpl(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return Sets.hashCodeImpl(this);
        }
    }

    /* compiled from: PG */
    class UnmodifiableNavigableMap<K, V> extends ForwardingSortedMap<K, V> implements NavigableMap<K, V>, Serializable {
        private final NavigableMap<K, ? extends V> delegate;
        private transient UnmodifiableNavigableMap<K, V> descendingMap;

        public UnmodifiableNavigableMap(NavigableMap<K, ? extends V> navigableMap) {
            this.delegate = navigableMap;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> ceilingEntry(K k) {
            return Maps.unmodifiableOrNull(this.delegate.ceilingEntry(k));
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k) {
            return this.delegate.ceilingKey(k);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return Sets.unmodifiableNavigableSet(this.delegate.descendingKeySet());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            UnmodifiableNavigableMap<K, V> unmodifiableNavigableMap = this.descendingMap;
            if (unmodifiableNavigableMap != null) {
                return unmodifiableNavigableMap;
            }
            UnmodifiableNavigableMap<K, V> unmodifiableNavigableMap2 = new UnmodifiableNavigableMap<>(this.delegate.descendingMap(), this);
            this.descendingMap = unmodifiableNavigableMap2;
            return unmodifiableNavigableMap2;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> firstEntry() {
            return Maps.unmodifiableOrNull(this.delegate.firstEntry());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> floorEntry(K k) {
            return Maps.unmodifiableOrNull(this.delegate.floorEntry(k));
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k) {
            return this.delegate.floorKey(k);
        }

        @Override // com.google.common.collect.ForwardingSortedMap, java.util.SortedMap
        public SortedMap<K, V> headMap(K k) {
            return headMap(k, false);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> higherEntry(K k) {
            return Maps.unmodifiableOrNull(this.delegate.higherEntry(k));
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k) {
            return this.delegate.higherKey(k);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lastEntry() {
            return Maps.unmodifiableOrNull(this.delegate.lastEntry());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lowerEntry(K k) {
            return Maps.unmodifiableOrNull(this.delegate.lowerEntry(k));
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k) {
            return this.delegate.lowerKey(k);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return Sets.unmodifiableNavigableSet(this.delegate.navigableKeySet());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, V> pollFirstEntry() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, V> pollLastEntry() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingSortedMap, java.util.SortedMap
        public SortedMap<K, V> subMap(K k, K k2) {
            return subMap(k, true, k2, false);
        }

        @Override // com.google.common.collect.ForwardingSortedMap, java.util.SortedMap
        public SortedMap<K, V> tailMap(K k) {
            return tailMap(k, true);
        }

        public UnmodifiableNavigableMap(NavigableMap<K, ? extends V> navigableMap, UnmodifiableNavigableMap<K, V> unmodifiableNavigableMap) {
            this.delegate = navigableMap;
            this.descendingMap = unmodifiableNavigableMap;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(K k, boolean z) {
            return Maps.unmodifiableNavigableMap(this.delegate.headMap(k, z));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(K k, boolean z, K k2, boolean z2) {
            return Maps.unmodifiableNavigableMap(this.delegate.subMap(k, z, k2, z2));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(K k, boolean z) {
            return Maps.unmodifiableNavigableMap(this.delegate.tailMap(k, z));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingSortedMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public SortedMap<K, V> delegate() {
            return DesugarCollections.unmodifiableSortedMap(this.delegate);
        }
    }

    /* compiled from: PG */
    class ValueDifferenceImpl<V> implements MapDifference.ValueDifference<V> {
        private final V left;
        private final V right;

        private ValueDifferenceImpl(V v, V v2) {
            this.left = v;
            this.right = v2;
        }

        static <V> MapDifference.ValueDifference<V> create(V v, V v2) {
            return new ValueDifferenceImpl(v, v2);
        }

        @Override // com.google.common.collect.MapDifference.ValueDifference
        public boolean equals(Object obj) {
            if (obj instanceof MapDifference.ValueDifference) {
                MapDifference.ValueDifference valueDifference = (MapDifference.ValueDifference) obj;
                if (a.Q(this.left, valueDifference.leftValue()) && a.Q(this.right, valueDifference.rightValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.MapDifference.ValueDifference
        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.left, this.right});
        }

        @Override // com.google.common.collect.MapDifference.ValueDifference
        public V leftValue() {
            return this.left;
        }

        @Override // com.google.common.collect.MapDifference.ValueDifference
        public V rightValue() {
            return this.right;
        }

        public String toString() {
            V v = this.right;
            return "(" + String.valueOf(this.left) + ", " + String.valueOf(v) + ")";
        }
    }

    /* compiled from: PG */
    class Values<K, V> extends AbstractCollection<V> {
        final Map<K, V> map;

        public Values(Map<K, V> map) {
            map.getClass();
            this.map = map;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            map().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return map().containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return map().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return Maps.valueIterator(map().entrySet().iterator());
        }

        final Map<K, V> map() {
            return this.map;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : map().entrySet()) {
                    if (a.Q(obj, entry.getValue())) {
                        map().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            try {
                collection.getClass();
                return super.removeAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                for (Map.Entry<K, V> entry : map().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return map().keySet().removeAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            try {
                collection.getClass();
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                for (Map.Entry<K, V> entry : map().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return map().keySet().retainAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return map().size();
        }
    }

    /* compiled from: PG */
    abstract class ViewCachingAbstractMap<K, V> extends AbstractMap<K, V> {
        private transient Set<Map.Entry<K, V>> entrySet;
        private transient Set<K> keySet;
        private transient Collection<V> values;

        public abstract Set<Map.Entry<K, V>> createEntrySet();

        public Set<K> createKeySet() {
            return new KeySet(this);
        }

        public Collection<V> createValues() {
            return new Values(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.entrySet;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> setCreateEntrySet = createEntrySet();
            this.entrySet = setCreateEntrySet;
            return setCreateEntrySet;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            Set<K> set = this.keySet;
            if (set != null) {
                return set;
            }
            Set<K> setCreateKeySet = createKeySet();
            this.keySet = setCreateKeySet;
            return setCreateKeySet;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> values() {
            Collection<V> collection = this.values;
            if (collection != null) {
                return collection;
            }
            Collection<V> collectionCreateValues = createValues();
            this.values = collectionCreateValues;
            return collectionCreateValues;
        }
    }

    private Maps() {
    }

    public static <A, B> tsg<A, B> asConverter(BiMap<A, B> biMap) {
        return new BiMapConverter(biMap);
    }

    static <K, V1, V2> tsl<Map.Entry<K, V1>, Map.Entry<K, V2>> asEntryToEntryFunction(final EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        entryTransformer.getClass();
        return new tsl() { // from class: com.google.common.collect.Maps$$ExternalSyntheticLambda0
            @Override // defpackage.tsl
            public final Object apply(Object obj) {
                return Maps.transformEntry(entryTransformer, (Map.Entry) obj);
            }
        };
    }

    public static <K, V> NavigableMap<K, V> asMap(NavigableSet<K> navigableSet, tsl<? super K, V> tslVar) {
        return new NavigableAsMapView(navigableSet, tslVar);
    }

    static <K, V> Iterator<Map.Entry<K, V>> asMapEntryIterator(Set<K> set, final tsl<? super K, V> tslVar) {
        return new TransformedIterator(set.iterator()) { // from class: com.google.common.collect.Maps.3
            @Override // com.google.common.collect.TransformedIterator
            public Map.Entry transform(Object obj) {
                return Maps.immutableEntry(obj, tslVar.apply(obj));
            }
        };
    }

    static int capacity(int i) {
        if (i >= 3) {
            return i < 1073741824 ? (int) Math.ceil(i / 0.75d) : ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
        CollectPreconditions.checkNonnegative(i, "expectedSize");
        return i + 1;
    }

    static <K, V> boolean containsEntryImpl(Collection<Map.Entry<K, V>> collection, Object obj) {
        if (obj instanceof Map.Entry) {
            return collection.contains(unmodifiableEntry((Map.Entry) obj));
        }
        return false;
    }

    static boolean containsKeyImpl(Map<?, ?> map, Object obj) {
        return Iterators.contains(keyIterator(map.entrySet().iterator()), obj);
    }

    static boolean containsValueImpl(Map<?, ?> map, Object obj) {
        return Iterators.contains(valueIterator(map.entrySet().iterator()), obj);
    }

    public static <K, V> MapDifference<K, V> difference(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        return map instanceof SortedMap ? difference((SortedMap) map, (Map) map2) : difference(map, map2, tsh.a);
    }

    private static <K, V> void doDifference(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2, tsk<? super V> tskVar, Map<K, V> map3, Map<K, V> map4, Map<K, V> map5, Map<K, MapDifference.ValueDifference<V>> map6) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (map2.containsKey(key)) {
                V vRemove = map4.remove(key);
                if (tskVar.d(value, vRemove)) {
                    map5.put(key, value);
                } else {
                    map6.put(key, ValueDifferenceImpl.create(value, vRemove));
                }
            } else {
                map3.put(key, value);
            }
        }
    }

    static boolean equalsImpl(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static <K, V> BiMap<K, V> filterEntries(BiMap<K, V> biMap, tsv<? super Map.Entry<K, V>> tsvVar) {
        biMap.getClass();
        tsvVar.getClass();
        return biMap instanceof FilteredEntryBiMap ? filterFiltered((FilteredEntryBiMap) biMap, (tsv) tsvVar) : new FilteredEntryBiMap(biMap, tsvVar);
    }

    private static <K, V> Map<K, V> filterFiltered(AbstractFilteredMap<K, V> abstractFilteredMap, tsv<? super Map.Entry<K, V>> tsvVar) {
        return new FilteredEntryMap(abstractFilteredMap.unfiltered, sij.n(abstractFilteredMap.predicate, tsvVar));
    }

    public static <K, V> BiMap<K, V> filterKeys(BiMap<K, V> biMap, tsv<? super K> tsvVar) {
        tsvVar.getClass();
        return filterEntries((BiMap) biMap, keyPredicateOnEntries(tsvVar));
    }

    public static <K, V> BiMap<K, V> filterValues(BiMap<K, V> biMap, tsv<? super V> tsvVar) {
        return filterEntries((BiMap) biMap, valuePredicateOnEntries(tsvVar));
    }

    public static ImmutableMap<String, String> fromProperties(Properties properties) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        Enumeration<?> enumerationPropertyNames = properties.propertyNames();
        while (enumerationPropertyNames.hasMoreElements()) {
            Object objNextElement = enumerationPropertyNames.nextElement();
            objNextElement.getClass();
            String str = (String) objNextElement;
            String property = properties.getProperty(str);
            property.getClass();
            builder.put(str, property);
        }
        return builder.buildOrThrow();
    }

    public static <K, V> Map.Entry<K, V> immutableEntry(K k, V v) {
        return new ImmutableEntry(k, v);
    }

    public static <K extends Enum<K>, V> ImmutableMap<K, V> immutableEnumMap(Map<K, ? extends V> map) {
        if (map instanceof ImmutableEnumMap) {
            return (ImmutableEnumMap) map;
        }
        Iterator<Map.Entry<K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return ImmutableMap.of();
        }
        Map.Entry<K, ? extends V> next = it.next();
        K key = next.getKey();
        V value = next.getValue();
        CollectPreconditions.checkEntryNotNull(key, value);
        EnumMap enumMap = new EnumMap(Collections.singletonMap(key, value));
        while (it.hasNext()) {
            Map.Entry<K, ? extends V> next2 = it.next();
            K key2 = next2.getKey();
            V value2 = next2.getValue();
            CollectPreconditions.checkEntryNotNull(key2, value2);
            enumMap.put((EnumMap) key2, (K) value2);
        }
        return ImmutableEnumMap.asImmutable(enumMap);
    }

    static <E> ImmutableMap<E, Integer> indexMap(Collection<E> collection) {
        ImmutableMap.Builder builder = new ImmutableMap.Builder(collection.size());
        Iterator<E> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            builder.put(it.next(), Integer.valueOf(i));
            i++;
        }
        return builder.buildOrThrow();
    }

    static <K> tsl<Map.Entry<K, ?>, K> keyFunction() {
        return EntryFunction.KEY;
    }

    static <K, V> Iterator<K> keyIterator(Iterator<Map.Entry<K, V>> it) {
        return new TransformedIterator(it) { // from class: com.google.common.collect.Maps.1
            @Override // com.google.common.collect.TransformedIterator
            public Object transform(Map.Entry entry) {
                return entry.getKey();
            }
        };
    }

    static <K> K keyOrNull(Map.Entry<K, ?> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    static <K> tsv<Map.Entry<K, ?>> keyPredicateOnEntries(tsv<? super K> tsvVar) {
        return new tsx(tsvVar, keyFunction());
    }

    public static <K, V> ConcurrentMap<K, V> newConcurrentMap() {
        return new ConcurrentHashMap();
    }

    public static <K extends Enum<K>, V> EnumMap<K, V> newEnumMap(Class<K> cls) {
        cls.getClass();
        return new EnumMap<>(cls);
    }

    public static <K, V> HashMap<K, V> newHashMap() {
        return new HashMap<>();
    }

    public static <K, V> HashMap<K, V> newHashMapWithExpectedSize(int i) {
        return new HashMap<>(capacity(i));
    }

    public static <K, V> IdentityHashMap<K, V> newIdentityHashMap() {
        return new IdentityHashMap<>();
    }

    public static <K, V> LinkedHashMap<K, V> newLinkedHashMap() {
        return new LinkedHashMap<>();
    }

    public static <K, V> LinkedHashMap<K, V> newLinkedHashMapWithExpectedSize(int i) {
        return new LinkedHashMap<>(capacity(i));
    }

    public static <K extends Comparable, V> TreeMap<K, V> newTreeMap() {
        return new TreeMap<>();
    }

    static <E> Comparator<? super E> orNaturalOrder(Comparator<? super E> comparator) {
        return comparator != null ? comparator : Ordering.natural();
    }

    static <K, V> void putAllImpl(Map<K, V> map, Map<? extends K, ? extends V> map2) {
        for (Map.Entry<? extends K, ? extends V> entry : map2.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
    }

    static <K, V> boolean removeEntryImpl(Collection<Map.Entry<K, V>> collection, Object obj) {
        if (obj instanceof Map.Entry) {
            return collection.remove(unmodifiableEntry((Map.Entry) obj));
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> NavigableSet<E> removeOnlyNavigableSet(final NavigableSet<E> navigableSet) {
        return new ForwardingNavigableSet() { // from class: com.google.common.collect.Maps.6
            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
            public boolean add(Object obj) {
                throw new UnsupportedOperationException();
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
            public boolean addAll(Collection collection) {
                throw new UnsupportedOperationException();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
            public NavigableSet delegate() {
                return navigableSet;
            }

            @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
            public NavigableSet descendingSet() {
                return Maps.removeOnlyNavigableSet(super.descendingSet());
            }

            @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
            public SortedSet headSet(Object obj) {
                return Maps.removeOnlySortedSet(super.headSet(obj));
            }

            @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
            public SortedSet subSet(Object obj, Object obj2) {
                return Maps.removeOnlySortedSet(super.subSet(obj, obj2));
            }

            @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
            public SortedSet tailSet(Object obj) {
                return Maps.removeOnlySortedSet(super.tailSet(obj));
            }

            @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
            public NavigableSet headSet(Object obj, boolean z) {
                return Maps.removeOnlyNavigableSet(super.headSet(obj, z));
            }

            @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
            public NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
                return Maps.removeOnlyNavigableSet(super.subSet(obj, z, obj2, z2));
            }

            @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
            public NavigableSet tailSet(Object obj, boolean z) {
                return Maps.removeOnlyNavigableSet(super.tailSet(obj, z));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Set<E> removeOnlySet(final Set<E> set) {
        return new ForwardingSet() { // from class: com.google.common.collect.Maps.4
            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
            public boolean add(Object obj) {
                throw new UnsupportedOperationException();
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
            public boolean addAll(Collection collection) {
                throw new UnsupportedOperationException();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
            public Set delegate() {
                return set;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> SortedSet<E> removeOnlySortedSet(final SortedSet<E> sortedSet) {
        return new ForwardingSortedSet() { // from class: com.google.common.collect.Maps.5
            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
            public boolean add(Object obj) {
                throw new UnsupportedOperationException();
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
            public boolean addAll(Collection collection) {
                throw new UnsupportedOperationException();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
            public SortedSet delegate() {
                return sortedSet;
            }

            @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
            public SortedSet headSet(Object obj) {
                return Maps.removeOnlySortedSet(super.headSet(obj));
            }

            @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
            public SortedSet subSet(Object obj, Object obj2) {
                return Maps.removeOnlySortedSet(super.subSet(obj, obj2));
            }

            @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
            public SortedSet tailSet(Object obj) {
                return Maps.removeOnlySortedSet(super.tailSet(obj));
            }
        };
    }

    static boolean safeContainsKey(Map<?, ?> map, Object obj) {
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static <V> V safeGet(Map<?, V> map, Object obj) {
        map.getClass();
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static <V> V safeRemove(Map<?, V> map, Object obj) {
        map.getClass();
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K extends Comparable<? super K>, V> NavigableMap<K, V> subMap(NavigableMap<K, V> navigableMap, Range<K> range) {
        if (navigableMap.comparator() != null && navigableMap.comparator() != Ordering.natural() && range.hasLowerBound() && range.hasUpperBound()) {
            sij.o(navigableMap.comparator().compare(range.lowerEndpoint(), range.upperEndpoint()) <= 0, "map is using a custom comparator which is inconsistent with the natural ordering.");
        }
        if (range.hasLowerBound() && range.hasUpperBound()) {
            return navigableMap.subMap(range.lowerEndpoint(), range.lowerBoundType() == BoundType.CLOSED, range.upperEndpoint(), range.upperBoundType() == BoundType.CLOSED);
        }
        if (range.hasLowerBound()) {
            return navigableMap.tailMap(range.lowerEndpoint(), range.lowerBoundType() == BoundType.CLOSED);
        }
        if (range.hasUpperBound()) {
            return navigableMap.headMap(range.upperEndpoint(), range.upperBoundType() == BoundType.CLOSED);
        }
        navigableMap.getClass();
        return navigableMap;
    }

    public static <K, V> BiMap<K, V> synchronizedBiMap(BiMap<K, V> biMap) {
        return Synchronized.biMap(biMap, null);
    }

    public static <K, V> NavigableMap<K, V> synchronizedNavigableMap(NavigableMap<K, V> navigableMap) {
        return Synchronized.navigableMap(navigableMap);
    }

    public static <T, K extends Enum<K>, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableEnumMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        return CollectCollectors.toImmutableEnumMap(function, function2);
    }

    public static <K, V> ImmutableMap<K, V> toMap(Iterable<K> iterable, tsl<? super K, V> tslVar) {
        return toMap(iterable.iterator(), tslVar);
    }

    static String toStringImpl(Map<?, ?> map) {
        StringBuilder sbNewStringBuilderForCollection = Collections2.newStringBuilderForCollection(map.size());
        sbNewStringBuilderForCollection.append('{');
        boolean z = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z) {
                sbNewStringBuilderForCollection.append(", ");
            }
            sbNewStringBuilderForCollection.append(entry.getKey());
            sbNewStringBuilderForCollection.append('=');
            sbNewStringBuilderForCollection.append(entry.getValue());
            z = false;
        }
        sbNewStringBuilderForCollection.append('}');
        return sbNewStringBuilderForCollection.toString();
    }

    public static <K, V1, V2> Map<K, V2> transformEntries(Map<K, V1> map, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        return new TransformedEntriesMap(map, entryTransformer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <V2, K, V1> Map.Entry<K, V2> transformEntry(final EntryTransformer<? super K, ? super V1, V2> entryTransformer, final Map.Entry<K, V1> entry) {
        entryTransformer.getClass();
        entry.getClass();
        return new AbstractMapEntry() { // from class: com.google.common.collect.Maps.9
            @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
            public Object getKey() {
                return entry.getKey();
            }

            @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
            public Object getValue() {
                Map.Entry entry2 = entry;
                return entryTransformer.transformEntry(entry2.getKey(), entry2.getValue());
            }
        };
    }

    public static <K, V1, V2> Map<K, V2> transformValues(Map<K, V1> map, final tsl<? super V1, V2> tslVar) {
        tslVar.getClass();
        return transformEntries(map, new EntryTransformer() { // from class: com.google.common.collect.Maps$$ExternalSyntheticLambda3
            @Override // com.google.common.collect.Maps.EntryTransformer
            public final Object transformEntry(Object obj, Object obj2) {
                return tslVar.apply(obj2);
            }
        });
    }

    public static <K, V> ImmutableMap<K, V> uniqueIndex(Iterable<V> iterable, tsl<? super V, K> tslVar) {
        return iterable instanceof Collection ? uniqueIndex(iterable.iterator(), tslVar, ImmutableMap.builderWithExpectedSize(((Collection) iterable).size())) : uniqueIndex(iterable.iterator(), tslVar);
    }

    public static <K, V> BiMap<K, V> unmodifiableBiMap(BiMap<? extends K, ? extends V> biMap) {
        return new UnmodifiableBiMap(biMap, null);
    }

    static <K, V> Map.Entry<K, V> unmodifiableEntry(final Map.Entry<? extends K, ? extends V> entry) {
        entry.getClass();
        return new AbstractMapEntry() { // from class: com.google.common.collect.Maps.7
            @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
            public Object getKey() {
                return entry.getKey();
            }

            @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
            public Object getValue() {
                return entry.getValue();
            }
        };
    }

    static <K, V> UnmodifiableIterator<Map.Entry<K, V>> unmodifiableEntryIterator(final Iterator<Map.Entry<K, V>> it) {
        return new UnmodifiableIterator<Map.Entry>() { // from class: com.google.common.collect.Maps.8
            @Override // java.util.Iterator
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            public Map.Entry next() {
                return Maps.unmodifiableEntry((Map.Entry) it.next());
            }
        };
    }

    static <K, V> Set<Map.Entry<K, V>> unmodifiableEntrySet(Set<Map.Entry<K, V>> set) {
        return new UnmodifiableEntrySet(DesugarCollections.unmodifiableSet(set));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> Map<K, V> unmodifiableMap(Map<K, ? extends V> map) {
        return map instanceof SortedMap ? DesugarCollections.unmodifiableSortedMap((SortedMap) map) : DesugarCollections.unmodifiableMap(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> NavigableMap<K, V> unmodifiableNavigableMap(NavigableMap<K, ? extends V> navigableMap) {
        navigableMap.getClass();
        return navigableMap instanceof UnmodifiableNavigableMap ? navigableMap : new UnmodifiableNavigableMap(navigableMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> Map.Entry<K, V> unmodifiableOrNull(Map.Entry<K, ? extends V> entry) {
        if (entry == null) {
            return null;
        }
        return unmodifiableEntry(entry);
    }

    static <V> tsl<Map.Entry<?, V>, V> valueFunction() {
        return EntryFunction.VALUE;
    }

    static <K, V> Iterator<V> valueIterator(Iterator<Map.Entry<K, V>> it) {
        return new TransformedIterator(it) { // from class: com.google.common.collect.Maps.2
            @Override // com.google.common.collect.TransformedIterator
            public Object transform(Map.Entry entry) {
                return entry.getValue();
            }
        };
    }

    static <V> V valueOrNull(Map.Entry<?, V> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }

    static <V> tsv<Map.Entry<?, V>> valuePredicateOnEntries(tsv<? super V> tsvVar) {
        return new tsx(tsvVar, valueFunction());
    }

    public static <K, V> Map<K, V> asMap(Set<K> set, tsl<? super K, V> tslVar) {
        return new AsMapView(set, tslVar);
    }

    public static <K, V> Map<K, V> filterValues(Map<K, V> map, tsv<? super V> tsvVar) {
        return filterEntries(map, valuePredicateOnEntries(tsvVar));
    }

    public static <K, V> HashMap<K, V> newHashMap(Map<? extends K, ? extends V> map) {
        return new HashMap<>(map);
    }

    public static <K, V> LinkedHashMap<K, V> newLinkedHashMap(Map<? extends K, ? extends V> map) {
        return new LinkedHashMap<>(map);
    }

    public static <C, K extends C, V> TreeMap<K, V> newTreeMap(Comparator<C> comparator) {
        return new TreeMap<>(comparator);
    }

    public static <T, K extends Enum<K>, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableEnumMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, BinaryOperator<V> binaryOperator) {
        return CollectCollectors.toImmutableEnumMap(function, function2, binaryOperator);
    }

    public static <K, V> ImmutableMap<K, V> toMap(Iterator<K> it, tsl<? super K, V> tslVar) {
        tslVar.getClass();
        ImmutableMap.Builder builder = ImmutableMap.builder();
        while (it.hasNext()) {
            K next = it.next();
            builder.put(next, tslVar.apply(next));
        }
        return builder.buildKeepingLast();
    }

    public static <K, V1, V2> NavigableMap<K, V2> transformEntries(NavigableMap<K, V1> navigableMap, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        return new TransformedEntriesNavigableMap(navigableMap, entryTransformer);
    }

    public static <K, V> SortedMap<K, V> asMap(SortedSet<K> sortedSet, tsl<? super K, V> tslVar) {
        return new SortedAsMapView(sortedSet, tslVar);
    }

    private static <K, V> BiMap<K, V> filterFiltered(FilteredEntryBiMap<K, V> filteredEntryBiMap, tsv<? super Map.Entry<K, V>> tsvVar) {
        return new FilteredEntryBiMap(filteredEntryBiMap.unfiltered(), sij.n(filteredEntryBiMap.predicate, tsvVar));
    }

    public static <K, V> Map<K, V> filterKeys(Map<K, V> map, tsv<? super K> tsvVar) {
        tsvVar.getClass();
        boolean z = map instanceof AbstractFilteredMap;
        tsv tsvVarKeyPredicateOnEntries = keyPredicateOnEntries(tsvVar);
        if (z) {
            return filterFiltered((AbstractFilteredMap) map, tsvVarKeyPredicateOnEntries);
        }
        map.getClass();
        return new FilteredKeyMap(map, tsvVar, tsvVarKeyPredicateOnEntries);
    }

    public static <K, V> NavigableMap<K, V> filterValues(NavigableMap<K, V> navigableMap, tsv<? super V> tsvVar) {
        return filterEntries((NavigableMap) navigableMap, valuePredicateOnEntries(tsvVar));
    }

    public static <K extends Enum<K>, V> EnumMap<K, V> newEnumMap(Map<K, ? extends V> map) {
        return new EnumMap<>(map);
    }

    public static <K, V> TreeMap<K, V> newTreeMap(SortedMap<K, ? extends V> sortedMap) {
        return new TreeMap<>((SortedMap) sortedMap);
    }

    public static <K, V1, V2> SortedMap<K, V2> transformEntries(SortedMap<K, V1> sortedMap, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        return new TransformedEntriesSortedMap(sortedMap, entryTransformer);
    }

    public static <K, V1, V2> NavigableMap<K, V2> transformValues(NavigableMap<K, V1> navigableMap, final tsl<? super V1, V2> tslVar) {
        tslVar.getClass();
        return transformEntries((NavigableMap) navigableMap, new EntryTransformer() { // from class: com.google.common.collect.Maps$$ExternalSyntheticLambda2
            @Override // com.google.common.collect.Maps.EntryTransformer
            public final Object transformEntry(Object obj, Object obj2) {
                return tslVar.apply(obj2);
            }
        });
    }

    public static <K, V> SortedMap<K, V> filterValues(SortedMap<K, V> sortedMap, tsv<? super V> tsvVar) {
        return filterEntries((SortedMap) sortedMap, valuePredicateOnEntries(tsvVar));
    }

    public static <K, V> MapDifference<K, V> difference(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2, tsk<? super V> tskVar) {
        tskVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(map2);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        doDifference(map, map2, tskVar, linkedHashMap, linkedHashMap2, linkedHashMap3, linkedHashMap4);
        return new MapDifferenceImpl(linkedHashMap, linkedHashMap2, linkedHashMap3, linkedHashMap4);
    }

    public static <K, V> Map<K, V> filterEntries(Map<K, V> map, tsv<? super Map.Entry<K, V>> tsvVar) {
        tsvVar.getClass();
        if (map instanceof AbstractFilteredMap) {
            return filterFiltered((AbstractFilteredMap) map, tsvVar);
        }
        map.getClass();
        return new FilteredEntryMap(map, tsvVar);
    }

    private static <K, V> NavigableMap<K, V> filterFiltered(FilteredEntryNavigableMap<K, V> filteredEntryNavigableMap, tsv<? super Map.Entry<K, V>> tsvVar) {
        return new FilteredEntryNavigableMap(((FilteredEntryNavigableMap) filteredEntryNavigableMap).unfiltered, sij.n(((FilteredEntryNavigableMap) filteredEntryNavigableMap).entryPredicate, tsvVar));
    }

    public static <K, V1, V2> SortedMap<K, V2> transformValues(SortedMap<K, V1> sortedMap, final tsl<? super V1, V2> tslVar) {
        tslVar.getClass();
        return transformEntries((SortedMap) sortedMap, new EntryTransformer() { // from class: com.google.common.collect.Maps$$ExternalSyntheticLambda1
            @Override // com.google.common.collect.Maps.EntryTransformer
            public final Object transformEntry(Object obj, Object obj2) {
                return tslVar.apply(obj2);
            }
        });
    }

    public static <K, V> ImmutableMap<K, V> uniqueIndex(Iterator<V> it, tsl<? super V, K> tslVar) {
        return uniqueIndex(it, tslVar, ImmutableMap.builder());
    }

    private static <K, V> ImmutableMap<K, V> uniqueIndex(Iterator<V> it, tsl<? super V, K> tslVar, ImmutableMap.Builder<K, V> builder) {
        tslVar.getClass();
        while (it.hasNext()) {
            V next = it.next();
            builder.put(tslVar.apply(next), next);
        }
        try {
            return builder.buildOrThrow();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(String.valueOf(e.getMessage()).concat(". To index multiple values under a key, use Multimaps.index."));
        }
    }

    private static <K, V> SortedMap<K, V> filterFiltered(FilteredEntrySortedMap<K, V> filteredEntrySortedMap, tsv<? super Map.Entry<K, V>> tsvVar) {
        return new FilteredEntrySortedMap(filteredEntrySortedMap.sortedMap(), sij.n(filteredEntrySortedMap.predicate, tsvVar));
    }

    public static <K, V> NavigableMap<K, V> filterKeys(NavigableMap<K, V> navigableMap, tsv<? super K> tsvVar) {
        return filterEntries((NavigableMap) navigableMap, keyPredicateOnEntries(tsvVar));
    }

    public static <K, V> NavigableMap<K, V> filterEntries(NavigableMap<K, V> navigableMap, tsv<? super Map.Entry<K, V>> tsvVar) {
        tsvVar.getClass();
        if (navigableMap instanceof FilteredEntryNavigableMap) {
            return filterFiltered((FilteredEntryNavigableMap) navigableMap, tsvVar);
        }
        navigableMap.getClass();
        return new FilteredEntryNavigableMap(navigableMap, tsvVar);
    }

    public static <K, V> SortedMap<K, V> filterKeys(SortedMap<K, V> sortedMap, tsv<? super K> tsvVar) {
        return filterEntries((SortedMap) sortedMap, keyPredicateOnEntries(tsvVar));
    }

    public static <K, V> SortedMapDifference<K, V> difference(SortedMap<K, ? extends V> sortedMap, Map<? extends K, ? extends V> map) {
        sortedMap.getClass();
        map.getClass();
        Comparator comparatorOrNaturalOrder = orNaturalOrder(sortedMap.comparator());
        TreeMap treeMapNewTreeMap = newTreeMap(comparatorOrNaturalOrder);
        TreeMap treeMapNewTreeMap2 = newTreeMap(comparatorOrNaturalOrder);
        treeMapNewTreeMap2.putAll(map);
        TreeMap treeMapNewTreeMap3 = newTreeMap(comparatorOrNaturalOrder);
        TreeMap treeMapNewTreeMap4 = newTreeMap(comparatorOrNaturalOrder);
        doDifference(sortedMap, map, tsh.a, treeMapNewTreeMap, treeMapNewTreeMap2, treeMapNewTreeMap3, treeMapNewTreeMap4);
        return new SortedMapDifferenceImpl(treeMapNewTreeMap, treeMapNewTreeMap2, treeMapNewTreeMap3, treeMapNewTreeMap4);
    }

    public static <K, V> SortedMap<K, V> filterEntries(SortedMap<K, V> sortedMap, tsv<? super Map.Entry<K, V>> tsvVar) {
        tsvVar.getClass();
        if (sortedMap instanceof FilteredEntrySortedMap) {
            return filterFiltered((FilteredEntrySortedMap) sortedMap, (tsv) tsvVar);
        }
        sortedMap.getClass();
        return new FilteredEntrySortedMap(sortedMap, tsvVar);
    }
}
