package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.b0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0114b0 extends AbstractC0118d0 implements Spliterator.OfInt {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.desugar.sun.nio.fs.g.f(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.desugar.sun.nio.fs.g.t(this, consumer);
    }
}
