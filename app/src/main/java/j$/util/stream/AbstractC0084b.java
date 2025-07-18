package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: j$.util.stream.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0084b extends AbstractC0086d {
    public final AtomicReference h;

    public AbstractC0084b(AbstractC0083a abstractC0083a, Spliterator spliterator) {
        super(abstractC0083a, spliterator);
        this.h = new AtomicReference(null);
    }

    @Override // j$.util.stream.AbstractC0086d, java.util.concurrent.CountedCompleter
    public final void compute() {
        Object obj;
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.b;
        long jEstimateSize = spliterator.estimateSize();
        long jE = this.c;
        if (jE == 0) {
            jE = AbstractC0086d.e(jEstimateSize);
            this.c = jE;
        }
        AtomicReference atomicReference = this.h;
        boolean z = false;
        AbstractC0084b abstractC0084b = this;
        while (true) {
            obj = atomicReference.get();
            if (obj != null) {
                break;
            }
            CountedCompleter<?> completer = abstractC0084b.getCompleter();
            while (true) {
                AbstractC0084b abstractC0084b2 = (AbstractC0084b) ((AbstractC0086d) completer);
                if (abstractC0084b2 == null) {
                    break;
                } else {
                    completer = abstractC0084b2.getCompleter();
                }
            }
            if (jEstimateSize <= jE || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                break;
            }
            C0097o c0097o = (C0097o) abstractC0084b;
            C0097o c0097o2 = new C0097o(c0097o, spliteratorTrySplit);
            abstractC0084b.d = c0097o2;
            C0097o c0097o3 = new C0097o(c0097o, spliterator);
            abstractC0084b.e = c0097o3;
            abstractC0084b.setPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
                abstractC0084b = c0097o2;
                c0097o2 = c0097o3;
            } else {
                abstractC0084b = c0097o3;
            }
            z = !z;
            c0097o2.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        abstractC0084b.a();
        obj = null;
        abstractC0084b.d(obj);
        abstractC0084b.tryComplete();
    }

    @Override // j$.util.stream.AbstractC0086d
    public final void d(Object obj) {
        if (!b()) {
            this.f = obj;
        } else if (obj != null) {
            j$.desugar.sun.nio.fs.g.E(this.h, null, obj);
        }
    }

    @Override // j$.util.stream.AbstractC0086d, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        if (!b()) {
            return this.f;
        }
        Object obj = this.h.get();
        return obj == null ? Boolean.valueOf(!((EnumC0096n) ((C0097o) this).i.b).b) : obj;
    }

    public AbstractC0084b(C0097o c0097o, Spliterator spliterator) {
        super(c0097o, spliterator);
        this.h = c0097o.h;
    }
}
