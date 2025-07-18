package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzn implements bzo {
    private final /* synthetic */ int a;

    public bzn(int i) {
        this.a = i;
    }

    @Override // defpackage.bzo
    public final int a() {
        return this.a != 0 ? 16 : 8;
    }

    @Override // defpackage.bzo
    public final void b(bys bysVar, long j, byg bygVar, int i, boolean z) {
        if (this.a != 0) {
            bysVar.C(j, bygVar, i, z);
        } else {
            bysVar.al(j, bygVar, z);
        }
    }

    @Override // defpackage.bzo
    public final boolean c(bys bysVar) {
        cfc cfcVarP;
        return (this.a == 0 && (cfcVarP = bysVar.p()) != null && cfcVarP.b) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [bfz] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [bfz] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [bko] */
    /* JADX WARN: Type inference failed for: r9v1, types: [bko] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [bko] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // defpackage.bzo
    public final void d(bko bkoVar) {
        if (this.a != 0) {
            ?? bfzVar = 0;
            while (bkoVar != 0) {
                if (bkoVar instanceof cad) {
                    ((cad) bkoVar).y();
                } else if ((bkoVar.r & 16) != 0 && (bkoVar instanceof bxw)) {
                    bko bkoVar2 = bkoVar.C;
                    int i = 0;
                    bfzVar = bfzVar;
                    bkoVar = bkoVar;
                    while (bkoVar2 != null) {
                        if ((bkoVar2.r & 16) != 0) {
                            i++;
                            bfzVar = bfzVar;
                            if (i == 1) {
                                bkoVar = bkoVar2;
                            } else {
                                if (bfzVar == 0) {
                                    bfzVar = new bfz(new bko[16], 0);
                                }
                                if (bkoVar != 0) {
                                    bfzVar.o(bkoVar);
                                }
                                bfzVar.o(bkoVar2);
                                bkoVar = 0;
                            }
                        }
                        bkoVar2 = bkoVar2.u;
                        bfzVar = bfzVar;
                        bkoVar = bkoVar;
                    }
                    if (i != 1) {
                    }
                }
                bkoVar = fh.F(bfzVar);
            }
        }
    }
}
