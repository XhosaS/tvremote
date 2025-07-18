package j$.util.stream;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
public final class r0 implements Spliterator.OfInt {
    public int a;
    public final int b;

    public r0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17749;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return (this.b - this.a) + 0;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.desugar.sun.nio.fs.g.e(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return null;
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
        intConsumer.getClass();
        int i = this.b;
        this.a = i;
        for (int i2 = this.a; i2 < i; i2++) {
            intConsumer.accept(i2);
        }
    }

    @Override // j$.util.F
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        int i = this.a;
        if (i >= this.b) {
            return false;
        }
        this.a = i + 1;
        intConsumer.accept(i);
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator.OfInt trySplit() {
        long jEstimateSize = estimateSize();
        if (jEstimateSize <= 1) {
            return null;
        }
        int i = this.a;
        int i2 = ((int) (jEstimateSize / (jEstimateSize < 16777216 ? 2 : 8))) + i;
        this.a = i2;
        return new r0(i, i2);
    }
}
