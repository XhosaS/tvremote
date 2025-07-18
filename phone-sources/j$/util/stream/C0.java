package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes4.dex */
public final class C0 extends AbstractC0117d {
    public final AbstractC0153v0 h;

    public C0(AbstractC0153v0 abstractC0153v0, AbstractC0111a abstractC0111a, Spliterator spliterator) {
        super(abstractC0111a, spliterator);
        this.h = abstractC0153v0;
    }

    @Override // j$.util.stream.AbstractC0117d
    public final Object a() {
        AbstractC0111a abstractC0111a = this.a;
        InterfaceC0161z0 interfaceC0161z0V = this.h.v();
        abstractC0111a.n(this.b, interfaceC0161z0V);
        return interfaceC0161z0V;
    }

    @Override // j$.util.stream.AbstractC0117d
    public final AbstractC0117d e(Spliterator spliterator) {
        return new C0(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0117d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC0117d abstractC0117d = this.d;
        if (abstractC0117d != null) {
            InterfaceC0161z0 interfaceC0161z0 = (InterfaceC0161z0) ((C0) abstractC0117d).f;
            interfaceC0161z0.l((InterfaceC0161z0) ((C0) this.e).f);
            this.f = interfaceC0161z0;
        }
        super.onCompletion(countedCompleter);
    }

    public C0(C0 c0, Spliterator spliterator) {
        super(c0, spliterator);
        this.h = c0.h;
    }
}
