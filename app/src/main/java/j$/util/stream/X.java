package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final class X extends Z {
    @Override // j$.util.stream.Z, j$.util.stream.Stream
    public final void forEach(Consumer consumer) {
        AbstractC0083a abstractC0083a = this.a;
        if (abstractC0083a.j) {
            super.forEach(consumer);
            return;
        }
        if (this != abstractC0083a) {
            throw new IllegalStateException();
        }
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        Spliterator spliterator = abstractC0083a.g;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        abstractC0083a.g = null;
        spliterator.forEachRemaining(consumer);
    }

    @Override // j$.util.stream.AbstractC0083a
    public final boolean h() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC0083a
    public final c0 i(c0 c0Var) {
        throw new UnsupportedOperationException();
    }
}
