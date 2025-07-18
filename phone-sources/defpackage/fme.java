package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fme implements fmj {
    private dze a;
    private edo b;
    private fel c;

    public fme(String str) {
        dzd dzdVar = new dzd();
        dzdVar.a("video/mp2t");
        dzdVar.d(str);
        this.a = new dze(dzdVar);
    }

    @Override // defpackage.fmj
    public final void a(edi ediVar) {
        eci.e(this.b);
        String str = edt.a;
        long jE = this.b.e();
        long jF = this.b.f();
        if (jE == -9223372036854775807L || jF == -9223372036854775807L) {
            return;
        }
        dze dzeVar = this.a;
        if (jF != dzeVar.ad) {
            dzd dzdVar = new dzd(dzeVar);
            dzdVar.r = jF;
            dze dzeVar2 = new dze(dzdVar);
            this.a = dzeVar2;
            this.c.b(dzeVar2);
        }
        int iA = ediVar.a();
        this.c.c(ediVar, iA);
        this.c.e(jE, 1, iA, 0, null);
    }

    @Override // defpackage.fmj
    public final void b(edo edoVar, fdr fdrVar, fmr fmrVar) {
        this.b = edoVar;
        fmrVar.c();
        fel felVarDq = fdrVar.dq(fmrVar.a(), 5);
        this.c = felVarDq;
        felVarDq.b(this.a);
    }
}
