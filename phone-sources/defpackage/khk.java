package defpackage;

import android.content.Context;
import android.support.v7.appcompat.R;
import android.support.v7.widget.RecyclerView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class khk {
    public static final khk a = new khk();
    private static final yy b = new za(12.0f, 8.0f, 12.0f, 8.0f);
    private static final float c = 24.0f;

    private khk() {
    }

    public final void c(yjk yjkVar, bkp bkpVar, bao baoVar, int i) {
        yjk yjkVar2;
        int i2;
        Object obj;
        bkp bkpVar2;
        yjkVar.getClass();
        bao baoVarD = baoVar.d(-1855509426);
        if ((i & 6) == 0) {
            yjkVar2 = yjkVar;
            i2 = (true != baoVarD.H(yjkVar2) ? 2 : 4) | i;
        } else {
            yjkVar2 = yjkVar;
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            obj = this;
            i3 |= true != baoVarD.F(obj) ? 128 : 256;
        } else {
            obj = this;
        }
        if ((i3 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
            bkpVar2 = bkpVar;
        } else {
            bkpVar2 = bkp.g;
            Context context = (Context) baoVarD.f(AndroidCompositionLocals_androidKt.b);
            int i4 = i3 << 3;
            yjk yjkVar3 = yjkVar2;
            rdd.x(bga.k(1136963198, new kgx(context, 11), baoVarD), yjkVar3, bkpVar2, khe.b, null, false, null, b, baoVarD, (i4 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3078 | (i4 & 896), 368);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kbe(obj, (Object) yjkVar, (Object) bkpVar2, i, 10);
        }
    }

    public final void d(yjk yjkVar, boolean z, bkp bkpVar, bao baoVar, int i) {
        yjk yjkVar2;
        int i2;
        Object obj;
        bkp bkpVar2;
        yjkVar.getClass();
        bao baoVarD = baoVar.d(-134833376);
        if ((i & 6) == 0) {
            yjkVar2 = yjkVar;
            i2 = (true != baoVarD.H(yjkVar2) ? 2 : 4) | i;
        } else {
            yjkVar2 = yjkVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.G(z) ? 16 : 32;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            obj = this;
            i3 |= true != baoVarD.F(obj) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        } else {
            obj = this;
        }
        if ((i3 & 1171) == 1170 && baoVarD.K()) {
            baoVarD.t();
            bkpVar2 = bkpVar;
        } else {
            bkpVar2 = bkp.g;
            yjk yjkVar3 = yjkVar2;
            rdd.x(bga.k(-1217360144, new kgx((Context) baoVarD.f(AndroidCompositionLocals_androidKt.b), 12), baoVarD), yjkVar3, bkpVar2, khe.e, bga.k(-512047116, new khj(z, 1), baoVarD), false, null, b, baoVarD, ((i3 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 27654 | (i3 & 896), 352);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new jwv(obj, yjkVar, z, bkpVar2, i, 6);
        }
    }

    public final void e(int i, bkp bkpVar, long j, bao baoVar, int i2) {
        int i3;
        bkp bkpVar2;
        long j2;
        bkp bkpVar3;
        long j3;
        bao baoVarD = baoVar.d(-1804578359);
        if ((i2 & 6) == 0) {
            i3 = (true != baoVarD.D(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | 48;
        if ((i2 & 384) == 0) {
            i4 = i3 | 176;
        }
        if ((i2 & 3072) == 0) {
            i4 |= true != baoVarD.F(this) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i4 & 1171) == 1170 && baoVarD.K()) {
            baoVarD.t();
            bkpVar3 = bkpVar;
            j3 = j;
        } else {
            baoVarD.u();
            if ((i2 & 1) == 0 || baoVarD.I()) {
                bkpVar2 = bkp.g;
                j2 = wv.K(baoVarD).s;
            } else {
                baoVarD.t();
                bkpVar2 = bkpVar;
                j2 = j;
            }
            baoVarD.m();
            rdd.z(ccf.y(i, baoVarD, i4 & 14), null, zi.d(bkpVar2, c), j2, baoVarD, 48, 0);
            bkpVar3 = bkpVar2;
            j3 = j2;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kns(this, i, bkpVar3, j3, i2, 1);
        }
    }

    public final void f(String str, bkp bkpVar, bao baoVar, int i) {
        int i2;
        bao baoVar2;
        bkp bkpVar2;
        bao baoVarD = baoVar.d(1791754461);
        if ((i & 6) == 0) {
            i2 = i | (true != baoVarD.F(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i3 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
            bkpVar2 = bkpVar;
            baoVar2 = baoVarD;
        } else {
            bkm bkmVar = bkp.g;
            baoVar2 = baoVarD;
            rdd.p(str, bkmVar, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wv.N(baoVarD).j, baoVar2, i3 & R.styleable.AppCompatTheme_windowNoTitle, 0, 65532);
            bkpVar2 = bkmVar;
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kbe((Object) this, (Object) str, (Object) bkpVar2, i, 11);
        }
    }

    public final void g(yjk yjkVar, bkp bkpVar, bao baoVar, int i) {
        yjk yjkVar2;
        int i2;
        Object obj;
        bkp bkpVar2;
        yjkVar.getClass();
        bao baoVarD = baoVar.d(-913380835);
        if ((i & 6) == 0) {
            yjkVar2 = yjkVar;
            i2 = (true != baoVarD.H(yjkVar2) ? 2 : 4) | i;
        } else {
            yjkVar2 = yjkVar;
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            obj = this;
            i3 |= true != baoVarD.F(obj) ? 128 : 256;
        } else {
            obj = this;
        }
        if ((i3 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
            bkpVar2 = bkpVar;
        } else {
            bkpVar2 = bkp.g;
            Context context = (Context) baoVarD.f(AndroidCompositionLocals_androidKt.b);
            int i4 = i3 << 3;
            yjk yjkVar3 = yjkVar2;
            rdd.x(bga.k(1519689805, new kgx(context, 13), baoVarD), yjkVar3, bkpVar2, khe.c, null, false, null, b, baoVarD, (i4 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3078 | (i4 & 896), 368);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kbe(obj, (Object) yjkVar, (Object) bkpVar2, i, 9);
        }
    }

    public final void h(yjk yjkVar, bkp bkpVar, bao baoVar, int i) {
        yjk yjkVar2;
        int i2;
        Object obj;
        bkp bkpVar2;
        yjkVar.getClass();
        bao baoVarD = baoVar.d(936821412);
        if ((i & 6) == 0) {
            yjkVar2 = yjkVar;
            i2 = (true != baoVarD.H(yjkVar2) ? 2 : 4) | i;
        } else {
            yjkVar2 = yjkVar;
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            obj = this;
            i3 |= true != baoVarD.F(obj) ? 128 : 256;
        } else {
            obj = this;
        }
        if ((i3 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
            bkpVar2 = bkpVar;
        } else {
            bkpVar2 = bkp.g;
            Context context = (Context) baoVarD.f(AndroidCompositionLocals_androidKt.b);
            int i4 = i3 << 3;
            yjk yjkVar3 = yjkVar2;
            rdd.x(bga.k(-925075244, new kgx(context, 14), baoVarD), yjkVar3, bkpVar2, khe.a, null, false, null, b, baoVarD, (i4 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3078 | (i4 & 896), 368);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kbe(obj, (Object) yjkVar, (Object) bkpVar2, i, 8);
        }
    }

    public final void i(yjk yjkVar, boolean z, bkp bkpVar, bao baoVar, int i) {
        yjk yjkVar2;
        int i2;
        Object obj;
        bkp bkpVar2;
        yjkVar.getClass();
        bao baoVarD = baoVar.d(407959377);
        if ((i & 6) == 0) {
            yjkVar2 = yjkVar;
            i2 = (true != baoVarD.H(yjkVar2) ? 2 : 4) | i;
        } else {
            yjkVar2 = yjkVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.G(z) ? 16 : 32;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            obj = this;
            i3 |= true != baoVarD.F(obj) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        } else {
            obj = this;
        }
        if ((i3 & 1171) == 1170 && baoVarD.K()) {
            baoVarD.t();
            bkpVar2 = bkpVar;
        } else {
            bkpVar2 = bkp.g;
            yjk yjkVar3 = yjkVar2;
            rdd.x(bga.k(1209367937, new kgx((Context) baoVarD.f(AndroidCompositionLocals_androidKt.b), 15), baoVarD), yjkVar3, bkpVar2, khe.d, bga.k(1599235325, new khj(z, 0), baoVarD), false, null, b, baoVarD, ((i3 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 27654 | (i3 & 896), 352);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new jwv(obj, yjkVar, z, bkpVar2, i, 5);
        }
    }
}
