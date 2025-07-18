package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class lpo implements tsl {
    public abstract void a(vai vaiVar, vtw vtwVar);

    @Override // defpackage.tsl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        vai vaiVar = (vai) obj;
        vtw vtwVarM = kzh.a.m();
        if (vaiVar.b == 1 && vef.f(1) == 2) {
            b(vaiVar, vtwVarM);
        }
        if (vaiVar.b == 2 && vef.f(2) == 3) {
            a(vaiVar, vtwVarM);
        }
        if (vaiVar.b == 3 && vef.f(3) == 4) {
            Object objApply = lpm.a.apply((uzy) vaiVar.c);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            kzh kzhVar = (kzh) vtwVarM.b;
            objApply.getClass();
            kzhVar.c = objApply;
            kzhVar.b = 3;
        }
        if (vaiVar.b == 4 && vef.f(4) == 5) {
            Object objApply2 = lpm.b.apply((vab) vaiVar.c);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            kzh kzhVar2 = (kzh) vtwVarM.b;
            objApply2.getClass();
            kzhVar2.c = objApply2;
            kzhVar2.b = 4;
        }
        if (vaiVar.b == 5 && vef.f(5) == 6) {
            Object objApply3 = lpm.c.apply((vad) vaiVar.c);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            kzh kzhVar3 = (kzh) vtwVarM.b;
            objApply3.getClass();
            kzhVar3.c = objApply3;
            kzhVar3.b = 5;
        }
        if (vaiVar.b == 6 && vef.f(6) == 7) {
            Object objApply4 = lpm.d.apply((vah) vaiVar.c);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            kzh kzhVar4 = (kzh) vtwVarM.b;
            objApply4.getClass();
            kzhVar4.c = objApply4;
            kzhVar4.b = 6;
        }
        if (vaiVar.b == 7 && vef.f(7) == 8) {
            Object objApply5 = lpm.e.apply((vag) vaiVar.c);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            kzh kzhVar5 = (kzh) vtwVarM.b;
            objApply5.getClass();
            kzhVar5.c = objApply5;
            kzhVar5.b = 7;
        }
        if (vaiVar.b == 8 && vef.f(8) == 9) {
            Object objApply6 = lpm.f.apply((vaf) vaiVar.c);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            kzh kzhVar6 = (kzh) vtwVarM.b;
            objApply6.getClass();
            kzhVar6.c = objApply6;
            kzhVar6.b = 8;
        }
        if (vaiVar.b == 9 && vef.f(9) == 10) {
            Object objApply7 = lpm.g.apply((uzw) vaiVar.c);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            kzh kzhVar7 = (kzh) vtwVarM.b;
            objApply7.getClass();
            kzhVar7.c = objApply7;
            kzhVar7.b = 9;
        }
        return (kzh) vtwVarM.r();
    }

    public abstract void b(vai vaiVar, vtw vtwVar);
}
