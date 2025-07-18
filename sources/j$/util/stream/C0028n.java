package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* renamed from: j$.util.stream.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0028n extends AbstractC0017c {
    public final F h;
    public final j$.time.format.s i;
    public final j$.time.format.b j;

    public C0028n(F f, Spliterator spliterator, j$.time.format.s sVar, j$.time.format.b bVar) {
        super(f, spliterator);
        this.h = f;
        this.i = sVar;
        this.j = bVar;
    }

    @Override // j$.util.stream.AbstractC0017c
    public final Object a() {
        InterfaceC0024j interfaceC0024j = (InterfaceC0024j) this.i.apply(this.h.c(this.b));
        F f = this.h;
        Spliterator spliterator = this.b;
        f.getClass();
        f.a(f.h(interfaceC0024j), spliterator);
        return interfaceC0024j.build();
    }

    @Override // j$.util.stream.AbstractC0017c
    public final AbstractC0017c b(Spliterator spliterator) {
        return new C0028n(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0017c, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC0017c abstractC0017c = this.d;
        if (abstractC0017c != null) {
            this.f = (InterfaceC0025k) this.j.apply((InterfaceC0025k) ((C0028n) abstractC0017c).f, (InterfaceC0025k) ((C0028n) this.e).f);
        }
        super.onCompletion(countedCompleter);
    }

    public C0028n(C0028n c0028n, Spliterator spliterator) {
        super(c0028n, spliterator);
        this.h = c0028n.h;
        this.i = c0028n.i;
        this.j = c0028n.j;
    }
}
