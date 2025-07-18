package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* renamed from: j$.util.stream.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0104w extends AbstractC0086d {
    public final AbstractC0083a h;
    public final LongFunction i;
    public final BinaryOperator j;

    public C0104w(AbstractC0083a abstractC0083a, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator) {
        super(abstractC0083a, spliterator);
        this.h = abstractC0083a;
        this.i = longFunction;
        this.j = binaryOperator;
    }

    @Override // j$.util.stream.AbstractC0086d
    public final Object a() {
        InterfaceC0098p interfaceC0098p = (InterfaceC0098p) this.i.apply(this.h.e(this.b));
        this.h.l(this.b, interfaceC0098p);
        return interfaceC0098p.build();
    }

    @Override // j$.util.stream.AbstractC0086d
    public final AbstractC0086d c(Spliterator spliterator) {
        return new C0104w(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0086d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC0086d abstractC0086d = this.d;
        if (abstractC0086d != null) {
            this.f = (InterfaceC0100s) this.j.apply((InterfaceC0100s) ((C0104w) abstractC0086d).f, (InterfaceC0100s) ((C0104w) this.e).f);
        }
        super.onCompletion(countedCompleter);
    }

    public C0104w(C0104w c0104w, Spliterator spliterator) {
        super(c0104w, spliterator);
        this.h = c0104w.h;
        this.i = c0104w.i;
        this.j = c0104w.j;
    }
}
