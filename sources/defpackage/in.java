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
public abstract class in {
    public int A;
    public int B;
    public int C;
    public int D;
    public final awy E;
    public final awy F;
    private final ka a;
    private final ka b;
    gs r;
    public RecyclerView s;
    public iw t;
    public boolean u;
    public boolean v;
    public final boolean w;
    public boolean x;
    public int y;
    public boolean z;

    public in() {
        il ilVar = new il(this, 1);
        this.a = ilVar;
        il ilVar2 = new il(this, 0);
        this.b = ilVar2;
        this.E = new awy(ilVar);
        this.F = new awy(ilVar2);
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = true;
    }

    public static int ak(int i, int i2, int i3) {
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
    public static int am(int r3, int r4, int r5, int r6, boolean r7) {
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.in.am(int, int, int, int, boolean):int");
    }

    public static im az(Context context, AttributeSet attributeSet, int i, int i2) {
        im imVar = new im();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cw.a, i, i2);
        imVar.a = typedArrayObtainStyledAttributes.getInt(0, 1);
        imVar.b = typedArrayObtainStyledAttributes.getInt(10, 1);
        imVar.c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        imVar.d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return imVar;
    }

    public static boolean bf(int i, int i2, int i3) {
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

    public static final int bn(View view) {
        Rect rect = ((io) view.getLayoutParams()).d;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static final int bo(View view) {
        Rect rect = ((io) view.getLayoutParams()).d;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static final int bp(View view) {
        return ((io) view.getLayoutParams()).b();
    }

    public static final void br(View view, int i, int i2, int i3, int i4) {
        io ioVar = (io) view.getLayoutParams();
        Rect rect = ioVar.d;
        view.layout(i + rect.left + ioVar.leftMargin, i2 + rect.top + ioVar.topMargin, (i3 - rect.right) - ioVar.rightMargin, (i4 - rect.bottom) - ioVar.bottomMargin);
    }

    private final void c(View view, int i, boolean z) {
        ja jaVarF = RecyclerView.f(view);
        if (z || jaVarF.s()) {
            this.s.V.o(jaVarF);
        } else {
            this.s.V.r(jaVarF);
        }
        io ioVar = (io) view.getLayoutParams();
        if (jaVarF.y() || jaVarF.t()) {
            if (jaVarF.t()) {
                jaVarF.m();
            } else {
                jaVarF.f();
            }
            this.r.h(view, i, view.getLayoutParams(), false);
        } else if (view.getParent() == this.s) {
            int iD = this.r.d(view);
            if (i == -1) {
                i = this.r.a();
            }
            if (iD == -1) {
                throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.s.indexOfChild(view) + this.s.i());
            }
            if (iD != i) {
                in inVar = this.s.m;
                View viewAB = inVar.aB(iD);
                if (viewAB == null) {
                    throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iD + inVar.s.toString());
                }
                inVar.aL(iD);
                io ioVar2 = (io) viewAB.getLayoutParams();
                ja jaVarF2 = RecyclerView.f(viewAB);
                if (jaVarF2.s()) {
                    inVar.s.V.o(jaVarF2);
                } else {
                    inVar.s.V.r(jaVarF2);
                }
                inVar.r.h(viewAB, i, ioVar2, jaVarF2.s());
            }
        } else {
            this.r.g(view, i, false);
            ioVar.e = true;
            iw iwVar = this.t;
            if (iwVar != null && iwVar.e && iw.k(view) == iwVar.a) {
                iwVar.f = view;
            }
        }
        if (ioVar.f) {
            jaVarF.b.invalidate();
            ioVar.f = false;
        }
    }

    private final void i(ir irVar, int i, View view) {
        ja jaVarF = RecyclerView.f(view);
        if (jaVarF.x()) {
            return;
        }
        if (!jaVarF.q() || jaVarF.s()) {
            aL(i);
            irVar.k(view);
            this.s.V.r(jaVarF);
        } else {
            ig igVar = this.s.l;
            aW(i);
            irVar.j(jaVarF);
        }
    }

    public int A(ix ixVar) {
        return 0;
    }

    public int B(ix ixVar) {
        return 0;
    }

    public int C(ix ixVar) {
        return 0;
    }

    public int D(ix ixVar) {
        return 0;
    }

    public int E(ix ixVar) {
        return 0;
    }

    public int F(ix ixVar) {
        return 0;
    }

    public Parcelable K() {
        throw null;
    }

    public View M(int i) {
        int iAl = al();
        for (int i2 = 0; i2 < iAl; i2++) {
            View viewAB = aB(i2);
            ja jaVarF = RecyclerView.f(viewAB);
            if (jaVarF != null && jaVarF.b() == i && !jaVarF.x() && (this.s.K.g || !jaVarF.s())) {
                return viewAB;
            }
        }
        return null;
    }

    public void N(String str) {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            recyclerView.p(str);
        }
    }

