package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.DoubleConsumer$CC;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.j0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0130j0 extends AbstractC0138n0 implements H0 {
    public final double[] h;

    public C0130j0(Spliterator spliterator, AbstractC0111a abstractC0111a, double[] dArr) {
        super(spliterator, abstractC0111a, dArr.length);
        this.h = dArr;
    }

    @Override // j$.util.stream.AbstractC0138n0
    public final AbstractC0138n0 a(Spliterator spliterator, long j, long j2) {
        return new C0130j0(this, spliterator, j, j2);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        r((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return DoubleConsumer$CC.$default$andThen(this, doubleConsumer);
    }

    @Override // j$.util.stream.H0
    public final /* synthetic */ void r(Double d) {
        AbstractC0153v0.e(this, d);
    }

    @Override // j$.util.stream.AbstractC0138n0, j$.util.stream.K0
    public final void accept(double d) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        double[] dArr = this.h;
        this.f = i + 1;
        dArr[i] = d;
    }

    public C0130j0(C0130j0 c0130j0, Spliterator spliterator, long j, long j2) {
        super(c0130j0, spliterator, j, j2, c0130j0.h.length);
        this.h = c0130j0.h;
    }
}
