package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class qd {
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public boolean E;
    public int F;
    public int G;
    public int H;
    public int I;
    private final si a;
    private final si b;
    public na t;
    public RecyclerView u;
    public final sj v;
    public final sj w;
    public qr x;
    public boolean y;
    public boolean z;

    public qd() {
        qa qaVar = new qa(this);
        this.a = qaVar;
        qb qbVar = new qb(this);
        this.b = qbVar;
        this.v = new sj(qaVar);
        this.w = new sj(qbVar);
        this.y = false;
        this.z = false;
        this.A = false;
        this.B = true;
        this.C = true;
    }

    public static qc aG(Context context, AttributeSet attributeSet, int i, int i2) {
        qc qcVar = new qc();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hu.a, i, i2);
        qcVar.a = typedArrayObtainStyledAttributes.getInt(0, 1);
        qcVar.b = typedArrayObtainStyledAttributes.getInt(10, 1);
        qcVar.c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        qcVar.d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return qcVar;
    }

    public static int ar(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int au(int r3, int r4, int r5, int r6, boolean r7) {
        /*
            int r3 = r3 - r5
            r5 = 0
            int r3 = java.lang.Math.max(r5, r3)
            r0 = -1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r7 == 0) goto L19
            if (r6 < 0) goto L10
            goto L1b
        L10:
            if (r6 != r0) goto L2f
            if (r4 == r1) goto L1f
            if (r4 == 0) goto L2f
            if (r4 == r2) goto L1f
            goto L2f
        L19:
            if (r6 < 0) goto L1d
        L1b:
            r4 = r2
            goto L31
        L1d:
            if (r6 != r0) goto L21
        L1f:
            r6 = r3
            goto L31
        L21:
            r7 = -2
            if (r6 != r7) goto L2f
            if (r4 == r1) goto L2c
            if (r4 != r2) goto L29
            goto L2c
        L29:
            r6 = r3
            r4 = r5
            goto L31
        L2c:
            r6 = r3
            r4 = r1
            goto L31
        L2f:
            r4 = r5
            r6 = r4
        L31:
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qd.au(int, int, int, int, boolean):int");
    }

    public static boolean bm(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    private final void c(ql qlVar, int i, View view) {
        qv qvVarM = RecyclerView.m(view);
        if (qvVarM.x()) {
            return;
        }
        if (qvVarM.q() && !qvVarM.s() && !this.u.n.b) {
            bd(i);
            qlVar.k(qvVarM);
        } else {
            aI(i);
            this.t.h(i);
            qlVar.l(view);
            this.u.i.f(qvVarM);
        }
    }

    public void B(int i, int i2) {
        bu(i, i2);
    }

    public int C(qs qsVar) {
        return 0;
    }

    public int D(qs qsVar) {
        return 0;
    }

    public int E(qs qsVar) {
        return 0;
    }

    public int F(qs qsVar) {
        return 0;
    }

    public int G(qs qsVar) {
        return 0;
    }

    public int H(qs qsVar) {
        return 0;
    }

    public Parcelable Q() {
        throw null;
    }

    public View T(int i) {
        int iAt = at();
        for (int i2 = 0; i2 < iAt; i2++) {
            View viewAI = aI(i2);
            qv qvVarM = RecyclerView.m(viewAI);
            if (qvVarM != null && qvVarM.c() == i && !qvVarM.x() && (this.u.N.g || !qvVarM.s())) {
                return viewAI;
            }
        }
        return null;
    }

    public void U(String str) {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null) {
            recyclerView.A(str);
        }
    }

    public void X(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.u;
        ql qlVar = recyclerView.e;
        qs qsVar = recyclerView.N;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.u.canScrollVertically(-1) && !this.u.canScrollHorizontally(-1) && !this.u.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        pq pqVar = this.u.n;
        if (pqVar != null) {
            accessibilityEvent.setItemCount(pqVar.a());
        }
    }

    public void Y(Parcelable parcelable) {
        throw null;
    }

    public void Z(int i) {
        throw null;
    }

    public int aA(View view) {
        return view.getTop() - aF(view);
    }

    public final int aB() {
        RecyclerView recyclerView = this.u;
        pq adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }

    public final int aC(View view) {
        return ((qe) view.getLayoutParams()).d.left;
    }

    public final int aD(View view) {
        return ((qe) view.getLayoutParams()).c.c();
    }

    public final int aE(View view) {
        return ((qe) view.getLayoutParams()).d.right;
    }

    public final int aF(View view) {
        return ((qe) view.getLayoutParams()).d.top;
    }

    public final View aH(View view) {
        View viewP;
        RecyclerView recyclerView = this.u;
        if (recyclerView == null || (viewP = recyclerView.p(view)) == null || this.t.l(viewP)) {
            return null;
        }
        return viewP;
    }

    public final View aI(int i) {
        na naVar = this.t;
        if (naVar != null) {
            return naVar.d(i);
        }
        return null;
    }

    public final View aJ() {
        View focusedChild;
        RecyclerView recyclerView = this.u;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.t.l(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    public View aK(View view, int i) {
        return null;
    }

    public final void aL(View view, int i, boolean z) {
        qv qvVarM = RecyclerView.m(view);
        if (z || qvVarM.s()) {
            this.u.i.b(qvVarM);
        } else {
            this.u.i.f(qvVarM);
        }
        qe qeVar = (qe) view.getLayoutParams();
        if (qvVarM.y() || qvVarM.t()) {
            if (qvVarM.t()) {
                qvVarM.m.n(qvVarM);
            } else {
                qvVarM.h();
            }
            this.t.g(view, i, view.getLayoutParams(), false);
        } else if (view.getParent() == this.u) {
            int iC = this.t.c(view);
            if (i == -1) {
                i = this.t.a();
            }
            if (iC == -1) {
                throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.u.indexOfChild(view) + this.u.r());
            }
            if (iC != i) {
                qd qdVar = this.u.o;
                View viewAI = qdVar.aI(iC);
                if (viewAI == null) {
                    throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iC + qdVar.u.toString());
                }
                qdVar.aI(iC);
                qdVar.t.h(iC);
                qe qeVar2 = (qe) viewAI.getLayoutParams();
                qv qvVarM2 = RecyclerView.m(viewAI);
                if (qvVarM2.s()) {
                    qdVar.u.i.b(qvVarM2);
                } else {
                    qdVar.u.i.f(qvVarM2);
                }
                qdVar.t.g(viewAI, i, qeVar2, qvVarM2.s());
            }
        } else {
            this.t.f(view, i, false);
            qeVar.e = true;
            qr qrVar = this.x;
            if (qrVar != null && qrVar.k && qrVar.h.e(view) == qrVar.g) {
                qrVar.l = view;
            }
        }
        if (qeVar.f) {
            qvVarM.a.invalidate();
            qeVar.f = false;
        }
    }

    public final void aM(View view, Rect rect) {
        RecyclerView recyclerView = this.u;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.h(view));
        }
    }

    public final void aN(ql qlVar) {
        int iAt = at();
        while (true) {
            iAt--;
            if (iAt < 0) {
                return;
            } else {
                c(qlVar, iAt, aI(iAt));
            }
        }
    }

    public final void aO(View view, ql qlVar) {
        c(qlVar, this.t.c(view), view);
    }

    public final void aP(RecyclerView recyclerView) {
        this.z = true;
        aV(recyclerView);
    }

    public void aQ(View view, Rect rect) {
        RecyclerView.O(view, rect);
    }

    public final void aR(View view, int i, int i2, int i3, int i4) {
        qe qeVar = (qe) view.getLayoutParams();
        Rect rect = qeVar.d;
        view.layout(i + rect.left + qeVar.leftMargin, i2 + rect.top + qeVar.topMargin, (i3 - rect.right) - qeVar.rightMargin, (i4 - rect.bottom) - qeVar.bottomMargin);
    }

    public void aS(int i) {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null) {
            int iA = recyclerView.h.a();
            for (int i2 = 0; i2 < iA; i2++) {
                recyclerView.h.d(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void aT(int i) {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null) {
            int iA = recyclerView.h.a();
            for (int i2 = 0; i2 < iA; i2++) {
                recyclerView.h.d(i2).offsetTopAndBottom(i);
            }
        }
    }

    public final void aW(View view, ajr ajrVar) {
        qv qvVarM = RecyclerView.m(view);
        if (qvVarM == null || qvVarM.s() || this.t.l(qvVarM.a)) {
            return;
        }
        RecyclerView recyclerView = this.u;
        eK(recyclerView.e, recyclerView.N, view, ajrVar);
    }

    public void aX(ql qlVar, qs qsVar, int i, int i2) {
        this.u.F(i, i2);
    }

    public final void aZ() {
        int iAt = at();
        while (true) {
            iAt--;
            if (iAt < 0) {
                return;
            } else {
                this.t.k(iAt);
            }
        }
    }

    public boolean ad() {
        throw null;
    }

    public boolean ae() {
        throw null;
    }

    public boolean af() {
        return this.A;
    }

    public boolean ah() {
        return false;
    }

    public boolean aj() {
        return false;
    }

    public void aq(RecyclerView recyclerView, int i) {
        throw null;
    }

    public final int as(View view) {
        return ((qe) view.getLayoutParams()).d.bottom;
    }

    public final int at() {
        na naVar = this.t;
        if (naVar != null) {
            return naVar.a();
        }
        return 0;
    }

    public int av(View view) {
        return view.getBottom() + as(view);
    }

    public int aw(View view) {
        return view.getLeft() - aC(view);
    }

    public final int ax(View view) {
        Rect rect = ((qe) view.getLayoutParams()).d;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public final int ay(View view) {
        Rect rect = ((qe) view.getLayoutParams()).d;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public int az(View view) {
        return view.getRight() + aE(view);
    }

    public void ba(ql qlVar) {
        int iAt = at();
        while (true) {
            iAt--;
            if (iAt < 0) {
                return;
            }
            if (!RecyclerView.m(aI(iAt)).x()) {
                bc(iAt, qlVar);
            }
        }
    }

    public final void bb(ql qlVar) {
        ArrayList arrayList = qlVar.a;
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((qv) arrayList.get(i)).a;
            qv qvVarM = RecyclerView.m(view);
            if (!qvVarM.x()) {
                qvVarM.m(false);
                if (qvVarM.u()) {
                    this.u.removeDetachedView(view, false);
                }
                px pxVar = this.u.F;
                if (pxVar != null) {
                    pxVar.c(qvVarM);
                }
                qvVarM.m(true);
                qlVar.g(view);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = qlVar.b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.u.invalidate();
        }
    }

    public final void bc(int i, ql qlVar) {
        View viewAI = aI(i);
        bd(i);
        qlVar.j(viewAI);
    }

    public final void bd(int i) {
        if (aI(i) != null) {
            this.t.k(i);
        }
    }

    public final void be() {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void bf(RecyclerView recyclerView) {
        bh(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final void bg(boolean z) {
        if (z != this.C) {
            this.C = z;
            this.D = 0;
            RecyclerView recyclerView = this.u;
            if (recyclerView != null) {
                recyclerView.e.o();
            }
        }
    }

    public final void bh(int i, int i2) {
        this.H = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.F = mode;
        if (mode == 0 && !RecyclerView.a) {
            this.H = 0;
        }
        this.I = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.G = mode2;
        if (mode2 != 0 || RecyclerView.a) {
            return;
        }
        this.I = 0;
    }

    public final void bi(int i, int i2) {
        int iAt = at();
        if (iAt == 0) {
            this.u.F(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MIN_VALUE;
        for (int i7 = 0; i7 < iAt; i7++) {
            View viewAI = aI(i7);
            Rect rect = this.u.l;
            aQ(viewAI, rect);
            if (rect.left < i4) {
                i4 = rect.left;
            }
            if (rect.right > i3) {
                i3 = rect.right;
            }
            if (rect.top < i5) {
                i5 = rect.top;
            }
            if (rect.bottom > i6) {
                i6 = rect.bottom;
            }
        }
        this.u.l.set(i4, i5, i3, i6);
        eL(this.u.l, i, i2);
    }

    public final void bj(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.u = null;
            this.t = null;
            this.H = 0;
            this.I = 0;
        } else {
            this.u = recyclerView;
            this.t = recyclerView.h;
            this.H = recyclerView.getWidth();
            this.I = recyclerView.getHeight();
        }
        this.F = 1073741824;
        this.G = 1073741824;
    }

    public void bk(qr qrVar) {
        qr qrVar2 = this.x;
        if (qrVar2 != null && qrVar != qrVar2 && qrVar2.k) {
            qrVar2.n();
        }
        this.x = qrVar;
        RecyclerView recyclerView = this.u;
        recyclerView.K.d();
        if (qrVar.m) {
            Log.w("RecyclerView", "An instance of " + qrVar.getClass().getSimpleName() + " was started more than once. Each instance of" + qrVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        qrVar.h = recyclerView;
        qrVar.i = this;
        int i = qrVar.g;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        qrVar.h.N.a = i;
        qrVar.k = true;
        qrVar.j = true;
        qrVar.l = qrVar.l(qrVar.g);
        qrVar.h.K.b();
        qrVar.m = true;
    }

    public final boolean bl() {
        RecyclerView recyclerView = this.u;
        return recyclerView != null && recyclerView.hasFocus();
    }

    public final boolean bn() {
        qr qrVar = this.x;
        return qrVar != null && qrVar.k;
    }

    public boolean bo(RecyclerView recyclerView, ArrayList arrayList, int i, int i2) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0087 A[PHI: r9
  0x0087: PHI (r9v8 int) = (r9v5 int), (r9v18 int) binds: [B:25:0x007a, B:18:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean bp(defpackage.ql r9, defpackage.qs r10, int r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qd.bp(ql, qs, int, android.os.Bundle):boolean");
    }

    public boolean bq(RecyclerView recyclerView, View view, Rect rect, boolean z) {
        return br(recyclerView, view, rect, z, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ae, code lost:
    
        if (r2 != 0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean br(android.support.v7.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.getPaddingLeft()
            int r1 = r8.getPaddingTop()
            int r2 = r8.H
            int r3 = r8.getPaddingRight()
            int r2 = r2 - r3
            int r3 = r8.I
            int r4 = r8.getPaddingBottom()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            int r5 = r5 - r1
            int r11 = r11 - r3
            r0 = 0
            int r1 = java.lang.Math.min(r0, r4)
            int r10 = r10 - r2
            int r2 = java.lang.Math.min(r0, r5)
            int r3 = java.lang.Math.max(r0, r10)
            int r11 = java.lang.Math.max(r0, r11)
            android.support.v7.widget.RecyclerView r6 = r8.u
            int r6 = r6.getLayoutDirection()
            r7 = 1
            if (r6 != r7) goto L5f
            if (r3 == 0) goto L5a
            r1 = r3
            goto L65
        L5a:
            int r1 = java.lang.Math.max(r1, r10)
            goto L65
        L5f:
            if (r1 != 0) goto L65
            int r1 = java.lang.Math.min(r4, r3)
        L65:
            if (r2 == 0) goto L68
            goto L6c
        L68:
            int r2 = java.lang.Math.min(r5, r11)
        L6c:
            int[] r10 = new int[]{r1, r2}
            r10 = r10[r0]
            if (r13 == 0) goto Lac
            android.view.View r11 = r9.getFocusedChild()
            if (r11 != 0) goto L7b
            goto Lb1
        L7b:
            int r13 = r8.getPaddingLeft()
            int r1 = r8.getPaddingTop()
            int r3 = r8.H
            int r4 = r8.getPaddingRight()
            int r3 = r3 - r4
            int r4 = r8.I
            int r5 = r8.getPaddingBottom()
            int r4 = r4 - r5
            android.support.v7.widget.RecyclerView r5 = r8.u
            android.graphics.Rect r5 = r5.l
            r8.aQ(r11, r5)
            int r11 = r5.left
            int r11 = r11 - r10
            if (r11 >= r3) goto Lb1
            int r11 = r5.right
            int r11 = r11 - r10
            if (r11 <= r13) goto Lb1
            int r11 = r5.top
            int r11 = r11 - r2
            if (r11 >= r4) goto Lb1
            int r11 = r5.bottom
            int r11 = r11 - r2
            if (r11 <= r1) goto Lb1
        Lac:
            if (r10 != 0) goto Lb2
            if (r2 == 0) goto Lb1
            goto Lb3
        Lb1:
            return r0
        Lb2:
            r0 = r10
        Lb3:
            if (r12 == 0) goto Lb9
            r9.scrollBy(r0, r2)
            goto Lbc
        Lb9:
            r9.ak(r0, r2)
        Lbc:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qd.br(android.support.v7.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public boolean bs(View view, int i, int i2, qe qeVar) {
        return (!view.isLayoutRequested() && this.B && bm(view.getWidth(), i, qeVar.width) && bm(view.getHeight(), i2, qeVar.height)) ? false : true;
    }

    public final void bt(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((qe) view.getLayoutParams()).d;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.u != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.u.m;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public boolean bv(RecyclerView recyclerView, View view, View view2) {
        return bn() || recyclerView.au();
    }

    public final void bw(Runnable runnable) {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null) {
            recyclerView.removeCallbacks(runnable);
        }
    }

    public final void bx(RecyclerView recyclerView) {
        this.z = false;
        ao(recyclerView);
    }

    public final void by(View view, int i) {
        qe qeVar = (qe) view.getLayoutParams();
        Rect rectH = this.u.h(view);
        int i2 = rectH.left + rectH.right;
        int i3 = rectH.top + rectH.bottom;
        int iAu = au(this.H, this.F, getPaddingLeft() + getPaddingRight() + qeVar.leftMargin + qeVar.rightMargin + i + i2, qeVar.width, ad());
        int iAu2 = au(this.I, this.G, getPaddingTop() + getPaddingBottom() + qeVar.topMargin + qeVar.bottomMargin + i3, qeVar.height, ae());
        if (bs(view, iAu, iAu2, qeVar)) {
            view.measure(iAu, iAu2);
        }
    }

    public int d(int i, ql qlVar, qs qsVar) {
        throw null;
    }

    public int e(int i, ql qlVar, qs qsVar) {
        throw null;
    }

    public int eF(ql qlVar, qs qsVar) {
        RecyclerView recyclerView = this.u;
        if (recyclerView == null || recyclerView.n == null || !ad()) {
            return 1;
        }
        return this.u.n.a();
    }

    public int eG(ql qlVar, qs qsVar) {
        RecyclerView recyclerView = this.u;
        if (recyclerView == null || recyclerView.n == null || !ae()) {
            return 1;
        }
        return this.u.n.a();
    }

    public qe eH(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof qe ? new qe((qe) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new qe((ViewGroup.MarginLayoutParams) layoutParams) : new qe(layoutParams);
    }

    public View eI(View view, int i, ql qlVar, qs qsVar) {
        return null;
    }

    public void eJ(ql qlVar, qs qsVar, ajr ajrVar) {
        if (this.u.canScrollVertically(-1) || this.u.canScrollHorizontally(-1)) {
            ajrVar.a.addAction(8192);
            ajrVar.j();
            ajrVar.i();
        }
        if (this.u.canScrollVertically(1) || this.u.canScrollHorizontally(1)) {
            ajrVar.a.addAction(4096);
            ajrVar.j();
            ajrVar.i();
        }
        ajrVar.d(ajp.a(eG(qlVar, qsVar), eF(qlVar, qsVar)));
    }

    public void eK(ql qlVar, qs qsVar, View view, ajr ajrVar) {
        ajrVar.e(ajq.b(ae() ? aD(view) : 0, 1, ad() ? aD(view) : 0, 1, false));
    }

    public void eL(Rect rect, int i, int i2) {
        int iWidth = rect.width() + getPaddingLeft() + getPaddingRight();
        int iHeight = rect.height() + getPaddingTop() + getPaddingBottom();
        RecyclerView recyclerView = this.u;
        int[] iArr = ahj.a;
        this.u.setMeasuredDimension(ar(i, iWidth, recyclerView.getMinimumWidth()), ar(i2, iHeight, this.u.getMinimumHeight()));
    }

    public abstract qe f();

    public final int getPaddingBottom() {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int getPaddingEnd() {
        RecyclerView recyclerView = this.u;
        if (recyclerView == null) {
            return 0;
        }
        int[] iArr = ahj.a;
        return recyclerView.getPaddingEnd();
    }

    public final int getPaddingLeft() {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int getPaddingRight() {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int getPaddingStart() {
        RecyclerView recyclerView = this.u;
        if (recyclerView == null) {
            return 0;
        }
        int[] iArr = ahj.a;
        return recyclerView.getPaddingStart();
    }

    public final int getPaddingTop() {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public qe h(Context context, AttributeSet attributeSet) {
        return new qe(context, attributeSet);
    }

    public void o(ql qlVar, qs qsVar) {
        throw null;
    }

    public boolean t(qe qeVar) {
        return qeVar != null;
    }

    public boolean u(int i, Bundle bundle) {
        RecyclerView recyclerView = this.u;
        return bp(recyclerView.e, recyclerView.N, i, bundle);
    }

    public boolean v() {
        return false;
    }

    public void y() {
    }

    public void aV(RecyclerView recyclerView) {
    }

    public void aY(int i) {
    }

    public void ao(RecyclerView recyclerView) {
    }

    public void p(qs qsVar) {
    }

    public void A(int i, int i2) {
    }

    public void aU(pq pqVar, pq pqVar2) {
    }

    public void al(int i, oe oeVar) {
    }

    public void bu(int i, int i2) {
    }

    public void x(int i, int i2) {
    }

    public void z(int i, int i2) {
    }

    public void ak(int i, int i2, qs qsVar, oe oeVar) {
    }
}
