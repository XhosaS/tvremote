package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: j$.util.stream.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0113b extends AbstractC0117d {
    public final AtomicReference h;
    public volatile boolean i;

    public AbstractC0113b(AbstractC0111a abstractC0111a, Spliterator spliterator) {
        super(abstractC0111a, spliterator);
        this.h = new AtomicReference(null);
    }

    @Override // j$.util.stream.AbstractC0117d, java.util.concurrent.CountedCompleter
    public final void compute() {
        Object objH;
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.b;
        long jEstimateSize = spliterator.estimateSize();
        long jG = this.c;
        if (jG == 0) {
            jG = AbstractC0117d.g(jEstimateSize);
            this.c = jG;
        }
        AtomicReference atomicReference = this.h;
        boolean z = false;
        AbstractC0113b abstractC0113b = this;
        while (true) {
            objH = atomicReference.get();
            if (objH != null) {
                break;
            }
            boolean z2 = abstractC0113b.i;
            if (!z2) {
                CountedCompleter<?> completer = abstractC0113b.getCompleter();
                while (true) {
                    AbstractC0113b abstractC0113b2 = (AbstractC0113b) ((AbstractC0117d) completer);
                    if (z2 || abstractC0113b2 == null) {
                        break;
                    }
                    z2 = abstractC0113b2.i;
                    completer = abstractC0113b2.getCompleter();
                }
            }
            if (z2) {
                objH = abstractC0113b.h();
                break;
            }
            if (jEstimateSize <= jG || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                break;
            }
            AbstractC0113b abstractC0113b3 = (AbstractC0113b) abstractC0113b.e(spliteratorTrySplit);
            abstractC0113b.d = abstractC0113b3;
            AbstractC0113b abstractC0113b4 = (AbstractC0113b) abstractC0113b.e(spliterator);
            abstractC0113b.e = abstractC0113b4;
            abstractC0113b.setPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
                abstractC0113b = abstractC0113b3;
                abstractC0113b3 = abstractC0113b4;
            } else {
                abstractC0113b = abstractC0113b4;
            }
            z = !z;
            abstractC0113b3.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        objH = abstractC0113b.a();
        abstractC0113b.f(objH);
        abstractC0113b.tryComplete();
    }

    @Override // j$.util.stream.AbstractC0117d
    public final void f(Object obj) {
        if (!d()) {
            this.f = obj;
        } else if (obj != null) {
            AtomicReference atomicReference = this.h;
            while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
            }
        }
    }

    @Override // j$.util.stream.AbstractC0117d, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        if (!d()) {
            return this.f;
        }
        Object obj = this.h.get();
        return obj == null ? h() : obj;
    }

    public abstract Object h();

    public AbstractC0113b(AbstractC0113b abstractC0113b, Spliterator spliterator) {
        super(abstractC0113b, spliterator);
        this.h = abstractC0113b.h;
    }
}
