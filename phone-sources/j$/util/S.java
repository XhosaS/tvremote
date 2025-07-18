package j$.util;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes4.dex */
public final class S extends j$.desugar.sun.nio.fs.g implements Spliterator.OfDouble {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.desugar.sun.nio.fs.g.e(this, consumer);
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
        return j$.desugar.sun.nio.fs.g.s(this, consumer);
    }

    @Override // j$.desugar.sun.nio.fs.g, j$.util.Spliterator.OfDouble, j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ Spliterator.OfDouble trySplit() {
        return null;
    }

    @Override // j$.util.Spliterator.OfDouble
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
    }

    @Override // j$.util.Spliterator.OfDouble
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        return false;
    }

    @Override // j$.desugar.sun.nio.fs.g, j$.util.Spliterator.OfDouble, j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return null;
    }
}
