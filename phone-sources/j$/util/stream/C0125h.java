package j$.util.stream;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* renamed from: j$.util.stream.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0125h extends G0 {
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0125h(AbstractC0111a abstractC0111a, Object obj, int i) {
        super(abstractC0111a, 0);
        this.l = i;
        this.m = obj;
    }

    @Override // j$.util.stream.AbstractC0111a
    public final boolean i() {
        return false;
    }

    @Override // j$.util.stream.AbstractC0111a
    public final K0 j(int i, K0 k0) {
        switch (this.l) {
            case 0:
                return new C0123g(k0, (j$.desugar.sun.nio.fs.n) this.m);
            case 1:
                return new r(k0, (j$.desugar.sun.nio.fs.n) this.m);
            case 2:
                return new C0150u(k0, (j$.desugar.sun.nio.fs.n) this.m);
            case 3:
                return new D0(k0, (Consumer) this.m, 0);
            case 4:
                return new D0(k0, (Predicate) this.m, 1);
            default:
                return new D0(k0, (Function) this.m, 2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0125h(G0 g0, int i, Object obj, int i2) {
        super(g0, i);
        this.l = i2;
        this.m = obj;
    }
}
