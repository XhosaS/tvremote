package com.google.common.collect;

import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.collect.Serialization;
import defpackage.a;
import defpackage.sfy;
import defpackage.sij;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class TreeMultiset<E> extends AbstractSortedMultiset<E> implements Serializable {
    private static final long serialVersionUID = 1;
    private final transient AvlNode<E> header;
    private final transient GeneralRange<E> range;
    private final transient Reference<AvlNode<E>> rootReference;

    /* compiled from: PG */
    /* renamed from: com.google.common.collect.TreeMultiset$4, reason: invalid class name */
    /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$com$google$common$collect$BoundType;

        static {
            int[] iArr = new int[BoundType.values().length];
            $SwitchMap$com$google$common$collect$BoundType = iArr;
            try {
                iArr[BoundType.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$common$collect$BoundType[BoundType.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PG */
    abstract class Aggregate {
        private static final /* synthetic */ Aggregate[] $VALUES = $values();
        public static final Aggregate DISTINCT;
        public static final Aggregate SIZE;

        /* compiled from: PG */
        /* renamed from: com.google.common.collect.TreeMultiset$Aggregate$1, reason: invalid class name */
        enum AnonymousClass1 extends Aggregate {
            @Override // com.google.common.collect.TreeMultiset.Aggregate
            public int nodeAggregate(AvlNode<?> avlNode) {
                return ((AvlNode) avlNode).elemCount;
            }

            @Override // com.google.common.collect.TreeMultiset.Aggregate
            public long treeAggregate(AvlNode<?> avlNode) {
                if (avlNode == null) {
                    return 0L;
                }
                return ((AvlNode) avlNode).totalCount;
            }

            private AnonymousClass1(String str, int i) {
                super(str, i);
            }
        }

        /* compiled from: PG */
        /* renamed from: com.google.common.collect.TreeMultiset$Aggregate$2, reason: invalid class name */
        enum AnonymousClass2 extends Aggregate {
            @Override // com.google.common.collect.TreeMultiset.Aggregate
            public int nodeAggregate(AvlNode<?> avlNode) {
                return 1;
            }

            @Override // com.google.common.collect.TreeMultiset.Aggregate
            public long treeAggregate(AvlNode<?> avlNode) {
                if (avlNode == null) {
                    return 0L;
                }
                return ((AvlNode) avlNode).distinctElements;
            }

            private AnonymousClass2(String str, int i) {
                super(str, i);
            }
        }

        private static /* synthetic */ Aggregate[] $values() {
            return new Aggregate[]{SIZE, DISTINCT};
        }

        static {
            SIZE = new AnonymousClass1("SIZE", 0);
            DISTINCT = new AnonymousClass2("DISTINCT", 1);
        }

        public static Aggregate valueOf(String str) {
            return (Aggregate) Enum.valueOf(Aggregate.class, str);
        }

        public static Aggregate[] values() {
            return (Aggregate[]) $VALUES.clone();
        }

        public abstract int nodeAggregate(AvlNode<?> avlNode);

        public abstract long treeAggregate(AvlNode<?> avlNode);

        private Aggregate(String str, int i) {
        }
    }

    /* compiled from: PG */
    final class AvlNode<E> {
        private int distinctElements;
        private final E elem;
        private int elemCount;
        private int height;
        private AvlNode<E> left;
        private AvlNode<E> pred;
        private AvlNode<E> right;
        private AvlNode<E> succ;
        private long totalCount;

        public AvlNode() {
            this.elem = null;
            this.elemCount = 1;
        }

        private AvlNode<E> addLeftChild(E e, int i) {
            this.left = new AvlNode<>(e, i);
            TreeMultiset.successor(pred(), this.left, this);
            this.height = Math.max(2, this.height);
            this.distinctElements++;
            this.totalCount += i;
            return this;
        }

        private AvlNode<E> addRightChild(E e, int i) {
            AvlNode<E> avlNode = new AvlNode<>(e, i);
            this.right = avlNode;
            TreeMultiset.successor(this, avlNode, succ());
            this.height = Math.max(2, this.height);
            this.distinctElements++;
            this.totalCount += i;
            return this;
        }

        private int balanceFactor() {
            return height(this.left) - height(this.right);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public AvlNode<E> ceiling(Comparator<? super E> comparator, E e) {
            int iCompare = comparator.compare(e, getElement());
            if (iCompare < 0) {
                AvlNode<E> avlNode = this.left;
                if (avlNode != null) {
                    return (AvlNode) sij.I(avlNode.ceiling(comparator, e), this);
                }
            } else if (iCompare != 0) {
                AvlNode<E> avlNode2 = this.right;
                if (avlNode2 == null) {
                    return null;
                }
                return avlNode2.ceiling(comparator, e);
            }
            return this;
        }

        private AvlNode<E> deleteMe() {
            int i = this.elemCount;
            this.elemCount = 0;
            TreeMultiset.successor(pred(), succ());
            AvlNode<E> avlNode = this.left;
            if (avlNode == null) {
                return this.right;
            }
            AvlNode<E> avlNode2 = this.right;
            if (avlNode2 == null) {
                return avlNode;
            }
            long j = i;
            if (avlNode.height >= avlNode2.height) {
                AvlNode<E> avlNodePred = pred();
                avlNodePred.left = this.left.removeMax(avlNodePred);
                avlNodePred.right = this.right;
                avlNodePred.distinctElements = this.distinctElements - 1;
                avlNodePred.totalCount = this.totalCount - j;
                return avlNodePred.rebalance();
            }
            AvlNode<E> avlNodeSucc = succ();
            avlNodeSucc.right = this.right.removeMin(avlNodeSucc);
            avlNodeSucc.left = this.left;
            avlNodeSucc.distinctElements = this.distinctElements - 1;
            avlNodeSucc.totalCount = this.totalCount - j;
            return avlNodeSucc.rebalance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public AvlNode<E> floor(Comparator<? super E> comparator, E e) {
            int iCompare = comparator.compare(e, getElement());
            if (iCompare > 0) {
                AvlNode<E> avlNode = this.right;
                if (avlNode != null) {
                    return (AvlNode) sij.I(avlNode.floor(comparator, e), this);
                }
            } else if (iCompare != 0) {
                AvlNode<E> avlNode2 = this.left;
                if (avlNode2 == null) {
                    return null;
                }
                return avlNode2.floor(comparator, e);
            }
            return this;
        }

        private static int height(AvlNode<?> avlNode) {
            if (avlNode == null) {
                return 0;
            }
            return ((AvlNode) avlNode).height;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public AvlNode<E> pred() {
            AvlNode<E> avlNode = this.pred;
            avlNode.getClass();
            return avlNode;
        }

        private AvlNode<E> rebalance() {
            int iBalanceFactor = balanceFactor();
            if (iBalanceFactor == -2) {
                AvlNode<E> avlNode = this.right;
                avlNode.getClass();
                if (avlNode.balanceFactor() > 0) {
                    this.right = this.right.rotateRight();
                }
                return rotateLeft();
            }
            if (iBalanceFactor != 2) {
                recomputeHeight();
                return this;
            }
            AvlNode<E> avlNode2 = this.left;
            avlNode2.getClass();
            if (avlNode2.balanceFactor() < 0) {
                this.left = this.left.rotateLeft();
            }
            return rotateRight();
        }

        private void recompute() {
            recomputeMultiset();
            recomputeHeight();
        }

        private void recomputeHeight() {
            this.height = Math.max(height(this.left), height(this.right)) + 1;
        }

        private void recomputeMultiset() {
            this.distinctElements = TreeMultiset.distinctElements(this.left) + 1 + TreeMultiset.distinctElements(this.right);
            this.totalCount = this.elemCount + totalCount(this.left) + totalCount(this.right);
        }

        private AvlNode<E> removeMax(AvlNode<E> avlNode) {
            AvlNode<E> avlNode2 = this.right;
            if (avlNode2 == null) {
                return this.left;
            }
            this.right = avlNode2.removeMax(avlNode);
            this.distinctElements--;
            this.totalCount -= avlNode.elemCount;
            return rebalance();
        }

        private AvlNode<E> removeMin(AvlNode<E> avlNode) {
            AvlNode<E> avlNode2 = this.left;
            if (avlNode2 == null) {
                return this.right;
            }
            this.left = avlNode2.removeMin(avlNode);
            this.distinctElements--;
            this.totalCount -= avlNode.elemCount;
            return rebalance();
        }

        private AvlNode<E> rotateLeft() {
            a.ab(this.right != null);
            AvlNode<E> avlNode = this.right;
            this.right = avlNode.left;
            avlNode.left = this;
            avlNode.totalCount = this.totalCount;
            avlNode.distinctElements = this.distinctElements;
            recompute();
            avlNode.recomputeHeight();
            return avlNode;
        }

        private AvlNode<E> rotateRight() {
            a.ab(this.left != null);
            AvlNode<E> avlNode = this.left;
            this.left = avlNode.right;
            avlNode.right = this;
            avlNode.totalCount = this.totalCount;
            avlNode.distinctElements = this.distinctElements;
            recompute();
            avlNode.recomputeHeight();
            return avlNode;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public AvlNode<E> succ() {
            AvlNode<E> avlNode = this.succ;
            avlNode.getClass();
            return avlNode;
        }

        private static long totalCount(AvlNode<?> avlNode) {
            if (avlNode == null) {
                return 0L;
            }
            return ((AvlNode) avlNode).totalCount;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AvlNode<E> add(Comparator<? super E> comparator, E e, int i, int[] iArr) {
            int iCompare = comparator.compare(e, getElement());
            if (iCompare < 0) {
                AvlNode<E> avlNode = this.left;
                if (avlNode == null) {
                    iArr[0] = 0;
                    addLeftChild(e, i);
                    return this;
                }
                long j = i;
                int i2 = avlNode.height;
                AvlNode<E> avlNodeAdd = avlNode.add(comparator, e, i, iArr);
                this.left = avlNodeAdd;
                if (iArr[0] == 0) {
                    this.distinctElements++;
                }
                this.totalCount += j;
                if (avlNodeAdd.height != i2) {
                    return rebalance();
                }
            } else {
                if (iCompare <= 0) {
                    long j2 = i;
                    int i3 = this.elemCount;
                    iArr[0] = i3;
                    a.H(((long) i3) + j2 <= 2147483647L);
                    this.elemCount += i;
                    this.totalCount += j2;
                    return this;
                }
                AvlNode<E> avlNode2 = this.right;
                if (avlNode2 == null) {
                    iArr[0] = 0;
                    addRightChild(e, i);
                    return this;
                }
                long j3 = i;
                int i4 = avlNode2.height;
                AvlNode<E> avlNodeAdd2 = avlNode2.add(comparator, e, i, iArr);
                this.right = avlNodeAdd2;
                if (iArr[0] == 0) {
                    this.distinctElements++;
                }
                this.totalCount += j3;
                if (avlNodeAdd2.height != i4) {
                    return rebalance();
                }
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int count(Comparator<? super E> comparator, E e) {
            int iCompare = comparator.compare(e, getElement());
            if (iCompare < 0) {
                AvlNode<E> avlNode = this.left;
                if (avlNode == null) {
                    return 0;
                }
                return avlNode.count(comparator, e);
            }
            if (iCompare <= 0) {
                return this.elemCount;
            }
            AvlNode<E> avlNode2 = this.right;
            if (avlNode2 != null) {
                return avlNode2.count(comparator, e);
            }
            return 0;
        }

        public int getCount() {
            return this.elemCount;
        }

        public E getElement() {
            return this.elem;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AvlNode<E> remove(Comparator<? super E> comparator, E e, int i, int[] iArr) {
            int iCompare = comparator.compare(e, getElement());
            if (iCompare < 0) {
                AvlNode<E> avlNode = this.left;
                if (avlNode == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.left = avlNode.remove(comparator, e, i, iArr);
                int i2 = iArr[0];
                if (i2 > 0) {
                    if (i >= i2) {
                        this.distinctElements--;
                        this.totalCount -= i2;
                    } else {
                        this.totalCount -= i;
                    }
                }
                return i2 == 0 ? this : rebalance();
            }
            if (iCompare <= 0) {
                int i3 = this.elemCount;
                iArr[0] = i3;
                if (i >= i3) {
                    return deleteMe();
                }
                this.elemCount = i3 - i;
                this.totalCount -= i;
                return this;
            }
            AvlNode<E> avlNode2 = this.right;
            if (avlNode2 == null) {
                iArr[0] = 0;
                return this;
            }
            this.right = avlNode2.remove(comparator, e, i, iArr);
            int i4 = iArr[0];
            if (i4 > 0) {
                if (i >= i4) {
                    this.distinctElements--;
                    this.totalCount -= i4;
                } else {
                    this.totalCount -= i;
                }
            }
            return rebalance();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AvlNode<E> setCount(Comparator<? super E> comparator, E e, int i, int i2, int[] iArr) {
            int i3;
            int i4;
            int iCompare = comparator.compare(e, getElement());
            int i5 = 0;
            if (iCompare < 0) {
                AvlNode<E> avlNode = this.left;
                if (avlNode != null) {
                    this.left = avlNode.setCount(comparator, e, i, i2, iArr);
                    int i6 = iArr[0];
                    if (i6 == i) {
                        if (i2 != 0) {
                            i4 = i2;
                        } else if (i6 != 0) {
                            this.distinctElements--;
                            this.totalCount += i5 - i6;
                        } else {
                            i4 = 0;
                        }
                        if (i4 > 0 && i6 == 0) {
                            this.distinctElements++;
                        }
                        i5 = i4;
                        this.totalCount += i5 - i6;
                    }
                    return rebalance();
                }
                iArr[0] = 0;
                if (i == 0 && i2 > 0) {
                    addLeftChild(e, i2);
                    return this;
                }
            } else if (iCompare > 0) {
                AvlNode<E> avlNode2 = this.right;
                if (avlNode2 != null) {
                    this.right = avlNode2.setCount(comparator, e, i, i2, iArr);
                    int i7 = iArr[0];
                    if (i7 == i) {
                        if (i2 != 0) {
                            i3 = i2;
                        } else if (i7 != 0) {
                            this.distinctElements--;
                            this.totalCount += i5 - i7;
                        } else {
                            i3 = 0;
                        }
                        if (i3 > 0 && i7 == 0) {
                            this.distinctElements++;
                        }
                        i5 = i3;
                        this.totalCount += i5 - i7;
                    }
                    return rebalance();
                }
                iArr[0] = 0;
                if (i == 0 && i2 > 0) {
                    addRightChild(e, i2);
                    return this;
                }
            } else {
                int i8 = this.elemCount;
                iArr[0] = i8;
                if (i == i8) {
                    if (i2 == 0) {
                        return deleteMe();
                    }
                    this.totalCount += i2 - i8;
                    this.elemCount = i2;
                }
            }
            return this;
        }

        public String toString() {
            return Multisets.immutableEntry(getElement(), getCount()).toString();
        }

        public AvlNode(E e, int i) {
            a.H(i > 0);
            this.elem = e;
            this.elemCount = i;
            this.totalCount = i;
            this.distinctElements = 1;
            this.height = 1;
            this.left = null;
            this.right = null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AvlNode<E> setCount(Comparator<? super E> comparator, E e, int i, int[] iArr) {
            int iCompare = comparator.compare(e, getElement());
            if (iCompare < 0) {
                AvlNode<E> avlNode = this.left;
                if (avlNode == null) {
                    iArr[0] = 0;
                    if (i > 0) {
                        addLeftChild(e, i);
                        return this;
                    }
                } else {
                    this.left = avlNode.setCount(comparator, e, i, iArr);
                    if (i == 0) {
                        if (iArr[0] != 0) {
                            this.distinctElements--;
                            i = 0;
                        } else {
                            i = 0;
                            if (i > 0) {
                                this.distinctElements++;
                            }
                        }
                    } else if (i > 0 && iArr[0] == 0) {
                        this.distinctElements++;
                    }
                    this.totalCount += i - iArr[0];
                    return rebalance();
                }
            } else if (iCompare > 0) {
                AvlNode<E> avlNode2 = this.right;
                if (avlNode2 == null) {
                    iArr[0] = 0;
                    if (i > 0) {
                        addRightChild(e, i);
                    }
                } else {
                    this.right = avlNode2.setCount(comparator, e, i, iArr);
                    if (i == 0) {
                        if (iArr[0] != 0) {
                            this.distinctElements--;
                            i = 0;
                        } else {
                            i = 0;
                            if (i > 0) {
                                this.distinctElements++;
                            }
                        }
                    } else if (i > 0 && iArr[0] == 0) {
                        this.distinctElements++;
                    }
                    this.totalCount += i - iArr[0];
                    return rebalance();
                }
            } else {
                iArr[0] = this.elemCount;
                if (i == 0) {
                    return deleteMe();
                }
                this.totalCount += i - r3;
                this.elemCount = i;
                return this;
            }
            return this;
        }
    }

    /* compiled from: PG */
    final class Reference<T> {
        private T value;

        private Reference() {
        }

        public void checkAndSet(T t, T t2) {
            if (this.value != t) {
                throw new ConcurrentModificationException();
            }
            this.value = t2;
        }

        public void clear() {
            this.value = null;
        }

        public T get() {
            return this.value;
        }
    }

    public TreeMultiset(Reference<AvlNode<E>> reference, GeneralRange<E> generalRange, AvlNode<E> avlNode) {
        super(generalRange.comparator());
        this.rootReference = reference;
        this.range = generalRange;
        this.header = avlNode;
    }

    private long aggregateAboveRange(Aggregate aggregate, AvlNode<E> avlNode) {
        long jTreeAggregate;
        long jAggregateAboveRange;
        if (avlNode == null) {
            return 0L;
        }
        int iCompare = comparator().compare(this.range.getUpperEndpoint(), avlNode.getElement());
        if (iCompare > 0) {
            return aggregateAboveRange(aggregate, ((AvlNode) avlNode).right);
        }
        if (iCompare == 0) {
            BoundType boundType = BoundType.OPEN;
            int iOrdinal = this.range.getUpperBoundType().ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    return aggregate.treeAggregate(((AvlNode) avlNode).right);
                }
                throw new AssertionError();
            }
            jTreeAggregate = aggregate.nodeAggregate(avlNode);
            jAggregateAboveRange = aggregate.treeAggregate(((AvlNode) avlNode).right);
        } else {
            jTreeAggregate = aggregate.treeAggregate(((AvlNode) avlNode).right) + aggregate.nodeAggregate(avlNode);
            jAggregateAboveRange = aggregateAboveRange(aggregate, ((AvlNode) avlNode).left);
        }
        return jTreeAggregate + jAggregateAboveRange;
    }

    private long aggregateBelowRange(Aggregate aggregate, AvlNode<E> avlNode) {
        long jTreeAggregate;
        long jAggregateBelowRange;
        if (avlNode == null) {
            return 0L;
        }
        int iCompare = comparator().compare(this.range.getLowerEndpoint(), avlNode.getElement());
        if (iCompare < 0) {
            return aggregateBelowRange(aggregate, ((AvlNode) avlNode).left);
        }
        if (iCompare == 0) {
            BoundType boundType = BoundType.OPEN;
            int iOrdinal = this.range.getLowerBoundType().ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    return aggregate.treeAggregate(((AvlNode) avlNode).left);
                }
                throw new AssertionError();
            }
            jTreeAggregate = aggregate.nodeAggregate(avlNode);
            jAggregateBelowRange = aggregate.treeAggregate(((AvlNode) avlNode).left);
        } else {
            jTreeAggregate = aggregate.treeAggregate(((AvlNode) avlNode).left) + aggregate.nodeAggregate(avlNode);
            jAggregateBelowRange = aggregateBelowRange(aggregate, ((AvlNode) avlNode).right);
        }
        return jTreeAggregate + jAggregateBelowRange;
    }

    private long aggregateForEntries(Aggregate aggregate) {
        AvlNode<E> avlNode = this.rootReference.get();
        long jTreeAggregate = aggregate.treeAggregate(avlNode);
        if (this.range.hasLowerBound()) {
            jTreeAggregate -= aggregateBelowRange(aggregate, avlNode);
        }
        return this.range.hasUpperBound() ? jTreeAggregate - aggregateAboveRange(aggregate, avlNode) : jTreeAggregate;
    }

    public static <E extends Comparable> TreeMultiset<E> create() {
        return new TreeMultiset<>(Ordering.natural());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AvlNode<E> firstNode() {
        AvlNode<E> avlNodeSucc;
        AvlNode<E> avlNode = this.rootReference.get();
        if (avlNode == null) {
            return null;
        }
        if (this.range.hasLowerBound()) {
            E lowerEndpoint = this.range.getLowerEndpoint();
            avlNodeSucc = avlNode.ceiling(comparator(), lowerEndpoint);
            if (avlNodeSucc == null) {
                return null;
            }
            if (this.range.getLowerBoundType() == BoundType.OPEN && comparator().compare(lowerEndpoint, avlNodeSucc.getElement()) == 0) {
                avlNodeSucc = avlNodeSucc.succ();
            }
        } else {
            avlNodeSucc = this.header.succ();
        }
        if (avlNodeSucc == this.header || !this.range.contains(avlNodeSucc.getElement())) {
            return null;
        }
        return avlNodeSucc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AvlNode<E> lastNode() {
        AvlNode<E> avlNodePred;
        AvlNode<E> avlNode = this.rootReference.get();
        if (avlNode == null) {
            return null;
        }
        if (this.range.hasUpperBound()) {
            E upperEndpoint = this.range.getUpperEndpoint();
            avlNodePred = avlNode.floor(comparator(), upperEndpoint);
            if (avlNodePred == null) {
                return null;
            }
            if (this.range.getUpperBoundType() == BoundType.OPEN && comparator().compare(upperEndpoint, avlNodePred.getElement()) == 0) {
                avlNodePred = avlNodePred.pred();
            }
        } else {
            avlNodePred = this.header.pred();
        }
        if (avlNodePred == this.header || !this.range.contains(avlNodePred.getElement())) {
            return null;
        }
        return avlNodePred;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, ClassNotFoundException, IOException, IllegalArgumentException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        object.getClass();
        Comparator comparator = (Comparator) object;
        Serialization.getFieldSetter(AbstractSortedMultiset.class, "comparator").set((Serialization.FieldSetter) this, (Object) comparator);
        Serialization.getFieldSetter(TreeMultiset.class, "range").set((Serialization.FieldSetter) this, (Object) GeneralRange.all(comparator));
        Serialization.getFieldSetter(TreeMultiset.class, "rootReference").set((Serialization.FieldSetter) this, (Object) new Reference());
        AvlNode avlNode = new AvlNode();
        Serialization.getFieldSetter(TreeMultiset.class, "header").set((Serialization.FieldSetter) this, (Object) avlNode);
        successor(avlNode, avlNode);
        Serialization.populateMultiset(this, objectInputStream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void successor(AvlNode<T> avlNode, AvlNode<T> avlNode2) {
        ((AvlNode) avlNode).succ = avlNode2;
        ((AvlNode) avlNode2).pred = avlNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Multiset.Entry<E> wrapEntry(final AvlNode<E> avlNode) {
        return new Multisets.AbstractEntry<E>(this) { // from class: com.google.common.collect.TreeMultiset.1
            final /* synthetic */ TreeMultiset this$0;

            {
                this.getClass();
                this.this$0 = this;
            }

            @Override // com.google.common.collect.Multiset.Entry
            public int getCount() {
                int count = avlNode.getCount();
                return count == 0 ? this.this$0.count(getElement()) : count;
            }

            @Override // com.google.common.collect.Multiset.Entry
            public E getElement() {
                return (E) avlNode.getElement();
            }
        };
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(elementSet().comparator());
        Serialization.writeMultiset(this, objectOutputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public int add(E e, int i) {
        CollectPreconditions.checkNonnegative(i, "occurrences");
        if (i == 0) {
            return count(e);
        }
        a.H(this.range.contains(e));
        AvlNode<E> avlNode = this.rootReference.get();
        if (avlNode != null) {
            int[] iArr = new int[1];
            this.rootReference.checkAndSet(avlNode, avlNode.add(comparator(), e, i, iArr));
            return iArr[0];
        }
        comparator().compare(e, e);
        AvlNode<E> avlNode2 = new AvlNode<>(e, i);
        AvlNode<E> avlNode3 = this.header;
        successor(avlNode3, avlNode2, avlNode3);
        this.rootReference.checkAndSet(null, avlNode2);
        return 0;
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        if (this.range.hasLowerBound() || this.range.hasUpperBound()) {
            Iterators.clear(entryIterator());
            return;
        }
        AvlNode<E> avlNodeSucc = this.header.succ();
        while (true) {
            AvlNode<E> avlNode = this.header;
            if (avlNodeSucc == avlNode) {
                successor(avlNode, avlNode);
                this.rootReference.clear();
                return;
            }
            AvlNode<E> avlNodeSucc2 = avlNodeSucc.succ();
            ((AvlNode) avlNodeSucc).elemCount = 0;
            ((AvlNode) avlNodeSucc).left = null;
            ((AvlNode) avlNodeSucc).right = null;
            ((AvlNode) avlNodeSucc).pred = null;
            ((AvlNode) avlNodeSucc).succ = null;
            avlNodeSucc = avlNodeSucc2;
        }
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public /* bridge */ /* synthetic */ Comparator comparator() {
        return super.comparator();
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.Multiset
    public int count(Object obj) {
        try {
            AvlNode<E> avlNode = this.rootReference.get();
            if (this.range.contains(obj) && avlNode != null) {
                return avlNode.count(comparator(), obj);
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // com.google.common.collect.AbstractSortedMultiset
    public Iterator<Multiset.Entry<E>> descendingEntryIterator() {
        return new Iterator<Multiset.Entry<E>>(this) { // from class: com.google.common.collect.TreeMultiset.3
            AvlNode<E> current;
            Multiset.Entry<E> prevEntry;
            final /* synthetic */ TreeMultiset this$0;

            {
                this.getClass();
                this.this$0 = this;
                this.current = this.lastNode();
                this.prevEntry = null;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.current == null) {
                    return false;
                }
                if (!this.this$0.range.tooLow(this.current.getElement())) {
                    return true;
                }
                this.current = null;
                return false;
            }

            @Override // java.util.Iterator
            public Multiset.Entry<E> next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                AvlNode<E> avlNode = this.current;
                avlNode.getClass();
                Multiset.Entry<E> entryWrapEntry = this.this$0.wrapEntry(avlNode);
                this.prevEntry = entryWrapEntry;
                if (this.current.pred() == this.this$0.header) {
                    this.current = null;
                    return entryWrapEntry;
                }
                this.current = this.current.pred();
                return entryWrapEntry;
            }

            @Override // java.util.Iterator
            public void remove() {
                sij.x(this.prevEntry != null, "no calls to next() since the last call to remove()");
                this.this$0.setCount(this.prevEntry.getElement(), 0);
                this.prevEntry = null;
            }
        };
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ SortedMultiset descendingMultiset() {
        return super.descendingMultiset();
    }

    @Override // com.google.common.collect.AbstractMultiset
    public int distinctElements() {
        return sfy.ab(aggregateForEntries(Aggregate.DISTINCT));
    }

    @Override // com.google.common.collect.AbstractMultiset
    public Iterator<E> elementIterator() {
        return Multisets.elementIterator(entryIterator());
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ NavigableSet elementSet() {
        return super.elementSet();
    }

    @Override // com.google.common.collect.AbstractMultiset
    public Iterator<Multiset.Entry<E>> entryIterator() {
        return new Iterator<Multiset.Entry<E>>(this) { // from class: com.google.common.collect.TreeMultiset.2
            AvlNode<E> current;
            Multiset.Entry<E> prevEntry;
            final /* synthetic */ TreeMultiset this$0;

            {
                this.getClass();
                this.this$0 = this;
                this.current = this.firstNode();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.current == null) {
                    return false;
                }
                if (!this.this$0.range.tooHigh(this.current.getElement())) {
                    return true;
                }
                this.current = null;
                return false;
            }

            @Override // java.util.Iterator
            public Multiset.Entry<E> next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                TreeMultiset treeMultiset = this.this$0;
                AvlNode<E> avlNode = this.current;
                avlNode.getClass();
                Multiset.Entry<E> entryWrapEntry = treeMultiset.wrapEntry(avlNode);
                this.prevEntry = entryWrapEntry;
                if (this.current.succ() == this.this$0.header) {
                    this.current = null;
                    return entryWrapEntry;
                }
                this.current = this.current.succ();
                return entryWrapEntry;
            }

            @Override // java.util.Iterator
            public void remove() {
                sij.x(this.prevEntry != null, "no calls to next() since the last call to remove()");
                this.this$0.setCount(this.prevEntry.getElement(), 0);
                this.prevEntry = null;
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ Multiset.Entry firstEntry() {
        return super.firstEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    public SortedMultiset<E> headMultiset(E e, BoundType boundType) {
        return new TreeMultiset(this.rootReference, this.range.intersect(GeneralRange.upTo(comparator(), e, boundType)), this.header);
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public Iterator<E> iterator() {
        return Multisets.iteratorImpl(this);
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ Multiset.Entry lastEntry() {
        return super.lastEntry();
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ Multiset.Entry pollFirstEntry() {
        return super.pollFirstEntry();
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ Multiset.Entry pollLastEntry() {
        return super.pollLastEntry();
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public int remove(Object obj, int i) {
        CollectPreconditions.checkNonnegative(i, "occurrences");
        if (i == 0) {
            return count(obj);
        }
        AvlNode<E> avlNode = this.rootReference.get();
        int[] iArr = new int[1];
        try {
            if (this.range.contains(obj) && avlNode != null) {
                this.rootReference.checkAndSet(avlNode, avlNode.remove(comparator(), obj, i, iArr));
                return iArr[0];
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public int setCount(E e, int i) {
        CollectPreconditions.checkNonnegative(i, "count");
        if (!this.range.contains(e)) {
            a.H(i == 0);
            return 0;
        }
        AvlNode<E> avlNode = this.rootReference.get();
        if (avlNode == null) {
            if (i > 0) {
                add(e, i);
            }
            return 0;
        }
        int[] iArr = new int[1];
        this.rootReference.checkAndSet(avlNode, avlNode.setCount(comparator(), e, i, iArr));
        return iArr[0];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
        return sfy.ab(aggregateForEntries(Aggregate.SIZE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ SortedMultiset subMultiset(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        return super.subMultiset(obj, boundType, obj2, boundType2);
    }

    @Override // com.google.common.collect.SortedMultiset
    public SortedMultiset<E> tailMultiset(E e, BoundType boundType) {
        return new TreeMultiset(this.rootReference, this.range.intersect(GeneralRange.downTo(comparator(), e, boundType)), this.header);
    }

    public TreeMultiset(Comparator<? super E> comparator) {
        super(comparator);
        this.range = GeneralRange.all(comparator);
        AvlNode<E> avlNode = new AvlNode<>();
        this.header = avlNode;
        successor(avlNode, avlNode);
        this.rootReference = new Reference<>();
    }

    public static <E extends Comparable> TreeMultiset<E> create(Iterable<? extends E> iterable) {
        TreeMultiset<E> treeMultisetCreate = create();
        Iterables.addAll(treeMultisetCreate, iterable);
        return treeMultisetCreate;
    }

    static int distinctElements(AvlNode<?> avlNode) {
        if (avlNode == null) {
            return 0;
        }
        return ((AvlNode) avlNode).distinctElements;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void successor(AvlNode<T> avlNode, AvlNode<T> avlNode2, AvlNode<T> avlNode3) {
        successor(avlNode, avlNode2);
        successor(avlNode2, avlNode3);
    }

    public static <E> TreeMultiset<E> create(Comparator<? super E> comparator) {
        if (comparator == null) {
            return new TreeMultiset<>(Ordering.natural());
        }
        return new TreeMultiset<>(comparator);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public boolean setCount(E e, int i, int i2) {
        CollectPreconditions.checkNonnegative(i2, "newCount");
        CollectPreconditions.checkNonnegative(i, "oldCount");
        a.H(this.range.contains(e));
        AvlNode<E> avlNode = this.rootReference.get();
        if (avlNode != null) {
            int[] iArr = new int[1];
            this.rootReference.checkAndSet(avlNode, avlNode.setCount(comparator(), e, i, i2, iArr));
            return iArr[0] == i;
        }
        if (i != 0) {
            return false;
        }
        if (i2 > 0) {
            add(e, i2);
        }
        return true;
    }
}
