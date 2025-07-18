package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0111a implements BaseStream {
    public final AbstractC0111a a;
    public final AbstractC0111a b;
    public final int c;
    public final AbstractC0111a d;
    public int e;
    public int f;
    public Spliterator g;
    public boolean h;
    public final boolean i;
    public Runnable j;
    public final boolean k;

    public AbstractC0111a(Spliterator spliterator, int i, boolean z) {
        this.b = null;
        this.g = spliterator;
        this.a = this;
        int i2 = a1.g & i;
        this.c = i2;
        this.f = (~(i2 << 1)) & a1.l;
        this.e = 0;
        this.k = z;
    }

    public final void a(Spliterator spliterator, K0 k0) {
        k0.getClass();
        if (!a1.SHORT_CIRCUIT.t(this.f)) {
            k0.d(spliterator.getExactSizeIfKnown());
            spliterator.forEachRemaining(k0);
            k0.end();
        } else {
            AbstractC0111a abstractC0111a = this;
            while (abstractC0111a.e > 0) {
                abstractC0111a = abstractC0111a.b;
            }
            k0.d(spliterator.getExactSizeIfKnown());
            abstractC0111a.f(spliterator, k0);
            k0.end();
        }
    }

    public final Object b(r1 r1Var) {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        return this.a.k ? r1Var.b(this, k(r1Var.c())) : r1Var.a(this, k(r1Var.c()));
    }

    public final H c(IntFunction intFunction) {
        AbstractC0111a abstractC0111a;
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        AbstractC0111a abstractC0111a2 = this.a;
        if (abstractC0111a2.k && (abstractC0111a = this.b) != null && i()) {
            this.e = 0;
            return h(abstractC0111a, abstractC0111a.k(0), intFunction);
        }
        Spliterator spliteratorK = k(0);
        if (abstractC0111a2.k) {
            return d(this, spliteratorK, intFunction);
        }
        C cG = g(e(spliteratorK), intFunction);
        n(spliteratorK, cG);
        return cG.build();
    }

    @Override // j$.util.stream.BaseStream, java.lang.AutoCloseable
    public final void close() {
        this.h = true;
        this.g = null;
        AbstractC0111a abstractC0111a = this.a;
        Runnable runnable = abstractC0111a.j;
        if (runnable != null) {
            abstractC0111a.j = null;
            runnable.run();
        }
    }

    public abstract H d(AbstractC0111a abstractC0111a, Spliterator spliterator, IntFunction intFunction);

    public final long e(Spliterator spliterator) {
        if (a1.SIZED.t(this.f)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    public abstract boolean f(Spliterator spliterator, K0 k0);

    public abstract C g(long j, IntFunction intFunction);

    public H h(AbstractC0111a abstractC0111a, Spliterator spliterator, IntFunction intFunction) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    public abstract boolean i();

    @Override // j$.util.stream.BaseStream
    public final boolean isParallel() {
        return this.a.k;
    }

    public abstract K0 j(int i, K0 k0);

    public final Spliterator k(int i) {
        int i2;
        int i3;
        AbstractC0111a abstractC0111a = this.a;
        Spliterator spliterator = abstractC0111a.g;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        abstractC0111a.g = null;
        if (abstractC0111a.k && abstractC0111a.i) {
            AbstractC0111a abstractC0111a2 = abstractC0111a.d;
            int i4 = 1;
            while (abstractC0111a != this) {
                int i5 = abstractC0111a2.c;
                if (abstractC0111a2.i()) {
                    if (a1.SHORT_CIRCUIT.t(i5)) {
                        i5 &= ~a1.s;
                    }
                    spliterator = abstractC0111a2.h(abstractC0111a, spliterator, new j$.desugar.sun.nio.fs.n(12)).spliterator();
                    if (spliterator.hasCharacteristics(64)) {
                        i2 = (~a1.r) & i5;
                        i3 = a1.q;
                    } else {
                        i2 = (~a1.q) & i5;
                        i3 = a1.r;
                    }
                    i5 = i2 | i3;
                    i4 = 0;
                }
                int i6 = i4 + 1;
                abstractC0111a2.e = i4;
                abstractC0111a2.f = a1.i(i5, abstractC0111a.f);
                AbstractC0111a abstractC0111a3 = abstractC0111a2;
                abstractC0111a2 = abstractC0111a2.d;
                abstractC0111a = abstractC0111a3;
                i4 = i6;
            }
        }
        if (i != 0) {
            this.f = a1.i(i, this.f);
        }
        return spliterator;
    }

    public final Spliterator l() {
        AbstractC0111a abstractC0111a = this.a;
        if (this != abstractC0111a) {
            throw new IllegalStateException();
        }
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        Spliterator spliterator = abstractC0111a.g;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        abstractC0111a.g = null;
        return spliterator;
    }

    public abstract Spliterator m(AbstractC0111a abstractC0111a, j$.desugar.sun.nio.fs.h hVar, boolean z);

    public final K0 n(Spliterator spliterator, K0 k0) {
        k0.getClass();
        a(spliterator, o(k0));
        return k0;
    }

    public final K0 o(K0 k0) {
        k0.getClass();
        AbstractC0111a abstractC0111a = this;
        while (true) {
            int i = abstractC0111a.e;
            AbstractC0111a abstractC0111a2 = abstractC0111a.b;
            if (i <= 0) {
                return k0;
            }
            k0 = abstractC0111a.j(abstractC0111a2.f, k0);
            abstractC0111a = abstractC0111a2;
        }
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream onClose(Runnable runnable) {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        runnable.getClass();
        AbstractC0111a abstractC0111a = this.a;
        Runnable runnable2 = abstractC0111a.j;
        if (runnable2 != null) {
            runnable = new k1(runnable2, runnable);
        }
        abstractC0111a.j = runnable;
        return this;
    }

    @Override // j$.util.stream.BaseStream
    public Spliterator spliterator() {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        AbstractC0111a abstractC0111a = this.a;
        if (this != abstractC0111a) {
            return m(this, new j$.desugar.sun.nio.fs.h(8, this), abstractC0111a.k);
        }
        Spliterator spliterator = abstractC0111a.g;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        abstractC0111a.g = null;
        return spliterator;
    }

    public AbstractC0111a(AbstractC0111a abstractC0111a, int i) {
        if (!abstractC0111a.h) {
            abstractC0111a.h = true;
            abstractC0111a.d = this;
            this.b = abstractC0111a;
            this.c = a1.h & i;
            this.f = a1.i(i, abstractC0111a.f);
            AbstractC0111a abstractC0111a2 = abstractC0111a.a;
            this.a = abstractC0111a2;
            if (i()) {
                abstractC0111a2.i = true;
            }
            this.e = abstractC0111a.e + 1;
            return;
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }
}
