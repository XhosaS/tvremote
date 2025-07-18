package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class pby implements tsl {
    public abstract void a(voe voeVar, vtw vtwVar);

    @Override // defpackage.tsl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        voe voeVar = (voe) obj;
        vtw vtwVarM = uxs.a.m();
        if (voeVar.b == 1 && vfi.F(1) == 2) {
            uys uysVar = (uys) pde.a.convert((vom) voeVar.c);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uxs uxsVar = (uxs) vtwVarM.b;
            uysVar.getClass();
            uxsVar.c = uysVar;
            uxsVar.b = 1;
        }
        if (voeVar.b == 2 && vfi.F(2) == 3) {
            Object objApply = pde.b.apply((vod) voeVar.c);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uxs uxsVar2 = (uxs) vtwVarM.b;
            objApply.getClass();
            uxsVar2.c = objApply;
            uxsVar2.b = 2;
        }
        if (voeVar.b == 3 && vfi.F(3) == 4) {
            a(voeVar, vtwVarM);
        }
        return (uxs) vtwVarM.r();
    }
}
