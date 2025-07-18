package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kov {
    public static final kov a = new kov();

    private kov() {
    }

    public final void a(yjk yjkVar, String str, bkp bkpVar, int i, bao baoVar, int i2) {
        yjk yjkVar2;
        int i3;
        yjkVar.getClass();
        int i4 = i2 & 6;
        bao baoVarD = baoVar.d(-1499247825);
        if (i4 == 0) {
            yjkVar2 = yjkVar;
            i3 = (true != baoVarD.H(yjkVar2) ? 2 : 4) | i2;
        } else {
            yjkVar2 = yjkVar;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != baoVarD.F(str) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != baoVarD.F(bkpVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != baoVarD.D(i) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != baoVarD.F(this) ? 8192 : 16384;
        }
        int i5 = i3;
        if ((i5 & 9363) == 9362 && baoVarD.K()) {
            baoVarD.t();
        } else {
            baoVarD.u();
            if ((i2 & 1) != 0 && !baoVarD.I()) {
                baoVarD.t();
            }
            baoVarD.m();
            bkp bkpVarL = ht.l(bga.w(bkpVar, aep.a(24.0f)), 1.5f, wv.K(baoVarD).B, aep.a(24.0f));
            yy yyVar = arc.a;
            og.M(yjkVar2, bkpVarL, false, null, arc.b(bnq.f, 0L, 0L, 0L, baoVarD, 14), null, null, null, null, bga.k(-1809929921, new dnu(i, str, 2), baoVarD), baoVarD, (i5 & 14) | 805306368, 492);
            baoVarD = baoVarD;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new khg(this, yjkVar, str, bkpVar, i, i2, 6);
        }
    }
}
