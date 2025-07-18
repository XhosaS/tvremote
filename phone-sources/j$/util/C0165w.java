package j$.util;

import j$.util.function.DoubleConsumer$CC;
import j$.util.stream.K0;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C0165w implements DoubleConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Consumer b;

    public /* synthetic */ C0165w(Consumer consumer, int i) {
        this.a = i;
        this.b = consumer;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        switch (this.a) {
            case 0:
                this.b.accept(Double.valueOf(d));
                break;
            default:
                ((K0) this.b).accept(d);
                break;
        }
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.a) {
        }
        return DoubleConsumer$CC.$default$andThen(this, doubleConsumer);
    }
}
