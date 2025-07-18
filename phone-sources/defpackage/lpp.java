package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class lpp implements tsl {
    @Override // defpackage.tsl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        uzw uzwVar = (uzw) obj;
        vtw vtwVarM = kyv.a.m();
        if ((uzwVar.b & 1) != 0) {
            tsl tslVar = lpg.a;
            val valVar = uzwVar.c;
            if (valVar == null) {
                valVar = val.a;
            }
            Object objApply = tslVar.apply(valVar);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            kyv kyvVar = (kyv) vtwVarM.b;
            objApply.getClass();
            kyvVar.c = (kzl) objApply;
            kyvVar.b |= 1;
        }
        return (kyv) vtwVarM.r();
    }
}
