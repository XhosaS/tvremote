package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xw implements bvt, zd {
    public final bkc a;
    private final xj b;

    public xw(xj xjVar, bkc bkcVar) {
        this.b = xjVar;
        this.a = bkcVar;
    }

    @Override // defpackage.bvt
    public final int a(buz buzVar, List list, int i) {
        int iCu = buzVar.cu(this.b.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            buy buyVar = (buy) list.get(i3);
            float fJ = wv.j(wv.k(buyVar));
            int iC = buyVar.c(i);
            if (fJ == 0.0f) {
                i2 += iC;
            } else if (fJ > 0.0f) {
                f += fJ;
                iMax = Math.max(iMax, Math.round(iC / fJ));
            }
        }
        return Math.round(iMax * f) + i2 + ((list.size() - 1) * iCu);
    }

    @Override // defpackage.bvt
    public final int b(buz buzVar, List list, int i) {
        int iCu = buzVar.cu(this.b.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iCu, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            buy buyVar = (buy) list.get(i2);
            float fJ = wv.j(wv.k(buyVar));
            if (fJ == 0.0f) {
                int iMin2 = Math.min(buyVar.c(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, buyVar.d(iMin2));
            } else if (fJ > 0.0f) {
                f += fJ;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            buy buyVar2 = (buy) list.get(i3);
            float fJ2 = wv.j(wv.k(buyVar2));
            if (fJ2 > 0.0f) {
                iMax = Math.max(iMax, buyVar2.d(iRound != Integer.MAX_VALUE ? Math.round(iRound * fJ2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.bvt
    public final int c(buz buzVar, List list, int i) {
        int iCu = buzVar.cu(this.b.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            buy buyVar = (buy) list.get(i3);
            float fJ = wv.j(wv.k(buyVar));
            int iE = buyVar.e(i);
            if (fJ == 0.0f) {
                i2 += iE;
            } else if (fJ > 0.0f) {
                f += fJ;
                iMax = Math.max(iMax, Math.round(iE / fJ));
            }
        }
        return Math.round(iMax * f) + i2 + ((list.size() - 1) * iCu);
    }

    @Override // defpackage.bvt
    public final int d(buz buzVar, List list, int i) {
        int iCu = buzVar.cu(this.b.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iCu, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            buy buyVar = (buy) list.get(i2);
            float fJ = wv.j(wv.k(buyVar));
            if (fJ == 0.0f) {
                int iMin2 = Math.min(buyVar.c(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, buyVar.f(iMin2));
            } else if (fJ > 0.0f) {
                f += fJ;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            buy buyVar2 = (buy) list.get(i3);
            float fJ2 = wv.j(wv.k(buyVar2));
            if (fJ2 > 0.0f) {
                iMax = Math.max(iMax, buyVar2.f(iRound != Integer.MAX_VALUE ? Math.round(iRound * fJ2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.bvt
    public final bvu e(bvv bvvVar, List list, long j) {
        return zy.m(this, clv.c(j), clv.d(j), clv.a(j), clv.b(j), bvvVar.cu(this.b.a()), bvvVar, list, new bwj[list.size()], list.size());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xw)) {
            return false;
        }
        xw xwVar = (xw) obj;
        return yks.e(this.b, xwVar.b) && yks.e(this.a, xwVar.a);
    }

    @Override // defpackage.zd
    public final int f(bwj bwjVar) {
        return bwjVar.a;
    }

    @Override // defpackage.zd
    public final int g(bwj bwjVar) {
        return bwjVar.b;
    }

    @Override // defpackage.zd
    public final void h(int i, int[] iArr, int[] iArr2, bvv bvvVar) {
        this.b.c(bvvVar, i, iArr, iArr2);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // defpackage.zd
    public final long i(int i, int i2, int i3, boolean z) {
        return !z ? clw.d(0, i3, i, i2) : clw.m(0, i3, i, i2);
    }

    @Override // defpackage.zd
    public final bvu j(final bwj[] bwjVarArr, final bvv bvvVar, final int[] iArr, int i, final int i2) {
        return bvvVar.cz(i2, i, yhc.a, new yjv() { // from class: xv
            @Override // defpackage.yjv
            public final Object a(Object obj) {
                int iA;
                bwi bwiVar = (bwi) obj;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    bwj[] bwjVarArr2 = bwjVarArr;
                    if (i3 >= bwjVarArr2.length) {
                        return ygi.a;
                    }
                    bvv bvvVar2 = bvvVar;
                    bwj bwjVar = bwjVarArr2[i3];
                    int i5 = i4 + 1;
                    bwjVar.getClass();
                    ze zeVarL = wv.l(bwjVar);
                    cmi cmiVarN = bvvVar2.n();
                    ye yeVar = zeVarL != null ? zeVarL.c : null;
                    int i6 = i2;
                    if (yeVar != null) {
                        iA = yeVar.a(i6 - bwjVar.a, cmiVarN);
                    } else {
                        iA = this.a.a(0, i6 - bwjVar.a, cmiVarN);
                    }
                    bwiVar.r(bwjVar, iA, iArr[i4], 0.0f);
                    i3++;
                    i4 = i5;
                }
            }
        });
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.b + ", horizontalAlignment=" + this.a + ')';
    }
}
