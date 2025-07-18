package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pnh implements plo {
    private final plo a = new png(0);
    private final plo b;
    private final Map c;

    public pnh(plo ploVar, Map map) {
        this.b = ploVar;
        this.c = map;
    }

    private final plo i(pjk pjkVar) {
        if (!(pjkVar instanceof plh)) {
            return this.a;
        }
        plh plhVar = (plh) pjkVar;
        pka pkaVarA = plhVar.a();
        vvd vvdVar = pnj.a;
        pkaVarA.i(vvdVar);
        vtr vtrVar = pkaVarA.l;
        vub vubVar = (vub) vvdVar.c;
        if (!vtrVar.m(vubVar)) {
            return this.b;
        }
        pka pkaVarA2 = plhVar.a();
        pkaVarA2.i(vvdVar);
        Object objK = pkaVarA2.l.k(vubVar);
        if (objK == null) {
            objK = vvdVar.b;
        } else {
            vvdVar.c(objK);
        }
        plo ploVar = (plo) this.c.get(((pni) objK).c);
        ploVar.getClass();
        return ploVar;
    }

    @Override // defpackage.plo
    public final tst a(pjk pjkVar) {
        return i(pjkVar).a(pjkVar);
    }

    @Override // defpackage.plo
    public final tst b(pjk pjkVar) {
        return i(pjkVar).b(pjkVar);
    }

    @Override // defpackage.plo
    public final tst c(pjk pjkVar) {
        return i(pjkVar).c(pjkVar);
    }

    @Override // defpackage.plo
    public final uhp d(pjk pjkVar, uhp uhpVar) {
        return i(pjkVar).d(pjkVar, uhpVar);
    }

    @Override // defpackage.plo
    public final uhp e(pjk pjkVar, uhp uhpVar) {
        return i(pjkVar).e(pjkVar, uhpVar);
    }

    @Override // defpackage.plo
    public final String f(pjk pjkVar) {
        return i(pjkVar).f(pjkVar);
    }

    @Override // defpackage.plo
    public final uhp g() {
        return sfy.C(null);
    }

    @Override // defpackage.plo
    public final void h(pjk pjkVar) {
        i(pjkVar).h(pjkVar);
    }
}
