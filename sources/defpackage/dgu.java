package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgu extends czr {
    private final byte[] a;
    private final byte[] b;

    public dgu(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.b = bArr2;
    }

    public final byte[] a() {
        return dos.p(this.b);
    }

    public final byte[] b() {
        return dos.p(this.a);
    }

    @Override // defpackage.czr, defpackage.czb
    public final dab p() {
        czc czcVar = new czc();
        czcVar.b(new dbh(this.a));
        czcVar.b(new dbh(this.b));
        return new dbk(czcVar);
    }

    public dgu(dag dagVar) {
        this.a = dos.p(czx.f(dagVar.h(0)).b);
        this.b = dos.p(czx.f(dagVar.h(1)).b);
    }
}
