package defpackage;

import android.support.v7.appcompat.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kas implements ykb {
    private final /* synthetic */ int f;
    public static final kas e = new kas(4);
    public static final kas d = new kas(3);
    public static final kas c = new kas(2);
    public static final kas b = new kas(1);
    public static final kas a = new kas(0);

    public kas(int i) {
        this.f = i;
    }

    @Override // defpackage.ykb
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4 = this.f;
        if (i4 == 0) {
            ((Number) obj2).intValue();
            bao baoVar = (bao) obj3;
            int iIntValue = ((Number) obj4).intValue();
            ((abe) obj).getClass();
            if ((iIntValue & 129) == 128 && baoVar.K()) {
                baoVar.t();
            } else {
                bkm bkmVar = bkp.g;
                float f = knq.a;
                jxl.C(ccf.d(zi.b(bkmVar, knq.b), "loading_placeholder_card"), 0L, 0.0f, null, baoVar, 0);
            }
            return ygi.a;
        }
        if (i4 == 1) {
            ((Number) obj4).intValue();
            return ygi.a;
        }
        if (i4 == 2) {
            int i5 = 16;
            xr xrVar = (xr) obj;
            bkp bkpVar = (bkp) obj2;
            bao baoVar2 = (bao) obj3;
            int iIntValue2 = ((Number) obj4).intValue();
            xrVar.getClass();
            bkpVar.getClass();
            if ((iIntValue2 & 6) == 0) {
                i = (true != baoVar2.F(xrVar) ? 2 : 4) | iIntValue2;
            } else {
                i = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                if (true == baoVar2.F(bkpVar)) {
                    i5 = 32;
                }
                i |= i5;
            }
            if ((i & 147) == 146 && baoVar2.K()) {
                baoVar2.t();
            } else {
                kht.a.b(xrVar, bkpVar, baoVar2, (i & 14) | 384 | (i & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
            }
            return ygi.a;
        }
        if (i4 != 3) {
            xr xrVar2 = (xr) obj;
            iom iomVar = (iom) obj2;
            bao baoVar3 = (bao) obj3;
            int iIntValue3 = ((Number) obj4).intValue();
            xrVar2.getClass();
            iomVar.getClass();
            if ((iIntValue3 & 6) == 0) {
                i3 = (true != baoVar3.F(xrVar2) ? 2 : 4) | iIntValue3;
            } else {
                i3 = iIntValue3;
            }
            if ((iIntValue3 & 48) == 0) {
                i3 |= true == ((iIntValue3 & 64) == 0 ? baoVar3.F(iomVar) : baoVar3.H(iomVar)) ? 32 : 16;
            }
            if ((i3 & 147) == 146 && baoVar3.K()) {
                baoVar3.t();
            } else {
                kht khtVar = kht.a;
                khtVar.e(iomVar, null, null, baoVar3, (i3 >> 3) & 14);
                khtVar.d(xrVar2, iomVar, wv.v(xrVar2.a(bkp.g, bkb.h), 0.0f, 0.0f, 0.0f, 48.0f, 7), baoVar3, i3 & R.styleable.AppCompatTheme_windowNoTitle);
            }
            return ygi.a;
        }
        int i6 = 16;
        xr xrVar3 = (xr) obj;
        iom iomVar2 = (iom) obj2;
        bao baoVar4 = (bao) obj3;
        int iIntValue4 = ((Number) obj4).intValue();
        xrVar3.getClass();
        iomVar2.getClass();
        if ((iIntValue4 & 6) == 0) {
            i2 = (true != baoVar4.F(xrVar3) ? 2 : 4) | iIntValue4;
        } else {
            i2 = iIntValue4;
        }
        if ((iIntValue4 & 48) == 0) {
            if (true == ((iIntValue4 & 64) == 0 ? baoVar4.F(iomVar2) : baoVar4.H(iomVar2))) {
                i6 = 32;
            }
            i2 |= i6;
        }
        if ((i2 & 147) == 146 && baoVar4.K()) {
            baoVar4.t();
        } else {
            kht khtVar2 = kht.a;
            khtVar2.e(iomVar2, null, null, baoVar4, (i2 >> 3) & 14);
            khtVar2.d(xrVar3, iomVar2, wv.v(xrVar3.a(bkp.g, bkb.h), 0.0f, 0.0f, 0.0f, 16.0f, 7), baoVar4, i2 & R.styleable.AppCompatTheme_windowNoTitle);
        }
        return ygi.a;
    }
}
