package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.function.LongConsumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0150u implements J0 {
    public final K0 a;
    public final /* synthetic */ j$.desugar.sun.nio.fs.n b;

    public C0150u(K0 k0, j$.desugar.sun.nio.fs.n nVar) {
        this.b = nVar;
        k0.getClass();
        this.a = k0;
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void accept(double d) {
        AbstractC0153v0.d();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.K0
    public final void d(long j) {
        this.a.d(j);
    }

    @Override // j$.util.stream.K0
    public final void end() {
        this.a.end();
    }

    @Override // j$.util.stream.K0
    public final boolean g() {
        return this.a.g();
    }

    @Override // j$.util.stream.J0
    public final /* synthetic */ void n(Long l) {
        AbstractC0153v0.i(this, l);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void accept(int i) {
        AbstractC0153v0.k();
        throw null;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return LongConsumer$CC.$default$andThen(this, longConsumer);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        n((Long) obj);
    }

    @Override // j$.util.stream.J0, j$.util.stream.K0
    public final void accept(long j) {
        this.a.accept((K0) this.b.apply(j));
    }
}