    public void Q(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.s;
        ir irVar = recyclerView.f;
        ix ixVar = recyclerView.K;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.s.canScrollVertically(-1) && !this.s.canScrollHorizontally(-1) && !this.s.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        ig igVar = this.s.l;
        if (igVar != null) {
            accessibilityEvent.setItemCount(igVar.a());
        }
    }

    public void R(Parcelable parcelable) {
        throw null;
    }

    public void S(int i) {
        throw null;
    }

    public boolean V() {
        throw null;
    }

    public boolean W() {
        throw null;
    }

    public boolean X() {
        return false;
    }

    public boolean Z() {
        return false;
    }

    public int a(ir irVar, ix ixVar) {
        ig igVar;
        RecyclerView recyclerView = this.s;
        if (recyclerView == null || (igVar = recyclerView.l) == null || !V()) {
            return 1;
        }
        return igVar.a();
    }

    public final View aA(View view) {
        View viewH;
        RecyclerView recyclerView = this.s;
        if (recyclerView == null || (viewH = recyclerView.h(view)) == null || this.r.k(viewH)) {
            return null;
        }
        return viewH;
    }

    public final View aB(int i) {
        gs gsVar = this.r;
        if (gsVar != null) {
            return gsVar.e(i);
        }
        return null;
    }

    public final View aC() {
        View focusedChild;
        RecyclerView recyclerView = this.s;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.r.k(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    public View aD(View view, int i) {
        return null;
    }

    public final void aE(View view) {
        aF(view, -1);
    }

    public final void aF(View view, int i) {
        c(view, i, true);
    }

    public final void aG(View view) {
        aH(view, -1);
    }

    public final void aH(View view, int i) {
        c(view, i, false);
    }

    public final void aI(View view, Rect rect) {
        RecyclerView recyclerView = this.s;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.c(view));
        }
    }

    public final void aJ(ir irVar) {
        int iAl = al();
        while (true) {
            iAl--;
            if (iAl < 0) {
                return;
            } else {
                i(irVar, iAl, aB(iAl));
            }
        }
    }

    public final void aK(View view, ir irVar) {
        i(irVar, this.r.d(view), view);
    }

    public final void aL(int i) {
        aB(i);
        this.r.i(i);
    }

    public void aM(View view, Rect rect) {
        RecyclerView.D(view, rect);
    }

