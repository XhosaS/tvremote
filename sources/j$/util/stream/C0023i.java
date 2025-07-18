package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: j$.util.stream.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0023i extends AbstractC0017c {
    public final AtomicReference h;
    public final j$.util.concurrent.w i;

    public C0023i(j$.util.concurrent.w wVar, F f, Spliterator spliterator) {
        super(f, spliterator);
        this.h = new AtomicReference(null);
        this.i = wVar;
    }

    @Override // j$.util.stream.AbstractC0017c
    public final Object a() {
        F f = this.a;
        C0021g c0021g = (C0021g) ((j$.util.concurrent.w) this.i.c).get();
        f.g(c0021g, this.b);
        boolean z = c0021g.b;
        if (z == ((EnumC0022h) this.i.b).b) {
            Boolean boolValueOf = Boolean.valueOf(z);
            AtomicReference atomicReference = this.h;
            while (!atomicReference.compareAndSet(null, boolValueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC0017c
    public final AbstractC0017c b(Spliterator spliterator) {
        return new C0023i(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0017c
    public final void c(Object obj) {
        if (((AbstractC0017c) getCompleter()) != null) {
            this.f = obj;
        } else if (obj != null) {
            AtomicReference atomicReference = this.h;
            while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
            }
        }
    }

    @Override // j$.util.stream.AbstractC0017c, java.util.concurrent.CountedCompleter
    public final void compute() {
        Object obj;
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.b;
        long jEstimateSize = spliterator.estimateSize();
        long jD = this.c;
        if (jD == 0) {
            jD = AbstractC0017c.d(jEstimateSize);
            this.c = jD;
        }
        AtomicReference atomicReference = this.h;
        boolean z = false;
        C0023i c0023i = this;
        while (true) {
            obj = atomicReference.get();
            if (obj != null) {
                break;
            }
            CountedCompleter completer = c0023i.getCompleter();
            while (true) {
                C0023i c0023i2 = (C0023i) ((AbstractC0017c) completer);
                if (c0023i2 == null) {
                    break;
                } else {
                    completer = c0023i2.getCompleter();
                }
            }
            if (jEstimateSize <= jD || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                break;
            }
            C0023i c0023i3 = new C0023i(c0023i, spliteratorTrySplit);
            c0023i.d = c0023i3;
            C0023i c0023i4 = new C0023i(c0023i, spliterator);
            c0023i.e = c0023i4;
            c0023i.setPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
                c0023i = c0023i3;
                c0023i3 = c0023i4;
            } else {
                c0023i = c0023i4;
            }
            z = !z;
            c0023i3.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        c0023i.a();
        obj = null;
        c0023i.c(obj);
        c0023i.tryComplete();
    }

    @Override // j$.util.stream.AbstractC0017c, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        if (((AbstractC0017c) getCompleter()) != null) {
            return this.f;
        }
        Object obj = this.h.get();
        return obj == null ? Boolean.valueOf(!((EnumC0022h) this.i.b).b) : obj;
    }

    public C0023i(C0023i c0023i, Spliterator spliterator) {
        super(c0023i, spliterator);
        this.h = c0023i.h;
        this.i = c0023i.i;
    }
}
