package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.LongConsumer$CC;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.l0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0134l0 extends AbstractC0138n0 implements J0 {
    public final long[] h;

    public C0134l0(Spliterator spliterator, AbstractC0111a abstractC0111a, long[] jArr) {
        super(spliterator, abstractC0111a, jArr.length);
        this.h = jArr;
    }

    @Override // j$.util.stream.AbstractC0138n0
    public final AbstractC0138n0 a(Spliterator spliterator, long j, long j2) {
        return new C0134l0(this, spliterator, j, j2);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        n((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return LongConsumer$CC.$default$andThen(this, longConsumer);
    }

    @Override // j$.util.stream.J0
    public final /* synthetic */ void n(Long l) {
        AbstractC0153v0.i(this, l);
    }

    @Override // j$.util.stream.AbstractC0138n0, j$.util.stream.K0
    public final void accept(long j) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        long[] jArr = this.h;
        this.f = i + 1;
        jArr[i] = j;
    }

    public C0134l0(C0134l0 c0134l0, Spliterator spliterator, long j, long j2) {
        super(c0134l0, spliterator, j, j2, c0134l0.h.length);
        this.h = c0134l0.h;
    }
}
