package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class csr implements csz {
    private final ctu a;
    private final csz b;

    public csr(csz cszVar, ctu ctuVar) {
        this.a = ctuVar;
        this.b = cszVar instanceof csr ? ((csr) cszVar).b : cszVar;
    }

    public final csy a(csy csyVar) {
        return (csy) this.a.a(csyVar);
    }

    public final boolean b(csz cszVar) {
        cszVar.getClass();
        return cszVar == this || this.b == cszVar;
    }

    public csr() {
        this(csw.a, new kw(2));
    }
}
