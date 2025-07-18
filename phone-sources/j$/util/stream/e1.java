package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes4.dex */
public final class e1 extends c1 implements Spliterator.OfDouble {
    @Override // j$.util.stream.c1
    public final void d() {
        R0 r0 = new R0();
        this.h = r0;
        this.e = this.b.o(new d1(r0, 1));
        this.f = new j$.desugar.sun.nio.fs.h(14, this);
    }

    @Override // j$.util.stream.c1
    public final c1 e(Spliterator spliterator) {
        return new e1(this.b, spliterator, this.a);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.desugar.sun.nio.fs.g.e(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.desugar.sun.nio.fs.g.s(this, consumer);
    }

    @Override // j$.util.stream.c1, j$.util.Spliterator
    public final Spliterator.OfDouble trySplit() {
        return (Spliterator.OfDouble) super.trySplit();
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        boolean zA = a();
        if (zA) {
            R0 r0 = (R0) this.h;
            long j = this.g;
            int iX = r0.x(j);
            doubleConsumer.accept((r0.b == 0 && iX == 0) ? ((double[]) r0.d)[(int) j] : ((double[][]) r0.e)[iX][(int) (j - r0.c[iX])]);
        }
        return zA;
    }

    @Override // j$.util.stream.c1, j$.util.Spliterator
    public final Spliterator.OfPrimitive trySplit() {
        return (Spliterator.OfDouble) super.trySplit();
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        if (this.h == null && !this.i) {
            doubleConsumer.getClass();
            c();
            d1 d1Var = new d1(doubleConsumer, 0);
            this.b.n(this.d, d1Var);
            this.i = true;
            return;
        }
        while (tryAdvance(doubleConsumer)) {
        }
    }

    @Override // j$.util.stream.c1, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (Spliterator.OfDouble) super.trySplit();
    }
}
