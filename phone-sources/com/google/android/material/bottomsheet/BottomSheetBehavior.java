package com.google.android.material.bottomsheet;

import android.animation.Animator;
import android.animation.ObjectAnimator;
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
import android.util.Property;
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
import com.google.android.videos.R;
import defpackage.cqv;
import defpackage.cqx;
import defpackage.cww;
import defpackage.cyp;
import defpackage.dar;
import defpackage.das;
import defpackage.dup;
import defpackage.fd;
import defpackage.fk;
import defpackage.sin;
import defpackage.sns;
import defpackage.spu;
import defpackage.spv;
import defpackage.spx;
import defpackage.spy;
import defpackage.spz;
import defpackage.sqa;
import defpackage.sqb;
import defpackage.sqk;
import defpackage.svi;
import defpackage.svm;
import defpackage.svn;
import defpackage.szk;
import defpackage.szq;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends cqv<V> implements svi {
    int A;
    public int B;
    public WeakReference C;
    public WeakReference D;
    public final ArrayList E;
    svn F;
    public int G;
    public boolean H;
    final SparseIntArray I;
    final SparseIntArray J;
    final SparseIntArray K;
    private boolean L;
    private int M;
    private int N;
    private ColorStateList O;
    private int P;
    private int Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private szq U;
    private boolean V;
    private final sqb W;
    private ValueAnimator X;
    private boolean Y;
    private boolean Z;
    private float a;
    private boolean aa;
    private int ab;
    private boolean ac;
    private final float ad;
    private int ae;
    private VelocityTracker af;
    private int ag;
    private Map ah;
    private final dar ai;
    public int b;
    public boolean c;
    public int d;
    public int e;
    public szk f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    int p;
    public int q;
    public int r;
    float s;
    public int t;
    float u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public das z;

    public BottomSheetBehavior() {
        this.b = 0;
        this.c = true;
        this.P = -1;
        this.Q = -1;
        this.W = new sqb(this);
        this.s = 0.5f;
        this.u = -1.0f;
        this.x = true;
        this.Y = true;
        this.y = 4;
        this.ad = 0.1f;
        this.E = new ArrayList();
        this.ag = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new SparseIntArray();
        this.ai = new spx(this);
    }

    public static BottomSheetBehavior G(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof cqx)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        cqv cqvVar = ((cqx) layoutParams).a;
        if (cqvVar instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) cqvVar;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    private final float X() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        if (this.f == null || (weakReference = this.C) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        View view = (View) this.C.get();
        if (!ah() || (rootWindowInsets = view.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        return Math.max(aj(this.f.w(), rootWindowInsets.getRoundedCorner(0)), aj(this.f.x(), rootWindowInsets.getRoundedCorner(1)));
    }

    private final int Y(View view, int i, int i2) throws Resources.NotFoundException {
        int iA;
        String string = view.getResources().getString(i);
        spy spyVar = new spy(this, i2);
        List listI = cww.i(view);
        int i3 = 0;
        while (true) {
            if (i3 >= listI.size()) {
                int i4 = -1;
                for (int i5 = 0; i5 < 32 && i4 == -1; i5++) {
                    i4 = cww.a[i5];
                    boolean z = true;
                    for (int i6 = 0; i6 < listI.size(); i6++) {
                        z &= ((cyp) listI.get(i6)).a() != i4;
                    }
                    if (true != z) {
                        i4 = -1;
                    }
                }
                iA = i4;
            } else {
                if (TextUtils.equals(string, ((cyp) listI.get(i3)).b())) {
                    iA = ((cyp) listI.get(i3)).a();
                    break;
                }
                i3++;
            }
        }
        if (iA != -1) {
            cww.j(view, new cyp(null, iA, string, spyVar, null));
        }
        return iA;
    }

    private final int Z() {
        int i;
        return this.L ? Math.min(Math.max(this.M, this.B - ((this.A * 9) / 16)), this.ae) + this.n : (this.R || this.h || (i = this.g) <= 0) ? this.e + this.n : Math.max(this.e, i + this.N);
    }

    private final int aa(int i) {
        return i != 3 ? i != 4 ? i != 5 ? this.r : this.B : this.t : D();
    }

    private final void ab() {
        int iZ = Z();
        if (this.c) {
            this.t = Math.max(this.B - iZ, this.q);
        } else {
            this.t = this.B - iZ;
        }
    }

    private final void ac() {
        this.r = (int) (this.B * (1.0f - this.s));
    }

    private final void ad() {
        this.G = -1;
        this.ag = -1;
        VelocityTracker velocityTracker = this.af;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.af = null;
        }
    }

    private final void ae() {
        View view;
        WeakReference weakReference = this.C;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        cww.n(view, 1048576);
        cww.n(view, 524288);
        cww.n(view, 262144);
        SparseIntArray sparseIntArray = this.J;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            cww.n(view, i);
            sparseIntArray.delete(0);
        }
        SparseIntArray sparseIntArray2 = this.I;
        int i2 = sparseIntArray2.get(0, -1);
        if (i2 != -1) {
            cww.n(view, i2);
            sparseIntArray2.delete(0);
        }
        SparseIntArray sparseIntArray3 = this.K;
        int i3 = sparseIntArray3.get(0, -1);
        if (i3 != -1) {
            cww.n(view, i3);
            sparseIntArray3.delete(0);
        }
        if (!this.c && this.y != 6) {
            sparseIntArray2.put(0, Y(view, R.string.bottomsheet_action_expand_halfway, 6));
        }
        if (this.v && this.y != 5) {
            cww.x(view, cyp.f, new spy(this, 5));
        }
        int i4 = this.y;
        if (i4 == 3) {
            sparseIntArray3.put(0, Y(view, R.string.bottomsheet_action_collapse, 4));
            return;
        }
        if (i4 == 4) {
            sparseIntArray.put(0, Y(view, R.string.bottomsheet_action_expand, 3));
        } else {
            if (i4 != 6) {
                return;
            }
            sparseIntArray3.put(0, Y(view, R.string.bottomsheet_action_collapse, 4));
            sparseIntArray.put(0, Y(view, R.string.bottomsheet_action_expand, 3));
        }
    }

    private final void af(int i, boolean z) {
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z2 = this.y == 3 && (this.T || ah());
        if (this.V == z2 || this.f == null) {
            return;
        }
        this.V = z2;
        if (!z || (valueAnimator = this.X) == null) {
            ValueAnimator valueAnimator2 = this.X;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.X.cancel();
            }
            this.f.O(this.V ? X() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.X.reverse();
        } else {
            this.X.setFloatValues(this.f.s.l, z2 ? X() : 1.0f);
            this.X.start();
        }
    }

    private final void ag(boolean z) {
        WeakReference weakReference = this.C;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.ah != null) {
                    return;
                } else {
                    this.ah = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.C.get() && z) {
                    this.ah.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.ah = null;
        }
    }

    private final boolean ah() {
        WeakReference weakReference = this.C;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.C.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean ai() {
        if (this.z != null) {
            return this.x || this.y == 1;
        }
        return false;
    }

    private static final float aj(float f, RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float radius = roundedCorner.getRadius();
            if (radius > 0.0f && f > 0.0f) {
                return radius / f;
            }
        }
        return 0.0f;
    }

    private static final int ak(int i, int i2, int i3, int i4) {
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

    public final int D() {
        if (this.c) {
            return this.q;
        }
        return Math.max(this.p, this.S ? 0 : this.o);
    }

    public final int E() {
        if (this.L) {
            return -1;
        }
        return this.e;
    }

    final View F(View view) {
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
                View viewF = F(viewGroup.getChildAt(i));
                if (viewF != null) {
                    return viewF;
                }
            }
        }
        return null;
    }

    public final void H(spz spzVar) {
        ArrayList arrayList = this.E;
        if (arrayList.contains(spzVar)) {
            return;
        }
        arrayList.add(spzVar);
    }

    @Override // defpackage.svi
    public final void I() {
        svn svnVar = this.F;
        if (svnVar == null) {
            return;
        }
        svnVar.f();
    }

    public final void J(int i) {
        float f;
        float fD;
        View view = (View) this.C.get();
        if (view != null) {
            ArrayList arrayList = this.E;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.t;
            if (i > i2 || i2 == D()) {
                int i3 = this.t;
                f = i3 - i;
                fD = this.B - i3;
            } else {
                int i4 = this.t;
                f = i4 - i;
                fD = i4 - D();
            }
            float f2 = f / fD;
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                ((spz) arrayList.get(i5)).a(view, f2);
            }
        }
    }

    @Override // defpackage.svi
    public final void K() {
        svn svnVar = this.F;
        if (svnVar == null) {
            return;
        }
        if (svnVar.c() == null || Build.VERSION.SDK_INT < 34) {
            P(true == this.v ? 5 : 4);
            return;
        }
        if (!this.v) {
            Animator animatorE = this.F.e();
            animatorE.setDuration(sns.b(r2.b, r2.c, r0.b));
            animatorE.start();
            P(4);
            return;
        }
        svn svnVar2 = this.F;
        spu spuVar = new spu(this);
        View view = svnVar2.a;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getHeight() * view.getScaleY());
        objectAnimatorOfFloat.setInterpolator(new dup());
        objectAnimatorOfFloat.setDuration(sns.b(svnVar2.b, svnVar2.c, r0.b));
        objectAnimatorOfFloat.addListener(new svm(svnVar2));
        objectAnimatorOfFloat.addListener(spuVar);
        objectAnimatorOfFloat.start();
    }

    public final void L(spz spzVar) {
        this.E.remove(spzVar);
    }

    public final void M(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.p = i;
        af(this.y, true);
    }

    public final void N(boolean z) {
        if (this.v != z) {
            this.v = z;
            if (!z && this.y == 5) {
                P(4);
            }
            ae();
        }
    }

    public final void O(int i) {
        if (i == -1) {
            if (this.L) {
                return;
            } else {
                this.L = true;
            }
        } else {
            if (!this.L && this.e == i) {
                return;
            }
            this.L = false;
            this.e = Math.max(0, i);
        }
        W();
    }

    public final void P(int i) {
        if (!this.v && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: 5");
            return;
        }
        int i2 = (i == 6 && this.c && aa(6) <= this.q) ? 3 : i;
        WeakReference weakReference = this.C;
        if (weakReference == null || weakReference.get() == null) {
            Q(i);
            return;
        }
        View view = (View) this.C.get();
        fk fkVar = new fk((BottomSheetBehavior) this, view, i2, 12);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(fkVar);
        } else {
            fkVar.run();
        }
    }

    public final void Q(int i) {
        View view;
        if (this.y == i) {
            return;
        }
        this.y = i;
        int i2 = 4;
        if (i != 4 && i != 3 && i != 6 && this.v && i == 5) {
            i = 5;
        }
        WeakReference weakReference = this.C;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i3 = 0;
        if (i == 3) {
            ag(true);
        } else {
            if (i == 6 || i == 5) {
                i2 = i;
            } else if (i == 4) {
            }
            ag(false);
            i = i2;
        }
        af(i, true);
        while (true) {
            ArrayList arrayList = this.E;
            if (i3 >= arrayList.size()) {
                ae();
                return;
            } else {
                ((spz) arrayList.get(i3)).b(view, i);
                i3++;
            }
        }
    }

    @Override // defpackage.svi
    public final void R(fd fdVar) {
        svn svnVar = this.F;
        if (svnVar == null) {
            return;
        }
        svnVar.e = fdVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1.i(r3.getLeft(), r0) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void S(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r0 = r2.aa(r4)
            das r1 = r2.z
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
            r2.Q(r3)
            r3 = 1
            r2.af(r4, r3)
            sqb r3 = r2.W
            r3.a(r4)
            return
        L3f:
            r2.Q(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.S(android.view.View, int, boolean):void");
    }

    @Override // defpackage.svi
    public final void T(fd fdVar) {
        svn svnVar = this.F;
        if (svnVar == null) {
            return;
        }
        svnVar.h(fdVar);
    }

    public final boolean U() {
        return this.v;
    }

    public final boolean V(View view, float f) {
        if (this.w) {
            return true;
        }
        if (view.getTop() < this.t) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f * this.ad)) - ((float) this.t)) / ((float) Z()) > 0.5f;
    }

    public final void W() {
        View view;
        if (this.C != null) {
            ab();
            if (this.y != 4 || (view = (View) this.C.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // defpackage.cqv
    public final void b(cqx cqxVar) {
        this.C = null;
        this.z = null;
        this.F = null;
    }

    @Override // defpackage.cqv
    public final void c() {
        this.C = null;
        this.z = null;
        this.F = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0098  */
    @Override // defpackage.cqv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.D()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.Q(r0)
            return
        Lf:
            java.lang.ref.WeakReference r3 = r2.D
            if (r3 == 0) goto Lb6
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto Lb6
            boolean r3 = r2.ac
            if (r3 != 0) goto L1f
            goto Lb6
        L1f:
            int r3 = r2.ab
            r5 = 6
            if (r3 <= 0) goto L35
            boolean r3 = r2.c
            if (r3 == 0) goto L2a
            goto Lb0
        L2a:
            int r3 = r4.getTop()
            int r6 = r2.r
            if (r3 <= r6) goto Lb0
        L32:
            r0 = r5
            goto Lb0
        L35:
            boolean r3 = r2.v
            if (r3 == 0) goto L56
            android.view.VelocityTracker r3 = r2.af
            if (r3 != 0) goto L3f
            r3 = 0
            goto L4e
        L3f:
            r6 = 1000(0x3e8, float:1.401E-42)
            float r1 = r2.a
            r3.computeCurrentVelocity(r6, r1)
            android.view.VelocityTracker r3 = r2.af
            int r6 = r2.G
            float r3 = r3.getYVelocity(r6)
        L4e:
            boolean r3 = r2.V(r4, r3)
            if (r3 == 0) goto L56
            r0 = 5
            goto Lb0
        L56:
            int r3 = r2.ab
            r6 = 4
            if (r3 != 0) goto L94
            int r3 = r4.getTop()
            boolean r1 = r2.c
            if (r1 == 0) goto L75
            int r5 = r2.q
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.t
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L98
            goto Lb0
        L75:
            int r1 = r2.r
            if (r3 >= r1) goto L84
            int r6 = r2.t
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r3 >= r6) goto L32
            goto Lb0
        L84:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.t
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L98
            goto L32
        L94:
            boolean r3 = r2.c
            if (r3 == 0) goto L9a
        L98:
            r0 = r6
            goto Lb0
        L9a:
            int r3 = r4.getTop()
            int r0 = r2.r
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.t
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L98
            goto L32
        Lb0:
            r3 = 0
            r2.S(r4, r0, r3)
            r2.ac = r3
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.d(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // defpackage.cqv
    public final boolean e(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        das dasVar;
        if (!view.isShown() || !this.x) {
            this.aa = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            ad();
            actionMasked = 0;
        }
        if (this.af == null) {
            this.af = VelocityTracker.obtain();
        }
        this.af.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            this.ag = y;
            if (this.y != 2) {
                WeakReference weakReference = this.D;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.g(view2, x, y)) {
                    this.G = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.H = true;
                }
            }
            this.aa = this.G == -1 && !coordinatorLayout.g(view, x, this.ag);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.H = false;
            this.G = -1;
            if (this.aa) {
                this.aa = false;
                return false;
            }
        }
        if (!this.aa && (dasVar = this.z) != null && dasVar.j(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.D;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        if (actionMasked == 2 && view3 != null && !this.aa && this.y != 1 && !coordinatorLayout.g(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.z != null && (i = this.ag) != -1) {
            if (Math.abs(i - motionEvent.getY()) > this.z.b) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0097  */
    @Override // defpackage.cqv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean f(androidx.coordinatorlayout.widget.CoordinatorLayout r6, android.view.View r7, int r8) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.f(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    @Override // defpackage.cqv
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        this.ab = 0;
        this.ac = false;
        return (i & 2) != 0;
    }

    @Override // defpackage.cqv
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.y == 1 && actionMasked == 0) {
            return true;
        }
        if (ai()) {
            this.z.e(motionEvent);
        }
        if (actionMasked == 0) {
            ad();
        }
        if (this.af == null) {
            this.af = VelocityTracker.obtain();
        }
        this.af.addMovement(motionEvent);
        if (ai() && actionMasked == 2 && !this.aa) {
            float fAbs = Math.abs(this.ag - motionEvent.getY());
            das dasVar = this.z;
            if (fAbs > dasVar.b) {
                dasVar.d(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.aa;
    }

    @Override // defpackage.cqv
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ak(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.P, marginLayoutParams.width), ak(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.Q, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.cqv
    public final boolean n(View view) {
        WeakReference weakReference = this.D;
        return (weakReference == null || view != weakReference.get() || this.y == 3 || this.Z) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
    
        if (r2 == false) goto L36;
     */
    @Override // defpackage.cqv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(androidx.coordinatorlayout.widget.CoordinatorLayout r5, android.view.View r6, android.view.View r7, int r8, int[] r9, int r10) {
        /*
            r4 = this;
            r5 = 1
            if (r10 != r5) goto L5
            goto La2
        L5:
            java.lang.ref.WeakReference r10 = r4.D
            if (r10 == 0) goto L10
            java.lang.Object r10 = r10.get()
            android.view.View r10 = (android.view.View) r10
            goto L11
        L10:
            r10 = 0
        L11:
            if (r7 != r10) goto La2
            int r0 = r6.getTop()
            int r1 = r0 - r8
            if (r8 <= 0) goto L53
            boolean r2 = r4.ac
            if (r2 != 0) goto L2b
            boolean r2 = r4.Y
            if (r2 != 0) goto L2b
            if (r7 != r10) goto L2b
            boolean r7 = r7.canScrollVertically(r5)
            if (r7 != 0) goto L67
        L2b:
            int r7 = r4.D()
            if (r1 >= r7) goto L43
            int r7 = r4.D()
            int r0 = r0 - r7
            r9[r5] = r0
            int[] r7 = defpackage.cww.a
            int r7 = -r0
            r6.offsetTopAndBottom(r7)
            r7 = 3
            r4.Q(r7)
            goto L94
        L43:
            boolean r7 = r4.x
            if (r7 == 0) goto La2
            r9[r5] = r8
            int r7 = -r8
            int[] r9 = defpackage.cww.a
            r6.offsetTopAndBottom(r7)
            r4.Q(r5)
            goto L94
        L53:
            if (r8 >= 0) goto L94
            r2 = -1
            boolean r2 = r7.canScrollVertically(r2)
            boolean r3 = r4.ac
            if (r3 != 0) goto L6a
            boolean r3 = r4.Y
            if (r3 != 0) goto L6a
            if (r7 != r10) goto L6a
            if (r2 != 0) goto L67
            goto L6c
        L67:
            r4.Z = r5
            return
        L6a:
            if (r2 != 0) goto L94
        L6c:
            int r7 = r4.t
            if (r1 <= r7) goto L85
            boolean r10 = r4.U()
            if (r10 == 0) goto L77
            goto L85
        L77:
            int r0 = r0 - r7
            r9[r5] = r0
            int[] r7 = defpackage.cww.a
            int r7 = -r0
            r6.offsetTopAndBottom(r7)
            r7 = 4
            r4.Q(r7)
            goto L94
        L85:
            boolean r7 = r4.x
            if (r7 == 0) goto La2
            r9[r5] = r8
            int r7 = -r8
            int[] r9 = defpackage.cww.a
            r6.offsetTopAndBottom(r7)
            r4.Q(r5)
        L94:
            int r6 = r6.getTop()
            r4.J(r6)
            r4.ab = r8
            r4.ac = r5
            r5 = 0
            r4.Z = r5
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.o(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int, int[], int):void");
    }

    @Override // defpackage.cqv
    public final void q(View view, Parcelable parcelable) {
        sqa sqaVar = (sqa) parcelable;
        int i = this.b;
        int i2 = 4;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.e = sqaVar.b;
            }
            if (i == -1 || (i & 2) == 2) {
                this.c = sqaVar.c;
            }
            if (i == -1 || (i & 4) == 4) {
                this.v = sqaVar.d;
            }
            if (i == -1 || (i & 8) == 8) {
                this.w = sqaVar.e;
            }
        }
        int i3 = sqaVar.a;
        if (i3 != 1 && i3 != 2) {
            i2 = i3;
        }
        this.y = i2;
    }

    @Override // defpackage.cqv
    public final Parcelable r(View view) {
        return new sqa(View.BaseSavedState.EMPTY_STATE, this);
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.c = true;
        this.P = -1;
        this.Q = -1;
        this.W = new sqb(this);
        this.s = 0.5f;
        this.u = -1.0f;
        this.x = true;
        this.Y = true;
        this.y = 4;
        this.ad = 0.1f;
        this.E = new ArrayList();
        this.ag = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new SparseIntArray();
        this.ai = new spx(this);
        this.N = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sqk.a);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.O = sin.h(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(22)) {
            this.U = new szq(szq.c(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal));
        }
        if (this.U != null) {
            szk szkVar = new szk(this.U);
            this.f = szkVar;
            szkVar.J(context);
            ColorStateList colorStateList = this.O;
            if (colorStateList != null) {
                this.f.N(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(X(), 1.0f);
        this.X = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.X.addUpdateListener(new spv(this, 0));
        this.u = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(10);
        if (typedValuePeekValue != null && typedValuePeekValue.data == -1) {
            O(typedValuePeekValue.data);
        } else {
            O(typedArrayObtainStyledAttributes.getDimensionPixelSize(10, -1));
        }
        N(typedArrayObtainStyledAttributes.getBoolean(9, false));
        this.R = typedArrayObtainStyledAttributes.getBoolean(14, false);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(7, true);
        if (this.c != z) {
            this.c = z;
            if (this.C != null) {
                ab();
            }
            Q((this.c && this.y == 6) ? 3 : this.y);
            af(this.y, true);
            ae();
        }
        this.w = typedArrayObtainStyledAttributes.getBoolean(13, false);
        this.x = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.Y = typedArrayObtainStyledAttributes.getBoolean(5, true);
        this.b = typedArrayObtainStyledAttributes.getInt(11, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(8, 0.5f);
        if (f > 0.0f && f < 1.0f) {
            this.s = f;
            if (this.C != null) {
                ac();
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(6);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                M(typedValuePeekValue2.data);
            } else {
                M(typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, 0));
            }
            this.d = typedArrayObtainStyledAttributes.getInt(12, 500);
            this.h = typedArrayObtainStyledAttributes.getBoolean(18, false);
            this.i = typedArrayObtainStyledAttributes.getBoolean(19, false);
            this.j = typedArrayObtainStyledAttributes.getBoolean(20, false);
            this.S = typedArrayObtainStyledAttributes.getBoolean(21, true);
            this.k = typedArrayObtainStyledAttributes.getBoolean(15, false);
            this.l = typedArrayObtainStyledAttributes.getBoolean(16, false);
            this.m = typedArrayObtainStyledAttributes.getBoolean(17, false);
            this.T = typedArrayObtainStyledAttributes.getBoolean(24, true);
            typedArrayObtainStyledAttributes.recycle();
            this.a = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // defpackage.cqv
    public final void p(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int[] iArr) {
    }
}
