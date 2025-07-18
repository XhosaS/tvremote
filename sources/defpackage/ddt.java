package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddt extends czr {
    public czo a;
    public dcw b;
    dcp c;
    public ddv d;
    public ddv e;
    dag f;
    public ddi g;

    public ddt(dag dagVar) {
        if (dagVar.b() < 3 || dagVar.b() > 7) {
            throw new IllegalArgumentException("Bad sequence size: " + dagVar.b());
        }
        int i = 0;
        if (dagVar.h(0) instanceof czo) {
            this.a = czo.m(dagVar.h(0));
            i = 1;
        } else {
            this.a = null;
        }
        this.b = dcw.a(dagVar.h(i));
        this.c = dcp.b(dagVar.h(i + 1));
        int i2 = i + 3;
        this.d = ddv.c(dagVar.h(i + 2));
        if (i2 < dagVar.b() && ((dagVar.h(i2) instanceof dan) || (dagVar.h(i2) instanceof czi) || (dagVar.h(i2) instanceof ddv))) {
            this.e = ddv.c(dagVar.h(i2));
            i2 = i + 4;
        }
        if (i2 < dagVar.b() && !(dagVar.h(i2) instanceof dal)) {
            this.f = dag.j(dagVar.h(i2));
            i2++;
        }
        if (i2 >= dagVar.b() || !(dagVar.h(i2) instanceof dal)) {
            return;
        }
        this.g = ddi.c(dag.m((dal) dagVar.h(i2), true));
    }

    @Override // defpackage.czr, defpackage.czb
    public final dab p() {
        czc czcVar = new czc(7);
        czo czoVar = this.a;
        if (czoVar != null) {
            czcVar.b(czoVar);
        }
        czcVar.b(this.b);
        czcVar.b(this.c);
        czcVar.b(this.d);
        ddv ddvVar = this.e;
        if (ddvVar != null) {
            czcVar.b(ddvVar);
        }
        dag dagVar = this.f;
        if (dagVar != null) {
            czcVar.b(dagVar);
        }
        ddi ddiVar = this.g;
        if (ddiVar != null) {
            czcVar.b(new dbm(ddiVar));
        }
        return new dbk(czcVar);
    }
}
