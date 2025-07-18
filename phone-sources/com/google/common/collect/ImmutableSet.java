package com.google.common.collect;

import com.google.common.collect.ImmutableCollection;
import defpackage.sij;
import j$.util.stream.Collector;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E>, j$.util.Set<E> {
    private static final int CUTOFF = 751619276;
    private static final double DESIRED_LOAD_FACTOR = 0.7d;
    static final int MAX_TABLE_SIZE = 1073741824;
    static final int SPLITERATOR_CHARACTERISTICS = 1297;
    private static final long serialVersionUID = 912559;
    private transient ImmutableList<E> asList;

    /* compiled from: PG */
    public class Builder<E> extends ImmutableCollection.ArrayBasedBuilder<E> {
        private int hashCode;
        Object[] hashTable;

        public Builder() {
            super(4);
        }

        private void addDeduping(E e) {
            Object[] objArr = this.hashTable;
            objArr.getClass();
            int length = objArr.length - 1;
            int iHashCode = e.hashCode();
            int iSmear = Hashing.smear(iHashCode);
            while (true) {
                int i = iSmear & length;
                Object[] objArr2 = this.hashTable;
                Object obj = objArr2[i];
                if (obj == null) {
                    objArr2[i] = e;
                    this.hashCode += iHashCode;
                    super.add((Builder<E>) e);
                    return;
                } else if (obj.equals(e)) {
                    return;
                } else {
                    iSmear = i + 1;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        public /* bridge */ /* synthetic */ ImmutableCollection.ArrayBasedBuilder add(Object obj) {
            return add((Builder<E>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder<E> combine(Builder<E> builder) {
            if (this.hashTable == null) {
                addAll(builder.contents, builder.size);
                return this;
            }
            for (int i = 0; i < builder.size; i++) {
                Object obj = builder.contents[i];
                obj.getClass();
                add((Builder<E>) obj);
            }
            return this;
        }

        public Builder(int i, boolean z) {
            super(i);
            if (z) {
                this.hashTable = new Object[ImmutableSet.chooseTableSize(i)];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        public /* bridge */ /* synthetic */ ImmutableCollection.Builder add(Object obj) {
            return add((Builder<E>) obj);
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        public Builder<E> addAll(Iterable<? extends E> iterable) {
            iterable.getClass();
            if (this.hashTable == null) {
                super.addAll((Iterable) iterable);
                return this;
            }
            Iterator<? extends E> it = iterable.iterator();
            while (it.hasNext()) {
                add((Builder<E>) it.next());
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public ImmutableSet<E> build() {
            ImmutableSet<E> immutableSetConstruct;
            int i = this.size;
            if (i == 0) {
                return ImmutableSet.of();
            }
            if (i == 1) {
                Object obj = this.contents[0];
                obj.getClass();
                return ImmutableSet.of(obj);
            }
            if (this.hashTable == null || ImmutableSet.chooseTableSize(i) != this.hashTable.length) {
                immutableSetConstruct = ImmutableSet.construct(this.size, this.contents);
                this.size = immutableSetConstruct.size();
            } else {
                int i2 = this.size;
                Object[] objArrCopyOf = this.contents;
                if (ImmutableSet.shouldTrim(i2, objArrCopyOf.length)) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, i2);
                }
                immutableSetConstruct = new RegularImmutableSet<>(objArrCopyOf, this.hashCode, this.hashTable, r6.length - 1, this.size);
            }
            this.forceCopy = true;
            this.hashTable = null;
            return immutableSetConstruct;
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        public Builder<E> add(E e) {
            e.getClass();
            if (this.hashTable != null && ImmutableSet.chooseTableSize(this.size) <= this.hashTable.length) {
                addDeduping(e);
                return this;
            }
            this.hashTable = null;
            super.add((Builder<E>) e);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public /* bridge */ /* synthetic */ ImmutableCollection.Builder addAll(Iterator it) {
            addAll(it);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public Builder<E> addAll(Iterator<? extends E> it) {
            it.getClass();
            while (it.hasNext()) {
                add((Builder<E>) it.next());
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        public Builder<E> add(E... eArr) {
            if (this.hashTable == null) {
                super.add((Object[]) eArr);
                return this;
            }
            for (E e : eArr) {
                add((Builder<E>) e);
            }
            return this;
        }
    }

    /* compiled from: PG */
    class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] elements;

        public SerializedForm(Object[] objArr) {
            this.elements = objArr;
        }

        Object readResolve() {
            return ImmutableSet.copyOf(this.elements);
        }
    }

    public static <E> Builder<E> builder() {
        return new Builder<>();
    }

    public static <E> Builder<E> builderWithExpectedSize(int i) {
        CollectPreconditions.checkNonnegative(i, "expectedSize");
        return new Builder<>(i, true);
    }

    static int chooseTableSize(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= CUTOFF) {
            sij.o(iMax < MAX_TABLE_SIZE, "collection too large");
            return MAX_TABLE_SIZE;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (iHighestOneBit * DESIRED_LOAD_FACTOR < iMax);
        return iHighestOneBit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> ImmutableSet<E> construct(int i, Object... objArr) {
        if (i == 0) {
            return of();
        }
        if (i == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return of(obj);
        }
        int iChooseTableSize = chooseTableSize(i);
        Object[] objArr2 = new Object[iChooseTableSize];
        int i2 = iChooseTableSize - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            ObjectArrays.checkElementNotNull(obj2, i5);
            int iHashCode = obj2.hashCode();
            int iSmear = Hashing.smear(iHashCode);
            while (true) {
                int i6 = iSmear & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    iSmear++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new SingletonImmutableSet(obj4);
        }
        if (chooseTableSize(i4) < iChooseTableSize / 2) {
            return construct(i4, objArr);
        }
        if (shouldTrim(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new RegularImmutableSet(objArr, i3, objArr2, i2, i4);
    }

    public static <E> ImmutableSet<E> copyOf(Iterable<? extends E> iterable) {
        return iterable instanceof Collection ? copyOf((Collection) iterable) : copyOf(iterable.iterator());
    }

    public static <E> ImmutableSet<E> of() {
        return RegularImmutableSet.EMPTY;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean shouldTrim(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    public static <E> Collector<E, ?, ImmutableSet<E>> toImmutableSet() {
        return CollectCollectors.toImmutableSet();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList<E> asList() {
        ImmutableList<E> immutableList = this.asList;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList<E> immutableListCreateAsList = createAsList();
        this.asList = immutableListCreateAsList;
        return immutableListCreateAsList;
    }

    public ImmutableList<E> createAsList() {
        return ImmutableList.asImmutableList(toArray());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ImmutableSet) && isHashCodeFast() && ((ImmutableSet) obj).isHashCodeFast() && hashCode() != obj.hashCode()) {
            return false;
        }
        return Sets.equalsImpl(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return Sets.hashCodeImpl(this);
    }

    public boolean isHashCodeFast() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public abstract UnmodifiableIterator<E> iterator();

    @Override // com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(toArray());
    }

    public static <E> ImmutableSet<E> of(E e) {
        return new SingletonImmutableSet(e);
    }

    public static <E> ImmutableSet<E> of(E e, E e2) {
        return construct(2, e, e2);
    }

    public static <E> ImmutableSet<E> copyOf(Collection<? extends E> collection) {
        if ((collection instanceof ImmutableSet) && !(collection instanceof SortedSet)) {
            ImmutableSet<E> immutableSet = (ImmutableSet) collection;
            if (!immutableSet.isPartialView()) {
                return immutableSet;
            }
        }
        Object[] array = collection.toArray();
        return construct(array.length, array);
    }

    public static <E> ImmutableSet<E> of(E e, E e2, E e3) {
        return construct(3, e, e2, e3);
    }

    public static <E> ImmutableSet<E> of(E e, E e2, E e3, E e4) {
        return construct(4, e, e2, e3, e4);
    }

    public static <E> ImmutableSet<E> of(E e, E e2, E e3, E e4, E e5) {
        return construct(5, e, e2, e3, e4, e5);
    }

    @SafeVarargs
    public static <E> ImmutableSet<E> of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        int length = eArr.length;
        sij.o(length <= 2147483641, "the total number of elements must fit in an int");
        int i = length + 6;
        Object[] objArr = new Object[i];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        System.arraycopy(eArr, 0, objArr, 6, length);
        return construct(i, objArr);
    }

    public static <E> ImmutableSet<E> copyOf(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return of();
        }
        E next = it.next();
        if (!it.hasNext()) {
            return of((Object) next);
        }
        Builder builder = new Builder();
        builder.add((Builder) next);
        builder.addAll((Iterator) it);
        return builder.build();
    }

    public static <E> ImmutableSet<E> copyOf(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return of();
        }
        if (length != 1) {
            return construct(length, (Object[]) eArr.clone());
        }
        return of((Object) eArr[0]);
    }
}
