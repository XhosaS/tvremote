package com.google.common.collect;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.Multiset;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collector;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Function;
import java.util.function.ToIntFunction;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ImmutableMultiset<E> extends ImmutableMultisetGwtSerializationDependencies<E> implements Multiset<E>, Collection<E> {
    private static final long serialVersionUID = 912559;
    private transient ImmutableList<E> asList;
    private transient ImmutableSet<Multiset.Entry<E>> entrySet;

    /* compiled from: PG */
    public class Builder<E> extends ImmutableCollection.Builder<E> {
        boolean buildInvoked;
        ObjectCountHashMap<E> contents;
        boolean isLinkedHash;

        public Builder(boolean z) {
            this.buildInvoked = false;
            this.isLinkedHash = false;
            this.contents = null;
        }

        static <T> ObjectCountHashMap<T> tryGetMap(Iterable<T> iterable) {
            if (iterable instanceof RegularImmutableMultiset) {
                return ((RegularImmutableMultiset) iterable).contents;
            }
            if (iterable instanceof AbstractMapBasedMultiset) {
                return ((AbstractMapBasedMultiset) iterable).backingMap;
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableCollection.Builder
        public /* bridge */ /* synthetic */ ImmutableCollection.Builder add(Object obj) {
            return add((Builder<E>) obj);
        }

        public Builder<E> addCopies(E e, int i) {
            ObjectCountHashMap<E> objectCountHashMap = this.contents;
            objectCountHashMap.getClass();
            if (i == 0) {
                return this;
            }
            if (this.buildInvoked) {
                this.contents = new ObjectCountHashMap<>(objectCountHashMap);
                this.isLinkedHash = false;
            }
            this.buildInvoked = false;
            e.getClass();
            ObjectCountHashMap<E> objectCountHashMap2 = this.contents;
            objectCountHashMap2.put(e, i + objectCountHashMap2.get(e));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.google.common.collect.ImmutableMultiset.Builder<E> setCount(E r4, int r5) {
            /*
                r3 = this;
                com.google.common.collect.ObjectCountHashMap<E> r0 = r3.contents
                r0.getClass()
                r1 = 0
                if (r5 != 0) goto L19
                boolean r5 = r3.isLinkedHash
                if (r5 != 0) goto L18
                com.google.common.collect.ObjectCountLinkedHashMap r5 = new com.google.common.collect.ObjectCountLinkedHashMap
                r5.<init>(r0)
                r3.contents = r5
                r5 = 1
                r3.isLinkedHash = r5
                r5 = r1
                goto L26
            L18:
                r5 = r1
            L19:
                boolean r2 = r3.buildInvoked
                if (r2 == 0) goto L26
                com.google.common.collect.ObjectCountHashMap r2 = new com.google.common.collect.ObjectCountHashMap
                r2.<init>(r0)
                r3.contents = r2
                r3.isLinkedHash = r1
            L26:
                r3.buildInvoked = r1
                r4.getClass()
                if (r5 != 0) goto L33
                com.google.common.collect.ObjectCountHashMap<E> r5 = r3.contents
                r5.remove(r4)
                return r3
            L33:
                com.google.common.collect.ObjectCountHashMap<E> r0 = r3.contents
                r0.put(r4, r5)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableMultiset.Builder.setCount(java.lang.Object, int):com.google.common.collect.ImmutableMultiset$Builder");
        }

        public Builder() {
            this(4);
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public Builder<E> add(E e) {
            return addCopies(e, 1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableCollection.Builder
        public Builder<E> addAll(Iterable<? extends E> iterable) {
            this.contents.getClass();
            if (!(iterable instanceof Multiset)) {
                super.addAll((Iterable) iterable);
                return this;
            }
            Multiset multiset = (Multiset) iterable;
            ObjectCountHashMap objectCountHashMapTryGetMap = tryGetMap(multiset);
            if (objectCountHashMapTryGetMap != null) {
                ObjectCountHashMap<E> objectCountHashMap = this.contents;
                objectCountHashMap.ensureCapacity(Math.max(objectCountHashMap.size(), objectCountHashMapTryGetMap.size()));
                for (int iFirstIndex = objectCountHashMapTryGetMap.firstIndex(); iFirstIndex >= 0; iFirstIndex = objectCountHashMapTryGetMap.nextIndex(iFirstIndex)) {
                    addCopies(objectCountHashMapTryGetMap.getKey(iFirstIndex), objectCountHashMapTryGetMap.getValue(iFirstIndex));
                }
            } else {
                Set<Multiset.Entry<E>> setEntrySet = multiset.entrySet();
                ObjectCountHashMap<E> objectCountHashMap2 = this.contents;
                objectCountHashMap2.ensureCapacity(Math.max(objectCountHashMap2.size(), setEntrySet.size()));
                for (Multiset.Entry<E> entry : multiset.entrySet()) {
                    addCopies(entry.getElement(), entry.getCount());
                }
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public ImmutableMultiset<E> build() {
            ObjectCountHashMap<E> objectCountHashMap = this.contents;
            objectCountHashMap.getClass();
            if (objectCountHashMap.size() == 0) {
                return ImmutableMultiset.of();
            }
            if (this.isLinkedHash) {
                this.contents = new ObjectCountHashMap<>(this.contents);
                this.isLinkedHash = false;
            }
            this.buildInvoked = true;
            return new RegularImmutableMultiset(this.contents);
        }

        public Builder(int i) {
            this.buildInvoked = false;
            this.isLinkedHash = false;
            this.contents = ObjectCountHashMap.createWithExpectedSize(i);
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public Builder<E> add(E... eArr) {
            super.add((Object[]) eArr);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public Builder<E> addAll(Iterator<? extends E> it) {
            super.addAll((Iterator) it);
            return this;
        }
    }

    /* compiled from: PG */
    final class EntrySet extends IndexedImmutableSet<Multiset.Entry<E>> {
        private static final long serialVersionUID = 0;
        final /* synthetic */ ImmutableMultiset this$0;

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use EntrySetSerializedForm");
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Multiset.Entry) {
                Multiset.Entry entry = (Multiset.Entry) obj;
                if (entry.getCount() > 0 && this.this$0.count(entry.getElement()) == entry.getCount()) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.IndexedImmutableSet
        public Multiset.Entry<E> get(int i) {
            return this.this$0.getEntry(i);
        }

        @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return this.this$0.hashCode();
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return this.this$0.isPartialView();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.this$0.elementSet().size();
        }

        @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return new EntrySetSerializedForm(this.this$0);
        }

        private EntrySet(ImmutableMultiset immutableMultiset) {
            immutableMultiset.getClass();
            this.this$0 = immutableMultiset;
        }
    }

    /* compiled from: PG */
    class EntrySetSerializedForm<E> implements Serializable {
        final ImmutableMultiset<E> multiset;

        public EntrySetSerializedForm(ImmutableMultiset<E> immutableMultiset) {
            this.multiset = immutableMultiset;
        }

        Object readResolve() {
            return this.multiset.entrySet();
        }
    }

    public static <E> Builder<E> builder() {
        return new Builder<>();
    }

    private static <E> ImmutableMultiset<E> copyFromElements(E... eArr) {
        Builder builder = new Builder();
        builder.add((Object[]) eArr);
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E> ImmutableMultiset<E> copyFromEntries(java.util.Collection<? extends Multiset.Entry<? extends E>> collection) {
        Builder builder = new Builder(collection.size());
        for (Multiset.Entry<? extends E> entry : collection) {
            builder.addCopies(entry.getElement(), entry.getCount());
        }
        return builder.build();
    }

    public static <E> ImmutableMultiset<E> copyOf(Iterable<? extends E> iterable) {
        if (iterable instanceof ImmutableMultiset) {
            ImmutableMultiset<E> immutableMultiset = (ImmutableMultiset) iterable;
            if (!immutableMultiset.isPartialView()) {
                return immutableMultiset;
            }
        }
        Builder builder = new Builder(Multisets.inferDistinctElements(iterable));
        builder.addAll((Iterable) iterable);
        return builder.build();
    }

    private ImmutableSet<Multiset.Entry<E>> createEntrySet() {
        return isEmpty() ? ImmutableSet.of() : new EntrySet();
    }

    static /* synthetic */ int lambda$toImmutableMultiset$0(Object obj) {
        return 1;
    }

    public static <E> ImmutableMultiset<E> of() {
        return RegularImmutableMultiset.EMPTY;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E> Collector<E, ?, ImmutableMultiset<E>> toImmutableMultiset() {
        return CollectCollectors.toImmutableMultiset(Function$CC.identity(), new ToIntFunction() { // from class: com.google.common.collect.ImmutableMultiset$$ExternalSyntheticLambda0
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return 1;
            }
        });
    }

    @Override // com.google.common.collect.Multiset
    @Deprecated
    public final int add(E e, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList<E> asList() {
        ImmutableList<E> immutableList = this.asList;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList<E> immutableListAsList = super.asList();
        this.asList = immutableListAsList;
        return immutableListAsList;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return count(obj) > 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int copyIntoArray(Object[] objArr, int i) {
        UnmodifiableIterator<Multiset.Entry<E>> it = entrySet().iterator();
        while (it.hasNext()) {
            Multiset.Entry<E> next = it.next();
            Arrays.fill(objArr, i, next.getCount() + i, next.getElement());
            i += next.getCount();
        }
        return i;
    }

    @Override // com.google.common.collect.Multiset
    public abstract ImmutableSet<E> elementSet();

    @Override // com.google.common.collect.Multiset
    public ImmutableSet<Multiset.Entry<E>> entrySet() {
        ImmutableSet<Multiset.Entry<E>> immutableSet = this.entrySet;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<Multiset.Entry<E>> immutableSetCreateEntrySet = createEntrySet();
        this.entrySet = immutableSetCreateEntrySet;
        return immutableSetCreateEntrySet;
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public boolean equals(Object obj) {
        return Multisets.equalsImpl(this, obj);
    }

    public abstract Multiset.Entry<E> getEntry(int i);

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public int hashCode() {
        return Sets.hashCodeImpl(entrySet());
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public UnmodifiableIterator<E> iterator() {
        final UnmodifiableIterator<Multiset.Entry<E>> it = entrySet().iterator();
        return new UnmodifiableIterator<E>(this) { // from class: com.google.common.collect.ImmutableMultiset.1
            E element;
            int remaining;

            {
                this.getClass();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.remaining > 0 || it.hasNext();
            }

            @Override // java.util.Iterator
            public E next() {
                int count = this.remaining;
                if (count <= 0) {
                    Multiset.Entry entry = (Multiset.Entry) it.next();
                    this.element = (E) entry.getElement();
                    count = entry.getCount();
                }
                this.remaining = count - 1;
                E e = this.element;
                e.getClass();
                return e;
            }
        };
    }

    @Override // com.google.common.collect.Multiset
    @Deprecated
    public final int remove(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Multiset
    @Deprecated
    public final int setCount(E e, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, com.google.common.collect.Multiset
    public String toString() {
        return entrySet().toString();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public abstract Object writeReplace();

    public static <E> ImmutableMultiset<E> of(E e) {
        return copyFromElements(e);
    }

    public static <T, E> Collector<T, ?, ImmutableMultiset<E>> toImmutableMultiset(Function<? super T, ? extends E> function, ToIntFunction<? super T> toIntFunction) {
        return CollectCollectors.toImmutableMultiset(function, toIntFunction);
    }

    @Override // com.google.common.collect.Multiset
    @Deprecated
    public final boolean setCount(E e, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    public static <E> ImmutableMultiset<E> of(E e, E e2) {
        return copyFromElements(e, e2);
    }

    public static <E> ImmutableMultiset<E> of(E e, E e2, E e3) {
        return copyFromElements(e, e2, e3);
    }

    public static <E> ImmutableMultiset<E> of(E e, E e2, E e3, E e4) {
        return copyFromElements(e, e2, e3, e4);
    }

    public static <E> ImmutableMultiset<E> copyOf(Iterator<? extends E> it) {
        Builder builder = new Builder();
        builder.addAll((Iterator) it);
        return builder.build();
    }

    public static <E> ImmutableMultiset<E> of(E e, E e2, E e3, E e4, E e5) {
        return copyFromElements(e, e2, e3, e4, e5);
    }

    public static <E> ImmutableMultiset<E> copyOf(E[] eArr) {
        return copyFromElements(eArr);
    }

    public static <E> ImmutableMultiset<E> of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        return new Builder().add((Builder) e).add((Builder<E>) e2).add((Builder<E>) e3).add((Builder<E>) e4).add((Builder<E>) e5).add((Builder<E>) e6).add((Object[]) eArr).build();
    }
}
