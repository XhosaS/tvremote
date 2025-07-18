package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pdh extends pcb {
    static final tsg a = new pbx();
    static final tsg b = new pcp();

    @Override // defpackage.pcb
    public final void a(vno vnoVar, vtw vtwVar) {
        if ((vnoVar.b & 16) != 0) {
            vtw vtwVarM = uxw.a.m();
            tsg tsgVar = b;
            vnn vnnVar = vnoVar.i;
            if (vnnVar == null) {
                vnnVar = vnn.a;
            }
            vna vnaVarB = vna.b(vnnVar.d);
            if (vnaVarB == null) {
                vnaVarB = vna.USER_ACTION_UNSPECIFIED;
            }
            uxv uxvVar = (uxv) tsgVar.convert(vnaVarB);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uxw uxwVar = (uxw) vtwVarM.b;
            uxwVar.e = uxvVar.f;
            uxwVar.b |= 1;
            vnn vnnVar2 = vnoVar.i;
            if (vnnVar2 == null) {
                vnnVar2 = vnn.a;
            }
            weu weuVar = vnnVar2.c;
            if (weuVar == null) {
                weuVar = weu.a;
            }
            String str = weuVar.b;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uxw uxwVar2 = (uxw) vtwVarM.b;
            str.getClass();
            uxwVar2.b |= 2;
            uxwVar2.f = str;
            vnn vnnVar3 = vnoVar.i;
            if (vnnVar3 == null) {
                vnnVar3 = vnn.a;
            }
            if ((vnnVar3.b & 4) != 0) {
                vtw vtwVarM2 = uyw.a.m();
                tsg tsgVar2 = a;
                vnn vnnVar4 = vnoVar.i;
                if (vnnVar4 == null) {
                    vnnVar4 = vnn.a;
                }
                vnb vnbVar = vnnVar4.e;
                if (vnbVar == null) {
                    vnbVar = vnb.a;
                }
                uxq uxqVar = (uxq) tsgVar2.convert(vnbVar);
                if (!vtwVarM2.b.A()) {
                    vtwVarM2.u();
                }
                vuc vucVar = vtwVarM2.b;
                uyw uywVar = (uyw) vucVar;
                uxqVar.getClass();
                uywVar.d = uxqVar;
                uywVar.b |= 2;
                uyv uyvVar = uyv.LIGHT;
                if (!vucVar.A()) {
                    vtwVarM2.u();
                }
                uyw uywVar2 = (uyw) vtwVarM2.b;
                uywVar2.c = uyvVar.d;
                uywVar2.b |= 1;
                vtwVarM.bz(vtwVarM2);
            }
            vnn vnnVar5 = vnoVar.i;
            if (vnnVar5 == null) {
                vnnVar5 = vnn.a;
            }
            if ((vnnVar5.b & 8) != 0) {
                vtw vtwVarM3 = uyw.a.m();
                tsg tsgVar3 = a;
                vnn vnnVar6 = vnoVar.i;
                if (vnnVar6 == null) {
                    vnnVar6 = vnn.a;
                }
                vnb vnbVar2 = vnnVar6.f;
                if (vnbVar2 == null) {
                    vnbVar2 = vnb.a;
                }
                uxq uxqVar2 = (uxq) tsgVar3.convert(vnbVar2);
                if (!vtwVarM3.b.A()) {
                    vtwVarM3.u();
                }
                vuc vucVar2 = vtwVarM3.b;
                uyw uywVar3 = (uyw) vucVar2;
                uxqVar2.getClass();
                uywVar3.d = uxqVar2;
                uywVar3.b |= 2;
                uyv uyvVar2 = uyv.DARK;
                if (!vucVar2.A()) {
                    vtwVarM3.u();
                }
                uyw uywVar4 = (uyw) vtwVarM3.b;
                uywVar4.c = uyvVar2.d;
                uywVar4.b |= 1;
                vtwVarM.bz(vtwVarM3);
            }
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            uzb uzbVar = (uzb) vtwVar.b;
            uxw uxwVar3 = (uxw) vtwVarM.r();
            uzb uzbVar2 = uzb.a;
            uxwVar3.getClass();
            uzbVar.k = uxwVar3;
            uzbVar.b |= 32;
        }
    }

    @Override // defpackage.pcb
    public final void b(vno vnoVar, vtw vtwVar) {
        int i = vnoVar.b;
        if ((i & 4) != 0) {
            vnb vnbVar = vnoVar.g;
            if (vnbVar == null) {
                vnbVar = vnb.a;
            }
            wes wesVar = vnbVar.e;
            if (wesVar == null) {
                wesVar = wes.a;
            }
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            uzb uzbVar = (uzb) vtwVar.b;
            uzb uzbVar2 = uzb.a;
            wesVar.getClass();
            uzbVar.e = wesVar;
            uzbVar.b |= 1;
            return;
        }
        if ((i & 8) == 0) {
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            uzb uzbVar3 = (uzb) vtwVar.b;
            uzb uzbVar4 = uzb.a;
            uzbVar3.e = null;
            uzbVar3.b &= -2;
            return;
        }
        vnb vnbVar2 = vnoVar.h;
        if (vnbVar2 == null) {
            vnbVar2 = vnb.a;
        }
        wes wesVar2 = vnbVar2.e;
        if (wesVar2 == null) {
            wesVar2 = wes.a;
        }
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        uzb uzbVar5 = (uzb) vtwVar.b;
        uzb uzbVar6 = uzb.a;
        wesVar2.getClass();
        uzbVar5.e = wesVar2;
        uzbVar5.b |= 1;
    }

    @Override // defpackage.pcb
    public final void c(vno vnoVar, vtw vtwVar) {
        if ((vnoVar.b & 2) != 0) {
            weu weuVar = vnoVar.f;
            if (weuVar == null) {
                weuVar = weu.a;
            }
            String str = weuVar.b;
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            uzb uzbVar = (uzb) vtwVar.b;
            uzb uzbVar2 = uzb.a;
            str.getClass();
            uzbVar.b |= 8;
            uzbVar.h = str;
        }
    }

    @Override // defpackage.pcb
    public final void d(vno vnoVar, vtw vtwVar) {
        if ((vnoVar.b & 1) != 0) {
            weu weuVar = vnoVar.e;
            if (weuVar == null) {
                weuVar = weu.a;
            }
            String str = weuVar.b;
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            uzb uzbVar = (uzb) vtwVar.b;
            uzb uzbVar2 = uzb.a;
            str.getClass();
            uzbVar.b |= 4;
            uzbVar.g = str;
        }
    }

    @Override // defpackage.pcb
    public final void e(vno vnoVar, vtw vtwVar) {
        if ((vnoVar.b & 4) != 0) {
            vtw vtwVarM = uyw.a.m();
            tsg tsgVar = a;
            vnb vnbVar = vnoVar.g;
            if (vnbVar == null) {
                vnbVar = vnb.a;
            }
            uxq uxqVar = (uxq) tsgVar.convert(vnbVar);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vuc vucVar = vtwVarM.b;
            uyw uywVar = (uyw) vucVar;
            uxqVar.getClass();
            uywVar.d = uxqVar;
            uywVar.b |= 2;
            uyv uyvVar = uyv.LIGHT;
            if (!vucVar.A()) {
                vtwVarM.u();
            }
            uyw uywVar2 = (uyw) vtwVarM.b;
            uywVar2.c = uyvVar.d;
            uywVar2.b |= 1;
            vtwVar.bD(vtwVarM);
        }
        if ((vnoVar.b & 8) != 0) {
            vtw vtwVarM2 = uyw.a.m();
            tsg tsgVar2 = a;
            vnb vnbVar2 = vnoVar.h;
            if (vnbVar2 == null) {
                vnbVar2 = vnb.a;
            }
            uxq uxqVar2 = (uxq) tsgVar2.convert(vnbVar2);
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            vuc vucVar2 = vtwVarM2.b;
            uyw uywVar3 = (uyw) vucVar2;
            uxqVar2.getClass();
            uywVar3.d = uxqVar2;
            uywVar3.b |= 2;
            uyv uyvVar2 = uyv.DARK;
            if (!vucVar2.A()) {
                vtwVarM2.u();
            }
            uyw uywVar4 = (uyw) vtwVarM2.b;
            uywVar4.c = uyvVar2.d;
            uywVar4.b |= 1;
            vtwVar.bD(vtwVarM2);
        }
    }

    @Override // defpackage.pcb
    public final void f(vno vnoVar, vtw vtwVar) {
        if ((vnoVar.b & 32) != 0) {
            int iBm = a.bm(vnoVar.j);
            if (iBm == 0) {
                iBm = 1;
            }
            int i = iBm - 1;
            int i2 = i != 0 ? i != 1 ? 3 : 2 : 1;
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            uzb uzbVar = (uzb) vtwVar.b;
            uzb uzbVar2 = uzb.a;
            uzbVar.m = i2 - 1;
            uzbVar.b |= 128;
        }
    }

    @Override // defpackage.pcb
    public final void g(vno vnoVar, vtw vtwVar) {
        int i = vnoVar.b;
        if ((i & 4) != 0) {
            vnb vnbVar = vnoVar.g;
            if (vnbVar == null) {
                vnbVar = vnb.a;
            }
            wes wesVar = vnbVar.c;
            if (wesVar == null) {
                wesVar = wes.a;
            }
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            uzb uzbVar = (uzb) vtwVar.b;
            uzb uzbVar2 = uzb.a;
            wesVar.getClass();
            uzbVar.f = wesVar;
            uzbVar.b |= 2;
            return;
        }
        if ((i & 8) == 0) {
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            uzb uzbVar3 = (uzb) vtwVar.b;
            uzb uzbVar4 = uzb.a;
            uzbVar3.f = null;
            uzbVar3.b &= -3;
            return;
        }
        vnb vnbVar2 = vnoVar.h;
        if (vnbVar2 == null) {
            vnbVar2 = vnb.a;
        }
        wes wesVar2 = vnbVar2.c;
        if (wesVar2 == null) {
            wesVar2 = wes.a;
        }
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        uzb uzbVar5 = (uzb) vtwVar.b;
        uzb uzbVar6 = uzb.a;
        wesVar2.getClass();
        uzbVar5.f = wesVar2;
        uzbVar5.b |= 2;
    }
}
