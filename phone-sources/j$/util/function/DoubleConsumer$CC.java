package j$.util.function;

import java.util.function.DoubleConsumer;

/* renamed from: j$.util.function.DoubleConsumer$-CC, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class DoubleConsumer$CC {
    public static DoubleConsumer $default$andThen(final DoubleConsumer doubleConsumer, final DoubleConsumer doubleConsumer2) {
        doubleConsumer2.getClass();
        return new DoubleConsumer() { // from class: j$.util.function.b
            @Override // java.util.function.DoubleConsumer
            public final void accept(double d) {
                doubleConsumer.accept(d);
                doubleConsumer2.accept(d);
            }

            public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer3) {
                return DoubleConsumer$CC.$default$andThen(this, doubleConsumer3);
            }
        };
    }
}
