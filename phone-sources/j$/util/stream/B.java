package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* loaded from: classes4.dex */
public final class B extends AbstractC0113b {
    public final j$.nio.file.z j;

    public B(j$.nio.file.z zVar, AbstractC0111a abstractC0111a, Spliterator spliterator) {
        super(abstractC0111a, spliterator);
        this.j = zVar;
    }

    @Override // j$.util.stream.AbstractC0117d
    public final Object a() {
        AbstractC0111a abstractC0111a = this.a;
        AbstractC0160z abstractC0160z = (AbstractC0160z) ((Supplier) this.j.c).get();
        abstractC0111a.n(this.b, abstractC0160z);
        boolean z = abstractC0160z.b;
        if (z == ((A) this.j.b).b) {
            Boolean boolValueOf = Boolean.valueOf(z);
            AtomicReference atomicReference = this.h;
            while (!atomicReference.compareAndSet(null, boolValueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC0117d
    public final AbstractC0117d e(Spliterator spliterator) {
        return new B(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0113b
    public final Object h() {
        return Boolean.valueOf(!((A) this.j.b).b);
    }

    public B(B b, Spliterator spliterator) {
        super(b, spliterator);
        this.j = b.j;
    }
}
