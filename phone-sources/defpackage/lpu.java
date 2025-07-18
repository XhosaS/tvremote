package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class lpu implements tsl {
    @Override // defpackage.tsl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        vaf vafVar = (vaf) obj;
        vtw vtwVarM = kze.a.m();
        if (vafVar.b == 2 && vef.d(2) == 3) {
            Object objApply = lpl.a.apply((val) vafVar.c);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            kze kzeVar = (kze) vtwVarM.b;
            objApply.getClass();
            kzeVar.c = objApply;
            kzeVar.b = 2;
        }
        if (vafVar.b == 3 && vef.d(3) == 4) {
            Object objApply2 = lpl.b.apply((vae) vafVar.c);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            kze kzeVar2 = (kze) vtwVarM.b;
            objApply2.getClass();
            kzeVar2.c = objApply2;
            kzeVar2.b = 3;
        }
        return (kze) vtwVarM.r();
    }
}
