package com.google.common.collect;

import android.support.v7.widget.ActivityChooserView;
import defpackage.sfy;
import defpackage.sij;
import java.io.Serializable;
import java.lang.Comparable;
import java.math.BigInteger;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class DiscreteDomain<C extends Comparable> {
    final boolean supportsFastOffset;

    /* compiled from: PG */
    final class BigIntegerDomain extends DiscreteDomain<BigInteger> implements Serializable {
        private static final long serialVersionUID = 0;
        private static final BigIntegerDomain INSTANCE = new BigIntegerDomain();
        private static final BigInteger MIN_LONG = BigInteger.valueOf(Long.MIN_VALUE);
        private static final BigInteger MAX_LONG = BigInteger.valueOf(Long.MAX_VALUE);

        public BigIntegerDomain() {
            super(true);
        }

        private Object readResolve() {
            return INSTANCE;
        }

        public String toString() {
            return "DiscreteDomain.bigIntegers()";
        }

        @Override // com.google.common.collect.DiscreteDomain
        public long distance(BigInteger bigInteger, BigInteger bigInteger2) {
            return bigInteger2.subtract(bigInteger).max(MIN_LONG).min(MAX_LONG).longValue();
        }

        @Override // com.google.common.collect.DiscreteDomain
        public BigInteger next(BigInteger bigInteger) {
            return bigInteger.add(BigInteger.ONE);
        }

        @Override // com.google.common.collect.DiscreteDomain
        public BigInteger offset(BigInteger bigInteger, long j) {
            CollectPreconditions.checkNonnegative(j, "distance");
            return bigInteger.add(BigInteger.valueOf(j));
        }

        @Override // com.google.common.collect.DiscreteDomain
        public BigInteger previous(BigInteger bigInteger) {
            return bigInteger.subtract(BigInteger.ONE);
        }
    }

    /* compiled from: PG */
    final class IntegerDomain extends DiscreteDomain<Integer> implements Serializable {
        private static final IntegerDomain INSTANCE = new IntegerDomain();
        private static final long serialVersionUID = 0;

        public IntegerDomain() {
            super(true);
        }

        private Object readResolve() {
            return INSTANCE;
        }

        public String toString() {
            return "DiscreteDomain.integers()";
        }

        @Override // com.google.common.collect.DiscreteDomain
        public long distance(Integer num, Integer num2) {
            return num2.intValue() - num.intValue();
        }

        @Override // com.google.common.collect.DiscreteDomain
        public Integer maxValue() {
            return Integer.valueOf(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        }

        @Override // com.google.common.collect.DiscreteDomain
        public Integer minValue() {
            return Integer.MIN_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        public Integer next(Integer num) {
            int iIntValue = num.intValue();
            if (iIntValue == Integer.MAX_VALUE) {
                return null;
            }
            return Integer.valueOf(iIntValue + 1);
        }

        @Override // com.google.common.collect.DiscreteDomain
        public Integer offset(Integer num, long j) {
            CollectPreconditions.checkNonnegative(j, "distance");
            return Integer.valueOf(sfy.W(num.longValue() + j));
        }

        @Override // com.google.common.collect.DiscreteDomain
        public Integer previous(Integer num) {
            int iIntValue = num.intValue();
            if (iIntValue == Integer.MIN_VALUE) {
                return null;
            }
            return Integer.valueOf(iIntValue - 1);
        }
    }

    /* compiled from: PG */
    final class LongDomain extends DiscreteDomain<Long> implements Serializable {
        private static final LongDomain INSTANCE = new LongDomain();
        private static final long serialVersionUID = 0;

        public LongDomain() {
            super(true);
        }

        private Object readResolve() {
            return INSTANCE;
        }

        public String toString() {
            return "DiscreteDomain.longs()";
        }

        @Override // com.google.common.collect.DiscreteDomain
        public long distance(Long l, Long l2) {
            long jLongValue = l2.longValue() - l.longValue();
            if (l2.longValue() > l.longValue() && jLongValue < 0) {
                return Long.MAX_VALUE;
            }
            if (l2.longValue() >= l.longValue() || jLongValue <= 0) {
                return jLongValue;
            }
            return Long.MIN_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        public Long maxValue() {
            return Long.MAX_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        public Long minValue() {
            return Long.MIN_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        public Long next(Long l) {
            long jLongValue = l.longValue();
            if (jLongValue == Long.MAX_VALUE) {
                return null;
            }
            return Long.valueOf(jLongValue + 1);
        }

        @Override // com.google.common.collect.DiscreteDomain
        public Long offset(Long l, long j) {
            CollectPreconditions.checkNonnegative(j, "distance");
            long jLongValue = l.longValue() + j;
            if (jLongValue < 0) {
                sij.o(l.longValue() < 0, "overflow");
            }
            return Long.valueOf(jLongValue);
        }

        @Override // com.google.common.collect.DiscreteDomain
        public Long previous(Long l) {
            long jLongValue = l.longValue();
            if (jLongValue == Long.MIN_VALUE) {
                return null;
            }
            return Long.valueOf(jLongValue - 1);
        }
    }

    private DiscreteDomain(boolean z) {
        this.supportsFastOffset = z;
    }

    public static DiscreteDomain<BigInteger> bigIntegers() {
        return BigIntegerDomain.INSTANCE;
    }

    public static DiscreteDomain<Integer> integers() {
        return IntegerDomain.INSTANCE;
    }

    public static DiscreteDomain<Long> longs() {
        return LongDomain.INSTANCE;
    }

    public abstract long distance(C c, C c2);

    public C maxValue() {
        throw new NoSuchElementException();
    }

    public C minValue() {
        throw new NoSuchElementException();
    }

    public abstract C next(C c);

    public C offset(C c, long j) {
        CollectPreconditions.checkNonnegative(j, "distance");
        C c2 = c;
        for (long j2 = 0; j2 < j; j2++) {
            c2 = (C) next(c2);
            if (c2 == null) {
                throw new IllegalArgumentException("overflowed computing offset(" + String.valueOf(c) + ", " + j + ")");
            }
        }
        return c2;
    }

    public abstract C previous(C c);

    protected DiscreteDomain() {
        this(false);
    }
}
