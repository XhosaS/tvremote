package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
public final class o0 extends m0 implements Spliterator.OfInt {
    @Override // j$.util.stream.m0
    public final void d() {
        f0 f0Var = new f0();
        this.h = f0Var;
        this.e = this.b.m(new n0(f0Var, 1));
        this.f = new j$.desugar.sun.nio.fs.h(9, this);
    }

    @Override // j$.util.stream.m0
    public final m0 e(Spliterator spliterator) {
        return new o0(this.b, spliterator, this.a);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.desugar.sun.nio.fs.g.e(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.desugar.sun.nio.fs.g.s(this, consumer);
    }

    @Override // j$.util.stream.m0, j$.util.Spliterator
    public final Spliterator.OfInt trySplit() {
        return (Spliterator.OfInt) super.trySplit();
    }

    @Override // j$.util.F
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        boolean zA = a();
        if (!zA) {
            return zA;
        }
        f0 f0Var = (f0) this.h;
        long j = this.g;
        int i = 0;
        if (f0Var.b != 0) {
            if (j >= f0Var.count()) {
                throw new IndexOutOfBoundsException(Long.toString(j));
            }
            while (i <= f0Var.b) {
                if (j >= f0Var.c[i] + ((int[]) f0Var.e[i]).length) {
                    i++;
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        if (j >= f0Var.a) {
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        intConsumer.accept((f0Var.b == 0 && i == 0) ? ((int[]) f0Var.d)[(int) j] : ((int[][]) f0Var.e)[i][(int) (j - f0Var.c[i])]);
        return zA;
    }

    @Override // j$.util.stream.m0, j$.util.Spliterator
    public final j$.util.F trySplit() {
        return (Spliterator.OfInt) super.trySplit();
    }

    @Override // j$.util.F
    public final void forEachRemaining(IntConsumer intConsumer) {
        if (this.h == null && !this.i) {
            intConsumer.getClass();
            c();
            n0 n0Var = new n0(intConsumer, 0);
            this.b.l(this.d, n0Var);
            this.i = true;
            return;
        }
        while (tryAdvance(intConsumer)) {
        }
    }

    @Override // j$.util.stream.m0, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (Spliterator.OfInt) super.trySplit();
    }
}
