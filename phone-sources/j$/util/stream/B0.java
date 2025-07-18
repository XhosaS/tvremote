package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes4.dex */
public final class B0 extends A0 implements InterfaceC0161z0 {
    public long b;

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
        this.b = 0L;
    }

    @Override // j$.util.stream.A0, j$.util.stream.K0
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // j$.util.stream.A0, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.b);
    }

    @Override // j$.util.stream.InterfaceC0161z0
    public final void l(InterfaceC0161z0 interfaceC0161z0) {
        this.b += ((B0) interfaceC0161z0).b;
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
        this.b++;
    }

    @Override // j$.util.stream.A0, j$.util.stream.K0
    public final /* synthetic */ void end() {
    }
}
