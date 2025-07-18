package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;

/* renamed from: j$.util.stream.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0017c extends CountedCompleter {
    public static final int g = ForkJoinPool.getCommonPoolParallelism() << 2;
    public final F a;
    public Spliterator b;
    public long c;
    public AbstractC0017c d;
    public AbstractC0017c e;
    public Object f;

    public AbstractC0017c(F f, Spliterator spliterator) {
        super(null);
        this.a = f;
        this.b = spliterator;
        this.c = 0L;
    }

    public static long d(long j) {
        long j2 = j / g;
        if (j2 > 0) {
            return j2;
        }
        return 1L;
    }

    public abstract Object a();

    public abstract AbstractC0017c b(Spliterator spliterator);

    public void c(Object obj) {
        this.f = obj;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.b;
        long jEstimateSize = spliterator.estimateSize();
        long jD = this.c;
        if (jD == 0) {
            jD = d(jEstimateSize);
            this.c = jD;
        }
        boolean z = false;
        AbstractC0017c abstractC0017c = this;
        while (jEstimateSize > jD && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            AbstractC0017c abstractC0017cB = abstractC0017c.b(spliteratorTrySplit);
            abstractC0017c.d = abstractC0017cB;
            AbstractC0017c abstractC0017cB2 = abstractC0017c.b(spliterator);
            abstractC0017c.e = abstractC0017cB2;
            abstractC0017c.setPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
                abstractC0017c = abstractC0017cB;
                abstractC0017cB = abstractC0017cB2;
            } else {
                abstractC0017c = abstractC0017cB2;
            }
            z = !z;
            abstractC0017cB.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        abstractC0017c.c(abstractC0017c.a());
        abstractC0017c.tryComplete();
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

    public AbstractC0017c(AbstractC0017c abstractC0017c, Spliterator spliterator) {
        super(abstractC0017c);
        this.b = spliterator;
        this.a = abstractC0017c.a;
        this.c = abstractC0017c.c;
    }
}
