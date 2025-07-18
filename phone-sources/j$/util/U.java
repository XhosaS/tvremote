package j$.util;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes4.dex */
public final class U extends j$.desugar.sun.nio.fs.g implements Spliterator.OfLong {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.desugar.sun.nio.fs.g.g(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
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

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.desugar.sun.nio.fs.g.u(this, consumer);
    }

    @Override // j$.desugar.sun.nio.fs.g, j$.util.Spliterator.OfDouble, j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ Spliterator.OfLong trySplit() {
        return null;
    }

    @Override // j$.util.Spliterator.OfLong
    public final void forEachRemaining(LongConsumer longConsumer) {
        longConsumer.getClass();
    }

    @Override // j$.util.Spliterator.OfLong
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        return false;
    }

    @Override // j$.desugar.sun.nio.fs.g, j$.util.Spliterator.OfDouble, j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return null;
    }
}
