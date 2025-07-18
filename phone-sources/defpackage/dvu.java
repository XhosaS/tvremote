package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dvu extends dvv {
    private final hn g;

    public dvu() {
        this.g = new hn();
    }

    @Override // defpackage.dvs
    protected void f() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((dvt) ((hj) ((hl) it).next()).b).b();
        }
    }

    @Override // defpackage.dvs
    protected void g() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            dvt dvtVar = (dvt) ((hj) ((hl) it).next()).b;
            dvtVar.a.i(dvtVar);
        }
    }

    public final void n(dvs dvsVar, dvw dvwVar) {
        dvt dvtVar = new dvt(dvsVar, dvwVar);
        dvt dvtVar2 = (dvt) this.g.f(dvsVar, dvtVar);
        if (dvtVar2 != null && dvtVar2.b != dvwVar) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (dvtVar2 == null && l()) {
            dvtVar.b();
        }
    }

    public dvu(Object obj) {
        super(obj);
        this.g = new hn();
    }
}
