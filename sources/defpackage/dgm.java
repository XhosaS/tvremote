package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgm extends czr {
    public byte[] a;
    public byte[] b;
    public byte[] c;
    public dgn d;
    private final int e;

    public dgm(byte[] bArr, byte[] bArr2, byte[] bArr3, dgn dgnVar) {
        this.e = 0;
        this.a = bArr;
        this.b = bArr2;
        this.c = bArr3;
        this.d = dgnVar;
    }

    @Override // defpackage.czr, defpackage.czb
    public final dab p() {
        czc czcVar = new czc();
        czcVar.b(new czo(this.e));
        czcVar.b(new dbh(this.a));
        czcVar.b(new dbh(this.b));
        czcVar.b(new dbh(this.c));
        dgn dgnVar = this.d;
        if (dgnVar != null) {
            czcVar.b(new dgn(dgnVar.a));
        }
        return new dbk(czcVar);
    }

    public dgm(dag dagVar) {
        int iF = czo.m(dagVar.h(0)).f();
        this.e = iF;
        if (iF != 0) {
            throw new IllegalArgumentException("unrecognized version");
        }
        this.a = dos.p(czx.f(dagVar.h(1)).b);
        this.b = dos.p(czx.f(dagVar.h(2)).b);
        this.c = dos.p(czx.f(dagVar.h(3)).b);
        if (dagVar.b() == 5) {
            czb czbVarH = dagVar.h(4);
            this.d = czbVarH instanceof dgn ? (dgn) czbVarH : czbVarH != null ? new dgn(dag.j(czbVarH)) : null;
        }
    }
}
