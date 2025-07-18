package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class axm extends axi implements auh {
    public final cjd a;
    public final aqp b;
    public final cov c;
    public final aue d;
    public final axq e;
    private final boolean f;
    private final axg g;

    public axm(auf aufVar, axg axgVar, cjd cjdVar, cov covVar, axq axqVar, aqp aqpVar, crv crvVar, Executor executor, byg bygVar) {
        new AtomicReference(axc.a);
        new ConcurrentHashMap();
        this.g = axgVar;
        this.b = aqpVar;
        this.d = aufVar.a(executor, covVar, crvVar);
        this.a = cjdVar;
        this.c = covVar;
        this.e = axqVar;
        this.f = ((Boolean) bygVar.d(Boolean.FALSE)).booleanValue();
    }

    @Override // defpackage.axi
    public final void a() {
        axf axfVar = new axf() { // from class: axk
            @Override // defpackage.axf
            public final void a(int i, String str) {
                axm axmVar = this.a;
                if (axmVar.b.a) {
                    qm.J();
                } else {
                    qm.O(new axj(axmVar, i, str, 0), axmVar.a);
                }
            }
        };
        axg axgVar = this.g;
        axgVar.d = axfVar;
        if (axgVar.c.getAndSet(true)) {
            return;
        }
        qm.O(new ave(axgVar, 4), axgVar.b);
    }

    @Override // defpackage.auh
    public final void t() {
        if (this.f) {
            a();
        }
    }
}
