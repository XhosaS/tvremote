package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes4.dex */
public abstract class A0 implements K0 {
    public Object a;

    public A0(K0 k0) {
        k0.getClass();
        this.a = k0;
    }

    @Override // j$.util.stream.K0
    public /* synthetic */ void accept(double d) {
        AbstractC0153v0.d();
        throw null;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.K0
    public void d(long j) {
        ((K0) this.a).d(j);
    }

    @Override // j$.util.stream.K0
    public void end() {
        ((K0) this.a).end();
    }

    @Override // j$.util.stream.K0
    public boolean g() {
        return ((K0) this.a).g();
    }

    public Object get() {
        return this.a;
    }

    @Override // j$.util.stream.K0
    public /* synthetic */ void accept(int i) {
        AbstractC0153v0.k();
        throw null;
    }

    @Override // j$.util.stream.K0
    public /* synthetic */ void accept(long j) {
        AbstractC0153v0.l();
        throw null;
    }
}
