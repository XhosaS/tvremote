package j$.util.stream;

import j$.util.Spliterator;

/* renamed from: j$.util.stream.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0097o extends AbstractC0084b {
    public final j$.nio.file.A i;

    public C0097o(j$.nio.file.A a, AbstractC0083a abstractC0083a, Spliterator spliterator) {
        super(abstractC0083a, spliterator);
        this.i = a;
    }

    @Override // j$.util.stream.AbstractC0086d
    public final Object a() {
        AbstractC0083a abstractC0083a = this.a;
        C0095m c0095m = (C0095m) ((j$.nio.file.A) this.i.c).get();
        abstractC0083a.l(this.b, c0095m);
        boolean z = c0095m.b;
        if (z == ((EnumC0096n) this.i.b).b) {
            j$.desugar.sun.nio.fs.g.E(this.h, null, Boolean.valueOf(z));
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC0086d
    public final AbstractC0086d c(Spliterator spliterator) {
        return new C0097o(this, spliterator);
    }

    public C0097o(C0097o c0097o, Spliterator spliterator) {
        super(c0097o, spliterator);
        this.i = c0097o.i;
    }
}
