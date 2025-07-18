package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bew extends bfp {
    public static final bew a = new bew();

    private bew() {
        super(0, 3, 1);
    }

    @Override // defpackage.bfp
    protected final void a(bfs bfsVar, bad badVar, bdj bdjVar, bhx bhxVar, bfq bfqVar) {
        bfr bfrVar;
        bdg bdgVar = (bdg) bfsVar.c(1);
        bac bacVar = (bac) bfsVar.c(0);
        bef befVar = (bef) bfsVar.c(2);
        bdj bdjVarC = bdgVar.c();
        if (bfqVar != null) {
            try {
                bfrVar = new bfr(bfqVar, bdjVar);
            } catch (Throwable th) {
                bdjVarC.w(false);
                throw th;
            }
        } else {
            bfrVar = null;
        }
        if (!befVar.b.cD()) {
            bau.i("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        befVar.a.cF(badVar, bdjVarC, bhxVar, bfrVar);
        bdjVarC.w(true);
        bdjVar.v();
        bdjVar.W(bdgVar, bdgVar.a(bacVar));
        bdjVar.x();
    }
}
