package com.google.common.collect;

import defpackage.a;
import defpackage.sfy;
import defpackage.sij;
import defpackage.trk;
import defpackage.tsl;
import defpackage.tst;
import defpackage.tsv;
import defpackage.tsz;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class Iterators {

    /* compiled from: PG */
    final class ArrayItr<T> extends AbstractIndexedListIterator<T> {
        static final UnmodifiableListIterator<Object> EMPTY = new ArrayItr(new Object[0], 0);
        private final T[] array;

        public ArrayItr(T[] tArr, int i) {
            super(tArr.length, i);
            this.array = tArr;
        }

        @Override // com.google.common.collect.AbstractIndexedListIterator
        protected T get(int i) {
            return this.array[i];
        }
    }

    /* compiled from: PG */
    class ConcatenatedIterator<T> implements Iterator<T> {
        private Iterator<? extends T> iterator = Iterators.emptyIterator();
        private Deque<Iterator<? extends Iterator<? extends T>>> metaIterators;
        private Iterator<? extends T> toRemove;
        private Iterator<? extends Iterator<? extends T>> topMetaIterator;

        public ConcatenatedIterator(Iterator<? extends Iterator<? extends T>> it) {
            it.getClass();
            this.topMetaIterator = it;
        }

        private Iterator<? extends Iterator<? extends T>> getTopMetaIterator() {
            while (true) {
                Iterator<? extends Iterator<? extends T>> it = this.topMetaIterator;
                if (it != null && it.hasNext()) {
                    return this.topMetaIterator;
                }
                Deque<Iterator<? extends Iterator<? extends T>>> deque = this.metaIterators;
                if (deque == null || deque.isEmpty()) {
                    return null;
                }
                this.topMetaIterator = this.metaIterators.removeFirst();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (true) {
                Iterator<? extends T> it = this.iterator;
                it.getClass();
                if (it.hasNext()) {
                    return true;
                }
                Iterator<? extends Iterator<? extends T>> topMetaIterator = getTopMetaIterator();
                this.topMetaIterator = topMetaIterator;
                if (topMetaIterator == null) {
                    return false;
                }
                Iterator<? extends T> next = topMetaIterator.next();
                this.iterator = next;
                if (next instanceof ConcatenatedIterator) {
                    ConcatenatedIterator concatenatedIterator = (ConcatenatedIterator) next;
                    this.iterator = concatenatedIterator.iterator;
                    if (this.metaIterators == null) {
                        this.metaIterators = new ArrayDeque();
                    }
                    this.metaIterators.addFirst(this.topMetaIterator);
                    if (concatenatedIterator.metaIterators != null) {
                        while (!concatenatedIterator.metaIterators.isEmpty()) {
                            this.metaIterators.addFirst(concatenatedIterator.metaIterators.removeLast());
                        }
                    }
                    this.topMetaIterator = concatenatedIterator.topMetaIterator;
                }
            }
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Iterator<? extends T> it = this.iterator;
            this.toRemove = it;
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            Iterator<? extends T> it = this.toRemove;
            if (it == null) {
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            }
            it.remove();
            this.toRemove = null;
        }
    }

    /* compiled from: PG */
    enum EmptyModifiableIterator implements Iterator<Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            CollectPreconditions.checkRemove(false);
        }
    }

    /* compiled from: PG */
    class MergingIterator<T> extends UnmodifiableIterator<T> {
        final Queue<PeekingIterator<T>> queue;

        public MergingIterator(Iterable<? extends Iterator<? extends T>> iterable, final Comparator<? super T> comparator) {
            this.queue = new PriorityQueue(2, new Comparator() { // from class: com.google.common.collect.Iterators$MergingIterator$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return comparator.compare(((PeekingIterator) obj).peek(), ((PeekingIterator) obj2).peek());
                }
            });
            for (Iterator<? extends T> it : iterable) {
                if (it.hasNext()) {
                    this.queue.add(Iterators.peekingIterator(it));
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.queue.isEmpty();
        }

        @Override // java.util.Iterator
        public T next() {
            PeekingIterator<T> peekingIteratorRemove = this.queue.remove();
            T next = peekingIteratorRemove.next();
            if (peekingIteratorRemove.hasNext()) {
                this.queue.add(peekingIteratorRemove);
            }
            return next;
        }
    }

    /* compiled from: PG */
    class PeekingImpl<E> implements PeekingIterator<E> {
        private boolean hasPeeked;
        private final Iterator<? extends E> iterator;
        private E peekedElement;

        public PeekingImpl(Iterator<? extends E> it) {
            it.getClass();
            this.iterator = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.hasPeeked || this.iterator.hasNext();
        }

        @Override // com.google.common.collect.PeekingIterator, java.util.Iterator
        public E next() {
            if (!this.hasPeeked) {
                return this.iterator.next();
            }
            E e = this.peekedElement;
            this.hasPeeked = false;
            this.peekedElement = null;
            return e;
        }

        @Override // com.google.common.collect.PeekingIterator
        public E peek() {
            if (!this.hasPeeked) {
                this.peekedElement = this.iterator.next();
                this.hasPeeked = true;
            }
            return this.peekedElement;
        }

        @Override // com.google.common.collect.PeekingIterator, java.util.Iterator
        public void remove() {
            sij.x(!this.hasPeeked, "Can't remove after you've peeked at next");
            this.iterator.remove();
        }
    }

    /* compiled from: PG */
    final class SingletonIterator<T> extends UnmodifiableIterator<T> {
        private boolean done;
        private final T value;

        public SingletonIterator(T t) {
            this.value = t;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.done;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.done) {
                throw new NoSuchElementException();
            }
            this.done = true;
            return this.value;
        }
    }

    private Iterators() {
    }

    public static <T> boolean addAll(Collection<T> collection, Iterator<? extends T> it) {
        collection.getClass();
        it.getClass();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static int advance(Iterator<?> it, int i) {
        it.getClass();
        int i2 = 0;
        sij.o(i >= 0, "numberToAdvance must be nonnegative");
        while (i2 < i && it.hasNext()) {
            it.next();
            i2++;
        }
        return i2;
    }

    public static <T> boolean all(Iterator<T> it, tsv<? super T> tsvVar) {
        tsvVar.getClass();
        while (it.hasNext()) {
            if (!tsvVar.apply(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean any(Iterator<T> it, tsv<? super T> tsvVar) {
        return indexOf(it, tsvVar) != -1;
    }

    public static <T> Enumeration<T> asEnumeration(final Iterator<T> it) {
        it.getClass();
        return new Enumeration() { // from class: com.google.common.collect.Iterators.10
            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return it.hasNext();
            }

            @Override // java.util.Enumeration
            public Object nextElement() {
                return it.next();
            }
        };
    }

    static void checkNonnegative(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(a.cd(i, "position (", ") must not be negative"));
        }
    }

    static void clear(Iterator<?> it) {
        it.getClass();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static <T> Iterator<T> concat(Iterator<? extends Iterator<? extends T>> it) {
        return new ConcatenatedIterator(it);
    }

    static <T> Iterator<T> concatNoDefensiveCopy(Iterator<? extends T>... itArr) {
        itArr.getClass();
        for (Iterator<? extends T> it : itArr) {
            it.getClass();
        }
        return concat(consumingForArray(itArr));
    }

    private static <I extends Iterator> Iterator<I> consumingForArray(final I... iArr) {
        return new UnmodifiableIterator() { // from class: com.google.common.collect.Iterators.3
            int index = 0;

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < iArr.length;
            }

            @Override // java.util.Iterator
            public Iterator next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Iterator[] itArr = iArr;
                int i = this.index;
                Iterator it = itArr[i];
                it.getClass();
                itArr[i] = null;
                this.index = i + 1;
                return it;
            }
        };
    }

    public static <T> Iterator<T> consumingIterator(final Iterator<T> it) {
        it.getClass();
        return new UnmodifiableIterator() { // from class: com.google.common.collect.Iterators.8
            @Override // java.util.Iterator
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                Iterator it2 = it;
                Object next = it2.next();
                it2.remove();
                return next;
            }

            public String toString() {
                return "Iterators.consumingIterator(...)";
            }
        };
    }

    public static boolean contains(Iterator<?> it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static <T> Iterator<T> cycle(final Iterable<T> iterable) {
        iterable.getClass();
        return new Iterator() { // from class: com.google.common.collect.Iterators.2
            Iterator iterator = Iterators.emptyModifiableIterator();

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.iterator.hasNext() || iterable.iterator().hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                if (!this.iterator.hasNext()) {
                    Iterator it = iterable.iterator();
                    this.iterator = it;
                    if (!it.hasNext()) {
                        throw new NoSuchElementException();
                    }
                }
                return this.iterator.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.iterator.remove();
            }
        };
    }

    public static boolean elementsEqual(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !a.Q(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    static <T> UnmodifiableIterator<T> emptyIterator() {
        return emptyListIterator();
    }

    static <T> UnmodifiableListIterator<T> emptyListIterator() {
        return (UnmodifiableListIterator<T>) ArrayItr.EMPTY;
    }

    static <T> Iterator<T> emptyModifiableIterator() {
        return EmptyModifiableIterator.INSTANCE;
    }

    public static <T> UnmodifiableIterator<T> filter(final Iterator<T> it, final tsv<? super T> tsvVar) {
        it.getClass();
        tsvVar.getClass();
        return new AbstractIterator() { // from class: com.google.common.collect.Iterators.5
            @Override // com.google.common.collect.AbstractIterator
            protected Object computeNext() {
                while (it.hasNext()) {
                    Iterator it2 = it;
                    tsv tsvVar2 = tsvVar;
                    Object next = it2.next();
                    if (tsvVar2.apply(next)) {
                        return next;
                    }
                }
                endOfData();
                return null;
            }
        };
    }

    public static <T> T find(Iterator<T> it, tsv<? super T> tsvVar) {
        it.getClass();
        tsvVar.getClass();
        while (it.hasNext()) {
            T next = it.next();
            if (tsvVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @SafeVarargs
    public static <T> UnmodifiableIterator<T> forArray(T... tArr) {
        return forArrayWithPosition(tArr, 0);
    }

    static <T> UnmodifiableListIterator<T> forArrayWithPosition(T[] tArr, int i) {
        if (tArr.length != 0) {
            return new ArrayItr(tArr, i);
        }
        sij.C(i, 0);
        return emptyListIterator();
    }

    public static <T> UnmodifiableIterator<T> forEnumeration(final Enumeration<T> enumeration) {
        enumeration.getClass();
        return new UnmodifiableIterator() { // from class: com.google.common.collect.Iterators.9
            @Override // java.util.Iterator
            public boolean hasNext() {
                return enumeration.hasMoreElements();
            }

            @Override // java.util.Iterator
            public Object next() {
                return enumeration.nextElement();
            }
        };
    }

    public static int frequency(Iterator<?> it, Object obj) {
        int i = 0;
        while (contains(it, obj)) {
            i++;
        }
        return i;
    }

    public static <T> T get(Iterator<T> it, int i) {
        checkNonnegative(i);
        int iAdvance = advance(it, i);
        if (it.hasNext()) {
            return it.next();
        }
        throw new IndexOutOfBoundsException(a.cn(iAdvance, i, "position (", ") must be less than the number of elements that remained (", ")"));
    }

    public static <T> T getLast(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static <T> T getNext(Iterator<? extends T> it, T t) {
        return it.hasNext() ? it.next() : t;
    }

    public static <T> T getOnlyElement(Iterator<T> it) {
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder("expected one element but was: <");
        sb.append(next);
        for (int i = 0; i < 4 && it.hasNext(); i++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    public static <T> int indexOf(Iterator<T> it, tsv<? super T> tsvVar) {
        tsvVar.getClass();
        int i = 0;
        while (it.hasNext()) {
            if (tsvVar.apply(it.next())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static <T> Iterator<T> limit(final Iterator<T> it, final int i) {
        it.getClass();
        sij.o(i >= 0, "limit is negative");
        return new Iterator() { // from class: com.google.common.collect.Iterators.7
            private int count;

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.count < i && it.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.count++;
                return it.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                it.remove();
            }
        };
    }

    public static <T> UnmodifiableIterator<T> mergeSorted(Iterable<? extends Iterator<? extends T>> iterable, Comparator<? super T> comparator) {
        iterable.getClass();
        comparator.getClass();
        return new MergingIterator(iterable, comparator);
    }

    public static <T> UnmodifiableIterator<List<T>> paddedPartition(Iterator<T> it, int i) {
        return partitionImpl(it, i, true);
    }

    public static <T> UnmodifiableIterator<List<T>> partition(Iterator<T> it, int i) {
        return partitionImpl(it, i, false);
    }

    private static <T> UnmodifiableIterator<List<T>> partitionImpl(final Iterator<T> it, final int i, final boolean z) {
        it.getClass();
        a.H(i > 0);
        return new UnmodifiableIterator<List>() { // from class: com.google.common.collect.Iterators.4
            @Override // java.util.Iterator
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            public List next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = new Object[i];
                int i2 = 0;
                while (i2 < i && it.hasNext()) {
                    objArr[i2] = it.next();
                    i2++;
                }
                for (int i3 = i2; i3 < i; i3++) {
                    objArr[i3] = null;
                }
                List listUnmodifiableList = DesugarCollections.unmodifiableList(Arrays.asList(objArr));
                return (z || i2 == i) ? listUnmodifiableList : listUnmodifiableList.subList(0, i2);
            }
        };
    }

    @Deprecated
    public static <T> PeekingIterator<T> peekingIterator(PeekingIterator<T> peekingIterator) {
        peekingIterator.getClass();
        return peekingIterator;
    }

    static <T> T pollNext(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    public static boolean removeAll(Iterator<?> it, Collection<?> collection) {
        collection.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static <T> boolean removeIf(Iterator<T> it, tsv<? super T> tsvVar) {
        tsvVar.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (tsvVar.apply(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static boolean retainAll(Iterator<?> it, Collection<?> collection) {
        collection.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static <T> UnmodifiableIterator<T> singletonIterator(T t) {
        return new SingletonIterator(t);
    }

    public static int size(Iterator<?> it) {
        long j = 0;
        while (it.hasNext()) {
            it.next();
            j++;
        }
        return sfy.ab(j);
    }

    public static <T> T[] toArray(Iterator<? extends T> it, Class<T> cls) {
        return (T[]) Iterables.toArray(Lists.newArrayList(it), cls);
    }

    public static String toString(Iterator<?> it) {
        StringBuilder sb = new StringBuilder("[");
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(it.next());
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }

    public static <F, T> Iterator<T> transform(Iterator<F> it, final tsl<? super F, ? extends T> tslVar) {
        tslVar.getClass();
        return new TransformedIterator(it) { // from class: com.google.common.collect.Iterators.6
            @Override // com.google.common.collect.TransformedIterator
            public Object transform(Object obj) {
                return tslVar.apply(obj);
            }
        };
    }

    public static <T> tst<T> tryFind(Iterator<T> it, tsv<? super T> tsvVar) {
        it.getClass();
        tsvVar.getClass();
        while (it.hasNext()) {
            T next = it.next();
            if (tsvVar.apply(next)) {
                return tst.i(next);
            }
        }
        return trk.a;
    }

    @Deprecated
    public static <T> UnmodifiableIterator<T> unmodifiableIterator(UnmodifiableIterator<T> unmodifiableIterator) {
        unmodifiableIterator.getClass();
        return unmodifiableIterator;
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> it, Iterator<? extends T> it2) {
        it.getClass();
        it2.getClass();
        return concat(consumingForArray(it, it2));
    }

    public static <T> PeekingIterator<T> peekingIterator(Iterator<? extends T> it) {
        return it instanceof PeekingImpl ? (PeekingImpl) it : new PeekingImpl(it);
    }

    public static <T> UnmodifiableIterator<T> unmodifiableIterator(final Iterator<? extends T> it) {
        it.getClass();
        return it instanceof UnmodifiableIterator ? (UnmodifiableIterator) it : new UnmodifiableIterator() { // from class: com.google.common.collect.Iterators.1
            @Override // java.util.Iterator
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                return it.next();
            }
        };
    }

    @SafeVarargs
    public static <T> Iterator<T> cycle(T... tArr) {
        return cycle(Lists.newArrayList(tArr));
    }

    public static <T> T getLast(Iterator<? extends T> it, T t) {
        return it.hasNext() ? (T) getLast(it) : t;
    }

    public static <T> UnmodifiableIterator<T> filter(Iterator it, Class<T> cls) {
        return filter(it, new tsz(cls));
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> it, Iterator<? extends T> it2, Iterator<? extends T> it3) {
        it.getClass();
        it2.getClass();
        it3.getClass();
        return concat(consumingForArray(it, it2, it3));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    public static <T> T find(Iterator<? extends T> it, tsv<? super T> tsvVar, T t) {
        it.getClass();
        tsvVar.getClass();
        while (it.hasNext()) {
            T next = it.next();
            if (tsvVar.apply(next)) {
                return next;
            }
        }
        return t;
    }

    public static <T> T get(Iterator<? extends T> it, int i, T t) {
        checkNonnegative(i);
        advance(it, i);
        return (T) getNext(it, t);
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> it, Iterator<? extends T> it2, Iterator<? extends T> it3, Iterator<? extends T> it4) {
        it.getClass();
        it2.getClass();
        it3.getClass();
        it4.getClass();
        return concat(consumingForArray(it, it2, it3, it4));
    }

    public static <T> T getOnlyElement(Iterator<? extends T> it, T t) {
        return it.hasNext() ? (T) getOnlyElement(it) : t;
    }

    @SafeVarargs
    public static <T> Iterator<T> concat(Iterator<? extends T>... itArr) {
        return concatNoDefensiveCopy((Iterator[]) Arrays.copyOf(itArr, itArr.length));
    }
}
