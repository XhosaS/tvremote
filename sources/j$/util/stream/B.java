package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
public final class B extends AbstractC0017c {
    public final j$.nio.file.attribute.a h;

    public B(j$.nio.file.attribute.a aVar, F f, Spliterator spliterator) {
        super(f, spliterator);
        this.h = aVar;
    }

    @Override // j$.util.stream.AbstractC0017c
    public final Object a() {
        F f = this.a;
        y yVarH = this.h.H();
        f.g(yVarH, this.b);
        return yVarH;
    }

    @Override // j$.util.stream.AbstractC0017c
    public final AbstractC0017c b(Spliterator spliterator) {
        return new B(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0017c, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC0017c abstractC0017c = this.d;
        if (abstractC0017c != null) {
            y yVar = (y) ((B) abstractC0017c).f;
            yVar.e((y) ((B) this.e).f);
            this.f = yVar;
        }
        super.onCompletion(countedCompleter);
    }

    public B(B b, Spliterator spliterator) {
        super(b, spliterator);
        this.h = b.h;
    }
}
