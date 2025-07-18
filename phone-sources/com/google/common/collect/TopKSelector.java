package com.google.common.collect;

import defpackage.sij;
import defpackage.udo;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class TopKSelector<T> {
    private final T[] buffer;
    private int bufferSize;
    private final Comparator<? super T> comparator;
    private final int k;
    private T threshold;

    private TopKSelector(Comparator<? super T> comparator, int i) {
        comparator.getClass();
        this.comparator = comparator;
        this.k = i;
        sij.q(i >= 0, "k (%s) must be >= 0", i);
        sij.q(i <= 1073741823, "k (%s) must be <= Integer.MAX_VALUE / 2", i);
        this.buffer = (T[]) new Object[udo.c(i, 2)];
        this.bufferSize = 0;
        this.threshold = null;
    }

    public static <T extends Comparable<? super T>> TopKSelector<T> greatest(int i) {
        return greatest(i, Ordering.natural());
    }

    public static <T extends Comparable<? super T>> TopKSelector<T> least(int i) {
        return least(i, Ordering.natural());
    }

    private int partition(int i, int i2, int i3) {
        T[] tArr = this.buffer;
        T t = tArr[i3];
        tArr[i3] = tArr[i2];
        int i4 = i;
        while (i < i2) {
            if (this.comparator.compare(this.buffer[i], t) < 0) {
                swap(i4, i);
                i4++;
            }
            i++;
        }
        T[] tArr2 = this.buffer;
        tArr2[i2] = tArr2[i4];
        tArr2[i4] = t;
        return i4;
    }

    private void swap(int i, int i2) {
        T[] tArr = this.buffer;
        T t = tArr[i];
        tArr[i] = tArr[i2];
        tArr[i2] = t;
    }

    private void trim() {
        int i = this.k;
        int i2 = (i + i) - 1;
        int iE = udo.e(i2, RoundingMode.CEILING) * 3;
        int iMax = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (iMax >= i2) {
                break;
            }
            int iPartition = partition(iMax, i2, ((iMax + i2) + 1) >>> 1);
            int i5 = this.k;
            if (iPartition <= i5) {
                if (iPartition >= i5) {
                    break;
                }
                iMax = Math.max(iPartition, iMax + 1);
                i4 = iPartition;
            } else {
                i2 = iPartition - 1;
            }
            i3++;
            if (i3 >= iE) {
                Arrays.sort(this.buffer, iMax, i2 + 1, this.comparator);
                break;
            }
        }
        this.bufferSize = this.k;
        this.threshold = this.buffer[i4];
        while (true) {
            i4++;
            if (i4 >= this.k) {
                return;
            }
            if (this.comparator.compare(this.buffer[i4], this.threshold) > 0) {
                this.threshold = this.buffer[i4];
            }
        }
    }

    public TopKSelector<T> combine(TopKSelector<T> topKSelector) {
        for (int i = 0; i < topKSelector.bufferSize; i++) {
            offer(topKSelector.buffer[i]);
        }
        return this;
    }

    public void offer(T t) {
        int i = this.k;
        if (i == 0) {
            return;
        }
        int i2 = this.bufferSize;
        if (i2 == 0) {
            this.buffer[0] = t;
            this.threshold = t;
            this.bufferSize = 1;
            return;
        }
        if (i2 < i) {
            T[] tArr = this.buffer;
            this.bufferSize = i2 + 1;
            tArr[i2] = t;
            if (this.comparator.compare(t, this.threshold) > 0) {
                this.threshold = t;
                return;
            }
            return;
        }
        if (this.comparator.compare(t, this.threshold) < 0) {
            T[] tArr2 = this.buffer;
            int i3 = this.bufferSize;
            int i4 = i3 + 1;
            this.bufferSize = i4;
            tArr2[i3] = t;
            int i5 = this.k;
            if (i4 == i5 + i5) {
                trim();
            }
        }
    }

    public void offerAll(Iterable<? extends T> iterable) {
        offerAll(iterable.iterator());
    }

    public List<T> topK() {
        int i = this.bufferSize;
        Comparator<? super T> comparator = this.comparator;
        T[] tArr = this.buffer;
        Arrays.sort(tArr, 0, i, comparator);
        int i2 = this.bufferSize;
        int i3 = this.k;
        if (i2 > i3) {
            T[] tArr2 = this.buffer;
            Arrays.fill(tArr2, i3, tArr2.length, (Object) null);
            i2 = this.k;
            this.bufferSize = i2;
            this.threshold = this.buffer[i2 - 1];
        }
        return DesugarCollections.unmodifiableList(Arrays.asList(Arrays.copyOf(tArr, i2)));
    }

    public static <T> TopKSelector<T> greatest(int i, Comparator<? super T> comparator) {
        return new TopKSelector<>(Ordering.from(comparator).reverse(), i);
    }

    public static <T> TopKSelector<T> least(int i, Comparator<? super T> comparator) {
        return new TopKSelector<>(comparator, i);
    }

    public void offerAll(Iterator<? extends T> it) {
        while (it.hasNext()) {
            offer(it.next());
        }
    }
}
