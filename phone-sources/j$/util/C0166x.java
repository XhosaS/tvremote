package j$.util;

import j$.util.function.IntConsumer$CC;
import j$.util.stream.K0;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C0166x implements IntConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Consumer b;

    public /* synthetic */ C0166x(Consumer consumer, int i) {
        this.a = i;
        this.b = consumer;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        switch (this.a) {
            case 0:
                this.b.accept(Integer.valueOf(i));
                break;
            default:
                ((K0) this.b).accept(i);
                break;
        }
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.a) {
        }
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }
}
