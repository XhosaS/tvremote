package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ekb extends evo {
    private final eax f;

    public ekb(eay eayVar) {
        super(eayVar);
        this.f = new eax();
    }

    @Override // defpackage.evo, defpackage.eay
    public final eav d(int i, eav eavVar, boolean z) {
        eav eavVarD = super.d(i, eavVar, z);
        if (super.p(eavVarD.h, this.f).d()) {
            eavVarD.k(eavVar.f, eavVar.g, eavVar.h, eavVar.i, eavVar.j, dyn.a, true);
            return eavVarD;
        }
        eavVarD.k = true;
        return eavVarD;
    }
}
