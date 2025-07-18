package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0139o implements r1, s1 {
    public final boolean a;
    public final Consumer b;

    public C0139o(Consumer consumer, boolean z) {
        this.a = z;
        this.b = consumer;
    }

    @Override // j$.util.stream.r1
    public final Object a(AbstractC0111a abstractC0111a, Spliterator spliterator) {
        abstractC0111a.a(spliterator, abstractC0111a.o(this));
        return null;
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void accept(double d) {
        AbstractC0153v0.d();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.r1
    public final Object b(AbstractC0111a abstractC0111a, Spliterator spliterator) {
        if (this.a) {
            new C0141p(abstractC0111a, spliterator, this).invoke();
            return null;
        }
        new C0143q(abstractC0111a, spliterator, abstractC0111a.o(this)).invoke();
        return null;
    }

    @Override // j$.util.stream.r1
    public final int c() {
        if (this.a) {
            return 0;
        }
        return a1.p;
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void accept(int i) {
        AbstractC0153v0.k();
        throw null;
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void accept(long j) {
        AbstractC0153v0.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.b.accept(obj);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void d(long j) {
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void end() {
    }
}
