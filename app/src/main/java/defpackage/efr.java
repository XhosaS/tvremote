package defpackage;

import android.graphics.PointF;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class efr extends os {
    private static int b = Integer.MAX_VALUE;

    public efr(int i) {
        b = i;
    }

    private final int j(qd qdVar, pg pgVar, int i, int i2) {
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.os, defpackage.rh
    public final int a(qd qdVar, int i, int i2) {
        int iAB;
        View viewB;
        int iAD;
        int i3;
        PointF pointFP;
        int iJ;
        int iJ2;
        if (!(qdVar instanceof qq) || (iAB = qdVar.aB()) == 0 || (viewB = b(qdVar)) == null || (iAD = qdVar.aD(viewB)) == -1 || (pointFP = ((qq) qdVar).P(iAB - 1)) == null) {
            return -1;
        }
        if (qdVar.ad()) {
            iJ = j(qdVar, new pe(qdVar), i, 0);
            int i4 = b;
            if (iJ > i4) {
                iJ = i4;
            }
            int i5 = -i4;
            if (iJ < i5) {
                iJ = i5;
            }
            if (pointFP.x < 0.0f) {
                iJ = -iJ;
            }
        } else {
            iJ = 0;
        }
        if (qdVar.ae()) {
            iJ2 = j(qdVar, new pf(qdVar), 0, i2);
            if (pointFP.y < 0.0f) {
                iJ2 = -iJ2;
            }
        } else {
            iJ2 = 0;
        }
        if (true == qdVar.ae()) {
            iJ = iJ2;
        }
        if (iJ == 0) {
            return -1;
        }
        int i6 = iAD + iJ;
        int i7 = i6 >= 0 ? i6 : 0;
        return i7 >= iAB ? i3 : i7;
    }
}
