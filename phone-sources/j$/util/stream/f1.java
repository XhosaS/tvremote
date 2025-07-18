package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes4.dex */
public final /* synthetic */ class f1 implements I0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ IntConsumer b;

    public /* synthetic */ f1(IntConsumer intConsumer, int i) {
        this.a = i;
        this.b = intConsumer;
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void accept(double d) {
        switch (this.a) {
            case 0:
                AbstractC0153v0.d();
                throw null;
            default:
                AbstractC0153v0.d();
                throw null;
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

    @Override // j$.util.stream.I0
    public final /* synthetic */ void e(Integer num) {
        switch (this.a) {
            case 0:
                AbstractC0153v0.g(this, num);
                break;
            default:
                AbstractC0153v0.g(this, num);
                break;
        }
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

    @Override // j$.util.stream.I0, j$.util.stream.K0
    public final void accept(int i) {
        switch (this.a) {
            case 0:
                this.b.accept(i);
                break;
            default:
                ((T0) this.b).accept(i);
                break;
        }
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.a) {
        }
        return IntConsumer$CC.$default$andThen(this, intConsumer);
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
                e((Integer) obj);
                break;
            default:
                e((Integer) obj);
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
