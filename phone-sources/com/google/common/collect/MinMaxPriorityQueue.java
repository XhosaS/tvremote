package com.google.common.collect;

import android.support.v7.widget.ActivityChooserView;
import defpackage.a;
import defpackage.sij;
import defpackage.udo;
import java.util.AbstractQueue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class MinMaxPriorityQueue<E> extends AbstractQueue<E> {
    private static final int DEFAULT_CAPACITY = 11;
    private static final int EVEN_POWERS_OF_TWO = 1431655765;
    private static final int ODD_POWERS_OF_TWO = -1431655766;
    private final MinMaxPriorityQueue<E>.Heap maxHeap;
    final int maximumSize;
    private final MinMaxPriorityQueue<E>.Heap minHeap;
    private int modCount;
    private Object[] queue;
    private int size;

    /* compiled from: PG */
    public final class Builder<B> {
        private static final int UNSET_EXPECTED_SIZE = -1;
        private final Comparator<B> comparator;
        private int expectedSize;
        private int maximumSize;

        /* JADX INFO: Access modifiers changed from: private */
        public <T extends B> Ordering<T> ordering() {
            return Ordering.from(this.comparator);
        }

        public <T extends B> MinMaxPriorityQueue<T> create() {
            return create(Collections.EMPTY_SET);
        }

        public Builder<B> expectedSize(int i) {
            a.H(i >= 0);
            this.expectedSize = i;
            return this;
        }

        public Builder<B> maximumSize(int i) {
            a.H(i > 0);
            this.maximumSize = i;
            return this;
        }

        private Builder(Comparator<B> comparator) {
            this.expectedSize = -1;
            this.maximumSize = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            comparator.getClass();
            this.comparator = comparator;
        }

        public <T extends B> MinMaxPriorityQueue<T> create(Iterable<? extends T> iterable) {
            MinMaxPriorityQueue<T> minMaxPriorityQueue = new MinMaxPriorityQueue<>(this, MinMaxPriorityQueue.initialQueueSize(this.expectedSize, this.maximumSize, iterable));
            Iterator<? extends T> it = iterable.iterator();
            while (it.hasNext()) {
                minMaxPriorityQueue.offer(it.next());
            }
            return minMaxPriorityQueue;
        }
    }

    /* compiled from: PG */
    class Heap {
        final Ordering<E> ordering;
        MinMaxPriorityQueue<E>.Heap otherHeap;
        final /* synthetic */ MinMaxPriorityQueue this$0;

        public Heap(MinMaxPriorityQueue minMaxPriorityQueue, Ordering<E> ordering) {
            minMaxPriorityQueue.getClass();
            this.this$0 = minMaxPriorityQueue;
            this.ordering = ordering;
        }

        private int getGrandparentIndex(int i) {
            return getParentIndex(getParentIndex(i));
        }

        private int getLeftChildIndex(int i) {
            return i + i + 1;
        }

        private int getParentIndex(int i) {
            return (i - 1) / 2;
        }

        private int getRightChildIndex(int i) {
            return i + i + 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean verifyIndex(int i) {
            if (getLeftChildIndex(i) < this.this$0.size && compareElements(i, getLeftChildIndex(i)) > 0) {
                return false;
            }
            if (getRightChildIndex(i) < this.this$0.size && compareElements(i, getRightChildIndex(i)) > 0) {
                return false;
            }
            if (i <= 0 || compareElements(i, getParentIndex(i)) <= 0) {
                return i <= 2 || compareElements(getGrandparentIndex(i), i) <= 0;
            }
            return false;
        }

        public void bubbleUp(int i, E e) {
            Heap heap;
            int iCrossOverUp = crossOverUp(i, e);
            if (iCrossOverUp != i) {
                heap = this.otherHeap;
            } else {
                iCrossOverUp = i;
                heap = this;
            }
            heap.bubbleUpAlternatingLevels(iCrossOverUp, e);
        }

        public int bubbleUpAlternatingLevels(int i, E e) {
            while (i > 2) {
                int grandparentIndex = getGrandparentIndex(i);
                MinMaxPriorityQueue minMaxPriorityQueue = this.this$0;
                Ordering<E> ordering = this.ordering;
                Object objElementData = minMaxPriorityQueue.elementData(grandparentIndex);
                if (ordering.compare(objElementData, e) <= 0) {
                    break;
                }
                this.this$0.queue[i] = objElementData;
                i = grandparentIndex;
            }
            this.this$0.queue[i] = e;
            return i;
        }

        public int compareElements(int i, int i2) {
            MinMaxPriorityQueue minMaxPriorityQueue = this.this$0;
            return this.ordering.compare(minMaxPriorityQueue.elementData(i), minMaxPriorityQueue.elementData(i2));
        }

        public int crossOver(int i, E e) {
            int iFindMinChild = findMinChild(i);
            if (iFindMinChild <= 0 || this.ordering.compare(this.this$0.elementData(iFindMinChild), e) >= 0) {
                return crossOverUp(i, e);
            }
            MinMaxPriorityQueue minMaxPriorityQueue = this.this$0;
            minMaxPriorityQueue.queue[i] = minMaxPriorityQueue.elementData(iFindMinChild);
            this.this$0.queue[iFindMinChild] = e;
            return iFindMinChild;
        }

        public int crossOverUp(int i, E e) {
            int rightChildIndex;
            if (i == 0) {
                this.this$0.queue[0] = e;
                return 0;
            }
            int parentIndex = getParentIndex(i);
            Object objElementData = this.this$0.elementData(parentIndex);
            if (parentIndex != 0 && (rightChildIndex = getRightChildIndex(getParentIndex(parentIndex))) != parentIndex && getLeftChildIndex(rightChildIndex) >= this.this$0.size) {
                Object objElementData2 = this.this$0.elementData(rightChildIndex);
                if (this.ordering.compare(objElementData2, objElementData) < 0) {
                    parentIndex = rightChildIndex;
                    objElementData = objElementData2;
                }
            }
            if (this.ordering.compare(objElementData, e) >= 0) {
                this.this$0.queue[i] = e;
                return i;
            }
            this.this$0.queue[i] = objElementData;
            this.this$0.queue[parentIndex] = e;
            return parentIndex;
        }

        public int fillHoleAt(int i) {
            while (true) {
                int iFindMinGrandChild = findMinGrandChild(i);
                if (iFindMinGrandChild <= 0) {
                    return i;
                }
                MinMaxPriorityQueue minMaxPriorityQueue = this.this$0;
                minMaxPriorityQueue.queue[i] = minMaxPriorityQueue.elementData(iFindMinGrandChild);
                i = iFindMinGrandChild;
            }
        }

        public int findMin(int i, int i2) {
            if (i >= this.this$0.size) {
                return -1;
            }
            a.ab(i > 0);
            int iMin = Math.min(i, this.this$0.size - i2) + i2;
            for (int i3 = i + 1; i3 < iMin; i3++) {
                if (compareElements(i3, i) < 0) {
                    i = i3;
                }
            }
            return i;
        }

        public int findMinChild(int i) {
            return findMin(getLeftChildIndex(i), 2);
        }

        public int findMinGrandChild(int i) {
            int leftChildIndex = getLeftChildIndex(i);
            if (leftChildIndex < 0) {
                return -1;
            }
            return findMin(getLeftChildIndex(leftChildIndex), 4);
        }

        public int swapWithConceptuallyLastElement(E e) {
            int rightChildIndex;
            int parentIndex = getParentIndex(this.this$0.size);
            if (parentIndex != 0 && (rightChildIndex = getRightChildIndex(getParentIndex(parentIndex))) != parentIndex && getLeftChildIndex(rightChildIndex) >= this.this$0.size) {
                Object objElementData = this.this$0.elementData(rightChildIndex);
                if (this.ordering.compare(objElementData, e) < 0) {
                    this.this$0.queue[rightChildIndex] = e;
                    MinMaxPriorityQueue minMaxPriorityQueue = this.this$0;
                    minMaxPriorityQueue.queue[minMaxPriorityQueue.size] = objElementData;
                    return rightChildIndex;
                }
            }
            return this.this$0.size;
        }

        public MoveDesc<E> tryCrossOverAndBubbleUp(int i, int i2, E e) {
            int iCrossOver = crossOver(i2, e);
            if (iCrossOver == i2) {
                return null;
            }
            Object objElementData = iCrossOver < i ? this.this$0.elementData(i) : this.this$0.elementData(getParentIndex(i));
            if (this.otherHeap.bubbleUpAlternatingLevels(iCrossOver, e) < i) {
                return new MoveDesc<>(e, objElementData);
            }
            return null;
        }
    }

    /* compiled from: PG */
    class MoveDesc<E> {
        final E replaced;
        final E toTrickle;

        public MoveDesc(E e, E e2) {
            this.toTrickle = e;
            this.replaced = e2;
        }
    }

    /* compiled from: PG */
    class QueueIterator implements Iterator<E> {
        private boolean canRemove;
        private int cursor;
        private int expectedModCount;
        private Queue<E> forgetMeNot;
        private E lastFromForgetMeNot;
        private int nextCursor;
        private List<E> skipMe;
        final /* synthetic */ MinMaxPriorityQueue this$0;

        private void checkModCount() {
            if (this.this$0.modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }

        private boolean foundAndRemovedExactReference(Iterable<E> iterable, E e) {
            Iterator<E> it = iterable.iterator();
            while (it.hasNext()) {
                if (it.next() == e) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void nextNotInSkipMe(int i) {
            if (this.nextCursor < i) {
                if (this.skipMe != null) {
                    while (i < this.this$0.size() && foundAndRemovedExactReference(this.skipMe, this.this$0.elementData(i))) {
                        i++;
                    }
                }
                this.nextCursor = i;
            }
        }

        private boolean removeExact(Object obj) {
            for (int i = 0; i < this.this$0.size; i++) {
                if (this.this$0.queue[i] == obj) {
                    this.this$0.removeAt(i);
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            checkModCount();
            nextNotInSkipMe(this.cursor + 1);
            if (this.nextCursor < this.this$0.size()) {
                return true;
            }
            Queue<E> queue = this.forgetMeNot;
            return (queue == null || queue.isEmpty()) ? false : true;
        }

        @Override // java.util.Iterator
        public E next() {
            checkModCount();
            nextNotInSkipMe(this.cursor + 1);
            if (this.nextCursor < this.this$0.size()) {
                int i = this.nextCursor;
                this.cursor = i;
                this.canRemove = true;
                return (E) this.this$0.elementData(i);
            }
            if (this.forgetMeNot != null) {
                this.cursor = this.this$0.size();
                E ePoll = this.forgetMeNot.poll();
                this.lastFromForgetMeNot = ePoll;
                if (ePoll != null) {
                    this.canRemove = true;
                    return ePoll;
                }
            }
            throw new NoSuchElementException("iterator moved past last element in queue.");
        }

        @Override // java.util.Iterator
        public void remove() {
            CollectPreconditions.checkRemove(this.canRemove);
            checkModCount();
            this.canRemove = false;
            this.expectedModCount++;
            if (this.cursor >= this.this$0.size()) {
                E e = this.lastFromForgetMeNot;
                e.getClass();
                a.ab(removeExact(e));
                this.lastFromForgetMeNot = null;
                return;
            }
            MoveDesc<E> moveDescRemoveAt = this.this$0.removeAt(this.cursor);
            if (moveDescRemoveAt != null) {
                if (this.forgetMeNot == null || this.skipMe == null) {
                    this.forgetMeNot = new ArrayDeque();
                    this.skipMe = new ArrayList(3);
                }
                if (!foundAndRemovedExactReference(this.skipMe, moveDescRemoveAt.toTrickle)) {
                    this.forgetMeNot.add(moveDescRemoveAt.toTrickle);
                }
                if (!foundAndRemovedExactReference(this.forgetMeNot, moveDescRemoveAt.replaced)) {
                    this.skipMe.add(moveDescRemoveAt.replaced);
                }
            }
            this.cursor--;
            this.nextCursor--;
        }

        private QueueIterator(MinMaxPriorityQueue minMaxPriorityQueue) {
            minMaxPriorityQueue.getClass();
            this.this$0 = minMaxPriorityQueue;
            this.cursor = -1;
            this.nextCursor = -1;
            this.expectedModCount = minMaxPriorityQueue.modCount;
        }
    }

    private int calculateNewCapacity() {
        int iC;
        int length = this.queue.length;
        if (length < 64) {
            int i = length + 1;
            iC = i + i;
        } else {
            iC = udo.c(length >> 1, 3);
        }
        return capAtMaximumSize(iC, this.maximumSize);
    }

    private static int capAtMaximumSize(int i, int i2) {
        return Math.min(i - 1, i2) + 1;
    }

    public static <E extends Comparable<E>> MinMaxPriorityQueue<E> create() {
        return new Builder(Ordering.natural()).create();
    }

    public static Builder<Comparable> expectedSize(int i) {
        Builder<Comparable> builder = new Builder<>(Ordering.natural());
        builder.expectedSize(i);
        return builder;
    }

    private MoveDesc<E> fillHole(int i, E e) {
        MinMaxPriorityQueue<E>.Heap heapHeapForIndex = heapForIndex(i);
        int iFillHoleAt = heapHeapForIndex.fillHoleAt(i);
        int iBubbleUpAlternatingLevels = heapHeapForIndex.bubbleUpAlternatingLevels(iFillHoleAt, e);
        if (iBubbleUpAlternatingLevels == iFillHoleAt) {
            return heapHeapForIndex.tryCrossOverAndBubbleUp(i, iFillHoleAt, e);
        }
        if (iBubbleUpAlternatingLevels < i) {
            return new MoveDesc<>(e, elementData(i));
        }
        return null;
    }

    private int getMaxElementIndex() {
        int i = this.size;
        if (i != 1) {
            return (i == 2 || this.maxHeap.compareElements(1, 2) <= 0) ? 1 : 2;
        }
        return 0;
    }

    private void growIfNeeded() {
        if (this.size > this.queue.length) {
            Object[] objArr = new Object[calculateNewCapacity()];
            Object[] objArr2 = this.queue;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.queue = objArr;
        }
    }

    private MinMaxPriorityQueue<E>.Heap heapForIndex(int i) {
        return isEvenLevel(i) ? this.minHeap : this.maxHeap;
    }

    static int initialQueueSize(int i, int i2, Iterable<?> iterable) {
        boolean z = iterable instanceof Collection;
        if (i == -1) {
            i = 11;
        }
        if (z) {
            i = Math.max(i, ((Collection) iterable).size());
        }
        return capAtMaximumSize(i, i2);
    }

    static boolean isEvenLevel(int i) {
        int i2 = i + 1;
        sij.x(i2 > 0, "negative index");
        return (EVEN_POWERS_OF_TWO & i2) > (i2 & ODD_POWERS_OF_TWO);
    }

    public static Builder<Comparable> maximumSize(int i) {
        Builder<Comparable> builder = new Builder<>(Ordering.natural());
        builder.maximumSize(i);
        return builder;
    }

    public static <B> Builder<B> orderedBy(Comparator<B> comparator) {
        return new Builder<>(comparator);
    }

    private E removeAndGet(int i) {
        E eElementData = elementData(i);
        removeAt(i);
        return eElementData;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(E e) {
        offer(e);
        return true;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            offer(it.next());
            z = true;
        }
        return z;
    }

    int capacity() {
        return this.queue.length;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        for (int i = 0; i < this.size; i++) {
            this.queue[i] = null;
        }
        this.size = 0;
    }

    public Comparator<? super E> comparator() {
        return this.minHeap.ordering;
    }

    public E elementData(int i) {
        E e = (E) this.queue[i];
        e.getClass();
        return e;
    }

    boolean isIntact() {
        for (int i = 1; i < this.size; i++) {
            if (!heapForIndex(i).verifyIndex(i)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new QueueIterator();
    }

    @Override // java.util.Queue
    public boolean offer(E e) {
        e.getClass();
        this.modCount++;
        int i = this.size;
        this.size = i + 1;
        growIfNeeded();
        heapForIndex(i).bubbleUp(i, e);
        return this.size <= this.maximumSize || pollLast() != e;
    }

    @Override // java.util.Queue
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return elementData(0);
    }

    public E peekFirst() {
        return peek();
    }

    public E peekLast() {
        if (isEmpty()) {
            return null;
        }
        return elementData(getMaxElementIndex());
    }

    @Override // java.util.Queue
    public E poll() {
        if (isEmpty()) {
            return null;
        }
        return removeAndGet(0);
    }

    public E pollFirst() {
        return poll();
    }

    public E pollLast() {
        if (isEmpty()) {
            return null;
        }
        return removeAndGet(getMaxElementIndex());
    }

    public MoveDesc<E> removeAt(int i) {
        sij.C(i, this.size);
        this.modCount++;
        int i2 = this.size - 1;
        this.size = i2;
        if (i2 == i) {
            this.queue[i2] = null;
            return null;
        }
        E eElementData = elementData(i2);
        int iSwapWithConceptuallyLastElement = heapForIndex(this.size).swapWithConceptuallyLastElement(eElementData);
        if (iSwapWithConceptuallyLastElement == i) {
            this.queue[this.size] = null;
            return null;
        }
        E eElementData2 = elementData(this.size);
        this.queue[this.size] = null;
        MoveDesc<E> moveDescFillHole = fillHole(i, eElementData2);
        return iSwapWithConceptuallyLastElement < i ? moveDescFillHole == null ? new MoveDesc<>(eElementData, eElementData2) : new MoveDesc<>(eElementData, moveDescFillHole.replaced) : moveDescFillHole;
    }

    public E removeFirst() {
        return remove();
    }

    public E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return removeAndGet(getMaxElementIndex());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        int i = this.size;
        Object[] objArr = new Object[i];
        System.arraycopy(this.queue, 0, objArr, 0, i);
        return objArr;
    }

    private MinMaxPriorityQueue(Builder<? super E> builder, int i) {
        Ordering ordering = builder.ordering();
        MinMaxPriorityQueue<E>.Heap heap = new Heap(this, ordering);
        this.minHeap = heap;
        MinMaxPriorityQueue<E>.Heap heap2 = new Heap(this, ordering.reverse());
        this.maxHeap = heap2;
        heap.otherHeap = heap2;
        heap2.otherHeap = heap;
        this.maximumSize = ((Builder) builder).maximumSize;
        this.queue = new Object[i];
    }

    public static <E extends Comparable<E>> MinMaxPriorityQueue<E> create(Iterable<? extends E> iterable) {
        return new Builder(Ordering.natural()).create(iterable);
    }
}
