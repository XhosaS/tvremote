package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public abstract class r extends CountedCompleter implements G {
    public final Spliterator a;
    public final F b;
    public final long c;
    public final long d;
    public final long e;
    public int f;
    public int g;

    public r(Spliterator spliterator, F f, int i) {
        this.a = spliterator;
        this.b = f;
        this.c = AbstractC0017c.d(spliterator.estimateSize());
        this.d = 0L;
        this.e = i;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.G
    public final void b(long j) {
        long j2 = this.e;
        if (j > j2) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i = (int) this.d;
        this.f = i;
        this.g = i + ((int) j2);
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.a;
        r qVar = this;
        while (spliterator.estimateSize() > qVar.c && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            qVar.setPendingCount(1);
            long jEstimateSize = spliteratorTrySplit.estimateSize();
            q qVar2 = (q) qVar;
            new q(qVar2, spliteratorTrySplit, qVar.d, jEstimateSize).fork();
            qVar = new q(qVar2, spliterator, qVar.d + jEstimateSize, qVar.e - jEstimateSize);
        }
        qVar.b.g(qVar, spliterator);
        qVar.propagateCompletion();
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ void end() {
    }

    public r(q qVar, Spliterator spliterator, long j, long j2, int i) {
        super(qVar);
        this.a = spliterator;
        this.b = qVar.b;
        this.c = qVar.c;
        this.d = j;
        this.e = j2;
        if (j < 0 || j2 < 0 || (j + j2) - 1 >= i) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)));
        }
    }
}
