package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dwo extends dvk {
    dvk n;

    public dwo(dve dveVar, dru druVar, dwn dwnVar, eoe eoeVar, dvk dvkVar) {
        super(dveVar, druVar, dwnVar, eoeVar, dvkVar);
    }

    @Override // defpackage.dvk
    public final /* synthetic */ dvs j() {
        return (dwn) this.c;
    }

    @Override // defpackage.dvk
    public final void k(int i, int i2, dxt dxtVar) {
        dru druVarE;
        boolean z = ebc.a;
        dvs dvsVar = this.c;
        dve dveVar = this.a;
        dvd dvdVar = dveVar.b;
        drq drqVarD = dvsVar.d();
        if (dvdVar == null) {
            throw new IllegalStateException(drqVarD.d().concat(": To measure a component outside of a layout calculation use Component#measureMightNotCacheInternalNode."));
        }
        if (dvsVar.b() == 1) {
            dvk dvkVar = this.f;
            druVarE = dvkVar != null ? dvkVar.j().e() : dvdVar.b;
        } else {
            druVarE = dvsVar.k(1).b;
        }
        dvk dvkVarB = duy.b(dveVar, druVarE, this, i, i2);
        dxtVar.a = dvkVarB != null ? (int) dvkVarB.e.b() : 0;
        dxtVar.b = dvkVarB != null ? (int) dvkVarB.e.a() : 0;
    }
}
