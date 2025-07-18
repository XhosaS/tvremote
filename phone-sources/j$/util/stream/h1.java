package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.function.LongConsumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes4.dex */
public final /* synthetic */ class h1 implements J0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LongConsumer b;

    public /* synthetic */ h1(LongConsumer longConsumer, int i) {
        this.a = i;
        this.b = longConsumer;
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

    @Override // j$.util.stream.J0
    public final /* synthetic */ void n(Long l) {
        switch (this.a) {
            case 0:
                AbstractC0153v0.i(this, l);
                break;
            default:
                AbstractC0153v0.i(this, l);
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

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.a) {
        }
        return LongConsumer$CC.$default$andThen(this, longConsumer);
    }

    @Override // j$.util.stream.J0, j$.util.stream.K0
    public final void accept(long j) {
        switch (this.a) {
            case 0:
                this.b.accept(j);
                break;
            default:
                ((V0) this.b).accept(j);
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.a) {
            case 0:
                n((Long) obj);
                break;
            default:
                n((Long) obj);
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
