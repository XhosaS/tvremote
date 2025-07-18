package defpackage;

import android.os.Trace;
import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmr extends bko implements bxu, bzt, bxh, bxv {
    public boolean a;
    public boolean b;
    private final yjz c;
    private final int d;

    public /* synthetic */ bmr(int i, yjz yjzVar, int i2) {
        this.c = (i2 & 2) != 0 ? null : yjzVar;
        this.d = 1 == (i2 & 1) ? 1 : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [bko] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [bko] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [bfz] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [bfz] */
    public final bmi b() {
        boolean z;
        bzm bzmVar;
        bmj bmjVar = new bmj();
        int i = this.d;
        if (a.r(i, 1)) {
            z = true;
        } else if (a.r(i, 0)) {
            z = !a.r(((kw) fh.P(this, ccq.h)).l(), 1);
        } else {
            if (!a.r(i, 2)) {
                throw new IllegalStateException("Unknown Focusability");
            }
            z = false;
        }
        bmjVar.a = z;
        bko bkoVar = this.q;
        if (!bkoVar.A) {
            bty.c("visitAncestors called on an unattached node");
        }
        bko bkoVar2 = this.q;
        bys bysVarI = fh.I(this);
        loop0: while (bysVarI != null) {
            if ((bysVarI.t.f.s & 3072) != 0) {
                while (bkoVar2 != null) {
                    int i2 = bkoVar2.r;
                    if ((i2 & 3072) != 0) {
                        if (bkoVar2 != bkoVar && (i2 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i2 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0) {
                            bxw bxwVarF = bkoVar2;
                            ?? bfzVar = 0;
                            while (bxwVarF != 0) {
                                if (bxwVarF instanceof bmk) {
                                    ((bmk) bxwVarF).l(bmjVar);
                                } else if ((bxwVarF.r & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 && (bxwVarF instanceof bxw)) {
                                    bko bkoVar3 = bxwVarF.C;
                                    int i3 = 0;
                                    bxwVarF = bxwVarF;
                                    bfzVar = bfzVar;
                                    while (bkoVar3 != null) {
                                        if ((bkoVar3.r & RecyclerView.ItemAnimator.FLAG_MOVED) != 0) {
                                            i3++;
                                            bfzVar = bfzVar;
                                            if (i3 == 1) {
                                                bxwVarF = bkoVar3;
                                            } else {
                                                if (bfzVar == 0) {
                                                    bfzVar = new bfz(new bko[16], 0);
                                                }
                                                if (bxwVarF != 0) {
                                                    bfzVar.o(bxwVarF);
                                                }
                                                bfzVar.o(bkoVar3);
                                                bxwVarF = 0;
                                            }
                                        }
                                        bkoVar3 = bkoVar3.u;
                                        bxwVarF = bxwVarF;
                                        bfzVar = bfzVar;
                                    }
                                    if (i3 != 1) {
                                    }
                                }
                                bxwVarF = fh.F(bfzVar);
                            }
                        }
                    }
                    bkoVar2 = bkoVar2.t;
                }
            }
            bysVarI = bysVarI.j();
            bkoVar2 = (bysVarI == null || (bzmVar = bysVarI.t) == null) ? null : bzmVar.e;
        }
        return bmjVar;
    }

    @Override // defpackage.bko
    public final void bS() {
        if (e().b()) {
            ((cbc) fh.K(this)).K.i(true, true, 8);
        }
    }

    @Override // defpackage.bxj
    public final /* synthetic */ Object bY(kw kwVar) {
        return fh.ab(this, kwVar);
    }

    @Override // defpackage.bko
    public final boolean ce() {
        return false;
    }

    @Override // defpackage.bko
    public final void ch() {
        int iOrdinal = e().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new yfu();
                }
                return;
            }
        }
        bmh bmhVar = ((cbc) fh.K(this)).K;
        bmhVar.i(true, false, 8);
        bmhVar.c.a();
    }

    public final bmp e() {
        bmr bmrVar;
        bzm bzmVar;
        if (!this.A || (bmrVar = ((cbc) fh.K(this)).K.e) == null) {
            return bmp.d;
        }
        if (this == bmrVar) {
            return bmp.a;
        }
        if (bmrVar.A) {
            if (!bmrVar.q.A) {
                bty.c("visitAncestors called on an unattached node");
            }
            bko bkoVar = bmrVar.q.t;
            bys bysVarI = fh.I(bmrVar);
            while (bysVarI != null) {
                if ((bysVarI.t.f.s & 1024) != 0) {
                    while (bkoVar != null) {
                        if ((bkoVar.r & 1024) != 0) {
                            bko bkoVarF = bkoVar;
                            bfz bfzVar = null;
                            while (bkoVarF != null) {
                                if (bkoVarF instanceof bmr) {
                                    if (this == ((bmr) bkoVarF)) {
                                        return bmp.b;
                                    }
                                } else if ((bkoVarF.r & 1024) != 0 && (bkoVarF instanceof bxw)) {
                                    int i = 0;
                                    for (bko bkoVar2 = ((bxw) bkoVarF).C; bkoVar2 != null; bkoVar2 = bkoVar2.u) {
                                        if ((bkoVar2.r & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                bkoVarF = bkoVar2;
                                            } else {
                                                if (bfzVar == null) {
                                                    bfzVar = new bfz(new bko[16], 0);
                                                }
                                                if (bkoVarF != null) {
                                                    bfzVar.o(bkoVarF);
                                                }
                                                bfzVar.o(bkoVar2);
                                                bkoVarF = null;
                                            }
                                        }
                                    }
                                    if (i != 1) {
                                    }
                                }
                                bkoVarF = fh.F(bfzVar);
                            }
                        }
                        bkoVar = bkoVar.t;
                    }
                }
                bysVarI = bysVarI.j();
                bkoVar = (bysVarI == null || (bzmVar = bysVarI.t) == null) ? null : bzmVar.e;
            }
        }
        return bmp.d;
    }

    public final void f() {
        bmi bmiVar;
        int iOrdinal = e().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new yfu();
                }
                return;
            }
        }
        ylf ylfVar = new ylf();
        cbp.Q(this, new bmq(ylfVar, this, 0));
        Object obj = ylfVar.a;
        if (obj == null) {
            yks.c("focusProperties");
            bmiVar = null;
        } else {
            bmiVar = (bmi) obj;
        }
        if (bmiVar.d()) {
            return;
        }
        ((cbc) fh.K(this)).K.d(true);
    }

    public final boolean g(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            boolean zK = false;
            if (((bmj) b()).a) {
                int iN = d.N(this, i);
                int i2 = iN - 1;
                if (iN == 0) {
                    throw null;
                }
                if (i2 == 0) {
                    zK = d.K(this);
                } else if (i2 != 1) {
                    if (i2 != 2) {
                        throw new yfu();
                    }
                    zK = true;
                }
            }
            return zK;
        } finally {
            Trace.endSection();
        }
    }

    public final acl h() {
        return (acl) fh.ab(this, buk.a);
    }

    @Override // defpackage.bxh
    public final /* synthetic */ bxg i() {
        return bxe.a;
    }

    @Override // defpackage.bzt
    public final void l() {
        f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [bko] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [bko] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [bfz] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [bfz] */
    public final void m(bmp bmpVar, bmp bmpVar2) {
        bzm bzmVar;
        yjz yjzVar;
        bmh bmhVar = ((cbc) fh.K(this)).K;
        bmr bmrVar = bmhVar.e;
        if (!yks.e(bmpVar, bmpVar2) && (yjzVar = this.c) != null) {
            yjzVar.a(bmpVar, bmpVar2);
        }
        bko bkoVar = this.q;
        if (!bkoVar.A) {
            bty.c("visitAncestors called on an unattached node");
        }
        bko bkoVar2 = this.q;
        bys bysVarI = fh.I(this);
        while (bysVarI != null) {
            if ((bysVarI.t.f.s & 5120) != 0) {
                while (bkoVar2 != null) {
                    int i = bkoVar2.r;
                    if ((i & 5120) != 0) {
                        if (bkoVar2 != bkoVar && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                            bxw bxwVarF = bkoVar2;
                            ?? bfzVar = 0;
                            while (bxwVarF != 0) {
                                if (bxwVarF instanceof bmb) {
                                    bmb bmbVar = (bmb) bxwVarF;
                                    if (bmrVar == bmhVar.e) {
                                        bmbVar.ck(bmpVar2);
                                    }
                                } else if ((bxwVarF.r & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 && (bxwVarF instanceof bxw)) {
                                    bko bkoVar3 = bxwVarF.C;
                                    int i2 = 0;
                                    bxwVarF = bxwVarF;
                                    bfzVar = bfzVar;
                                    while (bkoVar3 != null) {
                                        if ((bkoVar3.r & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                                            i2++;
                                            bfzVar = bfzVar;
                                            if (i2 == 1) {
                                                bxwVarF = bkoVar3;
                                            } else {
                                                if (bfzVar == 0) {
                                                    bfzVar = new bfz(new bko[16], 0);
                                                }
                                                if (bxwVarF != 0) {
                                                    bfzVar.o(bxwVarF);
                                                }
                                                bfzVar.o(bkoVar3);
                                                bxwVarF = 0;
                                            }
                                        }
                                        bkoVar3 = bkoVar3.u;
                                        bxwVarF = bxwVarF;
                                        bfzVar = bfzVar;
                                    }
                                    if (i2 != 1) {
                                    }
                                }
                                bxwVarF = fh.F(bfzVar);
                            }
                        }
                    }
                    bkoVar2 = bkoVar2.t;
                }
            }
            bysVarI = bysVarI.j();
            bkoVar2 = (bysVarI == null || (bzmVar = bysVarI.t) == null) ? null : bzmVar.e;
        }
    }

    @Override // defpackage.bko
    public final void cd() {
    }
}
