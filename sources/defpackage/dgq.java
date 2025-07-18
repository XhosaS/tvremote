package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgq extends czr {
    public final int a;
    public final int b;
    public final dcw c;
    public final dnz d;

    public dgq(int i, int i2, dnz dnzVar, dcw dcwVar) {
        this.a = i;
        this.b = i2;
        this.d = new dnz(dnzVar.a());
        this.c = dcwVar;
    }

    @Override // defpackage.czr, defpackage.czb
    public final dab p() {
        czc czcVar = new czc();
        czcVar.b(new czo(this.a));
        czcVar.b(new czo(this.b));
        czcVar.b(new dbh(this.d.a()));
        czcVar.b(this.c);
        return new dbk(czcVar);
    }

    public dgq(dag dagVar) {
        this.a = ((czo) dagVar.h(0)).f();
        this.b = ((czo) dagVar.h(1)).f();
        this.d = new dnz(((czx) dagVar.h(2)).b);
        this.c = dcw.a(dagVar.h(3));
    }
}
