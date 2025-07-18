package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;

/* renamed from: j$.util.stream.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0117d extends CountedCompleter {
    public static final int g = ForkJoinPool.getCommonPoolParallelism() << 2;
    public final AbstractC0111a a;
    public Spliterator b;
    public long c;
    public AbstractC0117d d;
    public AbstractC0117d e;
    public Object f;

    public AbstractC0117d(AbstractC0111a abstractC0111a, Spliterator spliterator) {
        super(null);
        this.a = abstractC0111a;
        this.b = spliterator;
        this.c = 0L;
    }

    public static long g(long j) {
        long j2 = j / g;
        if (j2 > 0) {
            return j2;
        }
        return 1L;
    }

    public abstract Object a();

    public final AbstractC0117d b() {
        return (AbstractC0117d) getCompleter();
    }

    public final boolean c() {
        AbstractC0117d abstractC0117d = this;
        while (abstractC0117d != null) {
            AbstractC0117d abstractC0117d2 = (AbstractC0117d) abstractC0117d.getCompleter();
            if (abstractC0117d2 != null && abstractC0117d2.d != abstractC0117d) {
                return false;
            }
            abstractC0117d = abstractC0117d2;
        }
        return true;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.b;
        long jEstimateSize = spliterator.estimateSize();
        long jG = this.c;
        if (jG == 0) {
            jG = g(jEstimateSize);
            this.c = jG;
        }
        boolean z = false;
        AbstractC0117d abstractC0117d = this;
        while (jEstimateSize > jG && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            AbstractC0117d abstractC0117dE = abstractC0117d.e(spliteratorTrySplit);
            abstractC0117d.d = abstractC0117dE;
            AbstractC0117d abstractC0117dE2 = abstractC0117d.e(spliterator);
            abstractC0117d.e = abstractC0117dE2;
            abstractC0117d.setPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
                abstractC0117d = abstractC0117dE;
                abstractC0117dE = abstractC0117dE2;
            } else {
                abstractC0117d = abstractC0117dE2;
            }
            z = !z;
            abstractC0117dE.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        abstractC0117d.f(abstractC0117d.a());
        abstractC0117d.tryComplete();
    }

    public final boolean d() {
        return ((AbstractC0117d) getCompleter()) == null;
    }

    public abstract AbstractC0117d e(Spliterator spliterator);

    public void f(Object obj) {
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

    public AbstractC0117d(AbstractC0117d abstractC0117d, Spliterator spliterator) {
        super(abstractC0117d);
        this.b = spliterator;
        this.a = abstractC0117d.a;
        this.c = abstractC0117d.c;
    }
}
