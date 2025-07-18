package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jec implements ovf {
    public final String a;
    public final lfn b;
    public final lhr c;
    public final nuh d;
    private final yfo e;
    private final ouy f;

    public jec(ouy ouyVar, yfo yfoVar, nuh nuhVar, lhr lhrVar, String str, lfn lfnVar) {
        ouyVar.getClass();
        yfoVar.getClass();
        nuhVar.getClass();
        lhrVar.getClass();
        str.getClass();
        lfnVar.getClass();
        this.f = ouyVar;
        this.e = yfoVar;
        this.d = nuhVar;
        this.c = lhrVar;
        this.a = str;
        this.b = lfnVar;
    }

    public final eqb a(ksy ksyVar) {
        int iAU = a.aU(hju.t(ksyVar).c);
        if (iAU == 0) {
            iAU = 1;
        }
        ovi oviVar = new ovi(new our(ksyVar.b, qtl.au(iAU)), this.f, this.e);
        eop eopVar = new eop();
        eopVar.b(1, 2);
        eopVar.a = false;
        eopVar.b = true;
        eopVar.c(dys.d, new jeb(oviVar, this, 0));
        return new eqb(eopVar.a(oviVar), new eph((byte[]) null));
    }
}
