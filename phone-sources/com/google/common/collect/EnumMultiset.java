package com.google.common.collect;

import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import defpackage.a;
import defpackage.sfy;
import defpackage.sij;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.Enum;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class EnumMultiset<E extends Enum<E>> extends AbstractMultiset<E> implements Serializable {
    private static final long serialVersionUID = 0;
    private transient int[] counts;
    private transient int distinctElements;
    private transient E[] enumConstants;
    private transient long size;
    private transient Class<E> type;

    /* compiled from: PG */
    abstract class Itr<T> implements Iterator<T> {
        int index;
        final /* synthetic */ EnumMultiset this$0;
        int toRemove;

        public Itr(EnumMultiset enumMultiset) {
            enumMultiset.getClass();
            this.this$0 = enumMultiset;
            this.index = 0;
            this.toRemove = -1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (this.index < this.this$0.enumConstants.length) {
                int[] iArr = this.this$0.counts;
                int i = this.index;
                if (iArr[i] > 0) {
                    return true;
                }
                this.index = i + 1;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T tOutput = output(this.index);
            int i = this.index;
            this.toRemove = i;
            this.index = i + 1;
            return tOutput;
        }

        public abstract T output(int i);

        @Override // java.util.Iterator
        public void remove() {
            CollectPreconditions.checkRemove(this.toRemove >= 0);
            if (this.this$0.counts[this.toRemove] > 0) {
                EnumMultiset enumMultiset = this.this$0;
                enumMultiset.distinctElements--;
                this.this$0.size -= r0.counts[this.toRemove];
                this.this$0.counts[this.toRemove] = 0;
            }
            this.toRemove = -1;
        }
    }

    private EnumMultiset(Class<E> cls) {
        this.type = cls;
        a.H(cls.isEnum());
        E[] enumConstants = cls.getEnumConstants();
        this.enumConstants = enumConstants;
        this.counts = new int[enumConstants.length];
    }

    private void checkIsE(Object obj) {
        obj.getClass();
        if (isActuallyE(obj)) {
            return;
        }
        throw new ClassCastException("Expected an " + String.valueOf(this.type) + " but got " + obj.toString());
    }

    public static <E extends Enum<E>> EnumMultiset<E> create(Class<E> cls) {
        return new EnumMultiset<>(cls);
    }

    private boolean isActuallyE(Object obj) {
        if (obj instanceof Enum) {
            Enum r5 = (Enum) obj;
            int iOrdinal = r5.ordinal();
            E[] eArr = this.enumConstants;
            if (iOrdinal < eArr.length && eArr[iOrdinal] == r5) {
                return true;
            }
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        object.getClass();
        Class<E> cls = (Class) object;
        this.type = cls;
        E[] enumConstants = cls.getEnumConstants();
        this.enumConstants = enumConstants;
        this.counts = new int[enumConstants.length];
        Serialization.populateMultiset(this, objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.type);
        Serialization.writeMultiset(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public int add(E e, int i) {
        checkIsE(e);
        CollectPreconditions.checkNonnegative(i, "occurrences");
        if (i == 0) {
            return count(e);
        }
        int iOrdinal = e.ordinal();
        int i2 = this.counts[iOrdinal];
        long j = i;
        long j2 = i2 + j;
        sij.r(j2 <= 2147483647L, "too many occurrences: %s", j2);
        this.counts[iOrdinal] = (int) j2;
        if (i2 == 0) {
            this.distinctElements++;
            i2 = 0;
        }
        this.size += j;
        return i2;
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        Arrays.fill(this.counts, 0);
        this.size = 0L;
        this.distinctElements = 0;
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.Multiset
    public int count(Object obj) {
        if (obj == null || !isActuallyE(obj)) {
            return 0;
        }
        return this.counts[((Enum) obj).ordinal()];
    }

    @Override // com.google.common.collect.AbstractMultiset
    public int distinctElements() {
        return this.distinctElements;
    }

    @Override // com.google.common.collect.AbstractMultiset
    public Iterator<E> elementIterator() {
        return new EnumMultiset<E>.Itr<E>(this) { // from class: com.google.common.collect.EnumMultiset.1
            final /* synthetic */ EnumMultiset this$0;

            {
                this.getClass();
                this.this$0 = this;
            }

            @Override // com.google.common.collect.EnumMultiset.Itr
            public E output(int i) {
                return (E) this.this$0.enumConstants[i];
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ Set elementSet() {
        return super.elementSet();
    }

    @Override // com.google.common.collect.AbstractMultiset
    public Iterator<Multiset.Entry<E>> entryIterator() {
        return new EnumMultiset<E>.Itr<Multiset.Entry<E>>(this) { // from class: com.google.common.collect.EnumMultiset.2
            final /* synthetic */ EnumMultiset this$0;

            {
                this.getClass();
                this.this$0 = this;
            }

            @Override // com.google.common.collect.EnumMultiset.Itr
            public Multiset.Entry<E> output(final int i) {
                return new Multisets.AbstractEntry<E>(this) { // from class: com.google.common.collect.EnumMultiset.2.1
                    final /* synthetic */ AnonymousClass2 this$1;

                    {
                        this.getClass();
                        this.this$1 = this;
                    }

                    @Override // com.google.common.collect.Multiset.Entry
                    public int getCount() {
                        return this.this$1.this$0.counts[i];
                    }

                    @Override // com.google.common.collect.Multiset.Entry
                    public E getElement() {
                        return (E) this.this$1.this$0.enumConstants[i];
                    }
                };
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public Iterator<E> iterator() {
        return Multisets.iteratorImpl(this);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public int remove(Object obj, int i) {
        if (obj == null || !isActuallyE(obj)) {
            return 0;
        }
        Enum r1 = (Enum) obj;
        CollectPreconditions.checkNonnegative(i, "occurrences");
        if (i == 0) {
            return count(obj);
        }
        int iOrdinal = r1.ordinal();
        int[] iArr = this.counts;
        int i2 = iArr[iOrdinal];
        if (i2 == 0) {
            return 0;
        }
        if (i2 > i) {
            iArr[iOrdinal] = i2 - i;
            this.size -= i;
            return i2;
        }
        iArr[iOrdinal] = 0;
        this.distinctElements--;
        this.size -= i2;
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0026 A[PHI: r1
  0x0026: PHI (r1v1 int) = (r1v0 int), (r1v3 int) binds: [B:3:0x001a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int setCount(E r7, int r8) {
        /*
            r6 = this;
            r6.checkIsE(r7)
            java.lang.String r0 = "count"
            com.google.common.collect.CollectPreconditions.checkNonnegative(r8, r0)
            int r7 = r7.ordinal()
            int[] r0 = r6.counts
            r1 = r0[r7]
            r0[r7] = r8
            int r7 = r8 - r1
            long r2 = r6.size
            long r4 = (long) r7
            long r2 = r2 + r4
            r6.size = r2
            if (r1 != 0) goto L26
            r1 = 0
            if (r8 <= 0) goto L26
            int r7 = r6.distinctElements
            int r7 = r7 + 1
        L23:
            r6.distinctElements = r7
            return r1
        L26:
            if (r1 <= 0) goto L30
            if (r8 == 0) goto L2b
            goto L30
        L2b:
            int r7 = r6.distinctElements
            int r7 = r7 + (-1)
            goto L23
        L30:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.EnumMultiset.setCount(java.lang.Enum, int):int");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
        return sfy.ab(this.size);
    }

    public static <E extends Enum<E>> EnumMultiset<E> create(Iterable<E> iterable) {
        Iterator<E> it = iterable.iterator();
        sij.o(it.hasNext(), "EnumMultiset constructor passed empty Iterable");
        EnumMultiset<E> enumMultiset = new EnumMultiset<>(it.next().getDeclaringClass());
        Iterables.addAll(enumMultiset, iterable);
        return enumMultiset;
    }

    public static <E extends Enum<E>> EnumMultiset<E> create(Iterable<E> iterable, Class<E> cls) {
        EnumMultiset<E> enumMultisetCreate = create(cls);
        Iterables.addAll(enumMultisetCreate, iterable);
        return enumMultisetCreate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ boolean setCount(Object obj, int i, int i2) {
        return super.setCount(obj, i, i2);
    }
}
