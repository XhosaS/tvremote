package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asm {
    private static final bcp b = new bdz(new anu(17));
    public static final bcp a = new bdz(new anu(18));

    public static final void a(arl arlVar, ath athVar, auq auqVar, axg axgVar, yjz yjzVar, bao baoVar, int i) {
        int i2;
        axg axgVar2;
        yjz yjzVar2;
        arl arlVar2;
        ath athVar2;
        auq auqVar2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(1317329884);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(arlVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(athVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(auqVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            axgVar2 = axgVar;
            i2 |= true != baoVarD.F(axgVar2) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        } else {
            axgVar2 = axgVar;
        }
        if ((i & 24576) == 0) {
            yjzVar2 = yjzVar;
            i2 |= true != baoVarD.H(yjzVar2) ? 8192 : 16384;
        } else {
            yjzVar2 = yjzVar;
        }
        if (baoVarD.L((i2 & 9363) != 9362, i2 & 1)) {
            bcp bcpVar = b;
            if (((Boolean) baoVarD.f(bcpVar)).booleanValue()) {
                baoVarD.x(1458701438);
                if (arlVar == null) {
                    baoVarD.x(-1061321529);
                    arl arlVarK = wv.K(baoVarD);
                    ((bas) baoVarD).aa();
                    arlVar2 = arlVarK;
                } else {
                    baoVarD.x(-1061322428);
                    ((bas) baoVarD).aa();
                    arlVar2 = arlVar;
                }
                if (athVar == null) {
                    baoVarD.x(-1061319288);
                    ath athVarL = wv.L(baoVarD);
                    ((bas) baoVarD).aa();
                    athVar2 = athVarL;
                } else {
                    baoVarD.x(-1061320218);
                    ((bas) baoVarD).aa();
                    athVar2 = athVar;
                }
                baoVarD.x(-1061318014);
                bas basVar = (bas) baoVarD;
                basVar.aa();
                if (auqVar == null) {
                    baoVarD.x(-1061315326);
                    auq auqVarM = wv.M(baoVarD);
                    basVar.aa();
                    auqVar2 = auqVarM;
                } else {
                    baoVarD.x(-1061316070);
                    basVar.aa();
                    auqVar2 = auqVar;
                }
                b(arlVar2, athVar2, auqVar2, axgVar2, yjzVar2, baoVarD, i2 & 57344);
                basVar.aa();
            } else {
                baoVarD.x(1459038005);
                bcm.i(bcpVar.c(true), bga.k(1535649272, new asl(arlVar, athVar, auqVar, axgVar, yjzVar, 0), baoVarD), baoVarD, 56);
                ((bas) baoVarD).aa();
            }
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new sx(arlVar, athVar, auqVar, axgVar, yjzVar, i, 3);
        }
    }

    public static final void b(arl arlVar, ath athVar, auq auqVar, axg axgVar, yjz yjzVar, bao baoVar, int i) {
        int i2;
        char c;
        char c2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(904511636);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(arlVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(athVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(auqVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.F(axgVar) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i & 24576) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 8192 : 16384;
        }
        if (baoVarD.L((i2 & 9363) != 9362, i2 & 1)) {
            baoVarD.u();
            if ((i & 1) != 0 && !baoVarD.I()) {
                baoVarD.t();
            }
            baoVarD.m();
            rs rsVarA = atn.a(false, 0.0f, 7);
            long j = arlVar.a;
            boolean zE = baoVarD.E(j);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (zE || objT == ban.a) {
                c = 1;
                c2 = 4;
                objT = new ank(j, bny.k(bnq.d(j), bnq.c(j), bnq.b(j), 0.4f, bnq.f(j)));
                basVar.ae(objT);
            } else {
                c = 1;
                c2 = 4;
            }
            bcq[] bcqVarArr = new bcq[6];
            bcqVarArr[0] = arm.a.c(arlVar);
            bcqVarArr[c] = a.c(athVar);
            bcqVarArr[2] = rp.a.c(rsVarA);
            bcqVarArr[3] = aur.a.c(auqVar);
            bcqVarArr[c2] = anl.a.c((ank) objT);
            bcqVarArr[5] = axh.a.c(axgVar);
            bcm.j(bcqVarArr, bga.k(-1750539308, new acv(axgVar, yjzVar, 17, null), baoVarD), baoVarD, 56);
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new sx(arlVar, athVar, auqVar, axgVar, yjzVar, i, 2);
        }
    }
}
