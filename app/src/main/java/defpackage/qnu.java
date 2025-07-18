package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class qnu implements yqi {
    @Override // defpackage.yqi
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final qlv apply(lpr lprVar) {
        qlt qltVarM = qlv.m();
        if (lprVar.a("account_name") != null) {
            qltVarM.b(lprVar.a("account_name"));
        }
        if (lprVar.c() != null) {
            ((qll) qltVarM).a = lprVar.c();
        }
        if (lprVar.e() != null) {
            c(lprVar, qltVarM);
        }
        if (lprVar.d() != null) {
            b(lprVar, qltVarM);
        }
        if (lprVar.a("gaia_id") != null) {
            ((qll) qltVarM).d = lprVar.a("gaia_id");
        }
        d(lprVar, qltVarM);
        if (lprVar.b() != null) {
            ((qll) qltVarM).e = lprVar.b();
        }
        return qltVarM.a();
    }

    public void b(lpr lprVar, qlt qltVar) {
        throw null;
    }

    public void c(lpr lprVar, qlt qltVar) {
        throw null;
    }

    public abstract void d(lpr lprVar, qlt qltVar);
}
