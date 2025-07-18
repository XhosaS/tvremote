package j$.util.stream;

import java.util.function.Function;

/* loaded from: classes3.dex */
public final class U extends Y {
    public final /* synthetic */ int k;
    public final /* synthetic */ Function l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U(Z z, int i, Function function, int i2) {
        super(z, i);
        this.k = i2;
        this.l = function;
    }

    @Override // j$.util.stream.AbstractC0083a
    public final c0 i(c0 c0Var) {
        switch (this.k) {
            case 0:
                return new T(c0Var, this.l, 1);
            default:
                return new W(c0Var, this.l);
        }
    }
}
