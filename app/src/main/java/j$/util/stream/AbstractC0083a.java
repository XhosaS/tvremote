package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0083a implements InterfaceC0087e {
    public final AbstractC0083a a;
    public final AbstractC0083a b;
    public final int c;
    public final AbstractC0083a d;
    public int e;
    public int f;
    public Spliterator g;
    public boolean h;
    public final boolean i;
    public boolean j;

    public AbstractC0083a(Spliterator spliterator, int i, boolean z) {
        this.b = null;
        this.g = spliterator;
        this.a = this;
        int i2 = k0.g & i;
        this.c = i2;
        this.f = (~(i2 << 1)) & k0.l;
        this.e = 0;
        this.j = z;
    }

    public final void a(Spliterator spliterator, c0 c0Var) {
        c0Var.getClass();
        if (!k0.SHORT_CIRCUIT.t(this.f)) {
            c0Var.d(spliterator.getExactSizeIfKnown());
            spliterator.forEachRemaining(c0Var);
            c0Var.end();
        } else {
            AbstractC0083a abstractC0083a = this;
            while (abstractC0083a.e > 0) {
                abstractC0083a = abstractC0083a.b;
            }
            c0Var.d(spliterator.getExactSizeIfKnown());
            abstractC0083a.f(spliterator, c0Var);
            c0Var.end();
        }
    }

    public final Object b(s0 s0Var) {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        return this.a.j ? s0Var.b(this, j(s0Var.c())) : s0Var.a(this, j(s0Var.c()));
    }

    public final InterfaceC0100s c(IntFunction intFunction) {
        AbstractC0083a abstractC0083a;
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        AbstractC0083a abstractC0083a2 = this.a;
        if (abstractC0083a2.j && (abstractC0083a = this.b) != null && h()) {
            this.e = 0;
            abstractC0083a.j(0);
            throw new UnsupportedOperationException("Parallel evaluation is not supported");
        }
        Spliterator spliteratorJ = j(0);
        if (abstractC0083a2.j) {
            return d(this, spliteratorJ, intFunction);
        }
        InterfaceC0098p interfaceC0098pG = g(e(spliteratorJ), intFunction);
        l(spliteratorJ, interfaceC0098pG);
        return interfaceC0098pG.build();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.h = true;
        this.g = null;
        this.a.getClass();
    }

    public abstract InterfaceC0100s d(AbstractC0083a abstractC0083a, Spliterator spliterator, IntFunction intFunction);

    public final long e(Spliterator spliterator) {
        if (k0.SIZED.t(this.f)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    public abstract boolean f(Spliterator spliterator, c0 c0Var);

    public abstract InterfaceC0098p g(long j, IntFunction intFunction);

    public abstract boolean h();

    public abstract c0 i(c0 c0Var);

    public final Spliterator j(int i) {
        AbstractC0083a abstractC0083a = this.a;
        Spliterator spliterator = abstractC0083a.g;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        abstractC0083a.g = null;
        if (abstractC0083a.j && abstractC0083a.i) {
            AbstractC0083a abstractC0083a2 = abstractC0083a.d;
            int i2 = 1;
            while (abstractC0083a != this) {
                int i3 = abstractC0083a2.c;
                if (abstractC0083a2.h()) {
                    k0.SHORT_CIRCUIT.t(i3);
                    throw new UnsupportedOperationException("Parallel evaluation is not supported");
                }
                int i4 = i2 + 1;
                abstractC0083a2.e = i2;
                abstractC0083a2.f = k0.i(i3, abstractC0083a.f);
                AbstractC0083a abstractC0083a3 = abstractC0083a2;
                abstractC0083a2 = abstractC0083a2.d;
                abstractC0083a = abstractC0083a3;
                i2 = i4;
            }
        }
        if (i != 0) {
            this.f = k0.i(i, this.f);
        }
        return spliterator;
    }

    public abstract Spliterator k(AbstractC0083a abstractC0083a, j$.desugar.sun.nio.fs.h hVar, boolean z);

    public final c0 l(Spliterator spliterator, c0 c0Var) {
        c0Var.getClass();
        a(spliterator, m(c0Var));
        return c0Var;
    }

    public final c0 m(c0 c0Var) {
        c0Var.getClass();
        AbstractC0083a abstractC0083a = this;
        while (true) {
            int i = abstractC0083a.e;
            AbstractC0083a abstractC0083a2 = abstractC0083a.b;
            if (i <= 0) {
                return c0Var;
            }
            int i2 = abstractC0083a2.f;
            c0Var = abstractC0083a.i(c0Var);
            abstractC0083a = abstractC0083a2;
        }
    }

    @Override // j$.util.stream.InterfaceC0087e
    public final AbstractC0083a sequential() {
        this.a.j = false;
        return this;
    }

    @Override // j$.util.stream.InterfaceC0087e
    public final Spliterator spliterator() {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        AbstractC0083a abstractC0083a = this.a;
        if (this != abstractC0083a) {
            return k(this, new j$.desugar.sun.nio.fs.h(4, this), abstractC0083a.j);
        }
        Spliterator spliterator = abstractC0083a.g;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        abstractC0083a.g = null;
        return spliterator;
    }

    public AbstractC0083a(AbstractC0083a abstractC0083a, int i) {
        if (!abstractC0083a.h) {
            abstractC0083a.h = true;
            abstractC0083a.d = this;
            this.b = abstractC0083a;
            this.c = k0.h & i;
            this.f = k0.i(i, abstractC0083a.f);
            AbstractC0083a abstractC0083a2 = abstractC0083a.a;
            this.a = abstractC0083a2;
            if (h()) {
                abstractC0083a2.i = true;
            }
            this.e = abstractC0083a.e + 1;
            return;
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }
}
