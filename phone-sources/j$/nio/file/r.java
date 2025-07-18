package j$.nio.file;

import j$.util.C0107o;
import j$.util.function.Consumer$CC;
import j$.util.stream.AbstractC0153v0;
import j$.util.stream.K0;
import java.util.Map;
import java.util.function.Consumer;

/* loaded from: classes4.dex */
public final /* synthetic */ class r implements Consumer, K0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Consumer b;

    public /* synthetic */ r(Consumer consumer, int i) {
        this.a = i;
        this.b = consumer;
    }

    @Override // j$.util.stream.K0
    public /* synthetic */ void accept(double d) {
        AbstractC0153v0.d();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.K0
    public /* synthetic */ boolean g() {
        return false;
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

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.accept(AbstractC0040a.g(obj));
                break;
            case 1:
                this.b.accept(AbstractC0040a.g(obj));
                break;
            case 2:
                this.b.accept(new C0107o((Map.Entry) obj));
                break;
            default:
                this.b.accept(obj);
                break;
        }
    }

    @Override // j$.util.stream.K0
    public /* synthetic */ void d(long j) {
    }

    @Override // j$.util.stream.K0
    public /* synthetic */ void end() {
    }
}
