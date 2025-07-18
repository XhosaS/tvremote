package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bem extends bfp {
    public static final bem a = new bem();

    private bem() {
        super(0, 2, 1);
    }

    @Override // defpackage.bfp
    protected final void a(bfs bfsVar, bad badVar, bdj bdjVar, bhx bhxVar, bfq bfqVar) {
        int i;
        bhr bhrVar = (bhr) bfsVar.c(0);
        int iA = bdjVar.a((bac) bfsVar.c(1));
        if (bdjVar.o >= iA) {
            bau.i("Check failed");
        }
        a.bQ(bdjVar, badVar, iA);
        int i2 = bdjVar.o;
        int iK = bdjVar.q;
        while (iK >= 0 && !bdjVar.Q(iK)) {
            iK = bdjVar.k(iK);
        }
        int i3 = iK + 1;
        int iL = 0;
        while (i3 < i2) {
            if (bdjVar.P(i2, i3)) {
                if (true == bdjVar.Q(i3)) {
                    iL = 0;
                }
                i3++;
            } else {
                iL += bdjVar.Q(i3) ? 1 : bdjVar.j(i3);
                i3 += bdjVar.i(i3);
            }
        }
        while (true) {
            i = bdjVar.o;
            if (i >= iA) {
                break;
            }
            if (bdjVar.P(iA, i)) {
                int i4 = bdjVar.o;
                if (i4 < bdjVar.p && (bdjVar.b[(bdjVar.g(i4) * 5) + 1] & 1073741824) != 0) {
                    badVar.d(bdjVar.s(i4));
                    iL = 0;
                }
                bdjVar.J();
            } else {
                iL += bdjVar.l();
            }
        }
        if (i != iA) {
            bau.i("Check failed");
        }
        bhrVar.a = iL;
    }
}
