package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vvn implements vvy {
    private final vvj a;
    private final vwg b;
    private final boolean c;

    public vvn(vwg vwgVar, vvj vvjVar) {
        this.b = vwgVar;
        this.c = vvjVar instanceof vtz;
        this.a = vvjVar;
    }

    @Override // defpackage.vvy
    public final int a(Object obj) {
        vwh vwhVarF = vwg.f(obj);
        int iAb = vwhVarF.e;
        if (iAb == -1) {
            iAb = 0;
            for (int i = 0; i < vwhVarF.b; i++) {
                int iA = vwq.a(vwhVarF.c[i]);
                vsz vszVar = (vsz) vwhVarF.d[i];
                int iAa = vtj.aa(1);
                iAb += iAa + iAa + vtj.ab(2, iA) + vtj.H(3, vszVar);
            }
            vwhVarF.e = iAb;
        }
        if (!this.c) {
            return iAb;
        }
        vtr vtrVarW = vxr.W(obj);
        vwc vwcVar = vtrVarW.b;
        int i2 = vwcVar.b;
        int iB = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            iB += vtrVarW.b(vwcVar.d(i3));
        }
        Iterator it = vwcVar.a().iterator();
        while (it.hasNext()) {
            iB += vtrVarW.b((Map.Entry) it.next());
        }
        return iAb + iB;
    }

    @Override // defpackage.vvy
    public final int b(Object obj) {
        int iHashCode = vwg.f(obj).hashCode();
        return this.c ? (iHashCode * 53) + vxr.W(obj).hashCode() : iHashCode;
    }

    @Override // defpackage.vvy
    public final Object e() {
        vvj vvjVar = this.a;
        return vvjVar instanceof vuc ? ((vuc) vvjVar).o() : vvjVar.dN().s();
    }

    @Override // defpackage.vvy
    public final void g(Object obj) {
        this.b.e(obj);
        vxr.Z(obj);
    }

    @Override // defpackage.vvy
    public final void h(Object obj, Object obj2) {
        vvz.n(obj, obj2);
        if (this.c) {
            vvz.m(obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bf A[EDGE_INSN: B:61:0x00bf->B:33:0x00bf BREAK  A[LOOP:1: B:17:0x0067->B:64:0x0067], SYNTHETIC] */
    @Override // defpackage.vvy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(java.lang.Object r11, byte[] r12, int r13, int r14, defpackage.vsm r15) throws defpackage.vuq {
        /*
            r10 = this;
            r0 = r11
            vuc r0 = (defpackage.vuc) r0
            vwh r1 = r0.P
            vwh r2 = defpackage.vwh.a
            if (r1 != r2) goto L10
            vwh r1 = new vwh
            r1.<init>()
            r0.P = r1
        L10:
            r6 = r1
            vtz r11 = (defpackage.vtz) r11
            vtr r11 = r11.c()
            r0 = 0
            r1 = r0
        L19:
            if (r13 >= r14) goto Lcd
            int r4 = defpackage.vsn.l(r12, r13, r15)
            int r2 = r15.a
            int r13 = defpackage.vwq.a
            r3 = 2
            if (r2 == r13) goto L63
            int r13 = defpackage.vwq.b(r2)
            if (r13 != r3) goto L5c
            vtp r13 = r15.d
            vvj r1 = r10.a
            int r3 = defpackage.vwq.a(r2)
            vvd r1 = r13.b(r1, r3)
            if (r1 == 0) goto L54
            java.lang.Object r13 = r1.a
            vvs r2 = defpackage.vvs.a
            java.lang.Class r13 = r13.getClass()
            vvy r13 = r2.a(r13)
            int r13 = defpackage.vsn.f(r13, r12, r4, r14, r15)
            java.lang.Object r2 = r15.c
            java.lang.Object r3 = r1.c
            vub r3 = (defpackage.vub) r3
            r11.l(r3, r2)
            goto L19
        L54:
            r3 = r12
            r5 = r14
            r7 = r15
            int r13 = defpackage.vsn.k(r2, r3, r4, r5, r6, r7)
            goto L19
        L5c:
            r5 = r14
            r7 = r15
            int r13 = defpackage.vsn.r(r2, r12, r4, r5, r7)
            goto L19
        L63:
            r5 = r14
            r7 = r15
            r13 = 0
            r14 = r0
        L67:
            if (r4 >= r5) goto Lbe
            int r15 = defpackage.vsn.l(r12, r4, r7)
            int r2 = r7.a
            int r4 = defpackage.vwq.a(r2)
            int r8 = defpackage.vwq.b(r2)
            if (r4 == r3) goto La4
            r9 = 3
            if (r4 == r9) goto L7d
            goto Lb5
        L7d:
            if (r1 == 0) goto L99
            java.lang.Object r2 = r1.a
            vvs r4 = defpackage.vvs.a
            java.lang.Class r2 = r2.getClass()
            vvy r2 = r4.a(r2)
            int r4 = defpackage.vsn.f(r2, r12, r15, r5, r7)
            java.lang.Object r15 = r7.c
            java.lang.Object r2 = r1.c
            vub r2 = (defpackage.vub) r2
            r11.l(r2, r15)
            goto L67
        L99:
            if (r8 != r3) goto Lb5
            int r4 = defpackage.vsn.c(r12, r15, r7)
            java.lang.Object r14 = r7.c
            vsz r14 = (defpackage.vsz) r14
            goto L67
        La4:
            if (r8 != 0) goto Lb5
            int r4 = defpackage.vsn.l(r12, r15, r7)
            int r13 = r7.a
            vtp r15 = r7.d
            vvj r1 = r10.a
            vvd r1 = r15.b(r1, r13)
            goto L67
        Lb5:
            int r4 = defpackage.vwq.b
            if (r2 == r4) goto Lbf
            int r4 = defpackage.vsn.r(r2, r12, r15, r5, r7)
            goto L67
        Lbe:
            r15 = r4
        Lbf:
            if (r14 == 0) goto Lc8
            int r13 = defpackage.vwq.c(r13, r3)
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
            vuq r11 = new vuq
            java.lang.String r12 = "Failed to parse the message."
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vvn.i(java.lang.Object, byte[], int, int, vsm):void");
    }

    @Override // defpackage.vvy
    public final boolean j(Object obj, Object obj2) {
        if (!vwg.f(obj).equals(vwg.f(obj2))) {
            return false;
        }
        if (this.c) {
            return vxr.W(obj).equals(vxr.W(obj2));
        }
        return true;
    }

    @Override // defpackage.vvy
    public final boolean k(Object obj) {
        return vxr.W(obj).i();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, vvj] */
    @Override // defpackage.vvy
    public final void l(Object obj, vtf vtfVar, vtp vtpVar) {
        boolean zP;
        vwg vwgVar = this.b;
        Object objB = vwgVar.b(obj);
        vtr vtrVarX = vxr.X(obj);
        while (vtfVar.c() != Integer.MAX_VALUE) {
            try {
                int i = vtfVar.b;
                if (i != vwq.a) {
                    if (vwq.b(i) == 2) {
                        vvd vvdVarB = vtpVar.b(this.a, vwq.a(i));
                        if (vvdVarB != null) {
                            vxr.Y(vtfVar, vvdVarB, vtpVar, vtrVarX);
                        } else {
                            zP = vwgVar.a(objB, vtfVar, 0);
                        }
                    } else {
                        zP = vtfVar.P();
                    }
                    if (!zP) {
                        break;
                    }
                } else {
                    vvd vvdVarB2 = null;
                    vsz vszVarO = null;
                    int i2 = 0;
                    while (vtfVar.c() != Integer.MAX_VALUE) {
                        int i3 = vtfVar.b;
                        if (i3 == vwq.c) {
                            i2 = vtfVar.i();
                            vvdVarB2 = vtpVar.b(this.a, i2);
                        } else if (i3 == vwq.d) {
                            if (vvdVarB2 != null) {
                                vxr.Y(vtfVar, vvdVarB2, vtpVar, vtrVarX);
                            } else {
                                vszVarO = vtfVar.o();
                            }
                        } else if (i3 == vwq.b || !vtfVar.P()) {
                            break;
                        }
                    }
                    if (vtfVar.b != vwq.b) {
                        throw new vuq("Protocol message end-group tag did not match expected tag.");
                    }
                    if (vszVarO != null) {
                        if (vvdVarB2 != null) {
                            vvi vviVarDN = vvdVarB2.a.dN();
                            vte vteVarK = vszVarO.k();
                            vviVarDN.j(vteVarK, vtpVar);
                            vtrVarX.l((vub) vvdVarB2.c, vviVarDN.s());
                            vteVarK.z(0);
                        } else {
                            vwgVar.c(objB, i2, vszVarO);
                        }
                    }
                }
            } finally {
                vwg.g(obj, (vwh) objB);
            }
        }
    }

    @Override // defpackage.vvy
    public final void m(Object obj, ulp ulpVar) {
        Iterator itD = vxr.W(obj).d();
        while (itD.hasNext()) {
            Map.Entry entry = (Map.Entry) itD.next();
            vub vubVar = (vub) entry.getKey();
            if (vubVar.a() != vwp.MESSAGE) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof vut) {
                ulpVar.K(vubVar.a, ((vuv) ((vut) entry).a.getValue()).a());
            } else {
                ulpVar.K(vubVar.a, entry.getValue());
            }
        }
        vwh vwhVarF = vwg.f(obj);
        for (int i = 0; i < vwhVarF.b; i++) {
            ulpVar.K(vwq.a(vwhVarF.c[i]), vwhVarF.d[i]);
        }
    }
}
