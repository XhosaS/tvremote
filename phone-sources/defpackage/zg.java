package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zg implements bvt, zd {
    public final bkh a;
    private final xe b;

    public zg(xe xeVar, bkh bkhVar) {
        this.b = xeVar;
        this.a = bkhVar;
    }

    @Override // defpackage.bvt
    public final int a(buz buzVar, List list, int i) {
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
                int iMin2 = Math.min(buyVar.d(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, buyVar.c(iMin2));
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
                iMax = Math.max(iMax, buyVar2.c(iRound != Integer.MAX_VALUE ? Math.round(iRound * fJ2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.bvt
    public final int b(buz buzVar, List list, int i) {
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
            int iD = buyVar.d(i);
            if (fJ == 0.0f) {
                i2 += iD;
            } else if (fJ > 0.0f) {
                f += fJ;
                iMax = Math.max(iMax, Math.round(iD / fJ));
            }
        }
        return Math.round(iMax * f) + i2 + ((list.size() - 1) * iCu);
    }

    @Override // defpackage.bvt
    public final int c(buz buzVar, List list, int i) {
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
                int iMin2 = Math.min(buyVar.d(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, buyVar.e(iMin2));
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
                iMax = Math.max(iMax, buyVar2.e(iRound != Integer.MAX_VALUE ? Math.round(iRound * fJ2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.bvt
    public final int d(buz buzVar, List list, int i) {
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
            int iF = buyVar.f(i);
            if (fJ == 0.0f) {
                i2 += iF;
            } else if (fJ > 0.0f) {
                f += fJ;
                iMax = Math.max(iMax, Math.round(iF / fJ));
            }
        }
        return Math.round(iMax * f) + i2 + ((list.size() - 1) * iCu);
    }

    @Override // defpackage.bvt
    public final bvu e(bvv bvvVar, List list, long j) {
        return zy.m(this, clv.d(j), clv.c(j), clv.b(j), clv.a(j), bvvVar.cu(this.b.a()), bvvVar, list, new bwj[list.size()], list.size());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zg)) {
            return false;
        }
        zg zgVar = (zg) obj;
        return yks.e(this.b, zgVar.b) && yks.e(this.a, zgVar.a);
    }

    @Override // defpackage.zd
    public final int f(bwj bwjVar) {
        return bwjVar.b;
    }

    @Override // defpackage.zd
    public final int g(bwj bwjVar) {
        return bwjVar.a;
    }

    @Override // defpackage.zd
    public final void h(int i, int[] iArr, int[] iArr2, bvv bvvVar) {
        this.b.b(bvvVar, i, iArr, bvvVar.n(), iArr2);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // defpackage.zd
    public final long i(int i, int i2, int i3, boolean z) {
        return !z ? clw.d(i, i2, 0, i3) : clw.n(i, i2, 0, i3);
    }

    @Override // defpackage.zd
    public final bvu j(bwj[] bwjVarArr, bvv bvvVar, int[] iArr, int i, int i2) {
        return bvvVar.cz(i, i2, yhc.a, new ajg(bwjVarArr, this, i2, iArr, 1));
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.b + ", verticalAlignment=" + this.a + ')';
    }
}
