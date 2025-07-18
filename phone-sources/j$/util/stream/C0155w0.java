package j$.util.stream;

import j$.util.stream.Collector;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.w0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0155w0 extends AbstractC0153v0 {
    public final /* synthetic */ BinaryOperator a;
    public final /* synthetic */ BiConsumer b;
    public final /* synthetic */ Supplier c;
    public final /* synthetic */ Collector d;

    public C0155w0(b1 b1Var, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, Collector collector) {
        this.a = binaryOperator;
        this.b = biConsumer;
        this.c = supplier;
        this.d = collector;
    }

    @Override // j$.util.stream.r1
    public final int c() {
        if (this.d.characteristics().contains(Collector.Characteristics.UNORDERED)) {
            return a1.p;
        }
        return 0;
    }

    @Override // j$.util.stream.AbstractC0153v0
    public final InterfaceC0161z0 v() {
        return new C0157x0(this.c, this.b, this.a);
    }
}
