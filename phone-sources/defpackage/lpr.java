package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class lpr implements tsl {
    @Override // defpackage.tsl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        uzy uzyVar = (uzy) obj;
        vtw vtwVarM = kyx.a.m();
        if ((uzyVar.b & 1) != 0) {
            tsl tslVar = lpi.a;
            val valVar = uzyVar.e;
            if (valVar == null) {
                valVar = val.a;
            }
            Object objApply = tslVar.apply(valVar);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            kyx kyxVar = (kyx) vtwVarM.b;
            objApply.getClass();
            kyxVar.e = (kzl) objApply;
            kyxVar.b |= 1;
        }
        if (uzyVar.c == 2 && vef.e(2) == 3) {
            Object objApply2 = lpi.a.apply((val) uzyVar.d);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            kyx kyxVar2 = (kyx) vtwVarM.b;
            objApply2.getClass();
            kyxVar2.d = objApply2;
            kyxVar2.c = 2;
        }
        if (uzyVar.c == 3 && vef.e(3) == 4) {
            Object objApply3 = lpi.b.apply((uzx) uzyVar.d);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            kyx kyxVar3 = (kyx) vtwVarM.b;
            objApply3.getClass();
            kyxVar3.d = objApply3;
            kyxVar3.c = 3;
        }
        return (kyx) vtwVarM.r();
    }
}
