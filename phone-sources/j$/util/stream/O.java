package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes4.dex */
public final class O extends Q implements E {
    @Override // j$.util.stream.H
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC0153v0.r(this, consumer);
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ void m(Object[] objArr, int i) {
        AbstractC0153v0.o(this, (Integer[]) objArr, i);
    }

    @Override // j$.util.stream.G
    public final Object newArray(int i) {
        return new int[i];
    }

    @Override // j$.util.stream.H
    public final Spliterator.OfPrimitive spliterator() {
        return new C0114b0(this);
    }

    @Override // j$.util.stream.H
    public final Spliterator spliterator() {
        return new C0114b0(this);
    }
}
