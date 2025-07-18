package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class lpv implements tsl {
    @Override // defpackage.tsl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        vae vaeVar = (vae) obj;
        vtw vtwVarM = kzd.a.m();
        if ((vaeVar.b & 1) != 0) {
            tsl tslVar = lpk.a;
            val valVar = vaeVar.c;
            if (valVar == null) {
                valVar = val.a;
            }
            Object objApply = tslVar.apply(valVar);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            kzd kzdVar = (kzd) vtwVarM.b;
            objApply.getClass();
            kzdVar.c = (kzl) objApply;
            kzdVar.b |= 1;
        }
        if ((vaeVar.b & 2) != 0) {
            tsl tslVar2 = lpk.a;
            val valVar2 = vaeVar.d;
            if (valVar2 == null) {
                valVar2 = val.a;
            }
            Object objApply2 = tslVar2.apply(valVar2);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            kzd kzdVar2 = (kzd) vtwVarM.b;
            objApply2.getClass();
            kzdVar2.d = (kzl) objApply2;
            kzdVar2.b |= 2;
        }
        if ((vaeVar.b & 4) != 0) {
            tsl tslVar3 = lpk.a;
            val valVar3 = vaeVar.e;
            if (valVar3 == null) {
                valVar3 = val.a;
            }
            Object objApply3 = tslVar3.apply(valVar3);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            kzd kzdVar3 = (kzd) vtwVarM.b;
            objApply3.getClass();
            kzdVar3.e = (kzl) objApply3;
            kzdVar3.b |= 4;
        }
        return (kzd) vtwVarM.r();
    }
}
