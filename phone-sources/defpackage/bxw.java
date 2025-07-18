package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bxw extends bko {
    public final int B = bzr.b(this);
    public bko C;

    private final void bZ(int i, boolean z) {
        bko bkoVar;
        int i2 = this.r;
        this.r = i;
        if (i2 != i) {
            if (E() == this) {
                this.s = i;
            }
            if (this.A) {
                bko bkoVar2 = this.q;
                bko bkoVar3 = this;
                while (bkoVar3 != null) {
                    i |= bkoVar3.r;
                    bkoVar3.r = i;
                    if (bkoVar3 == bkoVar2) {
                        break;
                    } else {
                        bkoVar3 = bkoVar3.t;
                    }
                }
                if (z && bkoVar3 == bkoVar2) {
                    i = bzr.c(bkoVar2);
                    bkoVar2.r = i;
                }
                int i3 = 0;
                if (bkoVar3 != null && (bkoVar = bkoVar3.u) != null) {
                    i3 = bkoVar.s;
                }
                int i4 = i | i3;
                while (bkoVar3 != null) {
                    i4 |= bkoVar3.r;
                    bkoVar3.s = i4;
                    bkoVar3 = bkoVar3.t;
                }
            }
        }
    }

    @Override // defpackage.bko
    public final void G() {
        super.G();
        for (bko bkoVar = this.C; bkoVar != null; bkoVar = bkoVar.u) {
            bkoVar.M(this.w);
            if (!bkoVar.A) {
                bkoVar.G();
            }
        }
    }

    @Override // defpackage.bko
    public final void H() {
        for (bko bkoVar = this.C; bkoVar != null; bkoVar = bkoVar.u) {
            bkoVar.H();
        }
        super.H();
    }

    @Override // defpackage.bko
    public final void I() {
        super.I();
        for (bko bkoVar = this.C; bkoVar != null; bkoVar = bkoVar.u) {
            bkoVar.I();
        }
    }

    @Override // defpackage.bko
    public final void J() {
        for (bko bkoVar = this.C; bkoVar != null; bkoVar = bkoVar.u) {
            bkoVar.J();
        }
        super.J();
    }

    @Override // defpackage.bko
    public final void K() {
        super.K();
        for (bko bkoVar = this.C; bkoVar != null; bkoVar = bkoVar.u) {
            bkoVar.K();
        }
    }

    @Override // defpackage.bko
    public final void L(bko bkoVar) {
        this.q = bkoVar;
        for (bko bkoVar2 = this.C; bkoVar2 != null; bkoVar2 = bkoVar2.u) {
            bkoVar2.L(bkoVar);
        }
    }

    @Override // defpackage.bko
    public final void M(bzq bzqVar) {
        this.w = bzqVar;
        for (bko bkoVar = this.C; bkoVar != null; bkoVar = bkoVar.u) {
            bkoVar.M(bzqVar);
        }
    }

    public final void N(bxv bxvVar) {
        bko bkoVar = null;
        for (bko bkoVar2 = this.C; bkoVar2 != null; bkoVar2 = bkoVar2.u) {
            if (bkoVar2 == bxvVar) {
                if (bkoVar2.A) {
                    bzr.f(bkoVar2);
                    bkoVar2.K();
                    bkoVar2.H();
                }
                bkoVar2.L(bkoVar2);
                bkoVar2.s = 0;
                if (bkoVar == null) {
                    this.C = bkoVar2.u;
                } else {
                    bkoVar.u = bkoVar2.u;
                }
                bkoVar2.u = null;
                bkoVar2.t = null;
                int i = this.r;
                int iC = bzr.c(this);
                bZ(iC, true);
                if (this.A && (i & 2) != 0 && (iC & 2) == 0) {
                    bzm bzmVar = fh.I(this).t;
                    this.q.M(null);
                    bzmVar.i();
                    return;
                }
                return;
            }
            bkoVar = bkoVar2;
        }
        Objects.toString(bxvVar);
        throw new IllegalStateException("Could not find delegate: ".concat(String.valueOf(bxvVar)));
    }

    public final void O(bxv bxvVar) {
        bko bkoVarE = bxvVar.E();
        if (bkoVarE != bxvVar) {
            if (true != (bxvVar instanceof bko)) {
                bxvVar = null;
            }
            bko bkoVar = bxvVar != null ? ((bko) bxvVar).t : null;
            if (bkoVarE != this.q || !yks.e(bkoVar, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
            return;
        }
        if (bkoVarE.A) {
            bty.c("Cannot delegate to an already attached node");
        }
        bkoVarE.L(this.q);
        int i = this.r;
        int iC = bzr.c(bkoVarE);
        bkoVarE.r = iC;
        int i2 = iC & 2;
        int i3 = this.r;
        if (i2 != 0 && (i3 & 2) != 0 && !(this instanceof byl)) {
            bty.c(a.ck(bkoVarE, this, "Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: ", "\nDelegate Node: "));
        }
        bkoVarE.u = this.C;
        this.C = bkoVarE;
        bkoVarE.t = this;
        bZ(iC | this.r, false);
        if (this.A) {
            if (i2 == 0 || (i & 2) != 0) {
                M(this.w);
            } else {
                bzm bzmVar = fh.I(this).t;
                this.q.M(null);
                bzmVar.i();
            }
            bkoVarE.G();
            bkoVarE.J();
            bzr.d(bkoVarE);
        }
    }
}
