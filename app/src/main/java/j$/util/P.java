package j$.util;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
public final class P implements Spliterator.OfInt {
    public final int[] a;
    public int b;
    public final int c;
    public final int d;

    public P(int[] iArr, int i, int i2, int i3) {
        this.a = iArr;
        this.b = i;
        this.c = i2;
        this.d = i3 | 16448;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.d;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.c - this.b;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.desugar.sun.nio.fs.g.e(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (j$.desugar.sun.nio.fs.g.j(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.desugar.sun.nio.fs.g.h(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.desugar.sun.nio.fs.g.j(this, i);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.desugar.sun.nio.fs.g.s(this, consumer);
    }

    @Override // j$.util.F
    public final void forEachRemaining(IntConsumer intConsumer) {
        int i;
        intConsumer.getClass();
        int[] iArr = this.a;
        int length = iArr.length;
        int i2 = this.c;
        if (length < i2 || (i = this.b) < 0) {
            return;
        }
        this.b = i2;
        if (i < i2) {
            do {
                intConsumer.accept(iArr[i]);
                i++;
            } while (i < i2);
        }
    }

    @Override // j$.util.F
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        int i = this.b;
        if (i < 0 || i >= this.c) {
            return false;
        }
        this.b = i + 1;
        intConsumer.accept(this.a[i]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator.OfInt trySplit() {
        int i = this.b;
        int i2 = (this.c + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        this.b = i2;
        return new P(this.a, i, i2, this.d);
    }
}
