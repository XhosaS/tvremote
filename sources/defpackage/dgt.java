package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgt extends czr {
    public byte[] a;
    public byte[] b;
    public dgu c;
    private final int d;

    public dgt(dag dagVar) {
        int iF = czo.m(dagVar.h(0)).f();
        this.d = iF;
        if (iF != 0) {
            throw new IllegalArgumentException("unrecognized version");
        }
        this.a = dos.p(czx.f(dagVar.h(1)).b);
        this.b = dos.p(czx.f(dagVar.h(2)).b);
        if (dagVar.b() == 4) {
            czb czbVarH = dagVar.h(3);
            this.c = czbVarH instanceof dgu ? (dgu) czbVarH : czbVarH != null ? new dgu(dag.j(czbVarH)) : null;
        }
    }

    @Override // defpackage.czr, defpackage.czb
    public final dab p() {
        czc czcVar = new czc();
        czcVar.b(new czo(this.d));
        czcVar.b(new dbh(this.a));
        czcVar.b(new dbh(this.b));
        dgu dguVar = this.c;
        if (dguVar != null) {
            czcVar.b(new dgu(dguVar.b(), this.c.a()));
        }
        return new dbk(czcVar);
    }
}
