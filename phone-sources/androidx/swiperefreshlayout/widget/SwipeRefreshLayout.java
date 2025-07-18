package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ListView;
import defpackage.cvl;
import defpackage.cvm;
import defpackage.cvn;
import defpackage.cvo;
import defpackage.cvp;
import defpackage.cww;
import defpackage.gfe;
import defpackage.gin;
import defpackage.giq;
import defpackage.gir;
import defpackage.gis;
import defpackage.git;
import defpackage.giu;
import defpackage.giv;
import defpackage.giw;
import defpackage.gix;
import defpackage.giy;
import defpackage.giz;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements cvo, cvn, cvl {
    private static final String k = "SwipeRefreshLayout";
    private static final int[] l = {R.attr.enabled};
    private int A;
    private final DecelerateInterpolator B;
    private int C;
    private Animation D;
    private Animation E;
    private Animation F;
    private Animation G;
    private int H;
    private Animation.AnimationListener I;
    private final Animation J;
    private final Animation K;
    public giy a;
    public boolean b;
    public int c;
    public gin d;
    public int e;
    public int f;
    public int g;
    public gir h;
    public boolean i;
    public boolean j;
    private View m;
    private int n;
    private float o;
    private float p;
    private final cvp q;
    private final cvm r;
    private final int[] s;
    private final int[] t;
    private final int[] u;
    private boolean v;
    private int w;
    private float x;
    private float y;
    private boolean z;

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }

    private final Animation h(int i, int i2) {
        giu giuVar = new giu(this, i, i2);
        giuVar.setDuration(300L);
        gin ginVar = this.d;
        ginVar.a = null;
        ginVar.clearAnimation();
        this.d.startAnimation(giuVar);
        return giuVar;
    }

    private final void i() {
        if (this.m == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.d)) {
                    this.m = childAt;
                    return;
                }
            }
        }
    }

    private final void j(float f) {
        if (f > this.o) {
            m(true, true);
            return;
        }
        this.b = false;
        this.h.d(0.0f);
        giv givVar = new giv(this, 0);
        this.e = this.c;
        Animation animation = this.K;
        animation.reset();
        animation.setDuration(200L);
        animation.setInterpolator(this.B);
        gin ginVar = this.d;
        ginVar.a = givVar;
        ginVar.clearAnimation();
        this.d.startAnimation(animation);
        this.h.b(false);
    }

    private final void k(float f) {
        this.h.b(true);
        float fMin = Math.min(1.0f, Math.abs(f / this.o));
        float fMax = (float) Math.max(fMin - 0.4d, 0.0d);
        float fAbs = Math.abs(f) - this.o;
        float f2 = this.g;
        double dMax = Math.max(0.0f, Math.min(fAbs, f2 + f2) / f2) / 4.0f;
        float f3 = fMin * f2;
        float fPow = (float) (dMax - Math.pow(dMax, 2.0d));
        float f4 = fPow + fPow;
        float f5 = f2 * f4;
        int i = this.f + ((int) (f3 + f5 + f5));
        if (this.d.getVisibility() != 0) {
            this.d.setVisibility(0);
        }
        this.d.setScaleX(1.0f);
        this.d.setScaleY(1.0f);
        if (f < this.o) {
            if (this.h.getAlpha() > 76 && !p(this.F)) {
                this.F = h(this.h.getAlpha(), 76);
            }
        } else if (this.h.getAlpha() < 255 && !p(this.G)) {
            this.G = h(this.h.getAlpha(), 255);
        }
        float f6 = (fMax * 5.0f) / 3.0f;
        this.h.d(Math.min(0.8f, f6 * 0.8f));
        this.h.c(Math.min(1.0f, f6));
        gir girVar = this.h;
        girVar.a.g = (((f6 * 0.4f) - 0.25f) + f4 + f4) * 0.5f;
        girVar.invalidateSelf();
        e(i - this.c);
    }

    private final void l(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.A) {
            this.A = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private final void m(boolean z, boolean z2) {
        if (this.b != z) {
            this.i = z2;
            i();
            this.b = z;
            if (!z) {
                f(this.I);
                return;
            }
            int i = this.c;
            Animation.AnimationListener animationListener = this.I;
            this.e = i;
            Animation animation = this.J;
            animation.reset();
            animation.setDuration(200L);
            animation.setInterpolator(this.B);
            if (animationListener != null) {
                this.d.a = animationListener;
            }
            this.d.clearAnimation();
            this.d.startAnimation(animation);
        }
    }

    private final void n(boolean z, boolean z2) {
        if (z) {
            if (!this.b) {
                this.b = true;
                e((this.g + this.f) - this.c);
                this.i = z2;
                Animation.AnimationListener animationListener = this.I;
                this.d.setVisibility(0);
                this.h.setAlpha(255);
                gis gisVar = new gis(this);
                this.D = gisVar;
                gisVar.setDuration(this.w);
                if (animationListener != null) {
                    this.d.a = animationListener;
                }
                this.d.clearAnimation();
                this.d.startAnimation(this.D);
                return;
            }
            z = true;
        }
        m(z, false);
    }

    private final void o(float f) {
        float f2 = this.y;
        float f3 = f - f2;
        float f4 = this.n;
        if (f3 <= f4 || this.z) {
            return;
        }
        this.x = f2 + f4;
        this.z = true;
        this.h.setAlpha(76);
    }

    private static final boolean p(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    public final void a(float f) {
        e((this.e + ((int) ((this.f - r0) * f))) - this.d.getTop());
    }

    public final void b() {
        this.d.clearAnimation();
        this.h.stop();
        this.d.setVisibility(8);
        this.d.getBackground().setAlpha(255);
        this.h.setAlpha(255);
        e(this.f - this.c);
        this.c = this.d.getTop();
    }

    public final void c(float f) {
        this.d.setScaleX(f);
        this.d.setScaleY(f);
    }

    public final void d(boolean z) {
        n(z, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 285) {
            return super.dispatchKeyEvent(keyEvent);
        }
        n(true, true);
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.r.d(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.r.e(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.r.f(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.r.h(i, i2, i3, i4, iArr);
    }

    public final void e(int i) {
        this.d.bringToFront();
        gin ginVar = this.d;
        int[] iArr = cww.a;
        ginVar.offsetTopAndBottom(i);
        this.c = this.d.getTop();
    }

    public final void f(Animation.AnimationListener animationListener) {
        git gitVar = new git(this);
        this.E = gitVar;
        gitVar.setDuration(150L);
        gin ginVar = this.d;
        ginVar.a = animationListener;
        ginVar.clearAnimation();
        this.d.startAnimation(this.E);
    }

    public final boolean g() {
        View view = this.m;
        return view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
    }

    @Override // android.view.ViewGroup
    protected final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.C;
        return i3 < 0 ? i2 : i2 == i + (-1) ? i3 : i2 >= i3 ? i2 + 1 : i2;
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.q.a();
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.r.j();
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.r.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004b  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            r4.i()
            int r0 = r5.getActionMasked()
            boolean r1 = r4.isEnabled()
            r2 = 0
            if (r1 == 0) goto L73
            boolean r1 = r4.g()
            if (r1 != 0) goto L73
            boolean r1 = r4.b
            if (r1 != 0) goto L73
            boolean r1 = r4.v
            if (r1 == 0) goto L1d
            goto L73
        L1d:
            if (r0 == 0) goto L50
            r1 = 1
            r3 = -1
            if (r0 == r1) goto L4b
            r1 = 2
            if (r0 == r1) goto L31
            r1 = 3
            if (r0 == r1) goto L4b
            r1 = 6
            if (r0 == r1) goto L2d
            goto L70
        L2d:
            r4.l(r5)
            goto L70
        L31:
            int r0 = r4.A
            if (r0 != r3) goto L3d
            java.lang.String r5 = androidx.swiperefreshlayout.widget.SwipeRefreshLayout.k
            java.lang.String r0 = "Got ACTION_MOVE event but don't have an active pointer id."
            android.util.Log.e(r5, r0)
            return r2
        L3d:
            int r0 = r5.findPointerIndex(r0)
            if (r0 < 0) goto L73
            float r5 = r5.getY(r0)
            r4.o(r5)
            goto L70
        L4b:
            r4.z = r2
            r4.A = r3
            goto L70
        L50:
            int r0 = r4.f
            gin r1 = r4.d
            int r1 = r1.getTop()
            int r0 = r0 - r1
            r4.e(r0)
            int r0 = r5.getPointerId(r2)
            r4.A = r0
            r4.z = r2
            int r0 = r5.findPointerIndex(r0)
            if (r0 < 0) goto L73
            float r5 = r5.getY(r0)
            r4.y = r5
        L70:
            boolean r5 = r4.z
            return r5
        L73:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.m == null) {
            i();
        }
        View view = this.m;
        if (view != null) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
            int measuredWidth2 = this.d.getMeasuredWidth();
            int measuredHeight2 = this.d.getMeasuredHeight();
            gin ginVar = this.d;
            int i5 = measuredWidth / 2;
            int i6 = measuredWidth2 / 2;
            int i7 = this.c;
            int i8 = i5 + i6;
            ginVar.layout(i5 - i6, i7, i8, measuredHeight2 + i7);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.m == null) {
            i();
        }
        View view = this.m;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(this.H, 1073741824), View.MeasureSpec.makeMeasureSpec(this.H, 1073741824));
        this.C = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.d) {
                this.C = i3;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.p;
            float f2 = 0.0f;
            if (f > 0.0f) {
                float f3 = i2;
                if (f3 > f) {
                    iArr[1] = (int) f;
                    this.p = 0.0f;
                } else {
                    f2 = f - f3;
                    this.p = f2;
                    iArr[1] = i2;
                }
                k(f2);
            }
        }
        int[] iArr2 = this.s;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0, this.u);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.q.d(i);
        startNestedScroll(i & 2);
        this.p = 0.0f;
        this.v = true;
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        giz gizVar = (giz) parcelable;
        super.onRestoreInstanceState(gizVar.getSuperState());
        d(gizVar.a);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        return new giz(super.onSaveInstanceState(), this.b);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.b || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.q.e();
        this.v = false;
        float f = this.p;
        if (f > 0.0f) {
            j(f);
            this.p = 0.0f;
        } else {
            post(new gfe(this, 2));
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || g() || this.b || this.v) {
            return false;
        }
        if (actionMasked == 0) {
            this.A = motionEvent.getPointerId(0);
            this.z = false;
        } else {
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.A);
                if (iFindPointerIndex < 0) {
                    Log.e(k, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.z) {
                    float y = (motionEvent.getY(iFindPointerIndex) - this.x) * 0.5f;
                    this.z = false;
                    j(y);
                }
                this.A = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.A);
                if (iFindPointerIndex2 < 0) {
                    Log.e(k, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y2 = motionEvent.getY(iFindPointerIndex2);
                o(y2);
                if (this.z) {
                    float f = (y2 - this.x) * 0.5f;
                    if (f <= 0.0f) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    k(f);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        Log.e(k, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.A = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    l(motionEvent);
                }
            }
        }
        return true;
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        b();
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z) {
        this.r.a(z);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.r.l(i);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.r.b();
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = false;
        this.o = -1.0f;
        this.s = new int[2];
        this.t = new int[2];
        this.u = new int[2];
        this.A = -1;
        this.C = -1;
        this.I = new giv(this, 1);
        this.J = new giw(this);
        this.K = new gix(this);
        this.n = ViewConfiguration.get(context).getScaledTouchSlop();
        this.w = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.B = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.H = (int) (displayMetrics.density * 40.0f);
        this.d = new gin(getContext());
        gir girVar = new gir(getContext());
        this.h = girVar;
        giq giqVar = girVar.a;
        float f = girVar.b.getDisplayMetrics().density;
        giqVar.d(2.5f * f);
        giqVar.p = 7.5f * f;
        giqVar.g();
        giqVar.q = (int) (10.0f * f);
        giqVar.r = (int) (f * 5.0f);
        girVar.invalidateSelf();
        this.d.setImageDrawable(this.h);
        this.d.setVisibility(8);
        addView(this.d);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.g = i;
        this.o = i;
        this.q = new cvp();
        this.r = new cvm(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.H;
        this.c = i2;
        this.f = i2;
        a(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // defpackage.cvn
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i, i2, i3, i4, i5, this.u);
    }

    @Override // defpackage.cvn
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    @Override // defpackage.cvo
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        int i6;
        if (i5 != 0) {
            return;
        }
        int i7 = iArr[1];
        int[] iArr2 = this.t;
        this.r.i(i, i2, i3, i4, iArr2, 0, iArr);
        int i8 = i4 - (iArr[1] - i7);
        if (i8 == 0) {
            i8 = i4 + iArr2[1];
            i6 = 0;
        } else {
            i6 = i8;
        }
        if (i8 >= 0 || g()) {
            return;
        }
        float fAbs = this.p + Math.abs(i8);
        this.p = fAbs;
        k(fAbs);
        iArr[1] = iArr[1] + i6;
    }

    @Override // defpackage.cvn
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // defpackage.cvn
    public final void onStopNestedScroll(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // defpackage.cvn
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }
}
