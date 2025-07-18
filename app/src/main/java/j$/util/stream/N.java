package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* loaded from: classes3.dex */
public final class N implements Q {
    public Object a;
    public final /* synthetic */ Supplier b;
    public final /* synthetic */ BiConsumer c;
    public final /* synthetic */ BinaryOperator d;

    public N(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator) {
        this.b = supplier;
        this.c = biConsumer;
        this.d = binaryOperator;
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ void accept(int i) {
        L.d();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.c0
    public final void d(long j) {
        this.a = this.b.get();
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.a;
    }

    @Override // j$.util.stream.Q
    public final void i(Q q) {
        this.a = this.d.apply(this.a, ((N) q).a);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.c.accept(this.a, obj);
    }
}
