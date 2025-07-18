package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import defpackage.a;
import defpackage.ahj;
import defpackage.ajo;
import defpackage.ajq;
import defpackage.ajr;
import defpackage.oe;
import defpackage.oh;
import defpackage.oi;
import defpackage.oj;
import defpackage.on;
import defpackage.oo;
import defpackage.op;
import defpackage.pq;
import defpackage.qd;
import defpackage.qe;
import defpackage.ql;
import defpackage.qs;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    private static final Set J = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));
    private int K;
    boolean a;
    public int b;
    int[] c;
    View[] d;
    final SparseIntArray e;
    final SparseIntArray f;
    public oj g;
    final Rect h;
    int i;
    int j;

    public GridLayoutManager(int i, int i2) {
        super(i2);
        this.a = false;
        this.b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.g = new oh();
        this.h = new Rect();
        this.K = -1;
        this.i = -1;
        this.j = -1;
        r(i);
    }

    private final int bA(int i) {
        if (this.k == 1) {
            RecyclerView recyclerView = this.u;
            return bB(recyclerView.e, recyclerView.N, i);
        }
        RecyclerView recyclerView2 = this.u;
        return bC(recyclerView2.e, recyclerView2.N, i);
    }

    private final int bB(ql qlVar, qs qsVar, int i) {
        if (!qsVar.g) {
            return this.g.c(i, this.b);
        }
        int iA = qlVar.a(i);
        if (iA != -1) {
            return this.g.c(iA, this.b);
        }
        Log.w("GridLayoutManager", a.b(i, "Cannot find span size for pre layout position. "));
        return 0;
    }

    private final int bC(ql qlVar, qs qsVar, int i) {
        if (!qsVar.g) {
            return this.g.a(i, this.b);
        }
        int i2 = this.f.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iA = qlVar.a(i);
        if (iA != -1) {
            return this.g.a(iA, this.b);
        }
        Log.w("GridLayoutManager", a.b(i, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"));
        return 0;
    }

    private final int bD(ql qlVar, qs qsVar, int i) {
        if (!qsVar.g) {
            return this.g.b(i);
        }
        int i2 = this.e.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iA = qlVar.a(i);
        if (iA != -1) {
            return this.g.b(iA);
        }
        Log.w("GridLayoutManager", a.b(i, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"));
        return 1;
    }

    private final Set bE(int i, int i2) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.u;
        int iBD = bD(recyclerView.e, recyclerView.N, i2);
        for (int i3 = i; i3 < i + iBD; i3++) {
            hashSet.add(Integer.valueOf(i3));
        }
        return hashSet;
    }

    private final void bF(int i) {
        int i2;
        int length;
        int[] iArr = this.c;
        int i3 = this.b;
        int i4 = i3 + 1;
        if (iArr == null || (length = iArr.length) != i4 || iArr[length - 1] != i) {
            iArr = new int[i4];
        }
        int i5 = 0;
        iArr[0] = 0;
        int i6 = i / i3;
        int i7 = i % i3;
        int i8 = 0;
        for (int i9 = 1; i9 <= i3; i9++) {
            i5 += i7;
            if (i5 <= 0 || i3 - i5 >= i7) {
                i2 = i6;
            } else {
                i2 = i6 + 1;
                i5 -= i3;
            }
            i8 += i2;
            iArr[i9] = i8;
        }
        this.c = iArr;
    }

    private final void bG() {
        View[] viewArr = this.d;
        if (viewArr != null) {
            if (viewArr.length == this.b) {
                return;
            }
        }
        this.d = new View[this.b];
    }

    private final void bH(View view, int i, boolean z) {
        int iAu;
        int iAu2;
        oi oiVar = (oi) view.getLayoutParams();
        Rect rect = oiVar.d;
        int i2 = rect.top + rect.bottom + oiVar.topMargin + oiVar.bottomMargin;
        int i3 = rect.left + rect.right + oiVar.leftMargin + oiVar.rightMargin;
        int iC = c(oiVar.a, oiVar.b);
        if (this.k == 1) {
            iAu2 = au(iC, i, i3, oiVar.width, false);
            iAu = au(this.l.k(), this.G, i2, oiVar.height, true);
        } else {
            int iAu3 = au(iC, i, i2, oiVar.height, false);
            int iAu4 = au(this.l.k(), this.F, i3, oiVar.width, true);
            iAu = iAu3;
            iAu2 = iAu4;
        }
        bI(view, iAu2, iAu, z);
    }

    private final void bI(View view, int i, int i2, boolean z) {
        boolean zBs;
        qe qeVar = (qe) view.getLayoutParams();
        if (z) {
            zBs = true;
            if (this.B && qd.bm(view.getMeasuredWidth(), i, qeVar.width) && qd.bm(view.getMeasuredHeight(), i2, qeVar.height)) {
                zBs = false;
            }
        } else {
            zBs = bs(view, i, i2, qeVar);
        }
        if (zBs) {
            view.measure(i, i2);
        }
    }

    private final void bJ() {
        int paddingBottom;
        int paddingTop;
        if (this.k == 1) {
            paddingBottom = this.H - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            paddingBottom = this.I - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        bF(paddingBottom - paddingTop);
    }

    private final int bz(int i) {
        if (this.k == 0) {
            RecyclerView recyclerView = this.u;
            return bB(recyclerView.e, recyclerView.N, i);
        }
        RecyclerView recyclerView2 = this.u;
        return bC(recyclerView2.e, recyclerView2.N, i);
    }

    @Override // defpackage.qd
    public final void A(int i, int i2) {
        this.g.a.clear();
        this.g.b.clear();
    }

    @Override // defpackage.qd
    public final void B(int i, int i2) {
        this.g.a.clear();
        this.g.b.clear();
    }

    final int c(int i, int i2) {
        if (this.k != 1 || !ag()) {
            int[] iArr = this.c;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.c;
        int i3 = this.b - i;
        return iArr2[i3] - iArr2[i3 - i2];
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.qd
    public final int d(int i, ql qlVar, qs qsVar) {
        bJ();
        bG();
        return super.d(i, qlVar, qsVar);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.qd
    public final int e(int i, ql qlVar, qs qsVar) {
        bJ();
        bG();
        return super.e(i, qlVar, qsVar);
    }

    @Override // defpackage.qd
    public final int eF(ql qlVar, qs qsVar) {
        if (this.k == 1) {
            return Math.min(this.b, aB());
        }
        if (qsVar.a() <= 0) {
            return 0;
        }
        return bB(qlVar, qsVar, qsVar.a() - 1) + 1;
    }

    @Override // defpackage.qd
    public final int eG(ql qlVar, qs qsVar) {
        if (this.k == 0) {
            return Math.min(this.b, aB());
        }
        if (qsVar.a() <= 0) {
            return 0;
        }
        return bB(qlVar, qsVar, qsVar.a() - 1) + 1;
    }

    @Override // defpackage.qd
    public qe eH(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new oi((ViewGroup.MarginLayoutParams) layoutParams) : new oi(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00cd, code lost:
    
        if (r13 == (r2 > r11)) goto L51;
     */
    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.qd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View eI(android.view.View r23, int r24, defpackage.ql r25, defpackage.qs r26) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.GridLayoutManager.eI(android.view.View, int, ql, qs):android.view.View");
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.qd
    public final void eJ(ql qlVar, qs qsVar, ajr ajrVar) {
        super.eJ(qlVar, qsVar, ajrVar);
        ajrVar.a.setClassName(GridView.class.getName());
        pq pqVar = this.u.n;
        if (pqVar == null || pqVar.a() <= 1) {
            return;
        }
        ajrVar.c(ajo.k);
    }

    @Override // defpackage.qd
    public final void eK(ql qlVar, qs qsVar, View view, ajr ajrVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof oi)) {
            super.aW(view, ajrVar);
            return;
        }
        oi oiVar = (oi) layoutParams;
        int iBB = bB(qlVar, qsVar, oiVar.c.c());
        if (this.k == 0) {
            ajrVar.e(ajq.b(oiVar.a, oiVar.b, iBB, 1, false));
        } else {
            ajrVar.e(ajq.b(iBB, 1, oiVar.a, oiVar.b, false));
        }
    }

    @Override // defpackage.qd
    public final void eL(Rect rect, int i, int i2) {
        int iAr;
        int iAr2;
        if (this.c == null) {
            super.eL(rect, i, i2);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.k == 1) {
            int iHeight = rect.height() + paddingTop;
            RecyclerView recyclerView = this.u;
            int[] iArr = ahj.a;
            iAr2 = ar(i2, iHeight, recyclerView.getMinimumHeight());
            iAr = ar(i, this.c[r7.length - 1] + paddingLeft, this.u.getMinimumWidth());
        } else {
            int iWidth = rect.width() + paddingLeft;
            RecyclerView recyclerView2 = this.u;
            int[] iArr2 = ahj.a;
            iAr = ar(i, iWidth, recyclerView2.getMinimumWidth());
            iAr2 = ar(i2, this.c[r5.length - 1] + paddingTop, this.u.getMinimumHeight());
        }
        this.u.setMeasuredDimension(iAr, iAr2);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.qd
    public final qe f() {
        return this.k == 0 ? new oi(-2, -1) : new oi(-1, -2);
    }

    @Override // defpackage.qd
    public final qe h(Context context, AttributeSet attributeSet) {
        return new oi(context, attributeSet);
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final View i(ql qlVar, qs qsVar, boolean z, boolean z2) {
        int i;
        int iAt;
        int i2;
        int iAt2 = at();
        if (z2) {
            i = -1;
            iAt = at() - 1;
            i2 = -1;
        } else {
            i = iAt2;
            iAt = 0;
            i2 = 1;
        }
        int iA = qsVar.a();
        W();
        int iJ = this.l.j();
        int iF = this.l.f();
        View view = null;
        View view2 = null;
        while (iAt != i) {
            View viewAI = aI(iAt);
            int iAD = aD(viewAI);
            if (iAD >= 0 && iAD < iA && bC(qlVar, qsVar, iAD) == 0) {
                if (((qe) viewAI.getLayoutParams()).c.s()) {
                    if (view2 == null) {
                        view2 = viewAI;
                    }
                } else {
                    if (this.l.d(viewAI) < iF && this.l.a(viewAI) >= iJ) {
                        return viewAI;
                    }
                    if (view == null) {
                        view = viewAI;
                    }
                }
            }
            iAt += i2;
        }
        return view != null ? view : view2;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void k(ql qlVar, qs qsVar, op opVar, oo ooVar) {
        int i;
        int i2;
        int i3;
        int iC;
        int iC2;
        int paddingLeft;
        int paddingTop;
        int iAu;
        int iAu2;
        boolean z;
        View viewA;
        int i4 = this.l.i();
        int i5 = at() > 0 ? this.c[this.b] : 0;
        boolean z2 = i4 != 1073741824;
        if (z2) {
            bJ();
        }
        int i6 = opVar.e;
        int iBC = this.b;
        if (i6 != 1) {
            iBC = bC(qlVar, qsVar, opVar.d) + bD(qlVar, qsVar, opVar.d);
        }
        int i7 = 0;
        while (i7 < this.b && opVar.c(qsVar) && iBC > 0) {
            int i8 = opVar.d;
            int iBD = bD(qlVar, qsVar, i8);
            if (iBD > this.b) {
                throw new IllegalArgumentException("Item at position " + i8 + " requires " + iBD + " spans but GridLayoutManager has only " + this.b + " spans.");
            }
            iBC -= iBD;
            if (iBC < 0 || (viewA = opVar.a(qlVar)) == null) {
                break;
            }
            this.d[i7] = viewA;
            i7++;
        }
        if (i7 == 0) {
            ooVar.b = true;
            return;
        }
        if (i6 == 1) {
            i3 = 1;
            i2 = i7;
            i = 0;
        } else {
            i = i7 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i9 = 0;
        while (i != i2) {
            View view = this.d[i];
            oi oiVar = (oi) view.getLayoutParams();
            int iBD2 = bD(qlVar, qsVar, aD(view));
            oiVar.b = iBD2;
            oiVar.a = i9;
            i9 += iBD2;
            i += i3;
        }
        float f = 0.0f;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            View view2 = this.d[i11];
            if (opVar.l != null) {
                z = false;
                if (i6 == 1) {
                    super.aL(view2, -1, true);
                } else {
                    super.aL(view2, 0, true);
                }
            } else if (i6 == 1) {
                z = false;
                super.aL(view2, -1, false);
            } else {
                z = false;
                super.aL(view2, 0, false);
            }
            aM(view2, this.h);
            bH(view2, i4, z);
            int iB = this.l.b(view2);
            if (iB > i10) {
                i10 = iB;
            }
            float fC = this.l.c(view2) / ((oi) view2.getLayoutParams()).b;
            if (fC > f) {
                f = fC;
            }
        }
        if (z2) {
            bF(Math.max(Math.round(f * this.b), i5));
            i10 = 0;
            for (int i12 = 0; i12 < i7; i12++) {
                View view3 = this.d[i12];
                bH(view3, 1073741824, true);
                int iB2 = this.l.b(view3);
                if (iB2 > i10) {
                    i10 = iB2;
                }
            }
        }
        for (int i13 = 0; i13 < i7; i13++) {
            View view4 = this.d[i13];
            if (this.l.b(view4) != i10) {
                oi oiVar2 = (oi) view4.getLayoutParams();
                Rect rect = oiVar2.d;
                int i14 = rect.top + rect.bottom + oiVar2.topMargin + oiVar2.bottomMargin;
                int i15 = rect.left + rect.right + oiVar2.leftMargin + oiVar2.rightMargin;
                int iC3 = c(oiVar2.a, oiVar2.b);
                if (this.k == 1) {
                    iAu2 = au(iC3, 1073741824, i15, oiVar2.width, false);
                    iAu = View.MeasureSpec.makeMeasureSpec(i10 - i14, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10 - i15, 1073741824);
                    iAu = au(iC3, 1073741824, i14, oiVar2.height, false);
                    iAu2 = iMakeMeasureSpec;
                }
                bI(view4, iAu2, iAu, true);
            }
        }
        ooVar.a = i10;
        if (this.k == 1) {
            if (opVar.f == -1) {
                int i16 = opVar.b;
                paddingTop = i16 - i10;
                iC2 = i16;
            } else {
                paddingTop = opVar.b;
                iC2 = paddingTop + i10;
            }
            paddingLeft = 0;
            iC = 0;
        } else {
            if (opVar.f == -1) {
                int i17 = opVar.b;
                paddingLeft = i17 - i10;
                iC2 = 0;
                iC = i17;
            } else {
                int i18 = opVar.b;
                iC = i18 + i10;
                iC2 = 0;
                paddingLeft = i18;
            }
            paddingTop = iC2;
        }
        for (int i19 = 0; i19 < i7; i19++) {
            View view5 = this.d[i19];
            oi oiVar3 = (oi) view5.getLayoutParams();
            if (this.k != 1) {
                paddingTop = getPaddingTop() + this.c[oiVar3.a];
                iC2 = this.l.c(view5) + paddingTop;
            } else if (ag()) {
                iC = this.c[this.b - oiVar3.a] + getPaddingLeft();
                paddingLeft = iC - this.l.c(view5);
            } else {
                paddingLeft = getPaddingLeft() + this.c[oiVar3.a];
                iC = this.l.c(view5) + paddingLeft;
            }
            int i20 = iC2;
            int i21 = iC;
            int i22 = paddingTop;
            aR(view5, paddingLeft, i22, i21, i20);
            paddingTop = i22;
            iC = i21;
            iC2 = i20;
            if (oiVar3.c.s() || oiVar3.c.v()) {
                ooVar.c = true;
            }
            ooVar.d = view5.hasFocusable() | ooVar.d;
        }
        Arrays.fill(this.d, (Object) null);
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void l(ql qlVar, qs qsVar, on onVar, int i) {
        bJ();
        if (qsVar.a() > 0 && !qsVar.g) {
            int iBC = bC(qlVar, qsVar, onVar.b);
            if (i == 1) {
                while (iBC > 0) {
                    int i2 = onVar.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    onVar.b = i3;
                    iBC = bC(qlVar, qsVar, i3);
                }
            } else {
                int iA = qsVar.a() - 1;
                int i4 = onVar.b;
                while (i4 < iA) {
                    int i5 = i4 + 1;
                    int iBC2 = bC(qlVar, qsVar, i5);
                    if (iBC2 <= iBC) {
                        break;
                    }
                    i4 = i5;
                    iBC = iBC2;
                }
                onVar.b = i4;
            }
        }
        bG();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.qd
    public final void o(ql qlVar, qs qsVar) {
        if (qsVar.g) {
            int iAt = at();
            for (int i = 0; i < iAt; i++) {
                oi oiVar = (oi) aI(i).getLayoutParams();
                int iC = oiVar.c.c();
                this.e.put(iC, oiVar.b);
                this.f.put(iC, oiVar.a);
            }
        }
        super.o(qlVar, qsVar);
        this.e.clear();
        this.f.clear();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.qd
    public final void p(qs qsVar) {
        View viewT;
        super.p(qsVar);
        this.a = false;
        int i = this.K;
        if (i == -1 || (viewT = T(i)) == null) {
            return;
        }
        viewT.sendAccessibilityEvent(67108864);
        this.K = -1;
    }

    public final void r(int i) {
        if (i == this.b) {
            return;
        }
        this.a = true;
        if (i <= 0) {
            throw new IllegalArgumentException(a.b(i, "Span count should be at least 1. Provided "));
        }
        this.b = i;
        this.g.a.clear();
        be();
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void s(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.s(false);
    }

    @Override // defpackage.qd
    public final boolean t(qe qeVar) {
        return qeVar instanceof oi;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x027d A[EDGE_INSN: B:195:0x027d->B:153:0x027d BREAK  A[LOOP:2: B:117:0x01b8->B:126:0x01e6, LOOP_LABEL: LOOP:2: B:117:0x01b8->B:126:0x01e6], EDGE_INSN: B:201:0x027d->B:153:0x027d BREAK  A[LOOP:5: B:135:0x021e->B:146:0x0251, LOOP_LABEL: LOOP:5: B:135:0x021e->B:146:0x0251]] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x028c  */
    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.qd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u(int r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.GridLayoutManager.u(int, android.os.Bundle):boolean");
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.qd
    public final boolean v() {
        return this.r == null && !this.a;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void w(qs qsVar, op opVar, oe oeVar) {
        int iB = this.b;
        for (int i = 0; i < this.b && opVar.c(qsVar) && iB > 0; i++) {
            int i2 = opVar.d;
            oeVar.a(i2, Math.max(0, opVar.g));
            iB -= this.g.b(i2);
            opVar.d += opVar.e;
        }
    }

    @Override // defpackage.qd
    public final void x(int i, int i2) {
        this.g.a.clear();
        this.g.b.clear();
    }

    @Override // defpackage.qd
    public final void y() {
        this.g.a.clear();
        this.g.b.clear();
    }

    @Override // defpackage.qd
    public final void z(int i, int i2) {
        this.g.a.clear();
        this.g.b.clear();
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = false;
        this.b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.g = new oh();
        this.h = new Rect();
        this.K = -1;
        this.i = -1;
        this.j = -1;
        r(aG(context, attributeSet, i, i2).b);
    }
}
