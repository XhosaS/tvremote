package com.google.common.collect;

import android.support.v7.widget.ActivityChooserView;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import defpackage.a;
import defpackage.sij;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
class ObjectCountHashMap<K> {
    static final float DEFAULT_LOAD_FACTOR = 1.0f;
    static final int DEFAULT_SIZE = 3;
    private static final long HASH_MASK = -4294967296L;
    private static final int MAXIMUM_CAPACITY = 1073741824;
    private static final long NEXT_MASK = 4294967295L;
    static final int UNSET = -1;
    transient long[] entries;
    transient Object[] keys;
    private transient float loadFactor;
    transient int modCount;
    transient int size;
    private transient int[] table;
    private transient int threshold;
    transient int[] values;

    /* compiled from: PG */
    class MapEntry extends Multisets.AbstractEntry<K> {
        final K key;
        int lastKnownIndex;
        final /* synthetic */ ObjectCountHashMap this$0;

        public MapEntry(ObjectCountHashMap objectCountHashMap, int i) {
            objectCountHashMap.getClass();
            this.this$0 = objectCountHashMap;
            this.key = (K) objectCountHashMap.keys[i];
            this.lastKnownIndex = i;
        }

        @Override // com.google.common.collect.Multiset.Entry
        public int getCount() {
            updateLastKnownIndex();
            int i = this.lastKnownIndex;
            if (i == -1) {
                return 0;
            }
            return this.this$0.values[i];
        }

        @Override // com.google.common.collect.Multiset.Entry
        public K getElement() {
            return this.key;
        }

        public int setCount(int i) {
            updateLastKnownIndex();
            int i2 = this.lastKnownIndex;
            if (i2 == -1) {
                this.this$0.put(this.key, i);
                return 0;
            }
            int[] iArr = this.this$0.values;
            int i3 = iArr[i2];
            iArr[i2] = i;
            return i3;
        }

        public void updateLastKnownIndex() {
            int i = this.lastKnownIndex;
            if (i == -1 || i >= this.this$0.size() || !a.Q(this.key, this.this$0.keys[this.lastKnownIndex])) {
                this.lastKnownIndex = this.this$0.indexOf(this.key);
            }
        }
    }

    public ObjectCountHashMap() {
        init(3, DEFAULT_LOAD_FACTOR);
    }

    static <K> ObjectCountHashMap<K> create() {
        return new ObjectCountHashMap<>();
    }

    static <K> ObjectCountHashMap<K> createWithExpectedSize(int i) {
        return new ObjectCountHashMap<>(i);
    }

    private static int getHash(long j) {
        return (int) (j >>> 32);
    }

    private static int getNext(long j) {
        return (int) j;
    }

    private int hashTableMask() {
        return this.table.length - 1;
    }

