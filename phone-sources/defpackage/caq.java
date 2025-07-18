package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class caq extends cao {
    public static caq b;
    public cgz c;

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
        int iG;
        if (a().length() > 0 && i < a().length()) {
            if (i < 0) {
                cgz cgzVar = this.c;
                if (cgzVar == null) {
                    yks.c("layoutResult");
                    cgzVar = null;
                }
                iG = cgzVar.g(0);
            } else {
                cgz cgzVar2 = this.c;
                if (cgzVar2 == null) {
                    yks.c("layoutResult");
                    cgzVar2 = null;
                }
                int iG2 = cgzVar2.g(i);
                iG = e(iG2, 2) == i ? iG2 : iG2 + 1;
            }
            cgz cgzVar3 = this.c;
            if (cgzVar3 == null) {
                yks.c("layoutResult");
                cgzVar3 = null;
            }
            if (iG < cgzVar3.e()) {
                return b(e(iG, 2), e(iG, 1) + 1);
            }
        }
        return null;
    }

    @Override // defpackage.cat
    public final int[] d(int i) {
        int iG;
        if (a().length() > 0 && i > 0) {
            if (i > a().length()) {
                cgz cgzVar = this.c;
                if (cgzVar == null) {
                    yks.c("layoutResult");
                    cgzVar = null;
                }
                iG = cgzVar.g(a().length());
            } else {
                cgz cgzVar2 = this.c;
                if (cgzVar2 == null) {
                    yks.c("layoutResult");
                    cgzVar2 = null;
                }
                int iG2 = cgzVar2.g(i);
                iG = e(iG2, 1) + 1 == i ? iG2 : iG2 - 1;
            }
            if (iG >= 0) {
                return b(e(iG, 2), e(iG, 1) + 1);
            }
        }
        return null;
    }
}
