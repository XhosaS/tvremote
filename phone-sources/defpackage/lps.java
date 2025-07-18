package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class lps implements tsl {
    @Override // defpackage.tsl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        uzx uzxVar = (uzx) obj;
        vtw vtwVarM = kyw.a.m();
        if ((uzxVar.b & 1) != 0) {
            tsl tslVar = lph.a;
            val valVar = uzxVar.c;
            if (valVar == null) {
                valVar = val.a;
            }
            Object objApply = tslVar.apply(valVar);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            kyw kywVar = (kyw) vtwVarM.b;
            objApply.getClass();
            kywVar.c = (kzl) objApply;
            kywVar.b |= 1;
        }
        if ((uzxVar.b & 2) != 0) {
            tsl tslVar2 = lph.a;
            val valVar2 = uzxVar.d;
            if (valVar2 == null) {
                valVar2 = val.a;
            }
            Object objApply2 = tslVar2.apply(valVar2);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            kyw kywVar2 = (kyw) vtwVarM.b;
            objApply2.getClass();
            kywVar2.d = (kzl) objApply2;
            kywVar2.b |= 2;
        }
        if ((uzxVar.b & 4) != 0) {
            tsl tslVar3 = lph.a;
            val valVar3 = uzxVar.e;
            if (valVar3 == null) {
                valVar3 = val.a;
            }
            Object objApply3 = tslVar3.apply(valVar3);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            kyw kywVar3 = (kyw) vtwVarM.b;
            objApply3.getClass();
            kywVar3.e = (kzl) objApply3;
            kywVar3.b |= 4;
        }
        return (kyw) vtwVarM.r();
    }
}
