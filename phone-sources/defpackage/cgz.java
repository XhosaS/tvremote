package defpackage;

import android.graphics.RectF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgz {
    public final cgy a;
    public final cgh b;
    public final long c;
    public final float d;
    public final float e;
    public final List f;

    public cgz(cgy cgyVar, cgh cghVar, long j) {
        this.a = cgyVar;
        this.b = cghVar;
        this.c = j;
        float fA = 0.0f;
        this.d = cghVar.h.isEmpty() ? 0.0f : ((cgj) cghVar.h.get(0)).g.a();
        if (!cghVar.h.isEmpty()) {
            cgj cgjVar = (cgj) yfm.W(cghVar.h);
            fA = cgjVar.a(cgjVar.g.d());
        }
        this.e = fA;
        this.f = cghVar.g;
    }

    public final float a(int i) {
        return this.b.a(i);
    }

    public final float b(int i) {
        cgh cghVar = this.b;
        cghVar.k(i);
        List list = cghVar.h;
        cgj cgjVar = (cgj) list.get(ccf.S(list, i));
        cft cftVar = cgjVar.g;
        int iF = cgjVar.f(i);
        cho choVar = cftVar.b;
        return choVar.d.getLineLeft(iF) + (iF == choVar.e + (-1) ? choVar.g : 0.0f);
    }

    public final float c(int i) {
        cgh cghVar = this.b;
        cghVar.k(i);
        List list = cghVar.h;
        cgj cgjVar = (cgj) list.get(ccf.S(list, i));
        cft cftVar = cgjVar.g;
        int iF = cgjVar.f(i);
        cho choVar = cftVar.b;
        return choVar.d.getLineRight(iF) + (iF == choVar.e + (-1) ? choVar.h : 0.0f);
    }

    public final float d(int i) {
        return this.b.b(i);
    }

    public final int e() {
        return this.b.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgz)) {
            return false;
        }
        cgz cgzVar = (cgz) obj;
        return yks.e(this.a, cgzVar.a) && yks.e(this.b, cgzVar.b) && a.s(this.c, cgzVar.c) && this.d == cgzVar.d && this.e == cgzVar.e && yks.e(this.f, cgzVar.f);
    }

    public final int f(int i, boolean z) {
        return this.b.c(i, z);
    }

    public final int g(int i) {
        return this.b.d(i);
    }

    public final int h(float f) {
        return this.b.e(f);
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + a.k(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + this.f.hashCode();
    }

    public final int i(int i) {
        cgh cghVar = this.b;
        cghVar.k(i);
        List list = cghVar.h;
        cgj cgjVar = (cgj) list.get(ccf.S(list, i));
        cft cftVar = cgjVar.g;
        return cgjVar.c(cftVar.b.m(cgjVar.f(i)));
    }

    public final int j(long j) {
        return this.b.f(j);
    }

    public final long k(int i) {
        int iB;
        int iA;
        cgh cghVar = this.b;
        cghVar.j(i);
        cgj cgjVar = (cgj) cghVar.h.get(i == cghVar.h().a() ? yfm.q(cghVar.h) : ccf.R(cghVar.h, i));
        cft cftVar = cgjVar.g;
        int iE = cgjVar.e(i);
        chw chwVarP = cftVar.b.p();
        if (chwVarP.h(chwVarP.b(iE))) {
            chwVarP.c(iE);
            iB = iE;
            while (iB != -1) {
                if (chwVarP.h(iB) && !chwVarP.e(iB)) {
                    break;
                }
                iB = chwVarP.b(iB);
            }
        } else {
            chwVarP.c(iE);
            iB = chwVarP.g(iE) ? (!chwVarP.f(iE) || chwVarP.d(iE)) ? chwVarP.b(iE) : iE : chwVarP.d(iE) ? chwVarP.b(iE) : -1;
        }
        if (iB == -1) {
            iB = iE;
        }
        if (chwVarP.e(chwVarP.a(iE))) {
            chwVarP.c(iE);
            iA = iE;
            while (iA != -1) {
                if (!chwVarP.h(iA) && chwVarP.e(iA)) {
                    break;
                }
                iA = chwVarP.a(iA);
            }
        } else {
            chwVarP.c(iE);
            iA = chwVarP.d(iE) ? (!chwVarP.f(iE) || chwVarP.g(iE)) ? chwVarP.a(iE) : iE : chwVarP.g(iE) ? chwVarP.a(iE) : -1;
        }
        if (iA != -1) {
            iE = iA;
        }
        long jN = ccf.N(iB, iE);
        long j = chb.a;
        return cgjVar.g(jN, false);
    }

    public final bmy l(int i) {
        float f;
        float f2;
        float fE;
        float fE2;
        cgh cghVar = this.b;
        cghVar.i(i);
        List list = cghVar.h;
        cgj cgjVar = (cgj) list.get(ccf.R(list, i));
        cft cftVar = cgjVar.g;
        int iE = cgjVar.e(i);
        if (iE < 0 || iE >= cftVar.c.length()) {
            cko.a("offset(" + iE + ") is out of bounds [0," + cftVar.c.length() + ')');
        }
        cho choVar = cftVar.b;
        int i2 = iE + 1;
        int iK = choVar.k(iE);
        float fD = choVar.d(iK);
        float fB = choVar.b(iK);
        boolean z = choVar.n(iK) == 1;
        boolean zIsRtlCharAt = choVar.d.isRtlCharAt(iE);
        if (!z || zIsRtlCharAt) {
            if (z) {
                fE = choVar.f(iE, false);
                fE2 = choVar.f(i2, true);
            } else if (zIsRtlCharAt) {
                fE = choVar.e(iE, false);
                fE2 = choVar.e(i2, true);
            } else {
                f = choVar.f(iE, false);
                f2 = choVar.f(i2, true);
            }
            float f3 = fE2;
            f2 = fE;
            f = f3;
        } else {
            f = choVar.e(iE, false);
            f2 = choVar.e(i2, true);
        }
        RectF rectF = new RectF(f, fD, f2, fB);
        return cgjVar.h(new bmy(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final bmy m(int i) {
        cgh cghVar = this.b;
        cghVar.j(i);
        cgj cgjVar = (cgj) cghVar.h.get(i == cghVar.h().a() ? yfm.q(cghVar.h) : ccf.R(cghVar.h, i));
        cft cftVar = cgjVar.g;
        int iE = cgjVar.e(i);
        if (iE < 0 || iE > cftVar.c.length()) {
            cko.a("offset(" + iE + ") is out of bounds [0," + cftVar.c.length() + ']');
        }
        cho choVar = cftVar.b;
        float fE = choVar.e(iE, false);
        int iK = choVar.k(iE);
        return cgjVar.h(new bmy(fE, choVar.d(iK), fE, choVar.b(iK)));
    }

    public final cgz n(cgy cgyVar, long j) {
        return new cgz(cgyVar, this.b, j);
    }

    public final boolean o() {
        long j = this.c;
        cgh cghVar = this.b;
        return ((float) ((int) (j >> 32))) < cghVar.d || cghVar.c || ((float) ((int) (j & 4294967295L))) < cghVar.e;
    }

    public final int r(int i) {
        cgh cghVar = this.b;
        cghVar.j(i);
        cgj cgjVar = (cgj) cghVar.h.get(i == cghVar.h().a() ? yfm.q(cghVar.h) : ccf.R(cghVar.h, i));
        return cgjVar.g.l(cgjVar.e(i));
    }

    public final int s(int i) {
        cgh cghVar = this.b;
        cghVar.j(i);
        cgj cgjVar = (cgj) cghVar.h.get(i == cghVar.h().a() ? yfm.q(cghVar.h) : ccf.R(cghVar.h, i));
        cft cftVar = cgjVar.g;
        int iE = cgjVar.e(i);
        cho choVar = cftVar.b;
        return choVar.n(choVar.k(iE)) == 1 ? 1 : 2;
    }

    public final bni t(int i, int i2) {
        cgh cghVar = this.b;
        if (i < 0 || i > i2 || i2 > cghVar.h().b.length()) {
            cko.a("Start(" + i + ") or End(" + i2 + ") is out of range [0.." + cghVar.h().b.length() + "), or start > end!");
        }
        byte[] bArr = null;
        if (i == i2) {
            return new bni(bArr);
        }
        bni bniVar = new bni(bArr);
        List list = cghVar.h;
        long jN = ccf.N(i, i2);
        long j = chb.a;
        ccf.U(list, jN, new ym(bniVar, i, i2, 6));
        return bniVar;
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + ((Object) cmh.a(this.c)) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ')';
    }
}
