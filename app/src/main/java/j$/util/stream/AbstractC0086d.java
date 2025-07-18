package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;

/* renamed from: j$.util.stream.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0086d extends CountedCompleter {
    public static final int g = ForkJoinPool.getCommonPoolParallelism() << 2;
    public final AbstractC0083a a;
    public Spliterator b;
    public long c;
    public AbstractC0086d d;
    public AbstractC0086d e;
    public Object f;

    public AbstractC0086d(AbstractC0083a abstractC0083a, Spliterator spliterator) {
        super(null);
        this.a = abstractC0083a;
        this.b = spliterator;
        this.c = 0L;
    }

    public static long e(long j) {
        long j2 = j / g;
        if (j2 > 0) {
            return j2;
        }
        return 1L;
    }

    public abstract Object a();

    public final boolean b() {
        return ((AbstractC0086d) getCompleter()) == null;
    }

    public abstract AbstractC0086d c(Spliterator spliterator);

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.b;
        long jEstimateSize = spliterator.estimateSize();
        long jE = this.c;
        if (jE == 0) {
            jE = e(jEstimateSize);
            this.c = jE;
        }
        boolean z = false;
        AbstractC0086d abstractC0086d = this;
        while (jEstimateSize > jE && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            AbstractC0086d abstractC0086dC = abstractC0086d.c(spliteratorTrySplit);
            abstractC0086d.d = abstractC0086dC;
            AbstractC0086d abstractC0086dC2 = abstractC0086d.c(spliterator);
            abstractC0086d.e = abstractC0086dC2;
            abstractC0086d.setPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
                abstractC0086d = abstractC0086dC;
                abstractC0086dC = abstractC0086dC2;
            } else {
                abstractC0086d = abstractC0086dC2;
            }
            z = !z;
            abstractC0086dC.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        abstractC0086d.d(abstractC0086d.a());
        abstractC0086d.tryComplete();
    }

    public void d(Object obj) {
        this.f = obj;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.b = null;
        this.e = null;
        this.d = null;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }

    public AbstractC0086d(AbstractC0086d abstractC0086d, Spliterator spliterator) {
        super(abstractC0086d);
        this.b = spliterator;
        this.a = abstractC0086d.a;
        this.c = abstractC0086d.c;
    }
}
