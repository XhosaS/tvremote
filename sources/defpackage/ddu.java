package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddu extends czr {
    dag a;
    public czo b;
    public czo c;
    public dcw d;
    dcp e;
    ddv f;
    ddv g;
    dcp h;
    public ddp i;
    public cyw j;
    public cyw k;
    public ddi l;

    private ddu(dag dagVar) {
        int i;
        boolean z;
        boolean z2;
        this.a = dagVar;
        if (dagVar.h(0) instanceof dal) {
            this.b = czo.n((dal) dagVar.h(0), true);
            i = 0;
        } else {
            this.b = new czo(0L);
            i = -1;
        }
        if (this.b.o(0)) {
            z2 = false;
            z = true;
        } else if (this.b.o(1)) {
            z = false;
            z2 = true;
        } else {
            if (!this.b.o(2)) {
                throw new IllegalArgumentException("version number not recognised");
            }
            z = false;
            z2 = false;
        }
        this.c = czo.m(dagVar.h(i + 1));
        this.d = dcw.a(dagVar.h(i + 2));
        this.e = dcp.b(dagVar.h(i + 3));
        dag dagVar2 = (dag) dagVar.h(i + 4);
        this.f = ddv.c(dagVar2.h(0));
        this.g = ddv.c(dagVar2.h(1));
        this.h = dcp.b(dagVar.h(i + 5));
        int i2 = i + 6;
        this.i = ddp.b(dagVar.h(i2));
        int iB = (dagVar.b() - i2) - 1;
        if (iB != 0 && z) {
            throw new IllegalArgumentException("version 1 certificate contains extra data");
        }
        while (iB > 0) {
            dal dalVar = (dal) dagVar.h(i2 + iB);
            int i3 = dalVar.c;
            if (i3 == 1) {
                this.j = cyw.o(dalVar);
            } else if (i3 == 2) {
                this.k = cyw.o(dalVar);
            } else {
                if (i3 != 3) {
                    throw new IllegalArgumentException(b.e(i3, "Unknown tag encountered in structure: "));
                }
                if (z2) {
                    throw new IllegalArgumentException("version 2 certificate cannot contain extensions");
                }
                this.l = ddi.c(dag.m(dalVar, true));
            }
            iB--;
        }
    }

    public static ddu a(Object obj) {
        if (obj instanceof ddu) {
            return (ddu) obj;
        }
        if (obj != null) {
            return new ddu(dag.j(obj));
        }
        return null;
    }

    @Override // defpackage.czr, defpackage.czb
    public final dab p() {
        if (doh.a("org.bouncycastle.x509.allow_non-der_tbscert") == null || doh.b("org.bouncycastle.x509.allow_non-der_tbscert")) {
            return this.a;
        }
        czc czcVar = new czc();
        if (!this.b.o(0)) {
            czcVar.b(new dbm(true, 0, this.b));
        }
        czcVar.b(this.c);
        czcVar.b(this.d);
        czcVar.b(this.e);
        czc czcVar2 = new czc(2);
        czcVar2.b(this.f);
        czcVar2.b(this.g);
        czcVar.b(new dbk(czcVar2));
        dcp dcpVar = this.h;
        if (dcpVar != null) {
            czcVar.b(dcpVar);
        } else {
            czcVar.b(new dbk());
        }
        czcVar.b(this.i);
        cyw cywVar = this.j;
        if (cywVar != null) {
            czcVar.b(new dbm(false, 1, cywVar));
        }
        cyw cywVar2 = this.k;
        if (cywVar2 != null) {
            czcVar.b(new dbm(false, 2, cywVar2));
        }
        ddi ddiVar = this.l;
        if (ddiVar != null) {
            czcVar.b(new dbm(true, 3, ddiVar));
        }
        return new dbk(czcVar);
    }
}
