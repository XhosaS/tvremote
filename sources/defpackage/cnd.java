package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cnd implements cno {
    private final cmz a;
    private final cnx b;
    private final boolean c;

    public cnd(cnx cnxVar, cmz cmzVar) {
        this.b = cnxVar;
        this.c = cmzVar instanceof clr;
        this.a = cmzVar;
    }

    @Override // defpackage.cno
    public final int a(Object obj) {
        cny cnyVarF = cnx.f(obj);
        int iAa = cnyVarF.e;
        if (iAa == -1) {
            iAa = 0;
            for (int i = 0; i < cnyVarF.b; i++) {
                int iA = coi.a(cnyVarF.c[i]);
                ckv ckvVar = (ckv) cnyVarF.d[i];
                int iZ = cld.Z(1);
                iAa += iZ + iZ + cld.aa(2, iA) + cld.G(3, ckvVar);
            }
            cnyVarF.e = iAa;
        }
        if (!this.c) {
            return iAa;
        }
        clk clkVarBD = dnx.bD(obj);
        cnt cntVar = clkVarBD.b;
        int i2 = cntVar.b;
        int iB = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            iB += clkVarBD.b(cntVar.d(i3));
        }
        Iterator it = cntVar.a().iterator();
        while (it.hasNext()) {
            iB += clkVarBD.b((Map.Entry) it.next());
        }
        return iAa + iB;
    }

    @Override // defpackage.cno
    public final int b(Object obj) {
        int iHashCode = cnx.f(obj).hashCode();
        return this.c ? (iHashCode * 53) + dnx.bD(obj).hashCode() : iHashCode;
    }

    @Override // defpackage.cno
    public final Object e() {
        cmz cmzVar = this.a;
        return cmzVar instanceof clt ? ((clt) cmzVar).p() : cmzVar.aH().j();
    }

    @Override // defpackage.cno
    public final void g(Object obj) {
        this.b.e(obj);
        dnx.bG(obj);
    }

    @Override // defpackage.cno
    public final void h(Object obj, Object obj2) {
        cnp.n(obj, obj2);
        if (this.c) {
            cnp.m(obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00bf A[EDGE_INSN: B:129:0x00bf->B:102:0x00bf BREAK  A[LOOP:1: B:86:0x0067->B:133:0x0067], SYNTHETIC] */
    @Override // defpackage.cno
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(java.lang.Object r11, byte[] r12, int r13, int r14, defpackage.ckj r15) throws defpackage.cmh {
        /*
            r10 = this;
            r0 = r11
            clt r0 = (defpackage.clt) r0
            cny r1 = r0.v
            cny r2 = defpackage.cny.a
            if (r1 != r2) goto L10
            cny r1 = new cny
            r1.<init>()
            r0.v = r1
        L10:
            r6 = r1
            clr r11 = (defpackage.clr) r11
            clk r11 = r11.h()
            r0 = 0
            r1 = r0
        L19:
            if (r13 >= r14) goto Lcd
            int r4 = defpackage.ckk.l(r12, r13, r15)
            int r2 = r15.a
            int r13 = defpackage.coi.a
            r3 = 2
            if (r2 == r13) goto L63
            int r13 = defpackage.coi.b(r2)
            if (r13 != r3) goto L5c
            cli r13 = r15.d
            cmz r1 = r10.a
            int r3 = defpackage.coi.a(r2)
            cmt r1 = r13.b(r1, r3)
            if (r1 == 0) goto L54
            java.lang.Object r13 = r1.a
            cni r2 = defpackage.cni.a
            java.lang.Class r13 = r13.getClass()
            cno r13 = r2.a(r13)
            int r13 = defpackage.ckk.f(r13, r12, r4, r14, r15)
            java.lang.Object r2 = r15.c
            java.lang.Object r3 = r1.d
            cls r3 = (defpackage.cls) r3
            r11.l(r3, r2)
            goto L19
        L54:
            r3 = r12
            r5 = r14
            r7 = r15
            int r13 = defpackage.ckk.k(r2, r3, r4, r5, r6, r7)
            goto L19
        L5c:
            r5 = r14
            r7 = r15
            int r13 = defpackage.ckk.r(r2, r12, r4, r5, r7)
            goto L19
        L63:
            r5 = r14
            r7 = r15
            r13 = 0
            r14 = r0
        L67:
            if (r4 >= r5) goto Lbe
            int r15 = defpackage.ckk.l(r12, r4, r7)
            int r2 = r7.a
            int r4 = defpackage.coi.a(r2)
            int r8 = defpackage.coi.b(r2)
            if (r4 == r3) goto La4
            r9 = 3
            if (r4 == r9) goto L7d
            goto Lb5
        L7d:
            if (r1 == 0) goto L99
            java.lang.Object r2 = r1.a
            cni r4 = defpackage.cni.a
            java.lang.Class r2 = r2.getClass()
            cno r2 = r4.a(r2)
            int r4 = defpackage.ckk.f(r2, r12, r15, r5, r7)
            java.lang.Object r15 = r7.c
            java.lang.Object r2 = r1.d
            cls r2 = (defpackage.cls) r2
            r11.l(r2, r15)
            goto L67
        L99:
            if (r8 != r3) goto Lb5
            int r4 = defpackage.ckk.c(r12, r15, r7)
            java.lang.Object r14 = r7.c
            ckv r14 = (defpackage.ckv) r14
            goto L67
        La4:
            if (r8 != 0) goto Lb5
            int r4 = defpackage.ckk.l(r12, r15, r7)
            int r13 = r7.a
            cli r15 = r7.d
            cmz r1 = r10.a
            cmt r1 = r15.b(r1, r13)
            goto L67
        Lb5:
            int r4 = defpackage.coi.b
            if (r2 == r4) goto Lbf
            int r4 = defpackage.ckk.r(r2, r12, r15, r5, r7)
            goto L67
        Lbe:
            r15 = r4
        Lbf:
            if (r14 == 0) goto Lc8
            int r13 = defpackage.coi.c(r13, r3)
            r6.e(r13, r14)
        Lc8:
            r13 = r15
            r14 = r5
            r15 = r7
            goto L19
        Lcd:
            r5 = r14
            if (r13 != r5) goto Ld1
            return
        Ld1:
            cmh r11 = new cmh
            java.lang.String r12 = "Failed to parse the message."
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnd.i(java.lang.Object, byte[], int, int, ckj):void");
    }

    @Override // defpackage.cno
    public final boolean j(Object obj, Object obj2) {
        if (!cnx.f(obj).equals(cnx.f(obj2))) {
            return false;
        }
        if (this.c) {
            return dnx.bD(obj).equals(dnx.bD(obj2));
        }
        return true;
    }

    @Override // defpackage.cno
    public final boolean k(Object obj) {
        return dnx.bD(obj).i();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [cmz, java.lang.Object] */
    @Override // defpackage.cno
    public final void l(Object obj, ckz ckzVar, cli cliVar) {
        boolean zP;
        cnx cnxVar = this.b;
        Object objB = cnxVar.b(obj);
        clk clkVarBE = dnx.bE(obj);
        while (ckzVar.c() != Integer.MAX_VALUE) {
            try {
                int i = ckzVar.b;
                if (i != coi.a) {
                    if (coi.b(i) == 2) {
                        cmt cmtVarB = cliVar.b(this.a, coi.a(i));
                        if (cmtVarB != null) {
                            dnx.bF(ckzVar, cmtVarB, cliVar, clkVarBE);
                        } else {
                            zP = cnxVar.a(objB, ckzVar, 0);
                        }
                    } else {
                        zP = ckzVar.P();
                    }
                    if (!zP) {
                        break;
                    }
                } else {
                    cmt cmtVarB2 = null;
                    ckv ckvVarO = null;
                    int i2 = 0;
                    while (ckzVar.c() != Integer.MAX_VALUE) {
                        int i3 = ckzVar.b;
                        if (i3 == coi.c) {
                            i2 = ckzVar.i();
                            cmtVarB2 = cliVar.b(this.a, i2);
                        } else if (i3 == coi.d) {
                            if (cmtVarB2 != null) {
                                dnx.bF(ckzVar, cmtVarB2, cliVar, clkVarBE);
                            } else {
                                ckvVarO = ckzVar.o();
                            }
                        } else if (i3 == coi.b || !ckzVar.P()) {
                            break;
                        }
                    }
                    if (ckzVar.b != coi.b) {
                        throw new cmh("Protocol message end-group tag did not match expected tag.");
                    }
                    if (ckvVarO != null) {
                        if (cmtVarB2 != null) {
                            cmy cmyVarAH = cmtVarB2.a.aH();
                            cky ckyVarP = cky.P(((ckt) ckvVarO).a, ((ckt) ckvVarO).d());
                            cmyVarAH.e(ckyVarP, cliVar);
                            clkVarBE.l((cls) cmtVarB2.d, cmyVarAH.j());
                            ckyVarP.z(0);
                        } else {
                            cnxVar.c(objB, i2, ckvVarO);
                        }
                    }
                }
            } finally {
                cnx.g(obj, (cny) objB);
            }
        }
    }

    @Override // defpackage.cno
    public final void m(Object obj, asv asvVar) {
        Iterator itD = dnx.bD(obj).d();
        while (itD.hasNext()) {
            Map.Entry entry = (Map.Entry) itD.next();
            cls clsVar = (cls) entry.getKey();
            if (clsVar.a() != coh.MESSAGE) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof cmj) {
                asvVar.C(clsVar.a, ((cml) ((cmj) entry).a.getValue()).a());
            } else {
                asvVar.C(clsVar.a, entry.getValue());
            }
        }
        cny cnyVarF = cnx.f(obj);
        for (int i = 0; i < cnyVarF.b; i++) {
            asvVar.C(coi.a(cnyVarF.c[i]), cnyVarF.d[i]);
        }
    }
}