    private static long[] newEntries(int i) {
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    private static int[] newTable(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private void resizeMeMaybe(int i) {
        int length = this.entries.length;
        if (i > length) {
            int iMax = Math.max(1, length >>> 1) + length;
            if (iMax < 0) {
                iMax = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            }
            if (iMax != length) {
                resizeEntries(iMax);
            }
        }
    }

    private void resizeTable(int i) {
        if (this.table.length >= MAXIMUM_CAPACITY) {
            this.threshold = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            return;
        }
        float f = i * this.loadFactor;
        int[] iArrNewTable = newTable(i);
        long[] jArr = this.entries;
        int length = iArrNewTable.length;
        for (int i2 = 0; i2 < this.size; i2++) {
            int hash = getHash(jArr[i2]);
            int i3 = (length - 1) & hash;
            int i4 = iArrNewTable[i3];
            iArrNewTable[i3] = i2;
            jArr[i2] = (hash << 32) | (i4 & NEXT_MASK);
        }
        this.threshold = ((int) f) + 1;
        this.table = iArrNewTable;
    }

    private static long swapNext(long j, int i) {
        return (j & HASH_MASK) | (i & NEXT_MASK);
    }

    public void clear() {
        this.modCount++;
        Arrays.fill(this.keys, 0, this.size, (Object) null);
        Arrays.fill(this.values, 0, this.size, 0);
        Arrays.fill(this.table, -1);
        Arrays.fill(this.entries, -1L);
        this.size = 0;
    }

    public boolean containsKey(Object obj) {
        return indexOf(obj) != -1;
    }

    public void ensureCapacity(int i) {
        if (i > this.entries.length) {
            resizeEntries(i);
        }
        if (i >= this.threshold) {
            int iHighestOneBit = Integer.highestOneBit(i - 1);
            resizeTable(Math.max(2, iHighestOneBit + iHighestOneBit));
        }
    }

    public int firstIndex() {
        return this.size == 0 ? -1 : 0;
    }

    public int get(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return 0;
        }
        return this.values[iIndexOf];
    }

    public Multiset.Entry<K> getEntry(int i) {
        sij.B(i, this.size);
        return new MapEntry(this, i);
    }

    public K getKey(int i) {
        sij.B(i, this.size);
        return (K) this.keys[i];
    }

    public int getValue(int i) {
        sij.B(i, this.size);
        return this.values[i];
    }

    public int indexOf(Object obj) {
        int iSmearedHash = Hashing.smearedHash(obj);
        int next = this.table[hashTableMask() & iSmearedHash];
        while (next != -1) {
            long j = this.entries[next];
            if (getHash(j) == iSmearedHash && a.Q(obj, this.keys[next])) {
                return next;
            }
            next = getNext(j);
        }
        return -1;
    }

    public void init(int i, float f) {
        sij.o(i >= 0, "Initial capacity must be non-negative");
        sij.o(f > 0.0f, "Illegal load factor");
        int iClosedTableSize = Hashing.closedTableSize(i, f);
        this.table = newTable(iClosedTableSize);
        this.loadFactor = f;
        this.keys = new Object[i];
        this.values = new int[i];
        this.entries = newEntries(i);
        this.threshold = Math.max(1, (int) (iClosedTableSize * f));
    }

    public void insertEntry(int i, K k, int i2, int i3) {
        this.entries[i] = (i3 << 32) | NEXT_MASK;
        this.keys[i] = k;
        this.values[i] = i2;
    }

    public void moveLastEntry(int i) {
        int size = size() - 1;
        if (i >= size) {
            this.keys[i] = null;
            this.values[i] = 0;
            this.entries[i] = -1;
            return;
        }
        Object[] objArr = this.keys;
        objArr[i] = objArr[size];
        int[] iArr = this.values;
        iArr[i] = iArr[size];
        objArr[size] = null;
        iArr[size] = 0;
        long[] jArr = this.entries;
        long j = jArr[size];
        jArr[i] = j;
        jArr[size] = -1;
        int hash = getHash(j) & hashTableMask();
        int[] iArr2 = this.table;
        int i2 = iArr2[hash];
        if (i2 == size) {
            iArr2[hash] = i;
            return;
        }
        while (true) {
            long[] jArr2 = this.entries;
            long j2 = jArr2[i2];
            int next = getNext(j2);
            if (next == size) {
                jArr2[i2] = swapNext(j2, i);
                return;
            }
            i2 = next;
        }
    }

    public int nextIndex(int i) {
        int i2 = i + 1;
        if (i2 < this.size) {
            return i2;
        }
        return -1;
    }

    public int nextIndexAfterRemove(int i, int i2) {
        return i - 1;
    }

    public int put(K k, int i) {
        CollectPreconditions.checkPositive(i, "count");
        long[] jArr = this.entries;
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        int iSmearedHash = Hashing.smearedHash(k);
        int iHashTableMask = hashTableMask() & iSmearedHash;
        int i2 = this.size;
        int[] iArr2 = this.table;
        int i3 = iArr2[iHashTableMask];
        if (i3 == -1) {
            iArr2[iHashTableMask] = i2;
        } else {
            while (true) {
                long j = jArr[i3];
                if (getHash(j) == iSmearedHash && a.Q(k, objArr[i3])) {
                    int i4 = iArr[i3];
                    iArr[i3] = i;
                    return i4;
                }
                int next = getNext(j);
                if (next == -1) {
                    jArr[i3] = swapNext(j, i2);
                    break;
                }
                i3 = next;
            }
        }
        if (i2 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i5 = i2 + 1;
        resizeMeMaybe(i5);
        insertEntry(i2, k, i, iSmearedHash);
        this.size = i5;
        if (i2 >= this.threshold) {
            int length = this.table.length;
            resizeTable(length + length);
        }
        this.modCount++;
        return 0;
    }

    public int remove(Object obj) {
        return remove(obj, Hashing.smearedHash(obj));
    }

    public int removeEntry(int i) {
        return remove(this.keys[i], getHash(this.entries[i]));
    }

    public void resizeEntries(int i) {
        this.keys = Arrays.copyOf(this.keys, i);
        this.values = Arrays.copyOf(this.values, i);
        long[] jArr = this.entries;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(jArrCopyOf, length, i, -1L);
        }
        this.entries = jArrCopyOf;
    }

    public void setValue(int i, int i2) {
        sij.B(i, this.size);
        this.values[i] = i2;
    }

    public int size() {
        return this.size;
    }

    public ObjectCountHashMap(int i) {
        this(i, DEFAULT_LOAD_FACTOR);
    }

    private int remove(Object obj, int i) {
        int iHashTableMask = hashTableMask() & i;
        int i2 = this.table[iHashTableMask];
        if (i2 == -1) {
            return 0;
        }
        int i3 = -1;
        while (true) {
            if (getHash(this.entries[i2]) == i && a.Q(obj, this.keys[i2])) {
                int i4 = this.values[i2];
                if (i3 == -1) {
                    this.table[iHashTableMask] = getNext(this.entries[i2]);
                } else {
                    long[] jArr = this.entries;
                    jArr[i3] = swapNext(jArr[i3], getNext(jArr[i2]));
                }
                moveLastEntry(i2);
                this.size--;
                this.modCount++;
                return i4;
            }
            int next = getNext(this.entries[i2]);
            if (next == -1) {
                return 0;
            }
            i3 = i2;
            i2 = next;
        }
    }

    public ObjectCountHashMap(int i, float f) {
        init(i, f);
    }

    public ObjectCountHashMap(ObjectCountHashMap<? extends K> objectCountHashMap) {
        init(objectCountHashMap.size(), DEFAULT_LOAD_FACTOR);
        int iFirstIndex = objectCountHashMap.firstIndex();
        while (iFirstIndex != -1) {
            put(objectCountHashMap.getKey(iFirstIndex), objectCountHashMap.getValue(iFirstIndex));
            iFirstIndex = objectCountHashMap.nextIndex(iFirstIndex);
        }
    }
}
