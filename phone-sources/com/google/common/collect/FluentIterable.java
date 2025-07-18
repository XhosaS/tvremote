package com.google.common.collect;

import defpackage.trk;
import defpackage.tsl;
import defpackage.tsp;
import defpackage.tst;
import defpackage.tsv;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class FluentIterable<E> implements Iterable<E> {
    private final tst<Iterable<E>> iterableDelegate;

    /* compiled from: PG */
    class FromIterableFunction<E> implements tsl<Iterable<E>, FluentIterable<E>> {
        private FromIterableFunction() {
        }

        @Override // defpackage.tsl
        public FluentIterable<E> apply(Iterable<E> iterable) {
            return FluentIterable.from(iterable);
        }
    }

    protected FluentIterable() {
        this.iterableDelegate = trk.a;
    }

    public static <T> FluentIterable<T> concat(final Iterable<? extends Iterable<? extends T>> iterable) {
        iterable.getClass();
        return new FluentIterable() { // from class: com.google.common.collect.FluentIterable.2
            @Override // java.lang.Iterable
            public Iterator iterator() {
                return Iterators.concat(Iterators.transform(iterable.iterator(), new tsl() { // from class: com.google.common.collect.FluentIterable$2$$ExternalSyntheticLambda0
                    @Override // defpackage.tsl
                    public final Object apply(Object obj) {
                        return ((Iterable) obj).iterator();
                    }
                }));
            }
        };
    }

    private static <T> FluentIterable<T> concatNoDefensiveCopy(final Iterable<? extends T>... iterableArr) {
        for (Iterable<? extends T> iterable : iterableArr) {
            iterable.getClass();
        }
        return new FluentIterable() { // from class: com.google.common.collect.FluentIterable.3
            @Override // java.lang.Iterable
            public Iterator iterator() {
                final Iterable[] iterableArr2 = iterableArr;
                return Iterators.concat(new AbstractIndexedListIterator<Iterator>(this, iterableArr2.length) { // from class: com.google.common.collect.FluentIterable.3.1
                    {
                        this.getClass();
                    }

                    @Override // com.google.common.collect.AbstractIndexedListIterator
                    public Iterator get(int i) {
                        return iterableArr2[i].iterator();
                    }
                });
            }
        };
    }

    @Deprecated
    public static <E> FluentIterable<E> from(FluentIterable<E> fluentIterable) {
        fluentIterable.getClass();
        return fluentIterable;
    }

    private Iterable<E> getDelegate() {
        return (Iterable) this.iterableDelegate.e(this);
    }

    public static <E> FluentIterable<E> of() {
        return from(Collections.EMPTY_LIST);
    }

    public final boolean allMatch(tsv<? super E> tsvVar) {
        return Iterables.all(getDelegate(), tsvVar);
    }

    public final boolean anyMatch(tsv<? super E> tsvVar) {
        return Iterables.any(getDelegate(), tsvVar);
    }

    public final FluentIterable<E> append(Iterable<? extends E> iterable) {
        return concat(getDelegate(), iterable);
    }

    public final boolean contains(Object obj) {
        return Iterables.contains(getDelegate(), obj);
    }

    public final <C extends Collection<? super E>> C copyInto(C c) {
        c.getClass();
        Iterable<E> delegate = getDelegate();
        if (delegate instanceof Collection) {
            c.addAll((Collection) delegate);
            return c;
        }
        Iterator<E> it = delegate.iterator();
        while (it.hasNext()) {
            c.add(it.next());
        }
        return c;
    }

    public final FluentIterable<E> cycle() {
        return from(Iterables.cycle(getDelegate()));
    }

    public final FluentIterable<E> filter(tsv<? super E> tsvVar) {
        return from(Iterables.filter(getDelegate(), tsvVar));
    }

    public final tst<E> first() {
        Iterator<E> it = getDelegate().iterator();
        return it.hasNext() ? tst.i(it.next()) : trk.a;
    }

    public final tst<E> firstMatch(tsv<? super E> tsvVar) {
        return Iterables.tryFind(getDelegate(), tsvVar);
    }

    public final E get(int i) {
        return (E) Iterables.get(getDelegate(), i);
    }

    public final E getOnlyElement() {
        return (E) Iterables.getOnlyElement(getDelegate());
    }

    public final <K> ImmutableListMultimap<K, E> index(tsl<? super E, K> tslVar) {
        return Multimaps.index(getDelegate(), tslVar);
    }

    public final boolean isEmpty() {
        return !getDelegate().iterator().hasNext();
    }

    public final String join(tsp tspVar) {
        return tspVar.b(this);
    }

    public final tst<E> last() {
        E next;
        Iterable<E> delegate = getDelegate();
        if (delegate instanceof List) {
            List list = (List) delegate;
            if (!list.isEmpty()) {
                return tst.i(list.get(list.size() - 1));
            }
        } else {
            Iterator<E> it = delegate.iterator();
            if (it.hasNext()) {
                if (delegate instanceof SortedSet) {
                    return tst.i(((SortedSet) delegate).last());
                }
                do {
                    next = it.next();
                } while (it.hasNext());
                return tst.i(next);
            }
        }
        return trk.a;
    }

    public final FluentIterable<E> limit(int i) {
        return from(Iterables.limit(getDelegate(), i));
    }

    public final FluentIterable<FluentIterable<E>> partition(int i) {
        return from(Iterables.partition(getDelegate(), i)).transform(new FromIterableFunction());
    }

    public final FluentIterable<FluentIterable<E>> partitionWithPadding(int i) {
        return from(Iterables.paddedPartition(getDelegate(), i)).transform(new FromIterableFunction());
    }

    public final int size() {
        return Iterables.size(getDelegate());
    }

    public final FluentIterable<E> skip(int i) {
        return from(Iterables.skip(getDelegate(), i));
    }

    public final E[] toArray(Class<E> cls) {
        return (E[]) Iterables.toArray(getDelegate(), cls);
    }

    public final ImmutableList<E> toList() {
        return ImmutableList.copyOf(getDelegate());
    }

    public final <V> ImmutableMap<E, V> toMap(tsl<? super E, V> tslVar) {
        return Maps.toMap(getDelegate(), tslVar);
    }

    public final ImmutableMultiset<E> toMultiset() {
        return ImmutableMultiset.copyOf(getDelegate());
    }

    public final ImmutableSet<E> toSet() {
        return ImmutableSet.copyOf(getDelegate());
    }

    public final ImmutableList<E> toSortedList(Comparator<? super E> comparator) {
        return Ordering.from(comparator).immutableSortedCopy(getDelegate());
    }

    public final ImmutableSortedSet<E> toSortedSet(Comparator<? super E> comparator) {
        return ImmutableSortedSet.copyOf(comparator, getDelegate());
    }

    public String toString() {
        return Iterables.toString(getDelegate());
    }

    public final <T> FluentIterable<T> transform(tsl<? super E, T> tslVar) {
        return from(Iterables.transform(getDelegate(), tslVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> FluentIterable<T> transformAndConcat(tsl<? super E, ? extends Iterable<? extends T>> tslVar) {
        return concat(transform(tslVar));
    }

    public final <K> ImmutableMap<K, E> uniqueIndex(tsl<? super E, K> tslVar) {
        return Maps.uniqueIndex(getDelegate(), tslVar);
    }

    public FluentIterable(Iterable<E> iterable) {
        this.iterableDelegate = tst.i(iterable);
    }

    public static <T> FluentIterable<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return concatNoDefensiveCopy(iterable, iterable2);
    }

    public static <E> FluentIterable<E> from(final Iterable<E> iterable) {
        return iterable instanceof FluentIterable ? (FluentIterable) iterable : new FluentIterable<E>(iterable) { // from class: com.google.common.collect.FluentIterable.1
            @Override // java.lang.Iterable
            public Iterator<E> iterator() {
                return iterable.iterator();
            }
        };
    }

    public static <E> FluentIterable<E> of(E e, E... eArr) {
        return from(Lists.asList(e, eArr));
    }

    public final FluentIterable<E> append(E... eArr) {
        return concat(getDelegate(), Arrays.asList(eArr));
    }

    public final <T> FluentIterable<T> filter(Class<T> cls) {
        return from(Iterables.filter(getDelegate(), cls));
    }

    public final E getOnlyElement(E e) {
        return (E) Iterables.getOnlyElement(getDelegate(), e);
    }

    public static <T> FluentIterable<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3) {
        return concatNoDefensiveCopy(iterable, iterable2, iterable3);
    }

    public static <T> FluentIterable<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3, Iterable<? extends T> iterable4) {
        return concatNoDefensiveCopy(iterable, iterable2, iterable3, iterable4);
    }

    public static <E> FluentIterable<E> from(E[] eArr) {
        return from(Arrays.asList(eArr));
    }

    @SafeVarargs
    public static <T> FluentIterable<T> concat(Iterable<? extends T>... iterableArr) {
        return concatNoDefensiveCopy((Iterable[]) Arrays.copyOf(iterableArr, iterableArr.length));
    }
}
