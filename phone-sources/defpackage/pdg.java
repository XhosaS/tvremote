package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pdg extends pca {
    static final tsl a = new pds();
    static final tsl b = new lpq(8);

    @Override // defpackage.pca
    public final void a(vln vlnVar, vtw vtwVar) {
        int i = vlnVar.c;
        if (i == 1) {
            vtw vtwVarM = uxp.a.m();
            Object objApply = b.apply(vlnVar.c == 1 ? (vlf) vlnVar.d : vlf.a);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uxp uxpVar = (uxp) vtwVarM.b;
            objApply.getClass();
            uxpVar.c = objApply;
            uxpVar.b = 1;
            vtwVar.by(vtwVarM);
            return;
        }
        if (i == 2) {
            vtw vtwVarM2 = uxp.a.m();
            Object objApply2 = a.apply(vlnVar.c == 2 ? (vmy) vlnVar.d : vmy.a);
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            uxp uxpVar2 = (uxp) vtwVarM2.b;
            objApply2.getClass();
            uxpVar2.c = objApply2;
            uxpVar2.b = 2;
            vtwVar.by(vtwVarM2);
        }
    }
}
