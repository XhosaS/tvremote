package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ekg extends efr {
    private pg b;
    private pg c;

    public ekg(int i) {
        super(i);
    }

    private final pg j(qd qdVar) {
        pg pgVar = this.c;
        if (pgVar == null || pgVar.a != qdVar) {
            this.c = new pe(qdVar);
        }
        return this.c;
    }

    private final pg k(qd qdVar) {
        pg pgVar = this.b;
        if (pgVar == null || pgVar.a != qdVar) {
            this.b = new pf(qdVar);
        }
        return this.b;
    }

    private final View l(qd qdVar, pg pgVar) {
        int iAt = qdVar.at();
        View view = null;
        if (iAt == 0) {
            return null;
        }
        int iJ = pgVar.j();
        int i = 0;
        int i2 = Integer.MAX_VALUE;
        while (i < iAt) {
            View viewAI = qdVar.aI(i);
            int iAbs = Math.abs(pgVar.d(viewAI) - iJ);
            int i3 = iAbs < i2 ? iAbs : i2;
            if (iAbs < i2) {
                view = viewAI;
            }
            i++;
            i2 = i3;
        }
        View viewAI2 = qdVar.aI(iAt - 1);
        if (qdVar.aD(viewAI2) == qdVar.aB() - 1) {
            if (Math.abs(pgVar.a(viewAI2) - pgVar.f()) < i2) {
                return viewAI2;
            }
        }
        return view;
    }

    @Override // defpackage.os, defpackage.rh
    public final View b(qd qdVar) {
        if (qdVar.ae()) {
            return l(qdVar, k(qdVar));
        }
        if (qdVar.ad()) {
            return l(qdVar, j(qdVar));
        }
        return null;
    }

    @Override // defpackage.os, defpackage.rh
    public final int[] c(qd qdVar, View view) {
        int[] iArr = new int[2];
        if (qdVar.ad()) {
            pg pgVarJ = j(qdVar);
            iArr[0] = pgVarJ.d(view) - ((pe) pgVarJ).a.getPaddingLeft();
        } else {
            iArr[0] = 0;
        }
        if (!qdVar.ae()) {
            iArr[1] = 0;
            return iArr;
        }
        pg pgVarK = k(qdVar);
        iArr[1] = pgVarK.d(view) - ((pf) pgVarK).a.getPaddingTop();
        return iArr;
    }
}
