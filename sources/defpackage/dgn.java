package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgn extends czr {
    public final byte[] a;

    public dgn(byte[] bArr) {
        this.a = bArr;
    }

    @Override // defpackage.czr, defpackage.czb
    public final dab p() {
        czc czcVar = new czc();
        czcVar.b(new dbh(this.a));
        return new dbk(czcVar);
    }

    public dgn(dag dagVar) {
        this.a = dos.p(czx.f(dagVar.h(0)).b);
    }
}
