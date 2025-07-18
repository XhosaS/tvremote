package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class beh extends bfp {
    public static final beh a = new beh();

    private beh() {
        super(0, 2, 1);
    }

    @Override // defpackage.bfp
    protected final void a(bfs bfsVar, bad badVar, bdj bdjVar, bhx bhxVar, bfq bfqVar) {
        bac bacVar = (bac) bfsVar.c(0);
        Object objC = bfsVar.c(1);
        if (objC instanceof bdb) {
            bhxVar.f((bdb) objC);
        }
        if (bdjVar.m != 0) {
            bau.i("Can only append a slot if not current inserting");
        }
        int i = bdjVar.h;
        int i2 = bdjVar.i;
        int iA = bdjVar.a(bacVar);
        int iC = bdjVar.c(bdjVar.b, bdjVar.g(iA + 1));
        bdjVar.h = iC;
        bdjVar.i = iC;
        bdjVar.C(1, iA);
        if (i >= iC) {
            i++;
            i2++;
        }
        bdjVar.c[iC] = objC;
        bdjVar.h = i;
        bdjVar.i = i2;
    }
}
