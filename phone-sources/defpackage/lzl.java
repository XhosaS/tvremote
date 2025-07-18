package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lzl implements idf {
    private static final lxq d = new lxq(10);
    private final ldv a;
    private final idf b;
    private final idf c;

    public lzl(ldv ldvVar, idf idfVar, idf idfVar2) {
        this.a = ldvVar;
        this.b = idfVar;
        this.c = idfVar2;
    }

    private static String a(mfp mfpVar, String str, ldv ldvVar) {
        String strJ = ldvVar.j(ksn.a(str));
        mfpVar.b("Authorization", "Bearer ".concat(strJ));
        return strJ;
    }

    @Override // defpackage.idf
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        String strA;
        lxy lxyVar = (lxy) obj;
        mfp mfpVar = (mfp) this.b.b(lxyVar);
        if (!lxyVar.b()) {
            try {
                strA = a(mfpVar, lxyVar.a(), this.a);
            } catch (ldt unused) {
                strA = null;
            }
            idf idfVar = this.c;
            ieg iegVarC = ((ieg) idfVar.b(mfpVar)).c(d);
            if (strA == null || iegVarC.m() || !mfr.a(iegVarC.i())) {
                return iegVarC;
            }
            this.a.n(strA);
            mfpVar.e.remove("Authorization");
            return (ieg) idfVar.b(mfpVar);
        }
        String strA2 = lxyVar.a();
        idf idfVar2 = this.c;
        ldv ldvVar = this.a;
        try {
            String strA3 = a(mfpVar, strA2, ldvVar);
            ieg iegVarC2 = ((ieg) idfVar2.b(mfpVar)).c(d);
            if (!iegVarC2.m() && mfr.a(iegVarC2.i())) {
                ldvVar.n(strA3);
                a(mfpVar, strA2, ldvVar);
                return (ieg) idfVar2.b(mfpVar);
            }
            return iegVarC2;
        } catch (ldt e) {
            return ieg.b(e);
        }
    }
}
