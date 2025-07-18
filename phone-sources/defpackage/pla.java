package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pla extends pjx {
    public static boolean a = false;
    private final pji b;

    public pla(pji pjiVar) {
        this.b = pjiVar;
    }

    @Override // defpackage.pjx
    public final void b(final pjw pjwVar, final pju pjuVar) {
        this.b.b(new pjh() { // from class: pkz
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Set] */
            @Override // defpackage.pjh
            public final List a() {
                pju pjuVar2 = pjuVar;
                ucz uczVarA = pjc.a();
                sij.x(pjuVar2 != null, "View is not instrumented.");
                ?? r4 = pjuVar2.f.a;
                if (!r4.isEmpty()) {
                    for (pku pkuVar : r4) {
                        sjl.c();
                        Object obj = pkuVar.a;
                        pkv pkvVar = (pkv) obj;
                        if (pkvVar.c) {
                            sjl.f(pkvVar.f);
                            new nur(obj, 20).run();
                        } else {
                            Runnable runnable = pkvVar.f;
                            if (runnable != null) {
                                sjl.f(runnable);
                                new nur(obj, 19).run();
                            }
                        }
                    }
                }
                sij.A(pjuVar2.d(), "VE is not impressed: %s {attached=%s}", pjuVar2, Boolean.valueOf(pjuVar2.c.n()));
                if (!pla.a) {
                    sij.z(pjuVar2.f() == 1, "VE is not visible: %s", pjuVar2);
                }
                pjw pjwVar2 = pjwVar;
                ArrayList arrayList = new ArrayList();
                qtl.as(pjuVar2, arrayList);
                return ImmutableList.of(new plk(uczVarA, arrayList, pjwVar2, rdd.ad(), false));
            }
        });
    }
}
