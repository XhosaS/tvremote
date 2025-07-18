package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class pcj implements tsl {
    @Override // defpackage.tsl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        vlh vlhVar = (vlh) obj;
        vtw vtwVarM = uxn.a.m();
        if ((vlhVar.b & 1) != 0) {
            boolean z = vlhVar.e;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uxn uxnVar = (uxn) vtwVarM.b;
            uxnVar.b |= 1;
            uxnVar.e = z;
        }
        if (vlhVar.c == 2 && a.g(2) == 3) {
            Object objApply = pdn.b.apply((vln) vlhVar.d);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uxn uxnVar2 = (uxn) vtwVarM.b;
            objApply.getClass();
            uxnVar2.d = objApply;
            uxnVar2.c = 2;
        }
        if (vlhVar.c == 3 && a.g(3) == 4) {
            Object objApply2 = pdn.a.apply((vle) vlhVar.d);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uxn uxnVar3 = (uxn) vtwVarM.b;
            objApply2.getClass();
            uxnVar3.d = objApply2;
            uxnVar3.c = 3;
        }
        if (vlhVar.c == 5 && a.g(5) == 6) {
            Object objApply3 = pdn.c.apply((vkv) vlhVar.d);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uxn uxnVar4 = (uxn) vtwVarM.b;
            objApply3.getClass();
            uxnVar4.d = objApply3;
            uxnVar4.c = 5;
        }
        return (uxn) vtwVarM.r();
    }
}
