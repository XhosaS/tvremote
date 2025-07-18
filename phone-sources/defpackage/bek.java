package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bek extends bfp {
    public static final bek a = new bek();

    private bek() {
        super(0, 4, 1);
    }

    @Override // defpackage.bfp
    protected final void a(bfs bfsVar, bad badVar, bdj bdjVar, bhx bhxVar, bfq bfqVar) {
        bca bcaVar = (bca) bfsVar.c(2);
        bca bcaVar2 = (bca) bfsVar.c(3);
        baw bawVar = (baw) bfsVar.c(1);
        cb cbVarS = (cb) bfsVar.c(0);
        if (cbVarS == null && (cbVarS = bawVar.s(bcaVar)) == null) {
            bau.g("Could not resolve state for movable content");
            throw new yfs();
        }
        if (bdjVar.m > 0 || bdjVar.i(bdjVar.o + 1) != 1) {
            bau.i("Check failed");
        }
        Object obj = cbVarS.a;
        int i = bdjVar.o;
        int i2 = bdjVar.h;
        int i3 = bdjVar.i;
        bdjVar.u(1);
        bdjVar.J();
        bdjVar.v();
        bdj bdjVarC = ((bdg) obj).c();
        try {
            List listJ = bdi.j(bdjVarC, 2, bdjVar, false, true, true);
            bdjVarC.w(true);
            bdjVar.x();
            bdjVar.U();
            bdjVar.o = i;
            bdjVar.h = i2;
            bdjVar.i = i3;
            bdi.o(bdjVar, listJ, bcaVar2.g);
        } catch (Throwable th) {
            bdjVarC.w(false);
            throw th;
        }
    }
}
