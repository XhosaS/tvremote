package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes3.dex */
public final class S extends AbstractC0086d {
    public final L h;

    public S(L l, AbstractC0083a abstractC0083a, Spliterator spliterator) {
        super(abstractC0083a, spliterator);
        this.h = l;
    }

    @Override // j$.util.stream.AbstractC0086d
    public final Object a() {
        AbstractC0083a abstractC0083a = this.a;
        Q qK = this.h.k();
        abstractC0083a.l(this.b, qK);
        return qK;
    }

    @Override // j$.util.stream.AbstractC0086d
    public final AbstractC0086d c(Spliterator spliterator) {
        return new S(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0086d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC0086d abstractC0086d = this.d;
        if (abstractC0086d != null) {
            Q q = (Q) ((S) abstractC0086d).f;
            q.i((Q) ((S) this.e).f);
            this.f = q;
        }
        super.onCompletion(countedCompleter);
    }

    public S(S s, Spliterator spliterator) {
        super(s, spliterator);
        this.h = s.h;
    }
}
