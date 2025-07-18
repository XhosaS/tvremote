package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfe extends bfp {
    public static final bfe a = new bfe();

    private bfe() {
        super(0, 0, 3);
    }

    @Override // defpackage.bfp
    protected final void a(bfs bfsVar, bad badVar, bdj bdjVar, bhx bhxVar, bfq bfqVar) {
        if (bdjVar.m != 0) {
            bau.i("Cannot reset when inserting");
        }
        bdjVar.F();
        bdjVar.o = 0;
        bdjVar.p = bdjVar.e() - bdjVar.g;
        bdjVar.h = 0;
        bdjVar.i = 0;
        bdjVar.n = 0;
    }
}
