package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes4.dex */
public final class U0 extends W0 implements Spliterator.OfLong {
    public final /* synthetic */ V0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U0(V0 v0, int i, int i2, int i3, int i4) {
        super(v0, i, i2, i3, i4);
        this.g = v0;
    }

    @Override // j$.util.stream.W0
    public final void a(int i, Object obj, Object obj2) {
        ((LongConsumer) obj2).accept(((long[]) obj)[i]);
    }

    @Override // j$.util.stream.W0
    public final Spliterator.OfPrimitive b(Object obj, int i, int i2) {
        return Spliterators.spliterator((long[]) obj, i, i2 + i, 1040);
    }

    @Override // j$.util.stream.W0
    public final Spliterator.OfPrimitive c(int i, int i2, int i3, int i4) {
        return new U0(this.g, i, i2, i3, i4);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.desugar.sun.nio.fs.g.g(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.desugar.sun.nio.fs.g.u(this, consumer);
    }
}
