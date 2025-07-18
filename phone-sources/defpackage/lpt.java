package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class lpt implements tsl {
    @Override // defpackage.tsl
    public final /* synthetic */ Object apply(Object obj) {
        vab vabVar = (vab) obj;
        vtw vtwVarM = kza.a.m();
        if (vabVar.b == 1 && a.bm(1) == 2) {
            Object objApply = lpj.a.apply(vabVar.b == 1 ? (uzz) vabVar.c : uzz.a);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            kza kzaVar = (kza) vtwVarM.b;
            objApply.getClass();
            kzaVar.c = objApply;
            kzaVar.b = 1;
        }
        if (vabVar.b == 2 && a.bm(2) == 3) {
            Object objApply2 = lpj.b.apply(vabVar.b == 2 ? (vaa) vabVar.c : vaa.a);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            kza kzaVar2 = (kza) vtwVarM.b;
            objApply2.getClass();
            kzaVar2.c = objApply2;
            kzaVar2.b = 2;
        }
        return (kza) vtwVarM.r();
    }
}
