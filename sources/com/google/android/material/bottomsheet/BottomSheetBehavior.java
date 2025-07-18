package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.tv.remote.service.R;
import defpackage.bee;
import defpackage.bhw;
import defpackage.bhy;
import defpackage.bhz;
import defpackage.bia;
import defpackage.bic;
import defpackage.bie;
import defpackage.big;
import defpackage.bkc;
import defpackage.bkh;
import defpackage.mo;
import defpackage.mr;
import defpackage.qv;
import defpackage.sl;
import defpackage.tu;
import defpackage.tv;
import defpackage.xo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class BottomSheetBehavior extends mo {
    public WeakReference A;
    public WeakReference B;
    public int C;
    public boolean D;
    final SparseIntArray E;
    private int F;
    private float G;
    private boolean H;
    private int I;
    private int J;
    private ColorStateList K;
    private int L;
    private int M;
    private boolean N;
    private boolean O;
    private boolean P;
    private bkh Q;
    private boolean R;
    private final bie S;
    private ValueAnimator T;
    private boolean U;
    private boolean V;
    private boolean W;
    private int X;
    private boolean Y;
    private final float Z;
    public boolean a;
    private int aa;
    private final ArrayList ab;
    private VelocityTracker ac;
    private int ad;
    private Map ae;
    private final tu af;
    public int b;
    public int c;
    public bkc d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    int n;
    public int o;
    public int p;
    float q;
    public int r;
    float s;
    public boolean t;
    public boolean u;
    public boolean v;
    public int w;
    public tv x;
    int y;
    public int z;

    public BottomSheetBehavior() {
        this.F = 0;
        this.a = true;
        this.L = -1;
        this.M = -1;
        this.S = new bie(this);
        this.q = 0.5f;
        this.s = -1.0f;
        this.v = true;
        this.U = true;
        this.w = 4;
        this.Z = 0.1f;
        this.ab = new ArrayList();
        this.ad = -1;
        this.E = new SparseIntArray();
        this.af = new bhy(this);
    }

    private final float af() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        if (this.d == null || (weakReference = this.A) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        View view = (View) this.A.get();
        if (!ap() || (rootWindowInsets = view.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        bkc bkcVar = this.d;
        float[] fArr = bkcVar.g;
        float fAr = ar(fArr != null ? fArr[3] : bkcVar.a.a.a.a(bkcVar.h()), rootWindowInsets.getRoundedCorner(0));
        bkc bkcVar2 = this.d;
        float[] fArr2 = bkcVar2.g;
        return Math.max(fAr, ar(fArr2 != null ? fArr2[0] : bkcVar2.a.a.b.a(bkcVar2.h()), rootWindowInsets.getRoundedCorner(1)));
    }

    private final int ag() {
        int i;
        return this.H ? Math.min(Math.max(this.I, this.z - ((this.y * 9) / 16)), this.aa) + this.l : (this.N || this.f || (i = this.e) <= 0) ? this.c + this.l : Math.max(this.c, i + this.J);
    }

    private final int ah(int i) {
        return i != 3 ? i != 4 ? i != 5 ? this.p : this.z : this.r : a();
    }

    private final void ai() {
        int iAg = ag();
        if (this.a) {
            this.r = Math.max(this.z - iAg, this.o);
        } else {
            this.r = this.z - iAg;
        }
    }

    private final void aj() {
        this.p = (int) (this.z * (1.0f - this.q));
    }

    private final void ak(View view, sl slVar, int i) {
        qv.r(view, slVar, new bhz(this, i));
    }

    private final void al() {
        this.C = -1;
        this.ad = -1;
        VelocityTracker velocityTracker = this.ac;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.ac = null;
        }
    }

    private final void am() throws Resources.NotFoundException {
        View view;
        int iA;
        WeakReference weakReference = this.A;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        qv.j(view, 524288);
        qv.j(view, 262144);
        qv.j(view, 1048576);
        SparseIntArray sparseIntArray = this.E;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            qv.j(view, i);
            sparseIntArray.delete(0);
        }
        if (!this.a && this.w != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            bhz bhzVar = new bhz(this, 6);
            List listF = qv.f(view);
            int i2 = 0;
            while (true) {
                if (i2 >= listF.size()) {
                    int i3 = -1;
                    for (int i4 = 0; i4 < 32 && i3 == -1; i4++) {
                        i3 = qv.a[i4];
                        boolean z = true;
                        for (int i5 = 0; i5 < listF.size(); i5++) {
                            z &= ((sl) listF.get(i5)).a() != i3;
                        }
                        if (true != z) {
                            i3 = -1;
                        }
                    }
                    iA = i3;
                } else {
                    if (TextUtils.equals(string, ((sl) listF.get(i2)).b())) {
                        iA = ((sl) listF.get(i2)).a();
                        break;
                    }
                    i2++;
                }
            }
            if (iA != -1) {
                qv.g(view, new sl(null, iA, string, bhzVar, null));
            }
            sparseIntArray.put(0, iA);
        }
        if (this.t && this.w != 5) {
            ak(view, sl.e, 5);
        }
        int i6 = this.w;
        if (i6 == 3) {
            ak(view, sl.d, true == this.a ? 4 : 6);
            return;
        }
        if (i6 == 4) {
            ak(view, sl.c, true == this.a ? 3 : 6);
        } else {
            if (i6 != 6) {
                return;
            }
            ak(view, sl.d, 4);
            ak(view, sl.c, 3);
        }
    }

    private final void an(int i, boolean z) {
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z2 = this.w == 3 && (this.P || ap());
        if (this.R == z2 || this.d == null) {
            return;
        }
        this.R = z2;
        if (!z || (valueAnimator = this.T) == null) {
            ValueAnimator valueAnimator2 = this.T;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.T.cancel();
            }
            this.d.n(this.R ? af() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.T.reverse();
        } else {
            this.T.setFloatValues(this.d.a.l, z2 ? af() : 1.0f);
            this.T.start();
        }
    }

    private final void ao(boolean z) {
        WeakReference weakReference = this.A;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.ae != null) {
                    return;
                } else {
                    this.ae = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.A.get() && z) {
                    this.ae.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.ae = null;
        }
    }

    private final boolean ap() {
        WeakReference weakReference = this.A;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.A.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean aq() {
        if (this.x != null) {
            return this.v || this.w == 1;
        }
        return false;
    }

    private static final float ar(float f, RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float radius = roundedCorner.getRadius();
            if (radius > 0.0f && f > 0.0f) {
                return radius / f;
            }
        }
        return 0.0f;
    }

    private static final int as(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public final void W(int i) {
        if (((View) this.A.get()) != null) {
            ArrayList arrayList = this.ab;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.r;
            if (i <= i2 && i2 != a()) {
                a();
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((bia) arrayList.get(i3)).a();
            }
        }
    }

    public final void X(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.n = i;
        an(this.w, true);
    }

    public final void Y(int i) {
        if (i == -1) {
            if (this.H) {
                return;
            } else {
                this.H = true;
            }
        } else {
            if (!this.H && this.c == i) {
                return;
            }
            this.H = false;
            this.c = Math.max(0, i);
        }
        ae();
    }

    public final void Z(int i) throws Resources.NotFoundException {
        if (!this.t && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: 5");
            return;
        }
        int i2 = (i == 6 && this.a && ah(6) <= this.o) ? 3 : i;
        WeakReference weakReference = this.A;
        if (weakReference == null || weakReference.get() == null) {
            aa(i);
            return;
        }
        View view = (View) this.A.get();
        bee beeVar = new bee(this, view, i2, 2);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(beeVar);
        } else {
            beeVar.run();
        }
    }

    public final int a() {
        if (this.a) {
            return this.o;
        }
        return Math.max(this.n, this.O ? 0 : this.m);
    }

    public final void aa(int i) throws Resources.NotFoundException {
        if (this.w == i) {
            return;
        }
        this.w = i;
        int i2 = 4;
        if (i != 4 && i != 3 && i != 6 && this.t && i == 5) {
            i = 5;
        }
        WeakReference weakReference = this.A;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        int i3 = 0;
        if (i == 3) {
            ao(true);
        } else {
            if (i == 6 || i == 5) {
                i2 = i;
            } else if (i == 4) {
            }
            ao(false);
            i = i2;
        }
        an(i, true);
        while (true) {
            ArrayList arrayList = this.ab;
            if (i3 >= arrayList.size()) {
                am();
                return;
            } else {
                ((bia) arrayList.get(i3)).b();
                i3++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1.i(r3.getLeft(), r0) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ab(android.view.View r3, int r4, boolean r5) throws android.content.res.Resources.NotFoundException {
        /*
            r2 = this;
            int r0 = r2.ah(r4)
            tv r1 = r2.x
            if (r1 == 0) goto L3f
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.i(r3, r0)
            if (r3 == 0) goto L3f
            goto L31
        L15:
            int r5 = r3.getLeft()
            r1.d = r3
            r3 = -1
            r1.c = r3
            r3 = 0
            boolean r3 = r1.g(r5, r0, r3, r3)
            if (r3 != 0) goto L31
            int r3 = r1.a
            if (r3 != 0) goto L3f
            android.view.View r3 = r1.d
            if (r3 == 0) goto L3f
            r3 = 0
            r1.d = r3
            goto L3f
        L31:
            r3 = 2
            r2.aa(r3)
            r3 = 1
            r2.an(r4, r3)
            bie r3 = r2.S
            r3.a(r4)
            return
        L3f:
            r2.aa(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.ab(android.view.View, int, boolean):void");
    }

    public final boolean ac() {
        return this.t;
    }

    public final boolean ad(View view, float f) {
        if (this.u) {
            return true;
        }
        if (view.getTop() < this.r) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f * this.Z)) - ((float) this.r)) / ((float) ag()) > 0.5f;
    }

    public final void ae() {
        View view;
        if (this.A != null) {
            ai();
            if (this.w != 4 || (view = (View) this.A.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    final View b(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View viewB = b(viewGroup.getChildAt(i));
                if (viewB != null) {
                    return viewB;
                }
            }
        }
        return null;
    }

    @Override // defpackage.mo
    public final void c(mr mrVar) {
        this.A = null;
        this.x = null;
    }

    @Override // defpackage.mo
    public final void d() {
        this.A = null;
        this.x = null;
    }

    @Override // defpackage.mo
    public final boolean e(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        tv tvVar;
        if (!view.isShown() || !this.v) {
            this.W = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            al();
            actionMasked = 0;
        }
        if (this.ac == null) {
            this.ac = VelocityTracker.obtain();
        }
        this.ac.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            this.ad = y;
            if (this.w != 2) {
                WeakReference weakReference = this.B;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.j(view2, x, y)) {
                    this.C = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.D = true;
                }
            }
            this.W = this.C == -1 && !coordinatorLayout.j(view, x, this.ad);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.D = false;
            this.C = -1;
            if (this.W) {
                this.W = false;
                return false;
            }
        }
        if (!this.W && (tvVar = this.x) != null && tvVar.j(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.B;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        if (actionMasked == 2 && view3 != null && !this.W && this.w != 1 && !coordinatorLayout.j(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.x != null && (i = this.ad) != -1) {
            if (Math.abs(i - motionEvent.getY()) > this.x.b) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f6  */
    @Override // defpackage.mo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(androidx.coordinatorlayout.widget.CoordinatorLayout r9, android.view.View r10, int r11) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.f(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    @Override // defpackage.mo
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.w == 1 && actionMasked == 0) {
            return true;
        }
        if (aq()) {
            this.x.e(motionEvent);
        }
        if (actionMasked == 0) {
            al();
        }
        if (this.ac == null) {
            this.ac = VelocityTracker.obtain();
        }
        this.ac.addMovement(motionEvent);
        if (aq() && actionMasked == 2 && !this.W) {
            float fAbs = Math.abs(this.ad - motionEvent.getY());
            tv tvVar = this.x;
            if (fAbs > tvVar.b) {
                tvVar.d(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.W;
    }

    @Override // defpackage.mo
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(as(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.L, marginLayoutParams.width), as(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.M, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.mo
    public final boolean l(View view) {
        WeakReference weakReference = this.B;
        return (weakReference == null || view != weakReference.get() || this.w == 3 || this.V) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
    
        if (r3 == false) goto L36;
     */
    @Override // defpackage.mo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(android.view.View r6, android.view.View r7, int r8, int[] r9, int r10) throws android.content.res.Resources.NotFoundException {
        /*
            r5 = this;
            r0 = 1
            if (r10 != r0) goto L5
            goto La2
        L5:
            java.lang.ref.WeakReference r10 = r5.B
            if (r10 == 0) goto L10
            java.lang.Object r10 = r10.get()
            android.view.View r10 = (android.view.View) r10
            goto L11
        L10:
            r10 = 0
        L11:
            if (r7 != r10) goto La2
            int r1 = r6.getTop()
            int r2 = r1 - r8
            if (r8 <= 0) goto L53
            boolean r3 = r5.Y
            if (r3 != 0) goto L2b
            boolean r3 = r5.U
            if (r3 != 0) goto L2b
            if (r7 != r10) goto L2b
            boolean r7 = r7.canScrollVertically(r0)
            if (r7 != 0) goto L67
        L2b:
            int r7 = r5.a()
            if (r2 >= r7) goto L43
            int r7 = r5.a()
            int r1 = r1 - r7
            r9[r0] = r1
            int[] r7 = defpackage.qv.a
            int r7 = -r1
            r6.offsetTopAndBottom(r7)
            r7 = 3
            r5.aa(r7)
            goto L94
        L43:
            boolean r7 = r5.v
            if (r7 == 0) goto La2
            r9[r0] = r8
            int r7 = -r8
            int[] r9 = defpackage.qv.a
            r6.offsetTopAndBottom(r7)
            r5.aa(r0)
            goto L94
        L53:
            if (r8 >= 0) goto L94
            r3 = -1
            boolean r3 = r7.canScrollVertically(r3)
            boolean r4 = r5.Y
            if (r4 != 0) goto L6a
            boolean r4 = r5.U
            if (r4 != 0) goto L6a
            if (r7 != r10) goto L6a
            if (r3 != 0) goto L67
            goto L6c
        L67:
            r5.V = r0
            return
        L6a:
            if (r3 != 0) goto L94
        L6c:
            int r7 = r5.r
            if (r2 <= r7) goto L85
            boolean r10 = r5.ac()
            if (r10 == 0) goto L77
            goto L85
        L77:
            int r1 = r1 - r7
            r9[r0] = r1
            int[] r7 = defpackage.qv.a
            int r7 = -r1
            r6.offsetTopAndBottom(r7)
            r7 = 4
            r5.aa(r7)
            goto L94
        L85:
            boolean r7 = r5.v
            if (r7 == 0) goto La2
            r9[r0] = r8
            int r7 = -r8
            int[] r9 = defpackage.qv.a
            r6.offsetTopAndBottom(r7)
            r5.aa(r0)
        L94:
            int r6 = r6.getTop()
            r5.W(r6)
            r5.X = r8
            r5.Y = r0
            r6 = 0
            r5.V = r6
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.m(android.view.View, android.view.View, int, int[], int):void");
    }

    @Override // defpackage.mo
    public final void p(View view, Parcelable parcelable) {
        bic bicVar = (bic) parcelable;
        int i = this.F;
        int i2 = 4;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.c = bicVar.b;
            }
            if (i == -1 || (i & 2) == 2) {
                this.a = bicVar.e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.t = bicVar.f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.u = bicVar.g;
            }
        }
        int i3 = bicVar.a;
        if (i3 != 1 && i3 != 2) {
            i2 = i3;
        }
        this.w = i2;
    }

    @Override // defpackage.mo
    public final Parcelable q(View view) {
        return new bic(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // defpackage.mo
    public final boolean r(View view, int i, int i2) {
        this.X = 0;
        this.Y = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0098  */
    @Override // defpackage.mo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(android.view.View r4, android.view.View r5, int r6) throws android.content.res.Resources.NotFoundException {
        /*
            r3 = this;
            int r6 = r4.getTop()
            int r0 = r3.a()
            r1 = 3
            if (r6 != r0) goto Lf
            r3.aa(r1)
            return
        Lf:
            java.lang.ref.WeakReference r6 = r3.B
            if (r6 == 0) goto Lb6
            java.lang.Object r6 = r6.get()
            if (r5 != r6) goto Lb6
            boolean r5 = r3.Y
            if (r5 != 0) goto L1f
            goto Lb6
        L1f:
            int r5 = r3.X
            r6 = 6
            if (r5 <= 0) goto L35
            boolean r5 = r3.a
            if (r5 == 0) goto L2a
            goto Lb0
        L2a:
            int r5 = r4.getTop()
            int r0 = r3.p
            if (r5 <= r0) goto Lb0
        L32:
            r1 = r6
            goto Lb0
        L35:
            boolean r5 = r3.t
            if (r5 == 0) goto L56
            android.view.VelocityTracker r5 = r3.ac
            if (r5 != 0) goto L3f
            r5 = 0
            goto L4e
        L3f:
            r0 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.G
            r5.computeCurrentVelocity(r0, r2)
            android.view.VelocityTracker r5 = r3.ac
            int r0 = r3.C
            float r5 = r5.getYVelocity(r0)
        L4e:
            boolean r5 = r3.ad(r4, r5)
            if (r5 == 0) goto L56
            r1 = 5
            goto Lb0
        L56:
            int r5 = r3.X
            r0 = 4
            if (r5 != 0) goto L94
            int r5 = r4.getTop()
            boolean r2 = r3.a
            if (r2 == 0) goto L75
            int r6 = r3.o
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r2 = r3.r
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r6 >= r5) goto L98
            goto Lb0
        L75:
            int r2 = r3.p
            if (r5 >= r2) goto L84
            int r0 = r3.r
            int r0 = r5 - r0
            int r0 = java.lang.Math.abs(r0)
            if (r5 >= r0) goto L32
            goto Lb0
        L84:
            int r1 = r5 - r2
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.r
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L98
            goto L32
        L94:
            boolean r5 = r3.a
            if (r5 == 0) goto L9a
        L98:
            r1 = r0
            goto Lb0
        L9a:
            int r5 = r4.getTop()
            int r1 = r3.p
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.r
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L98
            goto L32
        Lb0:
            r5 = 0
            r3.ab(r4, r1, r5)
            r3.Y = r5
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.s(android.view.View, android.view.View, int):void");
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        this.F = 0;
        this.a = true;
        this.L = -1;
        this.M = -1;
        this.S = new bie(this);
        this.q = 0.5f;
        this.s = -1.0f;
        this.v = true;
        this.U = true;
        this.w = 4;
        this.Z = 0.1f;
        this.ab = new ArrayList();
        this.ad = -1;
        this.E = new SparseIntArray();
        this.af = new bhy(this);
        this.J = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, big.a);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.K = xo.f(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(22)) {
            this.Q = new bkh(bkh.c(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal));
        }
        if (this.Q != null) {
            bkc bkcVar = new bkc(this.Q);
            this.d = bkcVar;
            bkcVar.j(context);
            ColorStateList colorStateList = this.K;
            if (colorStateList != null) {
                this.d.m(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.d.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(af(), 1.0f);
        this.T = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.T.addUpdateListener(new bhw(this));
        this.s = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(10);
        if (typedValuePeekValue != null && typedValuePeekValue.data == -1) {
            Y(typedValuePeekValue.data);
        } else {
            Y(typedArrayObtainStyledAttributes.getDimensionPixelSize(10, -1));
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(9, false);
        if (this.t != z) {
            this.t = z;
            if (!z && this.w == 5) {
                Z(4);
            }
            am();
        }
        this.N = typedArrayObtainStyledAttributes.getBoolean(14, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(7, true);
        if (this.a != z2) {
            this.a = z2;
            if (this.A != null) {
                ai();
            }
            aa((this.a && this.w == 6) ? 3 : this.w);
            an(this.w, true);
            am();
        }
        this.u = typedArrayObtainStyledAttributes.getBoolean(13, false);
        this.v = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.U = typedArrayObtainStyledAttributes.getBoolean(5, true);
        this.F = typedArrayObtainStyledAttributes.getInt(11, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(8, 0.5f);
        if (f > 0.0f && f < 1.0f) {
            this.q = f;
            if (this.A != null) {
                aj();
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(6);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                X(typedValuePeekValue2.data);
            } else {
                X(typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, 0));
            }
            this.b = typedArrayObtainStyledAttributes.getInt(12, 500);
            this.f = typedArrayObtainStyledAttributes.getBoolean(18, false);
            this.g = typedArrayObtainStyledAttributes.getBoolean(19, false);
            this.h = typedArrayObtainStyledAttributes.getBoolean(20, false);
            this.O = typedArrayObtainStyledAttributes.getBoolean(21, true);
            this.i = typedArrayObtainStyledAttributes.getBoolean(15, false);
            this.j = typedArrayObtainStyledAttributes.getBoolean(16, false);
            this.k = typedArrayObtainStyledAttributes.getBoolean(17, false);
            this.P = typedArrayObtainStyledAttributes.getBoolean(24, true);
            typedArrayObtainStyledAttributes.recycle();
            this.G = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // defpackage.mo
    public final void n(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }
}
