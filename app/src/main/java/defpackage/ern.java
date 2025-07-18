package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class ern implements erm {
    private final epp a;
    private final String b;

    public ern(epp eppVar, String str) {
        this.a = eppVar;
        this.b = str;
    }

    @Override // defpackage.erm
    public final epp a(eqw eqwVar) {
        epp eppVar = this.a;
        eppVar.d(this.b, eqwVar);
        return eppVar;
    }
}
