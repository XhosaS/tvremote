package j$.util.stream;

import j$.util.Spliterator;

/* renamed from: j$.util.stream.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0015a implements BaseStream {
    public final AbstractC0015a a;
    public final F b;
    public final int c;
    public final F d;
    public int e;
    public int f;
    public Spliterator g;
    public boolean h;
    public final boolean i;
    public final boolean j;

    public AbstractC0015a(Spliterator spliterator, int i, boolean z) {
        this.b = null;
        this.g = spliterator;
        this.a = this;
        int i2 = K.g & i;
        this.c = i2;
        this.f = (~(i2 << 1)) & K.l;
        this.e = 0;
        this.j = z;
    }

    public final void a(G g, Spliterator spliterator) {
        g.getClass();
        if (!K.SHORT_CIRCUIT.k(this.f)) {
            g.b(spliterator.getExactSizeIfKnown());
            spliterator.forEachRemaining(g);
            g.end();
            return;
        }
        for (AbstractC0015a abstractC0015a = this; abstractC0015a.e > 0; abstractC0015a = abstractC0015a.b) {
        }
        g.b(spliterator.getExactSizeIfKnown());
        while (!g.c() && spliterator.tryAdvance(g)) {
        }
        g.end();
    }

    public final Object b(N n) {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        if (this.a.j) {
            return n.d((F) this, f(n.f()));
        }
        return n.a((F) this, f(n.f()));
    }

    public final long c(Spliterator spliterator) {
        if (K.SIZED.k(this.f)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.h = true;
        this.g = null;
        this.a.getClass();
    }

    public abstract boolean d();

    public abstract G e(G g);

    public final Spliterator f(int i) {
        AbstractC0015a abstractC0015a = this.a;
        Spliterator spliterator = abstractC0015a.g;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        abstractC0015a.g = null;
        if (abstractC0015a.j && abstractC0015a.i) {
            F f = abstractC0015a.d;
            int i2 = 1;
            while (abstractC0015a != this) {
                int i3 = f.c;
                if (f.d()) {
                    K.SHORT_CIRCUIT.k(i3);
                    throw new UnsupportedOperationException("Parallel evaluation is not supported");
                }
                int i4 = i2 + 1;
                f.e = i2;
                f.f = K.i(i3, abstractC0015a.f);
                F f2 = f;
                f = f.d;
                abstractC0015a = f2;
                i2 = i4;
            }
        }
        if (i != 0) {
            this.f = K.i(i, this.f);
        }
        return spliterator;
    }

    public final G g(G g, Spliterator spliterator) {
        g.getClass();
        a(h(g), spliterator);
        return g;
    }

    public final G h(G g) {
        g.getClass();
        AbstractC0015a abstractC0015a = this;
        while (true) {
            int i = abstractC0015a.e;
            F f = abstractC0015a.b;
            if (i <= 0) {
                return g;
            }
            int i2 = f.f;
            g = abstractC0015a.e(g);
            abstractC0015a = f;
        }
    }

    public AbstractC0015a(F f, int i) {
        if (!f.h) {
            f.h = true;
            f.d = (F) this;
            this.b = f;
            this.c = K.h & i;
            this.f = K.i(i, f.f);
            AbstractC0015a abstractC0015a = f.a;
            this.a = abstractC0015a;
            if (d()) {
                abstractC0015a.i = true;
            }
            this.e = f.e + 1;
            return;
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }
}
