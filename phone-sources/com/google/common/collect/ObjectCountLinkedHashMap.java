package com.google.common.collect;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
class ObjectCountLinkedHashMap<K> extends ObjectCountHashMap<K> {
    private static final int ENDPOINT = -2;
    private transient int firstEntry;
    private transient int lastEntry;
    transient long[] links;

    public ObjectCountLinkedHashMap() {
        this(3);
    }

    static <K> ObjectCountLinkedHashMap<K> create() {
        return new ObjectCountLinkedHashMap<>();
    }

    static <K> ObjectCountLinkedHashMap<K> createWithExpectedSize(int i) {
        return new ObjectCountLinkedHashMap<>(i);
    }

    private int getPredecessor(int i) {
        return (int) (this.links[i] >>> 32);
    }

    private int getSuccessor(int i) {
        return (int) this.links[i];
    }

    private void setPredecessor(int i, int i2) {
        long[] jArr = this.links;
        jArr[i] = (jArr[i] & 4294967295L) | (i2 << 32);
    }

    private void setSucceeds(int i, int i2) {
        if (i == -2) {
            this.firstEntry = i2;
        } else {
            setSuccessor(i, i2);
        }
        if (i2 == -2) {
            this.lastEntry = i;
        } else {
            setPredecessor(i2, i);
        }
    }

    private void setSuccessor(int i, int i2) {
        long[] jArr = this.links;
        jArr[i] = (jArr[i] & (-4294967296L)) | (i2 & 4294967295L);
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public void clear() {
        super.clear();
        this.firstEntry = -2;
        this.lastEntry = -2;
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public int firstIndex() {
        int i = this.firstEntry;
        if (i == -2) {
            return -1;
        }
        return i;
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public void init(int i, float f) {
        super.init(i, f);
        this.firstEntry = -2;
        this.lastEntry = -2;
        long[] jArr = new long[i];
        this.links = jArr;
        Arrays.fill(jArr, -1L);
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public void insertEntry(int i, K k, int i2, int i3) {
        super.insertEntry(i, k, i2, i3);
        setSucceeds(this.lastEntry, i);
        setSucceeds(i, -2);
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public void moveLastEntry(int i) {
        int size = size() - 1;
        setSucceeds(getPredecessor(i), getSuccessor(i));
        if (i < size) {
            setSucceeds(getPredecessor(size), i);
            setSucceeds(i, getSuccessor(size));
        }
        super.moveLastEntry(i);
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public int nextIndex(int i) {
        int successor = getSuccessor(i);
        if (successor == -2) {
            return -1;
        }
        return successor;
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public int nextIndexAfterRemove(int i, int i2) {
        return i == size() ? i2 : i;
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public void resizeEntries(int i) {
        super.resizeEntries(i);
        long[] jArr = this.links;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i);
        this.links = jArrCopyOf;
        Arrays.fill(jArrCopyOf, length, i, -1L);
    }

    public ObjectCountLinkedHashMap(int i) {
        this(i, 1.0f);
    }

    public ObjectCountLinkedHashMap(int i, float f) {
        super(i, f);
    }

    public ObjectCountLinkedHashMap(ObjectCountHashMap<K> objectCountHashMap) {
        init(objectCountHashMap.size(), 1.0f);
        int iFirstIndex = objectCountHashMap.firstIndex();
        while (iFirstIndex != -1) {
            put(objectCountHashMap.getKey(iFirstIndex), objectCountHashMap.getValue(iFirstIndex));
            iFirstIndex = objectCountHashMap.nextIndex(iFirstIndex);
        }
    }
}
