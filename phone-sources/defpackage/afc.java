package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afc {
    public static final ahy a = afa.a;
    private static final long b = a.j(40.0f, 40.0f);

    public static final void a(alg algVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(1991581797);
        if (i3 == 0) {
            i2 = (true != baoVarD.H(algVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (baoVarD.L((i2 & 3) != 2, i2 & 1)) {
            boolean zF = baoVarD.F(algVar);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (zF || objT == ban.a) {
                sw swVar = new sw(algVar, 14);
                ivx ivxVar = bdt.a;
                objT = new bbh(swVar, null);
                basVar.ae(objT);
            }
            if (((akf) ((bdy) objT).a()).b) {
                baoVarD.x(535453998);
                boolean zH = baoVarD.H(algVar);
                Object objT2 = basVar.T();
                if (zH || objT2 == ban.a) {
                    objT2 = new afb(algVar, 1);
                    basVar.ae(objT2);
                }
                amg amgVar = (amg) objT2;
                bkm bkmVar = bkp.g;
                boolean zH2 = baoVarD.H(algVar);
                Object objT3 = basVar.T();
                if (zH2 || objT3 == ban.a) {
                    objT3 = new qi(algVar, 3);
                    basVar.ae(objT3);
                }
                hp.r(amgVar, btm.a(bkmVar, algVar, (PointerInputEventHandler) objT3), b, baoVarD, 384);
                basVar.aa();
            } else {
                baoVarD.x(535837437);
                basVar.aa();
            }
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new nu(algVar, i, 4);
        }
    }

    public static final void b(alg algVar, bao baoVar, int i) {
        int i2;
        bas basVar;
        bds bdsVar;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(2025287684);
        if (i3 == 0) {
            i2 = (true != baoVarD.H(algVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (baoVarD.L((i2 & 3) != 2, i2 & 1)) {
            boolean zF = baoVarD.F(algVar);
            bas basVar2 = (bas) baoVarD;
            Object objT = basVar2.T();
            if (zF || objT == ban.a) {
                sw swVar = new sw(algVar, 15);
                ivx ivxVar = bdt.a;
                objT = new bbh(swVar, null);
                basVar2.ae(objT);
            }
            bdy bdyVar = (bdy) objT;
            if (e(bdyVar).b) {
                baoVarD.x(-354691912);
                boolean zH = baoVarD.H(algVar);
                Object objT2 = basVar2.T();
                if (zH || objT2 == ban.a) {
                    objT2 = new afb(algVar, 0);
                    basVar2.ae(objT2);
                }
                amg amgVar = (amg) objT2;
                int i4 = e(bdyVar).f;
                boolean z = e(bdyVar).e;
                bkm bkmVar = bkp.g;
                boolean zH2 = baoVarD.H(algVar);
                Object objT3 = basVar2.T();
                if (zH2 || objT3 == ban.a) {
                    objT3 = new qi(algVar, 4);
                    basVar2.ae(objT3);
                }
                basVar = basVar2;
                bdsVar = null;
                hw.y(amgVar, true, i4, z, b, e(bdyVar).d, btm.a(bkmVar, algVar, (PointerInputEventHandler) objT3), baoVarD, 24624);
                basVar.aa();
            } else {
                basVar = basVar2;
                bdsVar = null;
                baoVarD.x(-354040354);
                basVar.aa();
            }
            boolean zF2 = baoVarD.F(algVar);
            Object objT4 = basVar.T();
            if (zF2 || objT4 == ban.a) {
                sw swVar2 = new sw(algVar, 16);
                ivx ivxVar2 = bdt.a;
                objT4 = new bbh(swVar2, bdsVar);
                basVar.ae(objT4);
            }
            bdy bdyVar2 = (bdy) objT4;
            if (f(bdyVar2).b) {
                baoVarD.x(-353646437);
                boolean zH3 = baoVarD.H(algVar);
                Object objT5 = basVar.T();
                if (zH3 || objT5 == ban.a) {
                    objT5 = new afb(algVar, 2);
                    basVar.ae(objT5);
                }
                amg amgVar2 = (amg) objT5;
                int i5 = f(bdyVar2).f;
                boolean z2 = f(bdyVar2).e;
                bkm bkmVar2 = bkp.g;
                boolean zH4 = baoVarD.H(algVar);
                Object objT6 = basVar.T();
                if (zH4 || objT6 == ban.a) {
                    objT6 = new qi(algVar, 5);
                    basVar.ae(objT6);
                }
                hw.y(amgVar2, false, i5, z2, b, f(bdyVar2).d, btm.a(bkmVar2, algVar, (PointerInputEventHandler) objT6), baoVarD, 24624);
                basVar.aa();
            } else {
                baoVarD.x(-352997762);
                basVar.aa();
            }
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new nu(algVar, i, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(defpackage.aid r32, defpackage.bkp r33, boolean r34, defpackage.chc r35, defpackage.afw r36, defpackage.atx r37, defpackage.aic r38, defpackage.kw r39, defpackage.bnn r40, defpackage.ahy r41, defpackage.sj r42, defpackage.bao r43, int r44, int r45, int r46) {
        /*
            Method dump skipped, instructions count: 754
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afc.c(aid, bkp, boolean, chc, afw, atx, aic, kw, bnn, ahy, sj, bao, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:268:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0560  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(final defpackage.aid r38, defpackage.bkp r39, final boolean r40, final defpackage.chc r41, final defpackage.afw r42, final defpackage.atx r43, final defpackage.aic r44, final defpackage.kw r45, final defpackage.bnn r46, final defpackage.ahy r47, final defpackage.sj r48, defpackage.bao r49, final int r50, final int r51) {
        /*
            Method dump skipped, instructions count: 1483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afc.d(aid, bkp, boolean, chc, afw, atx, aic, kw, bnn, ahy, sj, bao, int, int):void");
    }

    private static final akf e(bdy bdyVar) {
        return (akf) bdyVar.a();
    }

    private static final akf f(bdy bdyVar) {
        return (akf) bdyVar.a();
    }
}
