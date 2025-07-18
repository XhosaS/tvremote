package j$.util;

import j$.util.Spliterator;
import java.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes4.dex */
public final class Spliterators {
    public static final V a = new V();
    public static final T b = new T();
    public static final U c = new U();
    public static final S d = new S();

    public static abstract class AbstractSpliterator<T> implements Spliterator<T> {
        public final int a;
        public long b;
        public int c;

        public AbstractSpliterator(long j, int i) {
            this.b = j;
            this.a = (i & 64) != 0 ? i | 16384 : i;
        }

        @Override // j$.util.Spliterator
        public final int characteristics() {
            return this.a;
        }

        @Override // j$.util.Spliterator
        public final long estimateSize() {
            return this.b;
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Spliterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ java.util.Comparator getComparator() {
            return Spliterator.CC.$default$getComparator(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ long getExactSizeIfKnown() {
            return Spliterator.CC.$default$getExactSizeIfKnown(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean hasCharacteristics(int i) {
            return Spliterator.CC.$default$hasCharacteristics(this, i);
        }

        @Override // j$.util.Spliterator
        public final Spliterator trySplit() {
            O o = new O();
            long j = this.b;
            if (j <= 1 || !tryAdvance(o)) {
                return null;
            }
            int i = this.c + 1024;
            if (i > j) {
                i = (int) j;
            }
            if (i > 33554432) {
                i = 33554432;
            }
            Object[] objArr = new Object[i];
            int i2 = 0;
            do {
                objArr[i2] = o.a;
                i2++;
                if (i2 >= i) {
                    break;
                }
            } while (tryAdvance(o));
            this.c = i2;
            long j2 = this.b;
            if (j2 != Long.MAX_VALUE) {
                this.b = j2 - i2;
            }
            return new P(objArr, 0, i2, this.a);
        }
    }

    public static void a(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i2 < 0) {
                throw new ArrayIndexOutOfBoundsException(i2);
            }
            if (i3 > i) {
                throw new ArrayIndexOutOfBoundsException(i3);
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException("origin(" + i2 + ") > fence(" + i3 + ")");
    }

    public static P b(Object[] objArr, int i, int i2, int i3) {
        objArr.getClass();
        a(objArr.length, i, i2);
        return new P(objArr, i, i2, i3);
    }

    public static PrimitiveIterator$OfDouble iterator(Spliterator.OfDouble ofDouble) {
        ofDouble.getClass();
        return new N(ofDouble);
    }

    public static Spliterator.OfInt spliterator(int[] iArr, int i, int i2, int i3) {
        iArr.getClass();
        a(iArr.length, i, i2);
        return new W(iArr, i, i2, i3);
    }

    public static <T> Spliterator<T> spliteratorUnknownSize(Iterator<? extends T> it, int i) {
        it.getClass();
        return new X(it, i);
    }

    public static PrimitiveIterator$OfInt iterator(Spliterator.OfInt ofInt) {
        ofInt.getClass();
        return new L(ofInt);
    }

    public static Spliterator.OfLong spliterator(long[] jArr, int i, int i2, int i3) {
        jArr.getClass();
        a(jArr.length, i, i2);
        return new Y(jArr, i, i2, i3);
    }

    public static PrimitiveIterator$OfLong iterator(Spliterator.OfLong ofLong) {
        ofLong.getClass();
        return new M(ofLong);
    }

    public static <T> Iterator<T> iterator(Spliterator<? extends T> spliterator) {
        spliterator.getClass();
        return new K(spliterator);
    }

    public static <T> Spliterator<T> spliterator(java.util.Collection<? extends T> collection, int i) {
        collection.getClass();
        return new X(collection, i);
    }
}
