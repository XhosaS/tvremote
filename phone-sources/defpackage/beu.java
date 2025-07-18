package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class beu extends bfp {
    public static final beu a = new beu();

    private beu() {
        super(1, 2);
    }

    @Override // defpackage.bfp
    protected final void a(bfs bfsVar, bad badVar, bdj bdjVar, bhx bhxVar, bfq bfqVar) {
        Object objA = ((yjk) bfsVar.c(0)).a();
        bac bacVar = (bac) bfsVar.c(1);
        int iA = bfsVar.a(0);
        bdjVar.O(bdjVar.a(bacVar), objA);
        badVar.j(iA, objA);
        badVar.d(objA);
    }

    @Override // defpackage.bfp
    protected final bac b(bfs bfsVar) {
        return (bac) bfsVar.c(1);
    }
}
