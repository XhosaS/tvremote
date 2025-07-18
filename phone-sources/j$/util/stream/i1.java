package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes4.dex */
public final class i1 extends c1 implements Spliterator.OfLong {
    @Override // j$.util.stream.c1
    public final void d() {
        V0 v0 = new V0();
        this.h = v0;
        this.e = this.b.o(new h1(v0, 1));
        this.f = new j$.desugar.sun.nio.fs.h(16, this);
    }

    @Override // j$.util.stream.c1
    public final c1 e(Spliterator spliterator) {
        return new i1(this.b, spliterator, this.a);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.desugar.sun.nio.fs.g.g(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.desugar.sun.nio.fs.g.u(this, consumer);
    }

    @Override // j$.util.stream.c1, j$.util.Spliterator
    public final Spliterator.OfLong trySplit() {
        return (Spliterator.OfLong) super.trySplit();
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        boolean zA = a();
        if (zA) {
            V0 v0 = (V0) this.h;
            long j = this.g;
            int iX = v0.x(j);
            longConsumer.accept((v0.b == 0 && iX == 0) ? ((long[]) v0.d)[(int) j] : ((long[][]) v0.e)[iX][(int) (j - v0.c[iX])]);
        }
        return zA;
    }

    @Override // j$.util.stream.c1, j$.util.Spliterator
    public final Spliterator.OfPrimitive trySplit() {
        return (Spliterator.OfLong) super.trySplit();
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final void forEachRemaining(LongConsumer longConsumer) {
        if (this.h == null && !this.i) {
            longConsumer.getClass();
            c();
            h1 h1Var = new h1(longConsumer, 0);
            this.b.n(this.d, h1Var);
            this.i = true;
            return;
        }
        while (tryAdvance(longConsumer)) {
        }
    }

    @Override // j$.util.stream.c1, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (Spliterator.OfLong) super.trySplit();
    }
}
