package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ltw implements idf {
    private final lql a;
    private final moz b;

    public ltw(lql lqlVar, moz mozVar) {
        this.a = lqlVar;
        this.b = mozVar;
    }

    @Override // defpackage.idf
    public final /* synthetic */ Object b(Object obj) {
        luj lujVar = (luj) obj;
        ksn ksnVar = lujVar.a;
        vdn vdnVarC = this.b.c(ksnVar);
        vtw vtwVarM = wcl.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wcl wclVar = (wcl) vtwVarM.b;
        vdnVarC.getClass();
        wclVar.e = vdnVarC;
        wclVar.b |= 1;
        val valVarO = kgu.o(lujVar.b);
        tst tstVar = lujVar.e;
        boolean zG = tstVar.g();
        vdz vdzVar = vdz.a;
        if (zG) {
            lui luiVar = (lui) tstVar.c();
            if (luiVar.a) {
                vak vakVarB = vak.b(valVarO.b);
                if (vakVarB == null) {
                    vakVarB = vak.UNRECOGNIZED;
                }
                if (vakVarB == vak.MOVIE) {
                    vtw vtwVarM2 = val.a.m();
                    String str = valVarO.c;
                    if (!vtwVarM2.b.A()) {
                        vtwVarM2.u();
                    }
                    vuc vucVar = vtwVarM2.b;
                    str.getClass();
                    ((val) vucVar).c = str;
                    vak vakVar = vak.TRAILER;
                    if (!vucVar.A()) {
                        vtwVarM2.u();
                    }
                    ((val) vtwVarM2.b).b = vakVar.a();
                    valVarO = (val) vtwVarM2.r();
                }
            }
            long jMax = Math.max(0L, luiVar.b);
            vtw vtwVarM3 = vdzVar.m();
            vwe vweVarE = vxf.e(lujVar.d);
            if (!vtwVarM3.b.A()) {
                vtwVarM3.u();
            }
            vdz vdzVar2 = (vdz) vtwVarM3.b;
            vweVarE.getClass();
            vdzVar2.e = vweVarE;
            vdzVar2.b |= 2;
            vtw vtwVarM4 = vdx.a.m();
            vtl vtlVarD = vxd.d(jMax);
            if (!vtwVarM4.b.A()) {
                vtwVarM4.u();
            }
            vdx vdxVar = (vdx) vtwVarM4.b;
            vtlVarD.getClass();
            vdxVar.c = vtlVarD;
            vdxVar.b |= 1;
            vwe vweVarE2 = vxf.e(lujVar.c);
            if (!vtwVarM4.b.A()) {
                vtwVarM4.u();
            }
            vdx vdxVar2 = (vdx) vtwVarM4.b;
            vweVarE2.getClass();
            vdxVar2.d = vweVarE2;
            vdxVar2.b |= 2;
            if (!vtwVarM3.b.A()) {
                vtwVarM3.u();
            }
            vdz vdzVar3 = (vdz) vtwVarM3.b;
            vdx vdxVar3 = (vdx) vtwVarM4.r();
            vdxVar3.getClass();
            vdzVar3.d = vdxVar3;
            vdzVar3.c = 1;
            vdzVar = (vdz) vtwVarM3.r();
        } else {
            tst tstVar2 = lujVar.f;
            if (tstVar2.g()) {
                Object objC = tstVar2.c();
                vtw vtwVarM5 = vdzVar.m();
                vwe vweVarE3 = vxf.e(lujVar.d);
                if (!vtwVarM5.b.A()) {
                    vtwVarM5.u();
                }
                vdz vdzVar4 = (vdz) vtwVarM5.b;
                vweVarE3.getClass();
                vdzVar4.e = vweVarE3;
                vdzVar4.b |= 2;
                vtw vtwVarM6 = vdy.a.m();
                vtw vtwVarM7 = vdw.a.m();
                vsz vszVar = ((kxg) objC).b;
                if (!vtwVarM7.b.A()) {
                    vtwVarM7.u();
                }
                ((vdw) vtwVarM7.b).b = vszVar;
                if (!vtwVarM6.b.A()) {
                    vtwVarM6.u();
                }
                vdy vdyVar = (vdy) vtwVarM6.b;
                vdw vdwVar = (vdw) vtwVarM7.r();
                vdwVar.getClass();
                vdyVar.c = vdwVar;
                vdyVar.b = 2;
                if (!vtwVarM5.b.A()) {
                    vtwVarM5.u();
                }
                vdz vdzVar5 = (vdz) vtwVarM5.b;
                vdy vdyVar2 = (vdy) vtwVarM6.r();
                vdyVar2.getClass();
                vdzVar5.d = vdyVar2;
                vdzVar5.c = 2;
                vdzVar = (vdz) vtwVarM5.r();
            } else {
                krd.c("Invalid UpdateWatchEventRequest: neither playback nor watch action is provided");
            }
        }
        vtw vtwVarM8 = wcn.a.m();
        if (!vtwVarM8.b.A()) {
            vtwVarM8.u();
        }
        wcn wcnVar = (wcn) vtwVarM8.b;
        valVarO.getClass();
        wcnVar.c = valVarO;
        wcnVar.b |= 1;
        vwe vweVarE4 = vxf.e(lujVar.c);
        if (!vtwVarM8.b.A()) {
            vtwVarM8.u();
        }
        wcn wcnVar2 = (wcn) vtwVarM8.b;
        vweVarE4.getClass();
        wcnVar2.e = vweVarE4;
        wcnVar2.b |= 4;
        vwe vweVarE5 = vxf.e(lujVar.d);
        if (!vtwVarM8.b.A()) {
            vtwVarM8.u();
        }
        vuc vucVar2 = vtwVarM8.b;
        wcn wcnVar3 = (wcn) vucVar2;
        vweVarE5.getClass();
        wcnVar3.f = vweVarE5;
        wcnVar3.b |= 8;
        if (!vucVar2.A()) {
            vtwVarM8.u();
        }
        wcn wcnVar4 = (wcn) vtwVarM8.b;
        vdzVar.getClass();
        wcnVar4.d = vdzVar;
        wcnVar4.b |= 2;
        wcn wcnVar5 = (wcn) vtwVarM8.r();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wcl wclVar2 = (wcl) vtwVarM.b;
        wcnVar5.getClass();
        wclVar2.d = wcnVar5;
        wclVar2.c = 5;
        return this.a.b(ksnVar, (wcl) vtwVarM.r(), wcq.b(), new ltu(6)).e(new ltu(7));
    }
}
