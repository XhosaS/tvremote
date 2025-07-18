package defpackage;

import android.support.v7.appcompat.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ard {
    public final float a;

    public ard(float f) {
        this.a = f;
    }

    public final bdy a(boolean z, kw kwVar, bao baoVar, int i) {
        mr mrVar;
        bas basVar = (bas) baoVar;
        Object objT = basVar.T();
        Object obj = ban.a;
        if (objT == obj) {
            objT = new bje();
            basVar.ae(objT);
        }
        bje bjeVar = (bje) objT;
        boolean z2 = (((i & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) > 32 && baoVar.F(kwVar)) || (i & 48) == 32;
        Object objT2 = basVar.T();
        if (z2 || objT2 == obj) {
            objT2 = new aoa(kwVar, bjeVar, (yih) null, 4);
            basVar.ae(objT2);
        }
        bbn.f(kwVar, (yjz) objT2, baoVar);
        wq wqVar = (wq) yfm.X(bjeVar);
        float f = 0.0f;
        if (z && !(wqVar instanceof ws)) {
            if (wqVar instanceof wn) {
                f = this.a;
            } else {
                boolean z3 = wqVar instanceof wl;
            }
        }
        Object objT3 = basVar.T();
        if (objT3 == obj) {
            objT3 = new mr(new cma(f), pm.c, null, 12);
            basVar.ae(objT3);
        }
        mr mrVar2 = (mr) objT3;
        cma cmaVar = new cma(f);
        boolean zH = baoVar.H(mrVar2) | baoVar.C(f) | ((((i & 14) ^ 6) > 4 && baoVar.G(z)) || (i & 6) == 4) | ((((i & 896) ^ 384) > 256 && baoVar.F(this)) || (i & 384) == 256) | baoVar.H(wqVar);
        Object objT4 = basVar.T();
        if (zH || objT4 == obj) {
            mrVar = mrVar2;
            ari ariVar = new ari(mrVar, f, z, this, wqVar, (yih) null, 1);
            basVar.ae(ariVar);
            objT4 = ariVar;
        } else {
            mrVar = mrVar2;
        }
        bbn.f(cmaVar, (yjz) objT4, baoVar);
        return mrVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ard)) {
            return false;
        }
        return cma.b(0.0f, 0.0f) && cma.b(0.0f, 0.0f) && cma.b(0.0f, 0.0f) && cma.b(this.a, ((ard) obj).a) && cma.b(0.0f, 0.0f);
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(0.0f) * 31) + Float.floatToIntBits(0.0f)) * 31) + Float.floatToIntBits(0.0f)) * 31) + Float.floatToIntBits(this.a)) * 31) + Float.floatToIntBits(0.0f);
    }
}
