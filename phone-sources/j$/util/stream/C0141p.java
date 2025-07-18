package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountedCompleter;

/* renamed from: j$.util.stream.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0141p extends CountedCompleter {
    public final AbstractC0111a a;
    public Spliterator b;
    public final long c;
    public final ConcurrentHashMap d;
    public final C0139o e;
    public final C0141p f;
    public H g;

    public C0141p(AbstractC0111a abstractC0111a, Spliterator spliterator, C0139o c0139o) {
        super(null);
        this.a = abstractC0111a;
        this.b = spliterator;
        this.c = AbstractC0117d.g(spliterator.estimateSize());
        this.d = new ConcurrentHashMap(Math.max(16, AbstractC0117d.g << 1));
        this.e = c0139o;
        this.f = null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.b;
        long j = this.c;
        boolean z = false;
        C0141p c0141p = this;
        while (spliterator.estimateSize() > j && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            C0141p c0141p2 = new C0141p(c0141p, spliteratorTrySplit, c0141p.f);
            C0141p c0141p3 = new C0141p(c0141p, spliterator, c0141p2);
            c0141p.addToPendingCount(1);
            c0141p3.addToPendingCount(1);
            c0141p.d.put(c0141p2, c0141p3);
            if (c0141p.f != null) {
                c0141p2.addToPendingCount(1);
                if (c0141p.d.replace(c0141p.f, c0141p, c0141p2)) {
                    c0141p.addToPendingCount(-1);
                } else {
                    c0141p2.addToPendingCount(-1);
                }
            }
            if (z) {
                spliterator = spliteratorTrySplit;
                c0141p = c0141p2;
                c0141p2 = c0141p3;
            } else {
                c0141p = c0141p3;
            }
            z = !z;
            c0141p2.fork();
        }
        if (c0141p.getPendingCount() > 0) {
            j$.desugar.sun.nio.fs.n nVar = new j$.desugar.sun.nio.fs.n(21);
            AbstractC0111a abstractC0111a = c0141p.a;
            C cG = abstractC0111a.g(abstractC0111a.e(spliterator), nVar);
            c0141p.a.n(spliterator, cG);
            c0141p.g = cG.build();
            c0141p.b = null;
        }
        c0141p.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        H h = this.g;
        if (h != null) {
            h.forEach(this.e);
            this.g = null;
        } else {
            Spliterator spliterator = this.b;
            if (spliterator != null) {
                this.a.n(spliterator, this.e);
                this.b = null;
            }
        }
        C0141p c0141p = (C0141p) this.d.remove(this);
        if (c0141p != null) {
            c0141p.tryComplete();
        }
    }

    public C0141p(C0141p c0141p, Spliterator spliterator, C0141p c0141p2) {
        super(c0141p);
        this.a = c0141p.a;
        this.b = spliterator;
        this.c = c0141p.c;
        this.d = c0141p.d;
        this.e = c0141p.e;
        this.f = c0141p2;
    }
}
