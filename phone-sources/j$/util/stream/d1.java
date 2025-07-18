package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.function.DoubleConsumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes4.dex */
public final /* synthetic */ class d1 implements H0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ DoubleConsumer b;

    public /* synthetic */ d1(DoubleConsumer doubleConsumer, int i) {
        this.a = i;
        this.b = doubleConsumer;
    }

    @Override // j$.util.stream.H0, j$.util.stream.K0
    public final void accept(double d) {
        switch (this.a) {
            case 0:
                this.b.accept(d);
                break;
            default:
                ((R0) this.b).accept(d);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void d(long j) {
        int i = this.a;
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void end() {
        int i = this.a;
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ boolean g() {
        switch (this.a) {
        }
        return false;
    }

    @Override // j$.util.stream.H0
    public final /* synthetic */ void r(Double d) {
        switch (this.a) {
            case 0:
                AbstractC0153v0.e(this, d);
                break;
            default:
                AbstractC0153v0.e(this, d);
                break;
        }
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void accept(int i) {
        switch (this.a) {
            case 0:
                AbstractC0153v0.k();
                throw null;
            default:
                AbstractC0153v0.k();
                throw null;
        }
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.a) {
        }
        return DoubleConsumer$CC.$default$andThen(this, doubleConsumer);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void accept(long j) {
        switch (this.a) {
            case 0:
                AbstractC0153v0.l();
                throw null;
            default:
                AbstractC0153v0.l();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.a) {
            case 0:
                r((Double) obj);
                break;
            default:
                r((Double) obj);
                break;
        }
    }

    private final /* synthetic */ void a(long j) {
    }

    private final /* synthetic */ void b(long j) {
    }

    private final /* synthetic */ void c() {
    }

    private final /* synthetic */ void f() {
    }
}
