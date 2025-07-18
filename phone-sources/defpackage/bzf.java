package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzf {
    public final bys a;
    public boolean b;
    public boolean c;
    public clv f;
    public final eyy h = new eyy();
    public final cvh g = new cvh();
    public final bfz d = new bfz(new bzy[16], 0);
    public final bfz e = new bfz(new bze[16], 0);
    public final cbp i = null;

    public bzf(bys bysVar) {
        this.a = bysVar;
    }

    public static final boolean l(bys bysVar, clv clvVar) {
        if (bysVar.h == null) {
            return false;
        }
        boolean zAi = clvVar != null ? bysVar.ai(clvVar) : bysVar.ai(bysVar.u.c());
        bys bysVarJ = bysVar.j();
        if (zAi && bysVarJ != null) {
            if (bysVarJ.h == null) {
                bys.aq(bysVarJ, false, 3);
                return zAi;
            }
            if (bysVar.ax() == 1) {
                bys.ao(bysVarJ, false, 3);
                return zAi;
            }
            if (bysVar.ax() == 2) {
                bysVarJ.R(false);
                return true;
            }
        }
        return zAi;
    }

    public static final boolean m(bys bysVar, clv clvVar) {
        boolean zAj = clvVar != null ? bysVar.aj(clvVar) : bysVar.aj(bysVar.u.b());
        bys bysVarJ = bysVar.j();
        if (zAj && bysVarJ != null) {
            if (bysVar.aw() == 1) {
                bys.aq(bysVarJ, false, 3);
                return zAj;
            }
            if (bysVar.aw() == 2) {
                bysVarJ.S(false);
                return true;
            }
        }
        return zAj;
    }

    public static final boolean n(bys bysVar) {
        return bysVar.ad() && t(bysVar);
    }

    public static final boolean o(bys bysVar) {
        bys bysVarJ;
        if (!bysVar.ae()) {
            return false;
        }
        do {
            if ((!s(bysVar) && ((bysVarJ = bysVar.j()) == null || bysVarJ.av() != 1)) || (bysVar = bysVar.j()) == null) {
                return false;
            }
        } while (!bysVar.ag());
        return true;
    }

    private final void p(bys bysVar, boolean z) {
        bfz bfzVarI = bysVar.i();
        Object[] objArr = bfzVarI.a;
        int i = bfzVarI.b;
        for (int i2 = 0; i2 < i; i2++) {
            bys bysVar2 = (bys) objArr[i2];
            if ((!z && s(bysVar2)) || (z && t(bysVar2))) {
                if (cbp.V(bysVar2) && !z) {
                    if (bysVar2.ad() && this.h.b(bysVar2)) {
                        r(bysVar2, true, false);
                    } else {
                        e(bysVar2, true);
                    }
                }
                q(bysVar2, z);
                if (!u(bysVar2, z)) {
                    p(bysVar2, z);
                }
            }
        }
        q(bysVar, z);
    }

    private final void q(bys bysVar, boolean z) {
        if (u(bysVar, z)) {
            r(bysVar, z, false);
        }
    }

    private final boolean r(bys bysVar, boolean z, boolean z2) {
        clv clvVar;
        boolean zL;
        bwi bwfVar;
        bys bysVarJ;
        bzd bzdVar;
        bxl bxlVar;
        if (bysVar.z) {
            return false;
        }
        if (!bysVar.ag() && !bysVar.ah() && !o(bysVar) && !yks.e(bysVar.q(), true) && !n(bysVar)) {
            byw bywVar = bysVar.u;
            if (!bywVar.o.w.j() && ((bzdVar = bywVar.p) == null || (bxlVar = bzdVar.p) == null || !bxlVar.j())) {
                return false;
            }
        }
        bys bysVar2 = this.a;
        if (bysVar == bysVar2) {
            clvVar = this.f;
            clvVar.getClass();
        } else {
            clvVar = null;
        }
        if (z) {
            zL = bysVar.ad() ? l(bysVar, clvVar) : false;
            if (z2 && ((zL || bysVar.ac()) && yks.e(bysVar.q(), true))) {
                bysVar.I();
            }
        } else {
            boolean zM = bysVar.ae() ? m(bysVar, clvVar) : false;
            if (z2 && bysVar.ab() && (bysVar == bysVar2 || ((bysVarJ = bysVar.j()) != null && bysVarJ.ag() && bysVar.ah()))) {
                if (bysVar == bysVar2) {
                    if (bysVar.A == 3) {
                        bysVar.y();
                    }
                    bys bysVarJ2 = bysVar.j();
                    if (bysVarJ2 == null || (bwfVar = bysVarJ2.n().l) == null) {
                        bzz bzzVarA = byv.a(bysVar);
                        yjv yjvVar = bwk.a;
                        bwfVar = new bwf(bzzVarA);
                    }
                    bwi.y(bwfVar, bysVar.m(), 0, 0);
                } else {
                    bysVar.Q();
                }
                this.g.c(bysVar);
                ((cbc) byv.a(bysVar)).m.c(bysVar);
            }
            zL = zM;
        }
        c();
        return zL;
    }

    private static final boolean s(bys bysVar) {
        return bysVar.aw() == 1 || bysVar.u.o.w.j();
    }

    private static final boolean t(bys bysVar) {
        bxl bxlVar;
        if (bysVar.ax() == 1) {
            return true;
        }
        bzd bzdVar = bysVar.u.p;
        return (bzdVar == null || (bxlVar = bzdVar.p) == null || !bxlVar.j()) ? false : true;
    }

    private static final boolean u(bys bysVar, boolean z) {
        return z ? bysVar.ad() : bysVar.ae();
    }

    public final void a() {
        bfz bfzVar = this.d;
        Object[] objArr = bfzVar.a;
        int i = bfzVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((bzy) objArr[i2]).cD();
        }
        bfzVar.h();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(boolean r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L13
            cvh r7 = r6.g
            bys r0 = r6.a
            java.lang.Object r7 = r7.a
            bfz r7 = (defpackage.bfz) r7
            r7.h()
            r7.o(r0)
            r7 = 1
            r0.y = r7
        L13:
            cvh r7 = r6.g
            java.lang.Object r0 = r7.a
            bxy r1 = defpackage.bxy.b
            bfz r0 = (defpackage.bfz) r0
            r0.k(r1)
            int r1 = r0.b
            java.lang.Object r2 = r7.b
            if (r2 == 0) goto L2a
            r3 = r2
            bys[] r3 = (defpackage.bys[]) r3
            int r3 = r3.length
            if (r3 >= r1) goto L32
        L2a:
            r2 = 16
            int r2 = java.lang.Math.max(r2, r1)
            bys[] r2 = new defpackage.bys[r2]
        L32:
            r3 = 0
            r7.b = r3
            r3 = 0
        L36:
            if (r3 >= r1) goto L46
            java.lang.Object[] r4 = r0.a
            r4 = r4[r3]
            bys r4 = (defpackage.bys) r4
            r5 = r2
            bys[] r5 = (defpackage.bys[]) r5
            r5[r3] = r4
            int r3 = r3 + 1
            goto L36
        L46:
            r0.h()
        L49:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L5d
            r0 = r2
            bys[] r0 = (defpackage.bys[]) r0
            r0 = r0[r1]
            r0.getClass()
            boolean r3 = r0.y
            if (r3 == 0) goto L49
            r7.b(r0)
            goto L49
        L5d:
            r7.b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzf.b(boolean):void");
    }

    public final void c() {
        bfz bfzVar = this.e;
        int i = bfzVar.b;
        if (i != 0) {
            Object[] objArr = bfzVar.a;
            for (int i2 = 0; i2 < i; i2++) {
                bze bzeVar = (bze) objArr[i2];
                bys bysVar = bzeVar.a;
                if (bysVar.af()) {
                    if (bzeVar.b) {
                        bys.ao(bysVar, bzeVar.c, 2);
                    } else {
                        bys.aq(bysVar, bzeVar.c, 2);
                    }
                }
            }
            bfzVar.h();
        }
    }

    public final void d(bys bysVar) {
        bfz bfzVarI = bysVar.i();
        Object[] objArr = bfzVarI.a;
        int i = bfzVarI.b;
        for (int i2 = 0; i2 < i; i2++) {
            bys bysVar2 = (bys) objArr[i2];
            if (yks.e(bysVar2.q(), true) && !bysVar2.z) {
                if (this.h.b(bysVar2)) {
                    bysVar2.I();
                }
                d(bysVar2);
            }
        }
    }

    public final void e(bys bysVar, boolean z) {
        if (!this.b) {
            bty.c("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (u(bysVar, z)) {
            bty.b("node not yet measured");
        }
        p(bysVar, z);
    }

    public final void f(bys bysVar) {
        bfz bfzVarI = bysVar.i();
        Object[] objArr = bfzVarI.a;
        int i = bfzVarI.b;
        for (int i2 = 0; i2 < i; i2++) {
            bys bysVar2 = (bys) objArr[i2];
            if (s(bysVar2)) {
                if (cbp.V(bysVar2)) {
                    g(bysVar2, true);
                } else {
                    f(bysVar2);
                }
            }
        }
    }

    public final void g(bys bysVar, boolean z) {
        clv clvVar;
        if (bysVar.z) {
            return;
        }
        if (bysVar == this.a) {
            clvVar = this.f;
            clvVar.getClass();
        } else {
            clvVar = null;
        }
        if (z) {
            l(bysVar, clvVar);
        } else {
            m(bysVar, clvVar);
        }
    }

    public final boolean h() {
        return this.h.a();
    }

    public final boolean i(yjk yjkVar) {
        boolean z;
        bys bysVarA;
        boolean z2;
        boolean z3;
        bys bysVar = this.a;
        if (!bysVar.af()) {
            bty.b("performMeasureAndLayout called with unattached root");
        }
        if (!bysVar.ag()) {
            bty.b("performMeasureAndLayout called with unplaced root");
        }
        if (this.b) {
            bty.b("performMeasureAndLayout called during measure layout");
        }
        boolean z4 = false;
        if (this.f != null) {
            this.b = true;
            this.c = true;
            try {
                eyy eyyVar = this.h;
                if (eyyVar.a()) {
                    z = false;
                    while (true) {
                        Object obj = eyyVar.c;
                        if (((bxx) obj).d()) {
                            Object obj2 = eyyVar.b;
                            if (((bxx) obj2).d()) {
                                Object obj3 = eyyVar.d;
                                if (((bxx) obj3).d()) {
                                    break;
                                }
                                bysVarA = ((bxx) obj3).a();
                                z2 = true;
                                z3 = false;
                            } else {
                                bysVarA = ((bxx) obj2).a();
                                z3 = bysVarA.h != null;
                                z2 = true;
                            }
                        } else {
                            bysVarA = ((bxx) obj).a();
                            z3 = bysVarA.h != null;
                            z2 = false;
                        }
                        boolean zR = r(bysVarA, z3, z2);
                        if (!z2) {
                            if (bysVarA.ac()) {
                                eyyVar.d(bysVarA, 2);
                            }
                            if (bysVarA.ab()) {
                                eyyVar.d(bysVarA, 4);
                            }
                        }
                        if (bysVarA == bysVar && zR) {
                            z = true;
                        }
                    }
                    if (yjkVar != null) {
                        yjkVar.a();
                    }
                } else {
                    z = false;
                }
                this.b = false;
                this.c = false;
                z4 = z;
            } finally {
            }
        }
        a();
        return z4;
    }

    public final boolean j(bys bysVar, boolean z) {
        int iAv = bysVar.av();
        int i = iAv - 1;
        if (iAv == 0) {
            throw null;
        }
        if (i != 0 && i != 1) {
            if (i == 2 || i == 3) {
                this.e.o(new bze(bysVar, false, z));
            } else {
                if (i != 4) {
                    throw new yfu();
                }
                if (!bysVar.ae() || z) {
                    bysVar.L();
                    if (!bysVar.z && (bysVar.ag() || o(bysVar))) {
                        bys bysVarJ = bysVar.j();
                        if (bysVarJ == null || !bysVarJ.ae()) {
                            this.h.d(bysVar, 3);
                        }
                        if (!this.c) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
