package j$.util.function;

import java.util.function.DoubleUnaryOperator;

/* renamed from: j$.util.function.DoubleUnaryOperator$-CC, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class DoubleUnaryOperator$CC {
    public static DoubleUnaryOperator $default$andThen(DoubleUnaryOperator doubleUnaryOperator, DoubleUnaryOperator doubleUnaryOperator2) {
        doubleUnaryOperator2.getClass();
        return new c(doubleUnaryOperator, doubleUnaryOperator2, 1);
    }

    public static DoubleUnaryOperator $default$compose(DoubleUnaryOperator doubleUnaryOperator, DoubleUnaryOperator doubleUnaryOperator2) {
        doubleUnaryOperator2.getClass();
        return new c(doubleUnaryOperator, doubleUnaryOperator2, 0);
    }
}
