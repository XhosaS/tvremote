package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bvn implements bwv {
    final /* synthetic */ bvp a;
    final /* synthetic */ Object b;
    private final je c;

    public bvn(bvp bvpVar, Object obj) {
        this.a = bvpVar;
        this.b = obj;
        int[] iArr = jf.a;
        this.c = new je((byte[]) null);
    }

    @Override // defpackage.bwv
    public final int a() {
        bys bysVar = (bys) this.a.n.a(this.b);
        if (bysVar != null) {
            return bysVar.t().size();
        }
        return 0;
    }

    @Override // defpackage.bwv
    public final void b() {
        bvp bvpVar = this.a;
        bvpVar.i();
        bys bysVar = (bys) bvpVar.n.g(this.b);
        if (bysVar != null) {
            if (bvpVar.j <= 0) {
                bty.c("No pre-composed items to dispose");
            }
            bys bysVar2 = bvpVar.a;
            int iIndexOf = bysVar2.u().indexOf(bysVar);
            if (iIndexOf < bysVar2.u().size() - bvpVar.j) {
                bty.c("Item is not in pre-composed item range");
            }
            bvpVar.i++;
            bvpVar.j--;
            int size = (bysVar2.u().size() - bvpVar.j) - bvpVar.i;
            bvpVar.k(iIndexOf, size);
            bvpVar.h(size);
        }
    }

    @Override // defpackage.bwv
    public final void c(int i, long j) {
        bvp bvpVar = this.a;
        bys bysVar = (bys) bvpVar.n.a(this.b);
        if (bysVar == null || !bysVar.af()) {
            return;
        }
        int size = bysVar.t().size();
        if (i < 0 || i >= size) {
            bty.d("Index (" + i + ") is out of bound of [0, " + size + ')');
        }
        if (bysVar.ag()) {
            bty.b("Pre-measure called on node that is not placed");
        }
        bys bysVar2 = bvpVar.a;
        bysVar2.l = true;
        byv.a(bysVar).r((bys) bysVar.t().get(i), j);
        bysVar2.l = false;
        this.c.d(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [yjv] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [bko] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [bko] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [bfz] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [bfz] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // defpackage.bwv
    public final void d(yjv yjvVar) {
        bzm bzmVar;
        bko bkoVar;
        bys bysVar = (bys) this.a.n.a(this.b);
        if (bysVar == null || (bzmVar = bysVar.t) == null || (bkoVar = bzmVar.f) == null) {
            return;
        }
        if (!bkoVar.E().A) {
            bty.c("visitSubtreeIf called on an unattached node");
        }
        bfz bfzVar = new bfz(new bko[16], 0);
        bko bkoVar2 = bkoVar.E().u;
        if (bkoVar2 == null) {
            fh.O(bfzVar, bkoVar.E());
        } else {
            bfzVar.o(bkoVar2);
        }
        while (true) {
            int i = bfzVar.b;
            if (i == 0) {
                return;
            }
            bko bkoVar3 = (bko) bfzVar.d(i - 1);
            if ((bkoVar3.s & 262144) != 0) {
                for (bko bkoVar4 = bkoVar3; bkoVar4 != null; bkoVar4 = bkoVar4.u) {
                    if ((bkoVar4.r & 262144) != 0) {
                        bxw bxwVarF = bkoVar4;
                        ?? bfzVar2 = 0;
                        while (bxwVarF != 0) {
                            if (bxwVarF instanceof cak) {
                                cak cakVar = (cak) bxwVarF;
                                Object objA = yks.e("androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", cakVar.ci()) ? yjvVar.a(cakVar) : caj.a;
                                if (objA == caj.c) {
                                    return;
                                }
                                if (objA == caj.b) {
                                    break;
                                }
                            } else if ((bxwVarF.r & 262144) != 0 && (bxwVarF instanceof bxw)) {
                                bko bkoVar5 = bxwVarF.C;
                                int i2 = 0;
                                bxwVarF = bxwVarF;
                                bfzVar2 = bfzVar2;
                                while (bkoVar5 != null) {
                                    if ((bkoVar5.r & 262144) != 0) {
                                        i2++;
                                        bfzVar2 = bfzVar2;
                                        if (i2 == 1) {
                                            bxwVarF = bkoVar5;
                                        } else {
                                            if (bfzVar2 == 0) {
                                                bfzVar2 = new bfz(new bko[16], 0);
                                            }
                                            if (bxwVarF != 0) {
                                                bfzVar2.o(bxwVarF);
                                            }
                                            bfzVar2.o(bkoVar5);
                                            bxwVarF = 0;
                                        }
                                    }
                                    bkoVar5 = bkoVar5.u;
                                    bxwVarF = bxwVarF;
                                    bfzVar2 = bfzVar2;
                                }
                                if (i2 != 1) {
                                }
                            }
                            bxwVarF = fh.F(bfzVar2);
                        }
                    }
                }
            }
            fh.O(bfzVar, bkoVar3);
        }
    }

    @Override // defpackage.bwv
    public final void e(int i) {
        bys bysVar = (bys) this.a.n.a(this.b);
        if (bysVar == null || !bysVar.af()) {
            return;
        }
        int size = bysVar.t().size();
        if (i < 0 || i >= size) {
            bty.d("Index (" + i + ") is out of bound of [0, " + size + ')');
        }
        if (this.c.a(i)) {
            ((bys) bysVar.t().get(i)).g();
            ((bys) bysVar.t().get(i)).e();
        }
    }
}
