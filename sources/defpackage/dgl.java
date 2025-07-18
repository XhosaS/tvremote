package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgl extends czr {
    private final byte[] a;

    public dgl(byte[] bArr) {
        this.a = bArr;
    }

    public static dgl a(Object obj) {
        if (obj instanceof dgl) {
            return (dgl) obj;
        }
        if (obj != null) {
            return new dgl(dag.j(obj));
        }
        return null;
    }

    public final byte[] b() {
        return dos.p(this.a);
    }

    @Override // defpackage.czr, defpackage.czb
    public final dab p() {
        czc czcVar = new czc();
        czcVar.b(new dbh(this.a));
        return new dbk(czcVar);
    }

    public dgl(dag dagVar) {
        this.a = dos.p(czx.f(dagVar.h(0)).b);
    }
}
