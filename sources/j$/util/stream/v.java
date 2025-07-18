package j$.util.stream;

import j$.util.stream.Collector;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class v extends j$.nio.file.attribute.a {
    public final /* synthetic */ BinaryOperator a;
    public final /* synthetic */ BiConsumer b;
    public final /* synthetic */ Supplier c;
    public final /* synthetic */ Collector d;

    public v(L l, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, Collector collector) {
        this.a = binaryOperator;
        this.b = biConsumer;
        this.c = supplier;
        this.d = collector;
    }

    @Override // j$.nio.file.attribute.a
    public final y H() {
        return new w(this.c, this.b, this.a);
    }

    @Override // j$.util.stream.N
    public final int f() {
        if (this.d.characteristics().contains(Collector.Characteristics.UNORDERED)) {
            return K.o;
        }
        return 0;
    }
}
