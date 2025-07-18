package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class rkr implements tsl {
    public void a(oaj oajVar, rjm rjmVar) {
        throw null;
    }

    @Override // defpackage.tsl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        oaj oajVar = (oaj) obj;
        rjm rjmVarA = rjn.a();
        if (oajVar.c() != null) {
            rjmVarA.b(oajVar.c());
        }
        if (oajVar.e() != null) {
            rjmVarA.a = oajVar.e();
        }
        if (oajVar.g() != null) {
            b(oajVar, rjmVarA);
        }
        if (oajVar.f() != null) {
            a(oajVar, rjmVarA);
        }
        if (oajVar.b() != null) {
            rjmVarA.d = oajVar.b();
        }
        c(oajVar, rjmVarA);
        if (oajVar.d() != null) {
            rjmVarA.e = oajVar.d();
        }
        return rjmVarA.a();
    }

    public void b(oaj oajVar, rjm rjmVar) {
        throw null;
    }

    public abstract void c(oaj oajVar, rjm rjmVar);
}
