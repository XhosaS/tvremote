package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class pcn implements tsl {
    @Override // defpackage.tsl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        vmv vmvVar = (vmv) obj;
        vtw vtwVarM = uze.a.m();
        if (vmvVar.b == 1 && vfi.I(1) == 2) {
            Object objApply = pdr.b.apply((vlf) vmvVar.c);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uze uzeVar = (uze) vtwVarM.b;
            objApply.getClass();
            uzeVar.c = objApply;
            uzeVar.b = 1;
        }
        if (vmvVar.b == 2 && vfi.I(2) == 3) {
            Object objApply2 = pdr.a.apply((vmy) vmvVar.c);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uze uzeVar2 = (uze) vtwVarM.b;
            objApply2.getClass();
            uzeVar2.c = objApply2;
            uzeVar2.b = 4;
        }
        return (uze) vtwVarM.r();
    }
}
