package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pdf extends pbz {
    static final tsg a = new pbx();
    static final tsg b = new pcr();
    static final tsl c = new lpq(13);
    static final tsg d = new pcq();
    static final tsg e = new pcu();
    static final tsg f = new pcz();
    static final tsl g = new pde();
    static final tsg h = new pcp();

    @Override // defpackage.pbz
    public final void a(vnl vnlVar, vtw vtwVar) {
        tsg tsgVar = d;
        vnh vnhVar = vnlVar.l;
        if (vnhVar == null) {
            vnhVar = vnh.a;
        }
        vng vngVarB = vng.b(vnhVar.e);
        if (vngVarB == null) {
            vngVarB = vng.ALIGNMENT_UNSPECIFIED;
        }
        uxx uxxVar = (uxx) tsgVar.convert(vngVarB);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        uyc uycVar = (uyc) vtwVar.b;
        uyc uycVar2 = uyc.a;
        uycVar.k = uxxVar.d;
        uycVar.b |= 32;
    }

    @Override // defpackage.pbz
    public final void b(vnl vnlVar, vtw vtwVar) {
        tsg tsgVar = b;
        vnh vnhVar = vnlVar.l;
        if (vnhVar == null) {
            vnhVar = vnh.a;
        }
        vnf vnfVar = vnhVar.d;
        if (vnfVar == null) {
            vnfVar = vnf.a;
        }
        vnd vndVarB = vnd.b(vnfVar.g);
        if (vndVarB == null) {
            vndVarB = vnd.BUTTONS_LAYOUT_UNSPECIFIED;
        }
        uxy uxyVar = (uxy) tsgVar.convert(vndVarB);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        uyc uycVar = (uyc) vtwVar.b;
        uyc uycVar2 = uyc.a;
        uycVar.j = uxyVar.d;
        uycVar.b |= 16;
    }

    @Override // defpackage.pbz
    public final void c(vnl vnlVar, vtw vtwVar) {
        weu weuVar = vnlVar.g;
        if (weuVar == null) {
            weuVar = weu.a;
        }
        String str = weuVar.b;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        uyc uycVar = (uyc) vtwVar.b;
        uyc uycVar2 = uyc.a;
        str.getClass();
        uycVar.b |= 2;
        uycVar.f = str;
    }

    @Override // defpackage.pbz
    public final void d(vnl vnlVar, vtw vtwVar) {
        tsl tslVar = c;
        vnh vnhVar = vnlVar.l;
        if (vnhVar == null) {
            vnhVar = vnh.a;
        }
        vnf vnfVar = vnhVar.d;
        if (vnfVar == null) {
            vnfVar = vnf.a;
        }
        vne vneVarB = vne.b(vnfVar.k);
        if (vneVarB == null) {
            vneVarB = vne.BUTTONS_ORDER_UNSPECIFIED;
        }
        Object objApply = tslVar.apply(vneVarB);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        uyc uycVar = (uyc) vtwVar.b;
        uyc uycVar2 = uyc.a;
        uycVar.o = ((uya) objApply).d;
        uycVar.b |= 1024;
    }

    @Override // defpackage.pbz
    public final void e(vnl vnlVar, vtw vtwVar) {
        weu weuVar = vnlVar.f;
        if (weuVar == null) {
            weuVar = weu.a;
        }
        String str = weuVar.b;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        uyc uycVar = (uyc) vtwVar.b;
        uyc uycVar2 = uyc.a;
        str.getClass();
        uycVar.b |= 1;
        uycVar.e = str;
    }

    @Override // defpackage.pbz
    public final void f(vnl vnlVar, vtw vtwVar) {
        boolean z = vnlVar.h;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        uyc uycVar = (uyc) vtwVar.b;
        uyc uycVar2 = uyc.a;
        uycVar.b |= 4;
        uycVar.g = z;
    }

    @Override // defpackage.pbz
    public final void g(vnl vnlVar, vtw vtwVar) {
        int i = vnlVar.c;
        if (i == 8) {
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            uyc uycVar = (uyc) vtwVar.b;
            uyc uycVar2 = uyc.a;
            uycVar.m = 1;
            uycVar.b |= 256;
            return;
        }
        if (i == 9) {
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            uyc uycVar3 = (uyc) vtwVar.b;
            uyc uycVar4 = uyc.a;
            uycVar3.m = 2;
            uycVar3.b |= 256;
            return;
        }
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        uyc uycVar5 = (uyc) vtwVar.b;
        uyc uycVar6 = uyc.a;
        uycVar5.m = 0;
        uycVar5.b |= 256;
    }

    @Override // defpackage.pbz
    public final void h(vnl vnlVar, vtw vtwVar) {
        int iBm = a.bm(vnlVar.e);
        if (iBm == 0) {
            iBm = 1;
        }
        int i = iBm - 1;
        if (i == 1) {
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            uyc uycVar = (uyc) vtwVar.b;
            uyc uycVar2 = uyc.a;
            uycVar.n = 6;
            uycVar.b |= 512;
            return;
        }
        if (i != 2) {
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            uyc uycVar3 = (uyc) vtwVar.b;
            uyc uycVar4 = uyc.a;
            uycVar3.n = 0;
            uycVar3.b |= 512;
            return;
        }
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        uyc uycVar5 = (uyc) vtwVar.b;
        uyc uycVar6 = uyc.a;
        uycVar5.n = 4;
        uycVar5.b |= 512;
    }

    @Override // defpackage.pbz
    public final void i(vnl vnlVar, vtw vtwVar) {
        if ((vnlVar.b & 32) != 0) {
            vtw vtwVarM = uyw.a.m();
            tsg tsgVar = a;
            vnb vnbVar = vnlVar.j;
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
            if (vnlVar.c == 9) {
                vtw vtwVarM2 = uye.a.m();
                String str = (vnlVar.c == 9 ? (vnj) vnlVar.d : vnj.a).b;
                if (!vtwVarM2.b.A()) {
                    vtwVarM2.u();
                }
                uye uyeVar = (uye) vtwVarM2.b;
                str.getClass();
                uyeVar.b = 1;
                uyeVar.c = str;
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                uyw uywVar3 = (uyw) vtwVarM.b;
                uye uyeVar2 = (uye) vtwVarM2.r();
                uyeVar2.getClass();
                uywVar3.e = uyeVar2;
                uywVar3.b |= 4;
            }
            if (vnlVar.c == 8) {
                vtw vtwVarM3 = uye.a.m();
                String str2 = (vnlVar.c == 8 ? (vnj) vnlVar.d : vnj.a).b;
                if (!vtwVarM3.b.A()) {
                    vtwVarM3.u();
                }
                uye uyeVar3 = (uye) vtwVarM3.b;
                str2.getClass();
                uyeVar3.b = 1;
                uyeVar3.c = str2;
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                uyw uywVar4 = (uyw) vtwVarM.b;
                uye uyeVar4 = (uye) vtwVarM3.r();
                uyeVar4.getClass();
                uywVar4.e = uyeVar4;
                uywVar4.b |= 4;
            }
            vtwVar.bA(vtwVarM);
        }
        if ((vnlVar.b & 64) != 0) {
            vtw vtwVarM4 = uyw.a.m();
            tsg tsgVar2 = a;
            vnb vnbVar2 = vnlVar.k;
            if (vnbVar2 == null) {
                vnbVar2 = vnb.a;
            }
            uxq uxqVar2 = (uxq) tsgVar2.convert(vnbVar2);
            if (!vtwVarM4.b.A()) {
                vtwVarM4.u();
            }
            vuc vucVar2 = vtwVarM4.b;
            uyw uywVar5 = (uyw) vucVar2;
            uxqVar2.getClass();
            uywVar5.d = uxqVar2;
            uywVar5.b |= 2;
            uyv uyvVar2 = uyv.DARK;
            if (!vucVar2.A()) {
                vtwVarM4.u();
            }
            uyw uywVar6 = (uyw) vtwVarM4.b;
            uywVar6.c = uyvVar2.d;
            uywVar6.b |= 1;
            if (vnlVar.c == 9) {
                vtw vtwVarM5 = uye.a.m();
                String str3 = (vnlVar.c == 9 ? (vnj) vnlVar.d : vnj.a).c;
                if (!vtwVarM5.b.A()) {
                    vtwVarM5.u();
                }
                uye uyeVar5 = (uye) vtwVarM5.b;
                str3.getClass();
                uyeVar5.b = 1;
                uyeVar5.c = str3;
                if (!vtwVarM4.b.A()) {
                    vtwVarM4.u();
                }
                uyw uywVar7 = (uyw) vtwVarM4.b;
                uye uyeVar6 = (uye) vtwVarM5.r();
                uyeVar6.getClass();
                uywVar7.e = uyeVar6;
                uywVar7.b |= 4;
            }
            if (vnlVar.c == 8) {
                vtw vtwVarM6 = uye.a.m();
                String str4 = (vnlVar.c == 8 ? (vnj) vnlVar.d : vnj.a).c;
                if (!vtwVarM6.b.A()) {
                    vtwVarM6.u();
                }
                uye uyeVar7 = (uye) vtwVarM6.b;
                str4.getClass();
                uyeVar7.b = 1;
                uyeVar7.c = str4;
                if (!vtwVarM4.b.A()) {
                    vtwVarM4.u();
                }
                uyw uywVar8 = (uyw) vtwVarM4.b;
                uye uyeVar8 = (uye) vtwVarM6.r();
                uyeVar8.getClass();
                uywVar8.e = uyeVar8;
                uywVar8.b |= 4;
            }
            vtwVar.bA(vtwVarM4);
        }
    }

    @Override // defpackage.pbz
    public final void j(vnl vnlVar, vtw vtwVar) {
        vnh vnhVar = vnlVar.l;
        if (vnhVar == null) {
            vnhVar = vnh.a;
        }
        vnc vncVar = vnhVar.c;
        if (vncVar == null) {
            vncVar = vnc.a;
        }
        uxw uxwVar = uxw.a;
        vtw vtwVarM = uxwVar.m();
        tsg tsgVar = h;
        vna vnaVarB = vna.b(vncVar.g);
        if (vnaVarB == null) {
            vnaVarB = vna.USER_ACTION_UNSPECIFIED;
        }
        uxv uxvVar = (uxv) tsgVar.convert(vnaVarB);
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        uxw uxwVar2 = (uxw) vtwVarM.b;
        uxwVar2.e = uxvVar.f;
        uxwVar2.b |= 1;
        weu weuVar = vncVar.c;
        if (weuVar == null) {
            weuVar = weu.a;
        }
        String str = weuVar.b;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        uxw uxwVar3 = (uxw) vucVar;
        str.getClass();
        uxwVar3.b |= 2;
        uxwVar3.f = str;
        int i = true != vncVar.d ? 1 : 2;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        uxw uxwVar4 = (uxw) vtwVarM.b;
        uxwVar4.j = i - 1;
        uxwVar4.b |= 16;
        if ((vncVar.b & 4) != 0) {
            vtw vtwVarM2 = uyw.a.m();
            uyv uyvVar = uyv.LIGHT;
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            uyw uywVar = (uyw) vtwVarM2.b;
            uywVar.c = uyvVar.d;
            uywVar.b |= 1;
            tsg tsgVar2 = a;
            vnb vnbVar = vncVar.e;
            if (vnbVar == null) {
                vnbVar = vnb.a;
            }
            uxq uxqVar = (uxq) tsgVar2.convert(vnbVar);
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            uyw uywVar2 = (uyw) vtwVarM2.b;
            uxqVar.getClass();
            uywVar2.d = uxqVar;
            uywVar2.b |= 2;
            vtwVarM.bz(vtwVarM2);
        }
        if ((vncVar.b & 8) != 0) {
            vtw vtwVarM3 = uyw.a.m();
            uyv uyvVar2 = uyv.DARK;
            if (!vtwVarM3.b.A()) {
                vtwVarM3.u();
            }
            uyw uywVar3 = (uyw) vtwVarM3.b;
            uywVar3.c = uyvVar2.d;
            uywVar3.b |= 1;
            tsg tsgVar3 = a;
            vnb vnbVar2 = vncVar.f;
            if (vnbVar2 == null) {
                vnbVar2 = vnb.a;
            }
            uxq uxqVar2 = (uxq) tsgVar3.convert(vnbVar2);
            if (!vtwVarM3.b.A()) {
                vtwVarM3.u();
            }
            uyw uywVar4 = (uyw) vtwVarM3.b;
            uxqVar2.getClass();
            uywVar4.d = uxqVar2;
            uywVar4.b |= 2;
            vtwVarM.bz(vtwVarM3);
        }
        vtwVar.ar((uxw) vtwVarM.r());
        vnh vnhVar2 = vnlVar.l;
        if (((vnhVar2 == null ? vnh.a : vnhVar2).b & 2) != 0) {
            if (vnhVar2 == null) {
                vnhVar2 = vnh.a;
            }
            vnf vnfVar = vnhVar2.d;
            if (vnfVar == null) {
                vnfVar = vnf.a;
            }
            vtw vtwVarM4 = uxwVar.m();
            vna vnaVarB2 = vna.b(vnfVar.j);
            if (vnaVarB2 == null) {
                vnaVarB2 = vna.USER_ACTION_UNSPECIFIED;
            }
            uxv uxvVar2 = (uxv) tsgVar.convert(vnaVarB2);
            if (!vtwVarM4.b.A()) {
                vtwVarM4.u();
            }
            vuc vucVar2 = vtwVarM4.b;
            uxw uxwVar5 = (uxw) vucVar2;
            uxwVar5.e = uxvVar2.f;
            uxwVar5.b |= 1;
            weu weuVar2 = vnfVar.e;
            if (weuVar2 == null) {
                weuVar2 = weu.a;
            }
            String str2 = weuVar2.b;
            if (!vucVar2.A()) {
                vtwVarM4.u();
            }
            vuc vucVar3 = vtwVarM4.b;
            uxw uxwVar6 = (uxw) vucVar3;
            str2.getClass();
            uxwVar6.b |= 2;
            uxwVar6.f = str2;
            int i2 = true != vnfVar.f ? 1 : 2;
            if (!vucVar3.A()) {
                vtwVarM4.u();
            }
            uxw uxwVar7 = (uxw) vtwVarM4.b;
            uxwVar7.j = i2 - 1;
            uxwVar7.b |= 16;
            if ((vnfVar.b & 8) != 0) {
                vtw vtwVarM5 = uyw.a.m();
                uyv uyvVar3 = uyv.LIGHT;
                if (!vtwVarM5.b.A()) {
                    vtwVarM5.u();
                }
                uyw uywVar5 = (uyw) vtwVarM5.b;
                uywVar5.c = uyvVar3.d;
                uywVar5.b |= 1;
                tsg tsgVar4 = a;
                vnb vnbVar3 = vnfVar.h;
                if (vnbVar3 == null) {
                    vnbVar3 = vnb.a;
                }
                uxq uxqVar3 = (uxq) tsgVar4.convert(vnbVar3);
                if (!vtwVarM5.b.A()) {
                    vtwVarM5.u();
                }
                uyw uywVar6 = (uyw) vtwVarM5.b;
                uxqVar3.getClass();
                uywVar6.d = uxqVar3;
                uywVar6.b |= 2;
                vtwVarM4.bz(vtwVarM5);
            }
            if ((vnfVar.b & 16) != 0) {
                vtw vtwVarM6 = uyw.a.m();
                uyv uyvVar4 = uyv.DARK;
                if (!vtwVarM6.b.A()) {
                    vtwVarM6.u();
                }
                uyw uywVar7 = (uyw) vtwVarM6.b;
                uywVar7.c = uyvVar4.d;
                uywVar7.b |= 1;
                tsg tsgVar5 = a;
                vnb vnbVar4 = vnfVar.i;
                if (vnbVar4 == null) {
                    vnbVar4 = vnb.a;
                }
                uxq uxqVar4 = (uxq) tsgVar5.convert(vnbVar4);
                if (!vtwVarM6.b.A()) {
                    vtwVarM6.u();
                }
                uyw uywVar8 = (uyw) vtwVarM6.b;
                uxqVar4.getClass();
                uywVar8.d = uxqVar4;
                uywVar8.b |= 2;
                vtwVarM4.bz(vtwVarM6);
            }
            if (vnfVar.c == 3) {
                uxf uxfVar = (uxf) f.convert((vob) vnfVar.d);
                if (!vtwVarM4.b.A()) {
                    vtwVarM4.u();
                }
                uxw uxwVar8 = (uxw) vtwVarM4.b;
                uxfVar.getClass();
                uxwVar8.d = uxfVar;
                uxwVar8.c = 8;
            }
            if (vnfVar.c == 14) {
                Object objApply = g.apply((voe) vnfVar.d);
                if (!vtwVarM4.b.A()) {
                    vtwVarM4.u();
                }
                uxw uxwVar9 = (uxw) vtwVarM4.b;
                objApply.getClass();
                uxwVar9.d = objApply;
                uxwVar9.c = 14;
            }
            uxw uxwVar10 = (uxw) vtwVarM4.r();
            int i3 = vnfVar.k;
            vne vneVarB = vne.b(i3);
            if (vneVarB == null) {
                vneVarB = vne.BUTTONS_ORDER_UNSPECIFIED;
            }
            if (vneVarB != vne.ACTION_BUTTON_PRIMARY) {
                vne vneVarB2 = vne.b(i3);
                if (vneVarB2 == null) {
                    vneVarB2 = vne.BUTTONS_ORDER_UNSPECIFIED;
                }
                if (vneVarB2 != vne.BUTTONS_ORDER_UNSPECIFIED) {
                    vtwVar.ar(uxwVar10);
                    return;
                }
            }
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            uyc uycVar = (uyc) vtwVar.b;
            uyc uycVar2 = uyc.a;
            uxwVar10.getClass();
            uycVar.b();
            uycVar.i.add(0, uxwVar10);
        }
    }
}
