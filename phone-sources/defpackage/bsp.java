package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bsp extends bsq {
    public final bko a;
    private bvc g;
    private bsr h;
    private boolean i;
    public final nfz c = new nfz((char[]) null);
    private final jn f = new jn(2);
    public boolean b = true;
    private boolean j = true;

    public bsp(bko bkoVar) {
        this.a = bkoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v2, types: [bko] */
    /* JADX WARN: Type inference failed for: r0v3, types: [bko] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [bko] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [bfz] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [bfz] */
    public final void a() {
        bfz bfzVar = this.d;
        Object[] objArr = bfzVar.a;
        int i = bfzVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((bsp) objArr[i2]).a();
        }
        bxw bxwVarF = this.a;
        ?? bfzVar2 = 0;
        while (bxwVarF != 0) {
            if (bxwVarF instanceof cad) {
                ((cad) bxwVarF).bV();
            } else if ((bxwVarF.r & 16) != 0 && (bxwVarF instanceof bxw)) {
                bko bkoVar = bxwVarF.C;
                int i3 = 0;
                bxwVarF = bxwVarF;
                bfzVar2 = bfzVar2;
                while (bkoVar != null) {
                    if ((bkoVar.r & 16) != 0) {
                        i3++;
                        bfzVar2 = bfzVar2;
                        if (i3 == 1) {
                            bxwVarF = bkoVar;
                        } else {
                            if (bfzVar2 == 0) {
                                bfzVar2 = new bfz(new bko[16], 0);
                            }
                            if (bxwVarF != 0) {
                                bfzVar2.o(bxwVarF);
                            }
                            bfzVar2.o(bkoVar);
                            bxwVarF = 0;
                        }
                    }
                    bkoVar = bkoVar.u;
                    bxwVarF = bxwVarF;
                    bfzVar2 = bfzVar2;
                }
                if (i3 != 1) {
                }
            }
            bxwVarF = fh.F(bfzVar2);
        }
    }

    public final void b(long j, kc kcVar) {
        nfz nfzVar = this.c;
        if (nfzVar.h(j) && !kcVar.e(this)) {
            nfzVar.j(j);
            this.f.k(j);
        }
        bfz bfzVar = this.d;
        Object[] objArr = bfzVar.a;
        int i = bfzVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((bsp) objArr[i2]).b(j, kcVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02f3  */
    /* JADX WARN: Type inference failed for: r5v0, types: [bko] */
    /* JADX WARN: Type inference failed for: r5v1, types: [bko] */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47, types: [bko] */
    /* JADX WARN: Type inference failed for: r5v48, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19, types: [bfz] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22, types: [bfz] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    @Override // defpackage.bsq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(defpackage.jn r51, defpackage.bvc r52, defpackage.ft r53, boolean r54) {
        /*
            Method dump skipped, instructions count: 761
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsp.c(jn, bvc, ft, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [bko] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [bko] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [bfz] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [bfz] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(defpackage.ft r15) {
        /*
            r14 = this;
            jn r0 = r14.f
            boolean r1 = r0.m()
            r2 = 0
            r3 = 0
            if (r1 == 0) goto Ld
        La:
            r9 = r3
            goto L84
        Ld:
            bko r1 = r14.a
            boolean r4 = r1.A
            if (r4 != 0) goto L14
            goto La
        L14:
            bsr r4 = r14.h
            r4.getClass()
            bvc r5 = r14.g
            r5.getClass()
            long r5 = r5.h()
            r7 = r1
            r8 = r2
        L24:
            r9 = 1
            if (r7 == 0) goto L6d
            boolean r10 = r7 instanceof defpackage.cad
            if (r10 == 0) goto L33
            cad r7 = (defpackage.cad) r7
            bss r9 = defpackage.bss.c
            r7.m(r4, r9, r5)
            goto L68
        L33:
            int r10 = r7.r
            r11 = 16
            r10 = r10 & r11
            if (r10 == 0) goto L68
            boolean r10 = r7 instanceof defpackage.bxw
            if (r10 == 0) goto L68
            r10 = r7
            bxw r10 = (defpackage.bxw) r10
            bko r10 = r10.C
            r12 = r3
        L44:
            if (r10 == 0) goto L66
            int r13 = r10.r
            r13 = r13 & r11
            if (r13 == 0) goto L63
            int r12 = r12 + 1
            if (r12 != r9) goto L51
            r7 = r10
            goto L63
        L51:
            if (r8 != 0) goto L5a
            bfz r8 = new bfz
            bko[] r13 = new defpackage.bko[r11]
            r8.<init>(r13, r3)
        L5a:
            if (r7 == 0) goto L5f
            r8.o(r7)
        L5f:
            r8.o(r10)
            r7 = r2
        L63:
            bko r10 = r10.u
            goto L44
        L66:
            if (r12 == r9) goto L24
        L68:
            bko r7 = defpackage.fh.F(r8)
            goto L24
        L6d:
            boolean r1 = r1.A
            if (r1 == 0) goto L84
            bfz r1 = r14.d
            java.lang.Object[] r4 = r1.a
            int r1 = r1.b
            r5 = r3
        L78:
            if (r5 >= r1) goto L84
            r6 = r4[r5]
            bsp r6 = (defpackage.bsp) r6
            r6.d(r15)
            int r5 = r5 + 1
            goto L78
        L84:
            super.f()
            bsr r1 = r14.h
            if (r1 != 0) goto L8c
            goto Lc2
        L8c:
            boolean r4 = r14.b
            r14.i = r4
            java.util.List r4 = r1.a
            int r5 = r4.size()
            r6 = r3
        L97:
            if (r6 >= r5) goto Lb7
            java.lang.Object r7 = r4.get(r6)
            bsz r7 = (defpackage.bsz) r7
            boolean r8 = r7.d
            long r10 = r7.a
            boolean r7 = r15.c(r10)
            boolean r12 = r14.b
            if (r8 != 0) goto Lb4
            if (r7 == 0) goto Laf
            if (r12 != 0) goto Lb4
        Laf:
            nfz r7 = r14.c
            r7.j(r10)
        Lb4:
            int r6 = r6 + 1
            goto L97
        Lb7:
            r14.b = r3
            int r15 = r1.d
            r1 = 5
            boolean r15 = defpackage.a.r(r15, r1)
            r14.j = r15
        Lc2:
            r0.i()
            r14.g = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsp.d(ft):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v2, types: [bko] */
    /* JADX WARN: Type inference failed for: r0v3, types: [bko] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [bko] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [bfz] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [bfz] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [bko] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [bko] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [bfz] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [bfz] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(ft ftVar, boolean z) {
        if (this.f.m()) {
            return false;
        }
        bxw bxwVarF = this.a;
        if (!bxwVarF.A) {
            return false;
        }
        bsr bsrVar = this.h;
        bsrVar.getClass();
        bvc bvcVar = this.g;
        bvcVar.getClass();
        long jH = bvcVar.h();
        bxw bxwVarF2 = bxwVarF;
        ?? bfzVar = 0;
        while (bxwVarF2 != 0) {
            if (bxwVarF2 instanceof cad) {
                ((cad) bxwVarF2).m(bsrVar, bss.a, jH);
            } else if ((bxwVarF2.r & 16) != 0 && (bxwVarF2 instanceof bxw)) {
                bko bkoVar = bxwVarF2.C;
                int i = 0;
                bxwVarF2 = bxwVarF2;
                bfzVar = bfzVar;
                while (bkoVar != null) {
                    if ((bkoVar.r & 16) != 0) {
                        i++;
                        bfzVar = bfzVar;
                        if (i == 1) {
                            bxwVarF2 = bkoVar;
                        } else {
                            if (bfzVar == 0) {
                                bfzVar = new bfz(new bko[16], 0);
                            }
                            if (bxwVarF2 != 0) {
                                bfzVar.o(bxwVarF2);
                            }
                            bfzVar.o(bkoVar);
                            bxwVarF2 = 0;
                        }
                    }
                    bkoVar = bkoVar.u;
                    bxwVarF2 = bxwVarF2;
                    bfzVar = bfzVar;
                }
                if (i != 1) {
                }
            }
            bxwVarF2 = fh.F(bfzVar);
        }
        if (bxwVarF.A) {
            bfz bfzVar2 = this.d;
            Object[] objArr = bfzVar2.a;
            int i2 = bfzVar2.b;
            for (int i3 = 0; i3 < i2; i3++) {
                bsp bspVar = (bsp) objArr[i3];
                this.g.getClass();
                bspVar.e(ftVar, z);
            }
        }
        if (bxwVarF.A) {
            ?? bfzVar3 = 0;
            while (bxwVarF != 0) {
                if (bxwVarF instanceof cad) {
                    ((cad) bxwVarF).m(bsrVar, bss.b, jH);
                } else if ((bxwVarF.r & 16) != 0 && (bxwVarF instanceof bxw)) {
                    bko bkoVar2 = bxwVarF.C;
                    int i4 = 0;
                    bxwVarF = bxwVarF;
                    bfzVar3 = bfzVar3;
                    while (bkoVar2 != null) {
                        if ((bkoVar2.r & 16) != 0) {
                            i4++;
                            bfzVar3 = bfzVar3;
                            if (i4 == 1) {
                                bxwVarF = bkoVar2;
                            } else {
                                if (bfzVar3 == 0) {
                                    bfzVar3 = new bfz(new bko[16], 0);
                                }
                                if (bxwVarF != 0) {
                                    bfzVar3.o(bxwVarF);
                                }
                                bfzVar3.o(bkoVar2);
                                bxwVarF = 0;
                            }
                        }
                        bkoVar2 = bkoVar2.u;
                        bxwVarF = bxwVarF;
                        bfzVar3 = bfzVar3;
                    }
                    if (i4 != 1) {
                    }
                }
                bxwVarF = fh.F(bfzVar3);
            }
        }
        return true;
    }

    public final String toString() {
        return "Node(modifierNode=" + this.a + ", children=" + this.d + ", pointerIds=" + this.c + ')';
    }
}
