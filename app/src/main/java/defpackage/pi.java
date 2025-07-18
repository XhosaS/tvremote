package defpackage;

import android.graphics.PointF;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class pi extends rh {
    private pg b;
    private pg c;

    private final int j(View view, pg pgVar) {
        return (pgVar.d(view) + (pgVar.b(view) / 2)) - (pgVar.j() + (pgVar.k() / 2));
    }

    private final pg k(qd qdVar) {
        pg pgVar = this.c;
        if (pgVar == null || pgVar.a != qdVar) {
            this.c = new pe(qdVar);
        }
        return this.c;
    }

    private final pg l(qd qdVar) {
        pg pgVar = this.b;
        if (pgVar == null || pgVar.a != qdVar) {
            this.b = new pf(qdVar);
        }
        return this.b;
    }

    private final View m(qd qdVar, pg pgVar) {
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
    public final int a(qd qdVar, int i, int i2) {
        PointF pointFP;
        int iAB = qdVar.aB();
        if (iAB != 0) {
            View view = null;
            pg pgVarL = qdVar.ae() ? l(qdVar) : qdVar.ad() ? k(qdVar) : null;
            if (pgVarL != null) {
                int iAt = qdVar.at();
                boolean z = false;
                int i3 = Integer.MIN_VALUE;
                int i4 = Integer.MAX_VALUE;
                View view2 = null;
                for (int i5 = 0; i5 < iAt; i5++) {
                    View viewAI = qdVar.aI(i5);
                    if (viewAI != null) {
                        int iJ = j(viewAI, pgVarL);
                        if (iJ <= 0 && iJ > i3) {
                            view2 = viewAI;
                            i3 = iJ;
                        }
                        if (iJ >= 0 && iJ < i4) {
                            view = viewAI;
                            i4 = iJ;
                        }
                    }
                }
                if (true != qdVar.ad()) {
                    i = i2;
                }
                boolean z2 = i > 0;
                if (z2 && view != null) {
                    return qdVar.aD(view);
                }
                if (!z2 && view2 != null) {
                    return qdVar.aD(view2);
                }
                if (true == z2) {
                    view = view2;
                }
                if (view != null) {
                    int iAD = qdVar.aD(view);
                    int iAB2 = qdVar.aB();
                    if ((qdVar instanceof qq) && (pointFP = ((qq) qdVar).P(iAB2 - 1)) != null && (pointFP.x < 0.0f || pointFP.y < 0.0f)) {
                        z = true;
                    }
                    int i6 = iAD + (z == z2 ? -1 : 1);
                    if (i6 >= 0 && i6 < iAB) {
                        return i6;
                    }
                }
            }
        }
        return -1;
    }

    @Override // defpackage.rh
    public final View b(qd qdVar) {
        if (qdVar.ae()) {
            return m(qdVar, l(qdVar));
        }
        if (qdVar.ad()) {
            return m(qdVar, k(qdVar));
        }
        return null;
    }

    @Override // defpackage.rh
    public int[] c(qd qdVar, View view) {
        int[] iArr = new int[2];
        if (qdVar.ad()) {
            iArr[0] = j(view, k(qdVar));
        } else {
            iArr[0] = 0;
        }
        if (qdVar.ae()) {
            iArr[1] = j(view, l(qdVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // defpackage.rh
    protected final qr d(qd qdVar) {
        if (qdVar instanceof qq) {
            return new ph(this, this.a.getContext());
        }
        return null;
    }
}
