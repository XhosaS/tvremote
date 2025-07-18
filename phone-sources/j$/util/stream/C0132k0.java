package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.k0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0132k0 extends AbstractC0138n0 implements I0 {
    public final int[] h;

    public C0132k0(Spliterator spliterator, AbstractC0111a abstractC0111a, int[] iArr) {
        super(spliterator, abstractC0111a, iArr.length);
        this.h = iArr;
    }

    @Override // j$.util.stream.AbstractC0138n0
    public final AbstractC0138n0 a(Spliterator spliterator, long j, long j2) {
        return new C0132k0(this, spliterator, j, j2);
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

    @Override // j$.util.stream.AbstractC0138n0, j$.util.stream.K0
    public final void accept(int i) {
        int i2 = this.f;
        if (i2 >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        int[] iArr = this.h;
        this.f = i2 + 1;
        iArr[i2] = i;
    }

    public C0132k0(C0132k0 c0132k0, Spliterator spliterator, long j, long j2) {
        super(c0132k0, spliterator, j, j2, c0132k0.h.length);
        this.h = c0132k0.h;
    }
}
