package com.google.common.collect;

import defpackage.a;
import defpackage.sij;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class GeneralRange<T> implements Serializable {
    private final Comparator<? super T> comparator;
    private final boolean hasLowerBound;
    private final boolean hasUpperBound;
    private final BoundType lowerBoundType;
    private final T lowerEndpoint;
    private transient GeneralRange<T> reverse;
    private final BoundType upperBoundType;
    private final T upperEndpoint;

    /* JADX WARN: Multi-variable type inference failed */
    private GeneralRange(Comparator<? super T> comparator, boolean z, T t, BoundType boundType, boolean z2, T t2, BoundType boundType2) {
        comparator.getClass();
        this.comparator = comparator;
        this.hasLowerBound = z;
        this.hasUpperBound = z2;
        this.lowerEndpoint = t;
        boundType.getClass();
        this.lowerBoundType = boundType;
        this.upperEndpoint = t2;
        boundType2.getClass();
        this.upperBoundType = boundType2;
        if (z) {
            comparator.compare(t, t);
        }
        if (z2) {
            comparator.compare(t2, t2);
        }
        if (z && z2) {
            int iCompare = comparator.compare(t, t2);
            sij.v(iCompare <= 0, "lowerEndpoint (%s) > upperEndpoint (%s)", t, t2);
            if (iCompare == 0) {
                BoundType boundType3 = BoundType.OPEN;
                a.H((boundType == boundType3 && boundType2 == boundType3) ? false : true);
            }
        }
    }

    static <T> GeneralRange<T> all(Comparator<? super T> comparator) {
        BoundType boundType = BoundType.OPEN;
        return new GeneralRange<>(comparator, false, null, boundType, false, null, boundType);
    }

    static <T> GeneralRange<T> downTo(Comparator<? super T> comparator, T t, BoundType boundType) {
        return new GeneralRange<>(comparator, true, t, boundType, false, null, BoundType.OPEN);
    }

    static <T extends Comparable> GeneralRange<T> from(Range<T> range) {
        return new GeneralRange<>(Ordering.natural(), range.hasLowerBound(), range.hasLowerBound() ? range.lowerEndpoint() : null, range.hasLowerBound() ? range.lowerBoundType() : BoundType.OPEN, range.hasUpperBound(), range.hasUpperBound() ? range.upperEndpoint() : null, range.hasUpperBound() ? range.upperBoundType() : BoundType.OPEN);
    }

    static <T> GeneralRange<T> range(Comparator<? super T> comparator, T t, BoundType boundType, T t2, BoundType boundType2) {
        return new GeneralRange<>(comparator, true, t, boundType, true, t2, boundType2);
    }

    private static <T> Comparator<T> reverseComparator(Comparator<T> comparator) {
        return Ordering.from(comparator).reverse();
    }

    static <T> GeneralRange<T> upTo(Comparator<? super T> comparator, T t, BoundType boundType) {
        return new GeneralRange<>(comparator, false, null, BoundType.OPEN, true, t, boundType);
    }

    public Comparator<? super T> comparator() {
        return this.comparator;
    }

    public boolean contains(T t) {
        return (tooLow(t) || tooHigh(t)) ? false : true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof GeneralRange) {
            GeneralRange generalRange = (GeneralRange) obj;
            if (this.comparator.equals(generalRange.comparator) && this.hasLowerBound == generalRange.hasLowerBound && this.hasUpperBound == generalRange.hasUpperBound && getLowerBoundType().equals(generalRange.getLowerBoundType()) && getUpperBoundType().equals(generalRange.getUpperBoundType()) && a.Q(getLowerEndpoint(), generalRange.getLowerEndpoint()) && a.Q(getUpperEndpoint(), generalRange.getUpperEndpoint())) {
                return true;
            }
        }
        return false;
    }

    public BoundType getLowerBoundType() {
        return this.lowerBoundType;
    }

    public T getLowerEndpoint() {
        return this.lowerEndpoint;
    }

    public BoundType getUpperBoundType() {
        return this.upperBoundType;
    }

    public T getUpperEndpoint() {
        return this.upperEndpoint;
    }

    public boolean hasLowerBound() {
        return this.hasLowerBound;
    }

    public boolean hasUpperBound() {
        return this.hasUpperBound;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.comparator, getLowerEndpoint(), getLowerBoundType(), getUpperEndpoint(), getUpperBoundType()});
    }

    public GeneralRange<T> intersect(GeneralRange<T> generalRange) {
        boolean z;
        int iCompare;
        int iCompare2;
        T t;
        int iCompare3;
        BoundType boundType;
        generalRange.getClass();
        a.H(this.comparator.equals(generalRange.comparator));
        T lowerEndpoint = getLowerEndpoint();
        BoundType lowerBoundType = getLowerBoundType();
        if (hasLowerBound()) {
            boolean z2 = this.hasLowerBound;
            if (generalRange.hasLowerBound() && ((iCompare = this.comparator.compare(getLowerEndpoint(), generalRange.getLowerEndpoint())) < 0 || (iCompare == 0 && generalRange.getLowerBoundType() == BoundType.OPEN))) {
                lowerEndpoint = generalRange.getLowerEndpoint();
                lowerBoundType = generalRange.getLowerBoundType();
            }
            z = z2;
        } else {
            z = generalRange.hasLowerBound;
            lowerEndpoint = generalRange.getLowerEndpoint();
            lowerBoundType = generalRange.getLowerBoundType();
        }
        boolean z3 = this.hasUpperBound;
        T upperEndpoint = getUpperEndpoint();
        BoundType upperBoundType = getUpperBoundType();
        if (!hasUpperBound()) {
            z3 = generalRange.hasUpperBound;
            upperEndpoint = generalRange.getUpperEndpoint();
            upperBoundType = generalRange.getUpperBoundType();
        } else if (generalRange.hasUpperBound() && ((iCompare2 = this.comparator.compare(getUpperEndpoint(), generalRange.getUpperEndpoint())) > 0 || (iCompare2 == 0 && generalRange.getUpperBoundType() == BoundType.OPEN))) {
            upperEndpoint = generalRange.getUpperEndpoint();
            upperBoundType = generalRange.getUpperBoundType();
        }
        boolean z4 = z3;
        T t2 = upperEndpoint;
        if (z && z4 && ((iCompare3 = this.comparator.compare(lowerEndpoint, t2)) > 0 || (iCompare3 == 0 && lowerBoundType == (boundType = BoundType.OPEN) && upperBoundType == boundType))) {
            lowerBoundType = BoundType.OPEN;
            upperBoundType = BoundType.CLOSED;
            t = t2;
        } else {
            t = lowerEndpoint;
        }
        return new GeneralRange<>(this.comparator, z, t, lowerBoundType, z4, t2, upperBoundType);
    }

    boolean isEmpty() {
        if (hasUpperBound() && tooLow(getUpperEndpoint())) {
            return true;
        }
        return hasLowerBound() && tooHigh(getLowerEndpoint());
    }

    GeneralRange<T> reverse() {
        GeneralRange<T> generalRange = this.reverse;
        if (generalRange != null) {
            return generalRange;
        }
        Comparator<? super T> comparator = this.comparator;
        GeneralRange<T> generalRange2 = new GeneralRange<>(reverseComparator(comparator), this.hasUpperBound, getUpperEndpoint(), getUpperBoundType(), this.hasLowerBound, getLowerEndpoint(), getLowerBoundType());
        generalRange2.reverse = this;
        this.reverse = generalRange2;
        return generalRange2;
    }

    public String toString() {
        String strValueOf = String.valueOf(this.comparator);
        BoundType boundType = BoundType.CLOSED;
        String str = this.hasLowerBound ? this.lowerEndpoint : "-∞";
        boolean z = this.hasUpperBound;
        String strValueOf2 = String.valueOf(str);
        String str2 = z ? this.upperEndpoint : "∞";
        char c = this.lowerBoundType == boundType ? '[' : '(';
        BoundType boundType2 = this.upperBoundType;
        return strValueOf + ":" + c + strValueOf2 + "," + String.valueOf(str2) + (boundType2 == BoundType.CLOSED ? ']' : ')');
    }

    public boolean tooHigh(T t) {
        if (!hasUpperBound()) {
            return false;
        }
        int iCompare = this.comparator.compare(t, getUpperEndpoint());
        return ((iCompare == 0) & (getUpperBoundType() == BoundType.OPEN)) | (iCompare > 0);
    }

    public boolean tooLow(T t) {
        if (!hasLowerBound()) {
            return false;
        }
        int iCompare = this.comparator.compare(t, getLowerEndpoint());
        return ((iCompare == 0) & (getLowerBoundType() == BoundType.OPEN)) | (iCompare < 0);
    }
}
