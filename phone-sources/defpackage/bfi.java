package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfi extends bfp {
    public static final bfi a = new bfi();

    private bfi() {
        super(1, 0, 2);
    }

    @Override // defpackage.bfp
    protected final void a(bfs bfsVar, bad badVar, bdj bdjVar, bhx bhxVar, bfq bfqVar) {
        int iA = bfsVar.a(0);
        int i = bdjVar.q;
        int iN = bdjVar.n(i);
        int iC = bdjVar.c(bdjVar.b, bdjVar.g(i + 1));
        for (int iMax = Math.max(iN, iC - iA); iMax < iC; iMax++) {
            Object obj = bdjVar.c[bdjVar.d(iMax)];
            if (obj instanceof bdb) {
                bhxVar.d((bdb) obj);
            } else if (obj instanceof bcr) {
                ((bcr) obj).b();
            }
        }
        if (iA <= 0) {
            bau.i("Check failed");
        }
        int i2 = bdjVar.q;
        int iM = bdjVar.m(bdjVar.b, bdjVar.g(i2));
        int iC2 = bdjVar.c(bdjVar.b, bdjVar.g(i2 + 1)) - iA;
        if (iC2 < iM) {
            bau.i("Check failed");
        }
        bdjVar.G(iC2, iA, i2);
        int i3 = bdjVar.h;
        if (i3 >= iM) {
            bdjVar.h = i3 - iA;
        }
    }
}
