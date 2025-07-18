package com.google.common.collect;

import defpackage.a;
import defpackage.sij;
import defpackage.tsl;
import defpackage.tst;
import defpackage.tsv;
import defpackage.tsz;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class Iterables {

    /* compiled from: PG */
    final class UnmodifiableIterable<T> extends FluentIterable<T> {
        private final Iterable<? extends T> iterable;

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return Iterators.unmodifiableIterator(this.iterable.iterator());
        }

        @Override // com.google.common.collect.FluentIterable
        public String toString() {
            return this.iterable.toString();
        }

        private UnmodifiableIterable(Iterable<? extends T> iterable) {
            this.iterable = iterable;
        }
    }

    private Iterables() {
    }

    public static <T> boolean addAll(Collection<T> collection, Iterable<? extends T> iterable) {
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        iterable.getClass();
        return Iterators.addAll(collection, iterable.iterator());
    }

    public static <T> boolean all(Iterable<T> iterable, tsv<? super T> tsvVar) {
        return Iterators.all(iterable.iterator(), tsvVar);
    }

    public static <T> boolean any(Iterable<T> iterable, tsv<? super T> tsvVar) {
        return Iterators.any(iterable.iterator(), tsvVar);
    }

    private static <E> Collection<E> castOrCopyToCollection(Iterable<E> iterable) {
        return iterable instanceof Collection ? (Collection) iterable : Lists.newArrayList(iterable.iterator());
    }

    public static <T> Iterable<T> concat(Iterable<? extends Iterable<? extends T>> iterable) {
        return FluentIterable.concat(iterable);
    }

    public static <T> Iterable<T> consumingIterable(final Iterable<T> iterable) {
        iterable.getClass();
        return new FluentIterable() { // from class: com.google.common.collect.Iterables.8
            @Override // java.lang.Iterable
            public Iterator iterator() {
                Iterable iterable2 = iterable;
                return iterable2 instanceof Queue ? new ConsumingQueueIterator((Queue) iterable2) : Iterators.consumingIterator(iterable2.iterator());
            }

            @Override // com.google.common.collect.FluentIterable
            public String toString() {
                return "Iterables.consumingIterable(...)";
            }
        };
    }

    public static boolean contains(Iterable<?> iterable, Object obj) {
        return iterable instanceof Collection ? Collections2.safeContains((Collection) iterable, obj) : Iterators.contains(iterable.iterator(), obj);
    }

    public static <T> Iterable<T> cycle(final Iterable<T> iterable) {
        iterable.getClass();
        return new FluentIterable() { // from class: com.google.common.collect.Iterables.1
            @Override // java.lang.Iterable
            public Iterator iterator() {
                return Iterators.cycle(iterable);
            }

            @Override // com.google.common.collect.FluentIterable
            public String toString() {
                return String.valueOf(iterable.toString()).concat(" (cycled)");
            }
        };
    }

    public static boolean elementsEqual(Iterable<?> iterable, Iterable<?> iterable2) {
        if ((iterable instanceof Collection) && (iterable2 instanceof Collection) && ((Collection) iterable).size() != ((Collection) iterable2).size()) {
            return false;
        }
        return Iterators.elementsEqual(iterable.iterator(), iterable2.iterator());
    }

    public static <T> Iterable<T> filter(final Iterable<T> iterable, final tsv<? super T> tsvVar) {
        iterable.getClass();
        tsvVar.getClass();
        return new FluentIterable() { // from class: com.google.common.collect.Iterables.4
            @Override // java.lang.Iterable
            public Iterator iterator() {
                return Iterators.filter(iterable.iterator(), tsvVar);
            }
        };
    }

    public static <T> T find(Iterable<T> iterable, tsv<? super T> tsvVar) {
        return (T) Iterators.find(iterable.iterator(), tsvVar);
    }

    public static int frequency(Iterable<?> iterable, Object obj) {
        return iterable instanceof Multiset ? ((Multiset) iterable).count(obj) : iterable instanceof Set ? ((Set) iterable).contains(obj) ? 1 : 0 : Iterators.frequency(iterable.iterator(), obj);
    }

    public static <T> T get(Iterable<T> iterable, int i) {
        iterable.getClass();
        return iterable instanceof List ? (T) ((List) iterable).get(i) : (T) Iterators.get(iterable.iterator(), i);
    }

    public static <T> T getFirst(Iterable<? extends T> iterable, T t) {
        return (T) Iterators.getNext(iterable.iterator(), t);
    }

    public static <T> T getLast(Iterable<T> iterable) {
        if (!(iterable instanceof List)) {
            return (T) Iterators.getLast(iterable.iterator());
        }
        List list = (List) iterable;
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return (T) getLastInNonemptyList(list);
    }

    private static <T> T getLastInNonemptyList(List<T> list) {
        return list.get(list.size() - 1);
    }

    public static <T> T getOnlyElement(Iterable<T> iterable) {
        return (T) Iterators.getOnlyElement(iterable.iterator());
    }

    public static <T> int indexOf(Iterable<T> iterable, tsv<? super T> tsvVar) {
        return Iterators.indexOf(iterable.iterator(), tsvVar);
    }

    public static boolean isEmpty(Iterable<?> iterable) {
        return iterable instanceof Collection ? ((Collection) iterable).isEmpty() : !iterable.iterator().hasNext();
    }

    public static <T> Iterable<T> limit(final Iterable<T> iterable, final int i) {
        iterable.getClass();
        sij.o(i >= 0, "limit is negative");
        return new FluentIterable() { // from class: com.google.common.collect.Iterables.7
            @Override // java.lang.Iterable
            public Iterator iterator() {
                return Iterators.limit(iterable.iterator(), i);
            }
        };
    }

    public static <T> Iterable<T> mergeSorted(final Iterable<? extends Iterable<? extends T>> iterable, final Comparator<? super T> comparator) {
        iterable.getClass();
        comparator.getClass();
        return new UnmodifiableIterable(new FluentIterable() { // from class: com.google.common.collect.Iterables.9
            @Override // java.lang.Iterable
            public Iterator iterator() {
                return Iterators.mergeSorted(Iterables.transform(iterable, new tsl() { // from class: com.google.common.collect.Iterables$9$$ExternalSyntheticLambda0
                    @Override // defpackage.tsl
                    public final Object apply(Object obj) {
                        return ((Iterable) obj).iterator();
                    }
                }), comparator);
            }
        });
    }

    public static <T> Iterable<List<T>> paddedPartition(final Iterable<T> iterable, final int i) {
        iterable.getClass();
        a.H(i > 0);
        return new FluentIterable<List>() { // from class: com.google.common.collect.Iterables.3
            @Override // java.lang.Iterable
            public Iterator<List> iterator() {
                return Iterators.paddedPartition(iterable.iterator(), i);
            }
        };
    }

    public static <T> Iterable<List<T>> partition(final Iterable<T> iterable, final int i) {
        iterable.getClass();
        a.H(i > 0);
        return new FluentIterable<List>() { // from class: com.google.common.collect.Iterables.2
            @Override // java.lang.Iterable
            public Iterator<List> iterator() {
                return Iterators.partition(iterable.iterator(), i);
            }
        };
    }

    public static boolean removeAll(Iterable<?> iterable, Collection<?> collection) {
        if (!(iterable instanceof Collection)) {
            return Iterators.removeAll(iterable.iterator(), collection);
        }
        collection.getClass();
        return ((Collection) iterable).removeAll(collection);
    }

    static <T> T removeFirstMatching(Iterable<T> iterable, tsv<? super T> tsvVar) {
        tsvVar.getClass();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            T next = it.next();
            if (tsvVar.apply(next)) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    public static <T> boolean removeIf(Iterable<T> iterable, tsv<? super T> tsvVar) {
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            return Iterators.removeIf(iterable.iterator(), tsvVar);
        }
        tsvVar.getClass();
        return removeIfFromRandomAccessList((List) iterable, tsvVar);
    }

    private static <T> boolean removeIfFromRandomAccessList(List<T> list, tsv<? super T> tsvVar) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            T t = list.get(i);
            if (!tsvVar.apply(t)) {
                if (i > i2) {
                    try {
                        list.set(i2, t);
                    } catch (IllegalArgumentException unused) {
                        slowRemoveIfForRemainingElements(list, tsvVar, i2, i);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        slowRemoveIfForRemainingElements(list, tsvVar, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        return i != i2;
    }

    public static boolean retainAll(Iterable<?> iterable, Collection<?> collection) {
        if (!(iterable instanceof Collection)) {
            return Iterators.retainAll(iterable.iterator(), collection);
        }
        collection.getClass();
        return ((Collection) iterable).retainAll(collection);
    }

    public static int size(Iterable<?> iterable) {
        return iterable instanceof Collection ? ((Collection) iterable).size() : Iterators.size(iterable.iterator());
    }

    public static <T> Iterable<T> skip(final Iterable<T> iterable, final int i) {
        iterable.getClass();
        sij.o(i >= 0, "number to skip cannot be negative");
        return new FluentIterable() { // from class: com.google.common.collect.Iterables.6
            @Override // java.lang.Iterable
            public Iterator iterator() {
                Iterable iterable2 = iterable;
                if (iterable2 instanceof List) {
                    List list = (List) iterable2;
                    return list.subList(Math.min(list.size(), i), list.size()).iterator();
                }
                int i2 = i;
                final Iterator it = iterable2.iterator();
                Iterators.advance(it, i2);
                return new Iterator(this) { // from class: com.google.common.collect.Iterables.6.1
                    boolean atStart;

                    {
                        this.getClass();
                        this.atStart = true;
                    }

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return it.hasNext();
                    }

                    @Override // java.util.Iterator
                    public Object next() {
                        Object next = it.next();
                        this.atStart = false;
                        return next;
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                        CollectPreconditions.checkRemove(!this.atStart);
                        it.remove();
                    }
                };
            }
        };
    }

    private static <T> void slowRemoveIfForRemainingElements(List<T> list, tsv<? super T> tsvVar, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (tsvVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            } else {
                list.remove(i2);
            }
        }
    }

    static Object[] toArray(Iterable<?> iterable) {
        return castOrCopyToCollection(iterable).toArray();
    }

    public static String toString(Iterable<?> iterable) {
        return Iterators.toString(iterable.iterator());
    }

    public static <F, T> Iterable<T> transform(final Iterable<F> iterable, final tsl<? super F, ? extends T> tslVar) {
        iterable.getClass();
        tslVar.getClass();
        return new FluentIterable() { // from class: com.google.common.collect.Iterables.5
            @Override // java.lang.Iterable
            public Iterator iterator() {
                return Iterators.transform(iterable.iterator(), tslVar);
            }
        };
    }

    public static <T> tst<T> tryFind(Iterable<T> iterable, tsv<? super T> tsvVar) {
        return Iterators.tryFind(iterable.iterator(), tsvVar);
    }

    @Deprecated
    public static <E> Iterable<E> unmodifiableIterable(ImmutableCollection<E> immutableCollection) {
        immutableCollection.getClass();
        return immutableCollection;
    }

    public static <T> Iterable<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return FluentIterable.concat(iterable, iterable2);
    }

    @SafeVarargs
    public static <T> Iterable<T> cycle(T... tArr) {
        return cycle(Lists.newArrayList(tArr));
    }

    public static <T> T find(Iterable<? extends T> iterable, tsv<? super T> tsvVar, T t) {
        return (T) Iterators.find(iterable.iterator(), tsvVar, t);
    }

    public static <T> T getOnlyElement(Iterable<? extends T> iterable, T t) {
        return (T) Iterators.getOnlyElement(iterable.iterator(), t);
    }

    public static <T> T[] toArray(Iterable<? extends T> iterable, Class<T> cls) {
        return (T[]) toArray(iterable, ObjectArrays.newArray(cls, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Iterable<T> unmodifiableIterable(Iterable<? extends T> iterable) {
        iterable.getClass();
        return ((iterable instanceof UnmodifiableIterable) || (iterable instanceof ImmutableCollection)) ? iterable : new UnmodifiableIterable(iterable);
    }

    public static <T> Iterable<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3) {
        return FluentIterable.concat(iterable, iterable2, iterable3);
    }

    public static <T> Iterable<T> filter(Iterable iterable, Class<T> cls) {
        iterable.getClass();
        cls.getClass();
        return filter(iterable, new tsz(cls));
    }

    static <T> T[] toArray(Iterable<? extends T> iterable, T[] tArr) {
        return (T[]) castOrCopyToCollection(iterable).toArray(tArr);
    }

    public static <T> Iterable<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3, Iterable<? extends T> iterable4) {
        return FluentIterable.concat(iterable, iterable2, iterable3, iterable4);
    }

    @SafeVarargs
    public static <T> Iterable<T> concat(Iterable<? extends T>... iterableArr) {
        return FluentIterable.concat(iterableArr);
    }

    public static <T> T get(Iterable<? extends T> iterable, int i, T t) {
        iterable.getClass();
        Iterators.checkNonnegative(i);
        if (iterable instanceof List) {
            List list = (List) iterable;
            return i < list.size() ? (T) list.get(i) : t;
        }
        Iterator<? extends T> it = iterable.iterator();
        Iterators.advance(it, i);
        return (T) Iterators.getNext(it, t);
    }

    public static <T> T getLast(Iterable<? extends T> iterable, T t) {
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return t;
            }
            if (iterable instanceof List) {
                return (T) getLastInNonemptyList((List) iterable);
            }
        }
        return (T) Iterators.getLast(iterable.iterator(), t);
    }
}
