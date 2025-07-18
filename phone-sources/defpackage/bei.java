package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bei extends bfp {
    public static final bei a = new bei();

    private bei() {
        super(0, 2, 1);
    }

    @Override // defpackage.bfp
    protected final void a(bfs bfsVar, bad badVar, bdj bdjVar, bhx bhxVar, bfq bfqVar) {
        bhr bhrVar = (bhr) bfsVar.c(1);
        int i = bhrVar != null ? bhrVar.a : 0;
        bed bedVar = (bed) bfsVar.c(0);
        if (i > 0) {
            badVar = new bcc(badVar, i);
        }
        bedVar.cF(badVar, bdjVar, bhxVar, bfqVar != null ? new bfr(bfqVar, bdjVar) : null);
    }
}
