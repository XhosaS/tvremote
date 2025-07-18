package j$.util.stream;

import j$.util.stream.Collector;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

/* loaded from: classes3.dex */
public final class M extends L {
    public final /* synthetic */ BinaryOperator a;
    public final /* synthetic */ BiConsumer b;
    public final /* synthetic */ Supplier c;
    public final /* synthetic */ Collector d;

    public M(l0 l0Var, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, Collector collector) {
        this.a = binaryOperator;
        this.b = biConsumer;
        this.c = supplier;
        this.d = collector;
    }

    @Override // j$.util.stream.L, j$.util.stream.s0
    public final int c() {
        if (this.d.characteristics().contains(Collector.Characteristics.UNORDERED)) {
            return k0.o;
        }
        return 0;
    }

    @Override // j$.util.stream.L
    public final Q k() {
        return new N(this.c, this.b, this.a);
    }
}
