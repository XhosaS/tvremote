package defpackage;

import java.util.Enumeration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcl extends czr implements dci {
    public dai I;
    public dai J;
    private czo K;
    private dai L;
    private dch M;
    private dai N;

    public dcl(czo czoVar, dai daiVar, dch dchVar, dai daiVar2, dai daiVar3) {
        this.K = czoVar;
        this.L = daiVar;
        this.M = dchVar;
        this.I = daiVar2;
        this.J = null;
        this.N = daiVar3;
    }

    public static dcl a(Object obj) {
        if (obj != null) {
            return new dcl(dag.j(obj));
        }
        return null;
    }

    @Override // defpackage.czr, defpackage.czb
    public final dab p() {
        czc czcVar = new czc(6);
        czcVar.b(this.K);
        czcVar.b(this.L);
        czcVar.b(this.M);
        dai daiVar = this.I;
        if (daiVar != null) {
            czcVar.b(new dbm(false, 0, daiVar));
        }
        dai daiVar2 = this.J;
        if (daiVar2 != null) {
            czcVar.b(new dbm(false, 1, daiVar2));
        }
        czcVar.b(this.N);
        return new daw(czcVar);
    }

    public dcl(dag dagVar) {
        Enumeration enumerationF = dagVar.f();
        this.K = (czo) enumerationF.nextElement();
        this.L = (dai) enumerationF.nextElement();
        Object objNextElement = enumerationF.nextElement();
        this.M = objNextElement instanceof dch ? (dch) objNextElement : objNextElement != null ? new dch(dag.j(objNextElement)) : null;
        while (enumerationF.hasMoreElements()) {
            dab dabVar = (dab) enumerationF.nextElement();
            if (dabVar instanceof dal) {
                dal dalVar = (dal) dabVar;
                int i = dalVar.c;
                if (i == 0) {
                    this.I = dai.h(dalVar);
                } else {
                    if (i != 1) {
                        throw new IllegalArgumentException(b.e(i, "unknown tag value "));
                    }
                    this.J = dai.h(dalVar);
                }
            } else {
                this.N = (dai) dabVar;
            }
        }
    }
}
