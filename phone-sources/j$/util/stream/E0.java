package j$.util.stream;

import java.util.function.ToIntFunction;

/* loaded from: classes4.dex */
public final class E0 extends AbstractC0148t {
    public final /* synthetic */ ToIntFunction l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(G0 g0, int i, ToIntFunction toIntFunction) {
        super(g0, i);
        this.l = toIntFunction;
    }

    @Override // j$.util.stream.AbstractC0111a
    public final boolean i() {
        return false;
    }

    @Override // j$.util.stream.AbstractC0111a
    public final K0 j(int i, K0 k0) {
        return new D0(k0, this.l, 3);
    }
}
