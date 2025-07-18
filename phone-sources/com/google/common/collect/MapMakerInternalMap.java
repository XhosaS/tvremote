package com.google.common.collect;

import com.google.common.collect.MapMaker;
import com.google.common.collect.MapMakerInternalMap.InternalEntry;
import com.google.common.collect.MapMakerInternalMap.Segment;
import defpackage.sfy;
import defpackage.tsh;
import defpackage.tsi;
import defpackage.tsk;
import j$.util.concurrent.ConcurrentMap;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
class MapMakerInternalMap<K, V, E extends InternalEntry<K, V, E>, S extends Segment<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable, j$.util.concurrent.ConcurrentMap<K, V> {
    static final int CONTAINS_VALUE_RETRIES = 3;
    static final int DRAIN_MAX = 16;
    static final int DRAIN_THRESHOLD = 63;
    static final int MAXIMUM_CAPACITY = 1073741824;
    static final int MAX_SEGMENTS = 65536;
    static final WeakValueReference<Object, Object, DummyInternalEntry> UNSET_WEAK_VALUE_REFERENCE = new WeakValueReference<Object, Object, DummyInternalEntry>() { // from class: com.google.common.collect.MapMakerInternalMap.1
        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public WeakValueReference<Object, Object, DummyInternalEntry> copyFor(ReferenceQueue<Object> referenceQueue, DummyInternalEntry dummyInternalEntry) {
            return this;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public Object get() {
            return null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public DummyInternalEntry getEntry() {
            return null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public void clear() {
        }
    };
    private static final long serialVersionUID = 5;
    final int concurrencyLevel;
    final transient InternalEntryHelper<K, V, E, S> entryHelper;
    transient Set<Map.Entry<K, V>> entrySet;
    final tsk<Object> keyEquivalence;
    transient Set<K> keySet;
    final transient int segmentMask;
    final transient int segmentShift;
    final transient Segment<K, V, E, S>[] segments;
    transient Collection<V> values;

    /* compiled from: PG */
    abstract class AbstractSerializationProxy<K, V> extends ForwardingConcurrentMap<K, V> implements Serializable {
        private static final long serialVersionUID = 3;
        final int concurrencyLevel;
        transient ConcurrentMap<K, V> delegate;
        final tsk<Object> keyEquivalence;
        final Strength keyStrength;
        final tsk<Object> valueEquivalence;
        final Strength valueStrength;

        public AbstractSerializationProxy(Strength strength, Strength strength2, tsk<Object> tskVar, tsk<Object> tskVar2, int i, ConcurrentMap<K, V> concurrentMap) {
            this.keyStrength = strength;
            this.valueStrength = strength2;
            this.keyEquivalence = tskVar;
            this.valueEquivalence = tskVar2;
            this.concurrencyLevel = i;
            this.delegate = concurrentMap;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingConcurrentMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public ConcurrentMap<K, V> delegate() {
            return this.delegate;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void readEntries(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            while (true) {
                Object object = objectInputStream.readObject();
                if (object == null) {
                    return;
                }
                this.delegate.put(object, objectInputStream.readObject());
            }
        }

        public MapMaker readMapMaker(ObjectInputStream objectInputStream) throws IOException {
            int i = objectInputStream.readInt();
            MapMaker mapMaker = new MapMaker();
            mapMaker.initialCapacity(i);
            mapMaker.setKeyStrength(this.keyStrength);
            mapMaker.setValueStrength(this.valueStrength);
            mapMaker.keyEquivalence(this.keyEquivalence);
            mapMaker.concurrencyLevel(this.concurrencyLevel);
            return mapMaker;
        }

        public void writeMapTo(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeInt(this.delegate.size());
            for (Map.Entry<K, V> entry : this.delegate.entrySet()) {
                objectOutputStream.writeObject(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            objectOutputStream.writeObject(null);
        }
    }

    /* compiled from: PG */
    abstract class AbstractStrongKeyEntry<K, V, E extends InternalEntry<K, V, E>> implements InternalEntry<K, V, E> {
        final int hash;
        final K key;

        public AbstractStrongKeyEntry(K k, int i) {
            this.key = k;
            this.hash = i;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final int getHash() {
            return this.hash;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final K getKey() {
            return this.key;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public E getNext() {
            return null;
        }
    }

    /* compiled from: PG */
    abstract class AbstractWeakKeyEntry<K, V, E extends InternalEntry<K, V, E>> extends WeakReference<K> implements InternalEntry<K, V, E> {
        final int hash;

        public AbstractWeakKeyEntry(ReferenceQueue<K> referenceQueue, K k, int i) {
            super(k, referenceQueue);
            this.hash = i;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final int getHash() {
            return this.hash;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final K getKey() {
            return (K) get();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public E getNext() {
            return null;
        }
    }

    /* compiled from: PG */
    final class CleanupMapTask implements Runnable {
        final WeakReference<MapMakerInternalMap<?, ?, ?, ?>> mapReference;

        public CleanupMapTask(MapMakerInternalMap<?, ?, ?, ?> mapMakerInternalMap) {
            this.mapReference = new WeakReference<>(mapMakerInternalMap);
        }

        @Override // java.lang.Runnable
        public void run() {
            MapMakerInternalMap<?, ?, ?, ?> mapMakerInternalMap = this.mapReference.get();
            if (mapMakerInternalMap == null) {
                throw new CancellationException();
            }
            for (Segment<?, ?, E, S> segment : mapMakerInternalMap.segments) {
                segment.runCleanup();
            }
        }
    }

    /* compiled from: PG */
    final class DummyInternalEntry implements InternalEntry<Object, Object, DummyInternalEntry> {
        private DummyInternalEntry() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public int getHash() {
            throw null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public Object getKey() {
            throw null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public DummyInternalEntry getNext() {
            throw null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public Object getValue() {
            throw null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public /* bridge */ /* synthetic */ InternalEntry getNext() {
            throw null;
        }
    }

    /* compiled from: PG */
    final class EntryIterator extends MapMakerInternalMap<K, V, E, S>.HashIterator<Map.Entry<K, V>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EntryIterator(MapMakerInternalMap mapMakerInternalMap) {
            super(mapMakerInternalMap);
            mapMakerInternalMap.getClass();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.HashIterator, java.util.Iterator
        public Map.Entry<K, V> next() {
            return nextEntry();
        }
    }

    /* compiled from: PG */
    final class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        final /* synthetic */ MapMakerInternalMap this$0;

        public EntrySet(MapMakerInternalMap mapMakerInternalMap) {
            mapMakerInternalMap.getClass();
            this.this$0 = mapMakerInternalMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.this$0.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = this.this$0.get(key)) != null && this.this$0.valueEquivalence().d(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.this$0.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new EntryIterator(this.this$0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && this.this$0.remove(key, entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.this$0.size();
        }
    }

    /* compiled from: PG */
    abstract class HashIterator<T> implements Iterator<T> {
        Segment<K, V, E, S> currentSegment;
        AtomicReferenceArray<E> currentTable;
        MapMakerInternalMap<K, V, E, S>.WriteThroughEntry lastReturned;
        E nextEntry;
        MapMakerInternalMap<K, V, E, S>.WriteThroughEntry nextExternal;
        int nextSegmentIndex;
        int nextTableIndex;
        final /* synthetic */ MapMakerInternalMap this$0;

        public HashIterator(MapMakerInternalMap mapMakerInternalMap) {
            mapMakerInternalMap.getClass();
            this.this$0 = mapMakerInternalMap;
            this.nextSegmentIndex = mapMakerInternalMap.segments.length - 1;
            this.nextTableIndex = -1;
            advance();
        }

        final void advance() {
            this.nextExternal = null;
            if (nextInChain() || nextInTable()) {
                return;
            }
            while (true) {
                int i = this.nextSegmentIndex;
                if (i < 0) {
                    return;
                }
                Segment<K, V, E, S>[] segmentArr = this.this$0.segments;
                this.nextSegmentIndex = i - 1;
                Segment<K, V, E, S> segment = segmentArr[i];
                this.currentSegment = segment;
                if (segment.count != 0) {
                    this.currentTable = this.currentSegment.table;
                    this.nextTableIndex = r0.length() - 1;
                    if (nextInTable()) {
                        return;
                    }
                }
            }
        }

        public boolean advanceTo(E e) {
            boolean z;
            try {
                Object key = e.getKey();
                Object liveValue = this.this$0.getLiveValue(e);
                if (liveValue != null) {
                    this.nextExternal = new WriteThroughEntry(this.this$0, key, liveValue);
                    z = true;
                } else {
                    z = false;
                }
                return z;
            } finally {
                this.currentSegment.postReadCleanup();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.nextExternal != null;
        }

        @Override // java.util.Iterator
        public abstract T next();

        public MapMakerInternalMap<K, V, E, S>.WriteThroughEntry nextEntry() {
            MapMakerInternalMap<K, V, E, S>.WriteThroughEntry writeThroughEntry = this.nextExternal;
            if (writeThroughEntry == null) {
                throw new NoSuchElementException();
            }
            this.lastReturned = writeThroughEntry;
            advance();
            return this.lastReturned;
        }

        public boolean nextInChain() {
            E e = this.nextEntry;
            if (e == null) {
                return false;
            }
            while (true) {
                this.nextEntry = (E) e.getNext();
                E e2 = this.nextEntry;
                if (e2 == null) {
                    return false;
                }
                if (advanceTo(e2)) {
                    return true;
                }
                e = this.nextEntry;
            }
        }

        public boolean nextInTable() {
            while (true) {
                int i = this.nextTableIndex;
                if (i < 0) {
                    return false;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.currentTable;
                this.nextTableIndex = i - 1;
                E e = atomicReferenceArray.get(i);
                this.nextEntry = e;
                if (e != null && (advanceTo(e) || nextInChain())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            CollectPreconditions.checkRemove(this.lastReturned != null);
            this.this$0.remove(this.lastReturned.getKey());
            this.lastReturned = null;
        }
    }

    /* compiled from: PG */
    interface InternalEntry<K, V, E extends InternalEntry<K, V, E>> {
        int getHash();

        K getKey();

        E getNext();

        V getValue();
    }

    /* compiled from: PG */
    interface InternalEntryHelper<K, V, E extends InternalEntry<K, V, E>, S extends Segment<K, V, E, S>> {
        E copy(S s, E e, E e2);

        Strength keyStrength();

        E newEntry(S s, K k, int i, E e);

        S newSegment(MapMakerInternalMap<K, V, E, S> mapMakerInternalMap, int i);

        void setValue(S s, E e, V v);

        Strength valueStrength();
    }

    /* compiled from: PG */
    final class KeyIterator extends MapMakerInternalMap<K, V, E, S>.HashIterator<K> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KeyIterator(MapMakerInternalMap mapMakerInternalMap) {
            super(mapMakerInternalMap);
            mapMakerInternalMap.getClass();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.HashIterator, java.util.Iterator
        public K next() {
            return nextEntry().getKey();
        }
    }

    /* compiled from: PG */
    final class KeySet extends AbstractSet<K> {
        final /* synthetic */ MapMakerInternalMap this$0;

        public KeySet(MapMakerInternalMap mapMakerInternalMap) {
            mapMakerInternalMap.getClass();
            this.this$0 = mapMakerInternalMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.this$0.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.this$0.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.this$0.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new KeyIterator(this.this$0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return this.this$0.remove(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.this$0.size();
        }
    }

    /* compiled from: PG */
    final class SerializationProxy<K, V> extends AbstractSerializationProxy<K, V> {
        private static final long serialVersionUID = 3;

        public SerializationProxy(Strength strength, Strength strength2, tsk<Object> tskVar, tsk<Object> tskVar2, int i, ConcurrentMap<K, V> concurrentMap) {
            super(strength, strength2, tskVar, tskVar2, i, concurrentMap);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.delegate = readMapMaker(objectInputStream).makeMap();
            readEntries(objectInputStream);
        }

        private Object readResolve() {
            return this.delegate;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            writeMapTo(objectOutputStream);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PG */
    abstract class Strength {
        private static final /* synthetic */ Strength[] $VALUES = $values();
        public static final Strength STRONG;
        public static final Strength WEAK;

        /* compiled from: PG */
        /* renamed from: com.google.common.collect.MapMakerInternalMap$Strength$1, reason: invalid class name */
        enum AnonymousClass1 extends Strength {
            @Override // com.google.common.collect.MapMakerInternalMap.Strength
            public tsk<Object> defaultEquivalence() {
                return tsh.a;
            }

            private AnonymousClass1(String str, int i) {
                super(str, i);
            }
        }

        /* compiled from: PG */
        /* renamed from: com.google.common.collect.MapMakerInternalMap$Strength$2, reason: invalid class name */
        enum AnonymousClass2 extends Strength {
            @Override // com.google.common.collect.MapMakerInternalMap.Strength
            public tsk<Object> defaultEquivalence() {
                return tsi.a;
            }

            private AnonymousClass2(String str, int i) {
                super(str, i);
            }
        }

        private static /* synthetic */ Strength[] $values() {
            return new Strength[]{STRONG, WEAK};
        }

        static {
            STRONG = new AnonymousClass1("STRONG", 0);
            WEAK = new AnonymousClass2("WEAK", 1);
        }

        public static Strength valueOf(String str) {
            return (Strength) Enum.valueOf(Strength.class, str);
        }

        public static Strength[] values() {
            return (Strength[]) $VALUES.clone();
        }

        public abstract tsk<Object> defaultEquivalence();

        private Strength(String str, int i) {
        }
    }

    /* compiled from: PG */
    class StrongKeyDummyValueEntry<K> extends AbstractStrongKeyEntry<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>> implements StrongValueEntry<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>> {

        /* compiled from: PG */
        final class Helper<K> implements InternalEntryHelper<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>, StrongKeyDummyValueSegment<K>> {
            private static final Helper<?> INSTANCE = new Helper<>();

            static <K> Helper<K> instance() {
                return (Helper<K>) INSTANCE;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength keyStrength() {
                return Strength.STRONG;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ InternalEntry newEntry(Segment segment, Object obj, int i, InternalEntry internalEntry) {
                return newEntry((StrongKeyDummyValueSegment<StrongKeyDummyValueSegment<K>>) segment, (StrongKeyDummyValueSegment<K>) obj, i, (StrongKeyDummyValueEntry<StrongKeyDummyValueSegment<K>>) internalEntry);
            }

            public void setValue(StrongKeyDummyValueSegment<K> strongKeyDummyValueSegment, StrongKeyDummyValueEntry<K> strongKeyDummyValueEntry, MapMaker.Dummy dummy) {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength valueStrength() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public StrongKeyDummyValueEntry<K> copy(StrongKeyDummyValueSegment<K> strongKeyDummyValueSegment, StrongKeyDummyValueEntry<K> strongKeyDummyValueEntry, StrongKeyDummyValueEntry<K> strongKeyDummyValueEntry2) {
                return newEntry((StrongKeyDummyValueSegment<StrongKeyDummyValueSegment<K>>) strongKeyDummyValueSegment, (StrongKeyDummyValueSegment<K>) strongKeyDummyValueEntry.key, strongKeyDummyValueEntry.hash, (StrongKeyDummyValueEntry<StrongKeyDummyValueSegment<K>>) strongKeyDummyValueEntry2);
            }

            public StrongKeyDummyValueEntry<K> newEntry(StrongKeyDummyValueSegment<K> strongKeyDummyValueSegment, K k, int i, StrongKeyDummyValueEntry<K> strongKeyDummyValueEntry) {
                return strongKeyDummyValueEntry == null ? new StrongKeyDummyValueEntry<>(k, i) : new LinkedStrongKeyDummyValueEntry(k, i, strongKeyDummyValueEntry);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public StrongKeyDummyValueSegment<K> newSegment(MapMakerInternalMap<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>, StrongKeyDummyValueSegment<K>> mapMakerInternalMap, int i) {
                return new StrongKeyDummyValueSegment<>(mapMakerInternalMap, i);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ void setValue(Segment segment, InternalEntry internalEntry, MapMaker.Dummy dummy) {
            }
        }

        /* compiled from: PG */
        final class LinkedStrongKeyDummyValueEntry<K> extends StrongKeyDummyValueEntry<K> {
            private final StrongKeyDummyValueEntry<K> next;

            public LinkedStrongKeyDummyValueEntry(K k, int i, StrongKeyDummyValueEntry<K> strongKeyDummyValueEntry) {
                super(k, i);
                this.next = strongKeyDummyValueEntry;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractStrongKeyEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public StrongKeyDummyValueEntry<K> getNext() {
                return this.next;
            }
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final MapMaker.Dummy getValue() {
            return MapMaker.Dummy.VALUE;
        }

        private StrongKeyDummyValueEntry(K k, int i) {
            super(k, i);
        }
    }

    /* compiled from: PG */
    final class StrongKeyDummyValueSegment<K> extends Segment<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>, StrongKeyDummyValueSegment<K>> {
        public StrongKeyDummyValueSegment(MapMakerInternalMap<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>, StrongKeyDummyValueSegment<K>> mapMakerInternalMap, int i) {
            super(mapMakerInternalMap, i);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public /* bridge */ /* synthetic */ Segment self() {
            return this;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public StrongKeyDummyValueEntry<K> castForTesting(InternalEntry<K, MapMaker.Dummy, ?> internalEntry) {
            return (StrongKeyDummyValueEntry) internalEntry;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public StrongKeyDummyValueSegment<K> self() {
            return this;
        }
    }

    /* compiled from: PG */
    class StrongKeyStrongValueEntry<K, V> extends AbstractStrongKeyEntry<K, V, StrongKeyStrongValueEntry<K, V>> implements StrongValueEntry<K, V, StrongKeyStrongValueEntry<K, V>> {
        private volatile V value;

        /* compiled from: PG */
        final class Helper<K, V> implements InternalEntryHelper<K, V, StrongKeyStrongValueEntry<K, V>, StrongKeyStrongValueSegment<K, V>> {
            private static final Helper<?, ?> INSTANCE = new Helper<>();

            static <K, V> Helper<K, V> instance() {
                return (Helper<K, V>) INSTANCE;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength keyStrength() {
                return Strength.STRONG;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ InternalEntry newEntry(Segment segment, Object obj, int i, InternalEntry internalEntry) {
                return newEntry((StrongKeyStrongValueSegment<StrongKeyStrongValueSegment<K, V>, V>) segment, (StrongKeyStrongValueSegment<K, V>) obj, i, (StrongKeyStrongValueEntry<StrongKeyStrongValueSegment<K, V>, V>) internalEntry);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ void setValue(Segment segment, InternalEntry internalEntry, Object obj) {
                setValue((StrongKeyStrongValueSegment<K, StrongKeyStrongValueEntry<K, V>>) segment, (StrongKeyStrongValueEntry<K, StrongKeyStrongValueEntry<K, V>>) internalEntry, (StrongKeyStrongValueEntry<K, V>) obj);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength valueStrength() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public StrongKeyStrongValueEntry<K, V> copy(StrongKeyStrongValueSegment<K, V> strongKeyStrongValueSegment, StrongKeyStrongValueEntry<K, V> strongKeyStrongValueEntry, StrongKeyStrongValueEntry<K, V> strongKeyStrongValueEntry2) {
                StrongKeyStrongValueEntry<K, V> strongKeyStrongValueEntryNewEntry = newEntry((StrongKeyStrongValueSegment<StrongKeyStrongValueSegment<K, V>, V>) strongKeyStrongValueSegment, (StrongKeyStrongValueSegment<K, V>) strongKeyStrongValueEntry.key, strongKeyStrongValueEntry.hash, (StrongKeyStrongValueEntry<StrongKeyStrongValueSegment<K, V>, V>) strongKeyStrongValueEntry2);
                ((StrongKeyStrongValueEntry) strongKeyStrongValueEntryNewEntry).value = ((StrongKeyStrongValueEntry) strongKeyStrongValueEntry).value;
                return strongKeyStrongValueEntryNewEntry;
            }

            public StrongKeyStrongValueEntry<K, V> newEntry(StrongKeyStrongValueSegment<K, V> strongKeyStrongValueSegment, K k, int i, StrongKeyStrongValueEntry<K, V> strongKeyStrongValueEntry) {
                return strongKeyStrongValueEntry == null ? new StrongKeyStrongValueEntry<>(k, i) : new LinkedStrongKeyStrongValueEntry(k, i, strongKeyStrongValueEntry);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public StrongKeyStrongValueSegment<K, V> newSegment(MapMakerInternalMap<K, V, StrongKeyStrongValueEntry<K, V>, StrongKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i) {
                return new StrongKeyStrongValueSegment<>(mapMakerInternalMap, i);
            }

            public void setValue(StrongKeyStrongValueSegment<K, V> strongKeyStrongValueSegment, StrongKeyStrongValueEntry<K, V> strongKeyStrongValueEntry, V v) {
                ((StrongKeyStrongValueEntry) strongKeyStrongValueEntry).value = v;
            }
        }

        /* compiled from: PG */
        final class LinkedStrongKeyStrongValueEntry<K, V> extends StrongKeyStrongValueEntry<K, V> {
            private final StrongKeyStrongValueEntry<K, V> next;

            public LinkedStrongKeyStrongValueEntry(K k, int i, StrongKeyStrongValueEntry<K, V> strongKeyStrongValueEntry) {
                super(k, i);
                this.next = strongKeyStrongValueEntry;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractStrongKeyEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public StrongKeyStrongValueEntry<K, V> getNext() {
                return this.next;
            }
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final V getValue() {
            return this.value;
        }

        private StrongKeyStrongValueEntry(K k, int i) {
            super(k, i);
            this.value = null;
        }
    }

    /* compiled from: PG */
    final class StrongKeyStrongValueSegment<K, V> extends Segment<K, V, StrongKeyStrongValueEntry<K, V>, StrongKeyStrongValueSegment<K, V>> {
        public StrongKeyStrongValueSegment(MapMakerInternalMap<K, V, StrongKeyStrongValueEntry<K, V>, StrongKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i) {
            super(mapMakerInternalMap, i);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public /* bridge */ /* synthetic */ Segment self() {
            return this;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public StrongKeyStrongValueEntry<K, V> castForTesting(InternalEntry<K, V, ?> internalEntry) {
            return (StrongKeyStrongValueEntry) internalEntry;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public StrongKeyStrongValueSegment<K, V> self() {
            return this;
        }
    }

    /* compiled from: PG */
    class StrongKeyWeakValueEntry<K, V> extends AbstractStrongKeyEntry<K, V, StrongKeyWeakValueEntry<K, V>> implements WeakValueEntry<K, V, StrongKeyWeakValueEntry<K, V>> {
        private volatile WeakValueReference<K, V, StrongKeyWeakValueEntry<K, V>> valueReference;

        /* compiled from: PG */
        final class Helper<K, V> implements InternalEntryHelper<K, V, StrongKeyWeakValueEntry<K, V>, StrongKeyWeakValueSegment<K, V>> {
            private static final Helper<?, ?> INSTANCE = new Helper<>();

            static <K, V> Helper<K, V> instance() {
                return (Helper<K, V>) INSTANCE;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength keyStrength() {
                return Strength.STRONG;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ InternalEntry newEntry(Segment segment, Object obj, int i, InternalEntry internalEntry) {
                return newEntry((StrongKeyWeakValueSegment<StrongKeyWeakValueSegment<K, V>, V>) segment, (StrongKeyWeakValueSegment<K, V>) obj, i, (StrongKeyWeakValueEntry<StrongKeyWeakValueSegment<K, V>, V>) internalEntry);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ void setValue(Segment segment, InternalEntry internalEntry, Object obj) {
                setValue((StrongKeyWeakValueSegment<K, StrongKeyWeakValueEntry<K, V>>) segment, (StrongKeyWeakValueEntry<K, StrongKeyWeakValueEntry<K, V>>) internalEntry, (StrongKeyWeakValueEntry<K, V>) obj);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength valueStrength() {
                return Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public StrongKeyWeakValueEntry<K, V> copy(StrongKeyWeakValueSegment<K, V> strongKeyWeakValueSegment, StrongKeyWeakValueEntry<K, V> strongKeyWeakValueEntry, StrongKeyWeakValueEntry<K, V> strongKeyWeakValueEntry2) {
                if (Segment.isCollected(strongKeyWeakValueEntry)) {
                    return null;
                }
                StrongKeyWeakValueEntry<K, V> strongKeyWeakValueEntryNewEntry = newEntry((StrongKeyWeakValueSegment<StrongKeyWeakValueSegment<K, V>, V>) strongKeyWeakValueSegment, (StrongKeyWeakValueSegment<K, V>) strongKeyWeakValueEntry.key, strongKeyWeakValueEntry.hash, (StrongKeyWeakValueEntry<StrongKeyWeakValueSegment<K, V>, V>) strongKeyWeakValueEntry2);
                ((StrongKeyWeakValueEntry) strongKeyWeakValueEntryNewEntry).valueReference = ((StrongKeyWeakValueEntry) strongKeyWeakValueEntry).valueReference.copyFor(((StrongKeyWeakValueSegment) strongKeyWeakValueSegment).queueForValues, strongKeyWeakValueEntryNewEntry);
                return strongKeyWeakValueEntryNewEntry;
            }

            public StrongKeyWeakValueEntry<K, V> newEntry(StrongKeyWeakValueSegment<K, V> strongKeyWeakValueSegment, K k, int i, StrongKeyWeakValueEntry<K, V> strongKeyWeakValueEntry) {
                return strongKeyWeakValueEntry == null ? new StrongKeyWeakValueEntry<>(k, i) : new LinkedStrongKeyWeakValueEntry(k, i, strongKeyWeakValueEntry);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public StrongKeyWeakValueSegment<K, V> newSegment(MapMakerInternalMap<K, V, StrongKeyWeakValueEntry<K, V>, StrongKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i) {
                return new StrongKeyWeakValueSegment<>(mapMakerInternalMap, i);
            }

            public void setValue(StrongKeyWeakValueSegment<K, V> strongKeyWeakValueSegment, StrongKeyWeakValueEntry<K, V> strongKeyWeakValueEntry, V v) {
                WeakValueReference weakValueReference = ((StrongKeyWeakValueEntry) strongKeyWeakValueEntry).valueReference;
                ((StrongKeyWeakValueEntry) strongKeyWeakValueEntry).valueReference = new WeakValueReferenceImpl(((StrongKeyWeakValueSegment) strongKeyWeakValueSegment).queueForValues, v, strongKeyWeakValueEntry);
                weakValueReference.clear();
            }
        }

        /* compiled from: PG */
        final class LinkedStrongKeyWeakValueEntry<K, V> extends StrongKeyWeakValueEntry<K, V> {
            private final StrongKeyWeakValueEntry<K, V> next;

            public LinkedStrongKeyWeakValueEntry(K k, int i, StrongKeyWeakValueEntry<K, V> strongKeyWeakValueEntry) {
                super(k, i);
                this.next = strongKeyWeakValueEntry;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractStrongKeyEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public StrongKeyWeakValueEntry<K, V> getNext() {
                return this.next;
            }
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final V getValue() {
            return this.valueReference.get();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueEntry
        public final WeakValueReference<K, V, StrongKeyWeakValueEntry<K, V>> getValueReference() {
            return this.valueReference;
        }

        private StrongKeyWeakValueEntry(K k, int i) {
            super(k, i);
            this.valueReference = MapMakerInternalMap.unsetWeakValueReference();
        }
    }

    /* compiled from: PG */
    final class StrongKeyWeakValueSegment<K, V> extends Segment<K, V, StrongKeyWeakValueEntry<K, V>, StrongKeyWeakValueSegment<K, V>> {
        private final ReferenceQueue<V> queueForValues;

        public StrongKeyWeakValueSegment(MapMakerInternalMap<K, V, StrongKeyWeakValueEntry<K, V>, StrongKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i) {
            super(mapMakerInternalMap, i);
            this.queueForValues = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        ReferenceQueue<V> getValueReferenceQueueForTesting() {
            return this.queueForValues;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public WeakValueReference<K, V, StrongKeyWeakValueEntry<K, V>> getWeakValueReferenceForTesting(InternalEntry<K, V, ?> internalEntry) {
            return castForTesting((InternalEntry) internalEntry).getValueReference();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void maybeClearReferenceQueues() {
            clearReferenceQueue(this.queueForValues);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void maybeDrainReferenceQueues() {
            drainValueReferenceQueue(this.queueForValues);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public WeakValueReference<K, V, StrongKeyWeakValueEntry<K, V>> newWeakValueReferenceForTesting(InternalEntry<K, V, ?> internalEntry, V v) {
            return new WeakValueReferenceImpl(this.queueForValues, v, castForTesting((InternalEntry) internalEntry));
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public /* bridge */ /* synthetic */ Segment self() {
            return this;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void setWeakValueReferenceForTesting(InternalEntry<K, V, ?> internalEntry, WeakValueReference<K, V, ? extends InternalEntry<K, V, ?>> weakValueReference) {
            StrongKeyWeakValueEntry<K, V> strongKeyWeakValueEntryCastForTesting = castForTesting((InternalEntry) internalEntry);
            WeakValueReference weakValueReference2 = ((StrongKeyWeakValueEntry) strongKeyWeakValueEntryCastForTesting).valueReference;
            ((StrongKeyWeakValueEntry) strongKeyWeakValueEntryCastForTesting).valueReference = weakValueReference;
            weakValueReference2.clear();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public StrongKeyWeakValueEntry<K, V> castForTesting(InternalEntry<K, V, ?> internalEntry) {
            return (StrongKeyWeakValueEntry) internalEntry;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public StrongKeyWeakValueSegment<K, V> self() {
            return this;
        }
    }

    /* compiled from: PG */
    interface StrongValueEntry<K, V, E extends InternalEntry<K, V, E>> extends InternalEntry<K, V, E> {
    }

    /* compiled from: PG */
    final class ValueIterator extends MapMakerInternalMap<K, V, E, S>.HashIterator<V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ValueIterator(MapMakerInternalMap mapMakerInternalMap) {
            super(mapMakerInternalMap);
            mapMakerInternalMap.getClass();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.HashIterator, java.util.Iterator
        public V next() {
            return nextEntry().getValue();
        }
    }

    /* compiled from: PG */
    final class Values extends AbstractCollection<V> {
        final /* synthetic */ MapMakerInternalMap this$0;

        public Values(MapMakerInternalMap mapMakerInternalMap) {
            mapMakerInternalMap.getClass();
            this.this$0 = mapMakerInternalMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.this$0.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.this$0.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.this$0.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new ValueIterator(this.this$0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.this$0.size();
        }
    }

    /* compiled from: PG */
    class WeakKeyDummyValueEntry<K> extends AbstractWeakKeyEntry<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>> implements StrongValueEntry<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>> {

        /* compiled from: PG */
        final class Helper<K> implements InternalEntryHelper<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>, WeakKeyDummyValueSegment<K>> {
            private static final Helper<?> INSTANCE = new Helper<>();

            static <K> Helper<K> instance() {
                return (Helper<K>) INSTANCE;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength keyStrength() {
                return Strength.WEAK;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ InternalEntry newEntry(Segment segment, Object obj, int i, InternalEntry internalEntry) {
                return newEntry((WeakKeyDummyValueSegment<WeakKeyDummyValueSegment<K>>) segment, (WeakKeyDummyValueSegment<K>) obj, i, (WeakKeyDummyValueEntry<WeakKeyDummyValueSegment<K>>) internalEntry);
            }

            public void setValue(WeakKeyDummyValueSegment<K> weakKeyDummyValueSegment, WeakKeyDummyValueEntry<K> weakKeyDummyValueEntry, MapMaker.Dummy dummy) {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength valueStrength() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public WeakKeyDummyValueEntry<K> copy(WeakKeyDummyValueSegment<K> weakKeyDummyValueSegment, WeakKeyDummyValueEntry<K> weakKeyDummyValueEntry, WeakKeyDummyValueEntry<K> weakKeyDummyValueEntry2) {
                K key = weakKeyDummyValueEntry.getKey();
                if (key == null) {
                    return null;
                }
                return newEntry((WeakKeyDummyValueSegment<WeakKeyDummyValueSegment<K>>) weakKeyDummyValueSegment, (WeakKeyDummyValueSegment<K>) key, weakKeyDummyValueEntry.hash, (WeakKeyDummyValueEntry<WeakKeyDummyValueSegment<K>>) weakKeyDummyValueEntry2);
            }

            public WeakKeyDummyValueEntry<K> newEntry(WeakKeyDummyValueSegment<K> weakKeyDummyValueSegment, K k, int i, WeakKeyDummyValueEntry<K> weakKeyDummyValueEntry) {
                return weakKeyDummyValueEntry == null ? new WeakKeyDummyValueEntry<>(((WeakKeyDummyValueSegment) weakKeyDummyValueSegment).queueForKeys, k, i) : new LinkedWeakKeyDummyValueEntry(((WeakKeyDummyValueSegment) weakKeyDummyValueSegment).queueForKeys, k, i, weakKeyDummyValueEntry);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public WeakKeyDummyValueSegment<K> newSegment(MapMakerInternalMap<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>, WeakKeyDummyValueSegment<K>> mapMakerInternalMap, int i) {
                return new WeakKeyDummyValueSegment<>(mapMakerInternalMap, i);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ void setValue(Segment segment, InternalEntry internalEntry, MapMaker.Dummy dummy) {
            }
        }

        /* compiled from: PG */
        final class LinkedWeakKeyDummyValueEntry<K> extends WeakKeyDummyValueEntry<K> {
            private final WeakKeyDummyValueEntry<K> next;

            private LinkedWeakKeyDummyValueEntry(ReferenceQueue<K> referenceQueue, K k, int i, WeakKeyDummyValueEntry<K> weakKeyDummyValueEntry) {
                super(referenceQueue, k, i);
                this.next = weakKeyDummyValueEntry;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractWeakKeyEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public WeakKeyDummyValueEntry<K> getNext() {
                return this.next;
            }
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final MapMaker.Dummy getValue() {
            return MapMaker.Dummy.VALUE;
        }

        private WeakKeyDummyValueEntry(ReferenceQueue<K> referenceQueue, K k, int i) {
            super(referenceQueue, k, i);
        }
    }

    /* compiled from: PG */
    final class WeakKeyDummyValueSegment<K> extends Segment<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>, WeakKeyDummyValueSegment<K>> {
        private final ReferenceQueue<K> queueForKeys;

        public WeakKeyDummyValueSegment(MapMakerInternalMap<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>, WeakKeyDummyValueSegment<K>> mapMakerInternalMap, int i) {
            super(mapMakerInternalMap, i);
            this.queueForKeys = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        ReferenceQueue<K> getKeyReferenceQueueForTesting() {
            return this.queueForKeys;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void maybeClearReferenceQueues() {
            clearReferenceQueue(this.queueForKeys);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void maybeDrainReferenceQueues() {
            drainKeyReferenceQueue(this.queueForKeys);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public /* bridge */ /* synthetic */ Segment self() {
            return this;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public WeakKeyDummyValueEntry<K> castForTesting(InternalEntry<K, MapMaker.Dummy, ?> internalEntry) {
            return (WeakKeyDummyValueEntry) internalEntry;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public WeakKeyDummyValueSegment<K> self() {
            return this;
        }
    }

    /* compiled from: PG */
    class WeakKeyStrongValueEntry<K, V> extends AbstractWeakKeyEntry<K, V, WeakKeyStrongValueEntry<K, V>> implements StrongValueEntry<K, V, WeakKeyStrongValueEntry<K, V>> {
        private volatile V value;

        /* compiled from: PG */
        final class Helper<K, V> implements InternalEntryHelper<K, V, WeakKeyStrongValueEntry<K, V>, WeakKeyStrongValueSegment<K, V>> {
            private static final Helper<?, ?> INSTANCE = new Helper<>();

            static <K, V> Helper<K, V> instance() {
                return (Helper<K, V>) INSTANCE;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength keyStrength() {
                return Strength.WEAK;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ InternalEntry newEntry(Segment segment, Object obj, int i, InternalEntry internalEntry) {
                return newEntry((WeakKeyStrongValueSegment<WeakKeyStrongValueSegment<K, V>, V>) segment, (WeakKeyStrongValueSegment<K, V>) obj, i, (WeakKeyStrongValueEntry<WeakKeyStrongValueSegment<K, V>, V>) internalEntry);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ void setValue(Segment segment, InternalEntry internalEntry, Object obj) {
                setValue((WeakKeyStrongValueSegment<K, WeakKeyStrongValueEntry<K, V>>) segment, (WeakKeyStrongValueEntry<K, WeakKeyStrongValueEntry<K, V>>) internalEntry, (WeakKeyStrongValueEntry<K, V>) obj);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength valueStrength() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public WeakKeyStrongValueEntry<K, V> copy(WeakKeyStrongValueSegment<K, V> weakKeyStrongValueSegment, WeakKeyStrongValueEntry<K, V> weakKeyStrongValueEntry, WeakKeyStrongValueEntry<K, V> weakKeyStrongValueEntry2) {
                K key = weakKeyStrongValueEntry.getKey();
                if (key == null) {
                    return null;
                }
                WeakKeyStrongValueEntry<K, V> weakKeyStrongValueEntryNewEntry = newEntry((WeakKeyStrongValueSegment<WeakKeyStrongValueSegment<K, V>, V>) weakKeyStrongValueSegment, (WeakKeyStrongValueSegment<K, V>) key, weakKeyStrongValueEntry.hash, (WeakKeyStrongValueEntry<WeakKeyStrongValueSegment<K, V>, V>) weakKeyStrongValueEntry2);
                ((WeakKeyStrongValueEntry) weakKeyStrongValueEntryNewEntry).value = ((WeakKeyStrongValueEntry) weakKeyStrongValueEntry).value;
                return weakKeyStrongValueEntryNewEntry;
            }

            public WeakKeyStrongValueEntry<K, V> newEntry(WeakKeyStrongValueSegment<K, V> weakKeyStrongValueSegment, K k, int i, WeakKeyStrongValueEntry<K, V> weakKeyStrongValueEntry) {
                return weakKeyStrongValueEntry == null ? new WeakKeyStrongValueEntry<>(((WeakKeyStrongValueSegment) weakKeyStrongValueSegment).queueForKeys, k, i) : new LinkedWeakKeyStrongValueEntry(((WeakKeyStrongValueSegment) weakKeyStrongValueSegment).queueForKeys, k, i, weakKeyStrongValueEntry);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public WeakKeyStrongValueSegment<K, V> newSegment(MapMakerInternalMap<K, V, WeakKeyStrongValueEntry<K, V>, WeakKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i) {
                return new WeakKeyStrongValueSegment<>(mapMakerInternalMap, i);
            }

            public void setValue(WeakKeyStrongValueSegment<K, V> weakKeyStrongValueSegment, WeakKeyStrongValueEntry<K, V> weakKeyStrongValueEntry, V v) {
                ((WeakKeyStrongValueEntry) weakKeyStrongValueEntry).value = v;
            }
        }

        /* compiled from: PG */
        final class LinkedWeakKeyStrongValueEntry<K, V> extends WeakKeyStrongValueEntry<K, V> {
            private final WeakKeyStrongValueEntry<K, V> next;

            private LinkedWeakKeyStrongValueEntry(ReferenceQueue<K> referenceQueue, K k, int i, WeakKeyStrongValueEntry<K, V> weakKeyStrongValueEntry) {
                super(referenceQueue, k, i);
                this.next = weakKeyStrongValueEntry;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractWeakKeyEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public WeakKeyStrongValueEntry<K, V> getNext() {
                return this.next;
            }
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final V getValue() {
            return this.value;
        }

        private WeakKeyStrongValueEntry(ReferenceQueue<K> referenceQueue, K k, int i) {
            super(referenceQueue, k, i);
            this.value = null;
        }
    }

    /* compiled from: PG */
    final class WeakKeyStrongValueSegment<K, V> extends Segment<K, V, WeakKeyStrongValueEntry<K, V>, WeakKeyStrongValueSegment<K, V>> {
        private final ReferenceQueue<K> queueForKeys;

        public WeakKeyStrongValueSegment(MapMakerInternalMap<K, V, WeakKeyStrongValueEntry<K, V>, WeakKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i) {
            super(mapMakerInternalMap, i);
            this.queueForKeys = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        ReferenceQueue<K> getKeyReferenceQueueForTesting() {
            return this.queueForKeys;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void maybeClearReferenceQueues() {
            clearReferenceQueue(this.queueForKeys);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void maybeDrainReferenceQueues() {
            drainKeyReferenceQueue(this.queueForKeys);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public /* bridge */ /* synthetic */ Segment self() {
            return this;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public WeakKeyStrongValueEntry<K, V> castForTesting(InternalEntry<K, V, ?> internalEntry) {
            return (WeakKeyStrongValueEntry) internalEntry;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public WeakKeyStrongValueSegment<K, V> self() {
            return this;
        }
    }

    /* compiled from: PG */
    class WeakKeyWeakValueEntry<K, V> extends AbstractWeakKeyEntry<K, V, WeakKeyWeakValueEntry<K, V>> implements WeakValueEntry<K, V, WeakKeyWeakValueEntry<K, V>> {
        private volatile WeakValueReference<K, V, WeakKeyWeakValueEntry<K, V>> valueReference;

        /* compiled from: PG */
        final class Helper<K, V> implements InternalEntryHelper<K, V, WeakKeyWeakValueEntry<K, V>, WeakKeyWeakValueSegment<K, V>> {
            private static final Helper<?, ?> INSTANCE = new Helper<>();

            static <K, V> Helper<K, V> instance() {
                return (Helper<K, V>) INSTANCE;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength keyStrength() {
                return Strength.WEAK;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ InternalEntry newEntry(Segment segment, Object obj, int i, InternalEntry internalEntry) {
                return newEntry((WeakKeyWeakValueSegment<WeakKeyWeakValueSegment<K, V>, V>) segment, (WeakKeyWeakValueSegment<K, V>) obj, i, (WeakKeyWeakValueEntry<WeakKeyWeakValueSegment<K, V>, V>) internalEntry);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ void setValue(Segment segment, InternalEntry internalEntry, Object obj) {
                setValue((WeakKeyWeakValueSegment<K, WeakKeyWeakValueEntry<K, V>>) segment, (WeakKeyWeakValueEntry<K, WeakKeyWeakValueEntry<K, V>>) internalEntry, (WeakKeyWeakValueEntry<K, V>) obj);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength valueStrength() {
                return Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public WeakKeyWeakValueEntry<K, V> copy(WeakKeyWeakValueSegment<K, V> weakKeyWeakValueSegment, WeakKeyWeakValueEntry<K, V> weakKeyWeakValueEntry, WeakKeyWeakValueEntry<K, V> weakKeyWeakValueEntry2) {
                K key = weakKeyWeakValueEntry.getKey();
                if (key == null || Segment.isCollected(weakKeyWeakValueEntry)) {
                    return null;
                }
                WeakKeyWeakValueEntry<K, V> weakKeyWeakValueEntryNewEntry = newEntry((WeakKeyWeakValueSegment<WeakKeyWeakValueSegment<K, V>, V>) weakKeyWeakValueSegment, (WeakKeyWeakValueSegment<K, V>) key, weakKeyWeakValueEntry.hash, (WeakKeyWeakValueEntry<WeakKeyWeakValueSegment<K, V>, V>) weakKeyWeakValueEntry2);
                ((WeakKeyWeakValueEntry) weakKeyWeakValueEntryNewEntry).valueReference = ((WeakKeyWeakValueEntry) weakKeyWeakValueEntry).valueReference.copyFor(((WeakKeyWeakValueSegment) weakKeyWeakValueSegment).queueForValues, weakKeyWeakValueEntryNewEntry);
                return weakKeyWeakValueEntryNewEntry;
            }

            public WeakKeyWeakValueEntry<K, V> newEntry(WeakKeyWeakValueSegment<K, V> weakKeyWeakValueSegment, K k, int i, WeakKeyWeakValueEntry<K, V> weakKeyWeakValueEntry) {
                return weakKeyWeakValueEntry == null ? new WeakKeyWeakValueEntry<>(((WeakKeyWeakValueSegment) weakKeyWeakValueSegment).queueForKeys, k, i) : new LinkedWeakKeyWeakValueEntry(((WeakKeyWeakValueSegment) weakKeyWeakValueSegment).queueForKeys, k, i, weakKeyWeakValueEntry);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public WeakKeyWeakValueSegment<K, V> newSegment(MapMakerInternalMap<K, V, WeakKeyWeakValueEntry<K, V>, WeakKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i) {
                return new WeakKeyWeakValueSegment<>(mapMakerInternalMap, i);
            }

            public void setValue(WeakKeyWeakValueSegment<K, V> weakKeyWeakValueSegment, WeakKeyWeakValueEntry<K, V> weakKeyWeakValueEntry, V v) {
                WeakValueReference weakValueReference = ((WeakKeyWeakValueEntry) weakKeyWeakValueEntry).valueReference;
                ((WeakKeyWeakValueEntry) weakKeyWeakValueEntry).valueReference = new WeakValueReferenceImpl(((WeakKeyWeakValueSegment) weakKeyWeakValueSegment).queueForValues, v, weakKeyWeakValueEntry);
                weakValueReference.clear();
            }
        }

        /* compiled from: PG */
        final class LinkedWeakKeyWeakValueEntry<K, V> extends WeakKeyWeakValueEntry<K, V> {
            private final WeakKeyWeakValueEntry<K, V> next;

            public LinkedWeakKeyWeakValueEntry(ReferenceQueue<K> referenceQueue, K k, int i, WeakKeyWeakValueEntry<K, V> weakKeyWeakValueEntry) {
                super(referenceQueue, k, i);
                this.next = weakKeyWeakValueEntry;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractWeakKeyEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public WeakKeyWeakValueEntry<K, V> getNext() {
                return this.next;
            }
        }

        public WeakKeyWeakValueEntry(ReferenceQueue<K> referenceQueue, K k, int i) {
            super(referenceQueue, k, i);
            this.valueReference = MapMakerInternalMap.unsetWeakValueReference();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final V getValue() {
            return this.valueReference.get();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueEntry
        public final WeakValueReference<K, V, WeakKeyWeakValueEntry<K, V>> getValueReference() {
            return this.valueReference;
        }
    }

    /* compiled from: PG */
    final class WeakKeyWeakValueSegment<K, V> extends Segment<K, V, WeakKeyWeakValueEntry<K, V>, WeakKeyWeakValueSegment<K, V>> {
        private final ReferenceQueue<K> queueForKeys;
        private final ReferenceQueue<V> queueForValues;

        public WeakKeyWeakValueSegment(MapMakerInternalMap<K, V, WeakKeyWeakValueEntry<K, V>, WeakKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i) {
            super(mapMakerInternalMap, i);
            this.queueForKeys = new ReferenceQueue<>();
            this.queueForValues = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        ReferenceQueue<K> getKeyReferenceQueueForTesting() {
            return this.queueForKeys;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        ReferenceQueue<V> getValueReferenceQueueForTesting() {
            return this.queueForValues;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public WeakValueReference<K, V, WeakKeyWeakValueEntry<K, V>> getWeakValueReferenceForTesting(InternalEntry<K, V, ?> internalEntry) {
            return castForTesting((InternalEntry) internalEntry).getValueReference();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void maybeClearReferenceQueues() {
            clearReferenceQueue(this.queueForKeys);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void maybeDrainReferenceQueues() {
            drainKeyReferenceQueue(this.queueForKeys);
            drainValueReferenceQueue(this.queueForValues);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public WeakValueReference<K, V, WeakKeyWeakValueEntry<K, V>> newWeakValueReferenceForTesting(InternalEntry<K, V, ?> internalEntry, V v) {
            return new WeakValueReferenceImpl(this.queueForValues, v, castForTesting((InternalEntry) internalEntry));
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public /* bridge */ /* synthetic */ Segment self() {
            return this;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void setWeakValueReferenceForTesting(InternalEntry<K, V, ?> internalEntry, WeakValueReference<K, V, ? extends InternalEntry<K, V, ?>> weakValueReference) {
            WeakKeyWeakValueEntry<K, V> weakKeyWeakValueEntryCastForTesting = castForTesting((InternalEntry) internalEntry);
            WeakValueReference weakValueReference2 = ((WeakKeyWeakValueEntry) weakKeyWeakValueEntryCastForTesting).valueReference;
            ((WeakKeyWeakValueEntry) weakKeyWeakValueEntryCastForTesting).valueReference = weakValueReference;
            weakValueReference2.clear();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public WeakKeyWeakValueEntry<K, V> castForTesting(InternalEntry<K, V, ?> internalEntry) {
            return (WeakKeyWeakValueEntry) internalEntry;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public WeakKeyWeakValueSegment<K, V> self() {
            return this;
        }
    }

    /* compiled from: PG */
    interface WeakValueEntry<K, V, E extends InternalEntry<K, V, E>> extends InternalEntry<K, V, E> {
        WeakValueReference<K, V, E> getValueReference();
    }

    /* compiled from: PG */
    interface WeakValueReference<K, V, E extends InternalEntry<K, V, E>> {
        void clear();

        WeakValueReference<K, V, E> copyFor(ReferenceQueue<V> referenceQueue, E e);

        V get();

        E getEntry();
    }

    /* compiled from: PG */
    final class WeakValueReferenceImpl<K, V, E extends InternalEntry<K, V, E>> extends WeakReference<V> implements WeakValueReference<K, V, E> {
        final E entry;

        public WeakValueReferenceImpl(ReferenceQueue<V> referenceQueue, V v, E e) {
            super(v, referenceQueue);
            this.entry = e;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public WeakValueReference<K, V, E> copyFor(ReferenceQueue<V> referenceQueue, E e) {
            return new WeakValueReferenceImpl(referenceQueue, get(), e);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public E getEntry() {
            return this.entry;
        }
    }

    /* compiled from: PG */
    final class WriteThroughEntry extends AbstractMapEntry<K, V> {
        final K key;
        final /* synthetic */ MapMakerInternalMap this$0;
        V value;

        public WriteThroughEntry(MapMakerInternalMap mapMakerInternalMap, K k, V v) {
            mapMakerInternalMap.getClass();
            this.this$0 = mapMakerInternalMap;
            this.key = k;
            this.value = v;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (this.key.equals(entry.getKey()) && this.value.equals(entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public K getKey() {
            return this.key;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public int hashCode() {
            return this.key.hashCode() ^ this.value.hashCode();
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public V setValue(V v) {
            V v2 = (V) this.this$0.put(this.key, v);
            this.value = v;
            return v2;
        }
    }

    private MapMakerInternalMap(MapMaker mapMaker, InternalEntryHelper<K, V, E, S> internalEntryHelper) {
        this.concurrencyLevel = Math.min(mapMaker.getConcurrencyLevel(), MAX_SEGMENTS);
        this.keyEquivalence = mapMaker.getKeyEquivalence();
        this.entryHelper = internalEntryHelper;
        int iMin = Math.min(mapMaker.getInitialCapacity(), MAXIMUM_CAPACITY);
        int i = 1;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i3 < this.concurrencyLevel) {
            i4++;
            i3 += i3;
        }
        this.segmentShift = 32 - i4;
        this.segmentMask = i3 - 1;
        this.segments = newSegmentArray(i3);
        int i5 = iMin / i3;
        while (i < (i3 * i5 < iMin ? i5 + 1 : i5)) {
            i += i;
        }
        while (true) {
            Segment<K, V, E, S>[] segmentArr = this.segments;
            if (i2 >= segmentArr.length) {
                return;
            }
            segmentArr[i2] = createSegment(i);
            i2++;
        }
    }

    static <K, V> MapMakerInternalMap<K, V, ? extends InternalEntry<K, V, ?>, ?> create(MapMaker mapMaker) {
        if (mapMaker.getKeyStrength() == Strength.STRONG && mapMaker.getValueStrength() == Strength.STRONG) {
            return new MapMakerInternalMap<>(mapMaker, StrongKeyStrongValueEntry.Helper.instance());
        }
        if (mapMaker.getKeyStrength() == Strength.STRONG && mapMaker.getValueStrength() == Strength.WEAK) {
            return new MapMakerInternalMap<>(mapMaker, StrongKeyWeakValueEntry.Helper.instance());
        }
        if (mapMaker.getKeyStrength() == Strength.WEAK && mapMaker.getValueStrength() == Strength.STRONG) {
            return new MapMakerInternalMap<>(mapMaker, WeakKeyStrongValueEntry.Helper.instance());
        }
        if (mapMaker.getKeyStrength() == Strength.WEAK && mapMaker.getValueStrength() == Strength.WEAK) {
            return new MapMakerInternalMap<>(mapMaker, WeakKeyWeakValueEntry.Helper.instance());
        }
        throw new AssertionError();
    }

    static <K> MapMakerInternalMap<K, MapMaker.Dummy, ? extends InternalEntry<K, MapMaker.Dummy, ?>, ?> createWithDummyValues(MapMaker mapMaker) {
        if (mapMaker.getKeyStrength() == Strength.STRONG && mapMaker.getValueStrength() == Strength.STRONG) {
            return new MapMakerInternalMap<>(mapMaker, StrongKeyDummyValueEntry.Helper.instance());
        }
        if (mapMaker.getKeyStrength() == Strength.WEAK && mapMaker.getValueStrength() == Strength.STRONG) {
            return new MapMakerInternalMap<>(mapMaker, WeakKeyDummyValueEntry.Helper.instance());
        }
        if (mapMaker.getValueStrength() == Strength.WEAK) {
            throw new IllegalArgumentException("Map cannot have both weak and dummy values");
        }
        throw new AssertionError();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializationProxy");
    }

    static int rehash(int i) {
        int i2 = i + ((i << 15) ^ (-12931));
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (i5 << 2) + (i5 << 14);
        return i6 ^ (i6 >>> 16);
    }

    static <K, V, E extends InternalEntry<K, V, E>> WeakValueReference<K, V, E> unsetWeakValueReference() {
        return (WeakValueReference<K, V, E>) UNSET_WEAK_VALUE_REFERENCE;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (Segment<K, V, E, S> segment : this.segments) {
            segment.clear();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return ConcurrentMap.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int iHash = hash(obj);
        return segmentFor(iHash).containsKey(obj, iHash);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        boolean z = false;
        if (obj == null) {
            return false;
        }
        Segment<K, V, E, S>[] segmentArr = this.segments;
        long j = -1;
        int i = 0;
        while (i < 3) {
            int length = segmentArr.length;
            long j2 = 0;
            for (?? r10 = z; r10 < length; r10++) {
                Segment<K, V, E, S> segment = segmentArr[r10];
                int i2 = segment.count;
                AtomicReferenceArray<E> atomicReferenceArray = segment.table;
                for (?? r13 = z; r13 < atomicReferenceArray.length(); r13++) {
                    E next = atomicReferenceArray.get(r13);
                    while (next != null) {
                        V liveValue = segment.getLiveValue(next);
                        boolean z2 = z;
                        if (liveValue != null && valueEquivalence().d(obj, liveValue)) {
                            return true;
                        }
                        next = next.getNext();
                        z = z2;
                    }
                }
                j2 += segment.modCount;
                z = z;
            }
            boolean z3 = z;
            if (j2 == j) {
                return z3;
            }
            i++;
            j = j2;
            z = z3;
        }
        return z;
    }

    E copyEntry(E e, E e2) {
        return (E) segmentFor(e.getHash()).copyEntry(e, e2);
    }

    public Segment<K, V, E, S> createSegment(int i) {
        return this.entryHelper.newSegment(this, i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        EntrySet entrySet = new EntrySet(this);
        this.entrySet = entrySet;
        return entrySet;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        ConcurrentMap.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int iHash = hash(obj);
        return segmentFor(iHash).get(obj, iHash);
    }

    public E getEntry(Object obj) {
        if (obj == null) {
            return null;
        }
        int iHash = hash(obj);
        return (E) segmentFor(iHash).getEntry(obj, iHash);
    }

    public V getLiveValue(E e) {
        if (e.getKey() == null) {
            return null;
        }
        return (V) e.getValue();
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return ConcurrentMap.CC.$default$getOrDefault(this, obj, obj2);
    }

    public int hash(Object obj) {
        return rehash(this.keyEquivalence.c(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        int i = 0;
        long j = 0;
        while (true) {
            Segment<K, V, E, S>[] segmentArr = this.segments;
            if (i >= segmentArr.length) {
                if (j == 0) {
                    return true;
                }
                for (int i2 = 0; i2 < segmentArr.length; i2++) {
                    if (segmentArr[i2].count != 0) {
                        return false;
                    }
                    j -= segmentArr[i2].modCount;
                }
                return j == 0;
            }
            if (segmentArr[i].count != 0) {
                return false;
            }
            j += segmentArr[i].modCount;
            i++;
        }
    }

    boolean isLiveForTesting(InternalEntry<K, V, ?> internalEntry) {
        return segmentFor(internalEntry.getHash()).getLiveValueForTesting(internalEntry) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        KeySet keySet = new KeySet(this);
        this.keySet = keySet;
        return keySet;
    }

    Strength keyStrength() {
        return this.entryHelper.keyStrength();
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$merge(this, obj, obj2, biFunction);
    }

    final Segment<K, V, E, S>[] newSegmentArray(int i) {
        return new Segment[i];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        k.getClass();
        v.getClass();
        int iHash = hash(k);
        return segmentFor(iHash).put(k, iHash, v, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public V putIfAbsent(K k, V v) {
        k.getClass();
        v.getClass();
        int iHash = hash(k);
        return segmentFor(iHash).put(k, iHash, v, true);
    }

    public void reclaimKey(E e) {
        int hash = e.getHash();
        segmentFor(hash).reclaimKey(e, hash);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void reclaimValue(WeakValueReference<K, V, E> weakValueReference) {
        InternalEntry entry = weakValueReference.getEntry();
        int hash = entry.getHash();
        segmentFor(hash).reclaimValue(entry.getKey(), hash, weakValueReference);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int iHash = hash(obj);
        return segmentFor(iHash).remove(obj, iHash);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public V replace(K k, V v) {
        k.getClass();
        v.getClass();
        int iHash = hash(k);
        return segmentFor(iHash).replace(k, iHash, v);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        ConcurrentMap.CC.$default$replaceAll(this, biFunction);
    }

    public Segment<K, V, E, S> segmentFor(int i) {
        return this.segments[(i >>> this.segmentShift) & this.segmentMask];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        int i = 0;
        long j = 0;
        while (true) {
            if (i >= this.segments.length) {
                return sfy.ab(j);
            }
            j += r3[i].count;
            i++;
        }
    }

    public tsk<Object> valueEquivalence() {
        return this.entryHelper.valueStrength().defaultEquivalence();
    }

    Strength valueStrength() {
        return this.entryHelper.valueStrength();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.values;
        if (collection != null) {
            return collection;
        }
        Values values = new Values(this);
        this.values = values;
        return values;
    }

    Object writeReplace() {
        InternalEntryHelper<K, V, E, S> internalEntryHelper = this.entryHelper;
        return new SerializationProxy(internalEntryHelper.keyStrength(), internalEntryHelper.valueStrength(), this.keyEquivalence, internalEntryHelper.valueStrength().defaultEquivalence(), this.concurrencyLevel, this);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int iHash = hash(obj);
        return segmentFor(iHash).remove(obj, iHash, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public boolean replace(K k, V v, V v2) {
        k.getClass();
        v2.getClass();
        if (v == null) {
            return false;
        }
        int iHash = hash(k);
        return segmentFor(iHash).replace(k, iHash, v, v2);
    }

    /* compiled from: PG */
    abstract class Segment<K, V, E extends InternalEntry<K, V, E>, S extends Segment<K, V, E, S>> extends ReentrantLock {
        volatile int count;
        final MapMakerInternalMap<K, V, E, S> map;
        int modCount;
        final AtomicInteger readCount = new AtomicInteger();
        volatile AtomicReferenceArray<E> table;
        int threshold;

        public Segment(MapMakerInternalMap<K, V, E, S> mapMakerInternalMap, int i) {
            this.map = mapMakerInternalMap;
            initTable(newEntryArray(i));
        }

        static <K, V, E extends InternalEntry<K, V, E>> boolean isCollected(E e) {
            return e.getValue() == null;
        }

        public abstract E castForTesting(InternalEntry<K, V, ?> internalEntry);

        public void clear() {
            if (this.count != 0) {
                lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = this.table;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        atomicReferenceArray.set(i, null);
                    }
                    maybeClearReferenceQueues();
                    this.readCount.set(0);
                    this.modCount++;
                    this.count = 0;
                } finally {
                    unlock();
                }
            }
        }

        public <T> void clearReferenceQueue(ReferenceQueue<T> referenceQueue) {
            while (referenceQueue.poll() != null) {
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
        
            if (((com.google.common.collect.MapMakerInternalMap.WeakValueEntry) r3).getValueReference() != r10) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        
            r0.set(r1, removeFromChain(r2, r3));
            r4 = true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        boolean clearValueForTesting(K r8, int r9, com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, ? extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?>> r10) {
            /*
                r7 = this;
                r7.lock()
                java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>> r0 = r7.table     // Catch: java.lang.Throwable -> L47
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L47
                int r1 = r1 + (-1)
                r1 = r1 & r9
                java.lang.Object r2 = r0.get(r1)     // Catch: java.lang.Throwable -> L47
                com.google.common.collect.MapMakerInternalMap$InternalEntry r2 = (com.google.common.collect.MapMakerInternalMap.InternalEntry) r2     // Catch: java.lang.Throwable -> L47
                r3 = r2
            L13:
                r4 = 0
                if (r3 == 0) goto L43
                java.lang.Object r5 = r3.getKey()     // Catch: java.lang.Throwable -> L47
                int r6 = r3.getHash()     // Catch: java.lang.Throwable -> L47
                if (r6 != r9) goto L3e
                if (r5 == 0) goto L3e
                com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r6 = r7.map     // Catch: java.lang.Throwable -> L47
                tsk<java.lang.Object> r6 = r6.keyEquivalence     // Catch: java.lang.Throwable -> L47
                boolean r5 = r6.d(r8, r5)     // Catch: java.lang.Throwable -> L47
                if (r5 == 0) goto L3e
                r8 = r3
                com.google.common.collect.MapMakerInternalMap$WeakValueEntry r8 = (com.google.common.collect.MapMakerInternalMap.WeakValueEntry) r8     // Catch: java.lang.Throwable -> L47
                com.google.common.collect.MapMakerInternalMap$WeakValueReference r8 = r8.getValueReference()     // Catch: java.lang.Throwable -> L47
                if (r8 != r10) goto L43
                com.google.common.collect.MapMakerInternalMap$InternalEntry r8 = r7.removeFromChain(r2, r3)     // Catch: java.lang.Throwable -> L47
                r0.set(r1, r8)     // Catch: java.lang.Throwable -> L47
                r4 = 1
                goto L43
            L3e:
                com.google.common.collect.MapMakerInternalMap$InternalEntry r3 = r3.getNext()     // Catch: java.lang.Throwable -> L47
                goto L13
            L43:
                r7.unlock()
                return r4
            L47:
                r8 = move-exception
                r7.unlock()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.Segment.clearValueForTesting(java.lang.Object, int, com.google.common.collect.MapMakerInternalMap$WeakValueReference):boolean");
        }

        public boolean containsKey(Object obj, int i) {
            InternalEntry liveEntry;
            try {
                boolean z = false;
                if (this.count != 0 && (liveEntry = getLiveEntry(obj, i)) != null) {
                    if (liveEntry.getValue() != null) {
                        z = true;
                    }
                }
                return z;
            } finally {
                postReadCleanup();
            }
        }

        boolean containsValue(Object obj) {
            try {
                if (this.count != 0) {
                    AtomicReferenceArray<E> atomicReferenceArray = this.table;
                    int length = atomicReferenceArray.length();
                    for (int i = 0; i < length; i++) {
                        for (E next = atomicReferenceArray.get(i); next != null; next = next.getNext()) {
                            V liveValue = getLiveValue(next);
                            if (liveValue != null && this.map.valueEquivalence().d(obj, liveValue)) {
                                postReadCleanup();
                                return true;
                            }
                        }
                    }
                }
                return false;
            } finally {
                postReadCleanup();
            }
        }

        public E copyEntry(E e, E e2) {
            return (E) this.map.entryHelper.copy(self(), e, e2);
        }

        E copyForTesting(InternalEntry<K, V, ?> internalEntry, InternalEntry<K, V, ?> internalEntry2) {
            return (E) this.map.entryHelper.copy(self(), castForTesting(internalEntry), castForTesting(internalEntry2));
        }

        public void drainKeyReferenceQueue(ReferenceQueue<K> referenceQueue) {
            int i = 0;
            do {
                Reference<? extends K> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                this.map.reclaimKey((InternalEntry) referencePoll);
                i++;
            } while (i != 16);
        }

        public void drainValueReferenceQueue(ReferenceQueue<V> referenceQueue) {
            int i = 0;
            do {
                Reference<? extends V> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                this.map.reclaimValue((WeakValueReference) referencePoll);
                i++;
            } while (i != 16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void expand() {
            AtomicReferenceArray<E> atomicReferenceArray = this.table;
            int length = atomicReferenceArray.length();
            if (length >= MapMakerInternalMap.MAXIMUM_CAPACITY) {
                return;
            }
            int i = this.count;
            AtomicReferenceArray<E> atomicReferenceArrayNewEntryArray = newEntryArray(length + length);
            this.threshold = (atomicReferenceArrayNewEntryArray.length() * 3) / 4;
            int length2 = atomicReferenceArrayNewEntryArray.length() - 1;
            for (int i2 = 0; i2 < length; i2++) {
                E next = atomicReferenceArray.get(i2);
                if (next != null) {
                    InternalEntry next2 = next.getNext();
                    int hash = next.getHash() & length2;
                    if (next2 == null) {
                        atomicReferenceArrayNewEntryArray.set(hash, next);
                    } else {
                        InternalEntry internalEntry = next;
                        while (next2 != null) {
                            int hash2 = next2.getHash() & length2;
                            int i3 = hash2 != hash ? hash2 : hash;
                            if (hash2 != hash) {
                                internalEntry = next2;
                            }
                            next2 = next2.getNext();
                            hash = i3;
                        }
                        atomicReferenceArrayNewEntryArray.set(hash, internalEntry);
                        while (next != internalEntry) {
                            int hash3 = next.getHash() & length2;
                            InternalEntry internalEntryCopyEntry = copyEntry(next, (InternalEntry) atomicReferenceArrayNewEntryArray.get(hash3));
                            if (internalEntryCopyEntry != null) {
                                atomicReferenceArrayNewEntryArray.set(hash3, internalEntryCopyEntry);
                            } else {
                                i--;
                            }
                            next = next.getNext();
                        }
                    }
                }
            }
            this.table = atomicReferenceArrayNewEntryArray;
            this.count = i;
        }

        public V get(Object obj, int i) {
            V v;
            try {
                InternalEntry liveEntry = getLiveEntry(obj, i);
                if (liveEntry == null) {
                    v = null;
                } else {
                    v = (V) liveEntry.getValue();
                    if (v == null) {
                        tryDrainReferenceQueues();
                    }
                }
                return v;
            } finally {
                postReadCleanup();
            }
        }

        public E getEntry(Object obj, int i) {
            if (this.count == 0) {
                return null;
            }
            for (E e = (E) getFirst(i); e != null; e = (E) e.getNext()) {
                if (e.getHash() == i) {
                    Object key = e.getKey();
                    if (key == null) {
                        tryDrainReferenceQueues();
                    } else if (this.map.keyEquivalence.d(obj, key)) {
                        return e;
                    }
                }
            }
            return null;
        }

        public E getFirst(int i) {
            return this.table.get(i & (r0.length() - 1));
        }

        ReferenceQueue<K> getKeyReferenceQueueForTesting() {
            throw new AssertionError();
        }

        public E getLiveEntry(Object obj, int i) {
            return (E) getEntry(obj, i);
        }

        public V getLiveValue(E e) {
            if (e.getKey() == null) {
                tryDrainReferenceQueues();
                return null;
            }
            V v = (V) e.getValue();
            if (v != null) {
                return v;
            }
            tryDrainReferenceQueues();
            return null;
        }

        public V getLiveValueForTesting(InternalEntry<K, V, ?> internalEntry) {
            return getLiveValue(castForTesting(internalEntry));
        }

        ReferenceQueue<V> getValueReferenceQueueForTesting() {
            throw new AssertionError();
        }

        WeakValueReference<K, V, E> getWeakValueReferenceForTesting(InternalEntry<K, V, ?> internalEntry) {
            throw new AssertionError();
        }

        public void initTable(AtomicReferenceArray<E> atomicReferenceArray) {
            this.threshold = (atomicReferenceArray.length() * 3) / 4;
            this.table = atomicReferenceArray;
        }

        public AtomicReferenceArray<E> newEntryArray(int i) {
            return new AtomicReferenceArray<>(i);
        }

        E newEntryForTesting(K k, int i, InternalEntry<K, V, ?> internalEntry) {
            return (E) this.map.entryHelper.newEntry(self(), k, i, castForTesting(internalEntry));
        }

        WeakValueReference<K, V, E> newWeakValueReferenceForTesting(InternalEntry<K, V, ?> internalEntry, V v) {
            throw new AssertionError();
        }

        public void postReadCleanup() {
            if ((this.readCount.incrementAndGet() & 63) == 0) {
                runCleanup();
            }
        }

        public void preWriteCleanup() {
            runLockedCleanup();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public V put(K k, int i, V v, boolean z) {
            V v2;
            lock();
            try {
                preWriteCleanup();
                int i2 = this.count + 1;
                if (i2 > this.threshold) {
                    expand();
                    i2 = this.count + 1;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(length);
                InternalEntry next = internalEntry;
                while (true) {
                    v2 = null;
                    if (next == null) {
                        this.modCount++;
                        InternalEntry internalEntryNewEntry = this.map.entryHelper.newEntry(self(), k, i, internalEntry);
                        setValue(internalEntryNewEntry, v);
                        atomicReferenceArray.set(length, internalEntryNewEntry);
                        this.count = i2;
                        break;
                    }
                    Object key = next.getKey();
                    if (next.getHash() == i && key != null && this.map.keyEquivalence.d(k, key)) {
                        Object value = next.getValue();
                        if (value == 0) {
                            this.modCount++;
                            setValue(next, v);
                            this.count = this.count;
                        } else {
                            if (!z) {
                                this.modCount++;
                                setValue(next, v);
                            }
                            v2 = value;
                        }
                    } else {
                        next = next.getNext();
                    }
                }
                return v2;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
        
            r3 = true;
            r4.modCount++;
            r5 = removeFromChain(r1, r2);
            r1 = r4.count - 1;
            r0.set(r6, r5);
            r4.count = r1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean reclaimKey(E r5, int r6) {
            /*
                r4 = this;
                r4.lock()
                java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>> r0 = r4.table     // Catch: java.lang.Throwable -> L35
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L35
                int r1 = r1 + (-1)
                r6 = r6 & r1
                java.lang.Object r1 = r0.get(r6)     // Catch: java.lang.Throwable -> L35
                com.google.common.collect.MapMakerInternalMap$InternalEntry r1 = (com.google.common.collect.MapMakerInternalMap.InternalEntry) r1     // Catch: java.lang.Throwable -> L35
                r2 = r1
            L13:
                if (r2 == 0) goto L30
                if (r2 != r5) goto L2b
                int r5 = r4.modCount     // Catch: java.lang.Throwable -> L35
                r3 = 1
                int r5 = r5 + r3
                r4.modCount = r5     // Catch: java.lang.Throwable -> L35
                com.google.common.collect.MapMakerInternalMap$InternalEntry r5 = r4.removeFromChain(r1, r2)     // Catch: java.lang.Throwable -> L35
                int r1 = r4.count     // Catch: java.lang.Throwable -> L35
                int r1 = r1 + (-1)
                r0.set(r6, r5)     // Catch: java.lang.Throwable -> L35
                r4.count = r1     // Catch: java.lang.Throwable -> L35
                goto L31
            L2b:
                com.google.common.collect.MapMakerInternalMap$InternalEntry r2 = r2.getNext()     // Catch: java.lang.Throwable -> L35
                goto L13
            L30:
                r3 = 0
            L31:
                r4.unlock()
                return r3
            L35:
                r5 = move-exception
                r4.unlock()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.Segment.reclaimKey(com.google.common.collect.MapMakerInternalMap$InternalEntry, int):boolean");
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
        
            if (((com.google.common.collect.MapMakerInternalMap.WeakValueEntry) r3).getValueReference() != r10) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        
            r4 = true;
            r7.modCount++;
            r8 = removeFromChain(r2, r3);
            r9 = r7.count - 1;
            r0.set(r1, r8);
            r7.count = r9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean reclaimValue(K r8, int r9, com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, E> r10) {
            /*
                r7 = this;
                r7.lock()
                java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>> r0 = r7.table     // Catch: java.lang.Throwable -> L52
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L52
                int r1 = r1 + (-1)
                r1 = r1 & r9
                java.lang.Object r2 = r0.get(r1)     // Catch: java.lang.Throwable -> L52
                com.google.common.collect.MapMakerInternalMap$InternalEntry r2 = (com.google.common.collect.MapMakerInternalMap.InternalEntry) r2     // Catch: java.lang.Throwable -> L52
                r3 = r2
            L13:
                r4 = 0
                if (r3 == 0) goto L4e
                java.lang.Object r5 = r3.getKey()     // Catch: java.lang.Throwable -> L52
                int r6 = r3.getHash()     // Catch: java.lang.Throwable -> L52
                if (r6 != r9) goto L49
                if (r5 == 0) goto L49
                com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r6 = r7.map     // Catch: java.lang.Throwable -> L52
                tsk<java.lang.Object> r6 = r6.keyEquivalence     // Catch: java.lang.Throwable -> L52
                boolean r5 = r6.d(r8, r5)     // Catch: java.lang.Throwable -> L52
                if (r5 == 0) goto L49
                r8 = r3
                com.google.common.collect.MapMakerInternalMap$WeakValueEntry r8 = (com.google.common.collect.MapMakerInternalMap.WeakValueEntry) r8     // Catch: java.lang.Throwable -> L52
                com.google.common.collect.MapMakerInternalMap$WeakValueReference r8 = r8.getValueReference()     // Catch: java.lang.Throwable -> L52
                if (r8 != r10) goto L4e
                int r8 = r7.modCount     // Catch: java.lang.Throwable -> L52
                r4 = 1
                int r8 = r8 + r4
                r7.modCount = r8     // Catch: java.lang.Throwable -> L52
                com.google.common.collect.MapMakerInternalMap$InternalEntry r8 = r7.removeFromChain(r2, r3)     // Catch: java.lang.Throwable -> L52
                int r9 = r7.count     // Catch: java.lang.Throwable -> L52
                int r9 = r9 + (-1)
                r0.set(r1, r8)     // Catch: java.lang.Throwable -> L52
                r7.count = r9     // Catch: java.lang.Throwable -> L52
                goto L4e
            L49:
                com.google.common.collect.MapMakerInternalMap$InternalEntry r3 = r3.getNext()     // Catch: java.lang.Throwable -> L52
                goto L13
            L4e:
                r7.unlock()
                return r4
            L52:
                r8 = move-exception
                r7.unlock()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.Segment.reclaimValue(java.lang.Object, int, com.google.common.collect.MapMakerInternalMap$WeakValueReference):boolean");
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
        
            r8 = r3.getValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
        
            if (r8 == 0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
        
            if (isCollected(r3) != false) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
        
            r7.modCount++;
            r9 = removeFromChain(r2, r3);
            r2 = r7.count - 1;
            r0.set(r1, r9);
            r7.count = r2;
            r4 = r8;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public V remove(java.lang.Object r8, int r9) {
            /*
                r7 = this;
                r7.lock()
                r7.preWriteCleanup()     // Catch: java.lang.Throwable -> L5b
                java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>> r0 = r7.table     // Catch: java.lang.Throwable -> L5b
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L5b
                int r1 = r1 + (-1)
                r1 = r1 & r9
                java.lang.Object r2 = r0.get(r1)     // Catch: java.lang.Throwable -> L5b
                com.google.common.collect.MapMakerInternalMap$InternalEntry r2 = (com.google.common.collect.MapMakerInternalMap.InternalEntry) r2     // Catch: java.lang.Throwable -> L5b
                r3 = r2
            L16:
                r4 = 0
                if (r3 == 0) goto L57
                java.lang.Object r5 = r3.getKey()     // Catch: java.lang.Throwable -> L5b
                int r6 = r3.getHash()     // Catch: java.lang.Throwable -> L5b
                if (r6 != r9) goto L52
                if (r5 == 0) goto L52
                com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r6 = r7.map     // Catch: java.lang.Throwable -> L5b
                tsk<java.lang.Object> r6 = r6.keyEquivalence     // Catch: java.lang.Throwable -> L5b
                boolean r5 = r6.d(r8, r5)     // Catch: java.lang.Throwable -> L5b
                if (r5 == 0) goto L52
                java.lang.Object r8 = r3.getValue()     // Catch: java.lang.Throwable -> L5b
                if (r8 == 0) goto L36
                goto L3d
            L36:
                boolean r9 = isCollected(r3)     // Catch: java.lang.Throwable -> L5b
                if (r9 != 0) goto L3d
                goto L57
            L3d:
                int r9 = r7.modCount     // Catch: java.lang.Throwable -> L5b
                int r9 = r9 + 1
                r7.modCount = r9     // Catch: java.lang.Throwable -> L5b
                com.google.common.collect.MapMakerInternalMap$InternalEntry r9 = r7.removeFromChain(r2, r3)     // Catch: java.lang.Throwable -> L5b
                int r2 = r7.count     // Catch: java.lang.Throwable -> L5b
                int r2 = r2 + (-1)
                r0.set(r1, r9)     // Catch: java.lang.Throwable -> L5b
                r7.count = r2     // Catch: java.lang.Throwable -> L5b
                r4 = r8
                goto L57
            L52:
                com.google.common.collect.MapMakerInternalMap$InternalEntry r3 = r3.getNext()     // Catch: java.lang.Throwable -> L5b
                goto L16
            L57:
                r7.unlock()
                return r4
            L5b:
                r8 = move-exception
                r7.unlock()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.Segment.remove(java.lang.Object, int):java.lang.Object");
        }

        public boolean removeEntryForTesting(E e) {
            int hash = e.getHash();
            AtomicReferenceArray<E> atomicReferenceArray = this.table;
            int length = hash & (atomicReferenceArray.length() - 1);
            InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(length);
            for (InternalEntry next = internalEntry; next != null; next = next.getNext()) {
                if (next == e) {
                    this.modCount++;
                    InternalEntry internalEntryRemoveFromChain = removeFromChain(internalEntry, next);
                    int i = this.count - 1;
                    atomicReferenceArray.set(length, internalEntryRemoveFromChain);
                    this.count = i;
                    return true;
                }
            }
            return false;
        }

        public E removeFromChain(E e, E e2) {
            int i = this.count;
            E e3 = (E) e2.getNext();
            while (e != e2) {
                InternalEntry internalEntryCopyEntry = copyEntry(e, e3);
                if (internalEntryCopyEntry != null) {
                    e3 = (E) internalEntryCopyEntry;
                } else {
                    i--;
                }
                e = (E) e.getNext();
            }
            this.count = i;
            return e3;
        }

        E removeFromChainForTesting(InternalEntry<K, V, ?> internalEntry, InternalEntry<K, V, ?> internalEntry2) {
            return (E) removeFromChain(castForTesting(internalEntry), castForTesting(internalEntry2));
        }

        boolean removeTableEntryForTesting(InternalEntry<K, V, ?> internalEntry) {
            return removeEntryForTesting(castForTesting(internalEntry));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public V replace(K k, int i, V v) {
            V v2;
            lock();
            try {
                preWriteCleanup();
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(length);
                InternalEntry next = internalEntry;
                while (true) {
                    v2 = null;
                    if (next == null) {
                        break;
                    }
                    Object key = next.getKey();
                    if (next.getHash() == i && key != null && this.map.keyEquivalence.d(k, key)) {
                        Object value = next.getValue();
                        if (value != 0) {
                            this.modCount++;
                            setValue(next, v);
                            v2 = value;
                        } else if (isCollected(next)) {
                            this.modCount++;
                            InternalEntry internalEntryRemoveFromChain = removeFromChain(internalEntry, next);
                            int i2 = this.count - 1;
                            atomicReferenceArray.set(length, internalEntryRemoveFromChain);
                            this.count = i2;
                        }
                    } else {
                        next = next.getNext();
                    }
                }
                return v2;
            } finally {
                unlock();
            }
        }

        public void runCleanup() {
            runLockedCleanup();
        }

        public void runLockedCleanup() {
            if (tryLock()) {
                try {
                    maybeDrainReferenceQueues();
                    this.readCount.set(0);
                } finally {
                    unlock();
                }
            }
        }

        public abstract S self();

        void setTableEntryForTesting(int i, InternalEntry<K, V, ?> internalEntry) {
            this.table.set(i, castForTesting(internalEntry));
        }

        public void setValue(E e, V v) {
            this.map.entryHelper.setValue(self(), e, v);
        }

        void setValueForTesting(InternalEntry<K, V, ?> internalEntry, V v) {
            this.map.entryHelper.setValue(self(), castForTesting(internalEntry), v);
        }

        void setWeakValueReferenceForTesting(InternalEntry<K, V, ?> internalEntry, WeakValueReference<K, V, ? extends InternalEntry<K, V, ?>> weakValueReference) {
            throw new AssertionError();
        }

        public void tryDrainReferenceQueues() {
            if (tryLock()) {
                try {
                    maybeDrainReferenceQueues();
                } finally {
                    unlock();
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
        
            if (r7.map.valueEquivalence().d(r10, r3.getValue()) == false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
        
            r4 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
        
            if (isCollected(r3) == false) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        
            r7.modCount++;
            r8 = removeFromChain(r2, r3);
            r9 = r7.count - 1;
            r0.set(r1, r8);
            r7.count = r9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean remove(java.lang.Object r8, int r9, java.lang.Object r10) {
            /*
                r7 = this;
                r7.lock()
                r7.preWriteCleanup()     // Catch: java.lang.Throwable -> L64
                java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>> r0 = r7.table     // Catch: java.lang.Throwable -> L64
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L64
                int r1 = r1 + (-1)
                r1 = r1 & r9
                java.lang.Object r2 = r0.get(r1)     // Catch: java.lang.Throwable -> L64
                com.google.common.collect.MapMakerInternalMap$InternalEntry r2 = (com.google.common.collect.MapMakerInternalMap.InternalEntry) r2     // Catch: java.lang.Throwable -> L64
                r3 = r2
            L16:
                r4 = 0
                if (r3 == 0) goto L60
                java.lang.Object r5 = r3.getKey()     // Catch: java.lang.Throwable -> L64
                int r6 = r3.getHash()     // Catch: java.lang.Throwable -> L64
                if (r6 != r9) goto L5b
                if (r5 == 0) goto L5b
                com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r6 = r7.map     // Catch: java.lang.Throwable -> L64
                tsk<java.lang.Object> r6 = r6.keyEquivalence     // Catch: java.lang.Throwable -> L64
                boolean r5 = r6.d(r8, r5)     // Catch: java.lang.Throwable -> L64
                if (r5 == 0) goto L5b
                java.lang.Object r8 = r3.getValue()     // Catch: java.lang.Throwable -> L64
                com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r9 = r7.map     // Catch: java.lang.Throwable -> L64
                tsk r9 = r9.valueEquivalence()     // Catch: java.lang.Throwable -> L64
                boolean r8 = r9.d(r10, r8)     // Catch: java.lang.Throwable -> L64
                r9 = 1
                if (r8 == 0) goto L42
                r4 = r9
                goto L48
            L42:
                boolean r8 = isCollected(r3)     // Catch: java.lang.Throwable -> L64
                if (r8 == 0) goto L60
            L48:
                int r8 = r7.modCount     // Catch: java.lang.Throwable -> L64
                int r8 = r8 + r9
                r7.modCount = r8     // Catch: java.lang.Throwable -> L64
                com.google.common.collect.MapMakerInternalMap$InternalEntry r8 = r7.removeFromChain(r2, r3)     // Catch: java.lang.Throwable -> L64
                int r9 = r7.count     // Catch: java.lang.Throwable -> L64
                int r9 = r9 + (-1)
                r0.set(r1, r8)     // Catch: java.lang.Throwable -> L64
                r7.count = r9     // Catch: java.lang.Throwable -> L64
                goto L60
            L5b:
                com.google.common.collect.MapMakerInternalMap$InternalEntry r3 = r3.getNext()     // Catch: java.lang.Throwable -> L64
                goto L16
            L60:
                r7.unlock()
                return r4
            L64:
                r8 = move-exception
                r7.unlock()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.Segment.remove(java.lang.Object, int, java.lang.Object):boolean");
        }

        public boolean replace(K k, int i, V v, V v2) {
            boolean z;
            lock();
            try {
                preWriteCleanup();
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(length);
                InternalEntry next = internalEntry;
                while (true) {
                    z = false;
                    if (next == null) {
                        break;
                    }
                    Object key = next.getKey();
                    if (next.getHash() == i && key != null && this.map.keyEquivalence.d(k, key)) {
                        Object value = next.getValue();
                        if (value == null) {
                            if (isCollected(next)) {
                                this.modCount++;
                                InternalEntry internalEntryRemoveFromChain = removeFromChain(internalEntry, next);
                                int i2 = this.count - 1;
                                atomicReferenceArray.set(length, internalEntryRemoveFromChain);
                                this.count = i2;
                            }
                        } else if (this.map.valueEquivalence().d(v, value)) {
                            this.modCount++;
                            setValue(next, v2);
                            z = true;
                        }
                    } else {
                        next = next.getNext();
                    }
                }
                return z;
            } finally {
                unlock();
            }
        }

        public void maybeClearReferenceQueues() {
        }

        public void maybeDrainReferenceQueues() {
        }
    }
}
