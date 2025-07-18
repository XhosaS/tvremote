package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes4.dex */
public final class r implements I0 {
    public final K0 a;
    public final /* synthetic */ j$.desugar.sun.nio.fs.n b;

    public r(K0 k0, j$.desugar.sun.nio.fs.n nVar) {
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

    @Override // j$.util.stream.I0
    public final /* synthetic */ void e(Integer num) {
        AbstractC0153v0.g(this, num);
    }

    @Override // j$.util.stream.K0
    public final void end() {
        this.a.end();
    }

    @Override // j$.util.stream.K0
    public final boolean g() {
        return this.a.g();
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void accept(long j) {
        AbstractC0153v0.l();
        throw null;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        e((Integer) obj);
    }

    @Override // j$.util.stream.I0, j$.util.stream.K0
    public final void accept(int i) {
        this.a.accept((K0) this.b.apply(i));
    }
}
