package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* renamed from: j$.util.stream.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0143q extends CountedCompleter {
    public Spliterator a;
    public final K0 b;
    public final AbstractC0111a c;
    public long d;

    public C0143q(AbstractC0111a abstractC0111a, Spliterator spliterator, K0 k0) {
        super(null);
        this.b = k0;
        this.c = abstractC0111a;
        this.a = spliterator;
        this.d = 0L;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.a;
        long jEstimateSize = spliterator.estimateSize();
        long jG = this.d;
        if (jG == 0) {
            jG = AbstractC0117d.g(jEstimateSize);
            this.d = jG;
        }
        boolean zT = a1.SHORT_CIRCUIT.t(this.c.f);
        K0 k0 = this.b;
        boolean z = false;
        C0143q c0143q = this;
        while (true) {
            if (zT && k0.g()) {
                break;
            }
            if (jEstimateSize <= jG || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                break;
            }
            C0143q c0143q2 = new C0143q(c0143q, spliteratorTrySplit);
            c0143q.addToPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
            } else {
                C0143q c0143q3 = c0143q;
                c0143q = c0143q2;
                c0143q2 = c0143q3;
            }
            z = !z;
            c0143q.fork();
            c0143q = c0143q2;
            jEstimateSize = spliterator.estimateSize();
        }
        c0143q.c.a(spliterator, k0);
        c0143q.a = null;
        c0143q.propagateCompletion();
    }

    public C0143q(C0143q c0143q, Spliterator spliterator) {
        super(c0143q);
        this.a = spliterator;
        this.b = c0143q.b;
        this.d = c0143q.d;
        this.c = c0143q.c;
    }
}
