package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dha extends czr {
    private final byte[] a;
    private final byte[] b;

    private dha(dag dagVar) {
        if (!czo.m(dagVar.h(0)).o(0)) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        this.a = dos.p(dbh.f(dagVar.h(1)).b);
        this.b = dos.p(dbh.f(dagVar.h(2)).b);
    }

    public static dha a(Object obj) {
        if (obj != null) {
            return new dha(dag.j(obj));
        }
        return null;
    }

    public final byte[] b() {
        return dos.p(this.a);
    }

    public final byte[] c() {
        return dos.p(this.b);
    }

    @Override // defpackage.czr, defpackage.czb
    public final dab p() {
        czc czcVar = new czc();
        czcVar.b(new czo(0L));
        czcVar.b(new dbh(this.a));
        czcVar.b(new dbh(this.b));
        return new dbk(czcVar);
    }

    public dha(byte[] bArr, byte[] bArr2) {
        this.a = dos.p(bArr);
        this.b = dos.p(bArr2);
    }
}
