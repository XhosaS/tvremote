package defpackage;

import android.support.v7.appcompat.R;
import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pov {
    public static final pov a = new pov();

    private pov() {
    }

    public final void a(final avn avnVar, bkp bkpVar, final auy auyVar, yjz yjzVar, float f, float f2, bao baoVar, final int i) {
        int i2;
        bkp bkpVar2;
        float f3;
        final float f4;
        yjz yjzVar2;
        final float f5;
        final bkp bkpVar3;
        final yjz yjzVar3;
        bao baoVarD = baoVar.d(-376000574);
        boolean z = true;
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? baoVarD.F(avnVar) : baoVarD.H(avnVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= true != baoVarD.G(true) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != baoVarD.F(auyVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= 8192;
        }
        int i4 = i3 | 1769472;
        if ((12582912 & i) == 0) {
            i4 |= true != baoVarD.F(this) ? 4194304 : 8388608;
        }
        if ((4793491 & i4) == 4793490 && baoVarD.K()) {
            baoVarD.t();
            bkpVar3 = bkpVar;
            yjzVar3 = yjzVar;
            f5 = f;
            f4 = f2;
        } else {
            int i5 = (-57345) & i4;
            baoVarD.u();
            if ((i & 1) == 0 || baoVarD.I()) {
                bkpVar2 = bkp.g;
                baoVarD.x(-1633490746);
                boolean z2 = (i4 & 896) == 256;
                if ((((i4 & 7168) ^ 3072) <= 2048 || !baoVarD.F(auyVar)) && (i4 & 3072) != 2048) {
                    z = false;
                }
                boolean z3 = z | z2;
                bas basVar = (bas) baoVarD;
                Object objT = basVar.T();
                if (z3 || objT == ban.a) {
                    objT = new xa(auyVar, 19);
                    basVar.ae(objT);
                }
                basVar.aa();
                f3 = pox.b;
                f4 = pox.c;
                yjzVar2 = (yjz) objT;
            } else {
                baoVarD.t();
                bkpVar2 = bkpVar;
                yjzVar2 = yjzVar;
                f3 = f;
                f4 = f2;
            }
            baoVarD.m();
            int i6 = i5 << 3;
            int i7 = (i4 & 7168) | (i4 & 14) | 100663304 | (i4 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i4 & 896) | (3670016 & i6) | (i6 & 29360128);
            bkp bkpVar4 = bkpVar2;
            f5 = f3;
            ave.a.c(avnVar, bkpVar4, auyVar, yjzVar2, null, f5, f4, baoVarD, i7);
            bkpVar3 = bkpVar4;
            yjzVar3 = yjzVar2;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new yjz() { // from class: pou
                @Override // defpackage.yjz
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    pov povVar = this.a;
                    avn avnVar2 = avnVar;
                    bkp bkpVar5 = bkpVar3;
                    auy auyVar2 = auyVar;
                    yjz yjzVar4 = yjzVar3;
                    float f6 = f5;
                    povVar.a(avnVar2, bkpVar5, auyVar2, yjzVar4, f6, f4, (bao) obj, bdi.n(i | 1));
                    return ygi.a;
                }
            };
        }
    }

    public final void b(kw kwVar, bkp bkpVar, auy auyVar, long j, bao baoVar, int i) {
        int i2;
        pov povVar;
        long j2;
        long j3;
        kwVar.getClass();
        bao baoVarD = baoVar.d(1538905591);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.F(kwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(auyVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.G(true) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        int i3 = i2 | 24576;
        if ((i & 196608) == 0) {
            povVar = this;
            i3 |= true != baoVarD.F(povVar) ? 65536 : 131072;
        } else {
            povVar = this;
        }
        if ((74899 & i3) == 74898 && baoVarD.K()) {
            baoVarD.t();
            j3 = j;
        } else {
            baoVarD.u();
            if ((i & 1) == 0 || baoVarD.I()) {
                j2 = pox.a;
            } else {
                baoVarD.t();
                j2 = j;
            }
            baoVarD.m();
            int i4 = i3 & 7168;
            ave.a.e(kwVar, bkpVar, auyVar, j2, baoVarD, (i3 & 14) | 196608 | (i3 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i3 & 896) | i4 | (i3 & 57344));
            j3 = j2;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new ava(povVar, kwVar, bkpVar, auyVar, j3, i, 3);
        }
    }
}
