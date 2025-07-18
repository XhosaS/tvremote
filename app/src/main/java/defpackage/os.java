package defpackage;

import android.graphics.PointF;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class os extends rh {
    private pg b;
    private pg c;

    private final int j(View view, pg pgVar) {
        return (pgVar.d(view) + (pgVar.b(view) / 2)) - (pgVar.j() + (pgVar.k() / 2));
    }

    private int k(qd qdVar, pg pgVar, int i, int i2) {
        int[] iArrI = i(i, i2);
        int iAt = qdVar.at();
        float f = 1.0f;
        if (iAt != 0) {
            View view = null;
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MIN_VALUE;
            View view2 = null;
            for (int i5 = 0; i5 < iAt; i5++) {
                View viewAI = qdVar.aI(i5);
                int iAD = qdVar.aD(viewAI);
                if (iAD != -1) {
                    int i6 = iAD < i3 ? iAD : i3;
                    if (iAD < i3) {
                        view = viewAI;
                    }
                    if (iAD > i4) {
                        view2 = viewAI;
                        i4 = iAD;
                    }
                    i3 = i6;
                }
            }
            if (view != null && view2 != null) {
                int iMax = Math.max(pgVar.a(view), pgVar.a(view2)) - Math.min(pgVar.d(view), pgVar.d(view2));
                if (iMax != 0) {
                    f = iMax / ((i4 - i3) + 1);
                }
            }
        }
        if (f <= 0.0f) {
            return 0;
        }
        return Math.round(iArrI[Math.abs(iArrI[0]) > Math.abs(iArrI[1]) ? (char) 0 : (char) 1] / f);
    }

    private pg l(qd qdVar) {
        pg pgVar = this.c;
        if (pgVar == null || pgVar.a != qdVar) {
            this.c = new pe(qdVar);
        }
        return this.c;
    }

    private pg m(qd qdVar) {
        pg pgVar = this.b;
        if (pgVar == null || pgVar.a != qdVar) {
            this.b = new pf(qdVar);
        }
        return this.b;
    }

    private final View n(qd qdVar, pg pgVar) {
        int iAt = qdVar.at();
        View view = null;
        if (iAt == 0) {
            return null;
        }
        int iJ = pgVar.j() + (pgVar.k() / 2);
        int i = 0;
        int i2 = Integer.MAX_VALUE;
        while (i < iAt) {
            View viewAI = qdVar.aI(i);
            int iAbs = Math.abs((pgVar.d(viewAI) + (pgVar.b(viewAI) / 2)) - iJ);
            int i3 = iAbs < i2 ? iAbs : i2;
            if (iAbs < i2) {
                view = viewAI;
            }
            i++;
            i2 = i3;
        }
        return view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rh
    public int a(qd qdVar, int i, int i2) {
        int iAB;
        View viewB;
        int iAD;
        int i3;
        PointF pointFP;
        int iK;
        int iK2;
        if (!(qdVar instanceof qq) || (iAB = qdVar.aB()) == 0 || (viewB = b(qdVar)) == null || (iAD = qdVar.aD(viewB)) == -1 || (pointFP = ((qq) qdVar).P(iAB - 1)) == null) {
            return -1;
        }
        if (qdVar.ad()) {
            iK = k(qdVar, l(qdVar), i, 0);
            if (pointFP.x < 0.0f) {
                iK = -iK;
            }
        } else {
            iK = 0;
        }
        if (qdVar.ae()) {
            iK2 = k(qdVar, m(qdVar), 0, i2);
            if (pointFP.y < 0.0f) {
                iK2 = -iK2;
            }
        } else {
            iK2 = 0;
        }
        if (true == qdVar.ae()) {
            iK = iK2;
        }
        if (iK == 0) {
            return -1;
        }
        int i4 = iAD + iK;
        int i5 = i4 >= 0 ? i4 : 0;
        return i5 >= iAB ? i3 : i5;
    }

    @Override // defpackage.rh
    public View b(qd qdVar) {
        if (qdVar.ae()) {
            return n(qdVar, m(qdVar));
        }
        if (qdVar.ad()) {
            return n(qdVar, l(qdVar));
        }
        return null;
    }

    @Override // defpackage.rh
    public int[] c(qd qdVar, View view) {
        int[] iArr = new int[2];
        if (qdVar.ad()) {
            iArr[0] = j(view, l(qdVar));
        } else {
            iArr[0] = 0;
        }
        if (qdVar.ae()) {
            iArr[1] = j(view, m(qdVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }
}
