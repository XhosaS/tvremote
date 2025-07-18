package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class lst implements tsl {
    @Override // defpackage.tsl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        vcw vcwVar = (vcw) obj;
        vtw vtwVarM = lbx.a.m();
        tsl tslVar = ltb.a;
        vcv vcvVarB = vcv.b(vcwVar.d);
        if (vcvVarB == null) {
            vcvVarB = vcv.UNRECOGNIZED;
        }
        Object objApply = tslVar.apply(vcvVarB);
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        ((lbx) vtwVarM.b).d = ((lbw) objApply).a();
        if (vcwVar.b == 2 && vef.b(2) == 3) {
            Integer num = (Integer) vcwVar.c;
            num.intValue();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            lbx lbxVar = (lbx) vtwVarM.b;
            lbxVar.b = 2;
            lbxVar.c = num;
        }
        if (vcwVar.b == 3 && vef.b(3) == 4) {
            Object objApply2 = ltb.b.apply((vcy) vcwVar.c);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            lbx lbxVar2 = (lbx) vtwVarM.b;
            objApply2.getClass();
            lbxVar2.c = objApply2;
            lbxVar2.b = 3;
        }
        if (vcwVar.b == 4 && vef.b(4) == 5) {
            Object objApply3 = ltb.c.apply((vda) vcwVar.c);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            lbx lbxVar3 = (lbx) vtwVarM.b;
            objApply3.getClass();
            lbxVar3.c = objApply3;
            lbxVar3.b = 4;
        }
        return (lbx) vtwVarM.r();
    }
}
