package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ekf extends rh {
    public RecyclerView b;
    private pg c;
    private pg d;
    private qd e;
    private qd f;
    private final int g;

    public ekf(int i) {
        this.g = i;
    }

    private final pg j(qd qdVar) {
        if (this.d == null || this.f != qdVar) {
            this.d = new pe(qdVar);
            this.f = qdVar;
        }
        return this.d;
    }

    private final pg k(qd qdVar) {
        if (this.c == null || this.e != qdVar) {
            this.c = new pf(qdVar);
            this.e = qdVar;
        }
        return this.c;
    }

    private static View l(qd qdVar, pg pgVar) {
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
        return view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006d  */
    @Override // defpackage.rh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(defpackage.qd r14, int r15, int r16) {
        /*
            r13 = this;
            int r0 = r14.aB()
            r1 = -1
            if (r0 != 0) goto L9
            goto L80
        L9:
            boolean r2 = r14.ad()
            if (r2 == 0) goto L14
            pg r3 = r13.j(r14)
            goto L18
        L14:
            pg r3 = r13.k(r14)
        L18:
            int r4 = r14.at()
            r5 = 0
            r6 = 0
            if (r4 != 0) goto L21
            goto L42
        L21:
            int r7 = r3.j()
            r8 = 2147483647(0x7fffffff, float:NaN)
            r9 = r6
        L29:
            if (r9 >= r4) goto L42
            android.view.View r10 = r14.aI(r9)
            int r11 = r3.d(r10)
            int r12 = r11 - r7
            int r12 = java.lang.Math.abs(r12)
            if (r11 >= r7) goto L3f
            if (r12 >= r8) goto L3f
            r5 = r10
            r8 = r12
        L3f:
            int r9 = r9 + 1
            goto L29
        L42:
            if (r5 == 0) goto L80
            int r3 = r14.aD(r5)
            if (r3 == r1) goto L80
            r4 = 1
            if (r4 != r2) goto L4f
            r2 = r15
            goto L51
        L4f:
            r2 = r16
        L51:
            boolean r5 = r14 instanceof defpackage.qq
            if (r5 == 0) goto L6d
            int r5 = r0 + (-1)
            qq r14 = (defpackage.qq) r14
            android.graphics.PointF r14 = r14.P(r5)
            if (r14 == 0) goto L6d
            float r5 = r14.x
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 < 0) goto L6e
            float r14 = r14.y
            int r14 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r14 >= 0) goto L6d
            goto L6e
        L6d:
            r4 = r6
        L6e:
            if (r2 <= 0) goto L77
            int r14 = r13.g
            if (r4 == 0) goto L76
            int r3 = r3 - r14
            goto L77
        L76:
            int r3 = r3 + r14
        L77:
            if (r3 >= 0) goto L7a
            goto L7b
        L7a:
            r6 = r3
        L7b:
            if (r6 < r0) goto L7f
            int r0 = r0 + r1
            return r0
        L7f:
            return r6
        L80:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekf.a(qd, int, int):int");
    }

    @Override // defpackage.rh
    public final View b(qd qdVar) {
        if (qdVar.ae()) {
            return l(qdVar, k(qdVar));
        }
        if (qdVar.ad()) {
            return l(qdVar, j(qdVar));
        }
        return null;
    }

    @Override // defpackage.rh
    public final int[] c(qd qdVar, View view) {
        boolean z = ebc.a;
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

    @Override // defpackage.rh
    protected final or f(qd qdVar) {
        if (qdVar instanceof qq) {
            return new eke(this, this.b.getContext());
        }
        return null;
    }

    @Override // defpackage.rh
    public final void g(RecyclerView recyclerView) {
        this.b = recyclerView;
        super.g(recyclerView);
    }
}
