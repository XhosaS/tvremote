package j$.util.stream;

import java.util.function.IntFunction;
import java.util.function.Predicate;

/* renamed from: j$.util.stream.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0092j extends Y {
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0092j(AbstractC0083a abstractC0083a, int i, Object obj, int i2) {
        super(abstractC0083a, i);
        this.k = i2;
        this.l = obj;
    }

    @Override // j$.util.stream.AbstractC0083a
    public final c0 i(c0 c0Var) {
        switch (this.k) {
            case 0:
                return new C0091i(c0Var, (IntFunction) this.l);
            default:
                return new T(c0Var, (Predicate) this.l, 0);
        }
    }
}
