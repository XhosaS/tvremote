package j$.util.stream;

import java.util.function.ToIntFunction;

/* loaded from: classes3.dex */
public final class V extends AbstractC0094l {
    public final /* synthetic */ ToIntFunction k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(Z z, int i, ToIntFunction toIntFunction) {
        super(z, i);
        this.k = toIntFunction;
    }

    @Override // j$.util.stream.AbstractC0083a
    public final boolean h() {
        return false;
    }

    @Override // j$.util.stream.AbstractC0083a
    public final c0 i(c0 c0Var) {
        return new T(c0Var, this.k, 2);
    }
}
