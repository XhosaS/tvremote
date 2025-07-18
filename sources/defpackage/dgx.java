package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgx extends czr {
    public final int a;
    public final long b;
    public final long c;
    public final byte[] d;
    public final byte[] e;
    public final byte[] f;
    public final byte[] g;
    private final byte[] h;

    public dgx(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = 0;
        this.b = j;
        this.d = dos.p(bArr);
        this.e = dos.p(bArr2);
        this.f = dos.p(bArr3);
        this.g = dos.p(bArr4);
        this.h = dos.p(bArr5);
        this.c = -1L;
    }

    public final byte[] a() {
        return dos.p(this.h);
    }

    @Override // defpackage.czr, defpackage.czb
    public final dab p() {
        czc czcVar = new czc();
        long j = this.c;
        if (j >= 0) {
            czcVar.b(new czo(1L));
        } else {
            czcVar.b(new czo(0L));
        }
        czc czcVar2 = new czc();
        czcVar2.b(new czo(this.b));
        czcVar2.b(new dbh(this.d));
        czcVar2.b(new dbh(this.e));
        czcVar2.b(new dbh(this.f));
        czcVar2.b(new dbh(this.g));
        if (j >= 0) {
            czcVar2.b(new dbm(false, 0, new czo(j)));
        }
        czcVar.b(new dbk(czcVar2));
        czcVar.b(new dbm(true, 0, new dbh(this.h)));
        return new dbk(czcVar);
    }

    public dgx(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, long j2) {
        this.a = 1;
        this.b = j;
        this.d = dos.p(bArr);
        this.e = dos.p(bArr2);
        this.f = dos.p(bArr3);
        this.g = dos.p(bArr4);
        this.h = dos.p(bArr5);
        this.c = j2;
    }

    public dgx(dag dagVar) {
        czo czoVarM = czo.m(dagVar.h(0));
        if (!czoVarM.o(0) && !czoVarM.o(1)) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        this.a = czoVarM.f();
        if (dagVar.b() != 2 && dagVar.b() != 3) {
            throw new IllegalArgumentException("key sequence wrong size");
        }
        dag dagVarJ = dag.j(dagVar.h(1));
        this.b = czo.m(dagVarJ.h(0)).h();
        this.d = dos.p(dbh.f(dagVarJ.h(1)).b);
        this.e = dos.p(dbh.f(dagVarJ.h(2)).b);
        this.f = dos.p(dbh.f(dagVarJ.h(3)).b);
        this.g = dos.p(dbh.f(dagVarJ.h(4)).b);
        if (dagVarJ.b() == 6) {
            dal dalVarM = dal.m(dagVarJ.h(5));
            if (dalVarM.c == 0) {
                this.c = czo.n(dalVarM, false).h();
            } else {
                throw new IllegalArgumentException("unknown tag in XMSSPrivateKey");
            }
        } else if (dagVarJ.b() == 5) {
            this.c = -1L;
        } else {
            throw new IllegalArgumentException("keySeq should be 5 or 6 in length");
        }
        if (dagVar.b() == 3) {
            this.h = dos.p(dbh.g(dal.m(dagVar.h(2)), true).b);
        } else {
            this.h = null;
        }
    }
}
