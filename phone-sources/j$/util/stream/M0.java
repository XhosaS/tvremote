package j$.util.stream;

import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntFunction;

/* loaded from: classes4.dex */
public final class M0 extends G0 {
    public final Comparator l;

    public M0(G0 g0, Comparator comparator) {
        super(g0, a1.o | a1.n);
        comparator.getClass();
        this.l = comparator;
    }

    @Override // j$.util.stream.AbstractC0111a
    public final H h(AbstractC0111a abstractC0111a, Spliterator spliterator, IntFunction intFunction) {
        H hBuild;
        a1 a1Var = a1.SORTED;
        int i = abstractC0111a.f;
        a1Var.getClass();
        if (abstractC0111a.a.k) {
            hBuild = abstractC0111a.d(abstractC0111a, spliterator, intFunction);
        } else {
            C cG = abstractC0111a.g(abstractC0111a.e(spliterator), intFunction);
            abstractC0111a.n(spliterator, cG);
            hBuild = cG.build();
        }
        Object[] objArrP = hBuild.p(intFunction);
        Arrays.sort(objArrP, this.l);
        return new J(objArrP);
    }

    @Override // j$.util.stream.AbstractC0111a
    public final boolean i() {
        return true;
    }

    @Override // j$.util.stream.AbstractC0111a
    public final K0 j(int i, K0 k0) {
        k0.getClass();
        a1.SORTED.t(i);
        boolean zT = a1.SIZED.t(i);
        Comparator comparator = this.l;
        return zT ? new O0(k0, comparator) : new N0(k0, comparator);
    }
}
