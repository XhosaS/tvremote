package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbe extends czg {
    public dbe(czv czvVar, czo czoVar, dab dabVar, int i, dab dabVar2) {
        super(czvVar, czoVar, dabVar, i, dabVar2);
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
            czcVar.b(dabVar.k());
        }
        int i = this.d;
        czcVar.b(new dbm(i == 0, i, this.e));
        return new dbk(czcVar);
    }

    @Override // defpackage.czg, defpackage.dab
    public final dab k() {
        return this;
    }

    @Override // defpackage.dab
    public final dab l() {
        return this;
    }
}
