package defpackage;

import java.util.Enumeration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddd extends czr {
    public ddt a;
    public dcw b;
    public cyw c;
    boolean d = false;
    int e;

    private ddd(dag dagVar) {
        if (dagVar.b() != 3) {
            throw new IllegalArgumentException("sequence wrong size for CertificateList");
        }
        czb czbVarH = dagVar.h(0);
        this.a = czbVarH instanceof ddt ? (ddt) czbVarH : czbVarH != null ? new ddt(dag.j(czbVarH)) : null;
        this.b = dcw.a(dagVar.h(1));
        this.c = cyw.i(dagVar.h(2));
    }

    public static ddd c(Object obj) {
        if (obj instanceof ddd) {
            return (ddd) obj;
        }
        if (obj != null) {
            return new ddd(dag.j(obj));
        }
        return null;
    }

    public final Enumeration a() {
        dag dagVar = this.a.f;
        return dagVar == null ? new ddr() : new dds(dagVar.f());
    }

    public final dcp b() {
        return this.a.c;
    }

    @Override // defpackage.czr
    public final int hashCode() {
        if (!this.d) {
            this.e = super.hashCode();
            this.d = true;
        }
        return this.e;
    }

    @Override // defpackage.czr, defpackage.czb
    public final dab p() {
        czc czcVar = new czc(3);
        czcVar.b(this.a);
        czcVar.b(this.b);
        czcVar.b(this.c);
        return new dbk(czcVar);
    }
}