    public void aN(int i) {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            int iA = recyclerView.h.a();
            for (int i2 = 0; i2 < iA; i2++) {
                recyclerView.h.e(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void aO(int i) {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            int iA = recyclerView.h.a();
            for (int i2 = 0; i2 < iA; i2++) {
                recyclerView.h.e(i2).offsetTopAndBottom(i);
            }
        }
    }

    public final void aP(View view, sm smVar) {
        ja jaVarF = RecyclerView.f(view);
        if (jaVarF == null || jaVarF.s() || this.r.k(jaVarF.b)) {
            return;
        }
        RecyclerView recyclerView = this.s;
        n(recyclerView.f, recyclerView.K, view, smVar);
    }

    public void aQ(ir irVar, ix ixVar, int i, int i2) {
        this.s.u(i, i2);
    }

    public void aS(ir irVar) {
        int iAl = al();
        while (true) {
            iAl--;
            if (iAl < 0) {
                return;
            }
            if (!RecyclerView.f(aB(iAl)).x()) {
                aV(iAl, irVar);
            }
        }
    }

    public final void aT(ir irVar) {
        ArrayList arrayList = irVar.a;
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((ja) arrayList.get(i)).b;
            ja jaVarF = RecyclerView.f(view);
            if (!jaVarF.x()) {
                jaVarF.k(false);
                if (jaVarF.u()) {
                    this.s.removeDetachedView(view, false);
                }
                ik ikVar = this.s.C;
                if (ikVar != null) {
                    ikVar.d(jaVarF);
                }
                jaVarF.k(true);
                ja jaVarF2 = RecyclerView.f(view);
                jaVarF2.l = null;
                jaVarF2.m = false;
                jaVarF2.f();
                irVar.j(jaVarF2);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = irVar.b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.s.invalidate();
        }
    }

    public final void aU(View view, ir irVar) {
        gs gsVar = this.r;
        int i = gsVar.c;
        if (i == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            gsVar.c = 1;
            gsVar.d = view;
            byj byjVar = gsVar.e;
            int iX = byjVar.x(view);
            if (iX >= 0) {
                if (gsVar.a.g(iX)) {
                    gsVar.l(view);
                }
                byjVar.A(iX);
            }
            gsVar.c = 0;
            gsVar.d = null;
            irVar.i(view);
        } catch (Throwable th) {
            gsVar.c = 0;
            gsVar.d = null;
            throw th;
        }
    }

    public final void aV(int i, ir irVar) {
        View viewAB = aB(i);
        aW(i);
        irVar.i(viewAB);
    }

    public final void aW(int i) {
        if (aB(i) != null) {
            gs gsVar = this.r;
            int i2 = gsVar.c;
            if (i2 == 1) {
                throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
            }
            if (i2 == 2) {
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            try {
                int iB = gsVar.b(i);
                byj byjVar = gsVar.e;
                View viewY = byjVar.y(iB);
                if (viewY == null) {
                    return;
                }
                gsVar.c = 1;
                gsVar.d = viewY;
                if (gsVar.a.g(iB)) {
                    gsVar.l(viewY);
                }
                byjVar.A(iB);
            } finally {
                gsVar.c = 0;
                gsVar.d = null;
            }
        }
    }

    public final void aX() {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void aY(RecyclerView recyclerView) {
        aZ(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final void aZ(int i, int i2) {
        this.C = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.A = mode;
        if (mode == 0 && !RecyclerView.a) {
            this.C = 0;
        }
        this.D = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.B = mode2;
        if (mode2 != 0 || RecyclerView.a) {
            return;
        }
        this.D = 0;
    }

    public boolean ab() {
        return false;
    }

    public void ac(int i, int i2, ix ixVar, hk hkVar) {
        throw null;
    }

    public void aj(RecyclerView recyclerView, int i) {
        throw null;
    }

    public final int al() {
        gs gsVar = this.r;
        if (gsVar != null) {
            return gsVar.a();
        }
        return 0;
    }

    public int an(View view) {
        return view.getBottom() + ((io) view.getLayoutParams()).d.bottom;
    }

    public int ao(View view) {
        return view.getLeft() - ((io) view.getLayoutParams()).d.left;
    }

    public int ap(View view) {
        return view.getRight() + ((io) view.getLayoutParams()).d.right;
    }

    public int aq(View view) {
        return view.getTop() - ((io) view.getLayoutParams()).d.top;
    }

    public final int ar() {
        RecyclerView recyclerView = this.s;
        ig igVar = recyclerView != null ? recyclerView.l : null;
        if (igVar != null) {
            return igVar.a();
        }
        return 0;
    }

    public final int as() {
        return this.s.getLayoutDirection();
    }

    public final int at() {
        RecyclerView recyclerView = this.s;
        int[] iArr = qv.a;
        return recyclerView.getMinimumHeight();
    }

    public final int au() {
        RecyclerView recyclerView = this.s;
        int[] iArr = qv.a;
        return recyclerView.getMinimumWidth();
    }

    public final int av() {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int aw() {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int ax() {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int ay() {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int b(ir irVar, ix ixVar) {
        ig igVar;
        RecyclerView recyclerView = this.s;
        if (recyclerView == null || (igVar = recyclerView.l) == null || !W()) {
            return 1;
        }
        return igVar.a();
    }

    public final void ba(int i, int i2) {
        this.s.setMeasuredDimension(i, i2);
    }

    public final void bb(int i, int i2) {
        int iAl = al();
        if (iAl == 0) {
            this.s.u(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MIN_VALUE;
        for (int i7 = 0; i7 < iAl; i7++) {
            View viewAB = aB(i7);
            Rect rect = this.s.j;
            aM(viewAB, rect);
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
        this.s.j.set(i4, i5, i3, i6);
        q(this.s.j, i, i2);
    }

    public final void bc(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.s = null;
            this.r = null;
            this.C = 0;
            this.D = 0;
        } else {
            this.s = recyclerView;
            this.r = recyclerView.h;
            this.C = recyclerView.getWidth();
            this.D = recyclerView.getHeight();
        }
        this.A = 1073741824;
        this.B = 1073741824;
    }

    public void bd(iw iwVar) {
        iw iwVar2 = this.t;
        if (iwVar2 != null && iwVar != iwVar2 && iwVar2.e) {
            iwVar2.e();
        }
        this.t = iwVar;
        RecyclerView recyclerView = this.s;
        recyclerView.H.d();
        if (iwVar.g) {
            Log.w("RecyclerView", "An instance of " + iwVar.getClass().getSimpleName() + " was started more than once. Each instance of" + iwVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        iwVar.b = recyclerView;
        iwVar.c = this;
        int i = iwVar.a;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        iwVar.b.K.a = i;
        iwVar.e = true;
        iwVar.d = true;
        iwVar.f = iwVar.c(iwVar.a);
        iwVar.b.H.b();
        iwVar.g = true;
    }

    public final boolean be() {
        RecyclerView recyclerView = this.s;
        return recyclerView != null && recyclerView.hasFocus();
    }

    public final boolean bg() {
        iw iwVar = this.t;
        return iwVar != null && iwVar.e;
    }

    public boolean bh(RecyclerView recyclerView, ArrayList arrayList, int i, int i2) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0087 A[PHI: r9
  0x0087: PHI (r9v8 int) = (r9v5 int), (r9v18 int) binds: [B:25:0x007a, B:18:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean bi(defpackage.ir r9, defpackage.ix r10, int r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.in.bi(ir, ix, int, android.os.Bundle):boolean");
    }

    public boolean bj(RecyclerView recyclerView, View view, Rect rect, boolean z) {
        return bk(recyclerView, view, rect, z, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ac, code lost:
    
        if (r2 != 0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean bk(android.support.v7.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.aw()
            int r1 = r8.ay()
            int r2 = r8.C
            int r3 = r8.ax()
            int r2 = r2 - r3
            int r3 = r8.D
            int r4 = r8.av()
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
            int r6 = r8.as()
            r7 = 1
            if (r6 != r7) goto L5d
            if (r3 == 0) goto L58
            r1 = r3
            goto L63
        L58:
            int r1 = java.lang.Math.max(r1, r10)
            goto L63
        L5d:
            if (r1 != 0) goto L63
            int r1 = java.lang.Math.min(r4, r3)
        L63:
            if (r2 == 0) goto L66
            goto L6a
        L66:
            int r2 = java.lang.Math.min(r5, r11)
        L6a:
            int[] r10 = new int[]{r1, r2}
            r10 = r10[r0]
            if (r13 == 0) goto Laa
            android.view.View r11 = r9.getFocusedChild()
            if (r11 != 0) goto L79
            goto Laf
        L79:
            int r13 = r8.aw()
            int r1 = r8.ay()
            int r3 = r8.C
            int r4 = r8.ax()
            int r3 = r3 - r4
            int r4 = r8.D
            int r5 = r8.av()
            int r4 = r4 - r5
            android.support.v7.widget.RecyclerView r5 = r8.s
            android.graphics.Rect r5 = r5.j
            r8.aM(r11, r5)
            int r11 = r5.left
            int r11 = r11 - r10
            if (r11 >= r3) goto Laf
            int r11 = r5.right
            int r11 = r11 - r10
            if (r11 <= r13) goto Laf
            int r11 = r5.top
            int r11 = r11 - r2
            if (r11 >= r4) goto Laf
            int r11 = r5.bottom
            int r11 = r11 - r2
            if (r11 <= r1) goto Laf
        Laa:
            if (r10 != 0) goto Lb0
            if (r2 == 0) goto Laf
            goto Lb1
        Laf:
            return r0
        Lb0:
            r0 = r10
        Lb1:
            if (r12 == 0) goto Lb7
            r9.scrollBy(r0, r2)
            goto Lba
        Lb7:
            r9.R(r0, r2)
        Lba:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.in.bk(android.support.v7.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public final boolean bl(View view, int i, int i2, io ioVar) {
        return (!view.isLayoutRequested() && this.w && bf(view.getWidth(), i, ioVar.width) && bf(view.getHeight(), i2, ioVar.height)) ? false : true;
    }

    public final void bm() {
        this.v = true;
    }

    public final void bq(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((io) view.getLayoutParams()).d;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.s != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.s.k;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public boolean bt(RecyclerView recyclerView, View view, View view2) {
        return bg() || recyclerView.ac();
    }

    public final void bu(Runnable runnable) {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            recyclerView.removeCallbacks(runnable);
        }
    }

    public final void bv(RecyclerView recyclerView) {
        this.v = false;
        ah(recyclerView);
    }

    public int d(int i, ir irVar, ix ixVar) {
        throw null;
    }

    public int e(int i, ir irVar, ix ixVar) {
        throw null;
    }

    public abstract io f();

    public io g(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof io ? new io((io) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new io((ViewGroup.MarginLayoutParams) layoutParams) : new io(layoutParams);
    }

    public io h(Context context, AttributeSet attributeSet) {
        return new io(context, attributeSet);
    }

    public View j(View view, int i, ir irVar, ix ixVar) {
        return null;
    }

    public void m(ir irVar, ix ixVar, sm smVar) {
        if (this.s.canScrollVertically(-1) || this.s.canScrollHorizontally(-1)) {
            smVar.d(8192);
            smVar.n();
            smVar.m();
        }
        if (this.s.canScrollVertically(1) || this.s.canScrollHorizontally(1)) {
            smVar.d(4096);
            smVar.n();
            smVar.m();
        }
        smVar.i(asv.ab(b(irVar, ixVar), a(irVar, ixVar)));
    }

    public void n(ir irVar, ix ixVar, View view, sm smVar) {
        smVar.j(asv.aa(W() ? bp(view) : 0, 1, V() ? bp(view) : 0, 1));
    }

    public void o(ir irVar, ix ixVar) {
        throw null;
    }

    public void q(Rect rect, int i, int i2) {
        ba(ak(i, rect.width() + aw() + ax(), au()), ak(i2, rect.height() + ay() + av(), at()));
    }

    public boolean s(io ioVar) {
        return ioVar != null;
    }

    public boolean t(int i, Bundle bundle) {
        RecyclerView recyclerView = this.s;
        return bi(recyclerView.f, recyclerView.K, i, bundle);
    }

    public boolean u() {
        throw null;
    }

    public void x() {
    }

    public void aR(int i) {
    }

    public void ah(RecyclerView recyclerView) {
    }

    public void bs(ig igVar) {
    }

    public void p(ix ixVar) {
    }

    public void ad(int i, hk hkVar) {
    }

    public void w(int i, int i2) {
    }

    public void y(int i, int i2) {
    }

    public void z(int i, int i2) {
    }
}
