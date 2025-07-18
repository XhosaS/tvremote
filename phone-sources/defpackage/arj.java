package defpackage;

import android.support.v7.appcompat.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class arj {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    private final float e;
    private final float f;

    public arj(float f, float f2, float f3, float f4, float f5, float f6) {
        this.e = f;
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.d = f5;
        this.f = f6;
    }

    public final bdy a(boolean z, kw kwVar, bao baoVar, int i) {
        mr mrVar;
        baoVar.x(-1763481333);
        if (kwVar == null) {
            baoVar.x(167751211);
            bas basVar = (bas) baoVar;
            Object objT = basVar.T();
            if (objT == ban.a) {
                bci bciVar = new bci(new cma(this.e), bcz.c);
                basVar.ae(bciVar);
                objT = bciVar;
            }
            bcb bcbVar = (bcb) objT;
            basVar.aa();
            basVar.aa();
            return bcbVar;
        }
        baoVar.x(167824247);
        bas basVar2 = (bas) baoVar;
        basVar2.aa();
        Object objT2 = basVar2.T();
        Object obj = ban.a;
        if (objT2 == obj) {
            objT2 = new bje();
            basVar2.ae(objT2);
        }
        bje bjeVar = (bje) objT2;
        boolean z2 = (((i & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) > 32 && baoVar.F(kwVar)) || (i & 48) == 32;
        Object objT3 = basVar2.T();
        if (z2 || objT3 == obj) {
            objT3 = new aoa(kwVar, bjeVar, (yih) null, 5, (byte[]) null);
            basVar2.ae(objT3);
        }
        bbn.f(kwVar, (yjz) objT3, baoVar);
        wq wqVar = (wq) yfm.X(bjeVar);
        float f = !z ? this.f : wqVar instanceof ws ? this.a : wqVar instanceof wn ? this.c : wqVar instanceof wl ? this.b : wqVar instanceof wj ? this.d : this.e;
        Object objT4 = basVar2.T();
        if (objT4 == obj) {
            objT4 = new mr(new cma(f), pm.c, null, 12);
            basVar2.ae(objT4);
        }
        mr mrVar2 = (mr) objT4;
        cma cmaVar = new cma(f);
        boolean zH = baoVar.H(mrVar2) | baoVar.C(f) | ((((i & 14) ^ 6) > 4 && baoVar.G(z)) || (i & 6) == 4) | ((((i & 896) ^ 384) > 256 && baoVar.F(this)) || (i & 384) == 256) | baoVar.H(wqVar);
        Object objT5 = basVar2.T();
        if (zH || objT5 == obj) {
            float f2 = f;
            mrVar = mrVar2;
            ari ariVar = new ari(mrVar, f2, z, this, wqVar, (yih) null, 0);
            basVar2.ae(ariVar);
            objT5 = ariVar;
        } else {
            mrVar = mrVar2;
        }
        bbn.f(cmaVar, (yjz) objT5, baoVar);
        mz mzVar = mrVar.a;
        basVar2.aa();
        return mzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof arj)) {
            return false;
        }
        arj arjVar = (arj) obj;
        return cma.b(this.e, arjVar.e) && cma.b(this.a, arjVar.a) && cma.b(this.b, arjVar.b) && cma.b(this.c, arjVar.c) && cma.b(this.f, arjVar.f);
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(this.e) * 31) + Float.floatToIntBits(this.a)) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.f);
    }
}
