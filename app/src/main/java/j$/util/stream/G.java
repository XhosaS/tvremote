package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public abstract class G extends CountedCompleter implements c0 {
    public final Spliterator a;
    public final AbstractC0083a b;
    public final long c;
    public final long d;
    public final long e;
    public int f;
    public int g;

    public G(Spliterator spliterator, AbstractC0083a abstractC0083a, int i) {
        this.a = spliterator;
        this.b = abstractC0083a;
        this.c = AbstractC0086d.e(spliterator.estimateSize());
        this.d = 0L;
        this.e = i;
    }

    public abstract G a(Spliterator spliterator, long j, long j2);

    public /* synthetic */ void accept(int i) {
        L.d();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.a;
        G gA = this;
        while (spliterator.estimateSize() > gA.c && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            gA.setPendingCount(1);
            long jEstimateSize = spliteratorTrySplit.estimateSize();
            G g = gA;
            g.a(spliteratorTrySplit, gA.d, jEstimateSize).fork();
            gA = g.a(spliterator, g.d + jEstimateSize, g.e - jEstimateSize);
        }
        G g2 = gA;
        g2.b.l(spliterator, g2);
        g2.propagateCompletion();
    }

    @Override // j$.util.stream.c0
    public final void d(long j) {
        long j2 = this.e;
        if (j > j2) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i = (int) this.d;
        this.f = i;
        this.g = i + ((int) j2);
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ boolean g() {
        return false;
    }

    public G(G g, Spliterator spliterator, long j, long j2, int i) {
        super(g);
        this.a = spliterator;
        this.b = g.b;
        this.c = g.c;
        this.d = j;
        this.e = j2;
        if (j < 0 || j2 < 0 || (j + j2) - 1 >= i) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)));
        }
    }
}
