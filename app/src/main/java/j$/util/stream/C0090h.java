package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* renamed from: j$.util.stream.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0090h extends CountedCompleter {
    public Spliterator a;
    public final c0 b;
    public final AbstractC0083a c;
    public long d;

    public C0090h(AbstractC0083a abstractC0083a, Spliterator spliterator, c0 c0Var) {
        super(null);
        this.b = c0Var;
        this.c = abstractC0083a;
        this.a = spliterator;
        this.d = 0L;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.a;
        long jEstimateSize = spliterator.estimateSize();
        long jE = this.d;
        if (jE == 0) {
            jE = AbstractC0086d.e(jEstimateSize);
            this.d = jE;
        }
        boolean zT = k0.SHORT_CIRCUIT.t(this.c.f);
        c0 c0Var = this.b;
        boolean z = false;
        C0090h c0090h = this;
        while (true) {
            if (zT && c0Var.g()) {
                break;
            }
            if (jEstimateSize <= jE || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                break;
            }
            C0090h c0090h2 = new C0090h(c0090h, spliteratorTrySplit);
            c0090h.addToPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
            } else {
                C0090h c0090h3 = c0090h;
                c0090h = c0090h2;
                c0090h2 = c0090h3;
            }
            z = !z;
            c0090h.fork();
            c0090h = c0090h2;
            jEstimateSize = spliterator.estimateSize();
        }
        c0090h.c.a(spliterator, c0Var);
        c0090h.a = null;
        c0090h.propagateCompletion();
    }

    public C0090h(C0090h c0090h, Spliterator spliterator) {
        super(c0090h);
        this.a = spliterator;
        this.b = c0090h.b;
        this.d = c0090h.d;
        this.c = c0090h.c;
    }
}
