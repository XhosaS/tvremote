package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
public final class E extends F {
    @Override // j$.util.stream.AbstractC0015a
    public final boolean d() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC0015a
    public final G e(G g) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.F
    public final void i(j$.util.concurrent.w wVar) {
        AbstractC0015a abstractC0015a = this.a;
        if (abstractC0015a.j) {
            super.i(wVar);
            return;
        }
        if (this != abstractC0015a) {
            throw new IllegalStateException();
        }
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        Spliterator spliterator = abstractC0015a.g;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        abstractC0015a.g = null;
        spliterator.forEachRemaining(wVar);
    }
}
