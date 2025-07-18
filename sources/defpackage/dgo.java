package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgo extends czr {
    public final byte[] a;
    public final byte[] b;

    public dgo(dag dagVar) {
        this.a = dos.p(czx.f(dagVar.h(0)).b);
        this.b = dos.p(czx.f(dagVar.h(1)).b);
    }

    @Override // defpackage.czr, defpackage.czb
    public final dab p() {
        czc czcVar = new czc();
        czcVar.b(new dbh(this.a));
        czcVar.b(new dbh(this.b));
        return new dbk(czcVar);
    }
}
