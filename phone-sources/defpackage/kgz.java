package defpackage;

import android.support.v7.appcompat.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kgz {
    public static final kgz a = new kgz();

    private kgz() {
    }

    public final void a(String str, yjk yjkVar, bkp bkpVar, yjz yjzVar, bao baoVar, int i) {
        int i2;
        bkp bkpVar2;
        yjz yjzVar2;
        str.getClass();
        yjkVar.getClass();
        bao baoVarD = baoVar.d(1779020606);
        if ((i & 6) == 0) {
            i2 = i | (true != baoVarD.F(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjkVar) ? 16 : 32;
        }
        int i3 = i2 | 3456;
        if ((i3 & 1171) == 1170 && baoVarD.K()) {
            baoVarD.t();
            bkpVar2 = bkpVar;
            yjzVar2 = yjzVar;
        } else {
            bkm bkmVar = bkp.g;
            yjz yjzVar3 = kgw.a;
            ppb ppbVar = ppb.a;
            yy yyVar = pog.a;
            int i4 = i3 >> 3;
            ppbVar.d(yjkVar, bkmVar, false, null, pog.b(wv.K(baoVarD).j, wv.K(baoVarD).k, baoVarD, 12), null, null, bga.k(1340620954, new azi(yjzVar3, str, 5, null), baoVarD), baoVarD, (i4 & 14) | 805306368 | (i4 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0);
            bkpVar2 = bkmVar;
            yjzVar2 = yjzVar3;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new sx(this, str, yjkVar, bkpVar2, yjzVar2, i, 8);
        }
    }

    public final void b(yjv yjvVar, boolean z, bkp bkpVar, bao baoVar, int i) {
        int i2;
        bkp bkpVar2;
        yjvVar.getClass();
        bao baoVarD = baoVar.d(1854985777);
        if ((i & 6) == 0) {
            i2 = i | (true != baoVarD.H(yjvVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.G(z) ? 16 : 32;
        }
        int i3 = i2 | 384;
        if ((i3 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
            bkpVar2 = bkpVar;
        } else {
            bkm bkmVar = bkp.g;
            ppb ppbVar = ppb.a;
            yy yyVar = pog.a;
            arb arbVarB = pog.b(wv.K(baoVarD).j, wv.K(baoVarD).k, baoVarD, 12);
            baoVarD.x(-1633490746);
            boolean z2 = (i3 & 14) == 4;
            boolean z3 = (i3 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32;
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if ((z2 | z3) || objT == ban.a) {
                objT = new avf(yjvVar, z, 3);
                basVar.ae(objT);
            }
            basVar.aa();
            ppbVar.e(z, (yjv) objT, bkmVar, false, null, arbVarB, null, null, bga.k(800201051, new kgy(z), baoVarD), baoVarD, (i3 & 896) | ((i3 >> 3) & 14), 6);
            bkpVar2 = bkmVar;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new jwv(this, yjvVar, z, bkpVar2, i, 3);
        }
    }
}
