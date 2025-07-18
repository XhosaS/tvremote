package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
public final class O implements Q, b0 {
    public int a;
    public final /* synthetic */ j$.desugar.sun.nio.fs.n b;

    public O(j$.desugar.sun.nio.fs.n nVar) {
        this.b = nVar;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        e((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.c0
    public final void d(long j) {
        this.a = 0;
    }

    @Override // j$.util.stream.b0
    public final /* synthetic */ void e(Integer num) {
        L.e(this, num);
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Integer.valueOf(this.a);
    }

    @Override // j$.util.stream.Q
    public final void i(Q q) {
        accept(((O) q).a);
    }

    @Override // j$.util.stream.c0
    public final void accept(int i) {
        this.a = this.b.applyAsInt(this.a, i);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.desugar.sun.nio.fs.g.a(this, intConsumer);
    }
}
