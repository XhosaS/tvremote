package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzm {
    public final bys a;
    public final bzl b;
    public final byi c;
    public bzq d;
    public final bko e;
    public bko f;
    public bfz g;
    public bfz h;
    public final bfz i;
    private bzk j;

    public bzm(bys bysVar) {
        this.a = bysVar;
        bzl bzlVar = new bzl();
        bzlVar.s = -1;
        this.b = bzlVar;
        byi byiVar = new byi(bysVar);
        this.c = byiVar;
        this.d = byiVar;
        cah cahVar = byiVar.f;
        this.e = cahVar;
        this.f = cahVar;
        this.i = new bfz(new bkp[16], 0);
    }

    public static final bko k(bkn bknVar, bko bkoVar) {
        bko bxoVar;
        if (bknVar instanceof bzi) {
            bxoVar = ((bzi) bknVar).d();
            bxoVar.r = bzr.c(bxoVar);
        } else {
            bxoVar = new bxo(bknVar);
        }
        if (bxoVar.A) {
            bty.c("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        bxoVar.x = true;
        bko bkoVar2 = bkoVar.u;
        if (bkoVar2 != null) {
            bkoVar2.t = bxoVar;
            bxoVar.u = bkoVar2;
        }
        bkoVar.u = bxoVar;
        bxoVar.t = bkoVar;
        return bxoVar;
    }

    public static final bko l(bko bkoVar) {
        if (bkoVar.A) {
            bzr.f(bkoVar);
            bkoVar.K();
            bkoVar.H();
        }
        bko bkoVar2 = bkoVar.u;
        bko bkoVar3 = bkoVar.t;
        if (bkoVar2 != null) {
            bkoVar2.t = bkoVar3;
            bkoVar.u = null;
        }
        if (bkoVar3 != null) {
            bkoVar3.u = bkoVar2;
            bkoVar.t = null;
        }
        bkoVar3.getClass();
        return bkoVar3;
    }

    public static final void m(bkn bknVar, bkn bknVar2, bko bkoVar) {
        if ((bknVar instanceof bzi) && (bknVar2 instanceof bzi)) {
            bkoVar.getClass();
            ((bzi) bknVar2).e(bkoVar);
            if (bkoVar.A) {
                bzr.g(bkoVar);
                return;
            } else {
                bkoVar.y = true;
                return;
            }
        }
        if (!(bkoVar instanceof bxo)) {
            bty.c("Unknown Modifier.Node type");
            return;
        }
        bxo bxoVar = (bxo) bkoVar;
        if (bxoVar.A) {
            bxoVar.s();
        }
        bxoVar.a = bknVar2;
        bxoVar.r = bzr.a(bknVar2);
        if (bxoVar.A) {
            bxoVar.r(false);
        }
        if (bkoVar.A) {
            bzr.g(bkoVar);
        } else {
            bkoVar.y = true;
        }
    }

    public final int a() {
        return this.f.s;
    }

    public final void b() {
        for (bko bkoVar = this.f; bkoVar != null; bkoVar = bkoVar.u) {
            bkoVar.G();
        }
    }

    public final void c() {
        for (bko bkoVar = this.e; bkoVar != null; bkoVar = bkoVar.t) {
            if (bkoVar.A) {
                bkoVar.H();
            }
        }
    }

    public final void d(bko bkoVar, bzq bzqVar) {
        for (bko bkoVar2 = bkoVar.t; bkoVar2 != null; bkoVar2 = bkoVar2.t) {
            if (bkoVar2 == this.b) {
                bys bysVarJ = this.a.j();
                bzqVar.w = bysVarJ != null ? bysVarJ.n() : null;
                this.d = bzqVar;
                return;
            } else {
                if ((bkoVar2.r & 2) != 0) {
                    return;
                }
                bkoVar2.M(bzqVar);
            }
        }
    }

    public final void e() {
        for (bko bkoVar = this.f; bkoVar != null; bkoVar = bkoVar.u) {
            bkoVar.J();
            if (bkoVar.x) {
                bzr.d(bkoVar);
            }
            if (bkoVar.y) {
                bzr.g(bkoVar);
            }
            bkoVar.x = false;
            bkoVar.y = false;
        }
    }

    public final void f() {
        for (bko bkoVar = this.e; bkoVar != null; bkoVar = bkoVar.t) {
            if (bkoVar.A) {
                bkoVar.K();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x012d, code lost:
    
        r1 = r12;
        r20 = r13;
        r13 = r15;
        r12 = r11;
        r11 = r14;
        r15 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0135, code lost:
    
        if (r15 > r5) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0137, code lost:
    
        if (r15 == r9) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0139, code lost:
    
        r14 = r15 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x013b, code lost:
    
        if (r15 == r5) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013d, code lost:
    
        r32 = r12;
        r19 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014b, code lost:
    
        if (defpackage.bxs.a(r3, r15 + 1) >= defpackage.bxs.a(r3, r14)) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x014e, code lost:
    
        r32 = r12;
        r19 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0152, code lost:
    
        r12 = defpackage.bxs.a(r3, r14);
        r13 = r12 - 1;
        r14 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015a, code lost:
    
        r32 = r12;
        r19 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x015e, code lost:
    
        r13 = defpackage.bxs.a(r3, r15 + 1);
        r14 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0166, code lost:
    
        r12 = r1 - ((r19 - r13) - r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016b, code lost:
    
        if (r5 == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x016d, code lost:
    
        r21 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0170, code lost:
    
        r21 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0172, code lost:
    
        if (r13 != r14) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0174, code lost:
    
        r22 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0177, code lost:
    
        r22 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x017b, code lost:
    
        if (r13 <= r6) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017d, code lost:
    
        if (r12 <= r11) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x017f, code lost:
    
        r24 = r12;
        r12 = r13 - 1;
        r25 = r14;
        r14 = r24 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x018b, code lost:
    
        if (r0.a(r12, r14) == false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x018d, code lost:
    
        r13 = r12;
        r12 = r14;
        r14 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0192, code lost:
    
        r24 = r12;
        r25 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0196, code lost:
    
        r12 = (r18 & 1) ^ 1;
        defpackage.bxs.b(r3, r15, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x019d, code lost:
    
        if (r12 == 0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x019f, code lost:
    
        r12 = r18 - r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a1, code lost:
    
        if (r12 < r9) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a3, code lost:
    
        if (r12 > r5) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a9, code lost:
    
        if (defpackage.bxs.a(r10, r12) < r13) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ab, code lost:
    
        r17 = r32;
        r5 = r19;
        r9 = 3;
        defpackage.cbp.T(r13, r24, r25, r12 + (r21 & r22), true, r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0217, code lost:
    
        r12 = r32;
        r13 = r19;
        r15 = r15 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0220, code lost:
    
        r5 = r5 + 1;
        r9 = r31;
        r14 = r11;
        r11 = r12;
        r15 = r13;
        r13 = r20;
        r12 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x011b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ef  */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(int r28, defpackage.bfz r29, defpackage.bfz r30, defpackage.bko r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 854
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzm.g(int, bfz, bfz, bko, boolean):void");
    }

    public final void h() {
        int i = 0;
        for (bko bkoVar = this.e.t; bkoVar != null && bkoVar != this.b; bkoVar = bkoVar.t) {
            i |= bkoVar.r;
            bkoVar.s = i;
        }
    }

    public final void i() {
        bzq bzqVar;
        bzq bzqVar2 = this.c;
        for (bko bkoVar = this.e.t; bkoVar != null; bkoVar = bkoVar.t) {
            byl bylVarH = fh.H(bkoVar);
            if (bylVarH != null) {
                bzq bzqVar3 = bkoVar.w;
                if (bzqVar3 != null) {
                    byo byoVar = (byo) bzqVar3;
                    byl bylVar = byoVar.f;
                    byoVar.G(bylVarH);
                    bzqVar = byoVar;
                    if (bylVar != bkoVar) {
                        byoVar.ah();
                        bzqVar = byoVar;
                    }
                } else {
                    bzq byoVar2 = new byo(this.a, bylVarH);
                    bkoVar.M(byoVar2);
                    bzqVar = byoVar2;
                }
                bzqVar2.w = bzqVar;
                bzqVar.v = bzqVar2;
                bzqVar2 = bzqVar;
            } else {
                bkoVar.M(bzqVar2);
            }
        }
        bys bysVarJ = this.a.j();
        bzqVar2.w = bysVarJ != null ? bysVarJ.n() : null;
        this.d = bzqVar2;
    }

    public final boolean j(int i) {
        return (i & a()) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        bko bkoVar = this.f;
        bko bkoVar2 = this.e;
        if (bkoVar == bkoVar2) {
            sb.append("]");
        } else {
            while (true) {
                if (bkoVar == null || bkoVar == bkoVar2) {
                    break;
                }
                sb.append(bkoVar.toString());
                if (bkoVar.u == bkoVar2) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                bkoVar = bkoVar.u;
            }
        }
        return sb.toString();
    }
}
