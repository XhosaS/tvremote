package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0091i implements b0 {
    public final c0 a;
    public final /* synthetic */ IntFunction b;

    public C0091i(c0 c0Var, IntFunction intFunction) {
        this.b = intFunction;
        c0Var.getClass();
        this.a = c0Var;
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
        this.a.d(j);
    }

    @Override // j$.util.stream.b0
    public final /* synthetic */ void e(Integer num) {
        L.e(this, num);
    }

    @Override // j$.util.stream.c0
    public final void end() {
        this.a.end();
    }

    @Override // j$.util.stream.c0
    public final boolean g() {
        return this.a.g();
    }

    @Override // j$.util.stream.b0, j$.util.stream.c0
    public final void accept(int i) {
        this.a.accept((c0) this.b.apply(i));
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.desugar.sun.nio.fs.g.a(this, intConsumer);
    }
}
