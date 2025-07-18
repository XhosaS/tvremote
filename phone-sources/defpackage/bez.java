package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bez extends bfp {
    public static final bez a = new bez();

    private bez() {
        super(1, 1);
    }

    @Override // defpackage.bfp
    protected final void a(bfs bfsVar, bad badVar, bdj bdjVar, bhx bhxVar, bfq bfqVar) {
        bac bacVar = (bac) bfsVar.c(0);
        int iA = bfsVar.a(0);
        badVar.h();
        badVar.i(iA, bdjVar.s(bdjVar.a(bacVar)));
    }

    @Override // defpackage.bfp
    protected final bac b(bfs bfsVar) {
        return (bac) bfsVar.c(0);
    }
}
