package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbp extends czg {
    public dbp(dbs dbsVar) {
        super(dbsVar);
    }

    @Override // defpackage.czg
    public final dag b() {
        czc czcVar = new czc(4);
        czv czvVar = this.a;
        if (czvVar != null) {
            czcVar.b(czvVar);
        }
        czo czoVar = this.b;
        if (czoVar != null) {
            czcVar.b(czoVar);
        }
        dab dabVar = this.c;
        if (dabVar != null) {
            czcVar.b(dabVar.l());
        }
        int i = this.d;
        czcVar.b(new dbu(i == 0, i, this.e));
        return new dbs(czcVar);
    }

    @Override // defpackage.dab
    public final dab l() {
        return this;
    }
}
