package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedSet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class SortedIterables {
    private SortedIterables() {
    }

    public static <E> Comparator<? super E> comparator(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        return comparator == null ? Ordering.natural() : comparator;
    }

    public static boolean hasSameComparator(Comparator<?> comparator, Iterable<?> iterable) {
        Comparator comparator2;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            comparator2 = comparator((SortedSet) iterable);
        } else {
            if (!(iterable instanceof SortedIterable)) {
                return false;
            }
            comparator2 = ((SortedIterable) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
