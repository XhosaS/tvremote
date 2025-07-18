package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class erl implements erm {
    private final epp a;
    private final String b;

    public erl(epp eppVar, String str) {
        this.a = eppVar;
        this.b = str;
    }

    @Override // defpackage.erm
    public final epp a(eqw eqwVar) {
        epp eppVarA = this.a.a();
        eppVarA.d(this.b, eqwVar);
        return eppVarA;
    }
}
