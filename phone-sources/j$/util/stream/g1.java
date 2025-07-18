package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes4.dex */
public final class g1 extends c1 implements Spliterator.OfInt {
    @Override // j$.util.stream.c1
    public final void d() {
        T0 t0 = new T0();
        this.h = t0;
        this.e = this.b.o(new f1(t0, 1));
        this.f = new j$.desugar.sun.nio.fs.h(15, this);
    }

    @Override // j$.util.stream.c1
    public final c1 e(Spliterator spliterator) {
        return new g1(this.b, spliterator, this.a);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.desugar.sun.nio.fs.g.f(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.desugar.sun.nio.fs.g.t(this, consumer);
    }

    @Override // j$.util.stream.c1, j$.util.Spliterator
    public final Spliterator.OfInt trySplit() {
        return (Spliterator.OfInt) super.trySplit();
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        boolean zA = a();
        if (zA) {
            T0 t0 = (T0) this.h;
            long j = this.g;
            int iX = t0.x(j);
            intConsumer.accept((t0.b == 0 && iX == 0) ? ((int[]) t0.d)[(int) j] : ((int[][]) t0.e)[iX][(int) (j - t0.c[iX])]);
        }
        return zA;
    }

    @Override // j$.util.stream.c1, j$.util.Spliterator
    public final Spliterator.OfPrimitive trySplit() {
        return (Spliterator.OfInt) super.trySplit();
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final void forEachRemaining(IntConsumer intConsumer) {
        if (this.h == null && !this.i) {
            intConsumer.getClass();
            c();
            f1 f1Var = new f1(intConsumer, 0);
            this.b.n(this.d, f1Var);
            this.i = true;
            return;
        }
        while (tryAdvance(intConsumer)) {
        }
    }

    @Override // j$.util.stream.c1, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (Spliterator.OfInt) super.trySplit();
    }
}
