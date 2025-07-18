package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class w extends z implements y {
    public final /* synthetic */ Supplier b;
    public final /* synthetic */ BiConsumer c;
    public final /* synthetic */ BinaryOperator d;

    public w(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator) {
        this.b = supplier;
        this.c = biConsumer;
        this.d = binaryOperator;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.c.accept(this.a, obj);
    }

    @Override // j$.util.stream.z
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.z, j$.util.stream.G
    public final void b(long j) {
        this.a = this.b.get();
    }

    @Override // j$.util.stream.z, j$.util.stream.G
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // j$.util.stream.y
    public final void e(y yVar) {
        this.a = this.d.apply(this.a, ((w) yVar).a);
    }

    @Override // j$.util.stream.z, j$.util.stream.G
    public final /* synthetic */ void end() {
    }
}
