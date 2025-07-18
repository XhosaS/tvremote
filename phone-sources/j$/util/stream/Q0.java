package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes4.dex */
public final class Q0 extends W0 implements Spliterator.OfDouble {
    public final /* synthetic */ R0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q0(R0 r0, int i, int i2, int i3, int i4) {
        super(r0, i, i2, i3, i4);
        this.g = r0;
    }

    @Override // j$.util.stream.W0
    public final void a(int i, Object obj, Object obj2) {
        ((DoubleConsumer) obj2).accept(((double[]) obj)[i]);
    }

    @Override // j$.util.stream.W0
    public final Spliterator.OfPrimitive b(Object obj, int i, int i2) {
        double[] dArr = (double[]) obj;
        int i3 = i2 + i;
        dArr.getClass();
        Spliterators.a(dArr.length, i, i3);
        return new j$.util.Q(dArr, i, i3, 1040);
    }

    @Override // j$.util.stream.W0
    public final Spliterator.OfPrimitive c(int i, int i2, int i3, int i4) {
        return new Q0(this.g, i, i2, i3, i4);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.desugar.sun.nio.fs.g.e(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.desugar.sun.nio.fs.g.s(this, consumer);
    }
}
