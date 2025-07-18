package j$.util.stream;

import java.util.function.Consumer;

/* loaded from: classes4.dex */
public final class F0 extends G0 {
    @Override // j$.util.stream.G0, j$.util.stream.Stream
    public final void forEach(Consumer consumer) {
        if (this.a.k) {
            super.forEach(consumer);
        } else {
            l().forEachRemaining(consumer);
        }
    }

    @Override // j$.util.stream.G0, j$.util.stream.Stream
    public final void forEachOrdered(Consumer consumer) {
        if (this.a.k) {
            super.forEachOrdered(consumer);
        } else {
            l().forEachRemaining(consumer);
        }
    }

    @Override // j$.util.stream.AbstractC0111a
    public final boolean i() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC0111a
    public final K0 j(int i, K0 k0) {
        throw new UnsupportedOperationException();
    }
}
