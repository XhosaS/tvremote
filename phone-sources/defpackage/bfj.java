package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfj extends bfp {
    public static final bfj a = new bfj();

    private bfj() {
        super(1, 2);
    }

    @Override // defpackage.bfp
    protected final void a(bfs bfsVar, bad badVar, bdj bdjVar, bhx bhxVar, bfq bfqVar) {
        Object objC = bfsVar.c(0);
        bac bacVar = (bac) bfsVar.c(1);
        boolean z = objC instanceof bdb;
        int iA = bfsVar.a(0);
        if (z) {
            bhxVar.f((bdb) objC);
        }
        Object objT = bdjVar.t(bdjVar.a(bacVar), iA, objC);
        if (objT instanceof bdb) {
            bhxVar.d((bdb) objT);
        } else if (objT instanceof bcr) {
            ((bcr) objT).b();
        }
    }
}
