package defpackage;

import java.util.Enumeration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dch extends czr implements dci {
    private final czv I;
    private czb J;
    private boolean K;

    public dch(czv czvVar, czb czbVar) {
        this.K = true;
        this.I = czvVar;
        this.J = czbVar;
    }

    @Override // defpackage.czr, defpackage.czb
    public final dab p() {
        czc czcVar = new czc(2);
        czcVar.b(this.I);
        czb czbVar = this.J;
        if (czbVar != null) {
            czcVar.b(new daz(czbVar));
        }
        return this.K ? new daw(czcVar) : new dbs(czcVar);
    }

    public dch(dag dagVar) {
        this.K = true;
        Enumeration enumerationF = dagVar.f();
        this.I = (czv) enumerationF.nextElement();
        if (enumerationF.hasMoreElements()) {
            this.J = ((dal) enumerationF.nextElement()).f();
        }
        this.K = dagVar instanceof daw;
    }
}
