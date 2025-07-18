package defpackage;

import android.support.v7.widget.RecyclerView;
import androidx.compose.foundation.layout.AspectRatioElement;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class khh {
    public static final khh a = new khh();

    private khh() {
    }

    public final void a(xr xrVar, yjk yjkVar, bkp bkpVar, bao baoVar, int i, int i2) {
        int i3;
        yjkVar.getClass();
        int i4 = i & 6;
        bao baoVarD = baoVar.d(-1268050575);
        if (i4 == 0) {
            i3 = (true != baoVarD.F(xrVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != baoVarD.H(yjkVar) ? 16 : 32;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= true != baoVarD.F(bkpVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != baoVarD.F(this) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i3 & 1171) == 1170 && baoVarD.K()) {
            baoVarD.t();
        } else {
            if (i5 != 0) {
                bkpVar = bkp.g;
            }
            f(R.drawable.gs_keyboard_arrow_down_wght700fill1rond100_vd_theme_24, yjkVar, xrVar.a(bkpVar, bkb.h), baoVarD, (i3 & android.support.v7.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i3 << 3) & 57344));
        }
        bkp bkpVar2 = bkpVar;
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new khg(this, xrVar, yjkVar, bkpVar2, i, i2, 0);
        }
    }

    public final void b(xr xrVar, yjk yjkVar, bkp bkpVar, bao baoVar, int i, int i2) {
        int i3;
        yjkVar.getClass();
        int i4 = i & 6;
        bao baoVarD = baoVar.d(2112186220);
        if (i4 == 0) {
            i3 = (true != baoVarD.F(xrVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != baoVarD.H(yjkVar) ? 16 : 32;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= true != baoVarD.F(bkpVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != baoVarD.F(this) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i3 & 1171) == 1170 && baoVarD.K()) {
            baoVarD.t();
        } else {
            if (i5 != 0) {
                bkpVar = bkp.g;
            }
            f(R.drawable.gs_keyboard_arrow_left_wght700fill1rond100_vd_theme_24, yjkVar, xrVar.a(bkpVar, bkb.d), baoVarD, (i3 & android.support.v7.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i3 << 3) & 57344));
        }
        bkp bkpVar2 = bkpVar;
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new khg(this, xrVar, yjkVar, bkpVar2, i, i2, 4);
        }
    }

    public final void c(xr xrVar, yjk yjkVar, bkp bkpVar, bao baoVar, int i, int i2) {
        int i3;
        yjkVar.getClass();
        int i4 = i & 6;
        bao baoVarD = baoVar.d(1503980163);
        if (i4 == 0) {
            i3 = (true != baoVarD.F(xrVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != baoVarD.H(yjkVar) ? 16 : 32;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= true != baoVarD.F(bkpVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != baoVarD.F(this) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i3 & 1171) == 1170 && baoVarD.K()) {
            baoVarD.t();
        } else {
            if (i5 != 0) {
                bkpVar = bkp.g;
            }
            f(R.drawable.gs_keyboard_arrow_right_wght700fill1rond100_vd_theme_24, yjkVar, xrVar.a(bkpVar, bkb.f), baoVarD, (i3 & android.support.v7.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i3 << 3) & 57344));
        }
        bkp bkpVar2 = bkpVar;
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new khg(this, xrVar, yjkVar, bkpVar2, i, i2, 2);
        }
    }

    public final void d(xr xrVar, yjk yjkVar, bkp bkpVar, bao baoVar, int i, int i2) {
        int i3;
        yjkVar.getClass();
        int i4 = i & 6;
        bao baoVarD = baoVar.d(1510405336);
        if (i4 == 0) {
            i3 = (true != baoVarD.F(xrVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != baoVarD.H(yjkVar) ? 16 : 32;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= true != baoVarD.F(bkpVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != baoVarD.F(this) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i3 & 1171) == 1170 && baoVarD.K()) {
            baoVarD.t();
        } else {
            if (i5 != 0) {
                bkpVar = bkp.g;
            }
            f(R.drawable.gs_keyboard_arrow_up_wght700fill1rond100_vd_theme_24, yjkVar, xrVar.a(bkpVar, bkb.b), baoVarD, (i3 & android.support.v7.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i3 << 3) & 57344));
        }
        bkp bkpVar2 = bkpVar;
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new khg(this, xrVar, yjkVar, bkpVar2, i, i2, 3);
        }
    }

    public final void e(xr xrVar, yjk yjkVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        long j;
        long j2;
        bkp bkpVar2;
        yjkVar.getClass();
        int i3 = i & 6;
        bao baoVarD = baoVar.d(995290251);
        if (i3 == 0) {
            i2 = i | (true != baoVarD.F(xrVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjkVar) ? 16 : 32;
        }
        int i4 = i2 | 384;
        if ((i4 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
            bkpVar2 = bkpVar;
        } else {
            bkm bkmVar = bkp.g;
            baoVarD.x(1849434622);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (objT == ban.a) {
                objT = new kw((byte[]) null, (byte[]) null);
                basVar.ae(objT);
            }
            kw kwVar = (kw) objT;
            basVar.aa();
            bdy bdyVarBH = a.bH(kwVar, baoVarD, 6);
            bkp bkpVarA = zi.a(xrVar.a(bkmVar, bkb.e), 0.49f).a(new AspectRatioElement(1.0f));
            float f = true != ((Boolean) bdyVarBH.a()).booleanValue() ? 2.0f : 4.0f;
            if (((Boolean) bdyVarBH.a()).booleanValue()) {
                baoVarD.x(-1761855884);
                j = wv.K(baoVarD).A;
                basVar.aa();
            } else {
                baoVarD.x(-1761783003);
                j = wv.K(baoVarD).J;
                basVar.aa();
            }
            aeh aehVar = aep.a;
            bkp bkpVarW = bga.w(ht.l(bkpVarA, f, j, aehVar), aehVar);
            yy yyVar = pog.a;
            if (((Boolean) bdyVarBH.a()).booleanValue()) {
                baoVarD.x(-1761520495);
                j2 = wv.K(baoVarD).u;
                basVar.aa();
            } else {
                baoVarD.x(-1761445103);
                j2 = wv.K(baoVarD).r;
                basVar.aa();
            }
            qtl.aj(yjkVar, bkpVarW, false, null, pog.b(j2, 0L, baoVarD, 14), null, null, null, kwVar, khc.a, baoVarD, ((i4 >> 3) & 14) | 905969664, 236);
            bkpVar2 = bkmVar;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new ahm((Object) this, xrVar, (Object) yjkVar, bkpVar2, i, 16);
        }
    }

    public final void f(int i, yjk yjkVar, bkp bkpVar, bao baoVar, int i2) {
        int i3;
        yjk yjkVar2;
        bao baoVarD = baoVar.d(912053089);
        if ((i2 & 6) == 0) {
            i3 = (true != baoVarD.D(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            yjkVar2 = yjkVar;
            i3 |= true != baoVarD.H(yjkVar2) ? 16 : 32;
        } else {
            yjkVar2 = yjkVar;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != baoVarD.F(bkpVar) ? 128 : 256;
        }
        int i4 = i3 | 3072;
        if ((i4 & 1171) == 1170 && baoVarD.K()) {
            baoVarD.t();
        } else {
            baoVarD.x(1849434622);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (objT == ban.a) {
                objT = new kw((byte[]) null, (byte[]) null);
                basVar.ae(objT);
            }
            kw kwVar = (kw) objT;
            basVar.aa();
            rdd.C(yjkVar2, zi.d(bkpVar, 64.0f), false, null, kwVar, null, bga.k(-963768577, new abb(i, a.bH(kwVar, baoVarD, 6), 2), baoVarD), baoVarD, ((i4 >> 3) & 14) | 1597440, 44);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new adj(this, i, yjkVar, bkpVar, i2, 5);
        }
    }
}
