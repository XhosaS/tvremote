package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgk extends czr {
    public byte[] a;
    public byte[] b;
    public byte[] c;
    public byte[] d;
    public byte[] e;
    private final int f;
    private dgl g;

    public dgk(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, dgl dglVar) {
        this.f = 0;
        this.a = dos.p(bArr);
        this.b = dos.p(bArr2);
        this.c = dos.p(bArr3);
        this.d = dos.p(bArr4);
        this.e = dos.p(bArr5);
        this.g = dglVar;
    }

    @Override // defpackage.czr, defpackage.czb
    public final dab p() {
        czc czcVar = new czc();
        czcVar.b(new czo(this.f));
        czcVar.b(new dbh(this.a));
        czcVar.b(new dbh(this.b));
        czcVar.b(new dbh(this.c));
        czcVar.b(new dbh(this.d));
        czcVar.b(new dbh(this.e));
        dgl dglVar = this.g;
        if (dglVar != null) {
            czcVar.b(new dgl(dglVar.b()));
        }
        return new dbk(czcVar);
    }

    public dgk(dag dagVar) {
        int iF = czo.m(dagVar.h(0)).f();
        this.f = iF;
        if (iF == 0) {
            this.a = dos.p(czx.f(dagVar.h(1)).b);
            this.b = dos.p(czx.f(dagVar.h(2)).b);
            this.c = dos.p(czx.f(dagVar.h(3)).b);
            this.d = dos.p(czx.f(dagVar.h(4)).b);
            this.e = dos.p(czx.f(dagVar.h(5)).b);
            if (dagVar.b() == 7) {
                this.g = dgl.a(dagVar.h(6));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("unrecognized version");
    }
}
