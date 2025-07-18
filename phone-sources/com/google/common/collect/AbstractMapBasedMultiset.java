package com.google.common.collect;

import com.google.common.collect.Multiset;
import defpackage.sfy;
import defpackage.sij;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class AbstractMapBasedMultiset<E> extends AbstractMultiset<E> implements Serializable {
    private static final long serialVersionUID = 0;
    transient ObjectCountHashMap<E> backingMap;
    transient long size;

    /* compiled from: PG */
    abstract class Itr<T> implements Iterator<T> {
        int entryIndex;
        int expectedModCount;
        final /* synthetic */ AbstractMapBasedMultiset this$0;
        int toRemove;

        public Itr(AbstractMapBasedMultiset abstractMapBasedMultiset) {
            abstractMapBasedMultiset.getClass();
            this.this$0 = abstractMapBasedMultiset;
            this.entryIndex = abstractMapBasedMultiset.backingMap.firstIndex();
            this.toRemove = -1;
            this.expectedModCount = abstractMapBasedMultiset.backingMap.modCount;
        }

        private void checkForConcurrentModification() {
            if (this.this$0.backingMap.modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            checkForConcurrentModification();
            return this.entryIndex >= 0;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T tResult = result(this.entryIndex);
            int i = this.entryIndex;
            this.toRemove = i;
            this.entryIndex = this.this$0.backingMap.nextIndex(i);
            return tResult;
        }

        @Override // java.util.Iterator
        public void remove() {
            checkForConcurrentModification();
            CollectPreconditions.checkRemove(this.toRemove != -1);
            this.this$0.size -= r0.backingMap.removeEntry(this.toRemove);
            this.entryIndex = this.this$0.backingMap.nextIndexAfterRemove(this.entryIndex, this.toRemove);
            this.toRemove = -1;
            this.expectedModCount = this.this$0.backingMap.modCount;
        }

        public abstract T result(int i);
    }

    public AbstractMapBasedMultiset(int i) {
        this.backingMap = newBackingMap(i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int count = Serialization.readCount(objectInputStream);
        this.backingMap = newBackingMap(3);
        Serialization.populateMultiset(this, objectInputStream, count);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Serialization.writeMultiset(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int add(E e, int i) {
        if (i == 0) {
            return count(e);
        }
        sij.q(i > 0, "occurrences cannot be negative: %s", i);
        int iIndexOf = this.backingMap.indexOf(e);
        long j = i;
        if (iIndexOf == -1) {
            this.backingMap.put(e, i);
            this.size += j;
            return 0;
        }
        int value = this.backingMap.getValue(iIndexOf);
        long j2 = value + j;
        sij.r(j2 <= 2147483647L, "too many occurrences: %s", j2);
        this.backingMap.setValue(iIndexOf, (int) j2);
        this.size += j;
        return value;
    }

    public void addTo(Multiset<? super E> multiset) {
        multiset.getClass();
        int iFirstIndex = this.backingMap.firstIndex();
        while (iFirstIndex >= 0) {
            multiset.add(this.backingMap.getKey(iFirstIndex), this.backingMap.getValue(iFirstIndex));
            iFirstIndex = this.backingMap.nextIndex(iFirstIndex);
        }
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.backingMap.clear();
        this.size = 0L;
    }

    @Override // com.google.common.collect.Multiset
    public final int count(Object obj) {
        return this.backingMap.get(obj);
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final int distinctElements() {
        return this.backingMap.size();
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final Iterator<E> elementIterator() {
        return new AbstractMapBasedMultiset<E>.Itr<E>(this) { // from class: com.google.common.collect.AbstractMapBasedMultiset.1
            final /* synthetic */ AbstractMapBasedMultiset this$0;

            {
                this.getClass();
                this.this$0 = this;
            }

            @Override // com.google.common.collect.AbstractMapBasedMultiset.Itr
            public E result(int i) {
                return this.this$0.backingMap.getKey(i);
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final Iterator<Multiset.Entry<E>> entryIterator() {
        return new AbstractMapBasedMultiset<E>.Itr<Multiset.Entry<E>>(this) { // from class: com.google.common.collect.AbstractMapBasedMultiset.2
            final /* synthetic */ AbstractMapBasedMultiset this$0;

            {
                this.getClass();
                this.this$0 = this;
            }

            @Override // com.google.common.collect.AbstractMapBasedMultiset.Itr
            public Multiset.Entry<E> result(int i) {
                return this.this$0.backingMap.getEntry(i);
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public final Iterator<E> iterator() {
        return Multisets.iteratorImpl(this);
    }

    public abstract ObjectCountHashMap<E> newBackingMap(int i);

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int remove(Object obj, int i) {
        if (i == 0) {
            return count(obj);
        }
        sij.q(i > 0, "occurrences cannot be negative: %s", i);
        int iIndexOf = this.backingMap.indexOf(obj);
        if (iIndexOf == -1) {
            return 0;
        }
        int value = this.backingMap.getValue(iIndexOf);
        if (value > i) {
            this.backingMap.setValue(iIndexOf, value - i);
        } else {
            this.backingMap.removeEntry(iIndexOf);
            i = value;
        }
        this.size -= i;
        return value;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int setCount(E e, int i) {
        CollectPreconditions.checkNonnegative(i, "count");
        int iRemove = i == 0 ? this.backingMap.remove(e) : this.backingMap.put(e, i);
        this.size += i - iRemove;
        return iRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public final int size() {
        return sfy.ab(this.size);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final boolean setCount(E e, int i, int i2) {
        CollectPreconditions.checkNonnegative(i, "oldCount");
        CollectPreconditions.checkNonnegative(i2, "newCount");
        int iIndexOf = this.backingMap.indexOf(e);
        if (iIndexOf == -1) {
            if (i != 0) {
                return false;
            }
            if (i2 > 0) {
                this.backingMap.put(e, i2);
                this.size += i2;
            }
            return true;
        }
        if (this.backingMap.getValue(iIndexOf) != i) {
            return false;
        }
        if (i2 == 0) {
            this.backingMap.removeEntry(iIndexOf);
            this.size -= i;
        } else {
            this.backingMap.setValue(iIndexOf, i2);
            this.size += i2 - i;
        }
        return true;
    }
}
