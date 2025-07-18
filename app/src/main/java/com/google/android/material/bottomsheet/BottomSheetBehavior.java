package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
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
import androidx.customview.view.AbsSavedState;
import com.google.android.katniss.R;
import defpackage.aam;
import defpackage.aap;
import defpackage.ahj;
import defpackage.ajo;
import defpackage.alo;
import defpackage.alp;
import defpackage.uyv;
import defpackage.uyw;
import defpackage.uyy;
import defpackage.uyz;
import defpackage.uza;
import defpackage.uzb;
import defpackage.uzd;
import defpackage.uzf;
import defpackage.vba;
import defpackage.vbq;
import defpackage.vbw;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class BottomSheetBehavior extends aam {
    public WeakReference A;
    public WeakReference B;
    public int C;
    public boolean D;
    final SparseIntArray E;
    final SparseIntArray F;
    final SparseIntArray G;
    private int H;
    private float I;
    private boolean J;
    private int K;
    private int L;
    private ColorStateList M;
    private int N;
    private int O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private vbw S;
    private boolean T;
    private final uzd U;
    private ValueAnimator V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private int Z;
    public boolean a;
    private boolean aa;
    private final float ab;
    private int ac;
    private final ArrayList ad;
    private VelocityTracker ae;
    private int af;
    private Map ag;
    private final alo ah;
    public int b;
    public int c;
    public vbq d;
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
    public alp x;
    int y;
    public int z;

    public BottomSheetBehavior() {
        this.H = 0;
        this.a = true;
        this.N = -1;
        this.O = -1;
        this.U = new uzd(this);
        this.q = 0.5f;
        this.s = -1.0f;
        this.v = true;
        this.W = true;
        this.w = 4;
        this.ab = 0.1f;
        this.ad = new ArrayList();
        this.af = -1;
        this.E = new SparseIntArray();
        this.F = new SparseIntArray();
        this.G = new SparseIntArray();
        this.ah = new uyy(this);
    }

    private final float D(float f, RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float radius = roundedCorner.getRadius();
            if (radius > 0.0f && f > 0.0f) {
                return radius / f;
            }
        }
        return 0.0f;
    }

    private final float E() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        if (this.d == null || (weakReference = this.A) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        View view = (View) this.A.get();
        if (!P() || (rootWindowInsets = view.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        vbq vbqVar = this.d;
        float[] fArr = vbqVar.h;
        float fD = D(fArr != null ? fArr[3] : vbqVar.a.a.e.a(vbqVar.h()), rootWindowInsets.getRoundedCorner(0));
        vbq vbqVar2 = this.d;
        float[] fArr2 = vbqVar2.h;
        return Math.max(fD, D(fArr2 != null ? fArr2[0] : vbqVar2.a.a.f.a(vbqVar2.h()), rootWindowInsets.getRoundedCorner(1)));
    }

    private final int F(View view, int i, int i2) throws Resources.NotFoundException {
        int iA;
        String string = view.getResources().getString(i);
        uyz uyzVar = new uyz(this, i2);
        List listG = ahj.g(view);
        int i3 = 0;
        while (true) {
            if (i3 >= listG.size()) {
                int i4 = -1;
                for (int i5 = 0; i5 < 32 && i4 == -1; i5++) {
                    i4 = ahj.a[i5];
                    boolean z = true;
                    for (int i6 = 0; i6 < listG.size(); i6++) {
                        z &= ((ajo) listG.get(i6)).a() != i4;
                    }
                    if (true != z) {
                        i4 = -1;
                    }
                }
                iA = i4;
            } else {
                if (TextUtils.equals(string, ((ajo) listG.get(i3)).b())) {
                    iA = ((ajo) listG.get(i3)).a();
                    break;
                }
                i3++;
            }
        }
        if (iA != -1) {
            ahj.h(view, new ajo(null, iA, string, uyzVar, null));
        }
        return iA;
    }

    private final int G() {
        int i;
        return this.J ? Math.min(Math.max(this.K, this.z - ((this.y * 9) / 16)), this.ac) + this.l : (this.P || this.f || (i = this.e) <= 0) ? this.c + this.l : Math.max(this.c, i + this.L);
    }

    private final int H(int i, int i2, int i3, int i4) {
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

    private final int I(int i) {
        return i != 3 ? i != 4 ? i != 5 ? this.p : this.z : this.r : s();
    }

    private final void J() {
        int iG = G();
        if (this.a) {
            this.r = Math.max(this.z - iG, this.o);
        } else {
            this.r = this.z - iG;
        }
    }

    private final void K() {
        this.p = (int) (this.z * (1.0f - this.q));
    }

    private final void L() {
        this.C = -1;
        this.af = -1;
        VelocityTracker velocityTracker = this.ae;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.ae = null;
        }
    }

    private final void M() {
        View view;
        WeakReference weakReference = this.A;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        ahj.l(view, 1048576);
        ahj.l(view, 524288);
        ahj.l(view, 262144);
        SparseIntArray sparseIntArray = this.F;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            ahj.l(view, i);
            sparseIntArray.delete(0);
        }
        SparseIntArray sparseIntArray2 = this.E;
        int i2 = sparseIntArray2.get(0, -1);
        if (i2 != -1) {
            ahj.l(view, i2);
            sparseIntArray2.delete(0);
        }
        SparseIntArray sparseIntArray3 = this.G;
        int i3 = sparseIntArray3.get(0, -1);
        if (i3 != -1) {
            ahj.l(view, i3);
            sparseIntArray3.delete(0);
        }
        if (!this.a && this.w != 6) {
            sparseIntArray2.put(0, F(view, R.string.bottomsheet_action_expand_halfway, 6));
        }
        if (this.t && this.w != 5) {
            ahj.h(view, ajo.e.c(new uyz(this, 5)));
        }
        int i4 = this.w;
        if (i4 == 3) {
            sparseIntArray3.put(0, F(view, R.string.bottomsheet_action_collapse, 4));
            return;
        }
        if (i4 == 4) {
            sparseIntArray.put(0, F(view, R.string.bottomsheet_action_expand, 3));
        } else {
            if (i4 != 6) {
                return;
            }
            sparseIntArray3.put(0, F(view, R.string.bottomsheet_action_collapse, 4));
            sparseIntArray.put(0, F(view, R.string.bottomsheet_action_expand, 3));
        }
    }

    private final void N(int i, boolean z) {
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z2 = this.w == 3 && (this.R || P());
        if (this.T == z2 || this.d == null) {
            return;
        }
        this.T = z2;
        if (!z || (valueAnimator = this.V) == null) {
            ValueAnimator valueAnimator2 = this.V;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.V.cancel();
            }
            this.d.m(this.T ? E() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.V.reverse();
        } else {
            this.V.setFloatValues(this.d.a.l, z2 ? E() : 1.0f);
            this.V.start();
        }
    }

    private final void O(boolean z) {
        WeakReference weakReference = this.A;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.ag != null) {
                    return;
                } else {
                    this.ag = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.A.get() && z) {
                    this.ag.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.ag = null;
        }
    }

    private final boolean P() {
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

    private final boolean Q() {
        if (this.x != null) {
            return this.v || this.w == 1;
        }
        return false;
    }

    public final boolean A(View view, float f) {
        if (this.u) {
            return true;
        }
        if (view.getTop() < this.r) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f * this.ab)) - ((float) this.r)) / ((float) G()) > 0.5f;
    }

    public final void B(int i) {
        if (i == -1) {
            if (this.J) {
                return;
            } else {
                this.J = true;
            }
        } else {
            if (!this.J && this.c == i) {
                return;
            }
            this.J = false;
            this.c = Math.max(0, i);
        }
        C();
    }

    public final void C() {
        View view;
        if (this.A != null) {
            J();
            if (this.w != 4 || (view = (View) this.A.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // defpackage.aam
    public final void a(aap aapVar) {
        this.A = null;
        this.x = null;
    }

    @Override // defpackage.aam
    public final void b() {
        this.A = null;
        this.x = null;
    }

    @Override // defpackage.aam
    public final boolean c(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        alp alpVar;
        if (!view.isShown() || !this.v) {
            this.Y = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            L();
            actionMasked = 0;
        }
        if (this.ae == null) {
            this.ae = VelocityTracker.obtain();
        }
        this.ae.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            this.af = y;
            if (this.w != 2) {
                WeakReference weakReference = this.B;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.l(view2, x, y)) {
                    this.C = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.D = true;
                }
            }
            this.Y = this.C == -1 && !coordinatorLayout.l(view, x, this.af);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.D = false;
            this.C = -1;
            if (this.Y) {
                this.Y = false;
                return false;
            }
        }
        if (!this.Y && (alpVar = this.x) != null && alpVar.j(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.B;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        if (actionMasked == 2 && view3 != null && !this.Y && this.w != 1 && !coordinatorLayout.l(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.x != null && (i = this.af) != -1) {
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
    @Override // defpackage.aam
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(androidx.coordinatorlayout.widget.CoordinatorLayout r9, android.view.View r10, int r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.d(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    @Override // defpackage.aam
    public final boolean e(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.w == 1 && actionMasked == 0) {
            return true;
        }
        if (Q()) {
            this.x.e(motionEvent);
        }
        if (actionMasked == 0) {
            L();
        }
        if (this.ae == null) {
            this.ae = VelocityTracker.obtain();
        }
        this.ae.addMovement(motionEvent);
        if (Q() && actionMasked == 2 && !this.Y) {
            float fAbs = Math.abs(this.af - motionEvent.getY());
            alp alpVar = this.x;
            if (fAbs > alpVar.b) {
                alpVar.d(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.Y;
    }

    @Override // defpackage.aam
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(H(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.N, marginLayoutParams.width), H(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.O, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.aam
    public final boolean j(View view) {
        WeakReference weakReference = this.B;
        return (weakReference == null || view != weakReference.get() || this.w == 3 || this.X) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
    
        if (r3 == false) goto L36;
     */
    @Override // defpackage.aam
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(android.view.View r6, android.view.View r7, int r8, int[] r9, int r10) {
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
            boolean r3 = r5.aa
            if (r3 != 0) goto L2b
            boolean r3 = r5.W
            if (r3 != 0) goto L2b
            if (r7 != r10) goto L2b
            boolean r7 = r7.canScrollVertically(r0)
            if (r7 != 0) goto L67
        L2b:
            int r7 = r5.s()
            if (r2 >= r7) goto L43
            int r7 = r5.s()
            int r1 = r1 - r7
            r9[r0] = r1
            int[] r7 = defpackage.ahj.a
            int r7 = -r1
            r6.offsetTopAndBottom(r7)
            r7 = 3
            r5.x(r7)
            goto L94
        L43:
            boolean r7 = r5.v
            if (r7 == 0) goto La2
            r9[r0] = r8
            int r7 = -r8
            int[] r9 = defpackage.ahj.a
            r6.offsetTopAndBottom(r7)
            r5.x(r0)
            goto L94
        L53:
            if (r8 >= 0) goto L94
            r3 = -1
            boolean r3 = r7.canScrollVertically(r3)
            boolean r4 = r5.aa
            if (r4 != 0) goto L6a
            boolean r4 = r5.W
            if (r4 != 0) goto L6a
            if (r7 != r10) goto L6a
            if (r3 != 0) goto L67
            goto L6c
        L67:
            r5.X = r0
            return
        L6a:
            if (r3 != 0) goto L94
        L6c:
            int r7 = r5.r
            if (r2 <= r7) goto L85
            boolean r10 = r5.z()
            if (r10 == 0) goto L77
            goto L85
        L77:
            int r1 = r1 - r7
            r9[r0] = r1
            int[] r7 = defpackage.ahj.a
            int r7 = -r1
            r6.offsetTopAndBottom(r7)
            r7 = 4
            r5.x(r7)
            goto L94
        L85:
            boolean r7 = r5.v
            if (r7 == 0) goto La2
            r9[r0] = r8
            int r7 = -r8
            int[] r9 = defpackage.ahj.a
            r6.offsetTopAndBottom(r7)
            r5.x(r0)
        L94:
            int r6 = r6.getTop()
            r5.u(r6)
            r5.Z = r8
            r5.aa = r0
            r6 = 0
            r5.X = r6
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.l(android.view.View, android.view.View, int, int[], int):void");
    }

    @Override // defpackage.aam
    public final void o(View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        int i = this.H;
        int i2 = 4;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.c = savedState.b;
            }
            if (i == -1 || (i & 2) == 2) {
                this.a = savedState.e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.t = savedState.f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.u = savedState.g;
            }
        }
        int i3 = savedState.a;
        if (i3 != 1 && i3 != 2) {
            i2 = i3;
        }
        this.w = i2;
    }

    @Override // defpackage.aam
    public final Parcelable p(View view) {
        return new SavedState(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // defpackage.aam
    public final boolean q(View view, int i, int i2) {
        this.Z = 0;
        this.aa = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0098  */
    @Override // defpackage.aam
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(android.view.View r4, android.view.View r5, int r6) {
        /*
            r3 = this;
            int r6 = r4.getTop()
            int r0 = r3.s()
            r1 = 3
            if (r6 != r0) goto Lf
            r3.x(r1)
            return
        Lf:
            java.lang.ref.WeakReference r6 = r3.B
            if (r6 == 0) goto Lb6
            java.lang.Object r6 = r6.get()
            if (r5 != r6) goto Lb6
            boolean r5 = r3.aa
            if (r5 != 0) goto L1f
            goto Lb6
        L1f:
            int r5 = r3.Z
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
            android.view.VelocityTracker r5 = r3.ae
            if (r5 != 0) goto L3f
            r5 = 0
            goto L4e
        L3f:
            r0 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.I
            r5.computeCurrentVelocity(r0, r2)
            android.view.VelocityTracker r5 = r3.ae
            int r0 = r3.C
            float r5 = r5.getYVelocity(r0)
        L4e:
            boolean r5 = r3.A(r4, r5)
            if (r5 == 0) goto L56
            r1 = 5
            goto Lb0
        L56:
            int r5 = r3.Z
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
            r3.y(r4, r1, r5)
            r3.aa = r5
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.r(android.view.View, android.view.View, int):void");
    }

    public final int s() {
        if (this.a) {
            return this.o;
        }
        return Math.max(this.n, this.Q ? 0 : this.m);
    }

    final View t(View view) {
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
                View viewT = t(viewGroup.getChildAt(i));
                if (viewT != null) {
                    return viewT;
                }
            }
        }
        return null;
    }

    public final void u(int i) {
        if (((View) this.A.get()) != null) {
            ArrayList arrayList = this.ad;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.r;
            if (i <= i2 && i2 != s()) {
                s();
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((uza) arrayList.get(i3)).a();
            }
        }
    }

    public final void v(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.n = i;
        N(this.w, true);
    }

    public final void w(int i) {
        if (!this.t && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: 5");
            return;
        }
        int i2 = (i == 6 && this.a && I(6) <= this.o) ? 3 : i;
        WeakReference weakReference = this.A;
        if (weakReference == null || weakReference.get() == null) {
            x(i);
            return;
        }
        View view = (View) this.A.get();
        uyv uyvVar = new uyv(this, view, i2);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(uyvVar);
        } else {
            uyvVar.run();
        }
    }

    public final void x(int i) {
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
            O(true);
        } else {
            if (i == 6 || i == 5) {
                i2 = i;
            } else if (i == 4) {
            }
            O(false);
            i = i2;
        }
        N(i, true);
        while (true) {
            ArrayList arrayList = this.ad;
            if (i3 >= arrayList.size()) {
                M();
                return;
            } else {
                ((uza) arrayList.get(i3)).b();
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
    public final void y(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r0 = r2.I(r4)
            alp r1 = r2.x
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
            r2.x(r3)
            r3 = 1
            r2.N(r4, r3)
            uzd r3 = r2.U
            r3.a(r4)
            return
        L3f:
            r2.x(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.y(android.view.View, int, boolean):void");
    }

    public final boolean z() {
        return this.t;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.H = 0;
        this.a = true;
        this.N = -1;
        this.O = -1;
        this.U = new uzd(this);
        this.q = 0.5f;
        this.s = -1.0f;
        this.v = true;
        this.W = true;
        this.w = 4;
        this.ab = 0.1f;
        this.ad = new ArrayList();
        this.af = -1;
        this.E = new SparseIntArray();
        this.F = new SparseIntArray();
        this.G = new SparseIntArray();
        this.ah = new uyy(this);
        this.L = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, uzf.a);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.M = vba.a(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(22)) {
            this.S = new vbw(vbw.f(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal));
        }
        if (this.S != null) {
            vbq vbqVar = new vbq(this.S);
            this.d = vbqVar;
            vbqVar.i(context);
            ColorStateList colorStateList = this.M;
            if (colorStateList != null) {
                this.d.l(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.d.setTintList(ColorStateList.valueOf(typedValue.data));
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(E(), 1.0f);
        this.V = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.V.addUpdateListener(new uyw(this));
        this.s = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(10);
        if (typedValuePeekValue != null && typedValuePeekValue.data == -1) {
            B(typedValuePeekValue.data);
        } else {
            B(typedArrayObtainStyledAttributes.getDimensionPixelSize(10, -1));
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(9, false);
        if (this.t != z) {
            this.t = z;
            if (!z && this.w == 5) {
                w(4);
            }
            M();
        }
        this.P = typedArrayObtainStyledAttributes.getBoolean(14, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(7, true);
        if (this.a != z2) {
            this.a = z2;
            if (this.A != null) {
                J();
            }
            x((this.a && this.w == 6) ? 3 : this.w);
            N(this.w, true);
            M();
        }
        this.u = typedArrayObtainStyledAttributes.getBoolean(13, false);
        this.v = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.W = typedArrayObtainStyledAttributes.getBoolean(5, true);
        this.H = typedArrayObtainStyledAttributes.getInt(11, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(8, 0.5f);
        if (f > 0.0f && f < 1.0f) {
            this.q = f;
            if (this.A != null) {
                K();
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(6);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                v(typedValuePeekValue2.data);
            } else {
                v(typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, 0));
            }
            this.b = typedArrayObtainStyledAttributes.getInt(12, 500);
            this.f = typedArrayObtainStyledAttributes.getBoolean(18, false);
            this.g = typedArrayObtainStyledAttributes.getBoolean(19, false);
            this.h = typedArrayObtainStyledAttributes.getBoolean(20, false);
            this.Q = typedArrayObtainStyledAttributes.getBoolean(21, true);
            this.i = typedArrayObtainStyledAttributes.getBoolean(15, false);
            this.j = typedArrayObtainStyledAttributes.getBoolean(16, false);
            this.k = typedArrayObtainStyledAttributes.getBoolean(17, false);
            this.R = typedArrayObtainStyledAttributes.getBoolean(24, true);
            typedArrayObtainStyledAttributes.recycle();
            this.I = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    /* compiled from: PG */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new uzb();
        final int a;
        final int b;
        final boolean e;
        final boolean f;
        final boolean g;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.e = parcel.readInt() == 1;
            this.f = parcel.readInt() == 1;
            this.g = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.d, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.e ? 1 : 0);
            parcel.writeInt(this.f ? 1 : 0);
            parcel.writeInt(this.g ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.a = bottomSheetBehavior.w;
            this.b = bottomSheetBehavior.c;
            this.e = bottomSheetBehavior.a;
            this.f = bottomSheetBehavior.t;
            this.g = bottomSheetBehavior.u;
        }
    }

    @Override // defpackage.aam
    public final void m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }
}
