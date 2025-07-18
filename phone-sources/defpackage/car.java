package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class car extends cao {
    public static car b;
    public cgz c;
    public cff d;

    public car() {
        new Rect();
    }

    private final int e(int i, int i2) {
        cgz cgzVar = this.c;
        cgz cgzVar2 = null;
        if (cgzVar == null) {
            yks.c("layoutResult");
            cgzVar = null;
        }
        int i3 = cgzVar.i(i);
        cgz cgzVar3 = this.c;
        if (cgzVar3 == null) {
            yks.c("layoutResult");
            cgzVar3 = null;
        }
        if (i2 != cgzVar3.s(i3)) {
            cgz cgzVar4 = this.c;
            if (cgzVar4 == null) {
                yks.c("layoutResult");
            } else {
                cgzVar2 = cgzVar4;
            }
            return cgzVar2.i(i);
        }
        cgz cgzVar5 = this.c;
        if (cgzVar5 == null) {
            yks.c("layoutResult");
        } else {
            cgzVar2 = cgzVar5;
        }
        return cgzVar2.f(i, false) - 1;
    }

    @Override // defpackage.cat
    public final int[] c(int i) {
        int iE;
        cgz cgzVar = null;
        if (a().length() > 0 && i < a().length()) {
            try {
                cff cffVar = this.d;
                if (cffVar == null) {
                    yks.c("node");
                    cffVar = null;
                }
                bmy bmyVarC = cffVar.c();
                int iRound = Math.round(bmyVarC.e - bmyVarC.c);
                int iJ = ykn.j(0, i);
                cgz cgzVar2 = this.c;
                if (cgzVar2 == null) {
                    yks.c("layoutResult");
                    cgzVar2 = null;
                }
                int iG = cgzVar2.g(iJ);
                cgz cgzVar3 = this.c;
                if (cgzVar3 == null) {
                    yks.c("layoutResult");
                    cgzVar3 = null;
                }
                float fD = cgzVar3.d(iG) + iRound;
                cgz cgzVar4 = this.c;
                if (cgzVar4 == null) {
                    yks.c("layoutResult");
                    cgzVar4 = null;
                }
                cgz cgzVar5 = this.c;
                if (cgzVar5 == null) {
                    yks.c("layoutResult");
                    cgzVar5 = null;
                }
                if (fD < cgzVar4.d(cgzVar5.e() - 1)) {
                    cgz cgzVar6 = this.c;
                    if (cgzVar6 == null) {
                        yks.c("layoutResult");
                    } else {
                        cgzVar = cgzVar6;
                    }
                    iE = cgzVar.h(fD);
                } else {
                    cgz cgzVar7 = this.c;
                    if (cgzVar7 == null) {
                        yks.c("layoutResult");
                    } else {
                        cgzVar = cgzVar7;
                    }
                    iE = cgzVar.e();
                }
                return b(iJ, e(iE - 1, 1) + 1);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.cat
    public final int[] d(int i) {
        int iH;
        cgz cgzVar = null;
        if (a().length() > 0 && i > 0) {
            try {
                cff cffVar = this.d;
                if (cffVar == null) {
                    yks.c("node");
                    cffVar = null;
                }
                bmy bmyVarC = cffVar.c();
                int iRound = Math.round(bmyVarC.e - bmyVarC.c);
                int iK = ykn.k(a().length(), i);
                cgz cgzVar2 = this.c;
                if (cgzVar2 == null) {
                    yks.c("layoutResult");
                    cgzVar2 = null;
                }
                int iG = cgzVar2.g(iK);
                cgz cgzVar3 = this.c;
                if (cgzVar3 == null) {
                    yks.c("layoutResult");
                    cgzVar3 = null;
                }
                float fD = cgzVar3.d(iG) - iRound;
                if (fD > 0.0f) {
                    cgz cgzVar4 = this.c;
                    if (cgzVar4 == null) {
                        yks.c("layoutResult");
                    } else {
                        cgzVar = cgzVar4;
                    }
                    iH = cgzVar.h(fD);
                } else {
                    iH = 0;
                }
                if (iK == a().length() && iH < iG) {
                    iH++;
                }
                return b(e(iH, 2), iK);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }
}
