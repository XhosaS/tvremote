package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class n0 implements b0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ IntConsumer b;

    public /* synthetic */ n0(IntConsumer intConsumer, int i) {
        this.a = i;
        this.b = intConsumer;
    }

    @Override // j$.util.stream.b0, j$.util.stream.c0
    public final void accept(int i) {
        switch (this.a) {
            case 0:
                this.b.accept(i);
                break;
            default:
                ((f0) this.b).accept(i);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ void d(long j) {
        int i = this.a;
    }

    @Override // j$.util.stream.b0
    public final /* synthetic */ void e(Integer num) {
        switch (this.a) {
            case 0:
                L.e(this, num);
                break;
            default:
                L.e(this, num);
                break;
        }
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ void end() {
        int i = this.a;
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ boolean g() {
        switch (this.a) {
        }
        return false;
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

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.a) {
        }
        return j$.desugar.sun.nio.fs.g.a(this, intConsumer);
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
