package j$.util.stream;

import java.util.function.Function;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final class D extends F {
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D(F f, int i, Object obj, int i2) {
        super(f, i);
        this.k = i2;
        this.l = obj;
    }

    @Override // j$.util.stream.AbstractC0015a
    public final boolean d() {
        return false;
    }

    @Override // j$.util.stream.AbstractC0015a
    public final G e(G g) {
        switch (this.k) {
            case 0:
                return new C(g, (Predicate) this.l, 0);
            default:
                return new C(g, (Function) this.l, 1);
        }
    }
}
