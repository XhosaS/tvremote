package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes4.dex */
public final class S0 extends W0 implements Spliterator.OfInt {
    public final /* synthetic */ T0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S0(T0 t0, int i, int i2, int i3, int i4) {
        super(t0, i, i2, i3, i4);
        this.g = t0;
    }

    @Override // j$.util.stream.W0
    public final void a(int i, Object obj, Object obj2) {
        ((IntConsumer) obj2).accept(((int[]) obj)[i]);
    }

    @Override // j$.util.stream.W0
    public final Spliterator.OfPrimitive b(Object obj, int i, int i2) {
        return Spliterators.spliterator((int[]) obj, i, i2 + i, 1040);
    }

    @Override // j$.util.stream.W0
    public final Spliterator.OfPrimitive c(int i, int i2, int i3, int i4) {
        return new S0(this.g, i, i2, i3, i4);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.desugar.sun.nio.fs.g.f(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.desugar.sun.nio.fs.g.t(this, consumer);
    }
}
