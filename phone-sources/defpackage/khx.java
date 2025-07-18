package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class khx {
    public static final khx a = new khx();

    private khx() {
    }

    public final void a(yjk yjkVar, kiq kiqVar, bao baoVar, int i) {
        int i2;
        bao baoVar2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(1503258660);
        if (i3 == 0) {
            i2 = i | (true != baoVarD.H(yjkVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? baoVarD.F(kiqVar) : baoVarD.H(kiqVar)) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
            baoVar2 = baoVarD;
        } else {
            baoVar2 = baoVarD;
            rdd.w(bkp.g.a(zi.c), null, null, khw.b, null, 0, 0L, 0L, null, bga.k(-235617741, new azi(kiqVar, yjkVar, 6), baoVarD), baoVar2, 805309446);
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kbe(this, yjkVar, kiqVar, i, 20, null);
        }
    }
}
