package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.n0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0138n0 extends CountedCompleter implements K0 {
    public final Spliterator a;
    public final AbstractC0111a b;
    public final long c;
    public final long d;
    public final long e;
    public int f;
    public int g;

    public AbstractC0138n0(Spliterator spliterator, AbstractC0111a abstractC0111a, int i) {
        this.a = spliterator;
        this.b = abstractC0111a;
        this.c = AbstractC0117d.g(spliterator.estimateSize());
        this.d = 0L;
        this.e = i;
    }

    public abstract AbstractC0138n0 a(Spliterator spliterator, long j, long j2);

    public /* synthetic */ void accept(double d) {
        AbstractC0153v0.d();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.a;
        AbstractC0138n0 abstractC0138n0A = this;
        while (spliterator.estimateSize() > abstractC0138n0A.c && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            abstractC0138n0A.setPendingCount(1);
            long jEstimateSize = spliteratorTrySplit.estimateSize();
            AbstractC0138n0 abstractC0138n0 = abstractC0138n0A;
            abstractC0138n0.a(spliteratorTrySplit, abstractC0138n0A.d, jEstimateSize).fork();
            abstractC0138n0A = abstractC0138n0.a(spliterator, abstractC0138n0.d + jEstimateSize, abstractC0138n0.e - jEstimateSize);
        }
        AbstractC0138n0 abstractC0138n02 = abstractC0138n0A;
        abstractC0138n02.b.n(spliterator, abstractC0138n02);
        abstractC0138n02.propagateCompletion();
    }

    @Override // j$.util.stream.K0
    public final void d(long j) {
        long j2 = this.e;
        if (j > j2) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i = (int) this.d;
        this.f = i;
        this.g = i + ((int) j2);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ boolean g() {
        return false;
    }

    public /* synthetic */ void accept(int i) {
        AbstractC0153v0.k();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        AbstractC0153v0.l();
        throw null;
    }

    public AbstractC0138n0(AbstractC0138n0 abstractC0138n0, Spliterator spliterator, long j, long j2, int i) {
        super(abstractC0138n0);
        this.a = spliterator;
        this.b = abstractC0138n0.b;
        this.c = abstractC0138n0.c;
        this.d = j;
        this.e = j2;
        if (j < 0 || j2 < 0 || (j + j2) - 1 >= i) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)));
        }
    }
}
