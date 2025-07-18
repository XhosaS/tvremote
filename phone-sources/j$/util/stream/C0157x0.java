package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.x0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0157x0 extends A0 implements InterfaceC0161z0 {
    public final /* synthetic */ Supplier b;
    public final /* synthetic */ BiConsumer c;
    public final /* synthetic */ BinaryOperator d;

    public C0157x0(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator) {
        this.b = supplier;
        this.c = biConsumer;
        this.d = binaryOperator;
    }

    @Override // j$.util.stream.A0, j$.util.stream.K0
    public final /* synthetic */ void accept(double d) {
        AbstractC0153v0.d();
        throw null;
    }

    @Override // j$.util.stream.A0
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.A0, j$.util.stream.K0
    public final void d(long j) {
        this.a = this.b.get();
    }

    @Override // j$.util.stream.A0, j$.util.stream.K0
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.A0, j$.util.stream.K0
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC0161z0
    public final void l(InterfaceC0161z0 interfaceC0161z0) {
        this.a = this.d.apply(this.a, ((C0157x0) interfaceC0161z0).a);
    }

    @Override // j$.util.stream.A0, j$.util.stream.K0
    public final /* synthetic */ void accept(int i) {
        AbstractC0153v0.k();
        throw null;
    }

    @Override // j$.util.stream.A0, j$.util.stream.K0
    public final /* synthetic */ void accept(long j) {
        AbstractC0153v0.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.c.accept(this.a, obj);
    }
}
