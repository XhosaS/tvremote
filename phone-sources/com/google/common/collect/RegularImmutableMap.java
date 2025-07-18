package com.google.common.collect;

import com.google.common.collect.ImmutableMap;
import defpackage.sij;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class RegularImmutableMap<K, V> extends ImmutableMap<K, V> {
    private static final byte ABSENT = -1;
    private static final int BYTE_MASK = 255;
    private static final int BYTE_MAX_SIZE = 128;
    static final ImmutableMap<Object, Object> EMPTY = new RegularImmutableMap(null, new Object[0], 0);
    private static final int SHORT_MASK = 65535;
    private static final int SHORT_MAX_SIZE = 32768;
    private static final long serialVersionUID = 0;
    final transient Object[] alternatingKeysAndValues;
    private final transient Object hashTable;
    private final transient int size;

    /* compiled from: PG */
    class EntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {
        private final transient Object[] alternatingKeysAndValues;
        private final transient int keyOffset;
        private final transient ImmutableMap<K, V> map;
        private final transient int size;

        public EntrySet(ImmutableMap<K, V> immutableMap, Object[] objArr, int i, int i2) {
            this.map = immutableMap;
            this.alternatingKeysAndValues = objArr;
            this.keyOffset = i;
            this.size = i2;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null && value.equals(this.map.get(key))) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int copyIntoArray(Object[] objArr, int i) {
            return asList().copyIntoArray(objArr, i);
        }

        @Override // com.google.common.collect.ImmutableSet
        public ImmutableList<Map.Entry<K, V>> createAsList() {
            return new ImmutableList<Map.Entry<K, V>>(this) { // from class: com.google.common.collect.RegularImmutableMap.EntrySet.1
                final /* synthetic */ EntrySet this$0;

                {
                    this.getClass();
                    this.this$0 = this;
                }

                @Override // com.google.common.collect.ImmutableCollection
                public boolean isPartialView() {
                    return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                    return this.this$0.size;
                }

                @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
                public Object writeReplace() {
                    return super.writeReplace();
                }

                @Override // java.util.List
                public Map.Entry<K, V> get(int i) {
                    sij.B(i, this.this$0.size);
                    EntrySet entrySet = this.this$0;
                    int i2 = i + i;
                    Object obj = entrySet.alternatingKeysAndValues[entrySet.keyOffset + i2];
                    obj.getClass();
                    EntrySet entrySet2 = this.this$0;
                    Object obj2 = entrySet2.alternatingKeysAndValues[i2 + (entrySet2.keyOffset ^ 1)];
                    obj2.getClass();
                    return new AbstractMap.SimpleImmutableEntry(obj, obj2);
                }
            };
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
            return asList().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.size;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* compiled from: PG */
    final class KeySet<K> extends ImmutableSet<K> {
        private final transient ImmutableList<K> list;
        private final transient ImmutableMap<K, ?> map;

        public KeySet(ImmutableMap<K, ?> immutableMap, ImmutableList<K> immutableList) {
            this.map = immutableMap;
            this.list = immutableList;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public ImmutableList<K> asList() {
            return this.list;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.map.get(obj) != null;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int copyIntoArray(Object[] objArr, int i) {
            return asList().copyIntoArray(objArr, i);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public UnmodifiableIterator<K> iterator() {
            return asList().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.map.size();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* compiled from: PG */
    final class KeysOrValuesAsList extends ImmutableList<Object> {
        private final transient Object[] alternatingKeysAndValues;
        private final transient int offset;
        private final transient int size;

        public KeysOrValuesAsList(Object[] objArr, int i, int i2) {
            this.alternatingKeysAndValues = objArr;
            this.offset = i;
            this.size = i2;
        }

        @Override // java.util.List
        public Object get(int i) {
            sij.B(i, this.size);
            Object obj = this.alternatingKeysAndValues[i + i + this.offset];
            obj.getClass();
            return obj;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.size;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    private RegularImmutableMap(Object obj, Object[] objArr, int i) {
        this.hashTable = obj;
        this.alternatingKeysAndValues = objArr;
        this.size = i;
    }

    static <K, V> RegularImmutableMap<K, V> create(int i, Object[] objArr) {
        return create(i, objArr, null);
    }

    private static Object createHashTable(Object[] objArr, int i, int i2, int i3) {
        int i4;
        ImmutableMap.Builder.DuplicateKey duplicateKey = null;
        int i5 = 1;
        if (i == 1) {
            Object obj = objArr[i3];
            obj.getClass();
            Object obj2 = objArr[i3 ^ 1];
            obj2.getClass();
            CollectPreconditions.checkEntryNotNull(obj, obj2);
            return null;
        }
        int i6 = i2 - 1;
        if (i2 <= BYTE_MAX_SIZE) {
            byte[] bArr = new byte[i2];
            Arrays.fill(bArr, ABSENT);
            int i7 = 0;
            for (int i8 = 0; i8 < i; i8++) {
                int i9 = i8 + i8 + i3;
                int i10 = i7 + i7 + i3;
                Object obj3 = objArr[i9];
                obj3.getClass();
                Object obj4 = objArr[i9 ^ 1];
                obj4.getClass();
                CollectPreconditions.checkEntryNotNull(obj3, obj4);
                int iSmear = Hashing.smear(obj3.hashCode());
                while (true) {
                    int i11 = iSmear & i6;
                    int i12 = bArr[i11] & BYTE_MASK;
                    if (i12 == BYTE_MASK) {
                        bArr[i11] = (byte) i10;
                        if (i7 < i8) {
                            objArr[i10] = obj3;
                            objArr[i10 ^ 1] = obj4;
                        }
                        i7++;
                    } else {
                        if (obj3.equals(objArr[i12])) {
                            int i13 = i12 ^ 1;
                            Object obj5 = objArr[i13];
                            obj5.getClass();
                            ImmutableMap.Builder.DuplicateKey duplicateKey2 = new ImmutableMap.Builder.DuplicateKey(obj3, obj4, obj5);
                            objArr[i13] = obj4;
                            duplicateKey = duplicateKey2;
                            break;
                        }
                        iSmear = i11 + 1;
                    }
                }
            }
            return i7 == i ? bArr : new Object[]{bArr, Integer.valueOf(i7), duplicateKey};
        }
        if (i2 <= SHORT_MAX_SIZE) {
            short[] sArr = new short[i2];
            Arrays.fill(sArr, (short) -1);
            int i14 = 0;
            for (int i15 = 0; i15 < i; i15++) {
                int i16 = i15 + i15 + i3;
                int i17 = i14 + i14 + i3;
                Object obj6 = objArr[i16];
                obj6.getClass();
                Object obj7 = objArr[i16 ^ 1];
                obj7.getClass();
                CollectPreconditions.checkEntryNotNull(obj6, obj7);
                int iSmear2 = Hashing.smear(obj6.hashCode());
                while (true) {
                    int i18 = iSmear2 & i6;
                    char c = (char) sArr[i18];
                    if (c == SHORT_MASK) {
                        sArr[i18] = (short) i17;
                        if (i14 < i15) {
                            objArr[i17] = obj6;
                            objArr[i17 ^ 1] = obj7;
                        }
                        i14++;
                    } else {
                        if (obj6.equals(objArr[c])) {
                            int i19 = c ^ 1;
                            Object obj8 = objArr[i19];
                            obj8.getClass();
                            ImmutableMap.Builder.DuplicateKey duplicateKey3 = new ImmutableMap.Builder.DuplicateKey(obj6, obj7, obj8);
                            objArr[i19] = obj7;
                            duplicateKey = duplicateKey3;
                            break;
                        }
                        iSmear2 = i18 + 1;
                    }
                }
            }
            return i14 == i ? sArr : new Object[]{sArr, Integer.valueOf(i14), duplicateKey};
        }
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        int i20 = 0;
        int i21 = 0;
        while (i20 < i) {
            int i22 = i20 + i20 + i3;
            int i23 = i21 + i21 + i3;
            Object obj9 = objArr[i22];
            obj9.getClass();
            Object obj10 = objArr[i22 ^ i5];
            obj10.getClass();
            CollectPreconditions.checkEntryNotNull(obj9, obj10);
            int iSmear3 = Hashing.smear(obj9.hashCode());
            while (true) {
                int i24 = iSmear3 & i6;
                int i25 = iArr[i24];
                if (i25 == -1) {
                    iArr[i24] = i23;
                    if (i21 < i20) {
                        objArr[i23] = obj9;
                        objArr[i23 ^ 1] = obj10;
                    }
                    i21++;
                    i4 = i5;
                } else {
                    i4 = i5;
                    if (obj9.equals(objArr[i25])) {
                        int i26 = i25 ^ 1;
                        Object obj11 = objArr[i26];
                        obj11.getClass();
                        ImmutableMap.Builder.DuplicateKey duplicateKey4 = new ImmutableMap.Builder.DuplicateKey(obj9, obj10, obj11);
                        objArr[i26] = obj10;
                        duplicateKey = duplicateKey4;
                        break;
                    }
                    iSmear3 = i24 + 1;
                    i5 = i4;
                }
            }
            i20++;
            i5 = i4;
        }
        int i27 = i5;
        if (i21 == i) {
            return iArr;
        }
        Integer numValueOf = Integer.valueOf(i21);
        Object[] objArr2 = new Object[3];
        objArr2[0] = iArr;
        objArr2[i27] = numValueOf;
        objArr2[2] = duplicateKey;
        return objArr2;
    }

    static Object createHashTableOrThrow(Object[] objArr, int i, int i2, int i3) {
        Object objCreateHashTable = createHashTable(objArr, i, i2, i3);
        if (objCreateHashTable instanceof Object[]) {
            throw ((ImmutableMap.Builder.DuplicateKey) ((Object[]) objCreateHashTable)[2]).exception();
        }
        return objCreateHashTable;
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet<Map.Entry<K, V>> createEntrySet() {
        return new EntrySet(this, this.alternatingKeysAndValues, 0, this.size);
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet<K> createKeySet() {
        return new KeySet(this, new KeysOrValuesAsList(this.alternatingKeysAndValues, 0, this.size));
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableCollection<V> createValues() {
        return new KeysOrValuesAsList(this.alternatingKeysAndValues, 1, this.size);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public V get(Object obj) {
        V v = (V) get(this.hashTable, this.alternatingKeysAndValues, this.size, 0, obj);
        if (v == null) {
            return null;
        }
        return v;
    }

    @Override // com.google.common.collect.ImmutableMap
    public boolean isPartialView() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.size;
    }

    @Override // com.google.common.collect.ImmutableMap
    public Object writeReplace() {
        return super.writeReplace();
    }

    static <K, V> RegularImmutableMap<K, V> create(int i, Object[] objArr, ImmutableMap.Builder<K, V> builder) {
        if (i == 0) {
            return (RegularImmutableMap) EMPTY;
        }
        if (i == 1) {
            Object obj = objArr[0];
            obj.getClass();
            Object obj2 = objArr[1];
            obj2.getClass();
            CollectPreconditions.checkEntryNotNull(obj, obj2);
            return new RegularImmutableMap<>(null, objArr, 1);
        }
        sij.C(i, objArr.length >> 1);
        Object objCreateHashTable = createHashTable(objArr, i, ImmutableSet.chooseTableSize(i), 0);
        if (objCreateHashTable instanceof Object[]) {
            Object[] objArr2 = (Object[]) objCreateHashTable;
            ImmutableMap.Builder.DuplicateKey duplicateKey = (ImmutableMap.Builder.DuplicateKey) objArr2[2];
            if (builder == null) {
                throw duplicateKey.exception();
            }
            builder.duplicateKey = duplicateKey;
            Object obj3 = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue + iIntValue);
            objCreateHashTable = obj3;
            i = iIntValue;
        }
        return new RegularImmutableMap<>(objCreateHashTable, objArr, i);
    }

    static Object get(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            Object obj3 = objArr[i2];
            obj3.getClass();
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i2 ^ 1];
            obj4.getClass();
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iSmear = Hashing.smear(obj2.hashCode());
            while (true) {
                int i3 = iSmear & length;
                int i4 = bArr[i3] & BYTE_MASK;
                if (i4 == BYTE_MASK) {
                    return null;
                }
                if (obj2.equals(objArr[i4])) {
                    return objArr[i4 ^ 1];
                }
                iSmear = i3 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iSmear2 = Hashing.smear(obj2.hashCode());
            while (true) {
                int i5 = iSmear2 & length2;
                char c = (char) sArr[i5];
                if (c == SHORT_MASK) {
                    return null;
                }
                if (obj2.equals(objArr[c])) {
                    return objArr[c ^ 1];
                }
                iSmear2 = i5 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iSmear3 = Hashing.smear(obj2.hashCode());
            while (true) {
                int i6 = iSmear3 & length3;
                int i7 = iArr[i6];
                if (i7 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i7])) {
                    return objArr[i7 ^ 1];
                }
                iSmear3 = i6 + 1;
            }
        }
    }
}
