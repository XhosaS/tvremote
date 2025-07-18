package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* loaded from: classes4.dex */
public class M extends AbstractC0117d {
    public final AbstractC0111a h;
    public final LongFunction i;
    public final BinaryOperator j;

    public M(AbstractC0111a abstractC0111a, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator) {
        super(abstractC0111a, spliterator);
        this.h = abstractC0111a;
        this.i = longFunction;
        this.j = binaryOperator;
    }

    @Override // j$.util.stream.AbstractC0117d
    public final Object a() {
        C c = (C) this.i.apply(this.h.e(this.b));
        this.h.n(this.b, c);
        return c.build();
    }

    @Override // j$.util.stream.AbstractC0117d
    public final AbstractC0117d e(Spliterator spliterator) {
        return new M(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0117d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC0117d abstractC0117d = this.d;
        if (abstractC0117d != null) {
            this.f = (H) this.j.apply((H) ((M) abstractC0117d).f, (H) ((M) this.e).f);
        }
        super.onCompletion(countedCompleter);
    }

    public M(M m, Spliterator spliterator) {
        super(m, spliterator);
        this.h = m.h;
        this.i = m.i;
        this.j = m.j;
    }
}
