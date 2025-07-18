package com.google.common.collect;

import defpackage.a;
import defpackage.sfy;
import defpackage.sij;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
class CompactHashMap<K, V> extends AbstractMap<K, V> implements Serializable {
    static final double HASH_FLOODING_FPP = 0.001d;
    private static final int MAX_HASH_BUCKET_LENGTH = 9;
    private static final Object NOT_FOUND = new Object();
    transient int[] entries;
    private transient Set<Map.Entry<K, V>> entrySetView;
    private transient Set<K> keySetView;
    transient Object[] keys;
    private transient int metadata;
    private transient int size;
    private transient Object table;
    transient Object[] values;
    private transient Collection<V> valuesView;

    /* compiled from: PG */
    class EntrySetView extends AbstractSet<Map.Entry<K, V>> {
        final /* synthetic */ CompactHashMap this$0;

        public EntrySetView(CompactHashMap compactHashMap) {
            compactHashMap.getClass();
            this.this$0 = compactHashMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.this$0.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map<K, V> mapDelegateOrNull = this.this$0.delegateOrNull();
            if (mapDelegateOrNull != null) {
                return mapDelegateOrNull.entrySet().contains(obj);
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int iIndexOf = this.this$0.indexOf(entry.getKey());
                if (iIndexOf != -1 && a.Q(this.this$0.value(iIndexOf), entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return this.this$0.entrySetIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map<K, V> mapDelegateOrNull = this.this$0.delegateOrNull();
            if (mapDelegateOrNull != null) {
                return mapDelegateOrNull.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (this.this$0.needsAllocArrays()) {
                return false;
            }
            int iHashTableMask = this.this$0.hashTableMask();
            Object key = entry.getKey();
            Object value = entry.getValue();
            CompactHashMap compactHashMap = this.this$0;
            int iRemove = CompactHashing.remove(key, value, iHashTableMask, compactHashMap.requireTable(), compactHashMap.requireEntries(), compactHashMap.requireKeys(), compactHashMap.requireValues());
            if (iRemove == -1) {
                return false;
            }
            this.this$0.moveLastEntry(iRemove, iHashTableMask);
            CompactHashMap compactHashMap2 = this.this$0;
            compactHashMap2.size--;
            this.this$0.incrementModCount();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.this$0.size();
        }
    }

    /* compiled from: PG */
    abstract class Itr<T> implements Iterator<T> {
        int currentIndex;
        int expectedMetadata;
        int indexToRemove;
        final /* synthetic */ CompactHashMap this$0;

        private void checkForConcurrentModification() {
            if (this.this$0.metadata != this.expectedMetadata) {
                throw new ConcurrentModificationException();
            }
        }

        public abstract T getOutput(int i);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.currentIndex >= 0;
        }

        public void incrementExpectedModCount() {
            this.expectedMetadata += 32;
        }

        @Override // java.util.Iterator
        public T next() {
            checkForConcurrentModification();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i = this.currentIndex;
            this.indexToRemove = i;
            T output = getOutput(i);
            this.currentIndex = this.this$0.getSuccessor(this.currentIndex);
            return output;
        }

        @Override // java.util.Iterator
        public void remove() {
            checkForConcurrentModification();
            CollectPreconditions.checkRemove(this.indexToRemove >= 0);
            incrementExpectedModCount();
            this.this$0.remove(this.this$0.key(this.indexToRemove));
            this.currentIndex = this.this$0.adjustAfterRemove(this.currentIndex, this.indexToRemove);
            this.indexToRemove = -1;
        }

        private Itr(CompactHashMap compactHashMap) {
            compactHashMap.getClass();
            this.this$0 = compactHashMap;
            this.expectedMetadata = compactHashMap.metadata;
            this.currentIndex = compactHashMap.firstEntryIndex();
            this.indexToRemove = -1;
        }
    }

    /* compiled from: PG */
    class KeySetView extends AbstractSet<K> {
        final /* synthetic */ CompactHashMap this$0;

        public KeySetView(CompactHashMap compactHashMap) {
            compactHashMap.getClass();
            this.this$0 = compactHashMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.this$0.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.this$0.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return this.this$0.keySetIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map<K, V> mapDelegateOrNull = this.this$0.delegateOrNull();
            return mapDelegateOrNull != null ? mapDelegateOrNull.keySet().remove(obj) : this.this$0.removeHelper(obj) != CompactHashMap.NOT_FOUND;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.this$0.size();
        }
    }

    /* compiled from: PG */
    final class MapEntry extends AbstractMapEntry<K, V> {
        private final K key;
        private int lastKnownIndex;
        final /* synthetic */ CompactHashMap this$0;

        public MapEntry(CompactHashMap compactHashMap, int i) {
            compactHashMap.getClass();
            this.this$0 = compactHashMap;
            this.key = (K) compactHashMap.key(i);
            this.lastKnownIndex = i;
        }

        private void updateLastKnownIndex() {
            int i = this.lastKnownIndex;
            if (i == -1 || i >= this.this$0.size() || !a.Q(this.key, this.this$0.key(this.lastKnownIndex))) {
                this.lastKnownIndex = this.this$0.indexOf(this.key);
            }
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public K getKey() {
            return this.key;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public V getValue() {
            Map<K, V> mapDelegateOrNull = this.this$0.delegateOrNull();
            if (mapDelegateOrNull != null) {
                return mapDelegateOrNull.get(this.key);
            }
            updateLastKnownIndex();
            int i = this.lastKnownIndex;
            if (i == -1) {
                return null;
            }
            return (V) this.this$0.value(i);
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public V setValue(V v) {
            Map<K, V> mapDelegateOrNull = this.this$0.delegateOrNull();
            if (mapDelegateOrNull != null) {
                return mapDelegateOrNull.put(this.key, v);
            }
            updateLastKnownIndex();
            int i = this.lastKnownIndex;
            if (i == -1) {
                this.this$0.put(this.key, v);
                return null;
            }
            CompactHashMap compactHashMap = this.this$0;
            V v2 = (V) compactHashMap.value(i);
            compactHashMap.setValue(this.lastKnownIndex, v);
            return v2;
        }
    }

    /* compiled from: PG */
    class ValuesView extends AbstractCollection<V> {
        final /* synthetic */ CompactHashMap this$0;

        public ValuesView(CompactHashMap compactHashMap) {
            compactHashMap.getClass();
            this.this$0 = compactHashMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.this$0.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return this.this$0.valuesIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.this$0.size();
        }
    }

    public CompactHashMap() {
        init(3);
    }

    public static <K, V> CompactHashMap<K, V> create() {
        return new CompactHashMap<>();
    }

    public static <K, V> CompactHashMap<K, V> createWithExpectedSize(int i) {
        return new CompactHashMap<>(i);
    }

    private int entry(int i) {
        return requireEntries()[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int hashTableMask() {
        return (1 << (this.metadata & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int indexOf(Object obj) {
        if (needsAllocArrays()) {
            return -1;
        }
        int iSmearedHash = Hashing.smearedHash(obj);
        int iHashTableMask = hashTableMask();
        int iTableGet = CompactHashing.tableGet(requireTable(), iSmearedHash & iHashTableMask);
        if (iTableGet == 0) {
            return -1;
        }
        int hashPrefix = CompactHashing.getHashPrefix(iSmearedHash, iHashTableMask);
        do {
            int i = iTableGet - 1;
            int iEntry = entry(i);
            if (CompactHashing.getHashPrefix(iEntry, iHashTableMask) == hashPrefix && a.Q(obj, key(i))) {
                return i;
            }
            iTableGet = CompactHashing.getNext(iEntry, iHashTableMask);
        } while (iTableGet != 0);
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public K key(int i) {
        return (K) requireKeys()[i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(a.cf(i, "Invalid size: "));
        }
        init(i);
        for (int i2 = 0; i2 < i; i2++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object removeHelper(Object obj) {
        int iHashTableMask;
        int iRemove;
        if (needsAllocArrays() || (iRemove = CompactHashing.remove(obj, null, (iHashTableMask = hashTableMask()), requireTable(), requireEntries(), requireKeys(), null)) == -1) {
            return NOT_FOUND;
        }
        V vValue = value(iRemove);
        moveLastEntry(iRemove, iHashTableMask);
        this.size--;
        incrementModCount();
        return vValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] requireEntries() {
        int[] iArr = this.entries;
        iArr.getClass();
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] requireKeys() {
        Object[] objArr = this.keys;
        objArr.getClass();
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object requireTable() {
        Object obj = this.table;
        obj.getClass();
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] requireValues() {
        Object[] objArr = this.values;
        objArr.getClass();
        return objArr;
    }

    private void resizeMeMaybe(int i) {
        int iMin;
        int length = requireEntries().length;
        if (i <= length || (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        resizeEntries(iMin);
    }

    private int resizeTable(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object objCreateTable = CompactHashing.createTable(i2);
        if (i4 != 0) {
            CompactHashing.tableSet(objCreateTable, i3 & i5, i4 + 1);
        }
        Object objRequireTable = requireTable();
        int[] iArrRequireEntries = requireEntries();
        for (int i6 = 0; i6 <= i; i6++) {
            int iTableGet = CompactHashing.tableGet(objRequireTable, i6);
            while (iTableGet != 0) {
                int i7 = iTableGet - 1;
                int i8 = iArrRequireEntries[i7];
                int hashPrefix = CompactHashing.getHashPrefix(i8, i) | i6;
                int i9 = hashPrefix & i5;
                int iTableGet2 = CompactHashing.tableGet(objCreateTable, i9);
                CompactHashing.tableSet(objCreateTable, i9, iTableGet);
                iArrRequireEntries[i7] = CompactHashing.maskCombine(hashPrefix, iTableGet2, i5);
                iTableGet = CompactHashing.getNext(i8, i);
            }
        }
        this.table = objCreateTable;
        setHashTableMask(i5);
        return i5;
    }

    private void setEntry(int i, int i2) {
        requireEntries()[i] = i2;
    }

    private void setHashTableMask(int i) {
        this.metadata = CompactHashing.maskCombine(this.metadata, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    private void setKey(int i, K k) {
        requireKeys()[i] = k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(int i, V v) {
        requireValues()[i] = v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V value(int i) {
        return (V) requireValues()[i];
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<Map.Entry<K, V>> itEntrySetIterator = entrySetIterator();
        while (itEntrySetIterator.hasNext()) {
            Map.Entry<K, V> next = itEntrySetIterator.next();
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeObject(next.getValue());
        }
    }

    public int adjustAfterRemove(int i, int i2) {
        return i - 1;
    }

    public int allocArrays() {
        sij.x(needsAllocArrays(), "Arrays already allocated");
        int i = this.metadata;
        int iTableSize = CompactHashing.tableSize(i);
        this.table = CompactHashing.createTable(iTableSize);
        setHashTableMask(iTableSize - 1);
        this.entries = new int[i];
        this.keys = new Object[i];
        this.values = new Object[i];
        return i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (needsAllocArrays()) {
            return;
        }
        incrementModCount();
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            this.metadata = sfy.X(size(), 3, 1073741823);
            mapDelegateOrNull.clear();
            this.table = null;
            this.size = 0;
            return;
        }
        Arrays.fill(requireKeys(), 0, this.size, (Object) null);
        Arrays.fill(requireValues(), 0, this.size, (Object) null);
        CompactHashing.tableClear(requireTable());
        Arrays.fill(requireEntries(), 0, this.size, 0);
        this.size = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        return mapDelegateOrNull != null ? mapDelegateOrNull.containsKey(obj) : indexOf(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.containsValue(obj);
        }
        for (int i = 0; i < this.size; i++) {
            if (a.Q(obj, value(i))) {
                return true;
            }
        }
        return false;
    }

    public Map<K, V> convertToHashFloodingResistantImplementation() {
        Map<K, V> mapCreateHashFloodingResistantDelegate = createHashFloodingResistantDelegate(hashTableMask() + 1);
        int iFirstEntryIndex = firstEntryIndex();
        while (iFirstEntryIndex >= 0) {
            mapCreateHashFloodingResistantDelegate.put(key(iFirstEntryIndex), value(iFirstEntryIndex));
            iFirstEntryIndex = getSuccessor(iFirstEntryIndex);
        }
        this.table = mapCreateHashFloodingResistantDelegate;
        this.entries = null;
        this.keys = null;
        this.values = null;
        incrementModCount();
        return mapCreateHashFloodingResistantDelegate;
    }

    public Set<Map.Entry<K, V>> createEntrySet() {
        return new EntrySetView(this);
    }

    public Map<K, V> createHashFloodingResistantDelegate(int i) {
        return new LinkedHashMap(i, 1.0f);
    }

    public Set<K> createKeySet() {
        return new KeySetView(this);
    }

    public Collection<V> createValues() {
        return new ValuesView(this);
    }

    public Map<K, V> delegateOrNull() {
        Object obj = this.table;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.entrySetView;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> setCreateEntrySet = createEntrySet();
        this.entrySetView = setCreateEntrySet;
        return setCreateEntrySet;
    }

    public Iterator<Map.Entry<K, V>> entrySetIterator() {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        return mapDelegateOrNull != null ? mapDelegateOrNull.entrySet().iterator() : new CompactHashMap<K, V>.Itr<Map.Entry<K, V>>(this) { // from class: com.google.common.collect.CompactHashMap.2
            final /* synthetic */ CompactHashMap this$0;

            {
                this.getClass();
                this.this$0 = this;
            }

            @Override // com.google.common.collect.CompactHashMap.Itr
            public Map.Entry<K, V> getOutput(int i) {
                return new MapEntry(this.this$0, i);
            }
        };
    }

    public int firstEntryIndex() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.get(obj);
        }
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return null;
        }
        accessEntry(iIndexOf);
        return value(iIndexOf);
    }

    public int getSuccessor(int i) {
        int i2 = i + 1;
        if (i2 < this.size) {
            return i2;
        }
        return -1;
    }

    public void incrementModCount() {
        this.metadata += 32;
    }

    public void init(int i) {
        sij.o(i >= 0, "Expected size must be >= 0");
        this.metadata = sfy.X(i, 1, 1073741823);
    }

    public void insertEntry(int i, K k, V v, int i2, int i3) {
        setEntry(i, CompactHashing.maskCombine(i2, 0, i3));
        setKey(i, k);
        setValue(i, v);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.keySetView;
        if (set != null) {
            return set;
        }
        Set<K> setCreateKeySet = createKeySet();
        this.keySetView = setCreateKeySet;
        return setCreateKeySet;
    }

    public Iterator<K> keySetIterator() {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        return mapDelegateOrNull != null ? mapDelegateOrNull.keySet().iterator() : new CompactHashMap<K, V>.Itr<K>(this) { // from class: com.google.common.collect.CompactHashMap.1
            final /* synthetic */ CompactHashMap this$0;

            {
                this.getClass();
                this.this$0 = this;
            }

            @Override // com.google.common.collect.CompactHashMap.Itr
            public K getOutput(int i) {
                return (K) this.this$0.key(i);
            }
        };
    }

    public void moveLastEntry(int i, int i2) {
        Object objRequireTable = requireTable();
        int[] iArrRequireEntries = requireEntries();
        Object[] objArrRequireKeys = requireKeys();
        Object[] objArrRequireValues = requireValues();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrRequireKeys[i] = null;
            objArrRequireValues[i] = null;
            iArrRequireEntries[i] = 0;
            return;
        }
        int i4 = i + 1;
        Object obj = objArrRequireKeys[i3];
        objArrRequireKeys[i] = obj;
        objArrRequireValues[i] = objArrRequireValues[i3];
        objArrRequireKeys[i3] = null;
        objArrRequireValues[i3] = null;
        iArrRequireEntries[i] = iArrRequireEntries[i3];
        iArrRequireEntries[i3] = 0;
        int iSmearedHash = Hashing.smearedHash(obj) & i2;
        int iTableGet = CompactHashing.tableGet(objRequireTable, iSmearedHash);
        if (iTableGet == size) {
            CompactHashing.tableSet(objRequireTable, iSmearedHash, i4);
            return;
        }
        while (true) {
            int i5 = iTableGet - 1;
            int i6 = iArrRequireEntries[i5];
            int next = CompactHashing.getNext(i6, i2);
            if (next == size) {
                iArrRequireEntries[i5] = CompactHashing.maskCombine(i6, i4, i2);
                return;
            }
            iTableGet = next;
        }
    }

    public boolean needsAllocArrays() {
        return this.table == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        if (needsAllocArrays()) {
            allocArrays();
        }
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.put(k, v);
        }
        int[] iArrRequireEntries = requireEntries();
        Object[] objArrRequireKeys = requireKeys();
        Object[] objArrRequireValues = requireValues();
        int i = this.size;
        int i2 = i + 1;
        int iSmearedHash = Hashing.smearedHash(k);
        int iHashTableMask = hashTableMask();
        int i3 = iSmearedHash & iHashTableMask;
        int iTableGet = CompactHashing.tableGet(requireTable(), i3);
        if (iTableGet != 0) {
            int hashPrefix = CompactHashing.getHashPrefix(iSmearedHash, iHashTableMask);
            int i4 = 0;
            while (true) {
                int i5 = iTableGet - 1;
                int i6 = iArrRequireEntries[i5];
                if (CompactHashing.getHashPrefix(i6, iHashTableMask) == hashPrefix && a.Q(k, objArrRequireKeys[i5])) {
                    V v2 = (V) objArrRequireValues[i5];
                    objArrRequireValues[i5] = v;
                    accessEntry(i5);
                    return v2;
                }
                int next = CompactHashing.getNext(i6, iHashTableMask);
                i4++;
                if (next != 0) {
                    k = k;
                    v = v;
                    iTableGet = next;
                } else {
                    if (i4 >= 9) {
                        return convertToHashFloodingResistantImplementation().put(k, v);
                    }
                    if (i2 > iHashTableMask) {
                        iHashTableMask = resizeTable(iHashTableMask, CompactHashing.newCapacity(iHashTableMask), iSmearedHash, i);
                    } else {
                        iArrRequireEntries[i5] = CompactHashing.maskCombine(i6, i2, iHashTableMask);
                    }
                }
            }
        } else if (i2 > iHashTableMask) {
            iHashTableMask = resizeTable(iHashTableMask, CompactHashing.newCapacity(iHashTableMask), iSmearedHash, i);
        } else {
            CompactHashing.tableSet(requireTable(), i3, i2);
        }
        resizeMeMaybe(i2);
        insertEntry(i, k, v, iSmearedHash, iHashTableMask);
        this.size = i2;
        incrementModCount();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.remove(obj);
        }
        V v = (V) removeHelper(obj);
        if (v == NOT_FOUND) {
            return null;
        }
        return v;
    }

    public void resizeEntries(int i) {
        this.entries = Arrays.copyOf(requireEntries(), i);
        this.keys = Arrays.copyOf(requireKeys(), i);
        this.values = Arrays.copyOf(requireValues(), i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        return mapDelegateOrNull != null ? mapDelegateOrNull.size() : this.size;
    }

    public void trimToSize() {
        if (needsAllocArrays()) {
            return;
        }
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            Map<K, V> mapCreateHashFloodingResistantDelegate = createHashFloodingResistantDelegate(size());
            mapCreateHashFloodingResistantDelegate.putAll(mapDelegateOrNull);
            this.table = mapCreateHashFloodingResistantDelegate;
            return;
        }
        int i = this.size;
        if (i < requireEntries().length) {
            resizeEntries(i);
        }
        int iTableSize = CompactHashing.tableSize(i);
        int iHashTableMask = hashTableMask();
        if (iTableSize < iHashTableMask) {
            resizeTable(iHashTableMask, iTableSize, 0, 0);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.valuesView;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionCreateValues = createValues();
        this.valuesView = collectionCreateValues;
        return collectionCreateValues;
    }

    public Iterator<V> valuesIterator() {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        return mapDelegateOrNull != null ? mapDelegateOrNull.values().iterator() : new CompactHashMap<K, V>.Itr<V>(this) { // from class: com.google.common.collect.CompactHashMap.3
            final /* synthetic */ CompactHashMap this$0;

            {
                this.getClass();
                this.this$0 = this;
            }

            @Override // com.google.common.collect.CompactHashMap.Itr
            public V getOutput(int i) {
                return (V) this.this$0.value(i);
            }
        };
    }

    public CompactHashMap(int i) {
        init(i);
    }

    public void accessEntry(int i) {
    }
}
