package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pdp extends pcl {
    static final tsl a = new lpq(10);
    static final tsl b = new lpq(12);
    static final tsg c = new pct();

    @Override // defpackage.pcl
    public final void a(vmu vmuVar, vtw vtwVar) {
        vmr vmrVar = vmuVar.j;
        if (vmrVar == null) {
            vmrVar = vmr.a;
        }
        for (String str : vmrVar.b) {
            vtw vtwVarM = uyg.a.m();
            vtw vtwVarM2 = uvv.a.m();
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            uvv uvvVar = (uvv) vtwVarM2.b;
            str.getClass();
            uvvVar.c = 4;
            uvvVar.d = str;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uyg uygVar = (uyg) vtwVarM.b;
            uvv uvvVar2 = (uvv) vtwVarM2.r();
            uvvVar2.getClass();
            uygVar.c = uvvVar2;
            uygVar.b |= 1;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uyg uygVar2 = (uyg) vtwVarM.b;
            uygVar2.d = 2;
            uygVar2.b |= 2;
            vtwVar.bE(vtwVarM);
        }
        vmr vmrVar2 = vmuVar.j;
        if (vmrVar2 == null) {
            vmrVar2 = vmr.a;
        }
        for (String str2 : vmrVar2.c) {
            vtw vtwVarM3 = uyg.a.m();
            vtw vtwVarM4 = uvv.a.m();
            if (!vtwVarM4.b.A()) {
                vtwVarM4.u();
            }
            uvv uvvVar3 = (uvv) vtwVarM4.b;
            str2.getClass();
            uvvVar3.c = 4;
            uvvVar3.d = str2;
            if (!vtwVarM3.b.A()) {
                vtwVarM3.u();
            }
            uyg uygVar3 = (uyg) vtwVarM3.b;
            uvv uvvVar4 = (uvv) vtwVarM4.r();
            uvvVar4.getClass();
            uygVar3.c = uvvVar4;
            uygVar3.b |= 1;
            if (!vtwVarM3.b.A()) {
                vtwVarM3.u();
            }
            uyg uygVar4 = (uyg) vtwVarM3.b;
            uygVar4.d = 1;
            uygVar4.b |= 2;
            vtwVar.bE(vtwVarM3);
        }
    }

    @Override // defpackage.pcl
    public final void b(vmu vmuVar, vtw vtwVar) {
        vtw vtwVarM = uym.a.m();
        tsl tslVar = b;
        vmp vmpVarB = vmp.b(vmuVar.c);
        if (vmpVarB == null) {
            vmpVarB = vmp.CONNECTIVITY_STATE_UNSPECIFIED;
        }
        Object objApply = tslVar.apply(vmpVarB);
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        uym uymVar = (uym) vtwVarM.b;
        uymVar.c = ((uvz) objApply).a();
        uymVar.b |= 1;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        uzd uzdVar = (uzd) vtwVar.b;
        uym uymVar2 = (uym) vtwVarM.r();
        uzd uzdVar2 = uzd.a;
        uymVar2.getClass();
        uzdVar.c = uymVar2;
        uzdVar.b |= 1;
    }
}
