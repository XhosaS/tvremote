package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* renamed from: j$.util.stream.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0020f extends CountedCompleter {
    public Spliterator a;
    public final G b;
    public final F c;
    public long d;

    public C0020f(F f, Spliterator spliterator, G g) {
        super(null);
        this.b = g;
        this.c = f;
        this.a = spliterator;
        this.d = 0L;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.a;
        long jEstimateSize = spliterator.estimateSize();
        long jD = this.d;
        if (jD == 0) {
            jD = AbstractC0017c.d(jEstimateSize);
            this.d = jD;
        }
        boolean zK = K.SHORT_CIRCUIT.k(this.c.f);
        G g = this.b;
        boolean z = false;
        C0020f c0020f = this;
        while (true) {
            if (zK && g.c()) {
                break;
            }
            if (jEstimateSize <= jD || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                break;
            }
            C0020f c0020f2 = new C0020f(c0020f, spliteratorTrySplit);
            c0020f.addToPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
            } else {
                C0020f c0020f3 = c0020f;
                c0020f = c0020f2;
                c0020f2 = c0020f3;
            }
            z = !z;
            c0020f.fork();
            c0020f = c0020f2;
            jEstimateSize = spliterator.estimateSize();
        }
        c0020f.c.a(g, spliterator);
        c0020f.a = null;
        c0020f.propagateCompletion();
    }

    public C0020f(C0020f c0020f, Spliterator spliterator) {
        super(c0020f);
        this.a = spliterator;
        this.b = c0020f.b;
        this.d = c0020f.d;
        this.c = c0020f.c;
    }
}
