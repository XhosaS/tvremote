package j$.util.stream;

import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* renamed from: j$.util.stream.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0158y extends AbstractC0160z implements I0 {
    public final /* synthetic */ A c;
    public final /* synthetic */ IntPredicate d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0158y(A a, IntPredicate intPredicate) {
        super(a);
        this.c = a;
        this.d = intPredicate;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        e((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ void e(Integer num) {
        AbstractC0153v0.g(this, num);
    }

    @Override // j$.util.stream.AbstractC0160z, j$.util.stream.K0
    public final void accept(int i) {
        if (this.a) {
            return;
        }
        boolean zTest = this.d.test(i);
        A a = this.c;
        if (zTest == a.a) {
            this.a = true;
            this.b = a.b;
        }
    }
}
