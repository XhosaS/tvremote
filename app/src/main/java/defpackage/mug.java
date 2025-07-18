package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mug implements oec {
    private static int d(int i) {
        switch (i - 1) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 3;
            case 5:
                return 5;
            case 6:
            case 7:
                return 6;
            default:
                return 0;
        }
    }

    @Override // defpackage.oec
    public final mii a() {
        return nlk.Y;
    }

    @Override // defpackage.oee
    public final /* synthetic */ void b(dru druVar, oal oalVar, String str, Object obj, obz obzVar, nzw nzwVar) {
        int i;
        nlk nlkVar = (nlk) obj;
        final drn drnVarA = obzVar.a();
        float fG = nlkVar.g();
        if (fG > 0.0f) {
            drnVarA.m(fG);
        }
        if (nlkVar.u() && ogm.d(nlkVar.m())) {
            if (nlkVar.m().j() - 1 != 2) {
                drnVarA.u(drnVarA.b.a(nlkVar.m().g()));
            } else {
                drnVarA.t(nlkVar.m().g() * 100.0f);
            }
        }
        if (nlkVar.w()) {
            drnVarA.N(nlkVar.h());
        }
        if (nlkVar.x()) {
            drnVarA.O(nlkVar.i());
        }
        if (nlkVar.N() - 1 != 2) {
            drnVarA.U(2);
        } else {
            drnVarA.U(3);
        }
        if (nlkVar.G()) {
            nhn nhnVarS = nlkVar.s();
            if (ogm.d(nhnVarS)) {
                if (nhnVarS.j() - 1 != 2) {
                    drnVarA.i(nhnVarS.g());
                } else {
                    drnVarA.H(nhnVarS.g() * 100.0f);
                }
            }
        }
        if (nlkVar.y()) {
            nhn nhnVarN = nlkVar.n();
            if (ogm.d(nhnVarN)) {
                if (nhnVarN.j() - 1 != 2) {
                    drnVarA.w(nhnVarN.g());
                } else {
                    drnVarA.x(nhnVarN.g() * 100.0f);
                }
            }
        }
        if (nlkVar.B()) {
            nhn nhnVarP = nlkVar.p();
            if (ogm.d(nhnVarP)) {
                if (nhnVarP.j() - 1 != 2) {
                    int iA = drnVarA.b.a(nhnVarP.g());
                    dri driVar = (dri) drnVarA.c.k().E();
                    driVar.a |= 16;
                    driVar.f = iA;
                } else {
                    float fG2 = nhnVarP.g() * 100.0f;
                    dri driVar2 = (dri) drnVarA.c.k().E();
                    driVar2.a |= 32;
                    driVar2.g = fG2;
                }
            }
        }
        if (nlkVar.A()) {
            nhn nhnVarO = nlkVar.o();
            if (ogm.d(nhnVarO)) {
                if (nhnVarO.j() - 1 != 2) {
                    int iA2 = drnVarA.b.a(nhnVarO.g());
                    dri driVar3 = (dri) drnVarA.c.k().E();
                    driVar3.a |= 1024;
                    driVar3.l = iA2;
                } else {
                    float fG3 = nhnVarO.g() * 100.0f;
                    dri driVar4 = (dri) drnVarA.c.k().E();
                    driVar4.a |= 2048;
                    driVar4.m = fG3;
                }
            }
        }
        if (nlkVar.D()) {
            nhn nhnVarR = nlkVar.r();
            if (ogm.d(nhnVarR)) {
                if (nhnVarR.j() - 1 != 2) {
                    drnVarA.B(drnVarA.b.a(nhnVarR.g()));
                } else {
                    drnVarA.A(nhnVarR.g() * 100.0f);
                }
            }
        }
        if (nlkVar.C()) {
            nhn nhnVarQ = nlkVar.q();
            if (ogm.d(nhnVarQ)) {
                if (nhnVarQ.j() - 1 != 2) {
                    drnVarA.R(drnVarA.b.a(nhnVarQ.g()));
                } else {
                    float fG4 = nhnVarQ.g() * 100.0f;
                    dri driVar5 = (dri) drnVarA.c.k().E();
                    driVar5.a |= 512;
                    driVar5.k = fG4;
                }
            }
        }
        if (nlkVar.z()) {
            ogm.c(nlkVar.j(), new ogl() { // from class: mue
                @Override // defpackage.ogl
                public final void a(int i2, nhn nhnVar) {
                    int iJ = nhnVar.j() - 1;
                    drn drnVar = drnVarA;
                    if (iJ != 2) {
                        drnVar.Q(i2, drnVar.b.a(nhnVar.g()));
                        return;
                    }
                    float fG5 = nhnVar.g() * 100.0f;
                    dri driVar6 = (dri) drnVar.c.k().E();
                    driVar6.a |= 67108864;
                    if (driVar6.v == null) {
                        driVar6.v = new dtm();
                    }
                    driVar6.v.e(i2, fG5);
                }
            });
        }
        if (nlkVar.F()) {
            ogm.c(nlkVar.l(), new ogl() { // from class: muf
                @Override // defpackage.ogl
                public final void a(int i2, nhn nhnVar) {
                    int iJ = nhnVar.j() - 1;
                    drn drnVar = drnVarA;
                    if (iJ != 2) {
                        drnVar.T(i2, drnVar.b.a(nhnVar.g()));
                        return;
                    }
                    float fG5 = nhnVar.g() * 100.0f;
                    dri driVar6 = (dri) drnVar.c.k().E();
                    driVar6.a |= 4194304;
                    if (driVar6.y == null) {
                        driVar6.y = new dtm();
                    }
                    driVar6.y.e(i2, fG5);
                }
            });
        }
        int iJ = nlkVar.J();
        if (iJ != 1) {
            drnVarA.k(d(iJ));
        }
        if (nlkVar.E()) {
            ogm.c(nlkVar.k(), new ogl() { // from class: mud
                @Override // defpackage.ogl
                public final void a(int i2, nhn nhnVar) {
                    int iJ2 = nhnVar.j() - 1;
                    drn drnVar = drnVarA;
                    if (iJ2 != 2) {
                        drnVar.I(i2, nhnVar.g());
                        return;
                    }
                    float fG5 = nhnVar.g() * 100.0f;
                    dri driVar6 = (dri) drnVar.c.k().E();
                    driVar6.a |= 16777216;
                    if (driVar6.x == null) {
                        driVar6.x = new dtm();
                    }
                    driVar6.x.e(i2, fG5);
                }
            });
        }
        boolean z = drnVarA instanceof mme;
        if (z || (drnVarA instanceof mpr)) {
            drnVarA.r();
            int iD = nlkVar.I() != 1 ? d(nlkVar.I()) : 0;
            int iD2 = nlkVar.H() != 1 ? d(nlkVar.H()) : 0;
            int iL = nlkVar.L() - 1;
            int i2 = iL != 0 ? iL != 1 ? iL != 2 ? 3 : 2 : 1 : 0;
            int iM = nlkVar.M() - 1;
            if (iM == 0 || iM == 1) {
                i = 1;
            } else if (iM == 2) {
                i = 3;
            } else if (iM == 3) {
                i = 2;
            } else if (iM != 4) {
                i = 5;
                if (iM != 5) {
                    i = 6;
                }
            } else {
                i = 4;
            }
            if (z) {
                mme mmeVar = (mme) drnVarA;
                if (iD != 0) {
                    mmeVar.a.y = iD;
                }
                if (i2 != 0) {
                    mmeVar.a.A = i2;
                }
                mmf mmfVar = mmeVar.a;
                mmfVar.z = i;
                if (iD2 != 0) {
                    mmfVar.x = iD2;
                }
                if (nlkVar.v()) {
                    nix nixVarT = nlkVar.t();
                    if (nixVarT.k()) {
                        mmfVar.d = Float.valueOf(nixVarT.h());
                    }
                    if (nixVarT.l()) {
                        mmfVar.e = Float.valueOf(nixVarT.i());
                    }
                    if (nixVarT.j()) {
                        mmfVar.c = Float.valueOf(nixVarT.g());
                    }
                }
            } else {
                mpr mprVar = (mpr) drnVarA;
                if (iD != 0) {
                    mprVar.a.v = iD;
                }
                if (i2 != 0) {
                    mprVar.a.x = i2;
                }
                mpt mptVar = mprVar.a;
                mptVar.w = i;
                if (iD2 != 0) {
                    mptVar.u = iD2;
                }
            }
        }
        int iO = nlkVar.O() - 1;
        if (iO != 1) {
            if (iO == 2) {
                drnVarA.z(eny.RTL);
                return;
            } else if (iO != 3 && iO != 4) {
                drnVarA.z(eny.INHERIT);
                return;
            }
        }
        drnVarA.z(eny.LTR);
    }

    @Override // defpackage.oee
    public final /* synthetic */ void c(dru druVar, oal oalVar, String str, niv nivVar, Object obj, obz obzVar, nzw nzwVar) {
        b(druVar, oalVar, str, obj, obzVar, nzwVar);
    }
}
