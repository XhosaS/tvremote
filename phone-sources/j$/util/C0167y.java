package j$.util;

import j$.util.function.LongConsumer$CC;
import j$.util.stream.K0;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C0167y implements LongConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Consumer b;

    public /* synthetic */ C0167y(Consumer consumer, int i) {
        this.a = i;
        this.b = consumer;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        switch (this.a) {
            case 0:
                this.b.accept(Long.valueOf(j));
                break;
            default:
                ((K0) this.b).accept(j);
                break;
        }
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.a) {
        }
        return LongConsumer$CC.$default$andThen(this, longConsumer);
    }
}
