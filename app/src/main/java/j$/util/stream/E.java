package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
public final class E extends G implements b0 {
    public final int[] h;

    public E(Spliterator spliterator, AbstractC0083a abstractC0083a, int[] iArr) {
        super(spliterator, abstractC0083a, iArr.length);
        this.h = iArr;
    }

    @Override // j$.util.stream.G
    public final G a(Spliterator spliterator, long j, long j2) {
        return new E(this, spliterator, j, j2);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        e((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.desugar.sun.nio.fs.g.a(this, intConsumer);
    }

    @Override // j$.util.stream.b0
    public final /* synthetic */ void e(Integer num) {
        L.e(this, num);
    }

    @Override // j$.util.stream.G, j$.util.stream.c0
    public final void accept(int i) {
        int i2 = this.f;
        if (i2 >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        int[] iArr = this.h;
        this.f = i2 + 1;
        iArr[i2] = i;
    }

    public E(E e, Spliterator spliterator, long j, long j2) {
        super(e, spliterator, j, j2, e.h.length);
        this.h = e.h;
    }
}
