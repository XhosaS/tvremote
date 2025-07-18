package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.function.DoubleConsumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0123g implements H0 {
    public final K0 a;
    public final /* synthetic */ j$.desugar.sun.nio.fs.n b;

    public C0123g(K0 k0, j$.desugar.sun.nio.fs.n nVar) {
        this.b = nVar;
        k0.getClass();
        this.a = k0;
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void accept(int i) {
        AbstractC0153v0.k();
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

    @Override // j$.util.stream.H0
    public final /* synthetic */ void r(Double d) {
        AbstractC0153v0.e(this, d);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void accept(long j) {
        AbstractC0153v0.l();
        throw null;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return DoubleConsumer$CC.$default$andThen(this, doubleConsumer);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        r((Double) obj);
    }

    @Override // j$.util.stream.H0, j$.util.stream.K0
    public final void accept(double d) {
        this.a.accept((K0) this.b.apply(d));
    }
}
