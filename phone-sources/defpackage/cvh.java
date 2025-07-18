package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cvh {
    public final Object a;
    public Object b;

    public cvh() {
        this.a = new bfz(new bys[16], 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [dvj, java.lang.Object] */
    final void a() {
        ((dve) this.a).d(this.b);
        this.b = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [bko] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [bko] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [bfz] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [bfz] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void b(bys bysVar) {
        if (bysVar.av() == 5 && !bysVar.ab() && !bysVar.ae() && !bysVar.z && bysVar.ag()) {
            bzm bzmVar = bysVar.t;
            if ((bzmVar.a() & 256) != 0) {
                for (bko bkoVar = bzmVar.f; bkoVar != null; bkoVar = bkoVar.u) {
                    if ((bkoVar.r & 256) != 0) {
                        bxw bxwVarF = bkoVar;
                        ?? bfzVar = 0;
                        while (bxwVarF != 0) {
                            if (bxwVarF instanceof byd) {
                                byd bydVar = (byd) bxwVarF;
                                bydVar.bT(fh.J(bydVar, 256));
                            } else if ((bxwVarF.r & 256) != 0 && (bxwVarF instanceof bxw)) {
                                bko bkoVar2 = bxwVarF.C;
                                int i = 0;
                                bxwVarF = bxwVarF;
                                bfzVar = bfzVar;
                                while (bkoVar2 != null) {
                                    if ((bkoVar2.r & 256) != 0) {
                                        i++;
                                        bfzVar = bfzVar;
                                        if (i == 1) {
                                            bxwVarF = bkoVar2;
                                        } else {
                                            if (bfzVar == 0) {
                                                bfzVar = new bfz(new bko[16], 0);
                                            }
                                            if (bxwVarF != 0) {
                                                bfzVar.o(bxwVarF);
                                            }
                                            bfzVar.o(bkoVar2);
                                            bxwVarF = 0;
                                        }
                                    }
                                    bkoVar2 = bkoVar2.u;
                                    bxwVarF = bxwVarF;
                                    bfzVar = bfzVar;
                                }
                                if (i != 1) {
                                }
                            }
                            bxwVarF = fh.F(bfzVar);
                        }
                    }
                    if ((bkoVar.s & 256) == 0) {
                        break;
                    }
                }
            }
        }
        bysVar.y = false;
        bfz bfzVarI = bysVar.i();
        Object[] objArr = bfzVarI.a;
        int i2 = bfzVarI.b;
        for (int i3 = 0; i3 < i2; i3++) {
            b((bys) objArr[i3]);
        }
    }

    public final void c(bys bysVar) {
        ((bfz) this.a).o(bysVar);
        bysVar.y = true;
    }

    public cvh(dve dveVar, dvi dviVar) {
        this.a = dveVar;
        this.b = dviVar;
        dveVar.c(dviVar);
    }
}
