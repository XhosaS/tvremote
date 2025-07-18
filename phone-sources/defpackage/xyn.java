package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xyn extends xpz {
    public final String b;
    final /* synthetic */ xyr c;
    public final AtomicReference a = new AtomicReference(xyr.e);
    private final xpz d = new xyk(this);

    public xyn(xyr xyrVar, String str) {
        this.c = xyrVar;
        str.getClass();
        this.b = str;
    }

    @Override // defpackage.xpz
    public final xqb a(xsq xsqVar, xpy xpyVar) {
        AtomicReference atomicReference = this.a;
        Object obj = atomicReference.get();
        xrc xrcVar = xyr.e;
        if (obj != xrcVar) {
            return c(xsqVar, xpyVar);
        }
        xyr xyrVar = this.c;
        xwf xwfVar = new xwf(this, 20);
        xtq xtqVar = xyrVar.m;
        xtqVar.execute(xwfVar);
        if (atomicReference.get() != xrcVar) {
            return c(xsqVar, xpyVar);
        }
        if (xyrVar.A.get()) {
            return new xyl();
        }
        xym xymVar = new xym(this, xqo.b(), xsqVar, xpyVar);
        xtqVar.execute(new xxl(this, xymVar, 4));
        return xymVar;
    }

    @Override // defpackage.xpz
    public final String b() {
        return this.b;
    }

    public final xqb c(xsq xsqVar, xpy xpyVar) {
        xrc xrcVar = (xrc) this.a.get();
        if (xrcVar == null) {
            return this.d.a(xsqVar, xpyVar);
        }
        if (!(xrcVar instanceof xzb)) {
            return new xye(xrcVar, this.d, this.c.k, xsqVar, xpyVar);
        }
        xza xzaVarB = ((xzb) xrcVar).b.b(xsqVar);
        if (xzaVarB != null) {
            xpyVar = xpyVar.f(xza.a, xzaVarB);
        }
        return this.d.a(xsqVar, xpyVar);
    }

    final void d(xrc xrcVar) {
        Collection collection;
        AtomicReference atomicReference = this.a;
        xrc xrcVar2 = (xrc) atomicReference.get();
        atomicReference.set(xrcVar);
        if (xrcVar2 != xyr.e || (collection = this.c.w) == null) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((xym) it.next()).j();
        }
    }
}
