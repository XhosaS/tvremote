package j$.util.stream;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.BooleanSupplier;

/* loaded from: classes3.dex */
public abstract class m0 implements Spliterator {
    public final boolean a;
    public final AbstractC0083a b;
    public j$.desugar.sun.nio.fs.h c;
    public Spliterator d;
    public c0 e;
    public BooleanSupplier f;
    public long g;
    public AbstractC0085c h;
    public boolean i;

    public m0(AbstractC0083a abstractC0083a, j$.desugar.sun.nio.fs.h hVar, boolean z) {
        this.b = abstractC0083a;
        this.c = hVar;
        this.d = null;
        this.a = z;
    }

    public final boolean a() {
        AbstractC0085c abstractC0085c = this.h;
        if (abstractC0085c == null) {
            if (this.i) {
                return false;
            }
            c();
            d();
            this.g = 0L;
            this.e.d(this.d.getExactSizeIfKnown());
            return b();
        }
        long j = this.g + 1;
        this.g = j;
        boolean z = j < abstractC0085c.count();
        if (z) {
            return z;
        }
        this.g = 0L;
        this.h.clear();
        return b();
    }

    public final boolean b() {
        while (this.h.count() == 0) {
            if (this.e.g() || !this.f.getAsBoolean()) {
                if (this.i) {
                    return false;
                }
                this.e.end();
                this.i = true;
            }
        }
        return true;
    }

    public final void c() {
        if (this.d == null) {
            this.d = (Spliterator) this.c.get();
            this.c = null;
        }
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        c();
        int i = this.b.f;
        int i2 = i & ((~i) >> 1) & k0.j & k0.f;
        return (i2 & 64) != 0 ? (i2 & (-16449)) | (this.d.characteristics() & 16448) : i2;
    }

    public abstract void d();

    public abstract m0 e(Spliterator spliterator);

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        c();
        return this.d.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (j$.desugar.sun.nio.fs.g.j(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        c();
        if (k0.SIZED.t(this.b.f)) {
            return this.d.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.desugar.sun.nio.fs.g.j(this, i);
    }

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.d);
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        if (!this.a || this.h != null || this.i) {
            return null;
        }
        c();
        Spliterator spliteratorTrySplit = this.d.trySplit();
        if (spliteratorTrySplit == null) {
            return null;
        }
        return e(spliteratorTrySplit);
    }

    public m0(AbstractC0083a abstractC0083a, Spliterator spliterator, boolean z) {
        this.b = abstractC0083a;
        this.c = null;
        this.d = spliterator;
        this.a = z;
    }
}
