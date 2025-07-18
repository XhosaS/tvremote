package j$.util.stream;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* loaded from: classes4.dex */
public abstract class W0 implements Spliterator.OfPrimitive {
    public int a;
    public final int b;
    public int c;
    public final int d;
    public Object e;
    public final /* synthetic */ X0 f;

    public W0(X0 x0, int i, int i2, int i3, int i4) {
        this.f = x0;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        Object[] objArr = x0.e;
        this.e = objArr == null ? x0.d : objArr[i];
    }

    public abstract void a(int i, Object obj, Object obj2);

    public abstract Spliterator.OfPrimitive b(Object obj, int i, int i2);

    public abstract Spliterator.OfPrimitive c(int i, int i2, int i3, int i4);

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i = this.a;
        int i2 = this.d;
        int i3 = this.b;
        if (i == i3) {
            return i2 - this.c;
        }
        long[] jArr = this.f.c;
        return ((jArr[i3] + i2) - jArr[i]) - this.c;
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final void forEachRemaining(Object obj) {
        X0 x0;
        obj.getClass();
        int i = this.a;
        int i2 = this.d;
        int i3 = this.b;
        if (i < i3 || (i == i3 && this.c < i2)) {
            int i4 = this.c;
            while (true) {
                x0 = this.f;
                if (i >= i3) {
                    break;
                }
                Object obj2 = x0.e[i];
                x0.v(obj2, i4, x0.w(obj2), obj);
                i++;
                i4 = 0;
            }
            x0.v(this.a == i3 ? this.e : x0.e[i3], i4, i2, obj);
            this.a = i3;
            this.c = i2;
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return Spliterator.CC.$default$getComparator(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final boolean tryAdvance(Object obj) {
        obj.getClass();
        int i = this.a;
        int i2 = this.b;
        if (i >= i2 && (i != i2 || this.c >= this.d)) {
            return false;
        }
        Object obj2 = this.e;
        int i3 = this.c;
        this.c = i3 + 1;
        a(i3, obj2, obj);
        int i4 = this.c;
        Object obj3 = this.e;
        X0 x0 = this.f;
        if (i4 == x0.w(obj3)) {
            this.c = 0;
            int i5 = this.a + 1;
            this.a = i5;
            Object[] objArr = x0.e;
            if (objArr != null && i5 <= i2) {
                this.e = objArr[i5];
            }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator.OfPrimitive trySplit() {
        int i = this.a;
        int i2 = this.b;
        if (i < i2) {
            int i3 = i2 - 1;
            int i4 = this.c;
            X0 x0 = this.f;
            Spliterator.OfPrimitive ofPrimitiveC = c(i, i3, i4, x0.w(x0.e[i3]));
            this.a = i2;
            this.c = 0;
            this.e = x0.e[i2];
            return ofPrimitiveC;
        }
        if (i != i2) {
            return null;
        }
        int i5 = this.c;
        int i6 = (this.d - i5) / 2;
        if (i6 == 0) {
            return null;
        }
        Spliterator.OfPrimitive ofPrimitiveB = b(this.e, i5, i6);
        this.c += i6;
        return ofPrimitiveB;
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    @Override // j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator.OfInt trySplit() {
        return (Spliterator.OfInt) trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    @Override // j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator.OfLong trySplit() {
        return (Spliterator.OfLong) trySplit();
    }

    @Override // j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator.OfDouble trySplit() {
        return (Spliterator.OfDouble) trySplit();
    }
}
