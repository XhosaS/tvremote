package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfm extends bfp {
    public static final bfm a = new bfm();

    private bfm() {
        super(1, 1);
    }

    @Override // defpackage.bfp
    protected final void a(bfs bfsVar, bad badVar, bdj bdjVar, bhx bhxVar, bfq bfqVar) {
        Object objC = bfsVar.c(0);
        boolean z = objC instanceof bdb;
        int iA = bfsVar.a(0);
        if (z) {
            bhxVar.f((bdb) objC);
        }
        Object objT = bdjVar.t(bdjVar.o, iA, objC);
        if (objT instanceof bdb) {
            bhxVar.d((bdb) objT);
        } else if (objT instanceof bcr) {
            ((bcr) objT).b();
        }
    }
}
